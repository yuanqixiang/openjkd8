package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyInstalled.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?4?6? ??? ??08?15?54? CST
*/

public final class ServerAlreadyInstalled extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyInstalled ()
  {
    super(ServerAlreadyInstalledHelper.id());
  } // ctor

  public ServerAlreadyInstalled (int _serverId)
  {
    super(ServerAlreadyInstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyInstalled (String $reason, int _serverId)
  {
    super(ServerAlreadyInstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyInstalled
