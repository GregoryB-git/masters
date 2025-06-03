package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class aaa
  implements ln
{
  public final long a;
  public final long b;
  public final long c;
  public final boolean d;
  public final long e;
  public final long f;
  public final long g;
  public final long h;
  public final qp i;
  public final Uri j;
  public final qa k;
  private final List<qb> l;
  
  public aaa(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, qa paramqa, qp paramqp, Uri paramUri, List<qb> paramList)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramLong3;
    d = paramBoolean;
    e = paramLong4;
    f = paramLong5;
    g = paramLong6;
    h = paramLong7;
    k = paramqa;
    i = paramqp;
    j = paramUri;
    if (paramList == null) {
      paramqa = Collections.emptyList();
    } else {
      paramqa = paramList;
    }
    l = paramqa;
  }
  
  public static yd a(ada paramada)
    throws yh
  {
    try
    {
      paramada.f();
      int m = 0;
      try
      {
        paramada = (yd)abi.C.read(paramada);
        return paramada;
      }
      catch (EOFException paramada) {}
      if (m == 0) {
        break label65;
      }
    }
    catch (NumberFormatException paramada)
    {
      throw new yl(paramada);
    }
    catch (IOException paramada)
    {
      throw new yg(paramada);
    }
    catch (ade paramada)
    {
      throw new yl(paramada);
    }
    catch (EOFException paramada)
    {
      m = 1;
    }
    return yf.a;
    label65:
    throw new yl(paramada);
  }
  
  public static Writer a(Appendable paramAppendable)
  {
    if ((paramAppendable instanceof Writer)) {
      return (Writer)paramAppendable;
    }
    return new zz(paramAppendable);
  }
  
  private static ArrayList<wa> a(List<wa> paramList, LinkedList<lp> paramLinkedList)
  {
    Object localObject = (lp)paramLinkedList.poll();
    int m = a;
    ArrayList localArrayList1 = new ArrayList();
    lp locallp;
    do
    {
      int n = b;
      wa localwa = (wa)paramList.get(n);
      List localList = c;
      ArrayList localArrayList2 = new ArrayList();
      do
      {
        localArrayList2.add((qc)localList.get(c));
        locallp = (lp)paramLinkedList.poll();
        if (a != m) {
          break;
        }
        localObject = locallp;
      } while (b == n);
      localArrayList1.add(new wa(a, b, localArrayList2, d, e));
      localObject = locallp;
    } while (a == m);
    paramLinkedList.addFirst(locallp);
    return localArrayList1;
  }
  
  public static void a(yd paramyd, adb paramadb)
    throws IOException
  {
    abi.C.write(paramadb, paramyd);
  }
  
  public int a()
  {
    return l.size();
  }
  
  public qb a(int paramInt)
  {
    return (qb)l.get(paramInt);
  }
  
  public long b(int paramInt)
  {
    long l1;
    if (paramInt == l.size() - 1)
    {
      l1 = b;
      if (l1 == -9223372036854775807L) {
        return -9223372036854775807L;
      }
    }
    for (long l2 = l.get(paramInt)).b;; l2 = l.get(paramInt)).b)
    {
      return l1 - l2;
      l1 = l.get(paramInt + 1)).b;
    }
  }
  
  public aaa b(List<lp> paramList)
  {
    LinkedList localLinkedList = new LinkedList(paramList);
    Collections.sort(localLinkedList);
    localLinkedList.add(new lp(-1, -1, -1));
    ArrayList localArrayList1 = new ArrayList();
    long l1 = 0L;
    int m = 0;
    long l2;
    for (;;)
    {
      int n = a();
      l2 = -9223372036854775807L;
      if (m >= n) {
        break;
      }
      if (peeka != m)
      {
        l3 = b(m);
        l2 = l1;
        if (l3 != -9223372036854775807L) {
          l2 = l1 + l3;
        }
      }
      else
      {
        paramList = a(m);
        ArrayList localArrayList2 = a(c, localLinkedList);
        localArrayList1.add(new qb(a, b - l1, localArrayList2, d));
        l2 = l1;
      }
      m++;
      l1 = l2;
    }
    long l3 = b;
    if (l3 != -9223372036854775807L) {
      l2 = l3 - l1;
    }
    return new aaa(a, l2, c, d, e, f, g, h, k, i, j, localArrayList1);
  }
  
  public long c(int paramInt)
  {
    return av.b(b(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */