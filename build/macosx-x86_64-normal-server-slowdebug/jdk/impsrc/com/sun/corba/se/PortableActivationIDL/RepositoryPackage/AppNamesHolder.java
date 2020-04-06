package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;


/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/AppNamesHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/** Type used for a list of application names
	*/
public final class AppNamesHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public AppNamesHolder ()
  {
  }

  public AppNamesHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.type ();
  }

}
