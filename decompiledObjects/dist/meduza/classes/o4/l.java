package o4;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import android.util.Pair;
import android.util.Range;
import f;
import java.util.List;
import v3.i0;
import v5.e0;
import v5.m;
import z3.i;

public final class l
{
  public final String a;
  public final String b;
  public final String c;
  public final MediaCodecInfo.CodecCapabilities d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  
  public l(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    paramString1.getClass();
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramCodecCapabilities;
    g = paramBoolean1;
    e = paramBoolean2;
    f = paramBoolean3;
    h = v5.p.m(paramString2);
  }
  
  public static boolean a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    int i = paramVideoCapabilities.getWidthAlignment();
    int j = paramVideoCapabilities.getHeightAlignment();
    int k = e0.a;
    Point localPoint = new Point((paramInt1 + i - 1) / i * i, (paramInt2 + j - 1) / j * j);
    paramInt2 = x;
    paramInt1 = y;
    if ((paramDouble != -1.0D) && (paramDouble >= 1.0D)) {
      return paramVideoCapabilities.areSizeAndRateSupported(paramInt2, paramInt1, Math.floor(paramDouble));
    }
    return paramVideoCapabilities.isSizeSupported(paramInt2, paramInt1);
  }
  
  public static l h(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    int j;
    if (paramCodecCapabilities != null)
    {
      int i = e0.a;
      if ((i >= 19) && (paramCodecCapabilities.isFeatureSupported("adaptive-playback"))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        if (i <= 22)
        {
          String str = e0.d;
          if ((("ODROID-XU3".equals(str)) || ("Nexus 10".equals(str))) && (("OMX.Exynos.AVC.Decoder".equals(paramString1)) || ("OMX.Exynos.AVC.Decoder.secure".equals(paramString1))))
          {
            j = 1;
            break label98;
          }
        }
        j = 0;
        label98:
        if (j == 0)
        {
          paramBoolean2 = true;
          break label112;
        }
      }
    }
    paramBoolean2 = false;
    label112:
    if (((paramCodecCapabilities == null) || (e0.a < 21) || (paramCodecCapabilities.isFeatureSupported("tunneled-playback"))) || (!paramBoolean4)) {
      if (paramCodecCapabilities != null)
      {
        if ((e0.a >= 21) && (paramCodecCapabilities.isFeatureSupported("secure-playback"))) {
          j = 1;
        } else {
          j = 0;
        }
        if (j != 0) {}
      }
      else
      {
        paramBoolean3 = false;
        break label188;
      }
    }
    paramBoolean3 = true;
    label188:
    return new l(paramString1, paramString2, paramString3, paramCodecCapabilities, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public final i b(i0 parami01, i0 parami02)
  {
    boolean bool = e0.a(t, t);
    int i = 0;
    int j;
    if (!bool) {
      j = 8;
    } else {
      j = 0;
    }
    int k;
    int m;
    Object localObject;
    if (h)
    {
      k = j;
      if (B != B) {
        k = j | 0x400;
      }
      m = k;
      if (!e) {
        if (y == y)
        {
          m = k;
          if (z == z) {}
        }
        else
        {
          m = k | 0x200;
        }
      }
      j = m;
      if (!e0.a(F, F)) {
        j = m | 0x800;
      }
      localObject = a;
      k = i;
      if (e0.d.startsWith("SM-T230"))
      {
        k = i;
        if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(localObject)) {
          k = 1;
        }
      }
      m = j;
      if (k != 0)
      {
        m = j;
        if (!parami01.c(parami02)) {
          m = j | 0x2;
        }
      }
      k = m;
      if (m == 0)
      {
        localObject = a;
        if (parami01.c(parami02)) {
          j = 3;
        } else {
          j = 2;
        }
        return new i((String)localObject, parami01, parami02, j, 0);
      }
    }
    for (;;)
    {
      break;
      m = j;
      if (G != G) {
        m = j | 0x1000;
      }
      k = m;
      if (H != H) {
        k = m | 0x2000;
      }
      j = k;
      if (I != I) {
        j = k | 0x4000;
      }
      if ((j == 0) && ("audio/mp4a-latm".equals(b)))
      {
        localObject = p.d(parami01);
        Pair localPair = p.d(parami02);
        if ((localObject != null) && (localPair != null))
        {
          m = ((Integer)first).intValue();
          k = ((Integer)first).intValue();
          if ((m == 42) && (k == 42)) {
            return new i(a, parami01, parami02, 3, 0);
          }
        }
      }
      m = j;
      if (!parami01.c(parami02)) {
        m = j | 0x20;
      }
      j = m;
      if ("audio/opus".equals(b)) {
        j = m | 0x2;
      }
      k = j;
      if (j == 0) {
        return new i(a, parami01, parami02, 1, 0);
      }
    }
    return new i(a, parami01, parami02, 0, k);
  }
  
  public final boolean c(i0 parami0, boolean paramBoolean)
  {
    Object localObject1 = p.d(parami0);
    if (localObject1 == null) {
      return true;
    }
    int i = ((Integer)first).intValue();
    int j = ((Integer)second).intValue();
    boolean bool = "video/dolby-vision".equals(t);
    int k = 8;
    int m = j;
    int n = i;
    if (bool)
    {
      if ("video/avc".equals(b))
      {
        i = 8;
      }
      else
      {
        m = j;
        n = i;
        if (!"video/hevc".equals(b)) {
          break label112;
        }
        i = 2;
      }
      m = 0;
      n = i;
    }
    label112:
    if ((!h) && (n != 42)) {
      return true;
    }
    localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = profileLevels;
      localObject1 = localObject2;
      if (localObject2 != null) {}
    }
    else
    {
      localObject1 = new MediaCodecInfo.CodecProfileLevel[0];
    }
    Object localObject2 = localObject1;
    if (e0.a <= 23)
    {
      localObject2 = localObject1;
      if ("video/x-vnd.on2.vp9".equals(b))
      {
        localObject2 = localObject1;
        if (localObject1.length == 0)
        {
          localObject1 = d;
          if (localObject1 != null)
          {
            localObject1 = ((MediaCodecInfo.CodecCapabilities)localObject1).getVideoCapabilities();
            if (localObject1 != null)
            {
              i = ((Integer)((MediaCodecInfo.VideoCapabilities)localObject1).getBitrateRange().getUpper()).intValue();
              break label229;
            }
          }
          i = 0;
          label229:
          if (i >= 180000000) {
            i = 1024;
          } else if (i >= 120000000) {
            i = 512;
          } else if (i >= 60000000) {
            i = 256;
          } else if (i >= 30000000) {
            i = 128;
          } else if (i >= 18000000) {
            i = 64;
          } else if (i >= 12000000) {
            i = 32;
          } else if (i >= 7200000) {
            i = 16;
          } else if (i >= 3600000) {
            i = k;
          } else if (i >= 1800000) {
            i = 4;
          } else if (i >= 800000) {
            i = 2;
          } else {
            i = 1;
          }
          localObject1 = new MediaCodecInfo.CodecProfileLevel();
          profile = 1;
          level = i;
        }
      }
    }
    label495:
    for (localObject1 : new MediaCodecInfo.CodecProfileLevel[] { localObject1 }) {
      if ((profile == n) && ((level >= m) || (!paramBoolean)))
      {
        if (("video/hevc".equals(b)) && (2 == n))
        {
          localObject1 = e0.b;
          if (("sailfish".equals(localObject1)) || ("marlin".equals(localObject1)))
          {
            k = 1;
            break label495;
          }
        }
        k = 0;
        if (k == 0) {
          return true;
        }
      }
    }
    localObject1 = f.l("codec.profileLevel, ");
    ((StringBuilder)localObject1).append(q);
    ((StringBuilder)localObject1).append(", ");
    ((StringBuilder)localObject1).append(c);
    g(((StringBuilder)localObject1).toString());
    return false;
  }
  
  public final boolean d(i0 parami0)
  {
    boolean bool1 = b.equals(t);
    boolean bool2 = false;
    boolean bool3 = false;
    int i;
    if ((!bool1) && (!b.equals(p.b(parami0)))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i == 0) {
      return false;
    }
    if (!c(parami0, true)) {
      return false;
    }
    int j;
    Object localObject;
    if (h)
    {
      i = y;
      if (i > 0)
      {
        j = z;
        if (j > 0)
        {
          if (e0.a >= 21) {
            return f(i, j, A);
          }
          if (i * j <= p.i()) {
            bool3 = true;
          }
          if (!bool3)
          {
            localObject = f.l("legacyFrameSize, ");
            ((StringBuilder)localObject).append(y);
            ((StringBuilder)localObject).append("x");
            ((StringBuilder)localObject).append(z);
            g(((StringBuilder)localObject).toString());
          }
          return bool3;
        }
      }
      return true;
    }
    int k = e0.a;
    if (k >= 21)
    {
      i = H;
      if (i != -1)
      {
        localObject = d;
        if (localObject == null)
        {
          localObject = "sampleRate.caps";
        }
        else
        {
          localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
          if (localObject == null)
          {
            localObject = "sampleRate.aCaps";
          }
          else
          {
            if (((MediaCodecInfo.AudioCapabilities)localObject).isSampleRateSupported(i)) {
              break label284;
            }
            localObject = f.h("sampleRate.support, ", i);
          }
        }
        g((String)localObject);
        i = 0;
        break label287;
        label284:
        i = 1;
        label287:
        bool3 = bool2;
        if (i == 0) {
          break label714;
        }
      }
      int m = G;
      if (m != -1)
      {
        parami0 = d;
        if (parami0 == null)
        {
          parami0 = "channelCount.caps";
        }
        else
        {
          MediaCodecInfo.AudioCapabilities localAudioCapabilities = parami0.getAudioCapabilities();
          if (localAudioCapabilities == null)
          {
            parami0 = "channelCount.aCaps";
          }
          else
          {
            parami0 = a;
            localObject = b;
            j = localAudioCapabilities.getMaxInputChannelCount();
            i = j;
            if (j <= 1) {
              if ((k >= 26) && (j > 0))
              {
                i = j;
              }
              else
              {
                i = j;
                if (!"audio/mpeg".equals(localObject))
                {
                  i = j;
                  if (!"audio/3gpp".equals(localObject))
                  {
                    i = j;
                    if (!"audio/amr-wb".equals(localObject))
                    {
                      i = j;
                      if (!"audio/mp4a-latm".equals(localObject))
                      {
                        i = j;
                        if (!"audio/vorbis".equals(localObject))
                        {
                          i = j;
                          if (!"audio/opus".equals(localObject))
                          {
                            i = j;
                            if (!"audio/raw".equals(localObject))
                            {
                              i = j;
                              if (!"audio/flac".equals(localObject))
                              {
                                i = j;
                                if (!"audio/g711-alaw".equals(localObject))
                                {
                                  i = j;
                                  if (!"audio/g711-mlaw".equals(localObject)) {
                                    if ("audio/gsm".equals(localObject))
                                    {
                                      i = j;
                                    }
                                    else
                                    {
                                      if ("audio/ac3".equals(localObject)) {
                                        i = 6;
                                      } else if ("audio/eac3".equals(localObject)) {
                                        i = 16;
                                      } else {
                                        i = 30;
                                      }
                                      localObject = new StringBuilder();
                                      ((StringBuilder)localObject).append("AssumedMaxChannelAdjustment: ");
                                      ((StringBuilder)localObject).append(parami0);
                                      ((StringBuilder)localObject).append(", [");
                                      ((StringBuilder)localObject).append(j);
                                      ((StringBuilder)localObject).append(" to ");
                                      ((StringBuilder)localObject).append(i);
                                      ((StringBuilder)localObject).append("]");
                                      m.f("MediaCodecInfo", ((StringBuilder)localObject).toString());
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
            if (i >= m) {
              break label700;
            }
            parami0 = f.h("channelCount.support, ", m);
          }
        }
        g(parami0);
        i = 0;
        break label703;
        label700:
        i = 1;
        label703:
        bool3 = bool2;
        if (i == 0) {
          break label714;
        }
      }
    }
    bool3 = true;
    label714:
    return bool3;
  }
  
  public final boolean e(i0 parami0)
  {
    if (h) {
      return e;
    }
    parami0 = p.d(parami0);
    boolean bool;
    if ((parami0 != null) && (((Integer)first).intValue() == 42)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f(int paramInt1, int paramInt2, double paramDouble)
  {
    Object localObject = d;
    if (localObject == null)
    {
      localObject = "sizeAndRate.caps";
    }
    else
    {
      localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
      if (localObject == null)
      {
        localObject = "sizeAndRate.vCaps";
      }
      else
      {
        int i;
        if (e0.a >= 29)
        {
          i = a.a((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble);
          if (i == 2) {
            return true;
          }
          if (i == 1)
          {
            localObject = new StringBuilder();
            str = "sizeAndRate.cover, ";
            break label313;
          }
        }
        if (a((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble)) {
          break label375;
        }
        if (paramInt1 < paramInt2)
        {
          if (("OMX.MTK.VIDEO.DECODER.HEVC".equals(a)) && ("mcv5a".equals(e0.b))) {
            i = 0;
          } else {
            i = 1;
          }
          if ((i != 0) && (a((MediaCodecInfo.VideoCapabilities)localObject, paramInt2, paramInt1, paramDouble)))
          {
            localObject = new StringBuilder();
            ((StringBuilder)localObject).append("sizeAndRate.rotated, ");
            ((StringBuilder)localObject).append(paramInt1);
            ((StringBuilder)localObject).append("x");
            ((StringBuilder)localObject).append(paramInt2);
            ((StringBuilder)localObject).append("@");
            ((StringBuilder)localObject).append(paramDouble);
            localObject = f.m("AssumedSupport [", ((StringBuilder)localObject).toString(), "] [");
            ((StringBuilder)localObject).append(a);
            ((StringBuilder)localObject).append(", ");
            ((StringBuilder)localObject).append(b);
            ((StringBuilder)localObject).append("] [");
            ((StringBuilder)localObject).append(e0.e);
            ((StringBuilder)localObject).append("]");
            m.b("MediaCodecInfo", ((StringBuilder)localObject).toString());
            break label375;
          }
        }
        localObject = new StringBuilder();
        String str = "sizeAndRate.support, ";
        label313:
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("@");
        ((StringBuilder)localObject).append(paramDouble);
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    g((String)localObject);
    return false;
    label375:
    return true;
  }
  
  public final void g(String paramString)
  {
    paramString = f.m("NoSupport [", paramString, "] [");
    paramString.append(a);
    paramString.append(", ");
    paramString.append(b);
    paramString.append("] [");
    paramString.append(e0.e);
    paramString.append("]");
    m.b("MediaCodecInfo", paramString.toString());
  }
  
  public final String toString()
  {
    return a;
  }
  
  public static final class a
  {
    public static int a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
    {
      paramVideoCapabilities = paramVideoCapabilities.getSupportedPerformancePoints();
      int i = 0;
      if ((paramVideoCapabilities != null) && (!paramVideoCapabilities.isEmpty()))
      {
        Object localObject = e0.b;
        if ((!((String)localObject).equals("sabrina")) && (!((String)localObject).equals("boreal")))
        {
          localObject = e0.d;
          if ((!((String)localObject).startsWith("Lenovo TB-X605")) && (!((String)localObject).startsWith("Lenovo TB-X606")) && (!((String)localObject).startsWith("Lenovo TB-X616")))
          {
            j = 0;
            break label93;
          }
        }
        int j = 1;
        label93:
        if (j == 0)
        {
          localObject = new MediaCodecInfo.VideoCapabilities.PerformancePoint(paramInt1, paramInt2, (int)paramDouble);
          for (paramInt1 = i; paramInt1 < paramVideoCapabilities.size(); paramInt1++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint)paramVideoCapabilities.get(paramInt1)).covers((MediaCodecInfo.VideoCapabilities.PerformancePoint)localObject)) {
              return 2;
            }
          }
          return 1;
        }
      }
      return 0;
    }
  }
}

/* Location:
 * Qualified Name:     o4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */