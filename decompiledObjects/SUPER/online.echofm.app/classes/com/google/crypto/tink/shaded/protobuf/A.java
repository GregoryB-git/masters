package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

public class A
  extends IOException
{
  private static final long serialVersionUID = -1616151763072450476L;
  public O o = null;
  public boolean p;
  
  public A(IOException paramIOException)
  {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  public A(String paramString)
  {
    super(paramString);
  }
  
  public static A b()
  {
    return new A("Protocol message end-group tag did not match expected tag.");
  }
  
  public static A c()
  {
    return new A("Protocol message contained an invalid tag (zero).");
  }
  
  public static A d()
  {
    return new A("Protocol message had invalid UTF-8.");
  }
  
  public static a e()
  {
    return new a("Protocol message tag had invalid wire type.");
  }
  
  public static A f()
  {
    return new A("CodedInputStream encountered a malformed varint.");
  }
  
  public static A g()
  {
    return new A("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static A h()
  {
    return new A("Failed to parse the message.");
  }
  
  public static A i()
  {
    return new A("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  public static A l()
  {
    return new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  public static A m()
  {
    return new A("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public boolean a()
  {
    return p;
  }
  
  public void j()
  {
    p = true;
  }
  
  public A k(O paramO)
  {
    o = paramO;
    return this;
  }
  
  public static class a
    extends A
  {
    private static final long serialVersionUID = 3283890091615336259L;
    
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */