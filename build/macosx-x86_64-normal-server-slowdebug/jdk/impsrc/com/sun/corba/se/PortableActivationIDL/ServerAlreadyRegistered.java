package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyRegistered.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class ServerAlreadyRegistered extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyRegistered ()
  {
    super(ServerAlreadyRegisteredHelper.id());
  } // ctor

  public ServerAlreadyRegistered (String _serverId)
  {
    super(ServerAlreadyRegisteredHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyRegistered (String $reason, String _serverId)
  {
    super(ServerAlreadyRegisteredHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyRegistered
