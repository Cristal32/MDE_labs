# Metamodeling with Eclipse/EMF (Eclipse Modeling Framework)

The objective of this practical work is to illustrate techniques of Model-Driven Engineering. The aim is to **enable the manipulation of relational database models** in different technological environments. 

To begin with, and to manipulate RDBMS models, a `DSL (Domain-Specific Language)` corresponding to an RDBMS must be built. It should allow the creation of SQL models without using tools such as MySQL, Oracle, or others.

In the second phase, for users working with NoSQL databases (a database management system that is not based on the classical relational architecture), a transformation from the SQL model to the XML model is necessary in order to leverage tools like BaseX.

This transformation uses an intermediary model conforming to the `KM3 metamodel` (proposed by INRIA). Thus, we carry out two transformations: first, a `model-to-model (M2M)` transformation from SQL to KM3, followed by a transformation from the KM3 model to an XML model. Finally, for users working with knowledge bases, a transformation from SQL to OWL is required. The resulting ontology (OWL model) can be used by ontology development tools such as Protégé.

The goal of these initial exercises is to get familiar with the tools provided by `Eclipse Modeling Tools` for meta-modeling. We will primarily use the tools developed as part of `Eclipse EMF (Eclipse Modeling Framework)`.

## Table of contents

- [Overview](#overview)
- [Setup](#my-process)
- [SQL Metamodel](#sql-metamodel) 
    - [Starting off with SQL.ecore](#starting-off-with-sqlecore)
    - [Classes, attributes and references](#classes-attributes-and-references)
    - [Visualizing the diagram](#visualizing-the-diagram)
- [Validating the Ecore model](#validating-the-ecore-model)
- [Constructing the Ecore metamodel](#constructing-the-ecore-metamodel)
- [Generate the Java code and the arborescent editor](#generate-the-java-code-and-the-arborescent-editor)
    - [Create the .genmodel file](#create-the-genmodel-file)
    - [Generate the 3 plugins](#generate-the-3-plugins)
- [Use the arborescent editor](#use-the-arborescent-editor)
- [Creating the SQL text editor](#creating-the-sql-metamodel)

## Overview

<p align=center>
    <img width="200px" src="../assets/ecore_arborescence.PNG" alt="Ecore arborescence" />
    <img width="310px" src="../assets/ecore_diagram.PNG" alt="Ecore model diagram" />
</p>

## Setup

1. Here's a useful link where to find [`Eclipse Modeling Tools`](https://www.eclipse.org/downloads/packages/release/2022-12/r)
2. Unzip the downloaded file and execute the app `eclipse.exe` inside the folder
3. Change the perspective tab to `Ecore`
4. File > New > Other > Empty EMF Project > Next > Name of project: IDM > Finish

## SQL Metamodel

### Starting off with SQL.ecore

The `.ecore` file serves as the `core metamodel` that defines the structure, semantics and constraints of our models.

1. Create the Ecore file: <br>
Right click model > New > Other > Ecore model > File name: 'SQL.ecore' 
2. In 'SQL.ecore', you can see an arborescence starting with an empty package. Click on that empty package and fill out its name (SQL), Prefix (SQL) and URI (ex. https://...)
The URI will be useful later on when we want to reference our specific .ecore file
3. Start creating EClasses, EAttributes, EReferences, ... in the arborescence to correspond to your designed model
    - ex. Right-click the package 'SQL' > New child > EClass

### Classes, attributes and references

- DB
    - ESuper Types: NamedElmt
    - EReference: tables
        - EType: Table
        - Containment: true
        - Upper Bound: -1

- Table
    - ESuper Types: NamedElmt
    - EReference: columns
        - Containment: true
        - EType: Column
        - EOpposite: Table
        - Upper Bound: -1
    - EReference: db
        - EType: DB
        - EOpposite: tables: Table
        - Lower Bound: 1
        - Upper Bound: 1

- Column: 
    - ESuper Types: NamedElmt
    - EAttribute: type
        - EAttribute Type: EString
    - EReference: table
        - EType: Table
        - EOpposite: columns: Column
        - Lower Bound: 1
        - Upper Bound: 1

- NamedElmt: 
    - Abstract: true
    - EAttribute: name
        - EAttribute Type: EString

### Visualizing the diagram

1. Right-click 'SQL.ecore' > Initialize Ecore Diagram > Filename: 'SQL.aird' > Next
2. Type of representation: Entities in a Class Diagram
3. Select the package SQL > Finish
4. In 'SQL Class diagram', right-click > Add Related Elements > Select each class one by one to add them in the representation

## Validating the Ecore model

`Validation` is the process of checking the ecore model to ensure that it conforms to the constraints and rules defined by the Ecore metamodel, ensuring that our  model is syntactically and semantically correct, and catching potential issues that might prevent it from working properly.

- In 'SQL.ecore', right-click the root of the ecore model (arborescence)
- Select 'Validate'

We can enable `live validation` (by right clicking the root of the arborescence) to check the validation of the arborescence before selecting validate.

## Constructing the Ecore metamodel

## Generate the Java code and the arborescent editor

### Create the .genmodel file

`GenModel` represents the EMF model in a higher level form. Generates Java code that can implement the model's structure

Right click SQL.ecore > New > Other > Eclipse Modeling Framework > EMF Generator Model > Filename: "SQL.genmodel" > EcoreModel > Next > Load > Finish 

### Generate the 3 plugins

In SQL.genmodel: <br>
Right click the root of the arborescence > Generate All 

From this, 3 new layers of code (plugins) are generated:
<p align=center>
    <img width="400px" src="../assets/generated_plugins.PNG" alt="Generated plugins" />
</p>

- `IDM.model`: Contains the Ecore model itself and the generated code that corresponds to the metamodel.
- `IDM.edit`: Provides editing support for the model. It contains generated code to build an item provider that allows us to view and edit instances of the model. These classes provide content and label information for our model objects, facilitating their representation in UI components like trees and tables.
- `IDM.editor`: A basic graphical user interface (GUI) is created, allowing users to view, create, edit, and delete instances of your model. It leverages the generated model and edit code to provide a functional UI out of the box.

### Epsilon

Alternatively, instead of having to generate every time whenever we make a change in the ecore file, we can install the package `epsilon`, which allows us to have a view of the resulting instance before generating. 

**- Installation:**
- Search `Epsilon Update Site`. You'll find this link: https://eclipse.dev/epsilon/download/
- Go to the `Update Sites` section and copy the `Stable` URL: http://download.eclipse.org/epsilon/updates/2.5/
- Go to your Eclipse > Help > Install New Software > Paste the link and enter > Next > ...

1. Right click SQL.ecore > Register EPackages
2. Right click SQL.ecore > New > Other > Epsilon > EMF Model
3. EMF model:
    - File name: SQL.model
    - Metamodel URI > Browse > select your ecore URI
    - Root instance type: Choose whichever root you want, for example DB 
4. You can now test it out directly

Now whenever we make a change in the ecore, we can simply repeat step 1.

We can then start filling out an example of the model:
<p align=center>
    <img width="300px" src="../assets/model_res.PNG" alt="Example of the model" />
</p>

## Use the arborescent editor

Now we'll want to test out our SQL model on a new Eclipse editor. 

- Right click the project IDM > Run as > Eclipse Application
- In the new Eclipse runtime, create a new General project: SQLExample
- In SQLExample, create a new file > Other > Example EMF Model Creation Wizards > SQL Model > File name: My.sql > Next > Model Object: DB
- You can start filling out the arborescent editor with a DB example of your liking

<p align=center>
    <img width="300px" src="../assets/model_runtime.PNG" alt="Arborescent editor" />
</p>

We can use Validate on each element of the arborescence.

Now that the model is done, saved and successfully validated, we can close the runtime and access our original IDE.

## Creating the SQL text editor

For this you need to install the Xtext library from Eclipse Marketplace.

1. Create a new project:
File > Other > Xtext Project from existing ecore models > Next > Add SQL.genmodel & select the root of the metamodel  (DB) > define the name and extension of your choice for the language.
2. You can then modify the grammar to your liking
3. Right click the grammar > Run as > Generate Xtext artefacts
4. Redo the steps from the step: [Generate the 3 plugins](#generate-the-3-plugins)
5. In the runtime, create a new file test.mysdl > Accept to convert project into Xtext project > Ok

### Side note
A common problem that can occur in older versions of Eclipse is that we can't generate Xtext artefacts due to a missing `common-logging` library
Instead:
1. Go to build.properties and remove the line `org.apache.commons.common-logging`
2. Go to [Commons logging maven website](https://mvnrepository.com/artifact/commons-logging/commons-logging/1.3.4) and install the .jar
3. Go to your project > build path > libraries > Classpath > Add External JARS > Select your installed JAR file > apply and close
4. Then try again to generate the Xtext artefact

<p align=center>
    <img width="300px" src="../assets/text_editor.PNG" alt="Text editor" />
</p>


