package X4;

import Y4.a;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  public static final f e = new f(g.b, 0, 0, 0);
  public final int a;
  public final g b;
  public final int c;
  public final int d;
  
  public f(g paramg, int paramInt1, int paramInt2, int paramInt3)
  {
    b = paramg;
    a = paramInt1;
    c = paramInt2;
    d = paramInt3;
  }
  
  public f a(int paramInt)
  {
    Object localObject1 = b;
    int i = a;
    int j = d;
    int k;
    int m;
    if (i != 4)
    {
      localObject2 = localObject1;
      k = i;
      m = j;
      if (i != 2) {}
    }
    else
    {
      m = d.c[i][0];
      k = m >> 16;
      localObject2 = ((g)localObject1).a(0xFFFF & m, k);
      m = j + k;
      k = 0;
    }
    i = c;
    if ((i != 0) && (i != 31))
    {
      if (i == 62) {
        j = 9;
      } else {
        j = 8;
      }
    }
    else {
      j = 18;
    }
    localObject1 = new f((g)localObject2, k, i + 1, m + j);
    Object localObject2 = localObject1;
    if (c == 2078) {
      localObject2 = ((f)localObject1).b(paramInt + 1);
    }
    return (f)localObject2;
  }
  
  public f b(int paramInt)
  {
    int i = c;
    if (i == 0) {
      return this;
    }
    return new f(b.b(paramInt - i, i), a, 0, d);
  }
  
  public int c()
  {
    return c;
  }
  
  public int d()
  {
    return d;
  }
  
  public int e()
  {
    return a;
  }
  
  public boolean f(f paramf)
  {
    int i = d + (d.c[a][a] >> 16);
    int j = c;
    int k = i;
    if (j > 0)
    {
      int m = c;
      if (m != 0)
      {
        k = i;
        if (m <= j) {}
      }
      else
      {
        k = i + 10;
      }
    }
    return k <= d;
  }
  
  public f g(int paramInt1, int paramInt2)
  {
    int i = d;
    g localg1 = b;
    int j = a;
    int k = i;
    g localg2 = localg1;
    if (paramInt1 != j)
    {
      k = d.c[j][paramInt1];
      j = k >> 16;
      localg2 = localg1.a(0xFFFF & k, j);
      k = i + j;
    }
    if (paramInt1 == 2) {
      i = 4;
    } else {
      i = 5;
    }
    return new f(localg2.a(paramInt2, i), paramInt1, 0, k + i);
  }
  
  public f h(int paramInt1, int paramInt2)
  {
    g localg = b;
    int i = a;
    int j;
    if (i == 2) {
      j = 4;
    } else {
      j = 5;
    }
    return new f(localg.a(d.e[i][paramInt1], j).a(paramInt2, 5), a, 0, d + j + 5);
  }
  
  public a i(byte[] paramArrayOfByte)
  {
    Object localObject1 = new LinkedList();
    for (Object localObject2 = blengthb; localObject2 != null; localObject2 = ((g)localObject2).d()) {
      ((Deque)localObject1).addFirst(localObject2);
    }
    localObject2 = new a();
    localObject1 = ((Deque)localObject1).iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((g)((Iterator)localObject1).next()).c((a)localObject2, paramArrayOfByte);
    }
    return (a)localObject2;
  }
  
  public String toString()
  {
    return String.format("%s bits=%d bytes=%d", new Object[] { d.b[a], Integer.valueOf(d), Integer.valueOf(c) });
  }
}

/* Location:
 * Qualified Name:     X4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */