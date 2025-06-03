package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class k4
  extends IOException
{
  public I4 o = null;
  
  public k4(String paramString)
  {
    super(paramString);
  }
  
  public static j4 a()
  {
    return new j4("Protocol message tag had invalid wire type.");
  }
  
  public static k4 b()
  {
    return new k4("Protocol message contained an invalid tag (zero).");
  }
  
  public static k4 c()
  {
    return new k4("Protocol message had invalid UTF-8.");
  }
  
  public static k4 d()
  {
    return new k4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static k4 e()
  {
    return new k4("Failed to parse the message.");
  }
  
  public static k4 f()
  {
    return new k4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.k4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */