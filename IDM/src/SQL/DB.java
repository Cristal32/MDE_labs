/**
 */
package SQL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SQL.DB#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see SQL.SQLPackage#getDB()
 * @model
 * @generated
 */
public interface DB extends NamedElmt {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link SQL.Table}.
	 * It is bidirectional and its opposite is '{@link SQL.Table#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see SQL.SQLPackage#getDB_Tables()
	 * @see SQL.Table#getDb
	 * @model opposite="db" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // DB
