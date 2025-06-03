package X4;

import Y4.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  public static final String[] b = { "UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT" };
  public static final int[][] c = { { 0, 327708, 327710, 327709, 656318 }, { 590318, 0, 327710, 327709, 656318 }, { 262158, 590300, 0, 590301, 932798 }, { 327709, 327708, 656318, 0, 327710 }, { 327711, 656380, 656382, 656381, 0 } };
  public static final int[][] d;
  public static final int[][] e;
  public final byte[] a;
  
  static
  {
    Object localObject = new int[5]['Ā'];
    d = (int[][])localObject;
    localObject[0][32] = 1;
    for (int i = 65; i <= 90; i++) {
      d[0][i] = (i - 63);
    }
    d[1][32] = 1;
    for (i = 97; i <= 122; i++) {
      d[1][i] = (i - 95);
    }
    d[2][32] = 1;
    for (i = 48; i <= 57; i++) {
      d[2][i] = (i - 46);
    }
    localObject = d[2];
    localObject[44] = 12;
    localObject[46] = 13;
    for (i = 0; i < 28; i++) {
      d[3][new int[] { 0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127 }[i]] = i;
    }
    for (i = 0; i < 31; i++)
    {
      j = new int[] { 0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125 }[i];
      if (j > 0) {
        d[4][j] = i;
      }
    }
    localObject = new int[6][6];
    e = (int[][])localObject;
    int j = localObject.length;
    for (i = 0; i < j; i++) {
      Arrays.fill(localObject[i], -1);
    }
    int[][] arrayOfInt = e;
    arrayOfInt[0][4] = 0;
    localObject = arrayOfInt[1];
    localObject[4] = 0;
    localObject[0] = 28;
    arrayOfInt[3][4] = 0;
    localObject = arrayOfInt[2];
    localObject[4] = 0;
    localObject[0] = 15;
  }
  
  public d(byte[] paramArrayOfByte)
  {
    a = paramArrayOfByte;
  }
  
  public static Collection b(Iterable paramIterable)
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator1 = paramIterable.iterator();
    while (localIterator1.hasNext())
    {
      paramIterable = (f)localIterator1.next();
      Iterator localIterator2 = localLinkedList.iterator();
      for (;;)
      {
        if (!localIterator2.hasNext()) {
          break label91;
        }
        f localf = (f)localIterator2.next();
        if (localf.f(paramIterable)) {
          break;
        }
        if (paramIterable.f(localf)) {
          localIterator2.remove();
        }
      }
      label91:
      localLinkedList.add(paramIterable);
    }
    return localLinkedList;
  }
  
  public static void d(f paramf, int paramInt1, int paramInt2, Collection paramCollection)
  {
    f localf = paramf.b(paramInt1);
    paramCollection.add(localf.g(4, paramInt2));
    if (paramf.e() != 4) {
      paramCollection.add(localf.h(4, paramInt2));
    }
    if ((paramInt2 == 3) || (paramInt2 == 4)) {
      paramCollection.add(localf.g(2, 16 - paramInt2).g(2, 1));
    }
    if (paramf.c() > 0) {
      paramCollection.add(paramf.a(paramInt1).a(paramInt1 + 1));
    }
  }
  
  public static Collection f(Iterable paramIterable, int paramInt1, int paramInt2)
  {
    LinkedList localLinkedList = new LinkedList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      d((f)paramIterable.next(), paramInt1, paramInt2, localLinkedList);
    }
    return b(localLinkedList);
  }
  
  public a a()
  {
    Object localObject = Collections.singletonList(f.e);
    for (int i = 0;; i++)
    {
      byte[] arrayOfByte = a;
      if (i >= arrayOfByte.length) {
        break;
      }
      int j = i + 1;
      if (j < arrayOfByte.length) {
        k = arrayOfByte[j];
      } else {
        k = 0;
      }
      int m = arrayOfByte[i];
      if (m != 13) {
        if (m != 44) {
          if (m != 46) {
            if (m == 58) {}
          }
        }
      }
      while (k != 10)
      {
        do
        {
          do
          {
            do
            {
              k = 0;
              break;
            } while (k != 32);
            k = 5;
            break;
          } while (k != 32);
          k = 3;
          break;
        } while (k != 32);
        k = 4;
        break;
      }
      int k = 2;
      if (k > 0)
      {
        localObject = f((Iterable)localObject, i, k);
        i = j;
      }
      else
      {
        localObject = e((Iterable)localObject, i);
      }
    }
    return ((f)Collections.min((Collection)localObject, new a())).i(a);
  }
  
  public final void c(f paramf, int paramInt, Collection paramCollection)
  {
    int i = (char)(a[paramInt] & 0xFF);
    int j = d[paramf.e()][i];
    int k = 0;
    if (j > 0) {
      j = 1;
    } else {
      j = 0;
    }
    Object localObject2;
    for (Object localObject1 = null; k <= 4; localObject1 = localObject2)
    {
      int m = d[k][i];
      localObject2 = localObject1;
      if (m > 0)
      {
        Object localObject3 = localObject1;
        if (localObject1 == null) {
          localObject3 = paramf.b(paramInt);
        }
        if ((j == 0) || (k == paramf.e()) || (k == 2)) {
          paramCollection.add(((f)localObject3).g(k, m));
        }
        localObject2 = localObject3;
        if (j == 0)
        {
          localObject2 = localObject3;
          if (e[paramf.e()][k] >= 0)
          {
            paramCollection.add(((f)localObject3).h(k, m));
            localObject2 = localObject3;
          }
        }
      }
      k++;
    }
    if ((paramf.c() > 0) || (d[paramf.e()][i] == 0)) {
      paramCollection.add(paramf.a(paramInt));
    }
  }
  
  public final Collection e(Iterable paramIterable, int paramInt)
  {
    LinkedList localLinkedList = new LinkedList();
    paramIterable = paramIterable.iterator();
    while (paramIterable.hasNext()) {
      c((f)paramIterable.next(), paramInt, localLinkedList);
    }
    return b(localLinkedList);
  }
  
  public class a
    implements Comparator
  {
    public a() {}
    
    public int a(f paramf1, f paramf2)
    {
      return paramf1.d() - paramf2.d();
    }
  }
}

/* Location:
 * Qualified Name:     X4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */