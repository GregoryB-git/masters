package t0;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import android.util.Range;
import d0.h;
import d0.q;
import d0.z;
import g0.M;
import g0.a;
import g0.o;

public final class p
{
  public final String a;
  public final String b;
  public final String c;
  public final MediaCodecInfo.CodecCapabilities d;
  public final boolean e;
  public final boolean f;
  public final boolean g;
  public final boolean h;
  public final boolean i;
  public final boolean j;
  public final boolean k;
  
  public p(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6)
  {
    a = ((String)a.e(paramString1));
    b = paramString2;
    c = paramString3;
    d = paramCodecCapabilities;
    h = paramBoolean1;
    i = paramBoolean2;
    j = paramBoolean3;
    e = paramBoolean4;
    f = paramBoolean5;
    g = paramBoolean6;
    k = z.s(paramString2);
  }
  
  public static boolean A(String paramString, int paramInt)
  {
    if (("video/hevc".equals(paramString)) && (2 == paramInt))
    {
      paramString = M.b;
      if (("sailfish".equals(paramString)) || ("marlin".equals(paramString))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public static boolean B(String paramString)
  {
    return (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(paramString)) || (!"mcv5a".equals(M.b));
  }
  
  public static p C(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    if ((!paramBoolean4) && (paramCodecCapabilities != null) && (h(paramCodecCapabilities)) && (!z(paramString1))) {
      paramBoolean4 = true;
    } else {
      paramBoolean4 = false;
    }
    boolean bool;
    if ((paramCodecCapabilities != null) && (s(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!paramBoolean5) && ((paramCodecCapabilities == null) || (!q(paramCodecCapabilities)))) {
      paramBoolean5 = false;
    } else {
      paramBoolean5 = true;
    }
    return new p(paramString1, paramString2, paramString3, paramCodecCapabilities, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, bool, paramBoolean5);
  }
  
  public static int a(String paramString1, String paramString2, int paramInt)
  {
    if ((paramInt <= 1) && ((M.a < 26) || (paramInt <= 0)) && (!"audio/mpeg".equals(paramString2)) && (!"audio/3gpp".equals(paramString2)) && (!"audio/amr-wb".equals(paramString2)) && (!"audio/mp4a-latm".equals(paramString2)) && (!"audio/vorbis".equals(paramString2)) && (!"audio/opus".equals(paramString2)) && (!"audio/raw".equals(paramString2)) && (!"audio/flac".equals(paramString2)) && (!"audio/g711-alaw".equals(paramString2)) && (!"audio/g711-mlaw".equals(paramString2)) && (!"audio/gsm".equals(paramString2)))
    {
      int m;
      if ("audio/ac3".equals(paramString2)) {
        m = 6;
      } else if ("audio/eac3".equals(paramString2)) {
        m = 16;
      } else {
        m = 30;
      }
      paramString2 = new StringBuilder();
      paramString2.append("AssumedMaxChannelAdjustment: ");
      paramString2.append(paramString1);
      paramString2.append(", [");
      paramString2.append(paramInt);
      paramString2.append(" to ");
      paramString2.append(m);
      paramString2.append("]");
      o.h("MediaCodecInfo", paramString2.toString());
      return m;
    }
    return paramInt;
  }
  
  public static Point c(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2)
  {
    int m = paramVideoCapabilities.getWidthAlignment();
    int n = paramVideoCapabilities.getHeightAlignment();
    return new Point(M.k(paramInt1, m) * m, M.k(paramInt2, n) * n);
  }
  
  public static boolean d(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    Point localPoint = c(paramVideoCapabilities, paramInt1, paramInt2);
    paramInt1 = x;
    paramInt2 = y;
    if ((paramDouble != -1.0D) && (paramDouble >= 1.0D)) {
      return paramVideoCapabilities.areSizeAndRateSupported(paramInt1, paramInt2, Math.floor(paramDouble));
    }
    return paramVideoCapabilities.isSizeSupported(paramInt1, paramInt2);
  }
  
  public static MediaCodecInfo.CodecProfileLevel[] f(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    if (paramCodecCapabilities != null)
    {
      paramCodecCapabilities = paramCodecCapabilities.getVideoCapabilities();
      if (paramCodecCapabilities != null)
      {
        m = ((Integer)paramCodecCapabilities.getBitrateRange().getUpper()).intValue();
        break label32;
      }
    }
    int m = 0;
    label32:
    if (m >= 180000000) {
      m = 1024;
    } else if (m >= 120000000) {
      m = 512;
    } else if (m >= 60000000) {
      m = 256;
    } else if (m >= 30000000) {
      m = 128;
    } else if (m >= 18000000) {
      m = 64;
    } else if (m >= 12000000) {
      m = 32;
    } else if (m >= 7200000) {
      m = 16;
    } else if (m >= 3600000) {
      m = 8;
    } else if (m >= 1800000) {
      m = 4;
    } else if (m >= 800000) {
      m = 2;
    } else {
      m = 1;
    }
    paramCodecCapabilities = new MediaCodecInfo.CodecProfileLevel();
    profile = 1;
    level = m;
    return new MediaCodecInfo.CodecProfileLevel[] { paramCodecCapabilities };
  }
  
  public static boolean h(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("adaptive-playback");
  }
  
  public static boolean q(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if ((M.a >= 21) && (r(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean r(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("secure-playback");
  }
  
  public static boolean s(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if ((M.a >= 21) && (t(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean t(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("tunneled-playback");
  }
  
  public static boolean x(String paramString)
  {
    return "audio/opus".equals(paramString);
  }
  
  public static boolean y(String paramString)
  {
    boolean bool;
    if ((M.d.startsWith("SM-T230")) && ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean z(String paramString)
  {
    if (M.a <= 22)
    {
      String str = M.d;
      if ((("ODROID-XU3".equals(str)) || ("Nexus 10".equals(str))) && (("OMX.Exynos.AVC.Decoder".equals(paramString)) || ("OMX.Exynos.AVC.Decoder.secure".equals(paramString)))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public Point b(int paramInt1, int paramInt2)
  {
    Object localObject = d;
    if (localObject == null) {
      return null;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null) {
      return null;
    }
    return c((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2);
  }
  
  public k0.p e(q paramq1, q paramq2)
  {
    int m;
    if (!M.c(n, n)) {
      m = 8;
    } else {
      m = 0;
    }
    int n;
    int i1;
    Object localObject;
    if (k)
    {
      n = m;
      if (w != w) {
        n = m | 0x400;
      }
      i1 = n;
      if (!e) {
        if (t == t)
        {
          i1 = n;
          if (u == u) {}
        }
        else
        {
          i1 = n | 0x200;
        }
      }
      if (h.h(A))
      {
        m = i1;
        if (h.h(A)) {}
      }
      else
      {
        m = i1;
        if (!M.c(A, A)) {
          m = i1 | 0x800;
        }
      }
      n = m;
      if (y(a))
      {
        n = m;
        if (!paramq1.e(paramq2)) {
          n = m | 0x2;
        }
      }
      i1 = n;
      if (n == 0)
      {
        localObject = a;
        if (paramq1.e(paramq2)) {}
        for (m = 3;; m = 2) {
          break;
        }
        return new k0.p((String)localObject, paramq1, paramq2, m, 0);
      }
    }
    for (;;)
    {
      break;
      i1 = m;
      if (B != B) {
        i1 = m | 0x1000;
      }
      n = i1;
      if (C != C) {
        n = i1 | 0x2000;
      }
      m = n;
      if (D != D) {
        m = n | 0x4000;
      }
      if ((m == 0) && ("audio/mp4a-latm".equals(b)))
      {
        localObject = I.r(paramq1);
        Pair localPair = I.r(paramq2);
        if ((localObject != null) && (localPair != null))
        {
          n = ((Integer)first).intValue();
          i1 = ((Integer)first).intValue();
          if ((n == 42) && (i1 == 42)) {
            return new k0.p(a, paramq1, paramq2, 3, 0);
          }
        }
      }
      n = m;
      if (!paramq1.e(paramq2)) {
        n = m | 0x20;
      }
      m = n;
      if (x(b)) {
        m = n | 0x2;
      }
      i1 = m;
      if (m == 0) {
        return new k0.p(a, paramq1, paramq2, 1, 0);
      }
    }
    return new k0.p(a, paramq1, paramq2, 0, i1);
  }
  
  public MediaCodecInfo.CodecProfileLevel[] g()
  {
    Object localObject = d;
    if (localObject != null)
    {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = profileLevels;
      localObject = arrayOfCodecProfileLevel;
      if (arrayOfCodecProfileLevel != null) {}
    }
    else
    {
      localObject = new MediaCodecInfo.CodecProfileLevel[0];
    }
    return (MediaCodecInfo.CodecProfileLevel[])localObject;
  }
  
  public boolean i(int paramInt)
  {
    Object localObject = d;
    if (localObject == null) {
      localObject = "channelCount.caps";
    }
    for (;;)
    {
      w((String)localObject);
      return false;
      localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
      if (localObject == null)
      {
        localObject = "channelCount.aCaps";
      }
      else
      {
        if (a(a, b, ((MediaCodecInfo.AudioCapabilities)localObject).getMaxInputChannelCount()) >= paramInt) {
          break;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("channelCount.support, ");
        ((StringBuilder)localObject).append(paramInt);
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    return true;
  }
  
  public boolean j(int paramInt)
  {
    Object localObject = d;
    if (localObject == null) {
      localObject = "sampleRate.caps";
    }
    for (;;)
    {
      w((String)localObject);
      return false;
      localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
      if (localObject == null)
      {
        localObject = "sampleRate.aCaps";
      }
      else
      {
        if (((MediaCodecInfo.AudioCapabilities)localObject).isSampleRateSupported(paramInt)) {
          break;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sampleRate.support, ");
        ((StringBuilder)localObject).append(paramInt);
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    return true;
  }
  
  public final boolean k(q paramq, boolean paramBoolean)
  {
    Object localObject = I.r(paramq);
    if (localObject == null) {
      return true;
    }
    int m = ((Integer)first).intValue();
    int n = ((Integer)second).intValue();
    int i1 = n;
    int i2 = m;
    if ("video/dolby-vision".equals(n))
    {
      if ("video/avc".equals(b)) {}
      for (i2 = 8;; i2 = 2)
      {
        i1 = 0;
        break;
        i1 = n;
        i2 = m;
        if (!"video/hevc".equals(b)) {
          break;
        }
      }
    }
    if ((!k) && (i2 != 42)) {
      return true;
    }
    MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = g();
    localObject = arrayOfCodecProfileLevel;
    if (M.a <= 23)
    {
      localObject = arrayOfCodecProfileLevel;
      if ("video/x-vnd.on2.vp9".equals(b))
      {
        localObject = arrayOfCodecProfileLevel;
        if (arrayOfCodecProfileLevel.length != 0) {}
      }
    }
    for (arrayOfCodecProfileLevel : f(d)) {
      if ((profile == i2) && ((level >= i1) || (!paramBoolean)) && (!A(b, i2))) {
        return true;
      }
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("codec.profileLevel, ");
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(", ");
    ((StringBuilder)localObject).append(c);
    w(((StringBuilder)localObject).toString());
    return false;
  }
  
  public boolean l(q paramq)
  {
    boolean bool1 = o(paramq);
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      bool3 = bool2;
      if (k(paramq, false)) {
        bool3 = true;
      }
    }
    return bool3;
  }
  
  public boolean m(q paramq)
  {
    boolean bool1 = o(paramq);
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      return false;
    }
    if (!k(paramq, true)) {
      return false;
    }
    int n;
    if (k)
    {
      int m = t;
      if (m > 0)
      {
        n = u;
        if (n > 0)
        {
          if (M.a >= 21) {
            return u(m, n, v);
          }
          if (m * n <= I.P()) {
            bool3 = true;
          }
          if (!bool3)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("legacyFrameSize, ");
            localStringBuilder.append(t);
            localStringBuilder.append("x");
            localStringBuilder.append(u);
            w(localStringBuilder.toString());
          }
          return bool3;
        }
      }
      return true;
    }
    if (M.a >= 21)
    {
      n = C;
      if (n != -1)
      {
        bool3 = bool2;
        if (!j(n)) {
          break label221;
        }
      }
      n = B;
      if (n != -1)
      {
        bool3 = bool2;
        if (!i(n)) {
          break label221;
        }
      }
    }
    bool3 = true;
    label221:
    return bool3;
  }
  
  public boolean n()
  {
    if ((M.a >= 29) && ("video/x-vnd.on2.vp9".equals(b)))
    {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = g();
      int m = arrayOfCodecProfileLevel.length;
      for (int n = 0; n < m; n++) {
        if (profile == 16384) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean o(q paramq)
  {
    boolean bool;
    if ((!b.equals(n)) && (!b.equals(I.m(paramq)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean p(q paramq)
  {
    if (k) {
      return e;
    }
    paramq = I.r(paramq);
    boolean bool;
    if ((paramq != null) && (((Integer)first).intValue() == 42)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    return a;
  }
  
  public boolean u(int paramInt1, int paramInt2, double paramDouble)
  {
    Object localObject = d;
    if (localObject == null) {}
    for (localObject = "sizeAndRate.caps";; localObject = "sizeAndRate.vCaps")
    {
      w((String)localObject);
      return false;
      localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
      if (localObject != null) {
        break;
      }
    }
    if (M.a >= 29)
    {
      int m = v.c((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble);
      if (m == 2) {
        return true;
      }
      if (m == 1) {
        localObject = new StringBuilder();
      }
    }
    for (String str = "sizeAndRate.cover, ";; str = "sizeAndRate.support, ")
    {
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(paramInt2);
      ((StringBuilder)localObject).append("@");
      ((StringBuilder)localObject).append(paramDouble);
      localObject = ((StringBuilder)localObject).toString();
      break;
      if (d((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble)) {
        break label273;
      }
      if ((paramInt1 < paramInt2) && (B(a)) && (d((MediaCodecInfo.VideoCapabilities)localObject, paramInt2, paramInt1, paramDouble)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.rotated, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("@");
        ((StringBuilder)localObject).append(paramDouble);
        v(((StringBuilder)localObject).toString());
        break label273;
      }
      localObject = new StringBuilder();
    }
    label273:
    return true;
  }
  
  public final void v(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AssumedSupport [");
    localStringBuilder.append(paramString);
    localStringBuilder.append("] [");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append("] [");
    localStringBuilder.append(M.e);
    localStringBuilder.append("]");
    o.b("MediaCodecInfo", localStringBuilder.toString());
  }
  
  public final void w(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NoSupport [");
    localStringBuilder.append(paramString);
    localStringBuilder.append("] [");
    localStringBuilder.append(a);
    localStringBuilder.append(", ");
    localStringBuilder.append(b);
    localStringBuilder.append("] [");
    localStringBuilder.append(M.e);
    localStringBuilder.append("]");
    o.b("MediaCodecInfo", localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     t0.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */