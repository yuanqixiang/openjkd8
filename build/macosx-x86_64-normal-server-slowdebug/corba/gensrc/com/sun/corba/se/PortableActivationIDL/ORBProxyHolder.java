package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ORBProxyHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/** ORB callback interface, passed to Activator in registerORB method.
    */
public final class ORBProxyHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.ORBProxy value = null;

  public ORBProxyHolder ()
  {
  }

  public ORBProxyHolder (com.sun.corba.se.PortableActivationIDL.ORBProxy initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ORBProxyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ORBProxyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ORBProxyHelper.type ();
  }

}
