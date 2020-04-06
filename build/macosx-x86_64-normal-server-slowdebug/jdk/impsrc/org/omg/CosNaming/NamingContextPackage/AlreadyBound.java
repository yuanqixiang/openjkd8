package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/AlreadyBound.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?4?6? ??? ??08?15?54? CST
*/

public final class AlreadyBound extends org.omg.CORBA.UserException
{

  public AlreadyBound ()
  {
    super(AlreadyBoundHelper.id());
  } // ctor


  public AlreadyBound (String $reason)
  {
    super(AlreadyBoundHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadyBound
