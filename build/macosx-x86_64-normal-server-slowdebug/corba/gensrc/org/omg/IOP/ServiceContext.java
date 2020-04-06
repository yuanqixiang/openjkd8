package org.omg.IOP;


/**
* org/omg/IOP/ServiceContext.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public final class ServiceContext implements org.omg.CORBA.portable.IDLEntity
{

  /** The service context id */
  public int context_id = (int)0;

  /** The data associated with this service context */
  public byte context_data[] = null;

  public ServiceContext ()
  {
  } // ctor

  public ServiceContext (int _context_id, byte[] _context_data)
  {
    context_id = _context_id;
    context_data = _context_data;
  } // ctor

} // class ServiceContext
