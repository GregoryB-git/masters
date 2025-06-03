package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback;
import com.google.ads.interactivemedia.v3.impl.data.ag;
import com.google.ads.interactivemedia.v3.impl.data.ao;
import com.google.ads.interactivemedia.v3.impl.data.ap;
import com.google.ads.interactivemedia.v3.impl.data.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class afl
  implements VideoStreamPlayer.VideoStreamPlayerCallback, afh, afn
{
  private VideoStreamPlayer a;
  private afc b;
  private final afj c;
  private boolean d = false;
  private aff e;
  private afp f;
  private final String g;
  private String h;
  private boolean i = false;
  
  public afl(String paramString1, afb paramafb, afc paramafc, afj paramafj, StreamDisplayContainer paramStreamDisplayContainer, String paramString2, Context paramContext)
    throws AdError
  {
    this(paramString1, paramafb, paramafc, paramafj, paramStreamDisplayContainer, paramString2, null, null);
  }
  
  private afl(String paramString1, afb paramafb, afc paramafc, afj paramafj, StreamDisplayContainer paramStreamDisplayContainer, String paramString2, aff paramaff, afp paramafp)
    throws AdError
  {
    paramaff = paramStreamDisplayContainer.getVideoStreamPlayer();
    a = paramaff;
    if (paramaff != null)
    {
      c = paramafj;
      g = paramString1;
      b = paramafc;
      h = paramString2;
      d = false;
      e = null;
      e = new aff(paramaff, paramafb.a());
      f = null;
      f = new afp(paramafc.b(), paramStreamDisplayContainer.getAdContainer());
      return;
    }
    throw new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Server-side ad insertion player was not provided.");
  }
  
  private final void a(aer paramaer, Object paramObject)
  {
    aes localaes;
    if (i) {
      localaes = aes.videoDisplay;
    } else {
      localaes = aes.videoDisplay1;
    }
    b.b(new aeq(localaes, paramaer, g, paramObject));
  }
  
  public final void a()
  {
    e.a(this);
  }
  
  public final void a(long paramLong)
  {
    a.seek(paramLong);
  }
  
  public final void a(VideoProgressUpdate paramVideoProgressUpdate)
  {
    if (!d)
    {
      ap localap = ap.builder().volumePercentage(a.getVolume()).build();
      a(aer.start, localap);
      d = true;
    }
    a(aer.timeupdate, paramVideoProgressUpdate);
  }
  
  public final void a(b paramb)
  {
    if ((afz.a) && (paramb.isLinear()))
    {
      f.c();
      return;
    }
    f.a(paramb);
  }
  
  public final void a(aes paramaes, aer paramaer, ag paramag)
  {
    if (paramaer.ordinal() == 37)
    {
      if ((paramag != null) && (streamUrl != null))
      {
        d = false;
        e.a();
        paramaer = streamUrl;
        paramaes = paramaer;
        if (paramaer != null)
        {
          Object localObject = h;
          paramaes = paramaer;
          if (localObject != null) {
            if (((String)localObject).length() == 0)
            {
              paramaes = paramaer;
            }
            else
            {
              localObject = h.trim().replaceAll("\\s+", "");
              paramaes = (aes)localObject;
              if (((String)localObject).charAt(0) == '?') {
                paramaes = ((String)localObject).substring(1);
              }
              if (paramaes.length() == 0)
              {
                paramaes = paramaer;
              }
              else
              {
                Map localMap = rp.a(Uri.parse(paramaer));
                localObject = new HashMap();
                paramaer = Uri.parse(paramaer).buildUpon();
                paramaer.clearQuery();
                if (paramaes.length() != 0) {
                  paramaes = "http://www.dom.com/path?".concat(paramaes);
                } else {
                  paramaes = new String("http://www.dom.com/path?");
                }
                paramaes = rp.a(Uri.parse(paramaes));
                ((HashMap)localObject).putAll(paramaes);
                if (!localMap.isEmpty())
                {
                  Iterator localIterator = localMap.keySet().iterator();
                  while (localIterator.hasNext())
                  {
                    String str = (String)localIterator.next();
                    if (!paramaes.containsKey(str)) {
                      ((HashMap)localObject).put(str, (String)localMap.get(str));
                    }
                  }
                }
                paramaer.encodedQuery(rp.a((Map)localObject));
                paramaes = paramaer.build().toString();
              }
            }
          }
        }
        a.loadUrl(paramaes, subtitles);
        return;
      }
      c.a(new adi(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
    }
  }
  
  public final void b()
  {
    Log.d("SDK_DEBUG", "Destroying StreamVideoDisplay");
    a.removeCallback(this);
    a = null;
    b = null;
    aff localaff = e;
    if (localaff != null)
    {
      localaff.b();
      e.b(this);
    }
    e = null;
    if (afz.a) {
      f.d();
    } else {
      f.b();
    }
    f = null;
  }
  
  public final void c()
  {
    a.onAdBreakStarted();
  }
  
  public final void d()
  {
    a.onAdBreakEnded();
    i();
  }
  
  public final void e()
  {
    i = true;
  }
  
  public final void f()
  {
    a.onAdPeriodStarted();
  }
  
  public final void g()
  {
    a.onAdPeriodEnded();
  }
  
  public final VideoProgressUpdate getAdProgress()
  {
    return a.getContentProgress();
  }
  
  public final void h()
  {
    a.addCallback(this);
  }
  
  public final void i()
  {
    if (afz.a)
    {
      f.d();
      return;
    }
    f.a();
  }
  
  public final void onAdError(AdErrorEvent paramAdErrorEvent) {}
  
  public final void onUserTextReceived(String paramString)
  {
    a(aer.timedMetadata, afo.create(paramString));
  }
  
  public final void onVolumeChanged(int paramInt)
  {
    ap localap = ap.builder().volumePercentage(paramInt).build();
    a(aer.volumeChange, localap);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */