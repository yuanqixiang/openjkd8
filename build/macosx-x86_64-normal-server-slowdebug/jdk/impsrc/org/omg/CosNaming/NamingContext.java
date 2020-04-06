package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContext.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?4?6? ??? ??08?15?54? CST
*/


/** 
 * A naming context is an object that contains a set of name bindings in 
 * which each name is unique. Different names can be bound to an object 
 * in the same or different contexts at the same time. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContext extends NamingContextOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface NamingContext
