package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/InvalidPolicy.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?4?6? ??? ??08?15?56? CST
*/

public final class InvalidPolicy extends org.omg.CORBA.UserException
{
  public short index = (short)0;

  public InvalidPolicy ()
  {
    super(InvalidPolicyHelper.id());
  } // ctor

  public InvalidPolicy (short _index)
  {
    super(InvalidPolicyHelper.id());
    index = _index;
  } // ctor


  public InvalidPolicy (String $reason, short _index)
  {
    super(InvalidPolicyHelper.id() + "  " + $reason);
    index = _index;
  } // ctor

} // class InvalidPolicy
