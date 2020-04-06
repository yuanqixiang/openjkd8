package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/InvalidSlot.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class InvalidSlot extends org.omg.CORBA.UserException
{

  public InvalidSlot ()
  {
    super(InvalidSlotHelper.id());
  } // ctor


  public InvalidSlot (String $reason)
  {
    super(InvalidSlotHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidSlot
