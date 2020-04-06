package org.omg.PortableInterceptor.ORBInitInfoPackage;


/**
* org/omg/PortableInterceptor/ORBInitInfoPackage/InvalidName.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class InvalidName extends org.omg.CORBA.UserException
{

  public InvalidName ()
  {
    super(InvalidNameHelper.id());
  } // ctor


  public InvalidName (String $reason)
  {
    super(InvalidNameHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidName
