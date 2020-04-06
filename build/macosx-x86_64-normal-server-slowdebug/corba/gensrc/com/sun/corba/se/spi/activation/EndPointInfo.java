package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/EndPointInfo.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?4?6? ??? ??08?15?54? CST
*/

public final class EndPointInfo implements org.omg.CORBA.portable.IDLEntity
{
  public String endpointType = null;
  public int port = (int)0;

  public EndPointInfo ()
  {
  } // ctor

  public EndPointInfo (String _endpointType, int _port)
  {
    endpointType = _endpointType;
    port = _port;
  } // ctor

} // class EndPointInfo
