package m0;

import F0.W;
import X2.v;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import d0.C;
import d0.b;
import d0.e;
import d0.q;
import d0.q.b;
import g0.M;
import g0.a;
import g0.c;
import g0.r;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import k0.A0;
import k0.Y0.a;
import k0.Z0;
import k0.b1;
import k0.n;
import k0.v0;
import t0.I;
import t0.m;
import t0.m.a;
import t0.m.b;
import t0.w;

public class b0
  extends w
  implements A0
{
  public final Context V0;
  public final x.a W0;
  public final z X0;
  public int Y0;
  public boolean Z0;
  public boolean a1;
  public q b1;
  public q c1;
  public long d1;
  public boolean e1;
  public boolean f1;
  public boolean g1;
  public int h1;
  public boolean i1;
  public long j1;
  
  public b0(Context paramContext, m.b paramb, t0.z paramz, boolean paramBoolean, Handler paramHandler, x paramx, z paramz1)
  {
    super(1, paramb, paramz, paramBoolean, 44100.0F);
    V0 = paramContext.getApplicationContext();
    X0 = paramz1;
    h1 = 64536;
    W0 = new x.a(paramHandler, paramx);
    j1 = -9223372036854775807L;
    paramz1.C(new c(null));
  }
  
  public static boolean V1(String paramString)
  {
    if ((M.a < 24) && ("OMX.SEC.aac.dec".equals(paramString)) && ("samsung".equals(M.c)))
    {
      paramString = M.b;
      if ((paramString.startsWith("zeroflte")) || (paramString.startsWith("herolte")) || (paramString.startsWith("heroqlte"))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public static boolean W1(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("OMX.google.opus.decoder")) && (!paramString.equals("c2.android.opus.decoder")) && (!paramString.equals("OMX.google.vorbis.decoder")) && (!paramString.equals("c2.android.vorbis.decoder"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean X1()
  {
    if (M.a == 23)
    {
      String str = M.d;
      if (("ZTE B2017G".equals(str)) || ("AXON 7 mini".equals(str))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private int Z1(t0.p paramp, q paramq)
  {
    if ("OMX.google.raw.decoder".equals(a))
    {
      int i = M.a;
      if ((i < 24) && ((i != 23) || (!M.E0(V0)))) {
        return -1;
      }
    }
    return o;
  }
  
  public static List b2(t0.z paramz, q paramq, boolean paramBoolean, z paramz1)
  {
    if (n == null) {
      return v.Y();
    }
    if (paramz1.a(paramq))
    {
      paramz1 = I.x();
      if (paramz1 != null) {
        return v.Z(paramz1);
      }
    }
    return I.v(paramz, paramq, paramBoolean, false);
  }
  
  public A0 B()
  {
    return this;
  }
  
  public long H()
  {
    if (getState() == 2) {
      f2();
    }
    return d1;
  }
  
  public float J0(float paramFloat, q paramq, q[] paramArrayOfq)
  {
    int i = paramArrayOfq.length;
    int j = 0;
    int n;
    for (int k = -1; j < i; k = n)
    {
      int m = C;
      n = k;
      if (m != -1) {
        n = Math.max(k, m);
      }
      j++;
    }
    if (k == -1) {
      paramFloat = -1.0F;
    } else {
      paramFloat *= k;
    }
    return paramFloat;
  }
  
  public boolean K1(q paramq)
  {
    if (Ma != 0)
    {
      int i = Y1(paramq);
      if (((i & 0x200) != 0) && ((Ma == 2) || ((i & 0x400) != 0) || ((E == 0) && (F == 0)))) {
        return true;
      }
    }
    return X0.a(paramq);
  }
  
  public List L0(t0.z paramz, q paramq, boolean paramBoolean)
  {
    return I.w(b2(paramz, paramq, paramBoolean, X0), paramq);
  }
  
  public int L1(t0.z paramz, q paramq)
  {
    boolean bool1 = d0.z.o(n);
    int i = 0;
    if (!bool1) {
      return Z0.a(0);
    }
    int j;
    if (M.a >= 21) {
      j = 32;
    } else {
      j = 0;
    }
    int k = K;
    bool1 = true;
    if (k != 0) {
      k = 1;
    } else {
      k = 0;
    }
    boolean bool2 = w.M1(paramq);
    if ((bool2) && ((k == 0) || (I.x() != null)))
    {
      k = Y1(paramq);
      if (X0.a(paramq)) {
        return Z0.b(4, 8, j, k);
      }
    }
    else
    {
      k = 0;
    }
    if (("audio/raw".equals(n)) && (!X0.a(paramq))) {
      return Z0.a(1);
    }
    if (!X0.a(M.f0(2, B, C))) {
      return Z0.a(1);
    }
    List localList = b2(paramz, paramq, false, X0);
    if (localList.isEmpty()) {
      return Z0.a(1);
    }
    if (!bool2) {
      return Z0.a(2);
    }
    t0.p localp = (t0.p)localList.get(0);
    bool2 = localp.m(paramq);
    if (!bool2) {
      for (m = 1; m < localList.size(); m++)
      {
        paramz = (t0.p)localList.get(m);
        if (paramz.m(paramq))
        {
          m = 0;
          break label299;
        }
      }
    }
    int m = 1;
    bool1 = bool2;
    paramz = localp;
    label299:
    int n;
    if (bool1) {
      n = 4;
    } else {
      n = 3;
    }
    int i2;
    if ((bool1) && (paramz.p(paramq))) {
      i2 = 16;
    } else {
      i2 = 8;
    }
    int i3;
    if (h) {
      i3 = 64;
    } else {
      i3 = 0;
    }
    if (m != 0) {
      i = 128;
    }
    return Z0.d(n, i2, j, i3, i, k);
  }
  
  public long M0(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    long l = j1;
    if (l != -9223372036854775807L)
    {
      float f2 = (float)(l - paramLong1);
      float f3;
      if (h() != null) {
        f3 = ha;
      } else {
        f3 = 1.0F;
      }
      l = (f2 / f3 / 2.0F);
      paramLong1 = l;
      if (i1) {
        paramLong1 = l - (M.J0(L().b()) - paramLong2);
      }
      return Math.max(10000L, paramLong1);
    }
    return super.M0(paramBoolean, paramLong1, paramLong2);
  }
  
  public m.a O0(t0.p paramp, q paramq, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    Y0 = a2(paramp, paramq, R());
    Z0 = V1(a);
    a1 = W1(a);
    MediaFormat localMediaFormat = c2(paramq, c, Y0, paramFloat);
    q localq;
    if (("audio/raw".equals(b)) && (!"audio/raw".equals(n))) {
      localq = paramq;
    } else {
      localq = null;
    }
    c1 = localq;
    return m.a.a(paramp, localMediaFormat, paramq, paramMediaCrypto);
  }
  
  /* Error */
  public void T()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 355	m0/b0:f1	Z
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 357	m0/b0:b1	Ld0/q;
    //   10: aload_0
    //   11: getfield 52	m0/b0:X0	Lm0/z;
    //   14: invokeinterface 360 1 0
    //   19: aload_0
    //   20: invokespecial 362	t0/w:T	()V
    //   23: aload_0
    //   24: getfield 61	m0/b0:W0	Lm0/x$a;
    //   27: aload_0
    //   28: getfield 366	t0/w:Q0	Lk0/o;
    //   31: invokevirtual 370	m0/x$a:s	(Lk0/o;)V
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: getfield 61	m0/b0:W0	Lm0/x$a;
    //   40: aload_0
    //   41: getfield 366	t0/w:Q0	Lk0/o;
    //   44: invokevirtual 370	m0/x$a:s	(Lk0/o;)V
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_0
    //   51: invokespecial 362	t0/w:T	()V
    //   54: aload_0
    //   55: getfield 61	m0/b0:W0	Lm0/x$a;
    //   58: aload_0
    //   59: getfield 366	t0/w:Q0	Lk0/o;
    //   62: invokevirtual 370	m0/x$a:s	(Lk0/o;)V
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 61	m0/b0:W0	Lm0/x$a;
    //   72: aload_0
    //   73: getfield 366	t0/w:Q0	Lk0/o;
    //   76: invokevirtual 370	m0/x$a:s	(Lk0/o;)V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	b0
    //   35	13	1	localObject1	Object
    //   49	17	1	localObject2	Object
    //   67	13	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   19	23	35	finally
    //   10	19	49	finally
    //   50	54	67	finally
  }
  
  public void T0(i parami)
  {
    if (M.a >= 29)
    {
      Object localObject = p;
      if ((localObject != null) && (Objects.equals(n, "audio/opus")) && (Z0()))
      {
        localObject = (ByteBuffer)a.e(u);
        int i = ep)).E;
        if (((Buffer)localObject).remaining() == 8)
        {
          int j = (int)(((ByteBuffer)localObject).order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000L / 1000000000L);
          X0.q(i, j);
        }
      }
    }
  }
  
  public void U(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.U(paramBoolean1, paramBoolean2);
    W0.t(Q0);
    if (Mb) {
      X0.e();
    } else {
      X0.x();
    }
    X0.t(Q());
    X0.A(L());
  }
  
  public void W(long paramLong, boolean paramBoolean)
  {
    super.W(paramLong, paramBoolean);
    X0.flush();
    d1 = paramLong;
    g1 = false;
    e1 = true;
  }
  
  public void X()
  {
    X0.release();
  }
  
  public final int Y1(q paramq)
  {
    paramq = X0.r(paramq);
    if (!a) {
      return 0;
    }
    int i;
    if (b) {
      i = 1536;
    } else {
      i = 512;
    }
    int j = i;
    if (c) {
      j = i | 0x800;
    }
    return j;
  }
  
  public void Z()
  {
    g1 = false;
    try
    {
      super.Z();
      return;
    }
    finally
    {
      if (f1)
      {
        f1 = false;
        X0.b();
      }
    }
  }
  
  public void a0()
  {
    super.a0();
    X0.p();
    i1 = true;
  }
  
  public int a2(t0.p paramp, q paramq, q[] paramArrayOfq)
  {
    int i = Z1(paramp, paramq);
    if (paramArrayOfq.length == 1) {
      return i;
    }
    int j = paramArrayOfq.length;
    int k = 0;
    while (k < j)
    {
      q localq = paramArrayOfq[k];
      int m = i;
      if (ed != 0) {
        m = Math.max(i, Z1(paramp, localq));
      }
      k++;
      i = m;
    }
    return i;
  }
  
  public void b0()
  {
    f2();
    i1 = false;
    X0.j();
    super.b0();
  }
  
  public boolean c()
  {
    boolean bool;
    if ((super.c()) && (X0.c())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public MediaFormat c2(q paramq, String paramString, int paramInt, float paramFloat)
  {
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", paramString);
    localMediaFormat.setInteger("channel-count", B);
    localMediaFormat.setInteger("sample-rate", C);
    r.e(localMediaFormat, q);
    r.d(localMediaFormat, "max-input-size", paramInt);
    paramInt = M.a;
    if (paramInt >= 23)
    {
      localMediaFormat.setInteger("priority", 0);
      if ((paramFloat != -1.0F) && (!X1())) {
        localMediaFormat.setFloat("operating-rate", paramFloat);
      }
    }
    if ((paramInt <= 28) && ("audio/ac4".equals(n))) {
      localMediaFormat.setInteger("ac4-is-sync", 1);
    }
    if ((paramInt >= 24) && (X0.o(M.f0(4, B, C)) == 2)) {
      localMediaFormat.setInteger("pcm-encoding", 4);
    }
    if (paramInt >= 32) {
      localMediaFormat.setInteger("max-output-channel-count", 99);
    }
    if (paramInt >= 35) {
      localMediaFormat.setInteger("importance", Math.max(0, -h1));
    }
    return localMediaFormat;
  }
  
  public String d()
  {
    return "MediaCodecAudioRenderer";
  }
  
  public void d2()
  {
    e1 = true;
  }
  
  public boolean e()
  {
    boolean bool;
    if ((!X0.i()) && (!super.e())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void e2()
  {
    m localm = F0();
    if (localm == null) {
      return;
    }
    if (M.a >= 35)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("importance", Math.max(0, -h1));
      localm.c(localBundle);
    }
  }
  
  public final void f2()
  {
    long l = X0.w(c());
    if (l != Long.MIN_VALUE)
    {
      if (!e1) {
        l = Math.max(d1, l);
      }
      d1 = l;
      e1 = false;
    }
  }
  
  public C h()
  {
    return X0.h();
  }
  
  public void h1(Exception paramException)
  {
    g0.o.d("MediaCodecAudioRenderer", "Audio codec error", paramException);
    W0.m(paramException);
  }
  
  public void i1(String paramString, m.a parama, long paramLong1, long paramLong2)
  {
    W0.q(paramString, paramLong1, paramLong2);
  }
  
  public void j1(String paramString)
  {
    W0.r(paramString);
  }
  
  public void k(C paramC)
  {
    X0.k(paramC);
  }
  
  public k0.p k0(t0.p paramp, q paramq1, q paramq2)
  {
    k0.p localp = paramp.e(paramq1, paramq2);
    int i = e;
    int j = i;
    if (a1(paramq2)) {
      j = i | 0x8000;
    }
    i = j;
    if (Z1(paramp, paramq2) > Y0) {
      i = j | 0x40;
    }
    paramp = a;
    if (i != 0) {}
    for (j = 0;; j = d) {
      break;
    }
    return new k0.p(paramp, paramq1, paramq2, j, i);
  }
  
  public k0.p k1(v0 paramv0)
  {
    q localq = (q)a.e(b);
    b1 = localq;
    paramv0 = super.k1(paramv0);
    W0.u(localq, paramv0);
    return paramv0;
  }
  
  public void l1(q paramq, MediaFormat paramMediaFormat)
  {
    q localq1 = c1;
    q localq2 = null;
    int[] arrayOfInt = null;
    if (localq1 != null)
    {
      paramq = localq1;
      paramMediaFormat = localq2;
    }
    else if (F0() == null)
    {
      paramMediaFormat = localq2;
    }
    else
    {
      a.e(paramMediaFormat);
      int i;
      if ("audio/raw".equals(n)) {
        i = D;
      } else if ((M.a >= 24) && (paramMediaFormat.containsKey("pcm-encoding"))) {
        i = paramMediaFormat.getInteger("pcm-encoding");
      } else if (paramMediaFormat.containsKey("v-bits-per-sample")) {
        i = M.e0(paramMediaFormat.getInteger("v-bits-per-sample"));
      } else {
        i = 2;
      }
      localq2 = new q.b().o0("audio/raw").i0(i).V(E).W(F).h0(k).T(l).a0(a).c0(b).d0(c).e0(d).q0(e).m0(f).N(paramMediaFormat.getInteger("channel-count")).p0(paramMediaFormat.getInteger("sample-rate")).K();
      if ((Z0) && (B == 6))
      {
        i = B;
        if (i < 6)
        {
          arrayOfInt = new int[i];
          for (i = 0;; i++)
          {
            paramMediaFormat = arrayOfInt;
            if (i >= B) {
              break;
            }
            arrayOfInt[i] = i;
          }
        }
      }
      for (;;)
      {
        paramq = localq2;
        break;
        paramMediaFormat = arrayOfInt;
        if (a1) {
          paramMediaFormat = W.a(B);
        }
      }
    }
    try
    {
      if (M.a < 29) {
        break label384;
      }
      if ((Z0()) && (Ma != 0)) {
        X0.v(Ma);
      }
    }
    catch (z.b paramq)
    {
      break label397;
    }
    X0.v(0);
    label384:
    X0.z(paramq, 0, paramMediaFormat);
    return;
    label397:
    throw J(paramq, o, 5001);
  }
  
  public void m1(long paramLong)
  {
    X0.y(paramLong);
  }
  
  public void o1()
  {
    super.o1();
    X0.B();
  }
  
  public boolean r()
  {
    boolean bool = g1;
    g1 = false;
    return bool;
  }
  
  public boolean s1(long paramLong1, long paramLong2, m paramm, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, q paramq)
  {
    a.e(paramByteBuffer);
    j1 = -9223372036854775807L;
    if ((c1 != null) && ((paramInt2 & 0x2) != 0))
    {
      ((m)a.e(paramm)).f(paramInt1, false);
      return true;
    }
    if (paramBoolean1)
    {
      if (paramm != null) {
        paramm.f(paramInt1, false);
      }
      paramm = Q0;
      f += paramInt3;
      X0.B();
      return true;
    }
    try
    {
      paramBoolean1 = X0.u(paramByteBuffer, paramLong3, paramInt3);
      if (paramBoolean1)
      {
        if (paramm != null) {
          paramm.f(paramInt1, false);
        }
        paramm = Q0;
        e += paramInt3;
        return true;
      }
      j1 = paramLong3;
      return false;
    }
    catch (z.f paramm) {}catch (z.c paramByteBuffer) {}
    paramBoolean1 = p;
    if ((Z0()) && (Ma != 0)) {
      paramInt1 = 5003;
    } else {
      paramInt1 = 5002;
    }
    throw K(paramm, paramq, paramBoolean1, paramInt1);
    paramm = b1;
    paramBoolean1 = p;
    if ((Z0()) && (Ma != 0)) {
      paramInt1 = 5004;
    } else {
      paramInt1 = 5001;
    }
    throw K(paramByteBuffer, paramm, paramBoolean1, paramInt1);
  }
  
  public void t(int paramInt, Object paramObject)
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 6)
        {
          if (paramInt != 12)
          {
            if (paramInt != 16)
            {
              if (paramInt != 9)
              {
                if (paramInt != 10) {
                  super.t(paramInt, paramObject);
                } else {
                  X0.n(((Integer)a.e(paramObject)).intValue());
                }
              }
              else {
                X0.d(((Boolean)a.e(paramObject)).booleanValue());
              }
            }
            else
            {
              h1 = ((Integer)a.e(paramObject)).intValue();
              e2();
            }
          }
          else if (M.a >= 23) {
            b.a(X0, paramObject);
          }
        }
        else
        {
          paramObject = (e)paramObject;
          X0.m((e)a.e(paramObject));
        }
      }
      else
      {
        paramObject = (b)paramObject;
        X0.s((b)a.e(paramObject));
      }
    }
    else {
      X0.l(((Float)a.e(paramObject)).floatValue());
    }
  }
  
  public void x1()
  {
    try
    {
      X0.g();
      if (N0() != -9223372036854775807L) {
        j1 = N0();
      }
    }
    catch (z.f localf)
    {
      break label36;
    }
    return;
    label36:
    q localq = q;
    boolean bool = p;
    int i;
    if (Z0()) {
      i = 5003;
    } else {
      i = 5002;
    }
    throw K(localf, localq, bool, i);
  }
  
  public static final abstract class b
  {
    public static void a(z paramz, Object paramObject)
    {
      paramz.f((AudioDeviceInfo)paramObject);
    }
  }
  
  public final class c
    implements z.d
  {
    public c() {}
    
    public void a(z.a parama)
    {
      b0.R1(b0.this).o(parama);
    }
    
    public void b(long paramLong)
    {
      b0.R1(b0.this).H(paramLong);
    }
    
    public void c(boolean paramBoolean)
    {
      b0.R1(b0.this).I(paramBoolean);
    }
    
    public void d(Exception paramException)
    {
      g0.o.d("MediaCodecAudioRenderer", "Audio sink error", paramException);
      b0.R1(b0.this).n(paramException);
    }
    
    public void e(z.a parama)
    {
      b0.R1(b0.this).p(parama);
    }
    
    public void f()
    {
      b0.U1(b0.this);
    }
    
    public void g()
    {
      b0.Q1(b0.this, true);
    }
    
    public void h()
    {
      d2();
    }
    
    public void i()
    {
      Y0.a locala = b0.T1(b0.this);
      if (locala != null) {
        locala.a();
      }
    }
    
    public void j()
    {
      Y0.a locala = b0.S1(b0.this);
      if (locala != null) {
        locala.b();
      }
    }
    
    public void k(int paramInt, long paramLong1, long paramLong2)
    {
      b0.R1(b0.this).J(paramInt, paramLong1, paramLong2);
    }
  }
}

/* Location:
 * Qualified Name:     m0.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */