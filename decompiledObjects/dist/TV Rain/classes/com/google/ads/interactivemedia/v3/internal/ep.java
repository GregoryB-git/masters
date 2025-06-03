package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ep
  extends jo
  implements vt
{
  private final Context b;
  private final dq c;
  private final dv d;
  private final long[] e;
  private int f;
  private boolean g;
  private boolean h;
  private boolean i;
  private MediaFormat j;
  private int k;
  private int l;
  private int m;
  private int n;
  private long o;
  private boolean p;
  private boolean q;
  private long r;
  private int s;
  
  public ep(Context paramContext, jt paramjt, Handler paramHandler, dn paramdn)
  {
    this(paramContext, paramjt, null, false, paramHandler, paramdn);
  }
  
  private ep(Context paramContext, jt paramjt, fj<fn> paramfj, boolean paramBoolean, Handler paramHandler, dn paramdn)
  {
    this(paramContext, paramjt, null, false, paramHandler, paramdn, null, new dl[0]);
  }
  
  private ep(Context paramContext, jt paramjt, fj<fn> paramfj, boolean paramBoolean, Handler paramHandler, dn paramdn, di paramdi, dl... paramVarArgs)
  {
    this(paramContext, paramjt, paramfj, paramBoolean, paramHandler, paramdn, new eh(null, paramVarArgs));
  }
  
  private ep(Context paramContext, jt paramjt, fj<fn> paramfj, boolean paramBoolean, Handler paramHandler, dn paramdn, dv paramdv)
  {
    this(paramContext, paramjt, paramfj, paramBoolean, false, paramHandler, paramdn, paramdv);
  }
  
  private ep(Context paramContext, jt paramjt, fj<fn> paramfj, boolean paramBoolean1, boolean paramBoolean2, Handler paramHandler, dn paramdn, dv paramdv)
  {
    super(1, paramjt, paramfj, paramBoolean1, false, 44100.0F);
    b = paramContext.getApplicationContext();
    d = paramdv;
    r = -9223372036854775807L;
    e = new long[10];
    c = new dq(paramHandler, paramdn);
    paramdv.a(new ea(this, (byte)0));
  }
  
  public static void B() {}
  
  public static void C() {}
  
  public static void D() {}
  
  private final void M()
  {
    long l1 = d.a(o());
    if (l1 != Long.MIN_VALUE)
    {
      if (!q) {
        l1 = Math.max(o, l1);
      }
      o = l1;
      q = false;
    }
  }
  
  private final int a(jp paramjp, bw parambw)
  {
    if ("OMX.google.raw.decoder".equals(a))
    {
      int i1 = wl.a;
      if ((i1 < 24) && ((i1 != 23) || (!wl.c(b)))) {
        return -1;
      }
    }
    return j;
  }
  
  private final boolean a(int paramInt, String paramString)
  {
    return b(paramInt, paramString) != 0;
  }
  
  private final int b(int paramInt, String paramString)
  {
    String str = paramString;
    if ("audio/eac3-joc".equals(paramString))
    {
      if (d.a(paramInt, 18)) {
        return vs.h("audio/eac3-joc");
      }
      str = "audio/eac3";
    }
    int i1 = vs.h(str);
    if (d.a(paramInt, i1)) {
      return i1;
    }
    return 0;
  }
  
  public final void E()
    throws ba
  {
    try
    {
      d.c();
      return;
    }
    catch (dz localdz)
    {
      throw ba.a(localdz, z());
    }
  }
  
  public final float a(float paramFloat, bw[] paramArrayOfbw)
  {
    int i1 = paramArrayOfbw.length;
    int i2 = 0;
    int i5;
    for (int i3 = -1; i2 < i1; i3 = i5)
    {
      int i4 = u;
      i5 = i3;
      if (i4 != -1) {
        i5 = Math.max(i3, i4);
      }
      i2++;
    }
    if (i3 == -1) {
      return -1.0F;
    }
    return i3 * paramFloat;
  }
  
  public final int a(jp paramjp, bw parambw1, bw parambw2)
  {
    if ((a(paramjp, parambw2) <= f) && (w == 0) && (x == 0) && (w == 0) && (x == 0))
    {
      if (paramjp.a(parambw1, parambw2, true)) {
        return 3;
      }
      int i1;
      if ((wl.a(i, i)) && (t == t) && (u == u) && (parambw1.b(parambw2))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 != 0) {
        return 1;
      }
    }
    return 0;
  }
  
  public final int a(jt paramjt, fj<fn> paramfj, bw parambw)
    throws ka
  {
    String str = i;
    if (!vs.a(str)) {
      return 0;
    }
    int i1;
    if (wl.a >= 21) {
      i1 = 32;
    } else {
      i1 = 0;
    }
    if ((l != null) && (!fn.class.equals(A)) && ((A != null) || (!cm.a(paramfj, l)))) {
      i2 = 0;
    } else {
      i2 = 1;
    }
    int i3 = 4;
    int i4 = 8;
    if ((i2 != 0) && (a(t, str)) && (paramjt.a() != null)) {
      return i1 | 0x8 | 0x4;
    }
    if ((("audio/raw".equals(str)) && (!d.a(t, v))) || (!d.a(t, 2))) {
      return 1;
    }
    paramjt = a(paramjt, parambw, false);
    if (paramjt.isEmpty()) {
      return 1;
    }
    if (i2 == 0) {
      return 2;
    }
    paramjt = (jp)paramjt.get(0);
    boolean bool = paramjt.a(parambw);
    int i2 = i4;
    if (bool)
    {
      i2 = i4;
      if (paramjt.b(parambw)) {
        i2 = 16;
      }
    }
    if (!bool) {
      i3 = 3;
    }
    return i2 | i1 | i3;
  }
  
  public final List<jp> a(jt paramjt, bw parambw, boolean paramBoolean)
    throws ka
  {
    if (a(t, i))
    {
      localObject = paramjt.a();
      if (localObject != null) {
        return Collections.singletonList(localObject);
      }
    }
    List localList = jv.a(paramjt.a(i, paramBoolean, false), parambw);
    Object localObject = localList;
    if ("audio/eac3-joc".equals(i))
    {
      localObject = new ArrayList(localList);
      ((ArrayList)localObject).addAll(paramjt.a("audio/eac3", paramBoolean, false));
    }
    return Collections.unmodifiableList((List)localObject);
  }
  
  public final void a(int paramInt, Object paramObject)
    throws ba
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 5)
        {
          super.a(paramInt, paramObject);
          return;
        }
        paramObject = (eg)paramObject;
        d.a((eg)paramObject);
        return;
      }
      paramObject = (dg)paramObject;
      d.a((dg)paramObject);
      return;
    }
    d.a(((Float)paramObject).floatValue());
  }
  
  public final void a(long paramLong, boolean paramBoolean)
    throws ba
  {
    super.a(paramLong, paramBoolean);
    d.i();
    o = paramLong;
    p = true;
    q = true;
    r = -9223372036854775807L;
    s = 0;
  }
  
  public final void a(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
    throws ba
  {
    paramMediaCodec = j;
    int i1;
    if (paramMediaCodec != null)
    {
      i1 = b(paramMediaCodec.getInteger("channel-count"), paramMediaCodec.getString("mime"));
      paramMediaFormat = paramMediaCodec;
    }
    else
    {
      i1 = k;
    }
    int i2 = paramMediaFormat.getInteger("channel-count");
    int i3 = paramMediaFormat.getInteger("sample-rate");
    if ((h) && (i2 == 6))
    {
      int i4 = l;
      if (i4 < 6)
      {
        paramMediaFormat = new int[i4];
        for (i4 = 0;; i4++)
        {
          paramMediaCodec = paramMediaFormat;
          if (i4 >= l) {
            break;
          }
          paramMediaFormat[i4] = i4;
        }
      }
    }
    paramMediaCodec = null;
    try
    {
      d.a(i1, i2, i3, 0, paramMediaCodec, m, n);
      return;
    }
    catch (dy paramMediaCodec)
    {
      throw ba.a(paramMediaCodec, z());
    }
  }
  
  public final void a(by paramby)
    throws ba
  {
    super.a(paramby);
    paramby = c;
    c.a(paramby);
    int i1;
    if ("audio/raw".equals(i)) {
      i1 = v;
    } else {
      i1 = 2;
    }
    k = i1;
    l = t;
    m = w;
    n = x;
  }
  
  public final void a(cg paramcg)
  {
    d.a(paramcg);
  }
  
  public final void a(ez paramez)
  {
    if ((p) && (!paramez.b()))
    {
      if (Math.abs(c - o) > 500000L) {
        o = c;
      }
      p = false;
    }
    r = Math.max(c, r);
  }
  
  public final void a(jp paramjp, MediaCodec paramMediaCodec, bw parambw, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    bw[] arrayOfbw = x();
    int i1 = a(paramjp, parambw);
    int i2 = i1;
    if (arrayOfbw.length != 1)
    {
      int i3 = arrayOfbw.length;
      i4 = 0;
      for (;;)
      {
        i2 = i1;
        if (i4 >= i3) {
          break;
        }
        localObject = arrayOfbw[i4];
        i2 = i1;
        if (paramjp.a(parambw, (bw)localObject, false)) {
          i2 = Math.max(i1, a(paramjp, (bw)localObject));
        }
        i4++;
        i1 = i2;
      }
    }
    f = i2;
    Object localObject = a;
    int i4 = wl.a;
    if ((i4 < 24) && ("OMX.SEC.aac.dec".equals(localObject)) && ("samsung".equals(wl.c)))
    {
      localObject = wl.b;
      if ((((String)localObject).startsWith("zeroflte")) || (((String)localObject).startsWith("herolte")) || (((String)localObject).startsWith("heroqlte")))
      {
        bool = true;
        break label184;
      }
    }
    boolean bool = false;
    label184:
    h = bool;
    localObject = a;
    if ((i4 < 21) && ("OMX.SEC.mp3.dec".equals(localObject)) && ("samsung".equals(wl.c)))
    {
      localObject = wl.b;
      if ((((String)localObject).startsWith("baffin")) || (((String)localObject).startsWith("grand")) || (((String)localObject).startsWith("fortuna")) || (((String)localObject).startsWith("gprimelte")) || (((String)localObject).startsWith("j2y18lte")) || (((String)localObject).startsWith("ms01")))
      {
        bool = true;
        break label306;
      }
    }
    bool = false;
    label306:
    i = bool;
    bool = e;
    g = bool;
    if (bool) {
      paramjp = "audio/raw";
    } else {
      paramjp = c;
    }
    i1 = f;
    localObject = new MediaFormat();
    ((MediaFormat)localObject).setString("mime", paramjp);
    ((MediaFormat)localObject).setInteger("channel-count", t);
    ((MediaFormat)localObject).setInteger("sample-rate", u);
    h.a((MediaFormat)localObject, k);
    h.a((MediaFormat)localObject, "max-input-size", i1);
    if (i4 >= 23)
    {
      ((MediaFormat)localObject).setInteger("priority", 0);
      if (paramFloat != -1.0F)
      {
        if (i4 == 23)
        {
          paramjp = wl.d;
          if (("ZTE B2017G".equals(paramjp)) || ("AXON 7 mini".equals(paramjp)))
          {
            i1 = 1;
            break label471;
          }
        }
        i1 = 0;
        label471:
        if (i1 == 0) {
          ((MediaFormat)localObject).setFloat("operating-rate", paramFloat);
        }
      }
    }
    if ((i4 <= 28) && ("audio/ac4".equals(i))) {
      ((MediaFormat)localObject).setInteger("ac4-is-sync", 1);
    }
    paramMediaCodec.configure((MediaFormat)localObject, null, paramMediaCrypto, 0);
    if (g)
    {
      j = ((MediaFormat)localObject);
      ((MediaFormat)localObject).setString("mime", i);
      return;
    }
    j = null;
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    c.a(paramString, paramLong1, paramLong2);
  }
  
  public final void a(boolean paramBoolean)
    throws ba
  {
    super.a(paramBoolean);
    c.a(a);
    int i1 = yb;
    if (i1 != 0)
    {
      d.a(i1);
      return;
    }
    d.g();
  }
  
  public final void a(bw[] paramArrayOfbw, long paramLong)
    throws ba
  {
    super.a(paramArrayOfbw, paramLong);
    if (r != -9223372036854775807L)
    {
      int i1 = s;
      paramArrayOfbw = e;
      if (i1 == paramArrayOfbw.length)
      {
        paramLong = paramArrayOfbw[(i1 - 1)];
        paramArrayOfbw = new StringBuilder(67);
        paramArrayOfbw.append("Too many stream changes, so dropping change at ");
        paramArrayOfbw.append(paramLong);
        Log.w("MediaCodecAudioRenderer", paramArrayOfbw.toString());
      }
      else
      {
        s = (i1 + 1);
      }
      e[(s - 1)] = r;
    }
  }
  
  public final boolean a(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, bw parambw)
    throws ba
  {
    paramLong1 = paramLong3;
    if (i)
    {
      paramLong1 = paramLong3;
      if (paramLong3 == 0L)
      {
        paramLong1 = paramLong3;
        if ((paramInt2 & 0x4) != 0)
        {
          paramLong2 = r;
          paramLong1 = paramLong3;
          if (paramLong2 != -9223372036854775807L) {
            paramLong1 = paramLong2;
          }
        }
      }
    }
    if ((g) && ((paramInt2 & 0x2) != 0))
    {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      return true;
    }
    if (paramBoolean1)
    {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      paramMediaCodec = a;
      f += 1;
      d.b();
      return true;
    }
    try
    {
      if (d.a(paramByteBuffer, paramLong1))
      {
        paramMediaCodec.releaseOutputBuffer(paramInt1, false);
        paramMediaCodec = a;
        e += 1;
        return true;
      }
      return false;
    }
    catch (dz paramMediaCodec) {}catch (dx paramMediaCodec) {}
    throw ba.a(paramMediaCodec, z());
  }
  
  public final long c()
  {
    if (f() == 2) {
      M();
    }
    return o;
  }
  
  public final void c(long paramLong)
  {
    while ((s != 0) && (paramLong >= e[0]))
    {
      d.b();
      int i1 = s - 1;
      s = i1;
      long[] arrayOfLong = e;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i1);
    }
  }
  
  public final cg d()
  {
    return d.f();
  }
  
  public final vt e()
  {
    return this;
  }
  
  public final boolean n()
  {
    return (d.e()) || (super.n());
  }
  
  public final boolean o()
  {
    return (super.o()) && (d.d());
  }
  
  public final void t()
  {
    super.t();
    d.a();
  }
  
  public final void u()
  {
    M();
    d.h();
    super.u();
  }
  
  /* Error */
  public final void v()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc2_w 73
    //   4: putfield 76	com/google/ads/interactivemedia/v3/internal/ep:r	J
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield 321	com/google/ads/interactivemedia/v3/internal/ep:s	I
    //   12: aload_0
    //   13: getfield 72	com/google/ads/interactivemedia/v3/internal/ep:d	Lcom/google/ads/interactivemedia/v3/internal/dv;
    //   16: invokeinterface 317 1 0
    //   21: aload_0
    //   22: invokespecial 574	com/google/ads/interactivemedia/v3/internal/jo:v	()V
    //   25: aload_0
    //   26: getfield 85	com/google/ads/interactivemedia/v3/internal/ep:c	Lcom/google/ads/interactivemedia/v3/internal/dq;
    //   29: aload_0
    //   30: getfield 481	com/google/ads/interactivemedia/v3/internal/jo:a	Lcom/google/ads/interactivemedia/v3/internal/fa;
    //   33: invokevirtual 576	com/google/ads/interactivemedia/v3/internal/dq:b	(Lcom/google/ads/interactivemedia/v3/internal/fa;)V
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: getfield 85	com/google/ads/interactivemedia/v3/internal/ep:c	Lcom/google/ads/interactivemedia/v3/internal/dq;
    //   42: aload_0
    //   43: getfield 481	com/google/ads/interactivemedia/v3/internal/jo:a	Lcom/google/ads/interactivemedia/v3/internal/fa;
    //   46: invokevirtual 576	com/google/ads/interactivemedia/v3/internal/dq:b	(Lcom/google/ads/interactivemedia/v3/internal/fa;)V
    //   49: aload_1
    //   50: athrow
    //   51: astore_1
    //   52: aload_0
    //   53: invokespecial 574	com/google/ads/interactivemedia/v3/internal/jo:v	()V
    //   56: aload_0
    //   57: getfield 85	com/google/ads/interactivemedia/v3/internal/ep:c	Lcom/google/ads/interactivemedia/v3/internal/dq;
    //   60: aload_0
    //   61: getfield 481	com/google/ads/interactivemedia/v3/internal/jo:a	Lcom/google/ads/interactivemedia/v3/internal/fa;
    //   64: invokevirtual 576	com/google/ads/interactivemedia/v3/internal/dq:b	(Lcom/google/ads/interactivemedia/v3/internal/fa;)V
    //   67: aload_1
    //   68: athrow
    //   69: astore_1
    //   70: aload_0
    //   71: getfield 85	com/google/ads/interactivemedia/v3/internal/ep:c	Lcom/google/ads/interactivemedia/v3/internal/dq;
    //   74: aload_0
    //   75: getfield 481	com/google/ads/interactivemedia/v3/internal/jo:a	Lcom/google/ads/interactivemedia/v3/internal/fa;
    //   78: invokevirtual 576	com/google/ads/interactivemedia/v3/internal/dq:b	(Lcom/google/ads/interactivemedia/v3/internal/fa;)V
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	ep
    //   37	13	1	localObject1	Object
    //   51	17	1	localObject2	Object
    //   69	13	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   21	25	37	finally
    //   0	21	51	finally
    //   52	56	69	finally
  }
  
  public final void w()
  {
    try
    {
      super.w();
      return;
    }
    finally
    {
      d.j();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */