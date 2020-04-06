package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerHeldDownHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?4?6? ??? ??08?15?54? CST
*/

public final class ServerHeldDownHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.ServerHeldDown value = null;

  public ServerHeldDownHolder ()
  {
  }

  public ServerHeldDownHolder (com.sun.corba.se.spi.activation.ServerHeldDown initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.ServerHeldDownHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.ServerHeldDownHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.ServerHeldDownHelper.type ();
  }

}
