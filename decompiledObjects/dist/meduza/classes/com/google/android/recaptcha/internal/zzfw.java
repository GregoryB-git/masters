package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import nc.d0;
import x6.b;

public final class zzfw
{
  private final WebView zza;
  private final d0 zzb;
  
  public zzfw(WebView paramWebView, d0 paramd0)
  {
    zza = paramWebView;
    zzb = paramd0;
  }
  
  public final void zzb(String paramString, String... paramVarArgs)
  {
    paramString = new zzfv((String[])Arrays.copyOf(paramVarArgs, paramVarArgs.length), this, paramString, null);
    b.g0(zzb, null, paramString, 3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */