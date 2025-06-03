package q5;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;
import h5.a;
import h5.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v5.e0;
import x6.b;

public final class j
  implements g
{
  public final List<e> a;
  public final long[] b;
  public final long[] c;
  
  public j(ArrayList paramArrayList)
  {
    a = Collections.unmodifiableList(new ArrayList(paramArrayList));
    b = new long[paramArrayList.size() * 2];
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      e locale = (e)paramArrayList.get(i);
      int j = i * 2;
      long[] arrayOfLong = b;
      arrayOfLong[j] = b;
      arrayOfLong[(j + 1)] = c;
    }
    paramArrayList = b;
    paramArrayList = Arrays.copyOf(paramArrayList, paramArrayList.length);
    c = paramArrayList;
    Arrays.sort(paramArrayList);
  }
  
  public final int f(long paramLong)
  {
    int i = e0.b(c, paramLong, false);
    if (i >= c.length) {
      i = -1;
    }
    return i;
  }
  
  public final long g(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramInt < c.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    return c[paramInt];
  }
  
  public final List<a> h(long paramLong)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    Object localObject1;
    int k;
    Object localObject2;
    for (int j = 0; j < a.size(); j++)
    {
      localObject1 = b;
      k = j * 2;
      if ((localObject1[k] <= paramLong) && (paramLong < localObject1[(k + 1)]))
      {
        localObject2 = (e)a.get(j);
        localObject1 = a;
        if (e == -3.4028235E38F) {
          localArrayList2.add(localObject2);
        } else {
          localArrayList1.add(localObject1);
        }
      }
    }
    Collections.sort(localArrayList2, new i(0));
    for (j = i; j < localArrayList2.size(); j++)
    {
      localObject1 = geta;
      localObject1.getClass();
      CharSequence localCharSequence = a;
      localObject2 = d;
      Layout.Alignment localAlignment1 = b;
      Layout.Alignment localAlignment2 = c;
      k = o;
      float f1 = p;
      int m = q;
      int n = v;
      float f2 = w;
      float f3 = r;
      float f4 = s;
      boolean bool = t;
      int i1 = u;
      i = x;
      float f5 = y;
      localArrayList1.add(new a(localCharSequence, localAlignment1, localAlignment2, (Bitmap)localObject2, -1 - j, 1, k, f1, m, n, f2, f3, f4, bool, i1, i, f5));
    }
    return localArrayList1;
  }
  
  public final int i()
  {
    return c.length;
  }
}

/* Location:
 * Qualified Name:     q5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */