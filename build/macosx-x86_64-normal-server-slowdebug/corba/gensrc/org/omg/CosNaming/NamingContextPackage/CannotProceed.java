package org.omg.CosNaming.NamingContextPackage;


/**
* org/omg/CosNaming/NamingContextPackage/CannotProceed.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?4?6? ??? ??08?15?54? CST
*/

public final class CannotProceed extends org.omg.CORBA.UserException
{
  public org.omg.CosNaming.NamingContext cxt = null;
  public org.omg.CosNaming.NameComponent rest_of_name[] = null;

  public CannotProceed ()
  {
    super(CannotProceedHelper.id());
  } // ctor

  public CannotProceed (org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id());
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor


  public CannotProceed (String $reason, org.omg.CosNaming.NamingContext _cxt, org.omg.CosNaming.NameComponent[] _rest_of_name)
  {
    super(CannotProceedHelper.id() + "  " + $reason);
    cxt = _cxt;
    rest_of_name = _rest_of_name;
  } // ctor

} // class CannotProceed
