package o0;

import android.net.Uri;
import d0.H;
import g0.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class c
  implements v0.a
{
  public final long a;
  public final long b;
  public final long c;
  public final boolean d;
  public final long e;
  public final long f;
  public final long g;
  public final long h;
  public final o i;
  public final l j;
  public final Uri k;
  public final h l;
  public final List m;
  
  public c(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, h paramh, o paramo, l paraml, Uri paramUri, List paramList)
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
    i = paramo;
    k = paramUri;
    j = paraml;
    if (paramList == null) {
      paramList = Collections.emptyList();
    }
    m = paramList;
  }
  
  public static ArrayList c(List paramList, LinkedList paramLinkedList)
  {
    Object localObject = (H)paramLinkedList.poll();
    int n = o;
    ArrayList localArrayList1 = new ArrayList();
    H localH;
    do
    {
      int i1 = p;
      a locala = (a)paramList.get(i1);
      List localList = c;
      ArrayList localArrayList2 = new ArrayList();
      do
      {
        localArrayList2.add((j)localList.get(q));
        localH = (H)paramLinkedList.poll();
        if (o != n) {
          break;
        }
        localObject = localH;
      } while (p == i1);
      localArrayList1.add(new a(a, b, localArrayList2, d, e, f));
      localObject = localH;
    } while (o == n);
    paramLinkedList.addFirst(localH);
    return localArrayList1;
  }
  
  public final c b(List paramList)
  {
    LinkedList localLinkedList = new LinkedList(paramList);
    Collections.sort(localLinkedList);
    localLinkedList.add(new H(-1, -1, -1));
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    int n = 0;
    long l2;
    for (;;)
    {
      int i1 = e();
      l2 = -9223372036854775807L;
      if (n >= i1) {
        break;
      }
      if (peeko != n)
      {
        l3 = f(n);
        l2 = l1;
        if (l3 != -9223372036854775807L) {
          l2 = l1 + l3;
        }
      }
      else
      {
        g localg = d(n);
        paramList = c(c, localLinkedList);
        localArrayList.add(new g(a, b - l1, paramList, d));
        l2 = l1;
      }
      n++;
      l1 = l2;
    }
    long l3 = b;
    if (l3 != -9223372036854775807L) {
      l2 = l3 - l1;
    }
    return new c(a, l2, c, d, e, f, g, h, l, i, j, k, localArrayList);
  }
  
  public final g d(int paramInt)
  {
    return (g)m.get(paramInt);
  }
  
  public final int e()
  {
    return m.size();
  }
  
  public final long f(int paramInt)
  {
    long l3;
    if (paramInt == m.size() - 1)
    {
      long l1 = b;
      long l2 = -9223372036854775807L;
      l3 = l1;
      if (l1 == -9223372036854775807L)
      {
        l3 = l2;
        break label90;
      }
    }
    for (;;)
    {
      l3 -= m.get(paramInt)).b;
      break;
      l3 = m.get(paramInt + 1)).b;
    }
    label90:
    return l3;
  }
  
  public final long g(int paramInt)
  {
    return M.J0(f(paramInt));
  }
}

/* Location:
 * Qualified Name:     o0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */