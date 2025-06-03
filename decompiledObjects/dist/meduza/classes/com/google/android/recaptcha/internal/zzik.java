package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ec.i;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nc.r;

public final class zzik
  extends WebViewClient
{
  public zzik(zzja paramzzja) {}
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    System.currentTimeMillis();
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    long l = zzja.zzr(zza).zza(TimeUnit.MICROSECONDS);
    int i = zzbk.zza;
    zzbk.zza(zzbl.zzg.zza(), l);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    paramString2 = zzbb.zzc;
    paramString1 = (zzba)zzja.zzy(zza).get(Integer.valueOf(paramInt));
    paramWebView = paramString1;
    if (paramString1 == null) {
      paramWebView = zzba.zzM;
    }
    paramWebView = new zzbd(paramString2, paramWebView, null);
    zza.zzA().hashCode();
    paramWebView.getMessage();
    zza.zzA().h0(paramWebView);
  }
  
  public final WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    zzja localzzja = zza;
    Uri localUri = Uri.parse(paramString);
    zzja.zzp(localzzja);
    i.b(localUri);
    if ((zzfk.zzc(localUri)) && (!zzja.zzp(zza).zza(localUri)))
    {
      paramWebView = new zzbd(zzbb.zzb, zzba.zzQ, null);
      zza.zzA().hashCode();
      localUri.toString();
      zza.zzA().h0(paramWebView);
      return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzik
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */