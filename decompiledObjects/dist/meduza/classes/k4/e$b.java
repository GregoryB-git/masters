package k4;

import c4.v;
import v5.e0;
import v5.u;

public final class e$b
{
  public final v a;
  public final l b;
  public final u c;
  public m d;
  public c e;
  public int f;
  public int g;
  public int h;
  public int i;
  public final u j;
  public final u k;
  public boolean l;
  
  public e$b(v paramv, m paramm, c paramc)
  {
    a = paramv;
    d = paramm;
    e = paramc;
    b = new l();
    c = new u();
    j = new u(1);
    k = new u();
    d = paramm;
    e = paramc;
    paramv.d(a.f);
    d();
  }
  
  public final k a()
  {
    boolean bool = l;
    Object localObject1 = null;
    if (!bool) {
      return null;
    }
    Object localObject2 = b;
    Object localObject3 = a;
    int m = e0.a;
    m = a;
    localObject2 = m;
    if (localObject2 == null)
    {
      localObject2 = d.a.k;
      if (localObject2 == null) {
        localObject2 = null;
      } else {
        localObject2 = localObject2[m];
      }
    }
    localObject3 = localObject1;
    if (localObject2 != null)
    {
      localObject3 = localObject1;
      if (a) {
        localObject3 = localObject2;
      }
    }
    return (k)localObject3;
  }
  
  public final boolean b()
  {
    f += 1;
    if (!l) {
      return false;
    }
    int m = g + 1;
    g = m;
    int[] arrayOfInt = b.g;
    int n = h;
    if (m == arrayOfInt[n])
    {
      h = (n + 1);
      g = 0;
      return false;
    }
    return true;
  }
  
  public final int c(int paramInt1, int paramInt2)
  {
    Object localObject1 = a();
    if (localObject1 == null) {
      return 0;
    }
    int m = d;
    if (m != 0)
    {
      localObject1 = b.n;
    }
    else
    {
      localObject2 = e;
      m = e0.a;
      k.E((byte[])localObject2, localObject2.length);
      localObject1 = k;
      m = localObject2.length;
    }
    Object localObject2 = b;
    int n = f;
    if ((k) && (l[n] != 0)) {
      n = 1;
    } else {
      n = 0;
    }
    int i1;
    if ((n == 0) && (paramInt2 == 0)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    localObject2 = j;
    byte[] arrayOfByte = a;
    int i2;
    if (i1 != 0) {
      i2 = 128;
    } else {
      i2 = 0;
    }
    arrayOfByte[0] = ((byte)(byte)(i2 | m));
    ((u)localObject2).G(0);
    a.a(1, j);
    a.a(m, (u)localObject1);
    if (i1 == 0) {
      return m + 1;
    }
    if (n == 0)
    {
      c.D(8);
      localObject2 = c;
      localObject1 = a;
      localObject1[0] = ((byte)0);
      localObject1[1] = ((byte)1);
      localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
      localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
      localObject1[4] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
      localObject1[5] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      localObject1[6] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      localObject1[7] = ((byte)(byte)(paramInt1 & 0xFF));
      a.a(8, (u)localObject2);
      return m + 1 + 8;
    }
    localObject2 = b.n;
    paramInt1 = ((u)localObject2).A();
    ((u)localObject2).H(-2);
    paramInt1 = paramInt1 * 6 + 2;
    localObject1 = localObject2;
    if (paramInt2 != 0)
    {
      c.D(paramInt1);
      localObject1 = c.a;
      ((u)localObject2).d((byte[])localObject1, 0, paramInt1);
      paramInt2 = ((localObject1[2] & 0xFF) << 8 | localObject1[3] & 0xFF) + paramInt2;
      localObject1[2] = ((byte)(byte)(paramInt2 >> 8 & 0xFF));
      localObject1[3] = ((byte)(byte)(paramInt2 & 0xFF));
      localObject1 = c;
    }
    a.a(paramInt1, (u)localObject1);
    return m + 1 + paramInt1;
  }
  
  public final void d()
  {
    l locall = b;
    d = 0;
    p = 0L;
    q = false;
    k = false;
    o = false;
    m = null;
    f = 0;
    h = 0;
    g = 0;
    i = 0;
    l = false;
  }
}

/* Location:
 * Qualified Name:     k4.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */