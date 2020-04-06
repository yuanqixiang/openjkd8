package org.omg.PortableServer;


/**
* org/omg/PortableServer/POAManager.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/**
	 * Each POA object has an associated POAManager object. 
	 * A POA manager may be associated with one or more 
	 * POA objects. A POA manager encapsulates the processing 
	 * state of the POAs it is associated with.
	 */
public interface POAManager extends POAManagerOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface POAManager
