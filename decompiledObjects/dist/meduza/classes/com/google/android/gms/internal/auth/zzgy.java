package com.google.android.gms.internal.auth;

public final class zzgy
  extends RuntimeException
{
  public zzgy(zzfx paramzzfx)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public final zzfb zza()
  {
    return new zzfb(getMessage());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */