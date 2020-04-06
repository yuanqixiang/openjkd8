package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExt.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* 2020?4?6? ??? ??08?15?55? CST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContextExt extends NamingContextExtOperations, org.omg.CosNaming.NamingContext, org.omg.CORBA.portable.IDLEntity 
{
} // interface NamingContextExt
