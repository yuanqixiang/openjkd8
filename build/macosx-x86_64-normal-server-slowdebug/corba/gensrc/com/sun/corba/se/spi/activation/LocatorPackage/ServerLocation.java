package com.sun.corba.se.spi.activation.LocatorPackage;


/**
* com/sun/corba/se/spi/activation/LocatorPackage/ServerLocation.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class ServerLocation implements org.omg.CORBA.portable.IDLEntity
{
  public String hostname = null;
  public com.sun.corba.se.spi.activation.ORBPortInfo ports[] = null;

  public ServerLocation ()
  {
  } // ctor

  public ServerLocation (String _hostname, com.sun.corba.se.spi.activation.ORBPortInfo[] _ports)
  {
    hostname = _hostname;
    ports = _ports;
  } // ctor

} // class ServerLocation
