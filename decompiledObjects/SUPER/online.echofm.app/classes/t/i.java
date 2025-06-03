package t;

public class i
  implements Cloneable
{
  public static final Object s = new Object();
  public boolean o = false;
  public int[] p;
  public Object[] q;
  public int r;
  
  public i()
  {
    this(10);
  }
  
  public i(int paramInt)
  {
    if (paramInt == 0)
    {
      p = d.a;
      q = d.c;
    }
    else
    {
      paramInt = d.e(paramInt);
      p = new int[paramInt];
      q = new Object[paramInt];
    }
  }
  
  public void a(int paramInt, Object paramObject)
  {
    int i = r;
    if ((i != 0) && (paramInt <= p[(i - 1)]))
    {
      n(paramInt, paramObject);
      return;
    }
    if ((o) && (i >= p.length)) {
      f();
    }
    int j = r;
    if (j >= p.length)
    {
      i = d.e(j + 1);
      int[] arrayOfInt = new int[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = p;
      System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
      localObject = q;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      p = arrayOfInt;
      q = arrayOfObject;
    }
    p[j] = paramInt;
    q[j] = paramObject;
    r = (j + 1);
  }
  
  public void b()
  {
    int i = r;
    Object[] arrayOfObject = q;
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = null;
    }
    r = 0;
    o = false;
  }
  
  public i d()
  {
    try
    {
      i locali = (i)super.clone();
      p = ((int[])p.clone());
      q = ((Object[])q.clone());
      return locali;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final void f()
  {
    int i = r;
    int[] arrayOfInt = p;
    Object[] arrayOfObject = q;
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      Object localObject = arrayOfObject[j];
      m = k;
      if (localObject != s)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        m = k + 1;
      }
      j++;
    }
    o = false;
    r = k;
  }
  
  public Object g(int paramInt)
  {
    return j(paramInt, null);
  }
  
  public Object j(int paramInt, Object paramObject)
  {
    paramInt = d.a(p, r, paramInt);
    if (paramInt >= 0)
    {
      Object localObject = q[paramInt];
      if (localObject != s) {
        return localObject;
      }
    }
    return paramObject;
  }
  
  public int l(int paramInt)
  {
    if (o) {
      f();
    }
    return p[paramInt];
  }
  
  public void n(int paramInt, Object paramObject)
  {
    int i = d.a(p, r, paramInt);
    if (i >= 0)
    {
      q[i] = paramObject;
    }
    else
    {
      int j = i;
      int k = r;
      Object localObject1;
      if (j < k)
      {
        localObject1 = q;
        if (localObject1[j] == s)
        {
          p[j] = paramInt;
          localObject1[j] = paramObject;
          return;
        }
      }
      i = j;
      if (o)
      {
        i = j;
        if (k >= p.length)
        {
          f();
          i = d.a(p, r, paramInt);
        }
      }
      j = r;
      if (j >= p.length)
      {
        j = d.e(j + 1);
        int[] arrayOfInt = new int[j];
        localObject1 = new Object[j];
        Object localObject2 = p;
        System.arraycopy(localObject2, 0, arrayOfInt, 0, localObject2.length);
        localObject2 = q;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        p = arrayOfInt;
        q = ((Object[])localObject1);
      }
      j = r;
      if (j - i != 0)
      {
        localObject1 = p;
        k = i + 1;
        System.arraycopy(localObject1, i, localObject1, k, j - i);
        localObject1 = q;
        System.arraycopy(localObject1, i, localObject1, k, r - i);
      }
      p[i] = paramInt;
      q[i] = paramObject;
      r += 1;
    }
  }
  
  public int o()
  {
    if (o) {
      f();
    }
    return r;
  }
  
  public Object p(int paramInt)
  {
    if (o) {
      f();
    }
    return q[paramInt];
  }
  
  public String toString()
  {
    if (o() <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(r * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < r; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(l(i));
      localStringBuilder.append('=');
      Object localObject = p(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     t.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */