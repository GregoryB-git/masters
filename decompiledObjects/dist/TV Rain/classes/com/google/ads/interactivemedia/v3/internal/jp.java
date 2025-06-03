package com.google.ads.interactivemedia.v3.internal;

import a;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;
import android.util.Pair;
import z2;

public final class jp
{
  public final String a;
  public final String b;
  public final String c;
  public final boolean d;
  public final boolean e;
  private final MediaCodecInfo.CodecCapabilities f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  
  private jp(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    a = ((String)rp.a(paramString1));
    b = paramString2;
    c = paramString3;
    f = paramCodecCapabilities;
    e = paramBoolean1;
    paramBoolean2 = true;
    int j;
    if ((!paramBoolean5) && (paramCodecCapabilities != null))
    {
      if ((wl.a >= 19) && (paramCodecCapabilities.isFeatureSupported("adaptive-playback"))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        paramBoolean1 = true;
        break label91;
      }
    }
    paramBoolean1 = false;
    label91:
    g = paramBoolean1;
    if (paramCodecCapabilities != null)
    {
      if ((wl.a >= 21) && (paramCodecCapabilities.isFeatureSupported("tunneled-playback"))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        paramBoolean1 = true;
        break label143;
      }
    }
    paramBoolean1 = false;
    label143:
    h = paramBoolean1;
    paramBoolean1 = paramBoolean2;
    if (!paramBoolean6)
    {
      if (paramCodecCapabilities != null)
      {
        if ((wl.a >= 21) && (paramCodecCapabilities.isFeatureSupported("secure-playback"))) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0)
        {
          paramBoolean1 = paramBoolean2;
          break label205;
        }
      }
      paramBoolean1 = false;
    }
    label205:
    d = paramBoolean1;
    i = vs.b(paramString2);
  }
  
  public static jp a(String paramString)
  {
    return new jp(paramString, null, null, null, true, false, true, false, false, false);
  }
  
  public static jp a(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    return new jp(paramString1, paramString2, paramString3, paramCodecCapabilities, false, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5);
  }
  
  @TargetApi(21)
  private static boolean a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    if ((paramDouble != -1.0D) && (paramDouble > 0.0D)) {
      return paramVideoCapabilities.areSizeAndRateSupported(paramInt1, paramInt2, Math.floor(paramDouble));
    }
    return paramVideoCapabilities.isSizeSupported(paramInt1, paramInt2);
  }
  
  private final void b(String paramString)
  {
    String str1 = a;
    String str2 = b;
    String str3 = wl.e;
    paramString = a.q(a.b(str3, a.b(str2, a.b(str1, a.b(paramString, 20)))), "NoSupport [", paramString, "] [", str1);
    a.C(paramString, ", ", str2, "] [", str3);
    paramString.append("]");
    Log.d("MediaCodecInfo", paramString.toString());
  }
  
  @TargetApi(21)
  public final Point a(int paramInt1, int paramInt2)
  {
    Object localObject = f;
    if (localObject == null)
    {
      b("align.caps");
      return null;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null)
    {
      b("align.vCaps");
      return null;
    }
    int j = ((MediaCodecInfo.VideoCapabilities)localObject).getWidthAlignment();
    int k = ((MediaCodecInfo.VideoCapabilities)localObject).getHeightAlignment();
    return new Point(wl.a(paramInt1, j) * j, wl.a(paramInt2, k) * k);
  }
  
  @TargetApi(21)
  public final boolean a(int paramInt1, int paramInt2, double paramDouble)
  {
    Object localObject1 = f;
    if (localObject1 == null)
    {
      b("sizeAndRate.caps");
      return false;
    }
    localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getVideoCapabilities();
    if (localObject1 == null)
    {
      b("sizeAndRate.vCaps");
      return false;
    }
    if (!a((MediaCodecInfo.VideoCapabilities)localObject1, paramInt1, paramInt2, paramDouble)) {
      if ((paramInt1 < paramInt2) && (a((MediaCodecInfo.VideoCapabilities)localObject1, paramInt2, paramInt1, paramDouble)))
      {
        localObject1 = new StringBuilder(69);
        ((StringBuilder)localObject1).append("sizeAndRate.rotated, ");
        ((StringBuilder)localObject1).append(paramInt1);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(paramInt2);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(paramDouble);
        Object localObject2 = ((StringBuilder)localObject1).toString();
        String str1 = a;
        String str2 = b;
        localObject1 = wl.e;
        localObject2 = a.q(a.b((String)localObject1, a.b(str2, a.b(str1, a.b((String)localObject2, 25)))), "AssumedSupport [", (String)localObject2, "] [", str1);
        a.C((StringBuilder)localObject2, ", ", str2, "] [", (String)localObject1);
        ((StringBuilder)localObject2).append("]");
        Log.d("MediaCodecInfo", ((StringBuilder)localObject2).toString());
      }
      else
      {
        localObject1 = new StringBuilder(69);
        ((StringBuilder)localObject1).append("sizeAndRate.support, ");
        ((StringBuilder)localObject1).append(paramInt1);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(paramInt2);
        ((StringBuilder)localObject1).append("x");
        ((StringBuilder)localObject1).append(paramDouble);
        b(((StringBuilder)localObject1).toString());
        return false;
      }
    }
    return true;
  }
  
  public final boolean a(bw parambw)
    throws ka
  {
    Object localObject1 = f;
    boolean bool = false;
    Object localObject3;
    int k;
    if ((localObject1 != null) && (b != null))
    {
      localObject1 = vs.f((String)localObject1);
      if (localObject1 != null)
      {
        Object localObject2;
        if (!b.equals(localObject1))
        {
          localObject2 = f;
          j = a.b((String)localObject2, 13);
          localObject3 = new StringBuilder(((String)localObject1).length() + j);
          ((StringBuilder)localObject3).append("codec.mime ");
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append(", ");
          ((StringBuilder)localObject3).append((String)localObject1);
          b(((StringBuilder)localObject3).toString());
        }
        else
        {
          localObject3 = jv.a(parambw);
          if (localObject3 == null) {
            break label309;
          }
          k = ((Integer)first).intValue();
          m = ((Integer)second).intValue();
          if ((!i) && (k != 42)) {
            break label309;
          }
          for (localObject3 : a()) {
            if ((profile == k) && (level >= m)) {
              break label309;
            }
          }
          localObject2 = f;
          j = a.b((String)localObject2, 22);
          localObject3 = new StringBuilder(((String)localObject1).length() + j);
          ((StringBuilder)localObject3).append("codec.profileLevel, ");
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append(", ");
          ((StringBuilder)localObject3).append((String)localObject1);
          b(((StringBuilder)localObject3).toString());
        }
        j = 0;
        break label312;
      }
    }
    label309:
    int j = 1;
    label312:
    if (j == 0) {
      return false;
    }
    if (i)
    {
      k = n;
      if (k > 0)
      {
        j = o;
        if (j > 0)
        {
          if (wl.a >= 21) {
            return a(k, j, p);
          }
          if (k * j <= jv.b()) {
            bool = true;
          }
          if (!bool)
          {
            k = n;
            j = o;
            parambw = new StringBuilder(40);
            parambw.append("legacyFrameSize, ");
            parambw.append(k);
            parambw.append("x");
            parambw.append(j);
            b(parambw.toString());
          }
          return bool;
        }
      }
      return true;
    }
    int m = wl.a;
    if (m >= 21)
    {
      j = u;
      if (j != -1)
      {
        localObject1 = f;
        if (localObject1 == null)
        {
          b("sampleRate.caps");
        }
        else
        {
          localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getAudioCapabilities();
          if (localObject1 == null)
          {
            b("sampleRate.aCaps");
          }
          else
          {
            if (((MediaCodecInfo.AudioCapabilities)localObject1).isSampleRateSupported(j)) {
              break label543;
            }
            b(z2.k(31, "sampleRate.support, ", j));
          }
        }
        j = 0;
        break label546;
        label543:
        j = 1;
        label546:
        if (j == 0) {}
      }
      else
      {
        ??? = t;
        if (??? == -1) {
          break label959;
        }
        parambw = f;
        if (parambw == null)
        {
          b("channelCount.caps");
        }
        else
        {
          localObject3 = parambw.getAudioCapabilities();
          if (localObject3 == null)
          {
            b("channelCount.aCaps");
          }
          else
          {
            parambw = a;
            localObject1 = b;
            k = ((MediaCodecInfo.AudioCapabilities)localObject3).getMaxInputChannelCount();
            j = k;
            if (k <= 1) {
              if ((m >= 26) && (k > 0))
              {
                j = k;
              }
              else
              {
                j = k;
                if (!"audio/mpeg".equals(localObject1))
                {
                  j = k;
                  if (!"audio/3gpp".equals(localObject1))
                  {
                    j = k;
                    if (!"audio/amr-wb".equals(localObject1))
                    {
                      j = k;
                      if (!"audio/mp4a-latm".equals(localObject1))
                      {
                        j = k;
                        if (!"audio/vorbis".equals(localObject1))
                        {
                          j = k;
                          if (!"audio/opus".equals(localObject1))
                          {
                            j = k;
                            if (!"audio/raw".equals(localObject1))
                            {
                              j = k;
                              if (!"audio/flac".equals(localObject1))
                              {
                                j = k;
                                if (!"audio/g711-alaw".equals(localObject1))
                                {
                                  j = k;
                                  if (!"audio/g711-mlaw".equals(localObject1)) {
                                    if ("audio/gsm".equals(localObject1))
                                    {
                                      j = k;
                                    }
                                    else
                                    {
                                      if ("audio/ac3".equals(localObject1)) {
                                        j = 6;
                                      } else if ("audio/eac3".equals(localObject1)) {
                                        j = 16;
                                      } else {
                                        j = 30;
                                      }
                                      localObject1 = new StringBuilder(a.b(parambw, 59));
                                      ((StringBuilder)localObject1).append("AssumedMaxChannelAdjustment: ");
                                      ((StringBuilder)localObject1).append(parambw);
                                      ((StringBuilder)localObject1).append(", [");
                                      ((StringBuilder)localObject1).append(k);
                                      ((StringBuilder)localObject1).append(" to ");
                                      ((StringBuilder)localObject1).append(j);
                                      ((StringBuilder)localObject1).append("]");
                                      Log.w("MediaCodecInfo", ((StringBuilder)localObject1).toString());
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
            }
            if (j >= ???) {
              break label946;
            }
            b(z2.k(33, "channelCount.support, ", ???));
          }
        }
        j = 0;
        break label949;
        label946:
        j = 1;
        label949:
        if (j != 0) {
          break label959;
        }
      }
      return false;
    }
    label959:
    return true;
  }
  
  public final boolean a(bw parambw1, bw parambw2, boolean paramBoolean)
  {
    if (i) {
      return (i.equals(i)) && (q == q) && ((g) || ((n == n) && (o == o))) && (((!paramBoolean) && (s == null)) || (wl.a(s, s)));
    }
    if (("audio/mp4a-latm".equals(b)) && (i.equals(i)) && (t == t) && (u == u))
    {
      parambw1 = jv.a(parambw1);
      parambw2 = jv.a(parambw2);
      if ((parambw1 != null) && (parambw2 != null))
      {
        int j = ((Integer)first).intValue();
        int k = ((Integer)first).intValue();
        if ((j == 42) && (k == 42)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final MediaCodecInfo.CodecProfileLevel[] a()
  {
    Object localObject = f;
    if (localObject != null)
    {
      localObject = profileLevels;
      if (localObject != null) {
        return (MediaCodecInfo.CodecProfileLevel[])localObject;
      }
    }
    return new MediaCodecInfo.CodecProfileLevel[0];
  }
  
  public final boolean b(bw parambw)
  {
    if (i) {
      return g;
    }
    parambw = jv.a(parambw);
    return (parambw != null) && (((Integer)first).intValue() == 42);
  }
  
  public final String toString()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */