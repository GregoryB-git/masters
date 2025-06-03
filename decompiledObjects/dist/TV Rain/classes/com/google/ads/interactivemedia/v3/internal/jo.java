package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class jo
  extends cm
{
  private static final byte[] b = wl.h("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
  private jp A;
  private int B;
  private boolean C;
  private boolean D;
  private boolean E;
  private boolean F;
  private boolean G;
  private boolean H;
  private boolean I;
  private boolean J;
  private boolean K;
  private ByteBuffer[] L;
  private ByteBuffer[] M;
  private long N;
  private int O;
  private int P;
  private ByteBuffer Q;
  private boolean R;
  private boolean S;
  private boolean T;
  private int U;
  private int V;
  private int W;
  private boolean X;
  private boolean Y;
  private long Z;
  public fa a;
  private long aa;
  private boolean ab;
  private boolean ac;
  private boolean ad;
  private boolean ae;
  private boolean af;
  private final jt c;
  private final fj<fn> d;
  private final boolean e;
  private final boolean f;
  private final float g;
  private final ez h;
  private final ez i;
  private final by j;
  private final wj<bw> k;
  private final ArrayList<Long> l;
  private final MediaCodec.BufferInfo m;
  private bw n;
  private bw o;
  private fh<fn> p;
  private fh<fn> q;
  private MediaCrypto r;
  private boolean s;
  private long t;
  private float u;
  private MediaCodec v;
  private bw w;
  private float x;
  private ArrayDeque<jp> y;
  private jq z;
  
  public jo(int paramInt, jt paramjt, fj<fn> paramfj, boolean paramBoolean1, boolean paramBoolean2, float paramFloat)
  {
    super(paramInt);
    c = ((jt)rp.a(paramjt));
    d = paramfj;
    e = paramBoolean1;
    f = paramBoolean2;
    g = paramFloat;
    h = new ez(0);
    i = new ez(0);
    j = new by();
    k = new wj();
    l = new ArrayList();
    m = new MediaCodec.BufferInfo();
    U = 0;
    V = 0;
    W = 0;
    x = -1.0F;
    u = 1.0F;
    t = -9223372036854775807L;
  }
  
  private final void B()
  {
    O = -1;
    h.b = null;
  }
  
  private final void C()
  {
    P = -1;
    Q = null;
  }
  
  private final boolean D()
    throws ba
  {
    Object localObject1 = v;
    if ((localObject1 != null) && (V != 2) && (!ab))
    {
      int i1;
      Object localObject3;
      if (O < 0)
      {
        i1 = ((MediaCodec)localObject1).dequeueInputBuffer(0L);
        O = i1;
        if (i1 < 0) {
          return false;
        }
        localObject3 = h;
        if (wl.a >= 21) {
          localObject1 = v.getInputBuffer(i1);
        } else {
          localObject1 = L[i1];
        }
        b = ((ByteBuffer)localObject1);
        h.a();
      }
      if (V == 1)
      {
        if (!K)
        {
          Y = true;
          v.queueInputBuffer(O, 0, 0, 0L, 4);
          B();
        }
        V = 2;
        return false;
      }
      if (I)
      {
        I = false;
        localObject3 = h.b;
        localObject1 = b;
        ((ByteBuffer)localObject3).put((byte[])localObject1);
        v.queueInputBuffer(O, 0, localObject1.length, 0L, 0);
        B();
        X = true;
        return true;
      }
      int i2;
      if (ad)
      {
        i2 = -4;
        i1 = 0;
      }
      else
      {
        if (U == 1)
        {
          for (i1 = 0; i1 < w.k.size(); i1++)
          {
            localObject1 = (byte[])w.k.get(i1);
            h.b.put((byte[])localObject1);
          }
          U = 2;
        }
        i1 = h.b.position();
        j.a();
        i2 = a(j, h, false);
      }
      if (i()) {
        Z = aa;
      }
      if (i2 == -3) {
        return false;
      }
      if (i2 == -5)
      {
        if (U == 2)
        {
          h.a();
          U = 1;
        }
        a(j);
        j.a();
        return true;
      }
      if (h.c())
      {
        if (U == 2)
        {
          h.a();
          U = 1;
        }
        ab = true;
        if (!X)
        {
          P();
          return false;
        }
        try
        {
          if (!K)
          {
            Y = true;
            v.queueInputBuffer(O, 0, 0, 0L, 4);
            B();
          }
          return false;
        }
        catch (MediaCodec.CryptoException localCryptoException1)
        {
          throw ba.a(localCryptoException1, z());
        }
      }
      if ((ae) && (!h.d()))
      {
        h.a();
        if (U == 2) {
          U = 1;
        }
        return true;
      }
      ae = false;
      boolean bool1 = h.g();
      Object localObject2 = p;
      if ((localObject2 != null) && ((bool1) || (!e)))
      {
        i2 = ((fh)localObject2).a();
        if (i2 != 1)
        {
          if (i2 != 4)
          {
            bool2 = true;
            break label595;
          }
        }
        else {
          throw ba.a(p.b(), z());
        }
      }
      boolean bool2 = false;
      label595:
      ad = bool2;
      if (bool2) {
        return false;
      }
      if ((D) && (!bool1))
      {
        vu.a(h.b);
        if (h.b.position() == 0) {
          return true;
        }
        D = false;
      }
      try
      {
        localObject2 = h;
        long l1 = c;
        if (((ev)localObject2).b()) {
          l.add(Long.valueOf(l1));
        }
        if (af)
        {
          k.a(l1, n);
          af = false;
        }
        aa = Math.max(aa, l1);
        h.h();
        if (h.e()) {
          b(h);
        }
        a(h);
        if (bool1)
        {
          localObject3 = h.a.a();
          if (i1 != 0)
          {
            if (numBytesOfClearData == null) {
              numBytesOfClearData = new int[1];
            }
            localObject2 = numBytesOfClearData;
            localObject2[0] += i1;
          }
          v.queueSecureInputBuffer(O, 0, (MediaCodec.CryptoInfo)localObject3, l1, 0);
        }
        else
        {
          v.queueInputBuffer(O, 0, h.b.limit(), l1, 0);
        }
        B();
        X = true;
        U = 0;
        localObject2 = a;
        c += 1;
        return true;
      }
      catch (MediaCodec.CryptoException localCryptoException2)
      {
        throw ba.a(localCryptoException2, z());
      }
    }
    return false;
  }
  
  private final void M()
    throws ba
  {
    if (wl.a < 23) {
      return;
    }
    float f1 = a(u, x());
    float f2 = x;
    if (f2 != f1)
    {
      if (f1 == -1.0F)
      {
        O();
        return;
      }
      if ((f2 != -1.0F) || (f1 > g))
      {
        Bundle localBundle = new Bundle();
        localBundle.putFloat("operating-rate", f1);
        v.setParameters(localBundle);
        x = f1;
      }
    }
  }
  
  private final void N()
    throws ba
  {
    if (wl.a < 23)
    {
      O();
      return;
    }
    if (X)
    {
      V = 1;
      W = 2;
      return;
    }
    R();
  }
  
  private final void O()
    throws ba
  {
    if (X)
    {
      V = 1;
      W = 3;
      return;
    }
    Q();
  }
  
  private final void P()
    throws ba
  {
    int i1 = W;
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if (i1 != 3)
        {
          ac = true;
          E();
          return;
        }
        Q();
        return;
      }
      R();
      return;
    }
    K();
  }
  
  private final void Q()
    throws ba
  {
    J();
    F();
  }
  
  @TargetApi(23)
  private final void R()
    throws ba
  {
    fn localfn = (fn)q.c();
    if (localfn == null)
    {
      Q();
      return;
    }
    if (av.e.equals(a))
    {
      Q();
      return;
    }
    if (K()) {
      return;
    }
    try
    {
      r.setMediaDrmSession(b);
      b(q);
      V = 0;
      W = 0;
      return;
    }
    catch (MediaCryptoException localMediaCryptoException)
    {
      throw ba.a(localMediaCryptoException, z());
    }
  }
  
  private final void a(fh<fn> paramfh)
  {
    h.a(q, paramfh);
    q = paramfh;
  }
  
  private final void a(jp paramjp, MediaCrypto paramMediaCrypto)
    throws Exception
  {
    String str = a;
    int i1 = wl.a;
    float f1;
    if (i1 < 23) {
      f1 = -1.0F;
    } else {
      f1 = a(u, x());
    }
    if (f1 <= g) {
      f1 = -1.0F;
    }
    Object localObject1 = null;
    try
    {
      long l1 = SystemClock.elapsedRealtime();
      Object localObject2 = String.valueOf(str);
      if (((String)localObject2).length() != 0) {
        localObject2 = "createCodec:".concat((String)localObject2);
      } else {
        localObject2 = new String("createCodec:");
      }
      rp.b((String)localObject2);
      localObject2 = MediaCodec.createByCodecName(str);
      try
      {
        rp.e();
        rp.b("configureCodec");
        a(paramjp, (MediaCodec)localObject2, n, paramMediaCrypto, f1);
        rp.e();
        rp.b("startCodec");
        ((MediaCodec)localObject2).start();
        rp.e();
        long l2 = SystemClock.elapsedRealtime();
        if (i1 < 21)
        {
          L = ((MediaCodec)localObject2).getInputBuffers();
          M = ((MediaCodec)localObject2).getOutputBuffers();
        }
        v = ((MediaCodec)localObject2);
        A = paramjp;
        x = f1;
        w = n;
        if ((i1 <= 25) && ("OMX.Exynos.avc.dec.secure".equals(str)))
        {
          paramMediaCrypto = wl.d;
          if ((paramMediaCrypto.startsWith("SM-T585")) || (paramMediaCrypto.startsWith("SM-A510")) || (paramMediaCrypto.startsWith("SM-A520")) || (paramMediaCrypto.startsWith("SM-J700")))
          {
            i2 = 2;
            break label355;
          }
        }
        if ((i1 < 24) && (("OMX.Nvidia.h264.decode".equals(str)) || ("OMX.Nvidia.h264.decode.secure".equals(str))))
        {
          paramMediaCrypto = wl.b;
          if (("flounder".equals(paramMediaCrypto)) || ("flounder_lte".equals(paramMediaCrypto)) || ("grouper".equals(paramMediaCrypto)) || ("tilapia".equals(paramMediaCrypto)))
          {
            i2 = 1;
            break label355;
          }
        }
        int i2 = 0;
        label355:
        B = i2;
        paramMediaCrypto = wl.d;
        if ((paramMediaCrypto.startsWith("SM-T230")) && ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str))) {
          bool = true;
        } else {
          bool = false;
        }
        C = bool;
        localObject2 = w;
        if ((i1 < 21) && (k.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
          bool = true;
        } else {
          bool = false;
        }
        D = bool;
        if ((i1 >= 18) && ((i1 != 18) || ((!"OMX.SEC.avc.dec".equals(str)) && (!"OMX.SEC.avc.dec.secure".equals(str)))) && ((i1 != 19) || (!paramMediaCrypto.startsWith("SM-G800")) || ((!"OMX.Exynos.avc.dec".equals(str)) && (!"OMX.Exynos.avc.dec.secure".equals(str))))) {
          bool = false;
        } else {
          bool = true;
        }
        E = bool;
        if ((i1 > 23) || (!"OMX.google.vorbis.decoder".equals(str)))
        {
          if (i1 <= 19)
          {
            localObject2 = wl.b;
            if (((!"hb2000".equals(localObject2)) && (!"stvm8".equals(localObject2))) || ((!"OMX.amlogic.avc.decoder.awesome".equals(str)) && (!"OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {}
          }
        }
        else
        {
          bool = true;
          break label620;
        }
        boolean bool = false;
        label620:
        F = bool;
        if ((i1 == 21) && ("OMX.google.aac.decoder".equals(str))) {
          bool = true;
        } else {
          bool = false;
        }
        G = bool;
        localObject2 = w;
        if ((i1 <= 18) && (t == 1) && ("OMX.MTK.AUDIO.DECODER.MP3".equals(str))) {
          bool = true;
        } else {
          bool = false;
        }
        H = bool;
        localObject2 = a;
        if (((i1 <= 25) && ("OMX.rk.video_decoder.avc".equals(localObject2))) || ((i1 <= 17) && ("OMX.allwinner.video.decoder.avc".equals(localObject2))) || (("Amazon".equals(wl.c)) && ("AFTS".equals(paramMediaCrypto)) && (d))) {
          i2 = 1;
        } else {
          i2 = 0;
        }
        if ((i2 == 0) && (!G())) {
          bool = false;
        } else {
          bool = true;
        }
        K = bool;
        B();
        C();
        long l3;
        if (f() == 2) {
          l3 = SystemClock.elapsedRealtime() + 1000L;
        } else {
          l3 = -9223372036854775807L;
        }
        N = l3;
        T = false;
        U = 0;
        Y = false;
        X = false;
        V = 0;
        W = 0;
        I = false;
        J = false;
        R = false;
        S = false;
        ae = true;
        paramjp = a;
        a += 1;
        a(str, l2, l2 - l1);
        return;
      }
      catch (Exception paramMediaCrypto)
      {
        paramjp = (jp)localObject2;
      }
      if (paramjp == null) {
        break label960;
      }
    }
    catch (Exception paramMediaCrypto)
    {
      paramjp = (jp)localObject1;
    }
    c();
    paramjp.release();
    label960:
    throw paramMediaCrypto;
  }
  
  private final void b(fh<fn> paramfh)
  {
    h.a(p, paramfh);
    p = paramfh;
  }
  
  private final boolean b(long paramLong1, long paramLong2)
    throws ba
  {
    int i1;
    Object localObject1;
    Object localObject2;
    long l1;
    int i2;
    boolean bool1;
    if (!d())
    {
      if ((G) && (Y)) {
        try
        {
          i1 = v.dequeueOutputBuffer(m, 0L);
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          P();
          if (ac) {
            J();
          }
          return false;
        }
      } else {
        i1 = v.dequeueOutputBuffer(m, 0L);
      }
      if (i1 < 0)
      {
        if (i1 == -2)
        {
          localObject1 = v.getOutputFormat();
          if ((B != 0) && (((MediaFormat)localObject1).getInteger("width") == 32) && (((MediaFormat)localObject1).getInteger("height") == 32))
          {
            J = true;
          }
          else
          {
            if (H) {
              ((MediaFormat)localObject1).setInteger("channel-count", 1);
            }
            a(v, (MediaFormat)localObject1);
          }
          return true;
        }
        if (i1 == -3)
        {
          if (wl.a < 21) {
            M = v.getOutputBuffers();
          }
          return true;
        }
        if ((K) && ((ab) || (V == 2))) {
          P();
        }
        return false;
      }
      if (J)
      {
        J = false;
        v.releaseOutputBuffer(i1, false);
        return true;
      }
      localObject1 = m;
      if ((size == 0) && ((flags & 0x4) != 0))
      {
        P();
        return false;
      }
      P = i1;
      if (wl.a >= 21) {
        localObject1 = v.getOutputBuffer(i1);
      } else {
        localObject1 = M[i1];
      }
      Q = ((ByteBuffer)localObject1);
      if (localObject1 != null)
      {
        ((ByteBuffer)localObject1).position(m.offset);
        localObject2 = Q;
        localObject1 = m;
        ((ByteBuffer)localObject2).limit(offset + size);
      }
      l1 = m.presentationTimeUs;
      i2 = l.size();
      for (i1 = 0; i1 < i2; i1++) {
        if (((Long)l.get(i1)).longValue() == l1)
        {
          l.remove(i1);
          bool1 = true;
          break label435;
        }
      }
      bool1 = false;
      label435:
      R = bool1;
      l1 = Z;
      long l2 = m.presentationTimeUs;
      if (l1 == l2) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      S = bool1;
      d(l2);
    }
    if ((G) && (Y))
    {
      try
      {
        localObject2 = v;
        localObject1 = Q;
        i1 = P;
        localObject3 = m;
        i2 = flags;
        l1 = presentationTimeUs;
        boolean bool2 = R;
        bool1 = S;
        localObject3 = o;
        P();
      }
      catch (IllegalStateException localIllegalStateException2)
      {
        try
        {
          bool1 = a(paramLong1, paramLong2, (MediaCodec)localObject2, (ByteBuffer)localObject1, i1, i2, l1, bool2, bool1, (bw)localObject3);
        }
        catch (IllegalStateException localIllegalStateException3)
        {
          Object localObject3;
          MediaCodec.BufferInfo localBufferInfo;
          for (;;) {}
        }
        localIllegalStateException2 = localIllegalStateException2;
      }
      if (ac) {
        J();
      }
      return false;
    }
    else
    {
      localObject2 = v;
      localObject3 = Q;
      i1 = P;
      localBufferInfo = m;
      bool1 = a(paramLong1, paramLong2, (MediaCodec)localObject2, (ByteBuffer)localObject3, i1, flags, presentationTimeUs, R, S, o);
    }
    if (bool1)
    {
      c(m.presentationTimeUs);
      if ((m.flags & 0x4) != 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      C();
      if (i1 == 0) {
        return true;
      }
      P();
    }
    return false;
  }
  
  private final boolean b(boolean paramBoolean)
    throws ba
  {
    j.a();
    i.a();
    int i1 = a(j, i, paramBoolean);
    if (i1 == -5)
    {
      a(j);
      j.a();
      return true;
    }
    if ((i1 == -4) && (i.c()))
    {
      ab = true;
      P();
    }
    return false;
  }
  
  private final void c()
  {
    if (wl.a < 21)
    {
      L = null;
      M = null;
    }
  }
  
  private final boolean d()
  {
    return P >= 0;
  }
  
  public void E()
    throws ba
  {}
  
  public final void F()
    throws ba
  {
    if ((v == null) && (n != null))
    {
      b(q);
      String str1 = n.i;
      Object localObject3 = p;
      Object localObject4;
      boolean bool1;
      Object localObject1;
      int i1;
      if (localObject3 != null)
      {
        if (r == null)
        {
          localObject4 = (fn)((fh)localObject3).c();
          if (localObject4 == null)
          {
            if (p.b() != null) {}
          }
          else {
            try
            {
              localObject3 = new android/media/MediaCrypto;
              ((MediaCrypto)localObject3).<init>(a, b);
              r = ((MediaCrypto)localObject3);
              if ((!c) && (((MediaCrypto)localObject3).requiresSecureDecoderComponent(str1))) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              s = bool1;
            }
            catch (MediaCryptoException localMediaCryptoException)
            {
              throw ba.a(localMediaCryptoException, z());
            }
          }
        }
        if ("Amazon".equals(wl.c))
        {
          localObject1 = wl.d;
          if (("AFTM".equals(localObject1)) || ("AFTB".equals(localObject1)))
          {
            i1 = 1;
            break label185;
          }
        }
        i1 = 0;
        label185:
        if (i1 != 0)
        {
          i1 = p.a();
          if (i1 != 1)
          {
            if (i1 == 4) {}
          }
          else {
            throw ba.a(p.b(), z());
          }
        }
      }
      try
      {
        localObject4 = r;
        bool1 = s;
        localObject1 = y;
        String str2;
        Object localObject5;
        if (localObject1 == null) {
          try
          {
            localObject3 = a(c, n, bool1);
            localObject1 = localObject3;
            if (((List)localObject3).isEmpty())
            {
              localObject1 = localObject3;
              if (bool1)
              {
                localObject3 = a(c, n, false);
                localObject1 = localObject3;
                if (!((List)localObject3).isEmpty())
                {
                  str2 = n.i;
                  localObject1 = String.valueOf(localObject3);
                  int i2 = String.valueOf(str2).length();
                  i1 = ((String)localObject1).length();
                  localObject5 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject5).<init>(i2 + 99 + i1);
                  ((StringBuilder)localObject5).append("Drm session requires secure decoder for ");
                  ((StringBuilder)localObject5).append(str2);
                  ((StringBuilder)localObject5).append(", but no secure decoder available. Trying to proceed with ");
                  ((StringBuilder)localObject5).append((String)localObject1);
                  ((StringBuilder)localObject5).append(".");
                  Log.w("MediaCodecRenderer", ((StringBuilder)localObject5).toString());
                  localObject1 = localObject3;
                }
              }
            }
            localObject3 = new java/util/ArrayDeque;
            ((ArrayDeque)localObject3).<init>();
            y = ((ArrayDeque)localObject3);
            if (f) {
              ((ArrayDeque)localObject3).addAll((Collection)localObject1);
            } else if (!((List)localObject1).isEmpty()) {
              y.add((jp)((List)localObject1).get(0));
            }
            z = null;
          }
          catch (ka localka)
          {
            localObject3 = new com/google/ads/interactivemedia/v3/internal/jq;
            ((jq)localObject3).<init>(n, localka, bool1, -49998);
            throw ((Throwable)localObject3);
          }
        }
        if (!y.isEmpty())
        {
          while (v == null)
          {
            localObject2 = (jp)y.peekFirst();
            boolean bool2 = a((jp)localObject2);
            if (!bool2) {
              break label683;
            }
            try
            {
              a((jp)localObject2, (MediaCrypto)localObject4);
            }
            catch (Exception localException)
            {
              str2 = String.valueOf(localObject2);
              i1 = str2.length();
              localObject5 = new java/lang/StringBuilder;
              ((StringBuilder)localObject5).<init>(i1 + 30);
              ((StringBuilder)localObject5).append("Failed to initialize decoder: ");
              ((StringBuilder)localObject5).append(str2);
              vr.a("MediaCodecRenderer", ((StringBuilder)localObject5).toString(), localException);
              y.removeFirst();
              localObject5 = new com/google/ads/interactivemedia/v3/internal/jq;
              ((jq)localObject5).<init>(n, localException, bool1, (jp)localObject2);
              if (z == null) {
                z = ((jq)localObject5);
              } else {
                z = jq.a(z, (jq)localObject5);
              }
            }
            if (y.isEmpty()) {
              throw z;
            }
          }
          y = null;
          label683:
          return;
        }
        Object localObject2 = new com/google/ads/interactivemedia/v3/internal/jq;
        ((jq)localObject2).<init>(n, null, bool1, -49999);
        throw ((Throwable)localObject2);
      }
      catch (jq localjq)
      {
        throw ba.a(localjq, z());
      }
    }
  }
  
  public boolean G()
  {
    return false;
  }
  
  public final MediaCodec H()
  {
    return v;
  }
  
  public final jp I()
  {
    return A;
  }
  
  /* Error */
  public void J()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 701	com/google/ads/interactivemedia/v3/internal/jo:y	Ljava/util/ArrayDeque;
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 490	com/google/ads/interactivemedia/v3/internal/jo:A	Lcom/google/ads/interactivemedia/v3/internal/jp;
    //   10: aload_0
    //   11: aconst_null
    //   12: putfield 221	com/google/ads/interactivemedia/v3/internal/jo:w	Lcom/google/ads/interactivemedia/v3/internal/bw;
    //   15: aload_0
    //   16: invokespecial 207	com/google/ads/interactivemedia/v3/internal/jo:B	()V
    //   19: aload_0
    //   20: invokespecial 582	com/google/ads/interactivemedia/v3/internal/jo:C	()V
    //   23: aload_0
    //   24: invokespecial 602	com/google/ads/interactivemedia/v3/internal/jo:c	()V
    //   27: aload_0
    //   28: iconst_0
    //   29: putfield 219	com/google/ads/interactivemedia/v3/internal/jo:ad	Z
    //   32: aload_0
    //   33: ldc2_w 159
    //   36: putfield 588	com/google/ads/interactivemedia/v3/internal/jo:N	J
    //   39: aload_0
    //   40: getfield 142	com/google/ads/interactivemedia/v3/internal/jo:l	Ljava/util/ArrayList;
    //   43: invokevirtual 774	java/util/ArrayList:clear	()V
    //   46: aload_0
    //   47: ldc2_w 159
    //   50: putfield 250	com/google/ads/interactivemedia/v3/internal/jo:aa	J
    //   53: aload_0
    //   54: ldc2_w 159
    //   57: putfield 252	com/google/ads/interactivemedia/v3/internal/jo:Z	J
    //   60: aload_0
    //   61: getfield 179	com/google/ads/interactivemedia/v3/internal/jo:v	Landroid/media/MediaCodec;
    //   64: astore_1
    //   65: aload_1
    //   66: ifnull +42 -> 108
    //   69: aload_0
    //   70: getfield 347	com/google/ads/interactivemedia/v3/internal/jo:a	Lcom/google/ads/interactivemedia/v3/internal/fa;
    //   73: astore_2
    //   74: aload_2
    //   75: aload_2
    //   76: getfield 776	com/google/ads/interactivemedia/v3/internal/fa:b	I
    //   79: iconst_1
    //   80: iadd
    //   81: putfield 776	com/google/ads/interactivemedia/v3/internal/fa:b	I
    //   84: aload_1
    //   85: invokevirtual 779	android/media/MediaCodec:stop	()V
    //   88: aload_0
    //   89: getfield 179	com/google/ads/interactivemedia/v3/internal/jo:v	Landroid/media/MediaCodec;
    //   92: invokevirtual 605	android/media/MediaCodec:release	()V
    //   95: goto +13 -> 108
    //   98: astore_2
    //   99: aload_0
    //   100: getfield 179	com/google/ads/interactivemedia/v3/internal/jo:v	Landroid/media/MediaCodec;
    //   103: invokevirtual 605	android/media/MediaCodec:release	()V
    //   106: aload_2
    //   107: athrow
    //   108: aload_0
    //   109: aconst_null
    //   110: putfield 179	com/google/ads/interactivemedia/v3/internal/jo:v	Landroid/media/MediaCodec;
    //   113: aload_0
    //   114: getfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   117: astore_2
    //   118: aload_2
    //   119: ifnull +7 -> 126
    //   122: aload_2
    //   123: invokevirtual 780	android/media/MediaCrypto:release	()V
    //   126: aload_0
    //   127: aconst_null
    //   128: putfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   131: aload_0
    //   132: iconst_0
    //   133: putfield 695	com/google/ads/interactivemedia/v3/internal/jo:s	Z
    //   136: aload_0
    //   137: aconst_null
    //   138: invokespecial 423	com/google/ads/interactivemedia/v3/internal/jo:b	(Lcom/google/ads/interactivemedia/v3/internal/fh;)V
    //   141: return
    //   142: astore_2
    //   143: aload_0
    //   144: aconst_null
    //   145: putfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   148: aload_0
    //   149: iconst_0
    //   150: putfield 695	com/google/ads/interactivemedia/v3/internal/jo:s	Z
    //   153: aload_0
    //   154: aconst_null
    //   155: invokespecial 423	com/google/ads/interactivemedia/v3/internal/jo:b	(Lcom/google/ads/interactivemedia/v3/internal/fh;)V
    //   158: aload_2
    //   159: athrow
    //   160: astore_2
    //   161: aload_0
    //   162: aconst_null
    //   163: putfield 179	com/google/ads/interactivemedia/v3/internal/jo:v	Landroid/media/MediaCodec;
    //   166: aload_0
    //   167: getfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   170: astore_1
    //   171: aload_1
    //   172: ifnull +7 -> 179
    //   175: aload_1
    //   176: invokevirtual 780	android/media/MediaCrypto:release	()V
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   184: aload_0
    //   185: iconst_0
    //   186: putfield 695	com/google/ads/interactivemedia/v3/internal/jo:s	Z
    //   189: aload_0
    //   190: aconst_null
    //   191: invokespecial 423	com/google/ads/interactivemedia/v3/internal/jo:b	(Lcom/google/ads/interactivemedia/v3/internal/fh;)V
    //   194: aload_2
    //   195: athrow
    //   196: astore_2
    //   197: aload_0
    //   198: aconst_null
    //   199: putfield 413	com/google/ads/interactivemedia/v3/internal/jo:r	Landroid/media/MediaCrypto;
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield 695	com/google/ads/interactivemedia/v3/internal/jo:s	Z
    //   207: aload_0
    //   208: aconst_null
    //   209: invokespecial 423	com/google/ads/interactivemedia/v3/internal/jo:b	(Lcom/google/ads/interactivemedia/v3/internal/fh;)V
    //   212: aload_2
    //   213: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	214	0	this	jo
    //   64	112	1	localObject1	Object
    //   73	3	2	localfa	fa
    //   98	9	2	localObject2	Object
    //   117	6	2	localMediaCrypto	MediaCrypto
    //   142	17	2	localObject3	Object
    //   160	35	2	localObject4	Object
    //   196	17	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   84	88	98	finally
    //   113	118	142	finally
    //   122	126	142	finally
    //   60	65	160	finally
    //   69	84	160	finally
    //   88	95	160	finally
    //   99	108	160	finally
    //   166	171	196	finally
    //   175	179	196	finally
  }
  
  public final boolean K()
    throws ba
  {
    boolean bool = L();
    if (bool) {
      F();
    }
    return bool;
  }
  
  public boolean L()
  {
    MediaCodec localMediaCodec = v;
    if (localMediaCodec == null) {
      return false;
    }
    if ((W != 3) && (!E) && ((!F) || (!Y)))
    {
      localMediaCodec.flush();
      B();
      C();
      N = -9223372036854775807L;
      Y = false;
      X = false;
      ae = true;
      I = false;
      J = false;
      R = false;
      S = false;
      ad = false;
      l.clear();
      aa = -9223372036854775807L;
      Z = -9223372036854775807L;
      V = 0;
      W = 0;
      U = T;
      return false;
    }
    J();
    return true;
  }
  
  public float a(float paramFloat, bw[] paramArrayOfbw)
  {
    return -1.0F;
  }
  
  public final int a(bw parambw)
    throws ba
  {
    try
    {
      int i1 = a(c, d, parambw);
      return i1;
    }
    catch (ka parambw)
    {
      throw ba.a(parambw, z());
    }
  }
  
  public int a(jp paramjp, bw parambw1, bw parambw2)
  {
    return 0;
  }
  
  public abstract int a(jt paramjt, fj<fn> paramfj, bw parambw)
    throws ka;
  
  public jr a(Throwable paramThrowable, jp paramjp)
  {
    return new jr(paramThrowable, paramjp);
  }
  
  public abstract List<jp> a(jt paramjt, bw parambw, boolean paramBoolean)
    throws ka;
  
  public final void a(float paramFloat)
    throws ba
  {
    u = paramFloat;
    if ((v != null) && (W != 3) && (f() != 0)) {
      M();
    }
  }
  
  public final void a(long paramLong1, long paramLong2)
    throws ba
  {
    int i1 = 1;
    try
    {
      if (ac)
      {
        E();
        return;
      }
      if ((n == null) && (!b(true))) {
        return;
      }
      F();
      if (v != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        rp.b("drainAndFeed");
        while (b(paramLong1, paramLong2)) {}
        do
        {
          if (!D()) {
            break;
          }
          if ((t != -9223372036854775807L) && (SystemClock.elapsedRealtime() - l1 >= t)) {
            i2 = 0;
          } else {
            i2 = 1;
          }
        } while (i2 != 0);
        rp.e();
      }
      else
      {
        fa localfa = a;
        d += b(paramLong1);
        b(false);
      }
      a.a();
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      int i2;
      if ((wl.a >= 21) && ((localIllegalStateException instanceof MediaCodec.CodecException)))
      {
        i2 = i1;
      }
      else
      {
        StackTraceElement[] arrayOfStackTraceElement = localIllegalStateException.getStackTrace();
        if ((arrayOfStackTraceElement.length > 0) && (arrayOfStackTraceElement[0].getClassName().equals("android.media.MediaCodec"))) {
          i2 = i1;
        } else {
          i2 = 0;
        }
      }
      if (i2 != 0) {
        throw ba.a(a(localIllegalStateException, A), z());
      }
      throw localIllegalStateException;
    }
  }
  
  public void a(long paramLong, boolean paramBoolean)
    throws ba
  {
    ab = false;
    ac = false;
    K();
    k.a();
  }
  
  public void a(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
    throws ba
  {}
  
  public void a(by paramby)
    throws ba
  {
    boolean bool1 = true;
    af = true;
    bw localbw = (bw)rp.a(c);
    if (a) {
      a(b);
    } else {
      q = a(n, localbw, d, q);
    }
    n = localbw;
    if (v == null)
    {
      F();
      return;
    }
    paramby = q;
    if (((paramby == null) && (p != null)) || ((paramby != null) && (p == null)) || ((paramby != null) && (!A.d)) || ((wl.a < 23) && (paramby != p)))
    {
      O();
      return;
    }
    int i1 = a(A, w, localbw);
    if (i1 != 0)
    {
      if (i1 != 1)
      {
        if (i1 != 2)
        {
          if (i1 == 3)
          {
            w = localbw;
            M();
            if (q != p) {
              N();
            }
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else
        {
          if (C)
          {
            O();
            return;
          }
          T = true;
          U = 1;
          i1 = B;
          boolean bool2 = bool1;
          if (i1 != 2)
          {
            if (i1 == 1)
            {
              i1 = n;
              paramby = w;
              if ((i1 == n) && (o == o))
              {
                bool2 = bool1;
                break label290;
              }
            }
            bool2 = false;
          }
          label290:
          I = bool2;
          w = localbw;
          M();
          if (q != p) {
            N();
          }
        }
        return;
      }
      w = localbw;
      M();
      if (q != p)
      {
        N();
        return;
      }
      if (X)
      {
        V = 1;
        W = 1;
      }
      return;
    }
    O();
  }
  
  public void a(ez paramez) {}
  
  public abstract void a(jp paramjp, MediaCodec paramMediaCodec, bw parambw, MediaCrypto paramMediaCrypto, float paramFloat);
  
  public void a(String paramString, long paramLong1, long paramLong2) {}
  
  public void a(boolean paramBoolean)
    throws ba
  {
    a = new fa();
  }
  
  public abstract boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, bw parambw)
    throws ba;
  
  public boolean a(jp paramjp)
  {
    return true;
  }
  
  public void b(ez paramez)
    throws ba
  {}
  
  public void c(long paramLong) {}
  
  public final bw d(long paramLong)
  {
    bw localbw = (bw)k.a(paramLong);
    if (localbw != null) {
      o = localbw;
    }
    return localbw;
  }
  
  public boolean n()
  {
    return (n != null) && (!ad) && ((A()) || (d()) || ((N != -9223372036854775807L) && (SystemClock.elapsedRealtime() < N)));
  }
  
  public boolean o()
  {
    return ac;
  }
  
  public final int s()
  {
    return 8;
  }
  
  public void t() {}
  
  public void u() {}
  
  public void v()
  {
    n = null;
    if ((q == null) && (p == null))
    {
      L();
      return;
    }
    w();
  }
  
  public void w()
  {
    try
    {
      J();
      return;
    }
    finally
    {
      a(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */