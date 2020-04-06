package org.omg.PortableServer;


/**
* org/omg/PortableServer/ForwardRequest.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class ForwardRequest extends org.omg.CORBA.UserException
{
  public org.omg.CORBA.Object forward_reference = null;

  public ForwardRequest ()
  {
    super(ForwardRequestHelper.id());
  } // ctor

  public ForwardRequest (org.omg.CORBA.Object _forward_reference)
  {
    super(ForwardRequestHelper.id());
    forward_reference = _forward_reference;
  } // ctor


  public ForwardRequest (String $reason, org.omg.CORBA.Object _forward_reference)
  {
    super(ForwardRequestHelper.id() + "  " + $reason);
    forward_reference = _forward_reference;
  } // ctor

} // class ForwardRequest
