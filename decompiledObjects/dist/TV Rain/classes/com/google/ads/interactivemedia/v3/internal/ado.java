package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class ado
  implements AdsLoader
{
  private aew a = new aew(this);
  private final afc b;
  private final Context c;
  private final aek d = new aek();
  private final List<AdsLoader.AdsLoadedListener> e = new ArrayList(1);
  private final Map<String, AdsRequest> f = new HashMap();
  private final Map<String, StreamRequest> g = new HashMap();
  private final afd h;
  private agt i;
  private final Object j = new Object();
  private afy k;
  private ImaSdkSettings l;
  private TestingConfiguration m;
  private StreamDisplayContainer n;
  private AdDisplayContainer o;
  
  @Deprecated
  public ado(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings)
  {
    this(paramContext, paramUri, paramImaSdkSettings, null);
    b.a();
  }
  
  public ado(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, AdDisplayContainer paramAdDisplayContainer, TestingConfiguration paramTestingConfiguration)
  {
    this(paramContext, paramUri, paramImaSdkSettings, paramTestingConfiguration);
    o = paramAdDisplayContainer;
    afz.a = true;
    b.a();
  }
  
  public ado(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, StreamDisplayContainer paramStreamDisplayContainer, TestingConfiguration paramTestingConfiguration)
  {
    this(paramContext, paramUri, paramImaSdkSettings, paramTestingConfiguration);
    n = paramStreamDisplayContainer;
    afz.a = true;
    b.a();
  }
  
  private ado(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration)
  {
    this(new afc(paramContext, paramUri, paramImaSdkSettings, paramTestingConfiguration), paramContext);
    l = paramImaSdkSettings;
    m = paramTestingConfiguration;
  }
  
  @Deprecated
  private ado(afc paramafc, Context paramContext)
  {
    this(paramafc, paramContext, new afd(paramafc, paramContext));
    paramafc.a(h);
  }
  
  private ado(afc paramafc, Context paramContext, afd paramafd)
  {
    h = paramafd;
    b = paramafc;
    c = paramContext;
    l = ImaSdkFactory.getInstance().createImaSdkSettings();
  }
  
  private final AdDisplayContainer a(AdsRequest paramAdsRequest)
  {
    if (afz.a) {
      return o;
    }
    return paramAdsRequest.getAdDisplayContainer();
  }
  
  private final StreamDisplayContainer a(StreamRequest paramStreamRequest)
  {
    if (afz.a) {
      return n;
    }
    return paramStreamRequest.getStreamDisplayContainer();
  }
  
  private final String b()
  {
    Object localObject = m;
    if ((localObject != null) && (((TestingConfiguration)localObject).ignoreStrictModeFalsePositives()))
    {
      localObject = StrictMode.getThreadPolicy();
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder((StrictMode.ThreadPolicy)localObject).permitDiskReads().build());
      String str = UUID.randomUUID().toString();
      StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)localObject);
      return str;
    }
    return UUID.randomUUID().toString();
  }
  
  private final String c()
  {
    return String.format("android%s:%s:%s", new Object[] { Build.VERSION.RELEASE, "3.14.0", c.getPackageName() });
  }
  
  private final String d()
  {
    if (c.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0)
    {
      Log.w("IMASDK", "Host application doesn't have ACCESS_NETWORK_STATE permission");
      return "android:0";
    }
    NetworkInfo localNetworkInfo = ((ConnectivityManager)c.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return "android:0";
    }
    return String.format(Locale.US, "android:%d:%d", new Object[] { Integer.valueOf(localNetworkInfo.getType()), Integer.valueOf(localNetworkInfo.getSubtype()) });
  }
  
  private final adq e()
  {
    Object localObject1 = c.getPackageManager();
    Object localObject2 = ((PackageManager)localObject1).resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads.interactivemedia.v3")), 65536);
    if (localObject2 == null) {
      return null;
    }
    localObject2 = activityInfo;
    if (localObject2 == null) {
      return null;
    }
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo(packageName, 0);
      if (localObject1 == null) {
        return null;
      }
      return adq.create(versionCode, packageName);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return null;
  }
  
  public final void a()
  {
    b.a();
  }
  
  public final void a(AdsManagerLoadedEvent paramAdsManagerLoadedEvent)
  {
    Iterator localIterator = e.iterator();
    while (localIterator.hasNext()) {
      ((AdsLoader.AdsLoadedListener)localIterator.next()).onAdsManagerLoaded(paramAdsManagerLoadedEvent);
    }
  }
  
  public final void addAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    d.a(paramAdErrorListener);
  }
  
  public final void addAdsLoadedListener(AdsLoader.AdsLoadedListener paramAdsLoadedListener)
  {
    e.add(paramAdsLoadedListener);
  }
  
  public final void contentComplete()
  {
    b.b(new aeq(aes.adsLoader, aer.contentComplete, "*"));
  }
  
  public final ImaSdkSettings getSettings()
  {
    return l;
  }
  
  public final void removeAdErrorListener(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    d.b(paramAdErrorListener);
  }
  
  public final void removeAdsLoadedListener(AdsLoader.AdsLoadedListener paramAdsLoadedListener)
  {
    e.remove(paramAdsLoadedListener);
  }
  
  public final void requestAds(AdsRequest paramAdsRequest)
  {
    String str = b();
    if (paramAdsRequest == null) {
      d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "AdsRequest cannot be null.")));
    }
    for (;;)
    {
      i1 = 0;
      break label190;
      if (a(paramAdsRequest) == null)
      {
        d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must be provided.")));
      }
      else if (a(paramAdsRequest).getAdContainer() == null)
      {
        d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad display container must have a UI container.")));
      }
      else
      {
        if ((!ahf.a(paramAdsRequest.getAdTagUrl())) || (!ahf.a(paramAdsRequest.getAdsResponse()))) {
          break;
        }
        d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Ad tag url must non-null and non empty.")));
      }
    }
    int i1 = 1;
    label190:
    if (i1 != 0)
    {
      f.put(str, paramAdsRequest);
      b.a(a, str);
      b.a(a(paramAdsRequest), str);
      new adn(this, paramAdsRequest, str).execute(new String[] { paramAdsRequest.getAdTagUrl() });
    }
  }
  
  public final String requestStream(StreamRequest paramStreamRequest)
  {
    String str = b();
    if (paramStreamRequest == null) {
      d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "StreamRequest cannot be null.")));
    }
    for (;;)
    {
      i1 = 0;
      break label133;
      if (a(paramStreamRequest) == null)
      {
        d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream display container must be provided.")));
      }
      else
      {
        if (a(paramStreamRequest).getVideoStreamPlayer() != null) {
          break;
        }
        d.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Stream requests must specify a player.")));
      }
    }
    int i1 = 1;
    label133:
    if (i1 != 0)
    {
      g.put(str, paramStreamRequest);
      b.a(a, str);
      b.a(a(paramStreamRequest), str);
      new adp(this, paramStreamRequest, str).execute(new Void[0]);
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ado
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */