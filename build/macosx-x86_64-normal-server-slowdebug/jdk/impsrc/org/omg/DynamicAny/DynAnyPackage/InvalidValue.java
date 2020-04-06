package org.omg.DynamicAny.DynAnyPackage;


/**
* org/omg/DynamicAny/DynAnyPackage/InvalidValue.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class InvalidValue extends org.omg.CORBA.UserException
{

  public InvalidValue ()
  {
    super(InvalidValueHelper.id());
  } // ctor


  public InvalidValue (String $reason)
  {
    super(InvalidValueHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidValue
