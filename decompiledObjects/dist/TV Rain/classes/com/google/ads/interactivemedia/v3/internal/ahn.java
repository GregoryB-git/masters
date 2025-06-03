package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;

public final class ahn<K, V>
  extends AbstractMap<K, V>
  implements ahk<K, V>, Serializable
{
  public transient K[] a;
  public transient V[] b;
  public transient int c;
  public transient int d;
  private transient int[] e;
  private transient int[] f;
  private transient int[] g;
  private transient int[] h;
  private transient int i;
  private transient int j;
  private transient int[] k;
  private transient int[] l;
  private transient Set<K> m;
  private transient Set<V> n;
  private transient Set<Map.Entry<K, V>> o;
  private transient ahk<V, K> p;
  
  private ahn(int paramInt)
  {
    c(paramInt);
  }
  
  private final int a(Object paramObject, int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, Object[] paramArrayOfObject)
  {
    for (paramInt = paramArrayOfInt1[f(paramInt)]; paramInt != -1; paramInt = paramArrayOfInt2[paramInt]) {
      if (ahf.a(paramArrayOfObject[paramInt], paramObject)) {
        return paramInt;
      }
    }
    return -1;
  }
  
  public static <K, V> ahn<K, V> a(int paramInt)
  {
    return new ahn(2);
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool;
    if (paramInt1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    f(paramInt1, paramInt2);
    g(paramInt1, paramInt3);
    c(k[paramInt1], l[paramInt1]);
    int i1 = c - 1;
    if (i1 != paramInt1)
    {
      paramInt3 = k[i1];
      paramInt2 = l[i1];
      c(paramInt3, paramInt1);
      c(paramInt1, paramInt2);
      Object[] arrayOfObject = a;
      Object localObject1 = arrayOfObject[i1];
      Object localObject2 = b;
      localObject3 = localObject2[i1];
      arrayOfObject[paramInt1] = localObject1;
      localObject2[paramInt1] = localObject3;
      paramInt2 = f(aim.b(localObject1));
      localObject2 = e;
      paramInt3 = localObject2[paramInt2];
      if (paramInt3 == i1) {
        localObject2[paramInt2] = paramInt1;
      }
      int i2;
      for (paramInt2 = g[paramInt3];; paramInt2 = i2)
      {
        if (paramInt2 == i1)
        {
          g[paramInt3] = paramInt1;
          localObject2 = g;
          localObject2[paramInt1] = localObject2[i1];
          localObject2[i1] = -1;
          paramInt2 = f(aim.b(localObject3));
          localObject3 = f;
          paramInt3 = localObject3[paramInt2];
          if (paramInt3 == i1) {
            localObject3[paramInt2] = paramInt1;
          }
          for (paramInt2 = h[paramInt3];; paramInt2 = i2)
          {
            if (paramInt2 == i1)
            {
              h[paramInt3] = paramInt1;
              localObject3 = h;
              localObject3[paramInt1] = localObject3[i1];
              localObject3[i1] = -1;
              break;
            }
            i2 = h[paramInt2];
            paramInt3 = paramInt2;
          }
        }
        i2 = g[paramInt2];
        paramInt3 = paramInt2;
      }
    }
    Object localObject3 = a;
    paramInt1 = c;
    localObject3[(paramInt1 - 1)] = null;
    b[(paramInt1 - 1)] = null;
    c = (paramInt1 - 1);
    d += 1;
  }
  
  private final void a(int paramInt, V paramV, boolean paramBoolean)
  {
    boolean bool;
    if (paramInt != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    int i1 = aim.b(paramV);
    int i2 = b(paramV, i1);
    int i3 = paramInt;
    if (i2 != -1) {
      if (paramBoolean)
      {
        b(i2, i1);
        i3 = paramInt;
        if (paramInt == c) {
          i3 = i2;
        }
      }
      else
      {
        paramV = String.valueOf(paramV);
        StringBuilder localStringBuilder = new StringBuilder(paramV.length() + 30);
        localStringBuilder.append("Value already present in map: ");
        localStringBuilder.append(paramV);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    g(i3, aim.b(b[i3]));
    b[i3] = paramV;
    e(i3, i1);
  }
  
  private static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    int i1 = paramArrayOfInt.length;
    paramArrayOfInt = Arrays.copyOf(paramArrayOfInt, paramInt);
    Arrays.fill(paramArrayOfInt, i1, paramInt, -1);
    return paramArrayOfInt;
  }
  
  private final void b(int paramInt, K paramK, boolean paramBoolean)
  {
    boolean bool;
    if (paramInt != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    int i1 = aim.b(paramK);
    int i2 = a(paramK, i1);
    int i3 = j;
    int i4 = -2;
    int i5 = paramInt;
    if (i2 != -1) {
      if (paramBoolean)
      {
        int i6 = k[i2];
        int i7 = l[i2];
        a(i2, i1);
        i3 = i6;
        i4 = i7;
        i5 = paramInt;
        if (paramInt == c)
        {
          i5 = i2;
          i3 = i6;
          i4 = i7;
        }
      }
      else
      {
        paramK = String.valueOf(paramK);
        StringBuilder localStringBuilder = new StringBuilder(paramK.length() + 28);
        localStringBuilder.append("Key already present in map: ");
        localStringBuilder.append(paramK);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
    }
    if (i3 == i5)
    {
      paramInt = k[i5];
    }
    else
    {
      paramInt = i3;
      if (i3 == c) {
        paramInt = i2;
      }
    }
    if (i4 == i5) {
      i2 = l[i5];
    } else if (i4 != c) {
      i2 = i4;
    }
    c(k[i5], l[i5]);
    f(i5, aim.b(a[i5]));
    a[i5] = paramK;
    d(i5, aim.b(paramK));
    c(paramInt, i5);
    c(i5, i2);
  }
  
  private final void c(int paramInt)
  {
    aim.a(paramInt, "expectedSize");
    int i1 = aim.a(paramInt, 1.0D);
    c = 0;
    a = new Object[paramInt];
    b = new Object[paramInt];
    e = d(i1);
    f = d(i1);
    g = d(paramInt);
    h = d(paramInt);
    i = -2;
    j = -2;
    k = d(paramInt);
    l = d(paramInt);
  }
  
  private final void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -2) {
      i = paramInt2;
    } else {
      l[paramInt1] = paramInt2;
    }
    if (paramInt2 == -2)
    {
      j = paramInt1;
      return;
    }
    k[paramInt2] = paramInt1;
  }
  
  private final void d(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    paramInt2 = f(paramInt2);
    int[] arrayOfInt1 = g;
    int[] arrayOfInt2 = e;
    arrayOfInt1[paramInt1] = arrayOfInt2[paramInt2];
    arrayOfInt2[paramInt2] = paramInt1;
  }
  
  private static int[] d(int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    Arrays.fill(arrayOfInt, -1);
    return arrayOfInt;
  }
  
  private final void e(int paramInt)
  {
    int[] arrayOfInt1 = g;
    int i1;
    if (arrayOfInt1.length < paramInt)
    {
      i1 = aim.a(arrayOfInt1.length, paramInt);
      a = Arrays.copyOf(a, i1);
      b = Arrays.copyOf(b, i1);
      g = a(g, i1);
      h = a(h, i1);
      k = a(k, i1);
      l = a(l, i1);
    }
    if (e.length < paramInt)
    {
      paramInt = aim.a(paramInt, 1.0D);
      e = d(paramInt);
      f = d(paramInt);
      for (paramInt = 0; paramInt < c; paramInt++)
      {
        i1 = f(aim.b(a[paramInt]));
        arrayOfInt1 = g;
        int[] arrayOfInt2 = e;
        arrayOfInt1[paramInt] = arrayOfInt2[i1];
        arrayOfInt2[i1] = paramInt;
        i1 = f(aim.b(b[paramInt]));
        arrayOfInt1 = h;
        arrayOfInt2 = f;
        arrayOfInt1[paramInt] = arrayOfInt2[i1];
        arrayOfInt2[i1] = paramInt;
      }
    }
  }
  
  private final void e(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    paramInt2 = f(paramInt2);
    int[] arrayOfInt1 = h;
    int[] arrayOfInt2 = f;
    arrayOfInt1[paramInt1] = arrayOfInt2[paramInt2];
    arrayOfInt2[paramInt2] = paramInt1;
  }
  
  private final int f(int paramInt)
  {
    return paramInt & e.length - 1;
  }
  
  private final void f(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    paramInt2 = f(paramInt2);
    Object localObject1 = e;
    int i1 = localObject1[paramInt2];
    if (i1 == paramInt1)
    {
      localObject2 = g;
      localObject1[paramInt2] = localObject2[paramInt1];
      localObject2[paramInt1] = -1;
      return;
    }
    int i2;
    for (paramInt2 = g[i1]; paramInt2 != -1; paramInt2 = i2)
    {
      if (paramInt2 == paramInt1)
      {
        localObject2 = g;
        localObject2[i1] = localObject2[paramInt1];
        localObject2[paramInt1] = -1;
        return;
      }
      i2 = g[paramInt2];
      i1 = paramInt2;
    }
    localObject1 = String.valueOf(a[paramInt1]);
    Object localObject2 = new StringBuilder(((String)localObject1).length() + 32);
    ((StringBuilder)localObject2).append("Expected to find entry with key ");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new AssertionError(((StringBuilder)localObject2).toString());
  }
  
  private final void g(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt1 != -1) {
      bool = true;
    } else {
      bool = false;
    }
    ahf.a(bool);
    paramInt2 = f(paramInt2);
    Object localObject1 = f;
    int i1 = localObject1[paramInt2];
    if (i1 == paramInt1)
    {
      localObject2 = h;
      localObject1[paramInt2] = localObject2[paramInt1];
      localObject2[paramInt1] = -1;
      return;
    }
    int i2;
    for (paramInt2 = h[i1]; paramInt2 != -1; paramInt2 = i2)
    {
      if (paramInt2 == paramInt1)
      {
        localObject2 = h;
        localObject2[i1] = localObject2[paramInt1];
        localObject2[paramInt1] = -1;
        return;
      }
      i2 = h[paramInt2];
      i1 = paramInt2;
    }
    localObject1 = String.valueOf(b[paramInt1]);
    Object localObject2 = new StringBuilder(((String)localObject1).length() + 34);
    ((StringBuilder)localObject2).append("Expected to find entry with value ");
    ((StringBuilder)localObject2).append((String)localObject1);
    throw new AssertionError(((StringBuilder)localObject2).toString());
  }
  
  private final void readObject(ObjectInputStream paramObjectInputStream)
    throws IOException, ClassNotFoundException
  {
    paramObjectInputStream.defaultReadObject();
    int i1 = aie.a(paramObjectInputStream);
    c(16);
    aie.a(this, paramObjectInputStream, i1);
  }
  
  private final void writeObject(ObjectOutputStream paramObjectOutputStream)
    throws IOException
  {
    paramObjectOutputStream.defaultWriteObject();
    aie.a(this, paramObjectOutputStream);
  }
  
  public final int a(Object paramObject)
  {
    return a(paramObject, aim.b(paramObject));
  }
  
  public final int a(Object paramObject, int paramInt)
  {
    return a(paramObject, paramInt, e, g, a);
  }
  
  public final K a(V paramV, K paramK, boolean paramBoolean)
  {
    int i1 = aim.b(paramV);
    int i2 = b(paramV, i1);
    paramBoolean = false;
    if (i2 != -1)
    {
      paramV = a[i2];
      if (ahf.a(paramV, paramK)) {
        return paramK;
      }
      b(i2, paramK, false);
      return paramV;
    }
    i2 = j;
    int i3 = aim.b(paramK);
    if (a(paramK, i3) == -1) {
      paramBoolean = true;
    }
    ahf.a(paramBoolean, "Key already present: %s", paramK);
    e(c + 1);
    Object[] arrayOfObject = a;
    int i4 = c;
    arrayOfObject[i4] = paramK;
    b[i4] = paramV;
    d(i4, i3);
    e(c, i1);
    if (i2 == -2) {
      i1 = i;
    } else {
      i1 = l[i2];
    }
    c(i2, c);
    c(c, i1);
    c += 1;
    d += 1;
    return null;
  }
  
  public final Set<V> a()
  {
    Set localSet = n;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new ahs(this);
      n = ((Set)localObject);
    }
    return (Set<V>)localObject;
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, aim.b(b[paramInt1]));
  }
  
  public final int b(Object paramObject)
  {
    return b(paramObject, aim.b(paramObject));
  }
  
  public final int b(Object paramObject, int paramInt)
  {
    return a(paramObject, paramInt, f, h, b);
  }
  
  public final ahk<V, K> b()
  {
    ahk localahk = p;
    Object localObject = localahk;
    if (localahk == null)
    {
      localObject = new ahr(this);
      p = ((ahk)localObject);
    }
    return (ahk<V, K>)localObject;
  }
  
  public final void b(int paramInt)
  {
    a(paramInt, aim.b(a[paramInt]));
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, aim.b(a[paramInt1]), paramInt2);
  }
  
  public final K c(Object paramObject)
  {
    int i1 = b(paramObject);
    if (i1 == -1) {
      return null;
    }
    return (K)a[i1];
  }
  
  public final void clear()
  {
    Arrays.fill(a, 0, c, null);
    Arrays.fill(b, 0, c, null);
    Arrays.fill(e, -1);
    Arrays.fill(f, -1);
    Arrays.fill(g, 0, c, -1);
    Arrays.fill(h, 0, c, -1);
    Arrays.fill(k, 0, c, -1);
    Arrays.fill(l, 0, c, -1);
    c = 0;
    i = -2;
    j = -2;
    d += 1;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return a(paramObject) != -1;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    return b(paramObject) != -1;
  }
  
  public final K d(Object paramObject)
  {
    int i1 = aim.b(paramObject);
    int i2 = b(paramObject, i1);
    if (i2 == -1) {
      return null;
    }
    paramObject = a[i2];
    b(i2, i1);
    return (K)paramObject;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    Set localSet = o;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new aho(this);
      o = ((Set)localObject);
    }
    return (Set<Map.Entry<K, V>>)localObject;
  }
  
  public final V get(Object paramObject)
  {
    int i1 = a(paramObject);
    if (i1 == -1) {
      return null;
    }
    return (V)b[i1];
  }
  
  public final Set<K> keySet()
  {
    Set localSet = m;
    Object localObject = localSet;
    if (localSet == null)
    {
      localObject = new aht(this);
      m = ((Set)localObject);
    }
    return (Set<K>)localObject;
  }
  
  public final V put(K paramK, V paramV)
  {
    int i1 = aim.b(paramK);
    int i2 = a(paramK, i1);
    boolean bool = false;
    if (i2 != -1)
    {
      paramK = b[i2];
      if (ahf.a(paramK, paramV)) {
        return paramV;
      }
      a(i2, paramV, false);
      return paramK;
    }
    i2 = aim.b(paramV);
    if (b(paramV, i2) == -1) {
      bool = true;
    }
    ahf.a(bool, "Value already present: %s", paramV);
    e(c + 1);
    Object[] arrayOfObject = a;
    int i3 = c;
    arrayOfObject[i3] = paramK;
    b[i3] = paramV;
    d(i3, i1);
    e(c, i2);
    c(j, c);
    c(c, -2);
    c += 1;
    d += 1;
    return null;
  }
  
  public final V remove(Object paramObject)
  {
    int i1 = aim.b(paramObject);
    int i2 = a(paramObject, i1);
    if (i2 == -1) {
      return null;
    }
    paramObject = b[i2];
    a(i2, i1);
    return (V)paramObject;
  }
  
  public final int size()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */