package com.google.android.recaptcha.internal;

public final class zzpk
  extends RuntimeException
{
  public zzpk(zzoi paramzzoi)
  {
    super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public final zznn zza()
  {
    return new zznn(getMessage());
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */