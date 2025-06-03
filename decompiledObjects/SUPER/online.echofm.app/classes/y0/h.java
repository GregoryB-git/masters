package y0;

import B0.b;
import B0.m.c;
import B0.n;
import B0.n.b;
import B0.n.c;
import B0.n.f;
import d0.q;
import g0.M;
import g0.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.d1;
import k0.v0;
import k0.y0;
import p0.v.a;
import p0.x;
import x0.E.a;
import x0.P;
import x0.Q;
import x0.S;
import x0.S.a;
import x0.r;
import x0.u;

public class h
  implements Q, S, n.b, n.f
{
  public final P A;
  public final P[] B;
  public final c C;
  public e D;
  public q E;
  public b F;
  public long G;
  public long H;
  public int I;
  public a J;
  public boolean K;
  public final int o;
  public final int[] p;
  public final q[] q;
  public final boolean[] r;
  public final i s;
  public final S.a t;
  public final E.a u;
  public final B0.m v;
  public final n w;
  public final g x;
  public final ArrayList y;
  public final List z;
  
  public h(int paramInt, int[] paramArrayOfInt, q[] paramArrayOfq, i parami, S.a parama, b paramb, long paramLong, x paramx, v.a parama1, B0.m paramm, E.a parama2)
  {
    o = paramInt;
    int i = 0;
    int[] arrayOfInt = paramArrayOfInt;
    if (paramArrayOfInt == null) {
      arrayOfInt = new int[0];
    }
    p = arrayOfInt;
    paramArrayOfInt = paramArrayOfq;
    if (paramArrayOfq == null) {
      paramArrayOfInt = new q[0];
    }
    q = paramArrayOfInt;
    s = parami;
    t = parama;
    u = parama2;
    v = paramm;
    w = new n("ChunkSampleStream");
    x = new g();
    paramArrayOfInt = new ArrayList();
    y = paramArrayOfInt;
    z = Collections.unmodifiableList(paramArrayOfInt);
    int j = arrayOfInt.length;
    B = new P[j];
    r = new boolean[j];
    int k = j + 1;
    paramArrayOfq = new int[k];
    paramArrayOfInt = new P[k];
    parami = P.k(paramb, paramx, parama1);
    A = parami;
    paramArrayOfq[0] = paramInt;
    paramArrayOfInt[0] = parami;
    for (paramInt = i; paramInt < j; paramInt = i)
    {
      parami = P.l(paramb);
      B[paramInt] = parami;
      i = paramInt + 1;
      paramArrayOfInt[i] = parami;
      paramArrayOfq[i] = p[paramInt];
    }
    C = new c(paramArrayOfq, paramArrayOfInt);
    G = paramLong;
    H = paramLong;
  }
  
  private void C(int paramInt)
  {
    g0.a.f(w.j() ^ true);
    int i = y.size();
    while (paramInt < i)
    {
      if (!G(paramInt)) {
        break label44;
      }
      paramInt++;
    }
    paramInt = -1;
    label44:
    if (paramInt == -1) {
      return;
    }
    long l = Fh;
    a locala = D(paramInt);
    if (y.isEmpty()) {
      G = H;
    }
    K = false;
    u.C(o, g, l);
  }
  
  private boolean H(e parame)
  {
    return parame instanceof a;
  }
  
  private void Q()
  {
    A.W();
    P[] arrayOfP = B;
    int i = arrayOfP.length;
    for (int j = 0; j < i; j++) {
      arrayOfP[j].W();
    }
  }
  
  public final void B(int paramInt)
  {
    paramInt = Math.min(O(paramInt, 0), I);
    if (paramInt > 0)
    {
      M.U0(y, 0, paramInt);
      I -= paramInt;
    }
  }
  
  public final a D(int paramInt)
  {
    a locala = (a)y.get(paramInt);
    Object localObject = y;
    M.U0((List)localObject, paramInt, ((ArrayList)localObject).size());
    I = Math.max(I, y.size());
    localObject = A;
    for (paramInt = 0;; paramInt++)
    {
      ((P)localObject).u(locala.i(paramInt));
      localObject = B;
      if (paramInt >= localObject.length) {
        break;
      }
      localObject = localObject[paramInt];
    }
    return locala;
  }
  
  public i E()
  {
    return s;
  }
  
  public final a F()
  {
    ArrayList localArrayList = y;
    return (a)localArrayList.get(localArrayList.size() - 1);
  }
  
  public final boolean G(int paramInt)
  {
    a locala = (a)y.get(paramInt);
    if (A.D() > locala.i(0)) {
      return true;
    }
    paramInt = 0;
    int i;
    int j;
    do
    {
      P[] arrayOfP = B;
      if (paramInt >= arrayOfP.length) {
        break;
      }
      i = arrayOfP[paramInt].D();
      j = paramInt + 1;
      paramInt = j;
    } while (i <= locala.i(j));
    return true;
    return false;
  }
  
  public boolean I()
  {
    boolean bool;
    if (G != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void J()
  {
    int i = O(A.D(), I - 1);
    for (;;)
    {
      int j = I;
      if (j > i) {
        break;
      }
      I = (j + 1);
      K(j);
    }
  }
  
  public final void K(int paramInt)
  {
    a locala = (a)y.get(paramInt);
    q localq = d;
    if (!localq.equals(E)) {
      u.h(o, localq, e, f, g);
    }
    E = localq;
  }
  
  public void L(e parame, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    D = null;
    J = null;
    r localr = new r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, parame.a());
    v.a(a);
    u.q(localr, c, o, d, e, f, g, h);
    if (!paramBoolean)
    {
      if (I())
      {
        Q();
      }
      else if (H(parame))
      {
        D(y.size() - 1);
        if (y.isEmpty()) {
          G = H;
        }
      }
      t.e(this);
    }
  }
  
  public void M(e parame, long paramLong1, long paramLong2)
  {
    D = null;
    s.g(parame);
    r localr = new r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, parame.a());
    v.a(a);
    u.t(localr, c, o, d, e, f, g, h);
    t.e(this);
  }
  
  public n.c N(e parame, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l = parame.a();
    boolean bool1 = H(parame);
    int i = y.size() - 1;
    if ((l != 0L) && (bool1) && (G(i))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    r localr = new r(a, b, parame.f(), parame.e(), paramLong1, paramLong2, l);
    m.c localc = new m.c(localr, new u(c, o, d, e, f, M.i1(g), M.i1(h)), paramIOException, paramInt);
    Object localObject2;
    if (s.e(parame, bool2, localc, v))
    {
      if (bool2)
      {
        localObject1 = n.f;
        localObject2 = localObject1;
        if (bool1)
        {
          if (D(i) == parame) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          g0.a.f(bool2);
          localObject2 = localObject1;
          if (y.isEmpty())
          {
            G = H;
            localObject2 = localObject1;
          }
        }
      }
      else
      {
        o.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
      }
    }
    else {
      localObject2 = null;
    }
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      paramLong1 = v.c(localc);
      if (paramLong1 != -9223372036854775807L) {
        localObject1 = n.h(false, paramLong1);
      } else {
        localObject1 = n.g;
      }
    }
    boolean bool2 = ((n.c)localObject1).c() ^ true;
    u.v(localr, c, o, d, e, f, g, h, paramIOException, bool2);
    if (bool2)
    {
      D = null;
      v.a(a);
      t.e(this);
    }
    return (n.c)localObject1;
  }
  
  public final int O(int paramInt1, int paramInt2)
  {
    int i;
    do
    {
      i = paramInt2 + 1;
      if (i >= y.size()) {
        break;
      }
      paramInt2 = i;
    } while (((a)y.get(i)).i(0) <= paramInt1);
    return i - 1;
    return y.size() - 1;
  }
  
  public void P(b paramb)
  {
    F = paramb;
    A.S();
    paramb = B;
    int i = paramb.length;
    for (int j = 0; j < i; j++) {
      paramb[j].S();
    }
    w.m(this);
  }
  
  public void R(long paramLong)
  {
    H = paramLong;
    if (I())
    {
      G = paramLong;
      return;
    }
    int i = 0;
    int j = 0;
    for (int k = 0; k < y.size(); k++)
    {
      localObject = (a)y.get(k);
      boolean bool1 = g < paramLong;
      if ((!bool1) && (k == -9223372036854775807L)) {
        break label98;
      }
      if (bool1) {
        break;
      }
    }
    Object localObject = null;
    label98:
    boolean bool2;
    if (localObject != null)
    {
      bool2 = A.Z(((a)localObject).i(0));
    }
    else
    {
      localObject = A;
      if (paramLong < c()) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      bool2 = ((P)localObject).a0(paramLong, bool2);
    }
    if (bool2)
    {
      I = O(A.D(), 0);
      localObject = B;
      i = localObject.length;
      for (k = j; k < i; k++) {
        localObject[k].a0(paramLong, true);
      }
    }
    G = paramLong;
    K = false;
    y.clear();
    I = 0;
    if (w.j())
    {
      A.r();
      localObject = B;
      j = localObject.length;
      for (k = i; k < j; k++) {
        localObject[k].r();
      }
      w.f();
    }
    else
    {
      w.g();
      Q();
    }
  }
  
  public a S(long paramLong, int paramInt)
  {
    for (int i = 0; i < B.length; i++) {
      if (p[i] == paramInt)
      {
        g0.a.f(r[i] ^ 0x1);
        r[i] = true;
        B[i].a0(paramLong, true);
        return new a(this, B[i], i);
      }
    }
    throw new IllegalStateException();
  }
  
  public void a()
  {
    w.a();
    A.O();
    if (!w.j()) {
      s.a();
    }
  }
  
  public boolean b()
  {
    return w.j();
  }
  
  public long c()
  {
    if (I()) {
      return G;
    }
    long l;
    if (K) {
      l = Long.MIN_VALUE;
    } else {
      l = Fh;
    }
    return l;
  }
  
  public long d(long paramLong, d1 paramd1)
  {
    return s.d(paramLong, paramd1);
  }
  
  public boolean e()
  {
    boolean bool;
    if ((!I()) && (A.L(K))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public long f()
  {
    if (K) {
      return Long.MIN_VALUE;
    }
    if (I()) {
      return G;
    }
    long l1 = H;
    Object localObject = F();
    if (!((m)localObject).h()) {
      if (y.size() > 1)
      {
        localObject = y;
        localObject = (a)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
      }
      else
      {
        localObject = null;
      }
    }
    long l2 = l1;
    if (localObject != null) {
      l2 = Math.max(l1, h);
    }
    return Math.max(l2, A.A());
  }
  
  public boolean g(y0 paramy0)
  {
    boolean bool1 = K;
    int i = 0;
    if ((!bool1) && (!w.j()) && (!w.i()))
    {
      bool1 = I();
      if (bool1) {
        localObject = Collections.emptyList();
      }
      for (long l1 = G;; l1 = Fh)
      {
        break;
        localObject = z;
      }
      s.h(paramy0, l1, (List)localObject, x);
      Object localObject = x;
      boolean bool2 = b;
      paramy0 = a;
      ((g)localObject).a();
      if (bool2)
      {
        G = -9223372036854775807L;
        K = true;
        return true;
      }
      if (paramy0 == null) {
        return false;
      }
      D = paramy0;
      if (H(paramy0))
      {
        a locala = (a)paramy0;
        if (bool1)
        {
          l1 = g;
          long l2 = G;
          if (l1 != l2)
          {
            A.c0(l2);
            localObject = B;
            int j = localObject.length;
            while (i < j)
            {
              localObject[i].c0(G);
              i++;
            }
          }
          G = -9223372036854775807L;
        }
        locala.k(C);
        y.add(locala);
      }
      else if ((paramy0 instanceof l))
      {
        ((l)paramy0).g(C);
      }
      l1 = w.n(paramy0, this, v.d(c));
      u.z(new r(a, b, l1), c, o, d, e, f, g, h);
      return true;
    }
    return false;
  }
  
  public void h(long paramLong)
  {
    if ((!w.i()) && (!I()))
    {
      if (w.j())
      {
        e locale = (e)g0.a.e(D);
        if ((H(locale)) && (G(y.size() - 1))) {
          return;
        }
        if (s.b(paramLong, locale, z))
        {
          w.f();
          if (H(locale)) {
            J = ((a)locale);
          }
        }
        return;
      }
      int i = s.f(paramLong, z);
      if (i < y.size()) {
        C(i);
      }
    }
  }
  
  public int j(v0 paramv0, j0.i parami, int paramInt)
  {
    if (I()) {
      return -3;
    }
    a locala = J;
    if ((locala != null) && (locala.i(0) <= A.D())) {
      return -3;
    }
    J();
    return A.T(paramv0, parami, paramInt, K);
  }
  
  public void k()
  {
    A.U();
    Object localObject = B;
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      localObject[j].U();
    }
    s.release();
    localObject = F;
    if (localObject != null) {
      ((b)localObject).a(this);
    }
  }
  
  public int m(long paramLong)
  {
    if (I()) {
      return 0;
    }
    int i = A.F(paramLong, K);
    a locala = J;
    int j = i;
    if (locala != null) {
      j = Math.min(i, locala.i(0) - A.D());
    }
    A.f0(j);
    J();
    return j;
  }
  
  public void q(long paramLong, boolean paramBoolean)
  {
    if (I()) {
      return;
    }
    int i = A.y();
    A.q(paramLong, paramBoolean, true);
    int j = A.y();
    if (j > i)
    {
      paramLong = A.z();
      for (i = 0;; i++)
      {
        P[] arrayOfP = B;
        if (i >= arrayOfP.length) {
          break;
        }
        arrayOfP[i].q(paramLong, paramBoolean, r[i]);
      }
    }
    B(j);
  }
  
  public final class a
    implements Q
  {
    public final h o;
    public final P p;
    public final int q;
    public boolean r;
    
    public a(h paramh, P paramP, int paramInt)
    {
      o = paramh;
      p = paramP;
      q = paramInt;
    }
    
    public void a() {}
    
    public final void b()
    {
      if (!r)
      {
        h.A(h.this).h(h.x(h.this)[q], h.y(h.this)[q], 0, null, h.z(h.this));
        r = true;
      }
    }
    
    public void c()
    {
      g0.a.f(h.w(h.this)[q]);
      h.w(h.this)[q] = 0;
    }
    
    public boolean e()
    {
      boolean bool;
      if ((!I()) && (p.L(K))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int j(v0 paramv0, j0.i parami, int paramInt)
    {
      if (I()) {
        return -3;
      }
      if ((h.v(h.this) != null) && (h.v(h.this).i(q + 1) <= p.D())) {
        return -3;
      }
      b();
      return p.T(paramv0, parami, paramInt, K);
    }
    
    public int m(long paramLong)
    {
      if (I()) {
        return 0;
      }
      int i = p.F(paramLong, K);
      int j = i;
      if (h.v(h.this) != null) {
        j = Math.min(i, h.v(h.this).i(q + 1) - p.D());
      }
      p.f0(j);
      if (j > 0) {
        b();
      }
      return j;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(h paramh);
  }
}

/* Location:
 * Qualified Name:     y0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */