package org.omg.IOP;

/**
* org/omg/IOP/TaggedProfileHolder.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class TaggedProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.IOP.TaggedProfile value = null;

  public TaggedProfileHolder ()
  {
  }

  public TaggedProfileHolder (org.omg.IOP.TaggedProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.IOP.TaggedProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.IOP.TaggedProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.IOP.TaggedProfileHelper.type ();
  }

}
