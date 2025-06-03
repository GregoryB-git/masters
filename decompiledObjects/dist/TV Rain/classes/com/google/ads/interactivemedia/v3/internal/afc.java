package com.google.ads.interactivemedia.v3.internal;

import a;
import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.ag;
import com.google.ads.interactivemedia.v3.impl.data.ag.a;
import com.google.ads.interactivemedia.v3.impl.data.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import z2;

public class afc
{
  private final Map<String, aey> a = new HashMap();
  private final Map<String, aet> b = new HashMap();
  private final Set<String> c = new HashSet();
  private final Map<String, aew> d = new HashMap();
  private final Map<String, afn> e = new HashMap();
  private Map<String, BaseDisplayContainer> f = new HashMap();
  private final Context g;
  private final afa h;
  private afb i;
  private boolean j = false;
  private final Queue<aeq> k = new ArrayDeque();
  private long l;
  private TestingConfiguration m;
  private String n;
  private aex o;
  private AdsRenderingSettings p;
  
  public afc(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration)
  {
    g = paramContext;
    m = paramTestingConfiguration;
    h = new afa(paramContext, this);
    n = a(paramUri, paramImaSdkSettings).toString();
  }
  
  private static Map<String, ViewGroup> a(aey paramaey, adz paramadz, Set<String> paramSet)
  {
    HashMap localHashMap = new HashMap(paramSet.size());
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      String str = (String)paramSet.next();
      CompanionAdSlot localCompanionAdSlot = (CompanionAdSlot)paramadz.a().get(str);
      if (localCompanionAdSlot.getContainer() != null) {
        localHashMap.put(str, localCompanionAdSlot.getContainer());
      } else {
        paramaey.a(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display requested for invalid companion slot.");
      }
    }
    return localHashMap;
  }
  
  private void a(long paramLong, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("webViewLoadingTime", Long.valueOf(paramLong));
    b(new aeq(aes.webViewLoaded, aer.csi, paramString, localHashMap));
  }
  
  private void a(ViewGroup paramViewGroup, CompanionData paramCompanionData, String paramString, CompanionAdSlot paramCompanionAdSlot)
  {
    paramViewGroup.removeAllViews();
    paramCompanionAdSlot = (aee)paramCompanionAdSlot;
    List localList = paramCompanionAdSlot.a();
    int i1 = paramCompanionData.type().ordinal();
    if (i1 != 0) {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          paramCompanionData = null;
          break label77;
        }
      }
      else
      {
        paramCompanionData = a(paramViewGroup.getContext(), paramCompanionData, paramString, localList);
        break label77;
      }
    }
    paramCompanionData = a(paramViewGroup.getContext(), paramCompanionData, localList);
    label77:
    paramCompanionData.setTag(paramString);
    paramCompanionAdSlot.a(paramString);
    paramViewGroup.addView(paramCompanionData);
  }
  
  private void a(aer paramaer)
  {
    int i1 = paramaer.ordinal();
    if (i1 != 41)
    {
      if (i1 == 42) {
        o.c();
      }
      return;
    }
    o.b();
  }
  
  private void a(aer paramaer, String paramString, ag paramag)
  {
    int i1 = paramaer.ordinal();
    if (i1 != 34)
    {
      if (i1 != 38)
      {
        a("other", paramaer);
        return;
      }
      if (ln != null)
      {
        paramaer = n;
        if ((paramaer != null) && (m != null))
        {
          paramaer = String.valueOf(paramaer);
          if (paramaer.length() != 0) {
            paramaer = "SDK_LOG:".concat(paramaer);
          } else {
            paramaer = new String("SDK_LOG:");
          }
          i1 = ln.charAt(0);
          if (i1 != 68)
          {
            if (i1 != 69) {
              if (i1 != 73)
              {
                if (i1 != 83)
                {
                  if (i1 != 86)
                  {
                    if (i1 != 87)
                    {
                      paramString = String.valueOf(ln);
                      if (paramString.length() != 0) {
                        paramString = "Unrecognized log level: ".concat(paramString);
                      } else {
                        paramString = new String("Unrecognized log level: ");
                      }
                      Log.w("IMASDK", paramString);
                      Log.w(paramaer, m);
                      return;
                    }
                    Log.w(paramaer, m);
                    return;
                  }
                  Log.v(paramaer, m);
                }
              }
              else
              {
                Log.i(paramaer, m);
                return;
              }
            }
            Log.e(paramaer, m);
            return;
          }
          Log.d(paramaer, m);
          return;
        }
      }
      paramaer = String.valueOf(paramag);
      paramString = new StringBuilder(paramaer.length() + 30);
      paramString.append("Invalid logging message data: ");
      paramString.append(paramaer);
      Log.e("IMASDK", paramString.toString());
      return;
    }
    i = new afb(adTimeUpdateMs);
    j = true;
    a(SystemClock.elapsedRealtime() - l, paramString);
    d();
  }
  
  private void a(aes paramaes, aer paramaer, String paramString, ag paramag)
  {
    afn localafn = (afn)e.get(paramString);
    if (localafn == null)
    {
      paramaes = String.valueOf(paramaes);
      paramaer = String.valueOf(paramaer);
      int i1 = paramaes.length();
      paramaes = a.q(a.b(paramString, paramaer.length() + (i1 + 44)), "Received ", paramaes, " message: ", paramaer);
      paramaes.append(" for invalid session id: ");
      paramaes.append(paramString);
      Log.w("IMASDK", paramaes.toString());
      return;
    }
    localafn.a(paramaes, paramaer, paramag);
  }
  
  private static void a(String paramString, aer paramaer)
  {
    paramaer = String.valueOf(paramaer);
    paramString = a.q(a.b(paramString, paramaer.length() + 43), "Illegal message type ", paramaer, " received for ", paramString);
    paramString.append(" channel");
    Log.i("IMASDK", paramString.toString());
  }
  
  private static String b(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (paramString2 != null) {
      if (paramString2.length() == 0)
      {
        str = paramString1;
      }
      else
      {
        int i1 = a.b(paramString1, 12);
        str = z2.l(paramString2.length() + i1, paramString1, " Caused by: ", paramString2);
      }
    }
    return str;
  }
  
  private void b(aer paramaer, String paramString, ag paramag)
  {
    adz localadz = (adz)f.get(paramString);
    Object localObject1 = (aey)a.get(paramString);
    Object localObject2 = (afn)e.get(paramString);
    if ((localadz != null) && (localObject1 != null) && (localObject2 != null))
    {
      int i1 = paramaer.ordinal();
      if (i1 != 23)
      {
        if ((i1 != 31) && (i1 != 53))
        {
          if (i1 != 47)
          {
            if (i1 != 48)
            {
              a(aes.displayContainer.toString(), paramaer);
              break label202;
            }
            ((aey)localObject1).a();
            return;
          }
          ((aey)localObject1).a(resizeAndPositionVideo);
        }
      }
      else
      {
        if (paramag == null) {
          break label287;
        }
        paramaer = companions;
        if (paramaer == null) {
          break label287;
        }
        ((aey)localObject1).a(paramaer);
        paramaer = a((aey)localObject1, localadz, companions.keySet());
        localObject1 = p;
        if ((localObject1 == null) || (((AdsRenderingSettings)localObject1).isRenderCompanions())) {
          break label203;
        }
      }
      label202:
      return;
      label203:
      localObject2 = paramaer.keySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        a((ViewGroup)paramaer.get(localObject1), (CompanionData)companions.get(localObject1), paramString, (CompanionAdSlot)localadz.a().get(localObject1));
      }
      return;
      label287:
      ((aey)localObject1).a(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Display companions message requires companions in data.");
      return;
    }
    paramag = String.valueOf(paramaer);
    paramaer = new StringBuilder(a.b(paramString, paramag.length() + 60));
    paramaer.append("Received displayContainer message: ");
    paramaer.append(paramag);
    paramaer.append(" for invalid session id: ");
    paramaer.append(paramString);
    Log.e("IMASDK", paramaer.toString());
  }
  
  private void c(aer paramaer, String paramString, ag paramag)
  {
    aew localaew = (aew)d.get(paramString);
    if (localaew == null)
    {
      paramaer = String.valueOf(paramaer);
      paramag = new StringBuilder(a.b(paramString, paramaer.length() + 51));
      paramag.append("Received request message: ");
      paramag.append(paramaer);
      paramag.append(" for invalid session id: ");
      paramag.append(paramString);
      Log.e("IMASDK", paramag.toString());
      return;
    }
    int i1 = paramaer.ordinal();
    if (i1 != 10)
    {
      if (i1 != 26)
      {
        if (i1 != 61)
        {
          a(aes.adsLoader.toString(), paramaer);
          return;
        }
        localaew.a(paramString, i, streamId, monitorAppLifecycle);
        paramaer = String.valueOf(streamId);
        if (paramaer.length() != 0) {
          paramaer = "Stream initialized with streamId: ".concat(paramaer);
        } else {
          paramaer = new String("Stream initialized with streamId: ");
        }
        Log.i("IMASDK", paramaer);
        return;
      }
      localaew.a(paramString, AdError.AdErrorType.LOAD, errorCode, b(errorMessage, innerError));
      return;
    }
    if (paramag == null)
    {
      localaew.a(paramString, AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "adsLoaded message did not contain cue points.");
      return;
    }
    localaew.a(paramString, i, adCuePoints, internalCuePoints, monitorAppLifecycle);
  }
  
  private void d()
  {
    while ((j) && (!k.isEmpty())) {
      h.a((aeq)k.remove());
    }
  }
  
  private void d(aer paramaer, String paramString, ag paramag)
  {
    aey localaey = (aey)a.get(paramString);
    if (localaey == null)
    {
      paramaer = String.valueOf(paramaer);
      paramag = new StringBuilder(a.b(paramString, paramaer.length() + 51));
      paramag.append("Received manager message: ");
      paramag.append(paramaer);
      paramag.append(" for invalid session id: ");
      paramag.append(paramString);
      Log.e("IMASDK", paramag.toString());
      return;
    }
    if (paramag != null)
    {
      paramString = adData;
      if (paramString != null) {}
    }
    else
    {
      paramString = null;
    }
    int i1 = paramaer.ordinal();
    if (i1 != 11)
    {
      if (i1 != 21)
      {
        if (i1 != 32)
        {
          if (i1 != 36) {
            if (i1 != 43) {
              if (i1 != 49) {
                if (i1 != 57) {
                  if (i1 != 62)
                  {
                    if (i1 == 67) {
                      break label989;
                    }
                    if (i1 != 13) {
                      if (i1 != 14) {
                        if (i1 != 17) {
                          if (i1 != 18) {
                            if (i1 != 26) {
                              if (i1 != 27) {
                                if (i1 != 54) {
                                  if (i1 == 55) {}
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          switch (i1)
          {
          default: 
            switch (i1)
            {
            default: 
              switch (i1)
              {
              default: 
                a(aes.adsManager.toString(), paramaer);
                return;
              }
              break;
            }
          case 9: 
            paramaer = new aev(AdEvent.AdEventType.AD_PROGRESS, paramString);
            e = new adl(currentTime, duration, adPosition, totalAds, adBreakDuration);
            localaey.a(paramaer);
            return;
          case 8: 
            localaey.a(new aev(AdEvent.AdEventType.AD_PERIOD_STARTED, null));
            return;
          case 7: 
            localaey.a(new aev(AdEvent.AdEventType.AD_PERIOD_ENDED, null));
          case 6: 
            return;
          case 4: 
            localaey.a(new aev(AdEvent.AdEventType.AD_BUFFERING, null));
            return;
          case 3: 
            paramaer = new aev(AdEvent.AdEventType.AD_BREAK_FETCH_ERROR, null);
            paramString = new ArrayMap(1);
            c = paramString;
            paramString.put("adBreakTime", adBreakTime);
            localaey.a(paramaer);
            return;
          case 2: 
            localaey.a(new aev(AdEvent.AdEventType.AD_BREAK_STARTED, paramString));
            return;
          case 1: 
            paramaer = new aev(AdEvent.AdEventType.AD_BREAK_READY, null);
            paramString = new ArrayMap(1);
            c = paramString;
            paramString.put("adBreakTime", adBreakTime);
            localaey.a(paramaer);
            return;
          case 0: 
            localaey.a(new aev(AdEvent.AdEventType.AD_BREAK_ENDED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.MIDPOINT, paramString));
            return;
            paramaer = new aev(AdEvent.AdEventType.LOG, paramString);
            c = logData.constructMap();
            localaey.a(paramaer);
            return;
            paramaer = new aev(AdEvent.AdEventType.ICON_TAPPED, null);
            f = clickThroughUrl;
            localaey.a(paramaer);
            return;
            localaey.a(new aev(AdEvent.AdEventType.TAPPED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.SKIPPABLE_STATE_CHANGED, paramString));
            return;
            paramaer = new aev(AdEvent.AdEventType.SKIPPED, null);
            g = seekTime;
            localaey.a(paramaer);
            return;
            localaey.a(new aev(AdEvent.AdEventType.FIRST_QUARTILE, paramString));
            return;
            localaey.a(AdError.AdErrorType.PLAY, errorCode, b(errorMessage, innerError));
            return;
            localaey.a(new aev(AdEvent.AdEventType.CONTENT_RESUME_REQUESTED, null));
            return;
            localaey.a(new aev(AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED, null));
            return;
            localaey.a(new aev(AdEvent.AdEventType.COMPLETED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.CLICKED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.THIRD_QUARTILE, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.STARTED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.RESUMED, paramString));
            return;
            localaey.a(new aev(AdEvent.AdEventType.PAUSED, paramString));
            return;
            if (paramString != null)
            {
              localaey.a(new aev(AdEvent.AdEventType.LOADED, paramString));
              return;
            }
            Log.e("IMASDK", "Ad loaded message requires adData");
            localaey.a(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Ad loaded message did not contain adData.");
          }
        }
        label989:
        return;
      }
      paramaer = new aev(AdEvent.AdEventType.CUEPOINTS_CHANGED, null);
      d = new ArrayList();
      paramag = cuepoints.iterator();
      while (paramag.hasNext())
      {
        paramString = (z)paramag.next();
        d.add(new aeh(paramString.start(), paramString.end(), paramString.played()));
      }
      localaey.a(paramaer);
      return;
    }
    localaey.a(new aev(AdEvent.AdEventType.ALL_ADS_COMPLETED, null));
  }
  
  private void e(aer paramaer, String paramString, ag paramag)
  {
    if (c.contains(paramString)) {
      return;
    }
    aet localaet = (aet)b.get(paramString);
    if (localaet == null)
    {
      paramag = String.valueOf(paramaer);
      paramaer = new StringBuilder(a.b(paramString, paramag.length() + 51));
      paramaer.append("Received monitor message: ");
      paramaer.append(paramag);
      paramaer.append(" for invalid session id: ");
      paramaer.append(paramString);
      Log.e("IMASDK", paramaer.toString());
      return;
    }
    if (paramag == null)
    {
      paramaer = String.valueOf(paramaer);
      paramaer = a.q(a.b(paramString, paramaer.length() + 56), "Received monitor message: ", paramaer, " for session id: ", paramString);
      paramaer.append(" with no data");
      Log.e("IMASDK", paramaer.toString());
      return;
    }
    int i1 = paramaer.ordinal();
    if (i1 != 30)
    {
      if (i1 != 46)
      {
        a(aes.activityMonitor.toString(), paramaer);
        return;
      }
      localaet.a(queryId, eventId, vastEvent);
      return;
    }
    localaet.a(queryId, eventId);
  }
  
  public Uri a(Uri paramUri, ImaSdkSettings paramImaSdkSettings)
  {
    paramUri = paramUri.buildUpon().appendQueryParameter("sdk_version", "a.3.14.0").appendQueryParameter("hl", paramImaSdkSettings.getLanguage());
    new afg();
    paramUri = paramUri.appendQueryParameter("omv", b.a()).appendQueryParameter("app", g.getApplicationContext().getPackageName());
    if (m != null) {
      paramUri.appendQueryParameter("tcnfp", new xz().a(new agy()).a(new xk()).a().a(m));
    }
    return paramUri.build();
  }
  
  public View a(Context paramContext, CompanionData paramCompanionData, String paramString, List<CompanionAdSlot.ClickListener> paramList)
  {
    paramContext = new aeo(paramContext, this, paramCompanionData, paramString, paramList);
    new aen(paramContext).execute(new Void[0]);
    return paramContext;
  }
  
  public View a(Context paramContext, CompanionData paramCompanionData, List<CompanionAdSlot.ClickListener> paramList)
  {
    return new aed(paramContext, this, paramCompanionData, paramList);
  }
  
  public void a()
  {
    l = SystemClock.elapsedRealtime();
    h.a(n);
  }
  
  public void a(AdsRenderingSettings paramAdsRenderingSettings)
  {
    p = paramAdsRenderingSettings;
  }
  
  public void a(BaseDisplayContainer paramBaseDisplayContainer, String paramString)
  {
    f.put(paramString, paramBaseDisplayContainer);
  }
  
  public void a(aeq paramaeq)
  {
    Object localObject1 = (ag)paramaeq.c();
    String str1 = paramaeq.d();
    aer localaer = paramaeq.b();
    Object localObject2 = paramaeq.a().name();
    String str2 = localaer.name();
    localObject2 = a.q(a.b(str2, a.b((String)localObject2, 24)), "Received js message: ", (String)localObject2, " [", str2);
    ((StringBuilder)localObject2).append("]");
    Log.d("IMASDK", ((StringBuilder)localObject2).toString());
    switch (paramaeq.a().ordinal())
    {
    case 3: 
    case 5: 
    default: 
      localObject1 = String.valueOf(paramaeq.a());
      paramaeq = new StringBuilder(((String)localObject1).length() + 25);
      paramaeq.append("Unknown message channel: ");
      paramaeq.append((String)localObject1);
      Log.e("IMASDK", paramaeq.toString());
      return;
    case 10: 
      a(aes.videoDisplay2, localaer, str1, (ag)localObject1);
      return;
    case 9: 
      a(aes.videoDisplay1, localaer, str1, (ag)localObject1);
      return;
    case 8: 
      paramaeq = (afn)e.get(str1);
      if (paramaeq != null)
      {
        paramaeq.e();
        Log.d("IMASDK", "Enabling legacy video display messaging on channel videoDisplay.");
      }
      a(aes.videoDisplay1, localaer, str1, (ag)localObject1);
      return;
    case 7: 
      a(localaer);
      return;
    case 6: 
    case 11: 
      a(localaer, str1, (ag)localObject1);
      return;
    case 4: 
      b(localaer, str1, (ag)localObject1);
      return;
    case 2: 
      c(localaer, str1, (ag)localObject1);
      return;
    case 1: 
      d(localaer, str1, (ag)localObject1);
      return;
    }
    e(localaer, str1, (ag)localObject1);
  }
  
  public void a(aet paramaet, String paramString)
  {
    b.put(paramString, paramaet);
  }
  
  public void a(aew paramaew, String paramString)
  {
    d.put(paramString, paramaew);
  }
  
  public void a(aex paramaex)
  {
    o = paramaex;
  }
  
  public void a(aey paramaey, String paramString)
  {
    a.put(paramString, paramaey);
  }
  
  public void a(afn paramafn, String paramString)
  {
    e.put(paramString, paramafn);
  }
  
  public void a(String paramString)
  {
    b.remove(paramString);
    c.add(paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((!ahf.a(paramString1)) && (!ahf.a(paramString2)))
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("companionId", paramString1);
      b(new aeq(aes.displayContainer, aer.companionView, paramString2, localHashMap));
    }
  }
  
  public WebView b()
  {
    return h.a();
  }
  
  public void b(aeq paramaeq)
  {
    String str = paramaeq.a().name();
    Object localObject = paramaeq.b().name();
    localObject = a.q(a.b((String)localObject, a.b(str, 23)), "Sending js message: ", str, " [", (String)localObject);
    ((StringBuilder)localObject).append("]");
    Log.d("IMASDK", ((StringBuilder)localObject).toString());
    k.add(paramaeq);
    d();
  }
  
  public void b(String paramString)
  {
    a.remove(paramString);
    f.remove(paramString);
    e.remove(paramString);
  }
  
  public TestingConfiguration c()
  {
    return m;
  }
  
  public void c(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0)) {
      new aeu(this, paramString).execute(new Void[0]);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */