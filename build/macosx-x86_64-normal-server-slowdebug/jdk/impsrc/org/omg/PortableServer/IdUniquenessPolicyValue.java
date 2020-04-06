package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdUniquenessPolicyValue.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/**
	 * IdUniquenessPolicyValue can have the following values.
	 * UNIQUE_ID - Servants activated with that POA support 
	 * exactly one Object Id.  MULTIPLE_ID - a servant 
	 * activated with that POA may support one or more 
	 * Object Ids.
	 */
public class IdUniquenessPolicyValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static org.omg.PortableServer.IdUniquenessPolicyValue[] __array = new org.omg.PortableServer.IdUniquenessPolicyValue [__size];

  public static final int _UNIQUE_ID = 0;
  public static final org.omg.PortableServer.IdUniquenessPolicyValue UNIQUE_ID = new org.omg.PortableServer.IdUniquenessPolicyValue(_UNIQUE_ID);
  public static final int _MULTIPLE_ID = 1;
  public static final org.omg.PortableServer.IdUniquenessPolicyValue MULTIPLE_ID = new org.omg.PortableServer.IdUniquenessPolicyValue(_MULTIPLE_ID);

  public int value ()
  {
    return __value;
  }

  public static org.omg.PortableServer.IdUniquenessPolicyValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected IdUniquenessPolicyValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class IdUniquenessPolicyValue
