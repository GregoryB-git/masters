package t;

public class f
  implements Cloneable
{
  public static final Object s = new Object();
  public boolean o = false;
  public long[] p;
  public Object[] q;
  public int r;
  
  public f()
  {
    this(10);
  }
  
  public f(int paramInt)
  {
    if (paramInt == 0)
    {
      p = d.b;
      q = d.c;
    }
    else
    {
      paramInt = d.f(paramInt);
      p = new long[paramInt];
      q = new Object[paramInt];
    }
  }
  
  public void a(long paramLong, Object paramObject)
  {
    int i = r;
    if ((i != 0) && (paramLong <= p[(i - 1)]))
    {
      l(paramLong, paramObject);
      return;
    }
    if ((o) && (i >= p.length)) {
      d();
    }
    i = r;
    if (i >= p.length)
    {
      int j = d.f(i + 1);
      long[] arrayOfLong = new long[j];
      Object[] arrayOfObject = new Object[j];
      Object localObject = p;
      System.arraycopy(localObject, 0, arrayOfLong, 0, localObject.length);
      localObject = q;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      p = arrayOfLong;
      q = arrayOfObject;
    }
    p[i] = paramLong;
    q[i] = paramObject;
    r = (i + 1);
  }
  
  public f b()
  {
    try
    {
      f localf = (f)super.clone();
      p = ((long[])p.clone());
      q = ((Object[])q.clone());
      return localf;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final void d()
  {
    int i = r;
    long[] arrayOfLong = p;
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
          arrayOfLong[k] = arrayOfLong[j];
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
  
  public Object f(long paramLong)
  {
    return g(paramLong, null);
  }
  
  public Object g(long paramLong, Object paramObject)
  {
    int i = d.b(p, r, paramLong);
    if (i >= 0)
    {
      Object localObject = q[i];
      if (localObject != s) {
        return localObject;
      }
    }
    return paramObject;
  }
  
  public long j(int paramInt)
  {
    if (o) {
      d();
    }
    return p[paramInt];
  }
  
  public void l(long paramLong, Object paramObject)
  {
    int i = d.b(p, r, paramLong);
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
          p[j] = paramLong;
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
          d();
          i = d.b(p, r, paramLong);
        }
      }
      j = r;
      if (j >= p.length)
      {
        j = d.f(j + 1);
        localObject1 = new long[j];
        Object[] arrayOfObject = new Object[j];
        Object localObject2 = p;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        localObject2 = q;
        System.arraycopy(localObject2, 0, arrayOfObject, 0, localObject2.length);
        p = ((long[])localObject1);
        q = arrayOfObject;
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
      p[i] = paramLong;
      q[i] = paramObject;
      r += 1;
    }
  }
  
  public void n(long paramLong)
  {
    int i = d.b(p, r, paramLong);
    if (i >= 0)
    {
      Object[] arrayOfObject = q;
      Object localObject1 = arrayOfObject[i];
      Object localObject2 = s;
      if (localObject1 != localObject2)
      {
        arrayOfObject[i] = localObject2;
        o = true;
      }
    }
  }
  
  public int o()
  {
    if (o) {
      d();
    }
    return r;
  }
  
  public Object p(int paramInt)
  {
    if (o) {
      d();
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
      localStringBuilder.append(j(i));
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
 * Qualified Name:     t.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */