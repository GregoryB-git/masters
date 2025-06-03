package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import z2;

public final class eh
  implements dv
{
  public static boolean a = false;
  private static boolean b = false;
  private long A;
  private long B;
  private int C;
  private int D;
  private long E;
  private float F;
  private dl[] G;
  private ByteBuffer[] H;
  private ByteBuffer I;
  private ByteBuffer J;
  private byte[] K;
  private int L;
  private int M;
  private boolean N;
  private boolean O;
  private boolean P;
  private int Q;
  private eg R;
  private boolean S;
  private long T;
  private final di c;
  private final em d;
  private final boolean e;
  private final ei f;
  private final ew g;
  private final dl[] h;
  private final dl[] i;
  private final ConditionVariable j;
  private final ee k;
  private final ArrayDeque<eo> l;
  private ea m;
  private AudioTrack n;
  private el o;
  private el p;
  private AudioTrack q;
  private dg r;
  private cg s;
  private cg t;
  private long u;
  private long v;
  private ByteBuffer w;
  private int x;
  private long y;
  private long z;
  
  private eh(di paramdi, em paramem, boolean paramBoolean)
  {
    c = paramdi;
    d = ((em)rp.a(paramem));
    e = paramBoolean;
    j = new ConditionVariable(true);
    k = new ee(new ed(this, (byte)0));
    paramdi = new ei();
    f = paramdi;
    ew localew = new ew();
    g = localew;
    ArrayList localArrayList = new ArrayList();
    Collections.addAll(localArrayList, new ef[] { new es(), paramdi, localew });
    Collections.addAll(localArrayList, paramem.a());
    h = ((dl[])localArrayList.toArray(new dl[0]));
    i = new dl[] { new eq() };
    F = 1.0F;
    D = 0;
    r = dg.a;
    Q = 0;
    R = new eg(0, 0.0F);
    t = cg.a;
    M = -1;
    G = new dl[0];
    H = new ByteBuffer[0];
    l = new ArrayDeque();
  }
  
  public eh(di paramdi, dl[] paramArrayOfdl)
  {
    this(paramdi, paramArrayOfdl, false);
  }
  
  private eh(di paramdi, dl[] paramArrayOfdl, boolean paramBoolean)
  {
    this(paramdi, new em(paramArrayOfdl), false);
  }
  
  private final void a(long paramLong)
    throws dz
  {
    int i1 = G.length;
    int i2 = i1;
    while (i2 >= 0)
    {
      ByteBuffer localByteBuffer;
      if (i2 > 0)
      {
        localByteBuffer = H[(i2 - 1)];
      }
      else
      {
        localByteBuffer = I;
        if (localByteBuffer == null) {
          localByteBuffer = dl.a;
        }
      }
      if (i2 == i1)
      {
        b(localByteBuffer, paramLong);
      }
      else
      {
        Object localObject = G[i2];
        ((dl)localObject).a(localByteBuffer);
        localObject = ((dl)localObject).f();
        H[i2] = localObject;
        if (((Buffer)localObject).hasRemaining())
        {
          i2++;
          continue;
        }
      }
      if (localByteBuffer.hasRemaining()) {
        return;
      }
      i2--;
    }
  }
  
  private final void a(cg paramcg, long paramLong)
  {
    if (p.h) {
      paramcg = d.a(paramcg);
    } else {
      paramcg = cg.a;
    }
    l.add(new eo(paramcg, Math.max(0L, paramLong), p.a(p()), (byte)0));
    dl[] arrayOfdl = p.i;
    paramcg = new ArrayList();
    int i1 = arrayOfdl.length;
    for (int i2 = 0; i2 < i1; i2++)
    {
      dl localdl = arrayOfdl[i2];
      if (localdl.a()) {
        paramcg.add(localdl);
      } else {
        localdl.h();
      }
    }
    i2 = paramcg.size();
    G = ((dl[])paramcg.toArray(new dl[i2]));
    H = new ByteBuffer[i2];
    k();
  }
  
  private final void b(ByteBuffer paramByteBuffer, long paramLong)
    throws dz
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    Object localObject = J;
    int i1 = 0;
    boolean bool;
    if (localObject != null)
    {
      if (localObject == paramByteBuffer) {
        bool = true;
      } else {
        bool = false;
      }
      rp.b(bool);
    }
    else
    {
      J = paramByteBuffer;
      if (wl.a < 21)
      {
        i2 = paramByteBuffer.remaining();
        localObject = K;
        if ((localObject == null) || (localObject.length < i2)) {
          K = new byte[i2];
        }
        i3 = paramByteBuffer.position();
        paramByteBuffer.get(K, 0, i2);
        paramByteBuffer.position(i3);
        L = 0;
      }
    }
    int i3 = paramByteBuffer.remaining();
    int i2 = wl.a;
    if (i2 < 21)
    {
      i2 = k.b(A);
      if (i2 > 0)
      {
        i1 = Math.min(i3, i2);
        i2 = q.write(K, L, i1);
        i1 = i2;
        if (i2 > 0)
        {
          L += i2;
          paramByteBuffer.position(paramByteBuffer.position() + i2);
          i1 = i2;
        }
      }
    }
    else if (S)
    {
      if (paramLong != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      rp.c(bool);
      AudioTrack localAudioTrack = q;
      if (i2 >= 26)
      {
        i1 = localAudioTrack.write(paramByteBuffer, i3, 1, paramLong * 1000L);
      }
      else
      {
        if (w == null)
        {
          localObject = ByteBuffer.allocate(16);
          w = ((ByteBuffer)localObject);
          ((ByteBuffer)localObject).order(ByteOrder.BIG_ENDIAN);
          w.putInt(1431633921);
        }
        if (x == 0)
        {
          w.putInt(4, i3);
          w.putLong(8, paramLong * 1000L);
          w.position(0);
          x = i3;
        }
        int i4 = w.remaining();
        if (i4 > 0)
        {
          i2 = localAudioTrack.write(w, i4, 1);
          if (i2 < 0)
          {
            x = 0;
            i1 = i2;
          }
          else if (i2 < i4) {}
        }
        else
        {
          i1 = localAudioTrack.write(paramByteBuffer, i3, 1);
          if (i1 < 0) {
            x = 0;
          } else {
            x -= i1;
          }
        }
      }
    }
    else
    {
      i1 = q.write(paramByteBuffer, i3, 1);
    }
    T = SystemClock.elapsedRealtime();
    if (i1 >= 0)
    {
      bool = p.a;
      if (bool) {
        A += i1;
      }
      if (i1 == i3)
      {
        if (!bool) {
          B += C;
        }
        J = null;
      }
      return;
    }
    throw new dz(i1);
  }
  
  private static int c(int paramInt)
  {
    if (paramInt != 5)
    {
      if (paramInt != 6) {
        if (paramInt != 7)
        {
          if (paramInt != 8)
          {
            if (paramInt != 14)
            {
              if (paramInt != 17)
              {
                if (paramInt != 18) {
                  throw new IllegalArgumentException();
                }
              }
              else {
                return 336000;
              }
            }
            else {
              return 3062500;
            }
          }
          else {
            return 2250000;
          }
        }
        else {
          return 192000;
        }
      }
      return 768000;
    }
    return 80000;
  }
  
  private final void k()
  {
    for (int i1 = 0;; i1++)
    {
      Object localObject = G;
      if (i1 >= localObject.length) {
        break;
      }
      localObject = localObject[i1];
      ((dl)localObject).h();
      H[i1] = ((dl)localObject).f();
    }
  }
  
  private final boolean l()
    throws dz
  {
    int i1;
    if (M == -1) {
      if (p.g) {
        i1 = 0;
      } else {
        i1 = G.length;
      }
    }
    for (M = i1;; M += 1)
    {
      i1 = 1;
      break label41;
      i1 = 0;
      label41:
      int i2 = M;
      localObject = G;
      if (i2 >= localObject.length) {
        break;
      }
      localObject = localObject[i2];
      if (i1 != 0) {
        ((dl)localObject).e();
      }
      a(-9223372036854775807L);
      if (!((dl)localObject).g()) {
        return false;
      }
    }
    Object localObject = J;
    if (localObject != null)
    {
      b((ByteBuffer)localObject, -9223372036854775807L);
      if (J != null) {
        return false;
      }
    }
    M = -1;
    return true;
  }
  
  private final void m()
  {
    if (n())
    {
      if (wl.a >= 21)
      {
        q.setVolume(F);
        return;
      }
      AudioTrack localAudioTrack = q;
      float f1 = F;
      localAudioTrack.setStereoVolume(f1, f1);
    }
  }
  
  private final boolean n()
  {
    return q != null;
  }
  
  private final long o()
  {
    el localel = p;
    if (a) {
      return y / b;
    }
    return z;
  }
  
  private final long p()
  {
    el localel = p;
    if (a) {
      return A / d;
    }
    return B;
  }
  
  private final void q()
  {
    if (!O)
    {
      O = true;
      k.d(p());
      q.stop();
      x = 0;
    }
  }
  
  public final long a(boolean paramBoolean)
  {
    if ((n()) && (D != 0))
    {
      long l1 = Math.min(k.a(paramBoolean), p.a(p()));
      long l2 = E;
      for (eo localeo = null; (!l.isEmpty()) && (l1 >= eo.b((eo)l.getFirst())); localeo = (eo)l.remove()) {}
      if (localeo != null)
      {
        t = eo.a(localeo);
        v = eo.b(localeo);
        u = (eo.c(localeo) - E);
      }
      if (t.b == 1.0F)
      {
        l1 = l1 + u - v;
      }
      else
      {
        long l3;
        if (l.isEmpty())
        {
          l3 = u;
          l1 = d.a(l1 - v);
        }
        else
        {
          l3 = u;
          l1 = wl.a(l1 - v, t.b);
        }
        l1 += l3;
      }
      return l1 + p.a(d.b()) + l2;
    }
    return Long.MIN_VALUE;
  }
  
  public final void a()
  {
    P = true;
    if (n())
    {
      k.a();
      q.play();
    }
  }
  
  public final void a(float paramFloat)
  {
    if (F != paramFloat)
    {
      F = paramFloat;
      m();
    }
  }
  
  public final void a(int paramInt)
  {
    boolean bool;
    if (wl.a >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    if ((!S) || (Q != paramInt))
    {
      S = true;
      Q = paramInt;
      i();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5, int paramInt6)
    throws dy
  {
    Object localObject;
    if ((wl.a < 21) && (paramInt2 == 8) && (paramArrayOfInt == null))
    {
      localObject = new int[6];
      for (paramInt4 = 0;; paramInt4++)
      {
        paramArrayOfInt = (int[])localObject;
        if (paramInt4 >= 6) {
          break;
        }
        localObject[paramInt4] = paramInt4;
      }
    }
    boolean bool1 = wl.c(paramInt1);
    int i1 = 1;
    boolean bool2;
    if ((bool1) && (paramInt1 != 4)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int i2;
    if ((e) && (a(paramInt2, 4)) && (wl.d(paramInt1))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if (i2 != 0) {
      localObject = i;
    } else {
      localObject = h;
    }
    int i4;
    boolean bool3;
    boolean bool4;
    if (bool2)
    {
      g.a(paramInt5, paramInt6);
      f.a(paramArrayOfInt);
      i3 = localObject.length;
      paramInt6 = paramInt3;
      paramInt5 = paramInt2;
      paramInt4 = paramInt1;
      i4 = 0;
      bool3 = false;
      while (i4 < i3)
      {
        paramArrayOfInt = localObject[i4];
        try
        {
          bool4 = paramArrayOfInt.a(paramInt6, paramInt5, paramInt4);
          bool3 |= bool4;
          if (paramArrayOfInt.a())
          {
            paramInt5 = paramArrayOfInt.b();
            paramInt6 = paramArrayOfInt.d();
            paramInt4 = paramArrayOfInt.c();
          }
          i4++;
        }
        catch (do paramArrayOfInt)
        {
          throw new dy(paramArrayOfInt);
        }
      }
      i4 = paramInt6;
      paramInt6 = paramInt4;
    }
    else
    {
      i4 = paramInt3;
      paramInt5 = paramInt2;
      paramInt6 = paramInt1;
      bool3 = false;
    }
    int i5 = wl.a;
    if ((i5 <= 28) && (!bool1))
    {
      if (paramInt5 == 7)
      {
        paramInt4 = 8;
        break label351;
      }
      if ((paramInt5 == 3) || (paramInt5 == 4) || (paramInt5 == 5))
      {
        paramInt4 = 6;
        break label351;
      }
    }
    paramInt4 = paramInt5;
    label351:
    int i3 = paramInt4;
    if (i5 <= 26)
    {
      i3 = paramInt4;
      if ("fugu".equals(wl.b))
      {
        i3 = paramInt4;
        if (!bool1)
        {
          i3 = paramInt4;
          if (paramInt4 == 1) {
            i3 = 2;
          }
        }
      }
    }
    i3 = wl.e(i3);
    if (i3 != 0)
    {
      paramInt4 = -1;
      if (bool1) {
        paramInt1 = wl.b(paramInt1, paramInt2);
      } else {
        paramInt1 = -1;
      }
      paramInt2 = paramInt4;
      if (bool1) {
        paramInt2 = wl.b(paramInt6, paramInt5);
      }
      if ((bool2) && (i2 == 0)) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      paramArrayOfInt = new el(bool1, paramInt1, paramInt3, paramInt2, i4, i3, paramInt6, 0, bool2, bool4, (dl[])localObject);
      paramInt1 = i1;
      if (!bool3) {
        if (o != null) {
          paramInt1 = i1;
        } else {
          paramInt1 = 0;
        }
      }
      if ((n()) && ((!paramArrayOfInt.a(p)) || (paramInt1 != 0)))
      {
        o = paramArrayOfInt;
        return;
      }
      p = paramArrayOfInt;
      return;
    }
    throw new dy(z2.k(38, "Unsupported channel count: ", paramInt5));
  }
  
  public final void a(cg paramcg)
  {
    el localel = p;
    if ((localel != null) && (!h))
    {
      t = cg.a;
      return;
    }
    if (!paramcg.equals(f()))
    {
      if (n())
      {
        s = paramcg;
        return;
      }
      t = paramcg;
    }
  }
  
  public final void a(dg paramdg)
  {
    if (r.equals(paramdg)) {
      return;
    }
    r = paramdg;
    if (S) {
      return;
    }
    i();
    Q = 0;
  }
  
  public final void a(ea paramea)
  {
    m = paramea;
  }
  
  public final void a(eg parameg)
  {
    if (R.equals(parameg)) {
      return;
    }
    int i1 = a;
    float f1 = b;
    AudioTrack localAudioTrack = q;
    if (localAudioTrack != null)
    {
      if (R.a != i1) {
        localAudioTrack.attachAuxEffect(i1);
      }
      if (i1 != 0) {
        q.setAuxEffectSendLevel(f1);
      }
    }
    R = parameg;
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    if (wl.c(paramInt2)) {
      return (paramInt2 != 4) || (wl.a >= 21);
    }
    di localdi = c;
    return (localdi != null) && (localdi.a(paramInt2)) && ((paramInt1 == -1) || (paramInt1 <= c.a()));
  }
  
  public final boolean a(ByteBuffer paramByteBuffer, long paramLong)
    throws dx, dz
  {
    Object localObject = I;
    boolean bool;
    if ((localObject != null) && (paramByteBuffer != localObject)) {
      bool = false;
    } else {
      bool = true;
    }
    rp.b(bool);
    if (o != null)
    {
      if (!l()) {
        return false;
      }
      if (!o.a(p))
      {
        q();
        if (e()) {
          return false;
        }
        i();
      }
      else
      {
        p = o;
        o = null;
      }
      a(t, paramLong);
    }
    int i1;
    if (!n())
    {
      j.block();
      localObject = ((el)rp.a(p)).a(S, r, Q);
      q = ((AudioTrack)localObject);
      i1 = ((AudioTrack)localObject).getAudioSessionId();
      if (Q != i1)
      {
        Q = i1;
        localObject = m;
        if (localObject != null) {
          ((ea)localObject).a(i1);
        }
      }
      a(t, paramLong);
      ee localee = k;
      AudioTrack localAudioTrack = q;
      localObject = p;
      localee.a(localAudioTrack, e, d, f);
      m();
      i1 = R.a;
      if (i1 != 0)
      {
        q.attachAuxEffect(i1);
        q.setAuxEffectSendLevel(R.b);
      }
      if (P) {
        a();
      }
    }
    if (!k.a(p())) {
      return false;
    }
    if (I == null)
    {
      if (!paramByteBuffer.hasRemaining()) {
        return true;
      }
      localObject = p;
      if ((!a) && (C == 0))
      {
        i1 = e;
        if ((i1 != 7) && (i1 != 8))
        {
          if (i1 == 5) {
            i1 = dc.a();
          } else if ((i1 != 6) && (i1 != 18))
          {
            if (i1 == 17)
            {
              i1 = de.a(paramByteBuffer);
            }
            else if (i1 == 14)
            {
              i1 = dc.b(paramByteBuffer);
              if (i1 == -1) {
                i1 = 0;
              } else {
                i1 = dc.a(paramByteBuffer, i1) << 4;
              }
            }
            else
            {
              throw new IllegalStateException(z2.k(38, "Unexpected audio encoding: ", i1));
            }
          }
          else {
            i1 = dc.a(paramByteBuffer);
          }
        }
        else {
          i1 = en.a(paramByteBuffer);
        }
        C = i1;
        if (i1 == 0) {
          return true;
        }
      }
      if (s != null)
      {
        if (!l()) {
          return false;
        }
        localObject = s;
        s = null;
        a((cg)localObject, paramLong);
      }
      if (D == 0)
      {
        E = Math.max(0L, paramLong);
        D = 1;
      }
      else
      {
        long l1 = E;
        localObject = p;
        l1 = (o() - g.o()) * 1000000L / c + l1;
        if ((D == 1) && (Math.abs(l1 - paramLong) > 200000L))
        {
          localObject = new StringBuilder(80);
          ((StringBuilder)localObject).append("Discontinuity detected [expected ");
          ((StringBuilder)localObject).append(l1);
          ((StringBuilder)localObject).append(", got ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append("]");
          Log.e("AudioTrack", ((StringBuilder)localObject).toString());
          D = 2;
        }
        if (D == 2)
        {
          l1 = paramLong - l1;
          E += l1;
          D = 1;
          localObject = m;
          if ((localObject != null) && (l1 != 0L)) {
            ((ea)localObject).a();
          }
        }
      }
      if (p.a) {
        y += paramByteBuffer.remaining();
      } else {
        z += C;
      }
      I = paramByteBuffer;
    }
    if (p.g) {
      a(paramLong);
    } else {
      b(I, paramLong);
    }
    if (!I.hasRemaining())
    {
      I = null;
      return true;
    }
    if (k.c(p()))
    {
      Log.w("AudioTrack", "Resetting stalled audio track");
      i();
      return true;
    }
    return false;
  }
  
  public final void b()
  {
    if (D == 1) {
      D = 2;
    }
  }
  
  public final void c()
    throws dz
  {
    if ((!N) && (n()) && (l()))
    {
      q();
      N = true;
    }
  }
  
  public final boolean d()
  {
    return (!n()) || ((N) && (!e()));
  }
  
  public final boolean e()
  {
    return (n()) && (k.e(p()));
  }
  
  public final cg f()
  {
    cg localcg = s;
    if (localcg != null) {
      return localcg;
    }
    if (!l.isEmpty()) {
      return eo.a((eo)l.getLast());
    }
    return t;
  }
  
  public final void g()
  {
    if (S)
    {
      S = false;
      Q = 0;
      i();
    }
  }
  
  public final void h()
  {
    P = false;
    if ((n()) && (k.c())) {
      q.pause();
    }
  }
  
  public final void i()
  {
    if (n())
    {
      y = 0L;
      z = 0L;
      A = 0L;
      B = 0L;
      C = 0;
      Object localObject = s;
      if (localObject != null)
      {
        t = ((cg)localObject);
        s = null;
      }
      else if (!l.isEmpty())
      {
        t = eo.a((eo)l.getLast());
      }
      l.clear();
      u = 0L;
      v = 0L;
      g.n();
      k();
      I = null;
      J = null;
      O = false;
      N = false;
      M = -1;
      w = null;
      x = 0;
      D = 0;
      if (k.b()) {
        q.pause();
      }
      AudioTrack localAudioTrack = q;
      q = null;
      localObject = o;
      if (localObject != null)
      {
        p = ((el)localObject);
        o = null;
      }
      k.d();
      j.close();
      new ek(this, localAudioTrack).start();
    }
  }
  
  public final void j()
  {
    i();
    Object localObject = n;
    if (localObject != null)
    {
      n = null;
      new ej((AudioTrack)localObject).start();
    }
    localObject = h;
    int i1 = localObject.length;
    for (int i2 = 0; i2 < i1; i2++) {
      localObject[i2].i();
    }
    localObject = i;
    i1 = localObject.length;
    for (i2 = 0; i2 < i1; i2++) {
      localObject[i2].i();
    }
    Q = 0;
    P = false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.eh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */