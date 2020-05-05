package EchoApp;


/**
* EchoApp/EchoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from HelloWorld.idl
* Ter�a-feira, 5 de Maio de 2020 19h51min31s BRT
*/

public abstract class EchoPOA extends org.omg.PortableServer.Servant
 implements EchoApp.EchoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("helloWorldString", new java.lang.Integer (0));
    _methods.put ("Fibonacci", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // EchoApp/Echo/helloWorldString
       {
         String $result = null;
         $result = this.helloWorldString ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // EchoApp/Echo/Fibonacci
       {
         int arg = EchoApp.EchoPackage.nHelper.read (in);
         int $result = (int)0;
         $result = this.Fibonacci (arg);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:EchoApp/Echo:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Echo _this() 
  {
    return EchoHelper.narrow(
    super._this_object());
  }

  public Echo _this(org.omg.CORBA.ORB orb) 
  {
    return EchoHelper.narrow(
    super._this_object(orb));
  }


} // class EchoPOA
