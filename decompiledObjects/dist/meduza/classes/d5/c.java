package d5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import v5.e0;

public final class c
  implements y4.a<c>
{
  public final long a;
  public final long b;
  public final long c;
  public final boolean d;
  public final long e;
  public final long f;
  public final long g;
  public final long h;
  public final n i;
  public final l j;
  public final Uri k;
  public final h l;
  public final List<g> m;
  
  public c(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, h paramh, n paramn, l paraml, Uri paramUri, ArrayList paramArrayList)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
    d = paramBoolean;
    e = paramLong4;
    f = paramLong5;
    g = paramLong6;
    h = paramLong7;
    l = paramh;
    i = paramn;
    k = paramUri;
    j = paraml;
    m = paramArrayList;
  }
  
  public final Object a(List paramList)
  {
    LinkedList localLinkedList = new LinkedList(paramList);
    Collections.sort(localLinkedList);
    localLinkedList.add(new y4.c());
    ArrayList localArrayList1 = new ArrayList();
    long l1 = 0L;
    int n = 0;
    paramList = this;
    if (n < c())
    {
      g localg;
      List localList1;
      int i1;
      ArrayList localArrayList2;
      if (peeka != n)
      {
        long l2 = paramList.d(n);
        l3 = l1;
        if (l2 != -9223372036854775807L) {
          l3 = l1 + l2;
        }
      }
      else
      {
        localg = paramList.b(n);
        localList1 = c;
        paramList = (y4.c)localLinkedList.poll();
        i1 = a;
        localArrayList2 = new ArrayList();
      }
      for (;;)
      {
        int i2 = b;
        a locala = (a)localList1.get(i2);
        List localList2 = c;
        ArrayList localArrayList3 = new ArrayList();
        List localList3 = paramList;
        do
        {
          localArrayList3.add((j)localList2.get(c));
          paramList = (y4.c)localLinkedList.poll();
          if (a != i1) {
            break;
          }
          localList3 = paramList;
        } while (b == i2);
        localArrayList2.add(new a(a, b, localArrayList3, d, e, f));
        if (a != i1)
        {
          localLinkedList.addFirst(paramList);
          localArrayList1.add(new g(a, b - l1, localArrayList2, d));
          l3 = l1;
          n++;
          l1 = l3;
          break;
        }
      }
    }
    long l3 = b;
    if (l3 != -9223372036854775807L) {
      l1 = l3 - l1;
    } else {
      l1 = -9223372036854775807L;
    }
    return new c(a, l1, c, d, e, f, g, h, l, i, j, k, localArrayList1);
  }
  
  public final g b(int paramInt)
  {
    return (g)m.get(paramInt);
  }
  
  public final int c()
  {
    return m.size();
  }
  
  public final long d(int paramInt)
  {
    int n = m.size();
    long l1 = -9223372036854775807L;
    if (paramInt == n - 1)
    {
      long l2 = b;
      if (l2 != -9223372036854775807L) {
        l1 = l2 - m.get(paramInt)).b;
      }
    }
    else
    {
      l1 = m.get(paramInt + 1)).b - m.get(paramInt)).b;
    }
    return l1;
  }
  
  public final long e(int paramInt)
  {
    return e0.I(d(paramInt));
  }
}

/* Location:
 * Qualified Name:     d5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */