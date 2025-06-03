package t0;

import F0.K;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import d0.g;
import d0.q;
import d0.q.b;
import g0.D;
import g0.F;
import g0.M;
import h0.d;
import j0.b;
import j0.i;
import j0.i.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import k0.Y0.a;
import k0.g0;
import k0.u;
import k0.v0;
import l0.y1;
import m0.O;
import m0.c0;
import p0.G;
import p0.n.a;
import x0.x.b;

public abstract class w
  extends k0.n
{
  public static final byte[] U0 = { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
  public boolean A0;
  public boolean B0;
  public boolean C0;
  public int D0;
  public int E0;
  public final m.b F;
  public int F0;
  public final z G;
  public boolean G0;
  public final boolean H;
  public boolean H0;
  public final float I;
  public boolean I0;
  public final i J;
  public long J0;
  public final i K;
  public long K0;
  public final i L;
  public boolean L0;
  public final j M;
  public boolean M0;
  public final MediaCodec.BufferInfo N;
  public boolean N0;
  public final ArrayDeque O;
  public boolean O0;
  public final c0 P;
  public u P0;
  public q Q;
  public k0.o Q0;
  public q R;
  public f R0;
  public p0.n S;
  public long S0;
  public p0.n T;
  public boolean T0;
  public Y0.a U;
  public MediaCrypto V;
  public long W;
  public float X;
  public float Y;
  public m Z;
  public q a0;
  public MediaFormat b0;
  public boolean c0;
  public float d0;
  public ArrayDeque e0;
  public d f0;
  public p g0;
  public int h0;
  public boolean i0;
  public boolean j0;
  public boolean k0;
  public boolean l0;
  public boolean m0;
  public boolean n0;
  public boolean o0;
  public boolean p0;
  public boolean q0;
  public boolean r0;
  public boolean s0;
  public long t0;
  public int u0;
  public int v0;
  public ByteBuffer w0;
  public boolean x0;
  public boolean y0;
  public boolean z0;
  
  public w(int paramInt, m.b paramb, z paramz, boolean paramBoolean, float paramFloat)
  {
    super(paramInt);
    F = paramb;
    G = ((z)g0.a.e(paramz));
    H = paramBoolean;
    I = paramFloat;
    J = i.F();
    K = new i(0);
    L = new i(2);
    paramb = new j();
    M = paramb;
    N = new MediaCodec.BufferInfo();
    X = 1.0F;
    Y = 1.0F;
    W = -9223372036854775807L;
    O = new ArrayDeque();
    R0 = f.e;
    paramb.z(0);
    r.order(ByteOrder.nativeOrder());
    P = new c0();
    d0 = -1.0F;
    h0 = 0;
    D0 = 0;
    u0 = -1;
    v0 = -1;
    t0 = -9223372036854775807L;
    J0 = -9223372036854775807L;
    K0 = -9223372036854775807L;
    S0 = -9223372036854775807L;
    E0 = 0;
    F0 = 0;
    Q0 = new k0.o();
  }
  
  public static boolean M1(q paramq)
  {
    int i = K;
    boolean bool;
    if ((i != 0) && (i != 2)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean c1(IllegalStateException paramIllegalStateException)
  {
    int i = M.a;
    boolean bool = true;
    if ((i >= 21) && (d1(paramIllegalStateException))) {
      return true;
    }
    paramIllegalStateException = paramIllegalStateException.getStackTrace();
    if ((paramIllegalStateException.length <= 0) || (!paramIllegalStateException[0].getClassName().equals("android.media.MediaCodec"))) {
      bool = false;
    }
    return bool;
  }
  
  public static boolean d1(IllegalStateException paramIllegalStateException)
  {
    return paramIllegalStateException instanceof MediaCodec.CodecException;
  }
  
  public static boolean e1(IllegalStateException paramIllegalStateException)
  {
    if ((paramIllegalStateException instanceof MediaCodec.CodecException)) {
      return ((MediaCodec.CodecException)paramIllegalStateException).isRecoverable();
    }
    return false;
  }
  
  public static boolean m0(String paramString, q paramq)
  {
    boolean bool;
    if ((M.a < 21) && (q.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean n0(String paramString)
  {
    if ((M.a < 21) && ("OMX.SEC.mp3.dec".equals(paramString)) && ("samsung".equals(M.c)))
    {
      paramString = M.b;
      if ((paramString.startsWith("baffin")) || (paramString.startsWith("grand")) || (paramString.startsWith("fortuna")) || (paramString.startsWith("gprimelte")) || (paramString.startsWith("j2y18lte")) || (paramString.startsWith("ms01"))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public static boolean o0(String paramString)
  {
    int i = M.a;
    if ((i > 23) || (!"OMX.google.vorbis.decoder".equals(paramString)))
    {
      if (i == 19)
      {
        String str = M.b;
        if (((!"hb2000".equals(str)) && (!"stvm8".equals(str))) || ((!"OMX.amlogic.avc.decoder.awesome".equals(paramString)) && (!"OMX.amlogic.avc.decoder.awesome.secure".equals(paramString)))) {}
      }
    }
    else {
      return true;
    }
    boolean bool = false;
    return bool;
  }
  
  public static boolean p0(String paramString)
  {
    boolean bool;
    if ((M.a == 21) && ("OMX.google.aac.decoder".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean q0(p paramp)
  {
    String str = a;
    int i = M.a;
    boolean bool;
    if (((i <= 25) && ("OMX.rk.video_decoder.avc".equals(str))) || ((i <= 29) && (("OMX.broadcom.video_decoder.tunnel".equals(str)) || ("OMX.broadcom.video_decoder.tunnel.secure".equals(str)) || ("OMX.bcm.vdec.avc.tunnel".equals(str)) || ("OMX.bcm.vdec.avc.tunnel.secure".equals(str)) || ("OMX.bcm.vdec.hevc.tunnel".equals(str)) || ("OMX.bcm.vdec.hevc.tunnel.secure".equals(str)))) || (("Amazon".equals(M.c)) && ("AFTS".equals(M.d)) && (g))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean r0(String paramString)
  {
    boolean bool;
    if ((M.a == 19) && (M.d.startsWith("SM-G800")) && (("OMX.Exynos.avc.dec".equals(paramString)) || ("OMX.Exynos.avc.dec.secure".equals(paramString)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean s0(String paramString)
  {
    boolean bool;
    if ((M.a == 29) && ("c2.android.aac.decoder".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean A0()
  {
    if (Z != null)
    {
      int i = E0;
      if ((i != 2) && (!L0))
      {
        if ((i == 0) && (J1())) {
          w0();
        }
        m localm = (m)g0.a.e(Z);
        if (u0 < 0)
        {
          i = localm.n();
          u0 = i;
          if (i < 0) {
            return false;
          }
          K.r = localm.i(i);
          K.m();
        }
        if (E0 == 1)
        {
          if (!r0)
          {
            H0 = true;
            localm.b(u0, 0, 0, 0L, 4);
            A1();
          }
          E0 = 2;
          return false;
        }
        if (p0)
        {
          p0 = false;
          localObject = (ByteBuffer)g0.a.e(K.r);
          byte[] arrayOfByte = U0;
          ((ByteBuffer)localObject).put(arrayOfByte);
          localm.b(u0, 0, arrayOfByte.length, 0L, 0);
          A1();
          G0 = true;
          return true;
        }
        if (D0 == 1)
        {
          for (i = 0; i < ea0)).q.size(); i++)
          {
            localObject = (byte[])a0.q.get(i);
            ((ByteBuffer)g0.a.e(K.r)).put((byte[])localObject);
          }
          D0 = 2;
        }
        i = ((ByteBuffer)g0.a.e(K.r)).position();
        Object localObject = N();
        try
        {
          int j = e0((v0)localObject, K, 0);
          if (j == -3)
          {
            if (p()) {
              K0 = J0;
            }
            return false;
          }
          if (j == -5)
          {
            if (D0 == 2)
            {
              K.m();
              D0 = 1;
            }
            k1((v0)localObject);
            return true;
          }
          if (K.p())
          {
            K0 = J0;
            if (D0 == 2)
            {
              K.m();
              D0 = 1;
            }
            L0 = true;
            if (!G0)
            {
              r1();
              return false;
            }
            try
            {
              if (!r0)
              {
                H0 = true;
                localm.b(u0, 0, 0, 0L, 4);
                A1();
              }
              return false;
            }
            catch (MediaCodec.CryptoException localCryptoException1)
            {
              throw J(localCryptoException1, Q, M.W(localCryptoException1.getErrorCode()));
            }
          }
          if ((!G0) && (!K.s()))
          {
            K.m();
            if (D0 == 2) {
              D0 = 1;
            }
            return true;
          }
          boolean bool = K.D();
          if (bool) {
            K.q.b(i);
          }
          if ((i0) && (!bool))
          {
            d.b((ByteBuffer)g0.a.e(K.r));
            if (((ByteBuffer)g0.a.e(K.r)).position() == 0) {
              return true;
            }
            i0 = false;
          }
          long l = K.t;
          if (N0)
          {
            if (!O.isEmpty()) {}
            for (f localf = (f)O.peekLast();; localf = R0)
            {
              d.a(l, (q)g0.a.e(Q));
              break;
            }
            N0 = false;
          }
          J0 = Math.max(J0, l);
          if ((p()) || (K.u())) {
            K0 = J0;
          }
          K.C();
          if (K.o()) {
            T0(K);
          }
          p1(K);
          i = G0(K);
          if (bool) {
            try
            {
              ((m)g0.a.e(localm)).a(u0, 0, K.q, l, i);
            }
            catch (MediaCodec.CryptoException localCryptoException2)
            {
              break label868;
            }
          } else {
            ((m)g0.a.e(localm)).b(u0, 0, ((ByteBuffer)g0.a.e(K.r)).limit(), l, i);
          }
          A1();
          G0 = true;
          D0 = 0;
          localo = Q0;
          c += 1;
          return true;
        }
        catch (i.a locala)
        {
          k0.o localo;
          label868:
          h1(locala);
          u1(0);
          B0();
          return true;
        }
        throw J(localo, Q, M.W(localo.getErrorCode()));
      }
    }
    return false;
  }
  
  public final void A1()
  {
    u0 = -1;
    K.r = null;
  }
  
  public final void B0()
  {
    try
    {
      ((m)g0.a.h(Z)).flush();
      return;
    }
    finally
    {
      y1();
    }
  }
  
  public final void B1()
  {
    v0 = -1;
    w0 = null;
  }
  
  public final boolean C0()
  {
    boolean bool = D0();
    if (bool) {
      f1();
    }
    return bool;
  }
  
  public final void C1(p0.n paramn)
  {
    p0.m.a(S, paramn);
    S = paramn;
  }
  
  public boolean D0()
  {
    if (Z == null) {
      return false;
    }
    int i = F0;
    if ((i != 3) && (!j0) && ((!k0) || (I0)) && ((!l0) || (!H0)))
    {
      if (i == 2)
      {
        i = M.a;
        boolean bool;
        if (i >= 23) {
          bool = true;
        } else {
          bool = false;
        }
        g0.a.f(bool);
        if (i >= 23) {
          try
          {
            O1();
          }
          catch (u localu)
          {
            g0.o.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", localu);
            w1();
            return true;
          }
        }
      }
      B0();
      return false;
    }
    w1();
    return true;
  }
  
  public final void D1(f paramf)
  {
    R0 = paramf;
    long l = c;
    if (l != -9223372036854775807L)
    {
      T0 = true;
      m1(l);
    }
  }
  
  public final List E0(boolean paramBoolean)
  {
    q localq = (q)g0.a.e(Q);
    List localList = L0(G, localq, paramBoolean);
    Object localObject = localList;
    if (localList.isEmpty())
    {
      localObject = localList;
      if (paramBoolean)
      {
        localList = L0(G, localq, false);
        localObject = localList;
        if (!localList.isEmpty())
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Drm session requires secure decoder for ");
          ((StringBuilder)localObject).append(n);
          ((StringBuilder)localObject).append(", but no secure decoder available. Trying to proceed with ");
          ((StringBuilder)localObject).append(localList);
          ((StringBuilder)localObject).append(".");
          g0.o.h("MediaCodecRenderer", ((StringBuilder)localObject).toString());
          localObject = localList;
        }
      }
    }
    return (List)localObject;
  }
  
  public final void E1()
  {
    O0 = true;
  }
  
  public final m F0()
  {
    return Z;
  }
  
  public final void F1(u paramu)
  {
    P0 = paramu;
  }
  
  public int G0(i parami)
  {
    return 0;
  }
  
  public final void G1(p0.n paramn)
  {
    p0.m.a(T, paramn);
    T = paramn;
  }
  
  public final p H0()
  {
    return g0;
  }
  
  public final boolean H1(long paramLong)
  {
    boolean bool;
    if ((W != -9223372036854775807L) && (L().b() - paramLong >= W)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void I(float paramFloat1, float paramFloat2)
  {
    X = paramFloat1;
    Y = paramFloat2;
    N1(a0);
  }
  
  public boolean I0()
  {
    return false;
  }
  
  public boolean I1(p paramp)
  {
    return true;
  }
  
  public abstract float J0(float paramFloat, q paramq, q[] paramArrayOfq);
  
  public boolean J1()
  {
    return false;
  }
  
  public final MediaFormat K0()
  {
    return b0;
  }
  
  public boolean K1(q paramq)
  {
    return false;
  }
  
  public abstract List L0(z paramz, q paramq, boolean paramBoolean);
  
  public abstract int L1(z paramz, q paramq);
  
  public long M0(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    return super.q(paramLong1, paramLong2);
  }
  
  public long N0()
  {
    return K0;
  }
  
  public final boolean N1(q paramq)
  {
    if (M.a < 23) {
      return true;
    }
    if ((Z != null) && (F0 != 3) && (getState() != 0))
    {
      float f1 = J0(Y, (q)g0.a.e(paramq), R());
      float f2 = d0;
      if (f2 == f1) {
        return true;
      }
      if (f1 == -1.0F)
      {
        w0();
        return false;
      }
      if ((f2 == -1.0F) && (f1 <= I)) {
        return true;
      }
      paramq = new Bundle();
      paramq.putFloat("operating-rate", f1);
      ((m)g0.a.e(Z)).c(paramq);
      d0 = f1;
    }
    return true;
  }
  
  public abstract m.a O0(p paramp, q paramq, MediaCrypto paramMediaCrypto, float paramFloat);
  
  public final void O1()
  {
    b localb = ((p0.n)g0.a.e(T)).h();
    if ((localb instanceof G)) {
      try
      {
        ((MediaCrypto)g0.a.e(V)).setMediaDrmSession(b);
      }
      catch (MediaCryptoException localMediaCryptoException)
      {
        throw J(localMediaCryptoException, Q, 6006);
      }
    }
    C1(T);
    E0 = 0;
    F0 = 0;
  }
  
  public final long P0()
  {
    return R0.c;
  }
  
  public final void P1(long paramLong)
  {
    q localq1 = (q)R0.d.i(paramLong);
    q localq2 = localq1;
    if (localq1 == null)
    {
      localq2 = localq1;
      if (T0)
      {
        localq2 = localq1;
        if (b0 != null) {
          localq2 = (q)R0.d.h();
        }
      }
    }
    if (localq2 != null) {
      R = localq2;
    } else if ((!c0) || (R == null)) {
      return;
    }
    l1((q)g0.a.e(R), b0);
    c0 = false;
    T0 = false;
  }
  
  public final long Q0()
  {
    return R0.b;
  }
  
  public float R0()
  {
    return X;
  }
  
  public final Y0.a S0()
  {
    return U;
  }
  
  public void T()
  {
    Q = null;
    D1(f.e);
    O.clear();
    D0();
  }
  
  public abstract void T0(i parami);
  
  public void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    Q0 = new k0.o();
  }
  
  public final boolean U0()
  {
    boolean bool;
    if (v0 >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean V0()
  {
    boolean bool1 = M.U();
    boolean bool2 = true;
    if (!bool1) {
      return true;
    }
    long l = P();
    if (b1(l, M.S()) != b1(l, L.t)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    L0 = false;
    M0 = false;
    O0 = false;
    if (z0)
    {
      M.m();
      L.m();
      A0 = false;
      P.d();
    }
    else
    {
      C0();
    }
    if (R0.d.k() > 0) {
      N0 = true;
    }
    R0.d.c();
    O.clear();
  }
  
  public final void W0(q paramq)
  {
    u0();
    paramq = n;
    if ((!"audio/mp4a-latm".equals(paramq)) && (!"audio/mpeg".equals(paramq)) && (!"audio/opus".equals(paramq))) {
      M.V(1);
    } else {
      M.V(32);
    }
    z0 = true;
  }
  
  public final void X0(p paramp, MediaCrypto paramMediaCrypto)
  {
    boolean bool1 = false;
    q localq = (q)g0.a.e(Q);
    String str = a;
    int i = M.a;
    float f1 = -1.0F;
    float f2;
    if (i < 23) {
      f2 = -1.0F;
    } else {
      f2 = J0(Y, localq, R());
    }
    if (f2 <= I) {
      f2 = f1;
    }
    q1(localq);
    long l1 = L().b();
    paramMediaCrypto = O0(paramp, localq, paramMediaCrypto, f2);
    if (i >= 31) {
      c.a(paramMediaCrypto, Q());
    }
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("createCodec:");
      ((StringBuilder)localObject).append(str);
      F.a(((StringBuilder)localObject).toString());
      m localm = F.a(paramMediaCrypto);
      Z = localm;
      if (i >= 21)
      {
        localObject = new t0/w$e;
        ((e)localObject).<init>(this, null);
        if (b.a(localm, (e)localObject)) {
          bool2 = true;
        }
      }
    }
    finally
    {
      break label502;
    }
    boolean bool2 = false;
    s0 = bool2;
    F.b();
    long l2 = L().b();
    if (!paramp.m(localq)) {
      g0.o.h("MediaCodecRenderer", M.G("Format exceeds selected codec's capabilities [%s, %s]", new Object[] { q.g(localq), str }));
    }
    g0 = paramp;
    d0 = f2;
    a0 = localq;
    h0 = l0(str);
    i0 = m0(str, (q)g0.a.e(a0));
    j0 = r0(str);
    k0 = s0(str);
    l0 = o0(str);
    m0 = p0(str);
    n0 = n0(str);
    o0 = false;
    if ((!q0(paramp)) && (!I0())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    r0 = bool2;
    if (((m)g0.a.e(Z)).e())
    {
      C0 = true;
      D0 = 1;
      bool2 = bool1;
      if (h0 != 0) {
        bool2 = true;
      }
      p0 = bool2;
    }
    if (getState() == 2) {
      t0 = (L().b() + 1000L);
    }
    paramp = Q0;
    a += 1;
    i1(str, paramMediaCrypto, l2, l2 - l1);
    return;
    label502:
    F.b();
    throw paramp;
  }
  
  public final boolean Y0()
  {
    boolean bool;
    if (V == null) {
      bool = true;
    } else {
      bool = false;
    }
    g0.a.f(bool);
    Object localObject1 = S;
    Object localObject2 = ((p0.n)localObject1).h();
    if ((G.d) && ((localObject2 instanceof G)))
    {
      int i = ((p0.n)localObject1).getState();
      if (i != 1)
      {
        if (i != 4) {
          return false;
        }
      }
      else
      {
        localObject1 = (n.a)g0.a.e(((p0.n)localObject1).g());
        throw J((Throwable)localObject1, Q, o);
      }
    }
    if (localObject2 == null) {
      return ((p0.n)localObject1).g() != null;
    }
    if ((localObject2 instanceof G))
    {
      localObject1 = (G)localObject2;
      try
      {
        localObject2 = new android/media/MediaCrypto;
        ((MediaCrypto)localObject2).<init>(a, b);
        V = ((MediaCrypto)localObject2);
      }
      catch (MediaCryptoException localMediaCryptoException)
      {
        throw J(localMediaCryptoException, Q, 6006);
      }
    }
    return true;
  }
  
  public void Z()
  {
    try
    {
      u0();
      w1();
      return;
    }
    finally
    {
      G1(null);
    }
  }
  
  public final boolean Z0()
  {
    return z0;
  }
  
  public final int a(q paramq)
  {
    try
    {
      int i = L1(G, paramq);
      return i;
    }
    catch (I.c localc)
    {
      throw J(localc, paramq, 4002);
    }
  }
  
  public void a0() {}
  
  public final boolean a1(q paramq)
  {
    boolean bool;
    if ((T == null) && (K1(paramq))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b0() {}
  
  public final boolean b1(long paramLong1, long paramLong2)
  {
    if (paramLong2 < paramLong1)
    {
      q localq = R;
      if ((localq == null) || (!Objects.equals(n, "audio/opus")) || (!K.g(paramLong1, paramLong2)))
      {
        bool = true;
        break label48;
      }
    }
    boolean bool = false;
    label48:
    return bool;
  }
  
  public boolean c()
  {
    return M0;
  }
  
  public void c0(q[] paramArrayOfq, long paramLong1, long paramLong2, x.b paramb)
  {
    if (R0.c == -9223372036854775807L)
    {
      D1(new f(-9223372036854775807L, paramLong1, paramLong2));
    }
    else
    {
      if (O.isEmpty())
      {
        long l1 = J0;
        if (l1 != -9223372036854775807L)
        {
          long l2 = S0;
          if ((l2 == -9223372036854775807L) || (l2 < l1)) {}
        }
        else
        {
          D1(new f(-9223372036854775807L, paramLong1, paramLong2));
          if (R0.c == -9223372036854775807L) {
            return;
          }
          o1();
          return;
        }
      }
      O.add(new f(J0, paramLong1, paramLong2));
    }
  }
  
  public boolean e()
  {
    boolean bool;
    if ((Q != null) && ((S()) || (U0()) || ((t0 != -9223372036854775807L) && (L().b() < t0)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void f(long paramLong1, long paramLong2)
  {
    boolean bool1 = O0;
    boolean bool2 = false;
    if (bool1)
    {
      O0 = false;
      r1();
    }
    u localu = P0;
    Object localObject;
    if (localu == null) {
      try
      {
        if (M0)
        {
          x1();
          return;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        break label202;
        if ((Q == null) && (!u1(2))) {
          return;
        }
        f1();
        if (z0)
        {
          F.a("bypassRender");
          while (j0(paramLong1, paramLong2)) {}
        }
        for (;;)
        {
          F.b();
          break label194;
          if (Z == null) {
            break;
          }
          long l = L().b();
          F.a("drainAndFeed");
          while ((y0(paramLong1, paramLong2)) && (H1(l))) {}
          while ((A0()) && (H1(l))) {}
        }
        localObject = Q0;
        d += g0(paramLong1);
        u1(1);
        label194:
        Q0.c();
        return;
        label202:
        if (c1((IllegalStateException)localObject))
        {
          h1((Exception)localObject);
          bool1 = bool2;
          if (M.a >= 21)
          {
            bool1 = bool2;
            if (e1((IllegalStateException)localObject)) {
              bool1 = true;
            }
          }
          if (bool1) {
            w1();
          }
          localObject = t0((Throwable)localObject, H0());
          int i;
          if (q == 1101) {
            i = 4006;
          } else {
            i = 4003;
          }
          throw K((Throwable)localObject, Q, bool1, i);
        }
        throw ((Throwable)localObject);
      }
    }
    P0 = null;
    throw ((Throwable)localObject);
  }
  
  public final void f1()
  {
    if ((Z == null) && (!z0))
    {
      Object localObject = Q;
      if (localObject != null)
      {
        if (a1((q)localObject))
        {
          W0((q)localObject);
          return;
        }
        C1(T);
        if ((S == null) || (Y0()))
        {
          try
          {
            p0.n localn = S;
            if ((localn != null) && (localn.f((String)g0.a.h(n)))) {
              bool = true;
            }
          }
          catch (d locald)
          {
            break label136;
          }
          boolean bool = false;
          g1(V, bool);
        }
        localObject = V;
        if ((localObject != null) && (Z == null))
        {
          ((MediaCrypto)localObject).release();
          V = null;
        }
        return;
        label136:
        throw J(locald, (q)localObject, 4001);
      }
    }
  }
  
  public final void g1(MediaCrypto paramMediaCrypto, boolean paramBoolean)
  {
    q localq = (q)g0.a.e(Q);
    Object localObject;
    if (e0 == null)
    {
      try
      {
        localObject = E0(paramBoolean);
        ArrayDeque localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        e0 = localArrayDeque;
        if (H) {
          localArrayDeque.addAll((Collection)localObject);
        }
      }
      catch (I.c paramMediaCrypto)
      {
        break label100;
      }
      if (!((List)localObject).isEmpty()) {
        e0.add((p)((List)localObject).get(0));
      }
      f0 = null;
      break label114;
      label100:
      throw new d(localq, paramMediaCrypto, paramBoolean, -49998);
    }
    label114:
    if (!e0.isEmpty())
    {
      localObject = (ArrayDeque)g0.a.e(e0);
      while (Z == null)
      {
        p localp = (p)g0.a.e((p)((ArrayDeque)localObject).peekFirst());
        if (!I1(localp)) {
          return;
        }
        try
        {
          X0(localp, paramMediaCrypto);
        }
        catch (Exception localException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to initialize decoder: ");
          localStringBuilder.append(localp);
          g0.o.i("MediaCodecRenderer", localStringBuilder.toString(), localException);
          ((ArrayDeque)localObject).removeFirst();
          d locald = new d(localq, localException, paramBoolean, localp);
          h1(locald);
          if (f0 == null) {
            f0 = locald;
          } else {
            f0 = d.a(f0, locald);
          }
        }
        if (((ArrayDeque)localObject).isEmpty()) {
          throw f0;
        }
      }
      e0 = null;
      return;
    }
    throw new d(localq, null, paramBoolean, -49999);
  }
  
  public abstract void h1(Exception paramException);
  
  public final void i0()
  {
    g0.a.f(L0 ^ true);
    v0 localv0 = N();
    L.m();
    do
    {
      L.m();
      int i = e0(localv0, L, 0);
      if (i == -5) {
        break;
      }
      if (i != -4)
      {
        if (i == -3)
        {
          if (p()) {
            K0 = J0;
          }
          return;
        }
        throw new IllegalStateException();
      }
      if (L.p())
      {
        L0 = true;
        K0 = J0;
        return;
      }
      J0 = Math.max(J0, L.t);
      if ((p()) || (K.u())) {
        K0 = J0;
      }
      if (N0)
      {
        localObject = (q)g0.a.e(Q);
        R = ((q)localObject);
        if ((Objects.equals(n, "audio/opus")) && (!R.q.isEmpty()))
        {
          i = K.f((byte[])R.q.get(0));
          R = ((q)g0.a.e(R)).a().V(i).K();
        }
        l1(R, null);
        N0 = false;
      }
      L.C();
      Object localObject = R;
      if ((localObject != null) && (Objects.equals(n, "audio/opus")))
      {
        if (L.o())
        {
          localObject = L;
          p = R;
          T0((i)localObject);
        }
        if (K.g(P(), L.t)) {
          P.a(L, eR)).q);
        }
      }
    } while ((V0()) && (M.H(L)));
    A0 = true;
    return;
    k1(localv0);
  }
  
  public abstract void i1(String paramString, m.a parama, long paramLong1, long paramLong2);
  
  public final boolean j0(long paramLong1, long paramLong2)
  {
    g0.a.f(M0 ^ true);
    if (M.U())
    {
      j localj = M;
      if (s1(paramLong1, paramLong2, null, r, v0, 0, localj.T(), M.M(), b1(P(), M.S()), M.p(), (q)g0.a.e(R)))
      {
        n1(M.S());
        M.m();
      }
      else
      {
        return false;
      }
    }
    if (L0)
    {
      M0 = true;
      return false;
    }
    if (A0)
    {
      g0.a.f(M.H(L));
      A0 = false;
    }
    if (B0)
    {
      if (M.U()) {
        return true;
      }
      u0();
      B0 = false;
      f1();
      if (!z0) {
        return false;
      }
    }
    i0();
    if (M.U()) {
      M.C();
    }
    boolean bool;
    if ((!M.U()) && (!L0) && (!B0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract void j1(String paramString);
  
  public abstract k0.p k0(p paramp, q paramq1, q paramq2);
  
  public k0.p k1(v0 paramv0)
  {
    boolean bool1 = true;
    N0 = true;
    q localq1 = (q)g0.a.e(b);
    Object localObject = n;
    if (localObject != null)
    {
      q localq2 = localq1;
      if (Objects.equals(localObject, "video/av01"))
      {
        localq2 = localq1;
        if (!q.isEmpty()) {
          localq2 = localq1.a().b0(null).K();
        }
      }
      G1(a);
      Q = localq2;
      if (z0)
      {
        B0 = true;
        return null;
      }
      localObject = Z;
      if (localObject == null)
      {
        e0 = null;
        f1();
        return null;
      }
      p localp = (p)g0.a.e(g0);
      localq1 = (q)g0.a.e(a0);
      if (z0(localp, localq2, S, T))
      {
        w0();
        return new k0.p(a, localq1, localq2, 0, 128);
      }
      if (T != S) {
        i = 1;
      } else {
        i = 0;
      }
      boolean bool2;
      if ((i != 0) && (M.a < 23)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      g0.a.f(bool2);
      paramv0 = k0(localp, localq1, localq2);
      int j = d;
      if (j != 0)
      {
        int k = 16;
        if (j != 1) {
          if (j != 2) {
            if (j == 3)
            {
              if (!N1(localq2))
              {
                i = k;
                break label489;
              }
              a0 = localq2;
              if ((i == 0) || (x0())) {
                break label486;
              }
            }
          }
        }
        for (;;)
        {
          i = 2;
          break label489;
          throw new IllegalStateException();
          if (!N1(localq2))
          {
            i = k;
            break label489;
          }
          C0 = true;
          D0 = 1;
          k = h0;
          bool2 = bool1;
          if (k != 2) {
            if ((k == 1) && (t == t) && (u == u)) {
              bool2 = bool1;
            } else {
              bool2 = false;
            }
          }
          p0 = bool2;
          a0 = localq2;
          if ((i == 0) || (x0())) {
            break;
          }
          continue;
          if (!N1(localq2))
          {
            i = k;
            break label489;
          }
          a0 = localq2;
          if (i != 0) {
            if (x0()) {
              break;
            }
          } else {
            if (v0()) {
              break;
            }
          }
        }
      }
      else
      {
        w0();
      }
      label486:
      int i = 0;
      label489:
      if ((d != 0) && ((Z != localObject) || (F0 == 3))) {
        return new k0.p(a, localq1, localq2, 0, i);
      }
      return paramv0;
    }
    throw J(new IllegalArgumentException("Sample MIME type is null."), localq1, 4005);
  }
  
  public final int l0(String paramString)
  {
    int i = M.a;
    if ((i <= 25) && ("OMX.Exynos.avc.dec.secure".equals(paramString)))
    {
      String str = M.d;
      if ((str.startsWith("SM-T585")) || (str.startsWith("SM-A510")) || (str.startsWith("SM-A520")) || (str.startsWith("SM-J700"))) {
        return 2;
      }
    }
    if ((i < 24) && (("OMX.Nvidia.h264.decode".equals(paramString)) || ("OMX.Nvidia.h264.decode.secure".equals(paramString))))
    {
      paramString = M.b;
      if (("flounder".equals(paramString)) || ("flounder_lte".equals(paramString)) || ("grouper".equals(paramString)) || ("tilapia".equals(paramString))) {
        return 1;
      }
    }
    return 0;
  }
  
  public abstract void l1(q paramq, MediaFormat paramMediaFormat);
  
  public void m1(long paramLong) {}
  
  public void n1(long paramLong)
  {
    S0 = paramLong;
    while ((!O.isEmpty()) && (paramLong >= O.peek()).a))
    {
      D1((f)g0.a.e((f)O.poll()));
      o1();
    }
  }
  
  public void o1() {}
  
  public void p1(i parami) {}
  
  public final long q(long paramLong1, long paramLong2)
  {
    return M0(s0, paramLong1, paramLong2);
  }
  
  public void q1(q paramq) {}
  
  public final void r1()
  {
    int i = F0;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          M0 = true;
          x1();
        }
        else
        {
          v1();
        }
      }
      else
      {
        B0();
        O1();
      }
    }
    else {
      B0();
    }
  }
  
  public final int s()
  {
    return 8;
  }
  
  public abstract boolean s1(long paramLong1, long paramLong2, m paramm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, q paramq);
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt == 11) {
      U = ((Y0.a)paramObject);
    } else {
      super.t(paramInt, paramObject);
    }
  }
  
  public o t0(Throwable paramThrowable, p paramp)
  {
    return new o(paramThrowable, paramp);
  }
  
  public final void t1()
  {
    I0 = true;
    MediaFormat localMediaFormat = ((m)g0.a.e(Z)).h();
    if ((h0 != 0) && (localMediaFormat.getInteger("width") == 32) && (localMediaFormat.getInteger("height") == 32))
    {
      q0 = true;
      return;
    }
    if (o0) {
      localMediaFormat.setInteger("channel-count", 1);
    }
    b0 = localMediaFormat;
    c0 = true;
  }
  
  public final void u0()
  {
    B0 = false;
    M.m();
    L.m();
    A0 = false;
    z0 = false;
    P.d();
  }
  
  public final boolean u1(int paramInt)
  {
    v0 localv0 = N();
    J.m();
    paramInt = e0(localv0, J, paramInt | 0x4);
    if (paramInt == -5)
    {
      k1(localv0);
      return true;
    }
    if ((paramInt == -4) && (J.p()))
    {
      L0 = true;
      r1();
    }
    return false;
  }
  
  public final boolean v0()
  {
    if (G0)
    {
      E0 = 1;
      if ((!j0) && (!l0))
      {
        F0 = 1;
      }
      else
      {
        F0 = 3;
        return false;
      }
    }
    return true;
  }
  
  public final void v1()
  {
    w1();
    f1();
  }
  
  public final void w0()
  {
    if (G0)
    {
      E0 = 1;
      F0 = 3;
    }
    else
    {
      v1();
    }
  }
  
  public void w1()
  {
    try
    {
      Object localObject1 = Z;
      if (localObject1 != null)
      {
        ((m)localObject1).release();
        localObject1 = Q0;
        b += 1;
        j1(eg0)).a);
      }
    }
    finally
    {
      break label110;
    }
    Z = null;
    try
    {
      MediaCrypto localMediaCrypto1 = V;
      if (localMediaCrypto1 != null) {
        localMediaCrypto1.release();
      }
    }
    finally
    {
      break label94;
    }
    V = null;
    C1(null);
    z1();
    return;
    label94:
    V = null;
    C1(null);
    z1();
    throw ((Throwable)localObject3);
    label110:
    Z = null;
    try
    {
      MediaCrypto localMediaCrypto2 = V;
      if (localMediaCrypto2 != null) {
        localMediaCrypto2.release();
      }
    }
    finally
    {
      break label151;
    }
    V = null;
    C1(null);
    z1();
    throw ((Throwable)localObject4);
    label151:
    V = null;
    C1(null);
    z1();
    throw ((Throwable)localObject4);
  }
  
  public final boolean x0()
  {
    if (G0)
    {
      E0 = 1;
      if ((!j0) && (!l0))
      {
        F0 = 2;
      }
      else
      {
        F0 = 3;
        return false;
      }
    }
    else
    {
      O1();
    }
    return true;
  }
  
  public void x1() {}
  
  /* Error */
  public final boolean y0(long paramLong1, long paramLong2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 391	t0/w:Z	Lt0/m;
    //   4: invokestatic 155	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   7: checkcast 400	t0/m
    //   10: astore 5
    //   12: aload_0
    //   13: invokevirtual 925	t0/w:U0	()Z
    //   16: ifne +372 -> 388
    //   19: aload_0
    //   20: getfield 853	t0/w:m0	Z
    //   23: ifeq +45 -> 68
    //   26: aload_0
    //   27: getfield 415	t0/w:H0	Z
    //   30: ifeq +38 -> 68
    //   33: aload 5
    //   35: aload_0
    //   36: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   39: invokeinterface 1165 2 0
    //   44: istore 6
    //   46: goto +35 -> 81
    //   49: astore 5
    //   51: aload_0
    //   52: invokevirtual 463	t0/w:r1	()V
    //   55: aload_0
    //   56: getfield 765	t0/w:M0	Z
    //   59: ifeq +7 -> 66
    //   62: aload_0
    //   63: invokevirtual 608	t0/w:w1	()V
    //   66: iconst_0
    //   67: ireturn
    //   68: aload 5
    //   70: aload_0
    //   71: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   74: invokeinterface 1165 2 0
    //   79: istore 6
    //   81: iload 6
    //   83: ifge +44 -> 127
    //   86: iload 6
    //   88: bipush -2
    //   90: if_icmpne +9 -> 99
    //   93: aload_0
    //   94: invokevirtual 1167	t0/w:t1	()V
    //   97: iconst_1
    //   98: ireturn
    //   99: aload_0
    //   100: getfield 413	t0/w:r0	Z
    //   103: ifeq +22 -> 125
    //   106: aload_0
    //   107: getfield 393	t0/w:L0	Z
    //   110: ifne +11 -> 121
    //   113: aload_0
    //   114: getfield 247	t0/w:E0	I
    //   117: iconst_2
    //   118: if_icmpne +7 -> 125
    //   121: aload_0
    //   122: invokevirtual 463	t0/w:r1	()V
    //   125: iconst_0
    //   126: ireturn
    //   127: aload_0
    //   128: getfield 1148	t0/w:q0	Z
    //   131: ifeq +20 -> 151
    //   134: aload_0
    //   135: iconst_0
    //   136: putfield 1148	t0/w:q0	Z
    //   139: aload 5
    //   141: iload 6
    //   143: iconst_0
    //   144: invokeinterface 1170 3 0
    //   149: iconst_1
    //   150: ireturn
    //   151: aload_0
    //   152: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   155: astore 7
    //   157: aload 7
    //   159: getfield 1172	android/media/MediaCodec$BufferInfo:size	I
    //   162: ifne +19 -> 181
    //   165: aload 7
    //   167: getfield 1175	android/media/MediaCodec$BufferInfo:flags	I
    //   170: iconst_4
    //   171: iand
    //   172: ifeq +9 -> 181
    //   175: aload_0
    //   176: invokevirtual 463	t0/w:r1	()V
    //   179: iconst_0
    //   180: ireturn
    //   181: aload_0
    //   182: iload 6
    //   184: putfield 237	t0/w:v0	I
    //   187: aload 5
    //   189: iload 6
    //   191: invokeinterface 1177 2 0
    //   196: astore 7
    //   198: aload_0
    //   199: aload 7
    //   201: putfield 566	t0/w:w0	Ljava/nio/ByteBuffer;
    //   204: aload 7
    //   206: ifnull +45 -> 251
    //   209: aload 7
    //   211: aload_0
    //   212: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   215: getfield 1180	android/media/MediaCodec$BufferInfo:offset	I
    //   218: invokevirtual 1183	java/nio/ByteBuffer:position	(I)Ljava/nio/Buffer;
    //   221: pop
    //   222: aload_0
    //   223: getfield 566	t0/w:w0	Ljava/nio/ByteBuffer;
    //   226: astore 8
    //   228: aload_0
    //   229: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   232: astore 7
    //   234: aload 8
    //   236: aload 7
    //   238: getfield 1180	android/media/MediaCodec$BufferInfo:offset	I
    //   241: aload 7
    //   243: getfield 1172	android/media/MediaCodec$BufferInfo:size	I
    //   246: iadd
    //   247: invokevirtual 1185	java/nio/ByteBuffer:limit	(I)Ljava/nio/Buffer;
    //   250: pop
    //   251: aload_0
    //   252: getfield 857	t0/w:n0	Z
    //   255: ifeq +49 -> 304
    //   258: aload_0
    //   259: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   262: astore 7
    //   264: aload 7
    //   266: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   269: lconst_0
    //   270: lcmp
    //   271: ifne +33 -> 304
    //   274: aload 7
    //   276: getfield 1175	android/media/MediaCodec$BufferInfo:flags	I
    //   279: iconst_4
    //   280: iand
    //   281: ifeq +23 -> 304
    //   284: aload_0
    //   285: getfield 241	t0/w:J0	J
    //   288: ldc2_w 191
    //   291: lcmp
    //   292: ifeq +12 -> 304
    //   295: aload 7
    //   297: aload_0
    //   298: getfield 243	t0/w:K0	J
    //   301: putfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   304: aload_0
    //   305: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   308: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   311: aload_0
    //   312: invokevirtual 756	k0/n:P	()J
    //   315: lcmp
    //   316: ifge +9 -> 325
    //   319: iconst_1
    //   320: istore 9
    //   322: goto +6 -> 328
    //   325: iconst_0
    //   326: istore 9
    //   328: aload_0
    //   329: iload 9
    //   331: putfield 1190	t0/w:x0	Z
    //   334: aload_0
    //   335: getfield 243	t0/w:K0	J
    //   338: lstore 10
    //   340: lload 10
    //   342: ldc2_w 191
    //   345: lcmp
    //   346: ifeq +22 -> 368
    //   349: lload 10
    //   351: aload_0
    //   352: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   355: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   358: lcmp
    //   359: ifgt +9 -> 368
    //   362: iconst_1
    //   363: istore 9
    //   365: goto +6 -> 371
    //   368: iconst_0
    //   369: istore 9
    //   371: aload_0
    //   372: iload 9
    //   374: putfield 1192	t0/w:y0	Z
    //   377: aload_0
    //   378: aload_0
    //   379: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   382: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   385: invokevirtual 1194	t0/w:P1	(J)V
    //   388: aload_0
    //   389: getfield 853	t0/w:m0	Z
    //   392: ifeq +113 -> 505
    //   395: aload_0
    //   396: getfield 415	t0/w:H0	Z
    //   399: ifeq +106 -> 505
    //   402: aload_0
    //   403: getfield 566	t0/w:w0	Ljava/nio/ByteBuffer;
    //   406: astore 7
    //   408: aload_0
    //   409: getfield 237	t0/w:v0	I
    //   412: istore 12
    //   414: aload_0
    //   415: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   418: astore 8
    //   420: aload 8
    //   422: getfield 1175	android/media/MediaCodec$BufferInfo:flags	I
    //   425: istore 6
    //   427: aload 8
    //   429: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   432: lstore 10
    //   434: aload_0
    //   435: getfield 1190	t0/w:x0	Z
    //   438: istore 9
    //   440: aload_0
    //   441: getfield 1192	t0/w:y0	Z
    //   444: istore 13
    //   446: aload_0
    //   447: getfield 735	t0/w:R	Ld0/q;
    //   450: invokestatic 155	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   453: checkcast 258	d0/q
    //   456: astore 8
    //   458: aload_0
    //   459: lload_1
    //   460: lload_3
    //   461: aload 5
    //   463: aload 7
    //   465: iload 12
    //   467: iload 6
    //   469: iconst_1
    //   470: lload 10
    //   472: iload 9
    //   474: iload 13
    //   476: aload 8
    //   478: invokevirtual 1048	t0/w:s1	(JJLt0/m;Ljava/nio/ByteBuffer;IIIJZZLd0/q;)Z
    //   481: istore 9
    //   483: goto +83 -> 566
    //   486: astore 5
    //   488: aload_0
    //   489: invokevirtual 463	t0/w:r1	()V
    //   492: aload_0
    //   493: getfield 765	t0/w:M0	Z
    //   496: ifeq +7 -> 503
    //   499: aload_0
    //   500: invokevirtual 608	t0/w:w1	()V
    //   503: iconst_0
    //   504: ireturn
    //   505: aload_0
    //   506: getfield 566	t0/w:w0	Ljava/nio/ByteBuffer;
    //   509: astore 7
    //   511: aload_0
    //   512: getfield 237	t0/w:v0	I
    //   515: istore 6
    //   517: aload_0
    //   518: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   521: astore 8
    //   523: aload_0
    //   524: lload_1
    //   525: lload_3
    //   526: aload 5
    //   528: aload 7
    //   530: iload 6
    //   532: aload 8
    //   534: getfield 1175	android/media/MediaCodec$BufferInfo:flags	I
    //   537: iconst_1
    //   538: aload 8
    //   540: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   543: aload_0
    //   544: getfield 1190	t0/w:x0	Z
    //   547: aload_0
    //   548: getfield 1192	t0/w:y0	Z
    //   551: aload_0
    //   552: getfield 735	t0/w:R	Ld0/q;
    //   555: invokestatic 155	g0/a:e	(Ljava/lang/Object;)Ljava/lang/Object;
    //   558: checkcast 258	d0/q
    //   561: invokevirtual 1048	t0/w:s1	(JJLt0/m;Ljava/nio/ByteBuffer;IIIJZZLd0/q;)Z
    //   564: istore 9
    //   566: iload 9
    //   568: ifeq +50 -> 618
    //   571: aload_0
    //   572: aload_0
    //   573: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   576: getfield 1188	android/media/MediaCodec$BufferInfo:presentationTimeUs	J
    //   579: invokevirtual 1051	t0/w:n1	(J)V
    //   582: aload_0
    //   583: getfield 186	t0/w:N	Landroid/media/MediaCodec$BufferInfo;
    //   586: getfield 1175	android/media/MediaCodec$BufferInfo:flags	I
    //   589: iconst_4
    //   590: iand
    //   591: ifeq +9 -> 600
    //   594: iconst_1
    //   595: istore 6
    //   597: goto +6 -> 603
    //   600: iconst_0
    //   601: istore 6
    //   603: aload_0
    //   604: invokevirtual 1196	t0/w:B1	()V
    //   607: iload 6
    //   609: ifne +5 -> 614
    //   612: iconst_1
    //   613: ireturn
    //   614: aload_0
    //   615: invokevirtual 463	t0/w:r1	()V
    //   618: iconst_0
    //   619: ireturn
    //   620: astore 5
    //   622: goto -134 -> 488
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	625	0	this	w
    //   0	625	1	paramLong1	long
    //   0	625	3	paramLong2	long
    //   10	24	5	localm	m
    //   49	413	5	localIllegalStateException1	IllegalStateException
    //   486	41	5	localIllegalStateException2	IllegalStateException
    //   620	1	5	localIllegalStateException3	IllegalStateException
    //   44	564	6	i	int
    //   155	374	7	localObject1	Object
    //   226	313	8	localObject2	Object
    //   320	247	9	bool1	boolean
    //   338	133	10	l	long
    //   412	54	12	j	int
    //   444	31	13	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   33	46	49	java/lang/IllegalStateException
    //   402	458	486	java/lang/IllegalStateException
    //   458	483	620	java/lang/IllegalStateException
  }
  
  public void y1()
  {
    A1();
    B1();
    t0 = -9223372036854775807L;
    H0 = false;
    G0 = false;
    p0 = false;
    q0 = false;
    x0 = false;
    y0 = false;
    J0 = -9223372036854775807L;
    K0 = -9223372036854775807L;
    S0 = -9223372036854775807L;
    E0 = 0;
    F0 = 0;
    D0 = C0;
  }
  
  public final boolean z0(p paramp, q paramq, p0.n paramn1, p0.n paramn2)
  {
    boolean bool1 = false;
    if (paramn1 == paramn2) {
      return false;
    }
    if ((paramn2 != null) && (paramn1 != null))
    {
      b localb = paramn2.h();
      if (localb == null) {
        return true;
      }
      Object localObject = paramn1.h();
      if ((localObject != null) && (localb.getClass().equals(localObject.getClass())))
      {
        if (!(localb instanceof G)) {
          return false;
        }
        if (!paramn2.d().equals(paramn1.d())) {
          return true;
        }
        if (M.a < 23) {
          return true;
        }
        localObject = g.e;
        if ((!((UUID)localObject).equals(paramn1.d())) && (!((UUID)localObject).equals(paramn2.d())))
        {
          boolean bool2 = bool1;
          if (!g)
          {
            bool2 = bool1;
            if (paramn2.f((String)g0.a.e(n))) {
              bool2 = true;
            }
          }
          return bool2;
        }
      }
    }
    return true;
  }
  
  public void z1()
  {
    y1();
    P0 = null;
    e0 = null;
    g0 = null;
    a0 = null;
    b0 = null;
    c0 = false;
    I0 = false;
    d0 = -1.0F;
    h0 = 0;
    i0 = false;
    j0 = false;
    k0 = false;
    l0 = false;
    m0 = false;
    n0 = false;
    o0 = false;
    r0 = false;
    s0 = false;
    C0 = false;
    D0 = 0;
  }
  
  public static final abstract class b
  {
    public static boolean a(m paramm, w.e parame)
    {
      return paramm.l(parame);
    }
  }
  
  public static final abstract class c
  {
    public static void a(m.a parama, y1 paramy1)
    {
      paramy1 = paramy1.a();
      if (!O.a(paramy1, g0.a())) {
        b.setString("log-session-id", x.a(paramy1));
      }
    }
  }
  
  public static class d
    extends Exception
  {
    public final String o;
    public final boolean p;
    public final p q;
    public final String r;
    public final d s;
    
    public d(q paramq, Throwable paramThrowable, boolean paramBoolean, int paramInt)
    {
      this(localStringBuilder.toString(), paramThrowable, n, paramBoolean, null, b(paramInt), null);
    }
    
    public d(q paramq, Throwable paramThrowable, boolean paramBoolean, p paramp)
    {
      this((String)localObject, paramThrowable, str, paramBoolean, paramp, paramq, null);
    }
    
    public d(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, p paramp, String paramString3, d paramd)
    {
      super(paramThrowable);
      o = paramString2;
      p = paramBoolean;
      q = paramp;
      r = paramString3;
      s = paramd;
    }
    
    public static String b(int paramInt)
    {
      String str;
      if (paramInt < 0) {
        str = "neg_";
      } else {
        str = "";
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("androidx.media3.exoplayer.mediacodec");
      localStringBuilder.append(".MediaCodecRenderer_");
      localStringBuilder.append(str);
      localStringBuilder.append(Math.abs(paramInt));
      return localStringBuilder.toString();
    }
    
    public static String d(Throwable paramThrowable)
    {
      if ((paramThrowable instanceof MediaCodec.CodecException)) {
        return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
      }
      return null;
    }
    
    public final d c(d paramd)
    {
      return new d(getMessage(), getCause(), o, p, q, r, paramd);
    }
  }
  
  public final class e
    implements m.c
  {
    public e() {}
    
    public void a()
    {
      if (w.h0(w.this) != null) {
        w.h0(w.this).b();
      }
    }
    
    public void b()
    {
      if (w.h0(w.this) != null) {
        w.h0(w.this).b();
      }
    }
  }
  
  public static final class f
  {
    public static final f e = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
    public final long a;
    public final long b;
    public final long c;
    public final D d;
    
    public f(long paramLong1, long paramLong2, long paramLong3)
    {
      a = paramLong1;
      b = paramLong2;
      c = paramLong3;
      d = new D();
    }
  }
}

/* Location:
 * Qualified Name:     t0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */