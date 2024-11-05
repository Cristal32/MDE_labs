/**
 */
package mindstorms.impl;

import mindstorms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindstormsFactoryImpl extends EFactoryImpl implements MindstormsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MindstormsFactory init() {
		try {
			MindstormsFactory theMindstormsFactory = (MindstormsFactory)EPackage.Registry.INSTANCE.getEFactory(MindstormsPackage.eNS_URI);
			if (theMindstormsFactory != null) {
				return theMindstormsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MindstormsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindstormsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MindstormsPackage.CHOREOGRAPHY: return createChoreography();
			case MindstormsPackage.GRAB: return createGrab();
			case MindstormsPackage.RELEASE: return createRelease();
			case MindstormsPackage.ROTATE: return createRotate();
			case MindstormsPackage.GO_FORWARD: return createGoForward();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Choreography createChoreography() {
		ChoreographyImpl choreography = new ChoreographyImpl();
		return choreography;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grab createGrab() {
		GrabImpl grab = new GrabImpl();
		return grab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rotate createRotate() {
		RotateImpl rotate = new RotateImpl();
		return rotate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoForward createGoForward() {
		GoForwardImpl goForward = new GoForwardImpl();
		return goForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MindstormsPackage getMindstormsPackage() {
		return (MindstormsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MindstormsPackage getPackage() {
		return MindstormsPackage.eINSTANCE;
	}

} //MindstormsFactoryImpl
