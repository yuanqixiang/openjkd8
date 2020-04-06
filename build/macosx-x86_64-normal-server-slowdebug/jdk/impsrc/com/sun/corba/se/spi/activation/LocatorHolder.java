package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/LocatorHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class LocatorHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.Locator value = null;

  public LocatorHolder ()
  {
  }

  public LocatorHolder (com.sun.corba.se.spi.activation.Locator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.LocatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.LocatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.LocatorHelper.type ();
  }

}
