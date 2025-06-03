package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import ec.i;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import va.a;

public final class zzeu
  implements zzet
{
  private final String zza;
  
  public zzeu(String paramString)
  {
    zza = paramString;
  }
  
  private static final void zzb(byte[] paramArrayOfByte)
  {
    Iterator localIterator = zzrf.zzk(paramArrayOfByte).zzl().iterator();
    while (localIterator.hasNext())
    {
      zzrc localzzrc = (zzrc)localIterator.next();
      paramArrayOfByte = "INIT_TOTAL";
      List localList = a.g(new String[] { "INIT_TOTAL", "EXECUTE_TOTAL" });
      switch (localzzrc.zzY())
      {
      default: 
        paramArrayOfByte = "UNRECOGNIZED";
        break;
      case 42: 
        paramArrayOfByte = "WEBVIEW_INITIALIZATION";
        break;
      case 41: 
        paramArrayOfByte = "INIT_ATTEMPT";
        break;
      case 40: 
        paramArrayOfByte = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
        break;
      case 39: 
        paramArrayOfByte = "GMSCORE_ENGINE_INITIALIZATION";
        break;
      case 38: 
        paramArrayOfByte = "PIA_WARMUP";
        break;
      case 37: 
        paramArrayOfByte = "NATIVE_SIGNAL_COLLECTION";
        break;
      case 36: 
        paramArrayOfByte = "NATIVE_SIGNAL_INITIALIZATION";
        break;
      case 35: 
        paramArrayOfByte = "NATIVE_ENGINE_SIGNAL_COLLECTION";
        break;
      case 34: 
        paramArrayOfByte = "NATIVE_ENGINE_INITIALIZATION";
        break;
      case 33: 
        paramArrayOfByte = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
        break;
      case 32: 
        paramArrayOfByte = "WEBVIEW_ENGINE_INITIALIATION";
        break;
      case 31: 
        paramArrayOfByte = "SIGNAL_MANAGER_COLLECT_SIGNALS";
        break;
      case 30: 
        paramArrayOfByte = "SIGNAL_MANAGER_INITIALIZATION";
        break;
      case 29: 
        paramArrayOfByte = "POST_EXECUTE";
        break;
      case 28: 
        paramArrayOfByte = "FETCH_TOKEN";
        break;
      case 27: 
        paramArrayOfByte = "COLLECT_SIGNALS";
        break;
      case 26: 
        paramArrayOfByte = "LOAD_WEBVIEW";
        break;
      case 25: 
        paramArrayOfByte = "LOAD_CACHE_JS";
        break;
      case 24: 
        paramArrayOfByte = "SAVE_CACHE_JS";
        break;
      case 23: 
        paramArrayOfByte = "DOWNLOAD_JS";
        break;
      case 22: 
        paramArrayOfByte = "VALIDATE_INPUT";
        break;
      case 21: 
        paramArrayOfByte = "INIT_DOWNLOAD_JS";
        break;
      case 20: 
        paramArrayOfByte = "INIT_NETWORK_MRI_ACTION";
        break;
      case 19: 
        paramArrayOfByte = "WEB_VIEW_RELOAD_JS";
        break;
      case 18: 
        paramArrayOfByte = "JS_LOAD";
        break;
      case 17: 
        paramArrayOfByte = "FETCH_ALLOWLIST";
        break;
      case 16: 
        paramArrayOfByte = "RUN_PROGRAM";
        break;
      case 15: 
        paramArrayOfByte = "VERIFY_PIN_TOTAL";
        break;
      case 14: 
        paramArrayOfByte = "VERIFY_PIN_JS";
        break;
      case 13: 
        paramArrayOfByte = "VERIFY_PIN_NATIVE";
        break;
      case 12: 
        paramArrayOfByte = "CHALLENGE_ACCOUNT_TOTAL";
        break;
      case 11: 
        paramArrayOfByte = "CHALLENGE_ACCOUNT_JS";
        break;
      case 10: 
        paramArrayOfByte = "CHALLENGE_ACCOUNT_NATIVE";
        break;
      case 9: 
        paramArrayOfByte = "EXECUTE_TOTAL";
        break;
      case 8: 
        paramArrayOfByte = "EXECUTE_JS";
        break;
      case 7: 
        paramArrayOfByte = "EXECUTE_NATIVE";
        break;
      case 5: 
        paramArrayOfByte = "INIT_JS";
        break;
      case 4: 
        paramArrayOfByte = "INIT_NETWORK";
        break;
      case 3: 
        paramArrayOfByte = "INIT_NATIVE";
        break;
      case 2: 
        paramArrayOfByte = "UNKNOWN";
      }
      if ((localList.contains(paramArrayOfByte)) && (localzzrc.zzX()))
      {
        localzzrc.zzM();
        localzzrc.zzN();
        localzzrc.zzY();
        localzzrc.zzg().zzk();
        localzzrc.zzg().zzf();
      }
      else
      {
        localzzrc.zzM();
        localzzrc.zzN();
        localzzrc.zzY();
      }
      localzzrc.zzZ();
    }
  }
  
  public final boolean zza(byte[] paramArrayOfByte)
  {
    try
    {
      TrafficStats.setThreadStatsTag((int)Thread.currentThread().getId());
      zzb(paramArrayOfByte);
      Object localObject;
      if (URLUtil.isHttpUrl(zza))
      {
        localObject = new java/net/URL;
        ((URL)localObject).<init>(zza);
        localObject = ((URL)localObject).openConnection();
        i.c(localObject, "null cannot be cast to non-null type java.net.HttpURLConnection");
        localObject = (HttpURLConnection)localObject;
      }
      else
      {
        if (!URLUtil.isHttpsUrl(zza)) {
          break label138;
        }
        localObject = new java/net/URL;
        ((URL)localObject).<init>(zza);
        localObject = ((URL)localObject).openConnection();
        i.c(localObject, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        localObject = (HttpsURLConnection)localObject;
      }
      ((HttpURLConnection)localObject).setRequestMethod("POST");
      ((URLConnection)localObject).setDoOutput(true);
      ((URLConnection)localObject).setRequestProperty("Content-Type", "application/x-protobuffer");
      ((URLConnection)localObject).connect();
      ((URLConnection)localObject).getOutputStream().write(paramArrayOfByte);
      return ((HttpURLConnection)localObject).getResponseCode() == 200;
      label138:
      paramArrayOfByte = new java/net/MalformedURLException;
      paramArrayOfByte.<init>("Recaptcha server url only allows using Http or Https.");
      throw paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.getMessage();
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzeu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */