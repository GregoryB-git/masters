package ma;

import java.io.IOException;

public class b0
  extends IOException
{
  public s0 a;
  public boolean b;
  
  public b0(IOException paramIOException)
  {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  public b0(String paramString)
  {
    super(paramString);
  }
  
  public static b0 a()
  {
    return new b0("Protocol message end-group tag did not match expected tag.");
  }
  
  public static b0 b()
  {
    return new b0("Protocol message contained an invalid tag (zero).");
  }
  
  public static b0 c()
  {
    return new b0("Protocol message had invalid UTF-8.");
  }
  
  public static a d()
  {
    return new a();
  }
  
  public static b0 e()
  {
    return new b0("CodedInputStream encountered a malformed varint.");
  }
  
  public static b0 f()
  {
    return new b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static b0 g()
  {
    return new b0("Failed to parse the message.");
  }
  
  public static b0 h()
  {
    return new b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public static final class a
    extends b0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ma.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */