package com.google.android.gms.internal.firebase_auth_api;

import java.io.IOException;

public class zzakm
  extends IOException
{
  private boolean zza;
  
  public zzakm(IOException paramIOException)
  {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  public zzakm(String paramString)
  {
    super(paramString);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakp zza()
  {
    return new zzakp("Protocol message tag had invalid wire type.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzb()
  {
    return new zzakm("Protocol message end-group tag did not match expected tag.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzc()
  {
    return new zzakm("Protocol message contained an invalid tag (zero).");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzd()
  {
    return new zzakm("Protocol message had invalid UTF-8.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zze()
  {
    return new zzakm("CodedInputStream encountered a malformed varint.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzf()
  {
    return new zzakm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzg()
  {
    return new zzakm("Failed to parse the message.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzh()
  {
    return new zzakm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzi()
  {
    return new zzakm("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzakm zzj()
  {
    return new zzakm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  public final void zzk()
  {
    zza = true;
  }
  
  public final boolean zzl()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */