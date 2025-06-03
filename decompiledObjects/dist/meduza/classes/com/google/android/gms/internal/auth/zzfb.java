package com.google.android.gms.internal.auth;

import java.io.IOException;

public final class zzfb
  extends IOException
{
  private zzfx zza = null;
  
  public zzfb(IOException paramIOException)
  {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  public zzfb(String paramString)
  {
    super(paramString);
  }
  
  public static zzfb zza()
  {
    return new zzfb("Protocol message contained an invalid tag (zero).");
  }
  
  public static zzfb zzb()
  {
    return new zzfb("Protocol message had invalid UTF-8.");
  }
  
  public static zzfb zzc()
  {
    return new zzfb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static zzfb zzd()
  {
    return new zzfb("Failed to parse the message.");
  }
  
  public static zzfb zzf()
  {
    return new zzfb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final zzfb zze(zzfx paramzzfx)
  {
    zza = paramzzfx;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */