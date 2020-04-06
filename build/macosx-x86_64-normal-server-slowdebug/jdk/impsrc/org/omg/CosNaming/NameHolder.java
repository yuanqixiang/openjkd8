package org.omg.CosNaming;


/**
* org/omg/CosNaming/NameHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?4?6? ??? ??08?15?54? CST
*/


/**
   * A name is a sequence of name components.
   */
public final class NameHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NameComponent value[] = null;

  public NameHolder ()
  {
  }

  public NameHolder (org.omg.CosNaming.NameComponent[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NameHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NameHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NameHelper.type ();
  }

}
