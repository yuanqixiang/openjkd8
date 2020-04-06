package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantActivator.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableServer/poa.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/**
	 * When the POA has the RETAIN policy it uses servant 
	 * managers that are ServantActivators. 
	 */
public interface ServantActivator extends ServantActivatorOperations, org.omg.PortableServer.ServantManager, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServantActivator
