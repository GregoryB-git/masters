package x3;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import g.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o4.h;
import o4.j.a;
import o4.n;
import o7.l0;
import o7.t;
import o7.t.a;
import v3.d0.b;
import v3.e1;
import v3.i0;
import v3.i0.a;
import v3.j1.a;
import v3.l1;
import v5.e0;
import w3.a0;
import x6.b;
import z3.a;

public final class x
  extends o4.m
  implements v5.o
{
  public final Context K0;
  public final l.a L0;
  public final m M0;
  public int N0;
  public boolean O0;
  public i0 P0;
  public i0 Q0;
  public long R0;
  public boolean S0;
  public boolean T0;
  public boolean U0;
  public j1.a V0;
  
  public x(Context paramContext, h paramh, Handler paramHandler, d0.b paramb, s params)
  {
    super(1, paramh, 44100.0F);
    K0 = paramContext.getApplicationContext();
    M0 = params;
    L0 = new l.a(paramHandler, paramb);
    r = new b();
  }
  
  public static t B0(n paramn, i0 parami0, boolean paramBoolean, m paramm)
  {
    String str = t;
    if (str == null)
    {
      paramn = t.b;
      return l0.e;
    }
    if (paramm.a(parami0))
    {
      paramm = o4.p.e("audio/raw", false, false);
      if (paramm.isEmpty()) {
        paramm = null;
      } else {
        paramm = (o4.l)paramm.get(0);
      }
      if (paramm != null) {
        return t.t(paramm);
      }
    }
    paramm = paramn.a(str, paramBoolean, false);
    parami0 = o4.p.b(parami0);
    if (parami0 == null) {
      return t.p(paramm);
    }
    paramn = paramn.a(parami0, paramBoolean, false);
    parami0 = t.b;
    parami0 = new t.a();
    parami0.d(paramm);
    parami0.d(paramn);
    return parami0.e();
  }
  
  public final int A0(i0 parami0, o4.l paraml)
  {
    if ("OMX.google.raw.decoder".equals(a))
    {
      int i = e0.a;
      if ((i < 24) && ((i != 23) || (!e0.H(K0)))) {
        return -1;
      }
    }
    return u;
  }
  
  /* Error */
  public final void B()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 160	x3/x:U0	Z
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 162	x3/x:P0	Lv3/i0;
    //   10: aload_0
    //   11: getfield 48	x3/x:M0	Lx3/m;
    //   14: invokeinterface 165 1 0
    //   19: aload_0
    //   20: invokespecial 167	o4/m:B	()V
    //   23: aload_0
    //   24: getfield 55	x3/x:L0	Lx3/l$a;
    //   27: aload_0
    //   28: getfield 171	o4/m:F0	Lz3/e;
    //   31: invokevirtual 174	x3/l$a:a	(Lz3/e;)V
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: getfield 55	x3/x:L0	Lx3/l$a;
    //   40: aload_0
    //   41: getfield 171	o4/m:F0	Lz3/e;
    //   44: invokevirtual 174	x3/l$a:a	(Lz3/e;)V
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_0
    //   51: invokespecial 167	o4/m:B	()V
    //   54: aload_0
    //   55: getfield 55	x3/x:L0	Lx3/l$a;
    //   58: aload_0
    //   59: getfield 171	o4/m:F0	Lz3/e;
    //   62: invokevirtual 174	x3/l$a:a	(Lz3/e;)V
    //   65: aload_1
    //   66: athrow
    //   67: astore_1
    //   68: aload_0
    //   69: getfield 55	x3/x:L0	Lx3/l$a;
    //   72: aload_0
    //   73: getfield 171	o4/m:F0	Lz3/e;
    //   76: invokevirtual 174	x3/l$a:a	(Lz3/e;)V
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	x
    //   35	13	1	localObject1	Object
    //   49	17	1	localObject2	Object
    //   67	13	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   19	23	35	finally
    //   10	19	49	finally
    //   50	54	67	finally
  }
  
  public final void C(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = new z3.e();
    F0 = ((z3.e)localObject1);
    Object localObject2 = L0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new w.g(9, localObject2, localObject1));
    }
    localObject1 = c;
    localObject1.getClass();
    if (a) {
      M0.q();
    } else {
      M0.m();
    }
    localObject2 = M0;
    localObject1 = e;
    localObject1.getClass();
    ((m)localObject2).p((a0)localObject1);
  }
  
  public final void C0()
  {
    long l = M0.l(d());
    if (l != Long.MIN_VALUE)
    {
      if (!T0) {
        l = Math.max(R0, l);
      }
      R0 = l;
      T0 = false;
    }
  }
  
  public final void D(long paramLong, boolean paramBoolean)
  {
    super.D(paramLong, paramBoolean);
    M0.flush();
    R0 = paramLong;
    S0 = true;
    T0 = true;
  }
  
  /* Error */
  public final void E()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 250	o4/m:M	()V
    //   4: aload_0
    //   5: invokevirtual 253	o4/m:o0	()V
    //   8: aload_0
    //   9: getfield 256	o4/m:I	La4/e;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnonnull +6 -> 20
    //   17: goto +10 -> 27
    //   20: aload_1
    //   21: aconst_null
    //   22: invokeinterface 262 2 0
    //   27: aload_0
    //   28: aconst_null
    //   29: putfield 256	o4/m:I	La4/e;
    //   32: aload_0
    //   33: getfield 160	x3/x:U0	Z
    //   36: ifeq +17 -> 53
    //   39: aload_0
    //   40: iconst_0
    //   41: putfield 160	x3/x:U0	Z
    //   44: aload_0
    //   45: getfield 48	x3/x:M0	Lx3/m;
    //   48: invokeinterface 265 1 0
    //   53: return
    //   54: astore_1
    //   55: goto +27 -> 82
    //   58: astore_1
    //   59: aload_0
    //   60: getfield 256	o4/m:I	La4/e;
    //   63: astore_2
    //   64: aload_2
    //   65: ifnull +10 -> 75
    //   68: aload_2
    //   69: aconst_null
    //   70: invokeinterface 262 2 0
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 256	o4/m:I	La4/e;
    //   80: aload_1
    //   81: athrow
    //   82: aload_0
    //   83: getfield 160	x3/x:U0	Z
    //   86: ifeq +17 -> 103
    //   89: aload_0
    //   90: iconst_0
    //   91: putfield 160	x3/x:U0	Z
    //   94: aload_0
    //   95: getfield 48	x3/x:M0	Lx3/m;
    //   98: invokeinterface 265 1 0
    //   103: aload_1
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	x
    //   12	9	1	locale1	a4.e
    //   54	1	1	localObject1	Object
    //   58	46	1	localObject2	Object
    //   63	6	2	locale2	a4.e
    // Exception table:
    //   from	to	target	type
    //   8	13	54	finally
    //   20	27	54	finally
    //   27	32	54	finally
    //   59	64	54	finally
    //   68	75	54	finally
    //   75	82	54	finally
    //   0	8	58	finally
  }
  
  public final void F()
  {
    M0.b();
  }
  
  public final void G()
  {
    C0();
    M0.pause();
  }
  
  public final z3.i K(o4.l paraml, i0 parami01, i0 parami02)
  {
    z3.i locali = paraml.b(parami01, parami02);
    int i = e;
    int j = i;
    if (A0(parami02, paraml) > N0) {
      j = i | 0x40;
    }
    paraml = a;
    if (j != 0) {
      i = 0;
    } else {
      i = d;
    }
    return new z3.i(paraml, parami01, parami02, i, j);
  }
  
  public final float U(float paramFloat, i0[] paramArrayOfi0)
  {
    int i = paramArrayOfi0.length;
    int j = 0;
    int n;
    for (int k = -1; j < i; k = n)
    {
      int m = H;
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
  
  public final ArrayList V(n paramn, i0 parami0, boolean paramBoolean)
  {
    t localt = B0(paramn, parami0, paramBoolean, M0);
    paramn = o4.p.a;
    paramn = new ArrayList(localt);
    Collections.sort(paramn, new o4.o(new e(parami0, 6), 0));
    return paramn;
  }
  
  public final j.a X(o4.l paraml, i0 parami0, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    Object localObject1 = p;
    localObject1.getClass();
    int i = A0(parami0, paraml);
    int j = localObject1.length;
    int k = 1;
    int m;
    if (j == 1)
    {
      m = i;
    }
    else
    {
      int n = localObject1.length;
      j = 0;
      for (;;)
      {
        m = i;
        if (j >= n) {
          break;
        }
        localObject2 = localObject1[j];
        m = i;
        if (bd != 0) {
          m = Math.max(i, A0((i0)localObject2, paraml));
        }
        j++;
        i = m;
      }
    }
    N0 = m;
    localObject1 = a;
    j = e0.a;
    if ((j < 24) && ("OMX.SEC.aac.dec".equals(localObject1)) && ("samsung".equals(e0.c)))
    {
      localObject1 = e0.b;
      if ((((String)localObject1).startsWith("zeroflte")) || (((String)localObject1).startsWith("herolte")) || (((String)localObject1).startsWith("heroqlte")))
      {
        bool = true;
        break label202;
      }
    }
    boolean bool = false;
    label202:
    O0 = bool;
    localObject1 = c;
    i = N0;
    Object localObject2 = new MediaFormat();
    ((MediaFormat)localObject2).setString("mime", (String)localObject1);
    ((MediaFormat)localObject2).setInteger("channel-count", G);
    ((MediaFormat)localObject2).setInteger("sample-rate", H);
    b.q0((MediaFormat)localObject2, v);
    b.h0((MediaFormat)localObject2, "max-input-size", i);
    if (j >= 23)
    {
      ((MediaFormat)localObject2).setInteger("priority", 0);
      if (paramFloat != -1.0F)
      {
        if (j == 23)
        {
          localObject1 = e0.d;
          if (("ZTE B2017G".equals(localObject1)) || ("AXON 7 mini".equals(localObject1)))
          {
            i = 1;
            break label350;
          }
        }
        i = 0;
        label350:
        if (i == 0) {
          ((MediaFormat)localObject2).setFloat("operating-rate", paramFloat);
        }
      }
    }
    if ((j <= 28) && ("audio/ac4".equals(t))) {
      ((MediaFormat)localObject2).setInteger("ac4-is-sync", 1);
    }
    if (j >= 24)
    {
      m localm = M0;
      i = G;
      m = H;
      localObject1 = new i0.a();
      k = "audio/raw";
      x = i;
      y = m;
      z = 4;
      if (localm.u(((i0.a)localObject1).a()) == 2) {
        ((MediaFormat)localObject2).setInteger("pcm-encoding", 4);
      }
    }
    if (j >= 32) {
      ((MediaFormat)localObject2).setInteger("max-output-channel-count", 99);
    }
    if (("audio/raw".equals(b)) && (!"audio/raw".equals(t))) {
      i = k;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject1 = parami0;
    } else {
      localObject1 = null;
    }
    Q0 = ((i0)localObject1);
    return new j.a(paraml, (MediaFormat)localObject2, parami0, null, paramMediaCrypto);
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((!M0.h()) && (!super.b())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final void c(e1 parame1)
  {
    M0.c(parame1);
  }
  
  public final void c0(Exception paramException)
  {
    v5.m.d("MediaCodecAudioRenderer", "Audio codec error", paramException);
    l.a locala = L0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new x0.f(8, locala, paramException));
    }
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((B0) && (M0.d())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void d0(String paramString, long paramLong1, long paramLong2)
  {
    l.a locala = L0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new i(locala, paramString, paramLong1, paramLong2));
    }
  }
  
  public final void e0(String paramString)
  {
    l.a locala = L0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new w.g(8, locala, paramString));
    }
  }
  
  public final e1 f()
  {
    return M0.f();
  }
  
  public final z3.i f0(l3.l paraml)
  {
    Object localObject = (i0)b;
    localObject.getClass();
    P0 = ((i0)localObject);
    paraml = super.f0(paraml);
    localObject = L0;
    i0 locali0 = P0;
    Handler localHandler = a;
    if (localHandler != null) {
      localHandler.post(new x0.g(localObject, locali0, paraml, 4));
    }
    return paraml;
  }
  
  public final void g0(i0 parami0, MediaFormat paramMediaFormat)
  {
    i0 locali0 = Q0;
    Object localObject1 = null;
    Object localObject2 = null;
    if (locali0 != null)
    {
      parami0 = locali0;
      paramMediaFormat = (MediaFormat)localObject1;
    }
    else if (O == null)
    {
      paramMediaFormat = (MediaFormat)localObject1;
    }
    else
    {
      int i;
      if ("audio/raw".equals(t)) {
        i = I;
      } else if ((e0.a >= 24) && (paramMediaFormat.containsKey("pcm-encoding"))) {
        i = paramMediaFormat.getInteger("pcm-encoding");
      } else if (paramMediaFormat.containsKey("v-bits-per-sample")) {
        i = e0.v(paramMediaFormat.getInteger("v-bits-per-sample"));
      } else {
        i = 2;
      }
      localObject1 = new i0.a();
      k = "audio/raw";
      z = i;
      A = J;
      B = K;
      x = paramMediaFormat.getInteger("channel-count");
      y = paramMediaFormat.getInteger("sample-rate");
      localObject1 = new i0((i0.a)localObject1);
      paramMediaFormat = (MediaFormat)localObject2;
      if (O0)
      {
        paramMediaFormat = (MediaFormat)localObject2;
        if (G == 6)
        {
          i = G;
          paramMediaFormat = (MediaFormat)localObject2;
          if (i < 6)
          {
            paramMediaFormat = new int[i];
            for (i = 0; i < G; i++) {
              paramMediaFormat[i] = i;
            }
          }
        }
      }
      parami0 = (i0)localObject1;
    }
    try
    {
      M0.e(parami0, paramMediaFormat);
      return;
    }
    catch (m.a parami0)
    {
      throw z(5001, a, parami0, false);
    }
  }
  
  public final String getName()
  {
    return "MediaCodecAudioRenderer";
  }
  
  public final void h0(long paramLong)
  {
    M0.r();
  }
  
  public final void j0()
  {
    M0.n();
  }
  
  public final void k0(z3.g paramg)
  {
    if ((S0) && (!paramg.n()))
    {
      if (Math.abs(e - R0) > 500000L) {
        R0 = e;
      }
      S0 = false;
    }
  }
  
  public final long l()
  {
    if (f == 2) {
      C0();
    }
    return R0;
  }
  
  public final boolean m0(long paramLong1, long paramLong2, o4.j paramj, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, i0 parami0)
  {
    paramByteBuffer.getClass();
    if ((Q0 != null) && ((paramInt2 & 0x2) != 0))
    {
      paramj.getClass();
      paramj.j(paramInt1, false);
      return true;
    }
    if (paramBoolean1)
    {
      if (paramj != null) {
        paramj.j(paramInt1, false);
      }
      paramj = F0;
      f += paramInt3;
      M0.n();
      return true;
    }
    try
    {
      paramBoolean1 = M0.k(paramLong3, paramByteBuffer, paramInt3);
      if (paramBoolean1)
      {
        if (paramj != null) {
          paramj.j(paramInt1, false);
        }
        paramj = F0;
        e += paramInt3;
        return true;
      }
      return false;
    }
    catch (m.e paramj)
    {
      throw z(5002, parami0, paramj, b);
    }
    catch (m.b paramj)
    {
      throw z(5001, P0, paramj, b);
    }
  }
  
  public final void p0()
  {
    try
    {
      M0.g();
      return;
    }
    catch (m.e locale)
    {
      throw z(5002, c, locale, b);
    }
  }
  
  public final void q(int paramInt, Object paramObject)
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 6)
        {
          switch (paramInt)
          {
          default: 
            break;
          case 12: 
            if (e0.a < 23) {
              break;
            }
            a.a(M0, paramObject);
            break;
          case 11: 
            V0 = ((j1.a)paramObject);
            break;
          case 10: 
            M0.i(((Integer)paramObject).intValue());
            break;
          case 9: 
            M0.t(((Boolean)paramObject).booleanValue());
            break;
          }
        }
        else
        {
          paramObject = (p)paramObject;
          M0.j((p)paramObject);
        }
      }
      else
      {
        paramObject = (d)paramObject;
        M0.s((d)paramObject);
      }
    }
    else {
      M0.o(((Float)paramObject).floatValue());
    }
  }
  
  public final boolean v0(i0 parami0)
  {
    return M0.a(parami0);
  }
  
  public final v5.o w()
  {
    return this;
  }
  
  public final int w0(n paramn, i0 parami0)
  {
    boolean bool1 = v5.p.k(t);
    int i = 0;
    if (!bool1) {
      return a0.j.b(0, 0, 0);
    }
    int j;
    if (e0.a >= 21) {
      j = 32;
    } else {
      j = 0;
    }
    int k = O;
    bool1 = true;
    if (k != 0) {
      m = 1;
    } else {
      m = 0;
    }
    if ((k != 0) && (k != 2)) {
      k = 0;
    } else {
      k = 1;
    }
    int n = 8;
    int i1 = 4;
    if ((k != 0) && (M0.a(parami0))) {
      if (m != 0)
      {
        localObject1 = o4.p.e("audio/raw", false, false);
        if (((List)localObject1).isEmpty()) {
          localObject1 = null;
        } else {
          localObject1 = (o4.l)((List)localObject1).get(0);
        }
        if (localObject1 == null) {}
      }
      else
      {
        return a0.j.b(4, 8, j);
      }
    }
    if (("audio/raw".equals(t)) && (!M0.a(parami0))) {
      return a0.j.b(1, 0, 0);
    }
    Object localObject1 = M0;
    int i2 = G;
    int m = H;
    Object localObject2 = new i0.a();
    k = "audio/raw";
    x = i2;
    y = m;
    z = 2;
    if (!((m)localObject1).a(((i0.a)localObject2).a())) {
      return a0.j.b(1, 0, 0);
    }
    localObject2 = B0(paramn, parami0, false, M0);
    if (((List)localObject2).isEmpty()) {
      return a0.j.b(1, 0, 0);
    }
    if (k == 0) {
      return a0.j.b(2, 0, 0);
    }
    localObject1 = (o4.l)((List)localObject2).get(0);
    boolean bool2 = ((o4.l)localObject1).d(parami0);
    if (!bool2) {
      for (m = 1; m < ((List)localObject2).size(); m++)
      {
        paramn = (o4.l)((List)localObject2).get(m);
        if (paramn.d(parami0))
        {
          m = 0;
          break label399;
        }
      }
    }
    m = 1;
    bool1 = bool2;
    paramn = (n)localObject1;
    label399:
    if (bool1) {
      k = i1;
    } else {
      k = 3;
    }
    i1 = n;
    if (bool1)
    {
      i1 = n;
      if (paramn.e(parami0)) {
        i1 = 16;
      }
    }
    if (g) {
      n = 64;
    } else {
      n = 0;
    }
    if (m != 0) {
      i = 128;
    }
    return k | i1 | j | n | i;
  }
  
  public static final class a
  {
    public static void a(m paramm, Object paramObject)
    {
      paramm.setPreferredDevice((AudioDeviceInfo)paramObject);
    }
  }
  
  public final class b
    implements m.c
  {
    public b() {}
    
    public final void a(Exception paramException)
    {
      v5.m.d("MediaCodecAudioRenderer", "Audio sink error", paramException);
      l.a locala = L0;
      Handler localHandler = a;
      if (localHandler != null) {
        localHandler.post(new q(5, locala, paramException));
      }
    }
  }
}

/* Location:
 * Qualified Name:     x3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */