package org.omg.CosNaming.NamingContextExtPackage;

/**
* org/omg/CosNaming/NamingContextExtPackage/InvalidAddressHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, December 11, 2019 10:23:05 AM UTC
*/

public final class InvalidAddressHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextExtPackage.InvalidAddress value = null;

  public InvalidAddressHolder ()
  {
  }

  public InvalidAddressHolder (org.omg.CosNaming.NamingContextExtPackage.InvalidAddress initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextExtPackage.InvalidAddressHelper.type ();
  }

}