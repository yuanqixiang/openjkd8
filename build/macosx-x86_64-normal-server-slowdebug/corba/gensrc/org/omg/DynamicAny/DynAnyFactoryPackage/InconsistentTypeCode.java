package org.omg.DynamicAny.DynAnyFactoryPackage;


/**
* org/omg/DynamicAny/DynAnyFactoryPackage/InconsistentTypeCode.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class InconsistentTypeCode extends org.omg.CORBA.UserException
{

  public InconsistentTypeCode ()
  {
    super(InconsistentTypeCodeHelper.id());
  } // ctor


  public InconsistentTypeCode (String $reason)
  {
    super(InconsistentTypeCodeHelper.id() + "  " + $reason);
  } // ctor

} // class InconsistentTypeCode
