package l1;

import F0.L;
import F0.M;
import F0.M.b;
import F0.e;
import F0.r;
import F0.s;
import F0.x;
import android.util.SparseArray;
import g0.E;
import g0.a;
import g0.y;

public final class C
  implements r
{
  public static final x l = new B();
  public final E a;
  public final SparseArray b;
  public final g0.z c;
  public final A d;
  public boolean e;
  public boolean f;
  public boolean g;
  public long h;
  public z i;
  public F0.t j;
  public boolean k;
  
  public C()
  {
    this(new E(0L));
  }
  
  public C(E paramE)
  {
    a = paramE;
    c = new g0.z(4096);
    b = new SparseArray();
    d = new A();
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    paramLong1 = a.f();
    int m = 0;
    if (paramLong1 == -9223372036854775807L) {
      n = 1;
    } else {
      n = 0;
    }
    if (n == 0)
    {
      paramLong1 = a.d();
      if ((paramLong1 == -9223372036854775807L) || (paramLong1 == 0L) || (paramLong1 == paramLong2)) {
        break label77;
      }
    }
    else
    {
      if (n == 0) {
        break label77;
      }
    }
    a.i(paramLong2);
    label77:
    z localz = i;
    int n = m;
    if (localz != null) {
      localz.h(paramLong2);
    }
    for (n = m; n < b.size(); n++) {
      ((a)b.valueAt(n)).d();
    }
  }
  
  public void b(F0.t paramt)
  {
    j = paramt;
  }
  
  public boolean e(s params)
  {
    byte[] arrayOfByte = new byte[14];
    boolean bool = false;
    params.n(arrayOfByte, 0, 14);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF)) {
      return false;
    }
    if ((arrayOfByte[4] & 0xC4) != 68) {
      return false;
    }
    if ((arrayOfByte[6] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[8] & 0x4) != 4) {
      return false;
    }
    if ((arrayOfByte[9] & 0x1) != 1) {
      return false;
    }
    if ((arrayOfByte[12] & 0x3) != 3) {
      return false;
    }
    params.o(arrayOfByte[13] & 0x7);
    params.n(arrayOfByte, 0, 3);
    if (1 == ((arrayOfByte[0] & 0xFF) << 16 | (arrayOfByte[1] & 0xFF) << 8 | arrayOfByte[2] & 0xFF)) {
      bool = true;
    }
    return bool;
  }
  
  public final void h(long paramLong)
  {
    if (!k)
    {
      k = true;
      F0.t localt;
      if (d.c() != -9223372036854775807L)
      {
        localObject = new z(d.d(), d.c(), paramLong);
        i = ((z)localObject);
        localt = j;
      }
      for (Object localObject = ((e)localObject).b();; localObject = new M.b(d.c()))
      {
        localt.e((M)localObject);
        break;
        localt = j;
      }
    }
  }
  
  public int i(s params, L paramL)
  {
    a.h(j);
    long l1 = params.a();
    boolean bool = l1 < -1L;
    if ((bool) && (!d.e())) {
      return d.g(params, paramL);
    }
    h(l1);
    Object localObject1 = i;
    if ((localObject1 != null) && (((e)localObject1).d())) {
      return i.c(params, paramL);
    }
    params.h();
    if (bool) {
      l1 -= params.m();
    } else {
      l1 = -1L;
    }
    if ((l1 != -1L) && (l1 < 4L)) {
      return -1;
    }
    if (!params.l(c.e(), 0, 4, true)) {
      return -1;
    }
    c.T(0);
    int m = c.p();
    if (m == 441) {
      return -1;
    }
    if (m == 442)
    {
      params.n(c.e(), 0, 10);
      c.T(9);
    }
    for (m = (c.G() & 0x7) + 14;; m = c.M() + 6)
    {
      params.i(m);
      return 0;
      if (m != 443) {
        break;
      }
      params.n(c.e(), 0, 2);
      c.T(0);
    }
    if ((m & 0xFF00) >> 8 != 1)
    {
      params.i(1);
      return 0;
    }
    int n = m & 0xFF;
    localObject1 = (a)b.get(n);
    Object localObject2 = localObject1;
    if (!e)
    {
      paramL = (L)localObject1;
      if (localObject1 == null)
      {
        if (n == 189)
        {
          paramL = new c();
          f = true;
        }
        for (;;)
        {
          h = params.p();
          localObject2 = paramL;
          break label432;
          if ((m & 0xE0) == 192)
          {
            paramL = new t();
            break;
          }
          if ((m & 0xF0) != 224) {
            break label429;
          }
          paramL = new n();
          g = true;
        }
        label429:
        localObject2 = null;
        label432:
        paramL = (L)localObject1;
        if (localObject2 != null)
        {
          paramL = new K.d(n, 256);
          ((m)localObject2).e(j, paramL);
          paramL = new a((m)localObject2, a);
          b.put(n, paramL);
        }
      }
      if ((f) && (g)) {
        l1 = h + 8192L;
      } else {
        l1 = 1048576L;
      }
      localObject2 = paramL;
      if (params.p() > l1)
      {
        e = true;
        j.j();
        localObject2 = paramL;
      }
    }
    params.n(c.e(), 0, 2);
    c.T(0);
    m = c.M() + 6;
    if (localObject2 == null)
    {
      params.i(m);
    }
    else
    {
      c.P(m);
      params.readFully(c.e(), 0, m);
      c.T(6);
      ((a)localObject2).a(c);
      params = c;
      params.S(params.b());
    }
    return 0;
  }
  
  public void release() {}
  
  public static final class a
  {
    public final m a;
    public final E b;
    public final y c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public long h;
    
    public a(m paramm, E paramE)
    {
      a = paramm;
      b = paramE;
      c = new y(new byte[64]);
    }
    
    public void a(g0.z paramz)
    {
      paramz.l(c.a, 0, 3);
      c.p(0);
      b();
      paramz.l(c.a, 0, g);
      c.p(0);
      c();
      a.d(h, 4);
      a.a(paramz);
      a.c(false);
    }
    
    public final void b()
    {
      c.r(8);
      d = c.g();
      e = c.g();
      c.r(6);
      g = c.h(8);
    }
    
    public final void c()
    {
      h = 0L;
      if (d)
      {
        c.r(4);
        long l1 = c.h(3);
        c.r(1);
        long l2 = c.h(15) << 15;
        c.r(1);
        long l3 = c.h(15);
        c.r(1);
        if ((!f) && (e))
        {
          c.r(4);
          long l4 = c.h(3);
          c.r(1);
          long l5 = c.h(15) << 15;
          c.r(1);
          long l6 = c.h(15);
          c.r(1);
          b.b(l4 << 30 | l5 | l6);
          f = true;
        }
        h = b.b(l1 << 30 | l2 | l3);
      }
    }
    
    public void d()
    {
      f = false;
      a.b();
    }
  }
}

/* Location:
 * Qualified Name:     l1.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */