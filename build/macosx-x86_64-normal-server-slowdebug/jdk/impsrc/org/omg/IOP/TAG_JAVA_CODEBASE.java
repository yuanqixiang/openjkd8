package org.omg.IOP;


/**
* org/omg/IOP/TAG_JAVA_CODEBASE.java .
* ?IDL-to-Java ??? (???), ?? "3.2"??
* ?/Users/yuanqixiang/Downloads/openjdk8/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* 2020?4?6? ??? ??08?15?55? CST
*/

public interface TAG_JAVA_CODEBASE
{

  /**
       * Class downloading is supported for stubs, ties, values, and 
       * value helpers. The specification allows transmission of codebase 
       * information on the wire for stubs and ties, and enables usage of 
       * pre-existing ClassLoaders when relevant.  
       * <p>
       * For values and value helpers, the codebase is transmitted after the 
       * value tag.  For stubs and ties, the codebase is transmitted as 
       * the TaggedComponent <code>TAG_JAVA_CODEBASE</code> in the IOR 
       * profile, where the <code>component_data</code> is a CDR encapsulation 
       * of the codebase written as an IDL string. The codebase is a 
       * space-separated list of one or more URLs.
       */
  public static final int value = (int)(25L);
}
