package t;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class b
  implements Collection, Set
{
  public static Object[] r;
  public static int s;
  public static Object[] t;
  public static int u;
  public static final Object v = new Object();
  public static final Object w = new Object();
  public int[] o;
  public Object[] p;
  public int q;
  
  public b()
  {
    this(0);
  }
  
  public b(int paramInt)
  {
    if (paramInt == 0)
    {
      o = d.a;
      p = d.c;
    }
    else
    {
      a(paramInt);
    }
    q = 0;
  }
  
  public static void g(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      synchronized (w)
      {
        if (u < 10)
        {
          paramArrayOfObject[0] = t;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
        }
      }
    }
    if (paramArrayOfInt.length == 4) {
      synchronized (v)
      {
        if (s < 10)
        {
          paramArrayOfObject[0] = r;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          if (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
        }
      }
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject4;
    PrintStream localPrintStream;
    if (paramInt == 8)
    {
      Object[] arrayOfObject1;
      synchronized (w)
      {
        arrayOfObject1 = t;
        if (arrayOfObject1 == null) {
          break label143;
        }
      }
      localPrintStream = System.out;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("ArraySet Found corrupt ArraySet cache: [0]=");
      ((StringBuilder)localObject4).append(localObject2[0]);
      ((StringBuilder)localObject4).append(" [1]=");
      ((StringBuilder)localObject4).append(localObject2[1]);
      localPrintStream.println(((StringBuilder)localObject4).toString());
      t = null;
      u = 0;
      label143:
      break label303;
      throw ((Throwable)localObject2);
    }
    else if (paramInt == 4)
    {
      Object[] arrayOfObject2;
      synchronized (v)
      {
        arrayOfObject2 = r;
        if (arrayOfObject2 == null) {
          break label294;
        }
      }
      localPrintStream = System.out;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("ArraySet Found corrupt ArraySet cache: [0]=");
      ((StringBuilder)localObject4).append(localObject3[0]);
      ((StringBuilder)localObject4).append(" [1]=");
      ((StringBuilder)localObject4).append(localObject3[1]);
      localPrintStream.println(((StringBuilder)localObject4).toString());
      r = null;
      s = 0;
      label294:
      break label303;
      throw ((Throwable)localObject3);
    }
    label303:
    o = new int[paramInt];
    p = new Object[paramInt];
  }
  
  public boolean add(Object paramObject)
  {
    int i = q;
    int k;
    if (paramObject == null)
    {
      j = k();
      k = 0;
    }
    else
    {
      k = paramObject.hashCode();
      j = i(paramObject, k);
    }
    if (j >= 0) {
      return false;
    }
    int m = j;
    Object localObject = o;
    if (i >= localObject.length)
    {
      j = 8;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i < 4) {
        j = 4;
      }
      Object[] arrayOfObject = p;
      a(j);
      if (i == q)
      {
        int[] arrayOfInt = o;
        if (arrayOfInt.length > 0)
        {
          System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
          System.arraycopy(arrayOfObject, 0, p, 0, arrayOfObject.length);
        }
        g((int[])localObject, arrayOfObject, i);
      }
      else
      {
        throw new ConcurrentModificationException();
      }
    }
    if (m < i)
    {
      localObject = o;
      j = m + 1;
      int n = i - m;
      System.arraycopy(localObject, m, localObject, j, n);
      localObject = p;
      System.arraycopy(localObject, m, localObject, j, n);
    }
    int j = q;
    if (i == j)
    {
      localObject = o;
      if (m < localObject.length)
      {
        localObject[m] = k;
        p[m] = paramObject;
        q = (j + 1);
        return true;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean addAll(Collection paramCollection)
  {
    f(q + paramCollection.size());
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= add(paramCollection.next());
    }
    return bool;
  }
  
  public void clear()
  {
    int i = q;
    if (i != 0)
    {
      int[] arrayOfInt = o;
      Object[] arrayOfObject = p;
      o = d.a;
      p = d.c;
      q = 0;
      g(arrayOfInt, arrayOfObject, i);
    }
    if (q == 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final int d(int paramInt)
  {
    try
    {
      paramInt = d.a(o, q, paramInt);
      return paramInt;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    int i;
    if ((paramObject instanceof Set))
    {
      paramObject = (Set)paramObject;
      if (size() != ((Set)paramObject).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < q)
      {
        boolean bool = ((Set)paramObject).contains(s(i));
        if (!bool) {
          return false;
        }
        i++;
      }
      return true;
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public void f(int paramInt)
  {
    int i = q;
    int[] arrayOfInt = o;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = p;
      a(paramInt);
      paramInt = q;
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, o, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, p, 0, q);
      }
      g(arrayOfInt, arrayOfObject, q);
    }
    if (q == i) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public int hashCode()
  {
    int[] arrayOfInt = o;
    int i = q;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfInt[j];
      j++;
    }
    return k;
  }
  
  public final int i(Object paramObject, int paramInt)
  {
    int i = q;
    if (i == 0) {
      return -1;
    }
    int j = d(paramInt);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(p[j])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (o[k] == paramInt); k++) {
      if (paramObject.equals(p[k])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (o[j] == paramInt))
    {
      if (paramObject.equals(p[j])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public int indexOf(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = k();
    } else {
      i = i(paramObject, paramObject.hashCode());
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (q <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    return new a();
  }
  
  public final int k()
  {
    int i = q;
    if (i == 0) {
      return -1;
    }
    int j = d(0);
    if (j < 0) {
      return j;
    }
    if (p[j] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (o[k] == 0); k++) {
      if (p[k] == null) {
        return k;
      }
    }
    for (i = j - 1; (i >= 0) && (o[i] == 0); i--) {
      if (p[i] == null) {
        return i;
      }
    }
    return k;
  }
  
  public Object q(int paramInt)
  {
    int i = q;
    Object[] arrayOfObject = p;
    Object localObject1 = arrayOfObject[paramInt];
    if (i <= 1)
    {
      clear();
    }
    else
    {
      int j = i - 1;
      Object localObject2 = o;
      int k = localObject2.length;
      int m = 8;
      if ((k > 8) && (i < localObject2.length / 3))
      {
        if (i > 8) {
          m = i + (i >> 1);
        }
        a(m);
        if (paramInt > 0)
        {
          System.arraycopy(localObject2, 0, o, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, p, 0, paramInt);
        }
        if (paramInt < j)
        {
          m = paramInt + 1;
          int[] arrayOfInt = o;
          k = j - paramInt;
          System.arraycopy(localObject2, m, arrayOfInt, paramInt, k);
          System.arraycopy(arrayOfObject, m, p, paramInt, k);
        }
      }
      else
      {
        if (paramInt < j)
        {
          m = paramInt + 1;
          k = j - paramInt;
          System.arraycopy(localObject2, m, localObject2, paramInt, k);
          localObject2 = p;
          System.arraycopy(localObject2, m, localObject2, paramInt, k);
        }
        p[j] = null;
      }
      if (i != q) {
        break label232;
      }
      q = j;
    }
    return localObject1;
    label232:
    throw new ConcurrentModificationException();
  }
  
  public boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
    {
      q(i);
      return true;
    }
    return false;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    int i = q - 1;
    boolean bool = false;
    while (i >= 0)
    {
      if (!paramCollection.contains(p[i]))
      {
        q(i);
        bool = true;
      }
      i--;
    }
    return bool;
  }
  
  public Object s(int paramInt)
  {
    return p[paramInt];
  }
  
  public int size()
  {
    return q;
  }
  
  public Object[] toArray()
  {
    int i = q;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(p, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramArrayOfObject.length < q) {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), q);
    }
    System.arraycopy(p, 0, arrayOfObject, 0, q);
    int i = arrayOfObject.length;
    int j = q;
    if (i > j) {
      arrayOfObject[j] = null;
    }
    return arrayOfObject;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(q * 14);
    localStringBuilder.append('{');
    for (int i = 0; i < q; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = s(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public class a
    extends e
  {
    public a()
    {
      super();
    }
    
    public Object b(int paramInt)
    {
      return s(paramInt);
    }
    
    public void d(int paramInt)
    {
      q(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */