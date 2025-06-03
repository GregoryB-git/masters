package A0;

import X2.B;
import X2.D;
import X2.H;
import X2.J.c;
import X2.J.d;
import X2.v;
import X2.v.a;
import d0.I;
import d0.q;
import g0.M;
import g0.o;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x0.x.b;
import y0.m;
import y0.n;

public class a
  extends c
{
  public final B0.e h;
  public final long i;
  public final long j;
  public final long k;
  public final int l;
  public final int m;
  public final float n;
  public final float o;
  public final v p;
  public final g0.c q;
  public float r;
  public int s;
  public int t;
  public long u;
  public m v;
  public long w;
  
  public a(d0.J paramJ, int[] paramArrayOfInt, int paramInt1, B0.e parame, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, List paramList, g0.c paramc)
  {
    super(paramJ, paramArrayOfInt, paramInt1);
    if (paramLong3 < paramLong1)
    {
      o.h("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
      paramLong3 = paramLong1;
    }
    h = parame;
    i = (paramLong1 * 1000L);
    j = (paramLong2 * 1000L);
    k = (paramLong3 * 1000L);
    l = paramInt2;
    m = paramInt3;
    n = paramFloat1;
    o = paramFloat2;
    p = v.U(paramList);
    q = paramc;
    r = 1.0F;
    t = 0;
    u = -9223372036854775807L;
    w = -2147483647L;
  }
  
  public static v B(y.a[] paramArrayOfa)
  {
    ArrayList localArrayList = new ArrayList();
    int i1 = 0;
    for (int i2 = 0; i2 < paramArrayOfa.length; i2++)
    {
      localObject1 = paramArrayOfa[i2];
      if ((localObject1 != null) && (b.length > 1))
      {
        localObject1 = v.M();
        ((v.a)localObject1).h(new a(0L, 0L));
      }
      for (;;)
      {
        localArrayList.add(localObject1);
        break;
        localObject1 = null;
      }
    }
    long[][] arrayOfLong = G(paramArrayOfa);
    Object localObject1 = new int[arrayOfLong.length];
    long[] arrayOfLong1 = new long[arrayOfLong.length];
    for (i2 = 0; i2 < arrayOfLong.length; i2++)
    {
      localObject2 = arrayOfLong[i2];
      long l1;
      if (localObject2.length == 0) {
        l1 = 0L;
      } else {
        l1 = localObject2[0];
      }
      arrayOfLong1[i2] = l1;
    }
    y(localArrayList, arrayOfLong1);
    Object localObject2 = H(arrayOfLong);
    for (i2 = 0; i2 < ((AbstractCollection)localObject2).size(); i2++)
    {
      int i3 = ((Integer)((List)localObject2).get(i2)).intValue();
      int i4 = localObject1[i3] + 1;
      localObject1[i3] = i4;
      arrayOfLong1[i3] = arrayOfLong[i3][i4];
      y(localArrayList, arrayOfLong1);
    }
    for (i2 = 0; i2 < paramArrayOfa.length; i2++) {
      if (localArrayList.get(i2) != null) {
        arrayOfLong1[i2] *= 2L;
      }
    }
    y(localArrayList, arrayOfLong1);
    localObject1 = v.M();
    for (i2 = i1; i2 < localArrayList.size(); i2++)
    {
      paramArrayOfa = (v.a)localArrayList.get(i2);
      if (paramArrayOfa == null) {
        paramArrayOfa = v.Y();
      } else {
        paramArrayOfa = paramArrayOfa.k();
      }
      ((v.a)localObject1).h(paramArrayOfa);
    }
    return ((v.a)localObject1).k();
  }
  
  public static long[][] G(y.a[] paramArrayOfa)
  {
    long[][] arrayOfLong = new long[paramArrayOfa.length][];
    for (int i1 = 0; i1 < paramArrayOfa.length; i1++)
    {
      y.a locala = paramArrayOfa[i1];
      if (locala == null)
      {
        arrayOfLong[i1] = new long[0];
      }
      else
      {
        arrayOfLong[i1] = new long[b.length];
        for (int i2 = 0;; i2++)
        {
          Object localObject = b;
          if (i2 >= localObject.length) {
            break;
          }
          long l1 = a.a(localObject[i2]).i;
          localObject = arrayOfLong[i1];
          long l2 = l1;
          if (l1 == -1L) {
            l2 = 0L;
          }
          localObject[i2] = l2;
        }
        Arrays.sort(arrayOfLong[i1]);
      }
    }
    return arrayOfLong;
  }
  
  public static v H(long[][] paramArrayOfLong)
  {
    D localD = X2.J.a().a().c();
    for (int i1 = 0; i1 < paramArrayOfLong.length; i1++)
    {
      long[] arrayOfLong = paramArrayOfLong[i1];
      if (arrayOfLong.length > 1)
      {
        int i2 = arrayOfLong.length;
        double[] arrayOfDouble = new double[i2];
        double d1;
        for (int i3 = 0;; i3++)
        {
          arrayOfLong = paramArrayOfLong[i1];
          int i4 = arrayOfLong.length;
          d1 = 0.0D;
          if (i3 >= i4) {
            break;
          }
          long l1 = arrayOfLong[i3];
          if (l1 != -1L) {
            d1 = Math.log(l1);
          }
          arrayOfDouble[i3] = d1;
        }
        i2--;
        double d2 = arrayOfDouble[i2] - arrayOfDouble[0];
        i3 = 0;
        while (i3 < i2)
        {
          double d3 = arrayOfDouble[i3];
          i3++;
          d1 = arrayOfDouble[i3];
          if (d2 == 0.0D) {
            d1 = 1.0D;
          } else {
            d1 = ((d3 + d1) * 0.5D - arrayOfDouble[0]) / d2;
          }
          localD.put(Double.valueOf(d1), Integer.valueOf(i1));
        }
      }
    }
    return v.U(localD.values());
  }
  
  public static void y(List paramList, long[] paramArrayOfLong)
  {
    long l1 = 0L;
    int i1 = 0;
    int i3;
    for (int i2 = 0;; i2++)
    {
      i3 = i1;
      if (i2 >= paramArrayOfLong.length) {
        break;
      }
      l1 += paramArrayOfLong[i2];
    }
    while (i3 < paramList.size())
    {
      v.a locala = (v.a)paramList.get(i3);
      if (locala != null) {
        locala.h(new a(l1, paramArrayOfLong[i3]));
      }
      i3++;
    }
  }
  
  public final int A(long paramLong1, long paramLong2)
  {
    paramLong2 = C(paramLong2);
    int i1 = 0;
    int i2 = 0;
    while (i1 < b)
    {
      if ((paramLong1 == Long.MIN_VALUE) || (!i(i1, paramLong1)))
      {
        q localq = b(i1);
        if (z(localq, i, paramLong2)) {
          return i1;
        }
        i2 = i1;
      }
      i1++;
    }
    return i2;
  }
  
  public final long C(long paramLong)
  {
    long l1 = I(paramLong);
    if (p.isEmpty()) {
      return l1;
    }
    for (int i1 = 1; (i1 < p.size() - 1) && (p.get(i1)).a < l1); i1++) {}
    a locala1 = (a)p.get(i1 - 1);
    a locala2 = (a)p.get(i1);
    paramLong = a;
    float f = (float)(l1 - paramLong) / (float)(a - paramLong);
    paramLong = b;
    return paramLong + (f * (float)(b - paramLong));
  }
  
  public final long D(List paramList)
  {
    boolean bool = paramList.isEmpty();
    long l1 = -9223372036854775807L;
    if (bool) {
      return -9223372036854775807L;
    }
    paramList = (m)B.d(paramList);
    long l2 = g;
    long l3 = l1;
    if (l2 != -9223372036854775807L)
    {
      long l4 = h;
      l3 = l1;
      if (l4 != -9223372036854775807L) {
        l3 = l4 - l2;
      }
    }
    return l3;
  }
  
  public long E()
  {
    return k;
  }
  
  public final long F(n[] paramArrayOfn, List paramList)
  {
    int i1 = s;
    if ((i1 < paramArrayOfn.length) && (paramArrayOfn[i1].next()))
    {
      paramArrayOfn = paramArrayOfn[s];
      return paramArrayOfn.a() - paramArrayOfn.b();
    }
    int i2 = paramArrayOfn.length;
    for (i1 = 0; i1 < i2; i1++)
    {
      n localn = paramArrayOfn[i1];
      if (localn.next()) {
        return localn.a() - localn.b();
      }
    }
    return D(paramList);
  }
  
  public final long I(long paramLong)
  {
    long l1 = h.d();
    w = l1;
    l1 = ((float)l1 * n);
    long l2 = h.b();
    if ((l2 != -9223372036854775807L) && (paramLong != -9223372036854775807L))
    {
      float f1 = (float)paramLong;
      float f2 = Math.max(f1 / r - (float)l2, 0.0F);
      return ((float)l1 * f2 / f1);
    }
    return ((float)l1 / r);
  }
  
  public final long J(long paramLong1, long paramLong2)
  {
    if (paramLong1 == -9223372036854775807L) {
      return i;
    }
    long l1 = paramLong1;
    if (paramLong2 != -9223372036854775807L) {
      l1 = paramLong1 - paramLong2;
    }
    return Math.min(((float)l1 * o), i);
  }
  
  public boolean K(long paramLong, List paramList)
  {
    long l1 = u;
    boolean bool;
    if ((l1 != -9223372036854775807L) && (paramLong - l1 < 1000L) && ((paramList.isEmpty()) || (((m)B.d(paramList)).equals(v)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void g()
  {
    v = null;
  }
  
  public void j()
  {
    u = -9223372036854775807L;
    v = null;
  }
  
  public int k(long paramLong, List paramList)
  {
    long l1 = q.b();
    if (!K(l1, paramList)) {
      return paramList.size();
    }
    u = l1;
    Object localObject;
    if (paramList.isEmpty()) {
      localObject = null;
    } else {
      localObject = (m)B.d(paramList);
    }
    v = ((m)localObject);
    boolean bool = paramList.isEmpty();
    int i1 = 0;
    if (bool) {
      return 0;
    }
    int i2 = paramList.size();
    long l2 = M.h0(get1g - paramLong, r);
    long l3 = E();
    if (l2 < l3) {
      return i2;
    }
    q localq = b(A(l1, D(paramList)));
    while (i1 < i2)
    {
      m localm = (m)paramList.get(i1);
      localObject = d;
      if ((M.h0(g - paramLong, r) >= l3) && (i < i))
      {
        int i3 = u;
        if ((i3 != -1) && (i3 <= m))
        {
          int i4 = t;
          if ((i4 != -1) && (i4 <= l) && (i3 < u)) {
            return i1;
          }
        }
      }
      i1++;
    }
    return i2;
  }
  
  public int n()
  {
    return t;
  }
  
  public int o()
  {
    return s;
  }
  
  public void r(float paramFloat)
  {
    r = paramFloat;
  }
  
  public Object s()
  {
    return null;
  }
  
  public void v(long paramLong1, long paramLong2, long paramLong3, List paramList, n[] paramArrayOfn)
  {
    long l1 = q.b();
    paramLong1 = F(paramArrayOfn, paramList);
    int i1 = t;
    if (i1 == 0)
    {
      t = 1;
      s = A(l1, paramLong1);
      return;
    }
    int i2 = s;
    if (paramList.isEmpty()) {
      i3 = -1;
    } else {
      i3 = a(dd);
    }
    if (i3 != -1)
    {
      i1 = de;
      i2 = i3;
    }
    int i4 = A(l1, paramLong1);
    int i3 = i4;
    if (i4 != i2)
    {
      i3 = i4;
      if (!i(i2, l1))
      {
        paramList = b(i2);
        paramArrayOfn = b(i4);
        paramLong1 = J(paramLong3, paramLong1);
        int i5 = i;
        int i6 = i;
        if ((i5 <= i6) || (paramLong2 >= paramLong1))
        {
          i3 = i4;
          if (i5 < i6)
          {
            i3 = i4;
            if (paramLong2 < j) {}
          }
        }
        else
        {
          i3 = i2;
        }
      }
    }
    if (i3 != i2) {
      i1 = 3;
    }
    t = i1;
    s = i3;
  }
  
  public boolean z(q paramq, int paramInt, long paramLong)
  {
    boolean bool;
    if (paramInt <= paramLong) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a
  {
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof a)) {
        return false;
      }
      paramObject = (a)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      return (int)a * 31 + (int)b;
    }
  }
  
  public static class b
    implements y.b
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final g0.c h;
    
    public b()
    {
      this(10000, 25000, 25000, 0.7F);
    }
    
    public b(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      this(paramInt1, paramInt2, paramInt3, 1279, 719, paramFloat, 0.75F, g0.c.a);
    }
    
    public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, g0.c paramc)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramFloat1;
      g = paramFloat2;
      h = paramc;
    }
    
    public final y[] a(y.a[] paramArrayOfa, B0.e parame, x.b paramb, I paramI)
    {
      v localv = a.x(paramArrayOfa);
      paramI = new y[paramArrayOfa.length];
      for (int i = 0; i < paramArrayOfa.length; i++)
      {
        y.a locala = paramArrayOfa[i];
        if (locala != null)
        {
          paramb = b;
          if (paramb.length != 0)
          {
            if (paramb.length == 1) {
              paramb = new z(a, paramb[0], c);
            } else {
              paramb = b(a, paramb, c, parame, (v)localv.get(i));
            }
            paramI[i] = paramb;
          }
        }
      }
      return paramI;
    }
    
    public a b(d0.J paramJ, int[] paramArrayOfInt, int paramInt, B0.e parame, v paramv)
    {
      return new a(paramJ, paramArrayOfInt, paramInt, parame, a, b, c, d, e, f, g, paramv, h);
    }
  }
}

/* Location:
 * Qualified Name:     A0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */