package o4;

import a4.d;
import a4.d.b;
import a4.e.a;
import a4.p;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p2.m0;
import v3.i0;
import v5.b0;
import v5.e0;
import v5.q;
import w3.a0;
import w3.a0.a;
import x3.y;
import z3.a;
import z3.c;
import z3.g.a;
import z3.i;
import z4.c0;

public abstract class m
  extends v3.f
{
  public static final byte[] J0 = { 0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120 };
  public final z3.g A;
  public boolean A0;
  public final f B;
  public boolean B0;
  public final ArrayList<Long> C;
  public boolean C0;
  public final MediaCodec.BufferInfo D;
  public boolean D0;
  public final ArrayDeque<c> E;
  public v3.n E0;
  public i0 F;
  public z3.e F0;
  public i0 G;
  public c G0;
  public a4.e H;
  public long H0;
  public a4.e I;
  public boolean I0;
  public MediaCrypto J;
  public boolean K;
  public long L;
  public float M;
  public float N;
  public j O;
  public i0 P;
  public MediaFormat Q;
  public boolean R;
  public float S;
  public ArrayDeque<l> T;
  public b U;
  public l V;
  public int W;
  public boolean X;
  public boolean Y;
  public boolean Z;
  public boolean a0;
  public boolean b0;
  public boolean c0;
  public boolean d0;
  public boolean e0;
  public boolean f0;
  public boolean g0;
  public g h0;
  public long i0;
  public int j0;
  public int k0;
  public ByteBuffer l0;
  public boolean m0;
  public boolean n0;
  public boolean o0;
  public boolean p0;
  public boolean q0;
  public boolean r0;
  public int s0;
  public int t0;
  public final j.b u;
  public int u0;
  public final n v;
  public boolean v0;
  public final boolean w;
  public boolean w0;
  public final float x;
  public boolean x0;
  public final z3.g y;
  public long y0;
  public final z3.g z;
  public long z0;
  
  public m(int paramInt, h paramh, float paramFloat)
  {
    super(paramInt);
    u = paramh;
    v = localf;
    w = false;
    x = paramFloat;
    y = new z3.g(0);
    z = new z3.g(0);
    A = new z3.g(2);
    paramh = new f();
    B = paramh;
    C = new ArrayList();
    D = new MediaCodec.BufferInfo();
    M = 1.0F;
    N = 1.0F;
    L = -9223372036854775807L;
    E = new ArrayDeque();
    t0(c.d);
    paramh.q(0);
    c.order(ByteOrder.nativeOrder());
    S = -1.0F;
    W = 0;
    s0 = 0;
    j0 = -1;
    k0 = -1;
    i0 = -9223372036854775807L;
    y0 = -9223372036854775807L;
    z0 = -9223372036854775807L;
    H0 = -9223372036854775807L;
    t0 = 0;
    u0 = 0;
  }
  
  public void B()
  {
    F = null;
    t0(c.d);
    E.clear();
    R();
  }
  
  public void D(long paramLong, boolean paramBoolean)
  {
    A0 = false;
    B0 = false;
    D0 = false;
    if (o0)
    {
      B.o();
      A.o();
      p0 = false;
    }
    else if (R())
    {
      a0();
    }
    synchronized (G0.c)
    {
      int i = d;
      if (i > 0) {
        C0 = true;
      }
      G0.c.b();
      E.clear();
      return;
    }
  }
  
  public final void H(i0[] paramArrayOfi0, long paramLong1, long paramLong2)
  {
    if (G0.b == -9223372036854775807L)
    {
      t0(new c(-9223372036854775807L, paramLong2));
    }
    else
    {
      if (E.isEmpty())
      {
        paramLong1 = y0;
        if (paramLong1 != -9223372036854775807L)
        {
          long l = H0;
          if ((l == -9223372036854775807L) || (l < paramLong1)) {}
        }
        else
        {
          t0(new c(-9223372036854775807L, paramLong2));
          if (G0.b == -9223372036854775807L) {
            return;
          }
          j0();
          return;
        }
      }
      E.add(new c(y0, paramLong2));
    }
  }
  
  public final boolean J(long paramLong1, long paramLong2)
  {
    x6.b.H(B0 ^ true);
    Object localObject = B;
    int i = r;
    int j;
    if (i > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      if (m0(paramLong1, paramLong2, null, c, k0, 0, i, e, ((a)localObject).n(), B.m(4), G))
      {
        i0(B.q);
        B.o();
      }
      else
      {
        return false;
      }
    }
    if (A0)
    {
      B0 = true;
      return false;
    }
    if (p0)
    {
      x6.b.H(B.s(A));
      p0 = false;
    }
    if (q0)
    {
      if (B.r > 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        return true;
      }
      M();
      q0 = false;
      a0();
      if (!o0) {
        return false;
      }
    }
    x6.b.H(A0 ^ true);
    l3.l locall = b;
    a = null;
    b = null;
    A.o();
    do
    {
      A.o();
      j = I(locall, A, 0);
      if (j == -5) {
        break;
      }
      if (j != -4)
      {
        if (j == -3) {
          break label381;
        }
        throw new IllegalStateException();
      }
      if (A.m(4))
      {
        A0 = true;
        break label381;
      }
      if (C0)
      {
        localObject = F;
        localObject.getClass();
        G = ((i0)localObject);
        g0((i0)localObject, null);
        C0 = false;
      }
      A.r();
    } while (B.s(A));
    p0 = true;
    break label381;
    f0(locall);
    label381:
    localObject = B;
    if (r > 0) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0) {
      ((z3.g)localObject).r();
    }
    if (B.r > 0) {
      j = 1;
    } else {
      j = 0;
    }
    boolean bool;
    if ((j == 0) && (!A0) && (!q0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract i K(l paraml, i0 parami01, i0 parami02);
  
  public k L(IllegalStateException paramIllegalStateException, l paraml)
  {
    return new k(paramIllegalStateException, paraml);
  }
  
  public final void M()
  {
    q0 = false;
    B.o();
    A.o();
    p0 = false;
    o0 = false;
  }
  
  public final boolean N()
  {
    if (v0)
    {
      t0 = 1;
      if ((!Y) && (!a0))
      {
        u0 = 2;
      }
      else
      {
        u0 = 3;
        return false;
      }
    }
    else
    {
      y0();
    }
    return true;
  }
  
  public final boolean O(long paramLong1, long paramLong2)
  {
    int i;
    if (k0 >= 0) {
      i = 1;
    } else {
      i = 0;
    }
    Object localObject1;
    Object localObject2;
    long l1;
    int j;
    boolean bool1;
    if (i == 0)
    {
      if ((b0) && (w0)) {
        try
        {
          i = O.h(D);
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          l0();
          if (B0) {
            o0();
          }
          return false;
        }
      } else {
        i = O.h(D);
      }
      if (i < 0)
      {
        if (i == -2)
        {
          x0 = true;
          localObject1 = O.b();
          if ((W != 0) && (((MediaFormat)localObject1).getInteger("width") == 32) && (((MediaFormat)localObject1).getInteger("height") == 32))
          {
            f0 = true;
          }
          else
          {
            if (d0) {
              ((MediaFormat)localObject1).setInteger("channel-count", 1);
            }
            Q = ((MediaFormat)localObject1);
            R = true;
          }
          return true;
        }
        if ((g0) && ((A0) || (t0 == 2))) {
          l0();
        }
        return false;
      }
      if (f0)
      {
        f0 = false;
        O.j(i, false);
        return true;
      }
      localObject1 = D;
      if ((size == 0) && ((flags & 0x4) != 0))
      {
        l0();
        return false;
      }
      k0 = i;
      localObject1 = O.n(i);
      l0 = ((ByteBuffer)localObject1);
      if (localObject1 != null)
      {
        ((ByteBuffer)localObject1).position(D.offset);
        localObject1 = l0;
        localObject2 = D;
        ((ByteBuffer)localObject1).limit(offset + size);
      }
      if (c0)
      {
        localObject1 = D;
        if ((presentationTimeUs == 0L) && ((flags & 0x4) != 0))
        {
          l1 = y0;
          if (l1 != -9223372036854775807L) {
            presentationTimeUs = l1;
          }
        }
      }
      l1 = D.presentationTimeUs;
      j = C.size();
      for (i = 0; i < j; i++) {
        if (((Long)C.get(i)).longValue() == l1)
        {
          C.remove(i);
          bool1 = true;
          break label470;
        }
      }
      bool1 = false;
      label470:
      m0 = bool1;
      l1 = z0;
      long l2 = D.presentationTimeUs;
      if (l1 == l2) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      n0 = bool1;
      z0(l2);
    }
    if ((b0) && (w0))
    {
      try
      {
        localObject1 = O;
        localObject2 = l0;
        i = k0;
        localObject3 = D;
        j = flags;
        l1 = presentationTimeUs;
        bool1 = m0;
        boolean bool2 = n0;
        localObject3 = G;
        l0();
      }
      catch (IllegalStateException localIllegalStateException2)
      {
        try
        {
          bool1 = m0(paramLong1, paramLong2, (j)localObject1, (ByteBuffer)localObject2, i, j, 1, l1, bool1, bool2, (i0)localObject3);
        }
        catch (IllegalStateException localIllegalStateException3)
        {
          Object localObject3;
          ByteBuffer localByteBuffer;
          for (;;) {}
        }
        localIllegalStateException2 = localIllegalStateException2;
      }
      if (B0) {
        o0();
      }
      return false;
    }
    else
    {
      localObject2 = O;
      localByteBuffer = l0;
      i = k0;
      localObject3 = D;
      bool1 = m0(paramLong1, paramLong2, (j)localObject2, localByteBuffer, i, flags, 1, presentationTimeUs, m0, n0, G);
    }
    if (bool1)
    {
      i0(D.presentationTimeUs);
      if ((D.flags & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      k0 = -1;
      l0 = null;
      if (i == 0) {
        return true;
      }
      l0();
    }
    return false;
  }
  
  public final boolean P()
  {
    Object localObject1 = O;
    boolean bool1 = false;
    bool2 = bool1;
    if (localObject1 != null)
    {
      bool2 = bool1;
      if (t0 != 2) {
        if (A0)
        {
          bool2 = bool1;
        }
        else
        {
          int i;
          if (j0 < 0)
          {
            i = ((j)localObject1).f();
            j0 = i;
            if (i < 0) {
              return false;
            }
            z.c = O.l(i);
            z.o();
          }
          if (t0 == 1)
          {
            if (!g0)
            {
              w0 = true;
              O.i(j0, 0, 4, 0L);
              j0 = -1;
              z.c = null;
            }
            t0 = 2;
            return false;
          }
          if (e0)
          {
            e0 = false;
            z.c.put(J0);
            O.i(j0, 38, 0, 0L);
            j0 = -1;
            z.c = null;
            v0 = true;
            return true;
          }
          if (s0 == 1)
          {
            for (i = 0; i < P.v.size(); i++)
            {
              localObject1 = (byte[])P.v.get(i);
              z.c.put((byte[])localObject1);
            }
            s0 = 2;
          }
          int j = z.c.position();
          localObject1 = b;
          a = null;
          b = null;
          try
          {
            i = I((l3.l)localObject1, z, 0);
            if ((h()) || (z.m(536870912))) {
              z0 = y0;
            }
            if (i == -3) {
              return false;
            }
            if (i == -5)
            {
              if (s0 == 2)
              {
                z.o();
                s0 = 1;
              }
              f0((l3.l)localObject1);
              return true;
            }
            if (z.m(4))
            {
              if (s0 == 2)
              {
                z.o();
                s0 = 1;
              }
              A0 = true;
              if (!v0)
              {
                l0();
                return false;
              }
              try
              {
                if (!g0)
                {
                  w0 = true;
                  O.i(j0, 0, 4, 0L);
                  j0 = -1;
                  z.c = null;
                }
                return false;
              }
              catch (MediaCodec.CryptoException localCryptoException1)
              {
                localObject3 = F;
                throw z(e0.r(localCryptoException1.getErrorCode()), (i0)localObject3, localCryptoException1, false);
              }
            }
            if ((!v0) && (!z.m(1)))
            {
              z.o();
              if (s0 == 2) {
                s0 = 1;
              }
              return true;
            }
            bool2 = z.m(1073741824);
            Object localObject2;
            if (bool2)
            {
              localObject3 = z.b;
              if (j == 0)
              {
                localObject3.getClass();
              }
              else
              {
                if (d == null)
                {
                  localObject2 = new int[1];
                  d = ((int[])localObject2);
                  i.numBytesOfClearData = ((int[])localObject2);
                }
                localObject2 = d;
                localObject2[0] += j;
              }
            }
            if ((X) && (!bool2))
            {
              localObject2 = z.c;
              localObject3 = q.a;
              int k = ((Buffer)localObject2).position();
              int m = 0;
              i = m;
              for (;;)
              {
                int n = m + 1;
                if (n >= k) {
                  break;
                }
                int i1 = ((ByteBuffer)localObject2).get(m) & 0xFF;
                if (i == 3)
                {
                  j = i;
                  if (i1 == 1)
                  {
                    j = i;
                    if ((((ByteBuffer)localObject2).get(n) & 0x1F) == 7)
                    {
                      localObject3 = ((ByteBuffer)localObject2).duplicate();
                      ((ByteBuffer)localObject3).position(m - 3);
                      ((ByteBuffer)localObject3).limit(k);
                      ((ByteBuffer)localObject2).position(0);
                      ((ByteBuffer)localObject2).put((ByteBuffer)localObject3);
                      break label803;
                    }
                  }
                }
                else
                {
                  j = i;
                  if (i1 == 0) {
                    j = i + 1;
                  }
                }
                i = j;
                if (i1 != 0) {
                  i = 0;
                }
                m = n;
              }
              ((ByteBuffer)localObject2).clear();
              label803:
              if (z.c.position() == 0) {
                return true;
              }
              X = false;
            }
            Object localObject3 = z;
            long l1 = e;
            g localg = h0;
            if (localg != null)
            {
              localObject2 = F;
              if (b == 0L) {
                a = l1;
              }
              if (!c)
              {
                ByteBuffer localByteBuffer = c;
                localByteBuffer.getClass();
                j = 0;
                i = j;
                while (j < 4)
                {
                  i = i << 8 | localByteBuffer.get(j) & 0xFF;
                  j++;
                }
                i = y.b(i);
                if (i == -1)
                {
                  c = true;
                  b = 0L;
                  a = e;
                  v5.m.f("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                  l1 = e;
                }
                else
                {
                  l2 = H;
                  l1 = a;
                  l2 = Math.max(0L, (b - 529L) * 1000000L / l2);
                  b += i;
                  l1 = l2 + l1;
                }
              }
              long l3 = y0;
              localObject3 = h0;
              localObject2 = F;
              localObject3.getClass();
              long l4 = H;
              long l2 = a;
              y0 = Math.max(l3, Math.max(0L, (b - 529L) * 1000000L / l4) + l2);
            }
            if (z.n()) {
              C.add(Long.valueOf(l1));
            }
            if (C0)
            {
              if (!E.isEmpty()) {
                localObject2 = (c)E.peekLast();
              } else {
                localObject2 = G0;
              }
              c.a(F, l1);
              C0 = false;
            }
            y0 = Math.max(y0, l1);
            z.r();
            if (z.m(268435456)) {
              Y(z);
            }
            k0(z);
            if (bool2) {}
            try
            {
              O.c(j0, z.b, l1);
              break label1295;
              O.i(j0, z.c.limit(), 0, l1);
              label1295:
              j0 = -1;
              z.c = null;
              v0 = true;
              s0 = 0;
              localObject2 = F0;
              c += 1;
              return true;
            }
            catch (MediaCodec.CryptoException localCryptoException2)
            {
              localObject3 = F;
              throw z(e0.r(localCryptoException2.getErrorCode()), (i0)localObject3, localCryptoException2, false);
            }
            return bool2;
          }
          catch (g.a locala)
          {
            c0(locala);
            n0(0);
            Q();
            bool2 = true;
          }
        }
      }
    }
  }
  
  public final void Q()
  {
    try
    {
      O.flush();
      return;
    }
    finally
    {
      q0();
    }
  }
  
  public final boolean R()
  {
    if (O == null) {
      return false;
    }
    int i = u0;
    if ((i != 3) && (!Y) && ((!Z) || (x0)) && ((!a0) || (!w0)))
    {
      if (i == 2)
      {
        i = e0.a;
        boolean bool;
        if (i >= 23) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.H(bool);
        if (i >= 23) {
          try
          {
            y0();
          }
          catch (v3.n localn)
          {
            v5.m.g("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", localn);
            o0();
            return true;
          }
        }
      }
      Q();
      return false;
    }
    o0();
    return true;
  }
  
  public final List<l> S(boolean paramBoolean)
  {
    ArrayList localArrayList = V(v, F, paramBoolean);
    Object localObject = localArrayList;
    if (localArrayList.isEmpty())
    {
      localObject = localArrayList;
      if (paramBoolean)
      {
        localArrayList = V(v, F, false);
        localObject = localArrayList;
        if (!localArrayList.isEmpty())
        {
          localObject = f.l("Drm session requires secure decoder for ");
          ((StringBuilder)localObject).append(F.t);
          ((StringBuilder)localObject).append(", but no secure decoder available. Trying to proceed with ");
          ((StringBuilder)localObject).append(localArrayList);
          ((StringBuilder)localObject).append(".");
          v5.m.f("MediaCodecRenderer", ((StringBuilder)localObject).toString());
          localObject = localArrayList;
        }
      }
    }
    return (List<l>)localObject;
  }
  
  public boolean T()
  {
    return false;
  }
  
  public abstract float U(float paramFloat, i0[] paramArrayOfi0);
  
  public abstract ArrayList V(n paramn, i0 parami0, boolean paramBoolean);
  
  public final p W(a4.e parame)
  {
    z3.b localb = parame.l();
    if ((localb != null) && (!(localb instanceof p)))
    {
      parame = new StringBuilder();
      parame.append("Expecting FrameworkCryptoConfig but found: ");
      parame.append(localb);
      parame = new IllegalArgumentException(parame.toString());
      throw z(6001, F, parame, false);
    }
    return (p)localb;
  }
  
  public abstract j.a X(l paraml, i0 parami0, MediaCrypto paramMediaCrypto, float paramFloat);
  
  public void Y(z3.g paramg) {}
  
  public final void Z(l paraml, MediaCrypto paramMediaCrypto)
  {
    String str = a;
    int i = e0.a;
    float f1;
    Object localObject1;
    if (i < 23)
    {
      f1 = -1.0F;
    }
    else
    {
      f1 = N;
      localObject1 = p;
      localObject1.getClass();
      f1 = U(f1, (i0[])localObject1);
    }
    float f2 = f1;
    if (f1 <= x) {
      f2 = -1.0F;
    }
    long l1 = SystemClock.elapsedRealtime();
    paramMediaCrypto = X(paraml, F, paramMediaCrypto, f2);
    if (i >= 31)
    {
      localObject1 = e;
      localObject1.getClass();
      a.a(paramMediaCrypto, (a0)localObject1);
    }
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append("createCodec:");
      ((StringBuilder)localObject1).append(str);
      m0.i(((StringBuilder)localObject1).toString());
      O = u.a(paramMediaCrypto);
      m0.B();
      long l2 = SystemClock.elapsedRealtime();
      if (!paraml.d(F))
      {
        Object localObject2 = F;
        if (localObject2 == null)
        {
          paramMediaCrypto = "null";
        }
        else
        {
          localObject1 = f.l("id=");
          ((StringBuilder)localObject1).append(a);
          ((StringBuilder)localObject1).append(", mimeType=");
          ((StringBuilder)localObject1).append(t);
          if (p != -1)
          {
            ((StringBuilder)localObject1).append(", bitrate=");
            ((StringBuilder)localObject1).append(p);
          }
          if (q != null)
          {
            ((StringBuilder)localObject1).append(", codecs=");
            ((StringBuilder)localObject1).append(q);
          }
          Object localObject3;
          Object localObject4;
          if (w != null)
          {
            localObject3 = new LinkedHashSet();
            for (i = 0;; i++)
            {
              paramMediaCrypto = w;
              if (i >= d) {
                break;
              }
              localObject4 = a[i].b;
              if (((UUID)localObject4).equals(v3.h.b))
              {
                paramMediaCrypto = "cenc";
              }
              else if (((UUID)localObject4).equals(v3.h.c))
              {
                paramMediaCrypto = "clearkey";
              }
              else if (((UUID)localObject4).equals(v3.h.e))
              {
                paramMediaCrypto = "playready";
              }
              else if (((UUID)localObject4).equals(v3.h.d))
              {
                paramMediaCrypto = "widevine";
              }
              else if (((UUID)localObject4).equals(v3.h.a))
              {
                paramMediaCrypto = "universal";
              }
              else
              {
                paramMediaCrypto = new StringBuilder();
                paramMediaCrypto.append("unknown (");
                paramMediaCrypto.append(localObject4);
                paramMediaCrypto.append(")");
                paramMediaCrypto = paramMediaCrypto.toString();
              }
              ((Set)localObject3).add(paramMediaCrypto);
            }
            ((StringBuilder)localObject1).append(", drm=[");
            localObject4 = String.valueOf(',');
            localObject4.getClass();
            localObject3 = ((Iterable)localObject3).iterator();
            try
            {
              if (((Iterator)localObject3).hasNext()) {
                for (;;)
                {
                  paramMediaCrypto = ((Iterator)localObject3).next();
                  Objects.requireNonNull(paramMediaCrypto);
                  if ((paramMediaCrypto instanceof CharSequence)) {
                    paramMediaCrypto = (CharSequence)paramMediaCrypto;
                  } else {
                    paramMediaCrypto = paramMediaCrypto.toString();
                  }
                  ((StringBuilder)localObject1).append(paramMediaCrypto);
                  if (!((Iterator)localObject3).hasNext()) {
                    break;
                  }
                  ((StringBuilder)localObject1).append((CharSequence)localObject4);
                }
              }
              ((StringBuilder)localObject1).append(']');
            }
            catch (IOException paraml)
            {
              throw new AssertionError(paraml);
            }
          }
          if ((y != -1) && (z != -1))
          {
            ((StringBuilder)localObject1).append(", res=");
            ((StringBuilder)localObject1).append(y);
            ((StringBuilder)localObject1).append("x");
            ((StringBuilder)localObject1).append(z);
          }
          if (A != -1.0F)
          {
            ((StringBuilder)localObject1).append(", fps=");
            ((StringBuilder)localObject1).append(A);
          }
          if (G != -1)
          {
            ((StringBuilder)localObject1).append(", channels=");
            ((StringBuilder)localObject1).append(G);
          }
          if (H != -1)
          {
            ((StringBuilder)localObject1).append(", sample_rate=");
            ((StringBuilder)localObject1).append(H);
          }
          if (c != null)
          {
            ((StringBuilder)localObject1).append(", language=");
            ((StringBuilder)localObject1).append(c);
          }
          if (b != null)
          {
            ((StringBuilder)localObject1).append(", label=");
            ((StringBuilder)localObject1).append(b);
          }
          if (d != 0)
          {
            paramMediaCrypto = new ArrayList();
            if ((d & 0x4) != 0) {
              paramMediaCrypto.add("auto");
            }
            if ((d & 0x1) != 0) {
              paramMediaCrypto.add("default");
            }
            if ((d & 0x2) != 0) {
              paramMediaCrypto.add("forced");
            }
            ((StringBuilder)localObject1).append(", selectionFlags=[");
            localObject3 = String.valueOf(',');
            localObject3.getClass();
            localObject4 = paramMediaCrypto.iterator();
            try
            {
              if (((Iterator)localObject4).hasNext()) {
                for (;;)
                {
                  paramMediaCrypto = ((Iterator)localObject4).next();
                  Objects.requireNonNull(paramMediaCrypto);
                  if ((paramMediaCrypto instanceof CharSequence)) {
                    paramMediaCrypto = (CharSequence)paramMediaCrypto;
                  } else {
                    paramMediaCrypto = paramMediaCrypto.toString();
                  }
                  ((StringBuilder)localObject1).append(paramMediaCrypto);
                  if (!((Iterator)localObject4).hasNext()) {
                    break;
                  }
                  ((StringBuilder)localObject1).append((CharSequence)localObject3);
                }
              }
              ((StringBuilder)localObject1).append("]");
            }
            catch (IOException paraml)
            {
              throw new AssertionError(paraml);
            }
          }
          if (e != 0)
          {
            paramMediaCrypto = new ArrayList();
            if ((e & 0x1) != 0) {
              paramMediaCrypto.add("main");
            }
            if ((e & 0x2) != 0) {
              paramMediaCrypto.add("alt");
            }
            if ((e & 0x4) != 0) {
              paramMediaCrypto.add("supplementary");
            }
            if ((e & 0x8) != 0) {
              paramMediaCrypto.add("commentary");
            }
            if ((e & 0x10) != 0) {
              paramMediaCrypto.add("dub");
            }
            if ((e & 0x20) != 0) {
              paramMediaCrypto.add("emergency");
            }
            if ((e & 0x40) != 0) {
              paramMediaCrypto.add("caption");
            }
            if ((e & 0x80) != 0) {
              paramMediaCrypto.add("subtitle");
            }
            if ((e & 0x100) != 0) {
              paramMediaCrypto.add("sign");
            }
            if ((e & 0x200) != 0) {
              paramMediaCrypto.add("describes-video");
            }
            if ((e & 0x400) != 0) {
              paramMediaCrypto.add("describes-music");
            }
            if ((e & 0x800) != 0) {
              paramMediaCrypto.add("enhanced-intelligibility");
            }
            if ((e & 0x1000) != 0) {
              paramMediaCrypto.add("transcribes-dialog");
            }
            if ((e & 0x2000) != 0) {
              paramMediaCrypto.add("easy-read");
            }
            if ((e & 0x4000) != 0) {
              paramMediaCrypto.add("trick-play");
            }
            ((StringBuilder)localObject1).append(", roleFlags=[");
            localObject2 = String.valueOf(',');
            localObject2.getClass();
            localObject3 = paramMediaCrypto.iterator();
            try
            {
              if (((Iterator)localObject3).hasNext()) {
                for (;;)
                {
                  paramMediaCrypto = ((Iterator)localObject3).next();
                  Objects.requireNonNull(paramMediaCrypto);
                  if ((paramMediaCrypto instanceof CharSequence)) {
                    paramMediaCrypto = (CharSequence)paramMediaCrypto;
                  } else {
                    paramMediaCrypto = paramMediaCrypto.toString();
                  }
                  ((StringBuilder)localObject1).append(paramMediaCrypto);
                  if (!((Iterator)localObject3).hasNext()) {
                    break;
                  }
                  ((StringBuilder)localObject1).append((CharSequence)localObject2);
                }
              }
              ((StringBuilder)localObject1).append("]");
            }
            catch (IOException paraml)
            {
              throw new AssertionError(paraml);
            }
          }
          paramMediaCrypto = ((StringBuilder)localObject1).toString();
        }
        v5.m.f("MediaCodecRenderer", e0.m("Format exceeds selected codec's capabilities [%s, %s]", new Object[] { paramMediaCrypto, str }));
      }
      boolean bool1 = false;
      V = paraml;
      S = f2;
      P = F;
      int j = e0.a;
      if ((j <= 25) && ("OMX.Exynos.avc.dec.secure".equals(str)))
      {
        paramMediaCrypto = e0.d;
        if ((paramMediaCrypto.startsWith("SM-T585")) || (paramMediaCrypto.startsWith("SM-A510")) || (paramMediaCrypto.startsWith("SM-A520")) || (paramMediaCrypto.startsWith("SM-J700")))
        {
          i = 2;
          break label1633;
        }
      }
      if ((j < 24) && (("OMX.Nvidia.h264.decode".equals(str)) || ("OMX.Nvidia.h264.decode.secure".equals(str))))
      {
        paramMediaCrypto = e0.b;
        if (("flounder".equals(paramMediaCrypto)) || ("flounder_lte".equals(paramMediaCrypto)) || ("grouper".equals(paramMediaCrypto)) || ("tilapia".equals(paramMediaCrypto)))
        {
          i = 1;
          break label1633;
        }
      }
      i = 0;
      label1633:
      W = i;
      paramMediaCrypto = P;
      if ((j < 21) && (v.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(str))) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      X = bool2;
      if ((j >= 18) && ((j != 18) || ((!"OMX.SEC.avc.dec".equals(str)) && (!"OMX.SEC.avc.dec.secure".equals(str)))) && ((j != 19) || (!e0.d.startsWith("SM-G800")) || ((!"OMX.Exynos.avc.dec".equals(str)) && (!"OMX.Exynos.avc.dec.secure".equals(str))))) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      Y = bool2;
      if ((j == 29) && ("c2.android.aac.decoder".equals(str))) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Z = bool2;
      if ((j > 23) || (!"OMX.google.vorbis.decoder".equals(str)))
      {
        if (j <= 19)
        {
          paramMediaCrypto = e0.b;
          if (((!"hb2000".equals(paramMediaCrypto)) && (!"stvm8".equals(paramMediaCrypto))) || ((!"OMX.amlogic.avc.decoder.awesome".equals(str)) && (!"OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {}
        }
      }
      else
      {
        bool2 = true;
        break label1888;
      }
      boolean bool2 = false;
      label1888:
      a0 = bool2;
      if ((j == 21) && ("OMX.google.aac.decoder".equals(str))) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      b0 = bool2;
      if ((j < 21) && ("OMX.SEC.mp3.dec".equals(str)) && ("samsung".equals(e0.c)))
      {
        paramMediaCrypto = e0.b;
        if ((paramMediaCrypto.startsWith("baffin")) || (paramMediaCrypto.startsWith("grand")) || (paramMediaCrypto.startsWith("fortuna")) || (paramMediaCrypto.startsWith("gprimelte")) || (paramMediaCrypto.startsWith("j2y18lte")) || (paramMediaCrypto.startsWith("ms01")))
        {
          bool2 = true;
          break label2028;
        }
      }
      bool2 = false;
      label2028:
      c0 = bool2;
      paramMediaCrypto = P;
      if ((j <= 18) && (G == 1) && ("OMX.MTK.AUDIO.DECODER.MP3".equals(str))) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      d0 = bool2;
      paramMediaCrypto = a;
      if (((j <= 25) && ("OMX.rk.video_decoder.avc".equals(paramMediaCrypto))) || ((j <= 17) && ("OMX.allwinner.video.decoder.avc".equals(paramMediaCrypto))) || ((j <= 29) && (("OMX.broadcom.video_decoder.tunnel".equals(paramMediaCrypto)) || ("OMX.broadcom.video_decoder.tunnel.secure".equals(paramMediaCrypto)) || ("OMX.bcm.vdec.avc.tunnel".equals(paramMediaCrypto)) || ("OMX.bcm.vdec.avc.tunnel.secure".equals(paramMediaCrypto)) || ("OMX.bcm.vdec.hevc.tunnel".equals(paramMediaCrypto)) || ("OMX.bcm.vdec.hevc.tunnel.secure".equals(paramMediaCrypto)))) || (("Amazon".equals(e0.c)) && ("AFTS".equals(e0.d)) && (f))) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        bool2 = bool1;
        if (!T()) {}
      }
      else
      {
        bool2 = true;
      }
      g0 = bool2;
      O.a();
      if ("c2.android.mp3.decoder".equals(a)) {
        h0 = new g();
      }
      if (f == 2) {
        i0 = (SystemClock.elapsedRealtime() + 1000L);
      }
      paraml = F0;
      a += 1;
      d0(str, l2, l2 - l1);
      return;
    }
    finally
    {
      m0.B();
    }
  }
  
  public final int a(i0 parami0)
  {
    try
    {
      int i = w0(v, parami0);
      return i;
    }
    catch (p.b localb)
    {
      throw A(localb, parami0);
    }
  }
  
  public final void a0()
  {
    if ((O == null) && (!o0))
    {
      Object localObject1 = F;
      if (localObject1 != null)
      {
        if ((I == null) && (v0((i0)localObject1)))
        {
          localObject1 = F;
          M();
          localObject1 = t;
          if ((!"audio/mp4a-latm".equals(localObject1)) && (!"audio/mpeg".equals(localObject1)) && (!"audio/opus".equals(localObject1)))
          {
            localObject1 = B;
            localObject1.getClass();
            s = 1;
          }
          else
          {
            localObject1 = B;
            localObject1.getClass();
            s = 32;
          }
          o0 = true;
          return;
        }
        s0(I);
        localObject1 = F.t;
        Object localObject2 = H;
        if (localObject2 != null)
        {
          if (J == null)
          {
            localObject2 = W((a4.e)localObject2);
            if (localObject2 == null)
            {
              if (H.k() != null) {}
            }
            else {
              try
              {
                MediaCrypto localMediaCrypto = new android/media/MediaCrypto;
                localMediaCrypto.<init>(a, b);
                J = localMediaCrypto;
                boolean bool;
                if ((!c) && (localMediaCrypto.requiresSecureDecoderComponent((String)localObject1))) {
                  bool = true;
                } else {
                  bool = false;
                }
                K = bool;
              }
              catch (MediaCryptoException localMediaCryptoException)
              {
                throw z(6006, F, localMediaCryptoException, false);
              }
            }
          }
          if (p.d)
          {
            int i = H.e();
            if (i != 1)
            {
              if (i == 4) {}
            }
            else
            {
              e.a locala = H.k();
              locala.getClass();
              localObject2 = F;
              throw z(a, (i0)localObject2, locala, false);
            }
          }
        }
        try
        {
          b0(J, K);
          return;
        }
        catch (b localb)
        {
          throw z(4001, F, localb, false);
        }
      }
    }
  }
  
  public boolean b()
  {
    Object localObject = F;
    boolean bool1 = true;
    if (localObject != null)
    {
      boolean bool2;
      if (h())
      {
        bool2 = s;
      }
      else
      {
        localObject = o;
        localObject.getClass();
        bool2 = ((c0)localObject).b();
      }
      bool3 = bool1;
      if (bool2) {
        break label105;
      }
      int i;
      if (k0 >= 0) {
        i = 1;
      } else {
        i = 0;
      }
      bool3 = bool1;
      if (i != 0) {
        break label105;
      }
      if ((i0 != -9223372036854775807L) && (SystemClock.elapsedRealtime() < i0))
      {
        bool3 = bool1;
        break label105;
      }
    }
    boolean bool3 = false;
    label105:
    return bool3;
  }
  
  public final void b0(MediaCrypto paramMediaCrypto, boolean paramBoolean)
  {
    Object localObject1;
    if (T == null) {
      try
      {
        localObject1 = S(paramBoolean);
        ArrayDeque localArrayDeque = new java/util/ArrayDeque;
        localArrayDeque.<init>();
        T = localArrayDeque;
        if (w) {
          localArrayDeque.addAll((Collection)localObject1);
        } else if (!((List)localObject1).isEmpty()) {
          T.add((l)((List)localObject1).get(0));
        }
        U = null;
      }
      catch (p.b paramMediaCrypto)
      {
        throw new b(-49998, F, paramMediaCrypto, paramBoolean);
      }
    }
    if (!T.isEmpty())
    {
      localObject1 = (l)T.peekFirst();
      while (O == null)
      {
        Object localObject3 = (l)T.peekFirst();
        if (!u0((l)localObject3)) {
          return;
        }
        try
        {
          Z((l)localObject3, paramMediaCrypto);
        }
        catch (Exception localException1)
        {
          if (localObject3 == localObject1) {}
          try
          {
            v5.m.f("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
            Thread.sleep(50L);
            Z((l)localObject3, paramMediaCrypto);
          }
          catch (Exception localException2)
          {
            Object localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("Failed to initialize decoder: ");
            ((StringBuilder)localObject2).append(localObject3);
            v5.m.g("MediaCodecRenderer", ((StringBuilder)localObject2).toString(), localException2);
            T.removeFirst();
            localObject2 = F;
            Object localObject4 = f.l("Decoder init failed: ");
            ((StringBuilder)localObject4).append(a);
            ((StringBuilder)localObject4).append(", ");
            ((StringBuilder)localObject4).append(localObject2);
            localObject4 = ((StringBuilder)localObject4).toString();
            String str = t;
            if ((e0.a < 21) || (!(localException2 instanceof MediaCodec.CodecException))) {
              break label329;
            }
            localObject2 = ((MediaCodec.CodecException)localException2).getDiagnosticInfo();
            break label332;
            localObject2 = null;
            localObject2 = new b((String)localObject4, localException2, str, paramBoolean, (l)localObject3, (String)localObject2);
            c0((Exception)localObject2);
            localObject3 = U;
            if (localObject3 == null) {
              break label411;
            }
            localObject2 = new b(((Throwable)localObject3).getMessage(), ((Throwable)localObject3).getCause(), a, b, c, d);
            U = ((b)localObject2);
          }
          throw localException1;
        }
        label329:
        label332:
        label411:
        if (T.isEmpty()) {
          throw U;
        }
      }
      T = null;
      return;
    }
    throw new b(-49999, F, null, paramBoolean);
  }
  
  public abstract void c0(Exception paramException);
  
  public boolean d()
  {
    return B0;
  }
  
  public abstract void d0(String paramString, long paramLong1, long paramLong2);
  
  public abstract void e0(String paramString);
  
  public i f0(l3.l paraml)
  {
    int i = 1;
    boolean bool1 = true;
    C0 = true;
    i0 locali01 = (i0)b;
    locali01.getClass();
    if (t != null)
    {
      Object localObject1 = (a4.e)a;
      paraml = I;
      if (paraml != localObject1)
      {
        if (localObject1 != null) {
          ((a4.e)localObject1).h(null);
        }
        if (paraml != null) {
          paraml.f(null);
        }
      }
      I = ((a4.e)localObject1);
      F = locali01;
      if (o0)
      {
        q0 = true;
        return null;
      }
      j localj = O;
      if (localj == null)
      {
        T = null;
        a0();
        return null;
      }
      paraml = V;
      i0 locali02 = P;
      a4.e locale = H;
      boolean bool2;
      if (locale != localObject1)
      {
        if ((localObject1 != null) && (locale != null) && (((a4.e)localObject1).g().equals(locale.g())) && (e0.a >= 23))
        {
          Object localObject2 = v3.h.e;
          if ((!((UUID)localObject2).equals(locale.g())) && (!((UUID)localObject2).equals(((a4.e)localObject1).g())))
          {
            localObject2 = W((a4.e)localObject1);
            if (localObject2 != null)
            {
              if (c) {
                bool2 = false;
              } else {
                bool2 = ((a4.e)localObject1).j(t);
              }
              if ((!f) && (bool2)) {}
            }
          }
        }
      }
      else
      {
        j = 0;
        break label307;
      }
      int j = 1;
      label307:
      if (j != 0)
      {
        if (v0)
        {
          t0 = 1;
          u0 = 3;
        }
        else
        {
          o0();
          a0();
        }
        return new i(a, locali02, locali01, 0, 128);
      }
      if (I != H) {
        j = 1;
      } else {
        j = 0;
      }
      if ((j != 0) && (e0.a < 23)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      x6.b.H(bool2);
      localObject1 = K(paraml, locali02, locali01);
      int k = d;
      int m = 16;
      if (k != 0)
      {
        if (k != 1)
        {
          if (k != 2)
          {
            if (k == 3)
            {
              if (!x0(locali01))
              {
                j = m;
                break label736;
              }
              P = locali01;
              if ((j == 0) || (N())) {
                break label733;
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            if (!x0(locali01))
            {
              j = m;
              break label736;
            }
            r0 = true;
            s0 = 1;
            i = W;
            bool2 = bool1;
            if (i != 2) {
              if ((i == 1) && (y == y) && (z == z)) {
                bool2 = bool1;
              } else {
                bool2 = false;
              }
            }
            e0 = bool2;
            P = locali01;
            if ((j == 0) || (N())) {
              break label733;
            }
          }
        }
        else
        {
          if (!x0(locali01))
          {
            j = m;
            break label736;
          }
          P = locali01;
          if (j != 0)
          {
            if (N()) {
              break label733;
            }
          }
          else
          {
            j = i;
            if (v0)
            {
              t0 = 1;
              if ((!Y) && (!a0))
              {
                u0 = 1;
                j = i;
              }
              else
              {
                u0 = 3;
                j = 0;
              }
            }
            if (j != 0) {
              break label733;
            }
          }
        }
        j = 2;
        break label736;
      }
      else if (v0)
      {
        t0 = 1;
        u0 = 3;
      }
      else
      {
        o0();
        a0();
      }
      label733:
      j = 0;
      label736:
      if ((d != 0) && ((O != localj) || (u0 == 3))) {
        return new i(a, locali02, locali01, 0, j);
      }
      return (i)localObject1;
    }
    throw z(4005, locali01, new IllegalArgumentException(), false);
  }
  
  public abstract void g0(i0 parami0, MediaFormat paramMediaFormat);
  
  public void h0(long paramLong) {}
  
  public void i0(long paramLong)
  {
    H0 = paramLong;
    while ((!E.isEmpty()) && (paramLong >= E.peek()).a))
    {
      t0((c)E.poll());
      j0();
    }
  }
  
  public abstract void j0();
  
  public abstract void k0(z3.g paramg);
  
  public final void l0()
  {
    int i = u0;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          B0 = true;
          p0();
        }
        else
        {
          o0();
          a0();
        }
      }
      else
      {
        Q();
        y0();
      }
    }
    else {
      Q();
    }
  }
  
  public void m(float paramFloat1, float paramFloat2)
  {
    M = paramFloat1;
    N = paramFloat2;
    x0(P);
  }
  
  public abstract boolean m0(long paramLong1, long paramLong2, j paramj, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, long paramLong3, boolean paramBoolean1, boolean paramBoolean2, i0 parami0);
  
  public final boolean n0(int paramInt)
  {
    l3.l locall = b;
    a = null;
    b = null;
    y.o();
    paramInt = I(locall, y, paramInt | 0x4);
    if (paramInt == -5)
    {
      f0(locall);
      return true;
    }
    if ((paramInt == -4) && (y.m(4)))
    {
      A0 = true;
      l0();
    }
    return false;
  }
  
  public final int o()
  {
    return 8;
  }
  
  /* Error */
  public final void o0()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 384	o4/m:O	Lo4/j;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +35 -> 41
    //   9: aload_1
    //   10: invokeinterface 1217 1 0
    //   15: aload_0
    //   16: getfield 621	o4/m:F0	Lz3/e;
    //   19: astore_1
    //   20: aload_1
    //   21: aload_1
    //   22: getfield 1219	z3/e:b	I
    //   25: iconst_1
    //   26: iadd
    //   27: putfield 1219	z3/e:b	I
    //   30: aload_0
    //   31: aload_0
    //   32: getfield 934	o4/m:V	Lo4/l;
    //   35: getfield 709	o4/l:a	Ljava/lang/String;
    //   38: invokevirtual 1221	o4/m:e0	(Ljava/lang/String;)V
    //   41: aload_0
    //   42: aconst_null
    //   43: putfield 384	o4/m:O	Lo4/j;
    //   46: aload_0
    //   47: getfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   50: astore_1
    //   51: aload_1
    //   52: ifnull +7 -> 59
    //   55: aload_1
    //   56: invokevirtual 1222	android/media/MediaCrypto:release	()V
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   64: aload_0
    //   65: aconst_null
    //   66: invokevirtual 1070	o4/m:s0	(La4/e;)V
    //   69: aload_0
    //   70: invokevirtual 1224	o4/m:r0	()V
    //   73: return
    //   74: astore_1
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   80: aload_0
    //   81: aconst_null
    //   82: invokevirtual 1070	o4/m:s0	(La4/e;)V
    //   85: aload_0
    //   86: invokevirtual 1224	o4/m:r0	()V
    //   89: aload_1
    //   90: athrow
    //   91: astore_2
    //   92: aload_0
    //   93: aconst_null
    //   94: putfield 384	o4/m:O	Lo4/j;
    //   97: aload_0
    //   98: getfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   101: astore_1
    //   102: aload_1
    //   103: ifnull +7 -> 110
    //   106: aload_1
    //   107: invokevirtual 1222	android/media/MediaCrypto:release	()V
    //   110: aload_0
    //   111: aconst_null
    //   112: putfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   115: aload_0
    //   116: aconst_null
    //   117: invokevirtual 1070	o4/m:s0	(La4/e;)V
    //   120: aload_0
    //   121: invokevirtual 1224	o4/m:r0	()V
    //   124: aload_2
    //   125: athrow
    //   126: astore_1
    //   127: aload_0
    //   128: aconst_null
    //   129: putfield 1074	o4/m:J	Landroid/media/MediaCrypto;
    //   132: aload_0
    //   133: aconst_null
    //   134: invokevirtual 1070	o4/m:s0	(La4/e;)V
    //   137: aload_0
    //   138: invokevirtual 1224	o4/m:r0	()V
    //   141: aload_1
    //   142: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	this	m
    //   4	52	1	localObject1	Object
    //   74	16	1	localObject2	Object
    //   101	6	1	localMediaCrypto	MediaCrypto
    //   126	16	1	localObject3	Object
    //   91	34	2	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   46	51	74	finally
    //   55	59	74	finally
    //   0	5	91	finally
    //   9	41	91	finally
    //   97	102	126	finally
    //   106	110	126	finally
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    boolean bool1 = D0;
    boolean bool2 = false;
    if (bool1)
    {
      D0 = false;
      l0();
    }
    Object localObject1 = E0;
    label349:
    k localk;
    if (localObject1 == null) {
      try
      {
        if (B0)
        {
          p0();
          return;
        }
        if ((F == null) && (!n0(2))) {
          return;
        }
        a0();
        if (o0)
        {
          m0.i("bypassRender");
          while (J(paramLong1, paramLong2)) {}
        }
        if (O != null)
        {
          long l = SystemClock.elapsedRealtime();
          m0.i("drainAndFeed");
          do
          {
            if (!O(paramLong1, paramLong2)) {
              break;
            }
            if ((L != -9223372036854775807L) && (SystemClock.elapsedRealtime() - l >= L)) {
              i = 0;
            } else {
              i = 1;
            }
          } while (i != 0);
          do
          {
            if (!P()) {
              break;
            }
            if ((L != -9223372036854775807L) && (SystemClock.elapsedRealtime() - l >= L)) {
              i = 0;
            } else {
              i = 1;
            }
          } while (i != 0);
          m0.B();
        }
        else
        {
          localObject2 = F0;
          i = d;
          localObject1 = o;
          localObject1.getClass();
          d = (i + ((c0)localObject1).m(paramLong1 - q));
          n0(1);
        }
        localObject1 = F0;
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Object localObject2;
        int j = e0.a;
        if ((j < 21) || (!(localIllegalStateException instanceof MediaCodec.CodecException)))
        {
          localObject2 = localIllegalStateException.getStackTrace();
          if ((localObject2.length <= 0) || (!localObject2[0].getClassName().equals("android.media.MediaCodec"))) {}
        }
        else
        {
          i = 1;
          break label349;
        }
        int i = 0;
        if (i != 0)
        {
          c0(localIllegalStateException);
          boolean bool3 = bool2;
          if (j >= 21)
          {
            if ((localIllegalStateException instanceof MediaCodec.CodecException)) {
              bool1 = ((MediaCodec.CodecException)localIllegalStateException).isRecoverable();
            } else {
              bool1 = false;
            }
            bool3 = bool2;
            if (bool1) {
              bool3 = true;
            }
          }
          if (bool3) {
            o0();
          }
          localk = L(localIllegalStateException, V);
          throw z(4003, F, localk, bool3);
        }
        throw localk;
      }
    }
    E0 = null;
    throw localk;
  }
  
  public void p0() {}
  
  public void q0()
  {
    j0 = -1;
    z.c = null;
    k0 = -1;
    l0 = null;
    i0 = -9223372036854775807L;
    w0 = false;
    v0 = false;
    e0 = false;
    f0 = false;
    m0 = false;
    n0 = false;
    C.clear();
    y0 = -9223372036854775807L;
    z0 = -9223372036854775807L;
    H0 = -9223372036854775807L;
    g localg = h0;
    if (localg != null)
    {
      a = 0L;
      b = 0L;
      c = false;
    }
    t0 = 0;
    u0 = 0;
    s0 = r0;
  }
  
  public final void r0()
  {
    q0();
    E0 = null;
    h0 = null;
    T = null;
    V = null;
    P = null;
    Q = null;
    R = false;
    x0 = false;
    S = -1.0F;
    W = 0;
    X = false;
    Y = false;
    Z = false;
    a0 = false;
    b0 = false;
    c0 = false;
    d0 = false;
    g0 = false;
    r0 = false;
    s0 = 0;
    K = false;
  }
  
  public final void s0(a4.e parame)
  {
    a4.e locale = H;
    if (locale != parame)
    {
      if (parame != null) {
        parame.h(null);
      }
      if (locale != null) {
        locale.f(null);
      }
    }
    H = parame;
  }
  
  public final void t0(c paramc)
  {
    G0 = paramc;
    long l = b;
    if (l != -9223372036854775807L)
    {
      I0 = true;
      h0(l);
    }
  }
  
  public boolean u0(l paraml)
  {
    return true;
  }
  
  public boolean v0(i0 parami0)
  {
    return false;
  }
  
  public abstract int w0(n paramn, i0 parami0);
  
  public final boolean x0(i0 parami0)
  {
    if (e0.a < 23) {
      return true;
    }
    if ((O != null) && (u0 != 3) && (f != 0))
    {
      float f1 = N;
      parami0 = p;
      parami0.getClass();
      f1 = U(f1, parami0);
      float f2 = S;
      if (f2 == f1) {
        return true;
      }
      if (f1 == -1.0F)
      {
        if (v0)
        {
          t0 = 1;
          u0 = 3;
        }
        else
        {
          o0();
          a0();
        }
        return false;
      }
      if ((f2 == -1.0F) && (f1 <= x)) {
        return true;
      }
      parami0 = new Bundle();
      parami0.putFloat("operating-rate", f1);
      O.d(parami0);
      S = f1;
    }
    return true;
  }
  
  public final void y0()
  {
    try
    {
      J.setMediaDrmSession(WI).b);
      s0(I);
      t0 = 0;
      u0 = 0;
      return;
    }
    catch (MediaCryptoException localMediaCryptoException)
    {
      throw z(6006, F, localMediaCryptoException, false);
    }
  }
  
  public final void z0(long paramLong)
  {
    Object localObject1 = G0.c;
    int i = 1;
    try
    {
      ??? = ((b0)localObject1).d(paramLong, true);
      ??? = (i0)???;
      localObject1 = ???;
      if (??? == null)
      {
        localObject1 = ???;
        if (I0)
        {
          localObject1 = ???;
          if (Q != null) {
            synchronized (G0.c)
            {
              if (d == 0) {
                localObject1 = null;
              } else {
                localObject1 = ((b0)???).e();
              }
              localObject1 = (i0)localObject1;
            }
          }
        }
      }
      if (locali0 != null) {
        G = locali0;
      } else {
        i = 0;
      }
      if ((i != 0) || ((R) && (G != null)))
      {
        g0(G, Q);
        R = false;
        I0 = false;
      }
      return;
    }
    finally {}
  }
  
  public static final class a
  {
    public static void a(j.a parama, a0 parama0)
    {
      parama0 = a;
      parama0.getClass();
      parama0 = a;
      if (!parama0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
        b.setString("log-session-id", parama0.getStringId());
      }
    }
  }
  
  public static final class b
    extends Exception
  {
    public final String a;
    public final boolean b;
    public final l c;
    public final String d;
    
    public b(int paramInt, i0 parami0, p.b paramb, boolean paramBoolean)
    {
      this((String)localObject, paramb, str, paramBoolean, null, parami0.toString());
    }
    
    public b(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, l paraml, String paramString3)
    {
      super(paramThrowable);
      a = paramString2;
      b = paramBoolean;
      c = paraml;
      d = paramString3;
    }
  }
  
  public static final class c
  {
    public static final c d = new c(-9223372036854775807L, -9223372036854775807L);
    public final long a;
    public final long b;
    public final b0<i0> c;
    
    public c(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
      c = new b0();
    }
  }
}

/* Location:
 * Qualified Name:     o4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */