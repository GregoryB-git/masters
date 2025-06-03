package com.google.ads.interactivemedia.v3.internal;

final class ain<E>
  extends aid<E>
{
  public static final ain<Object> a = new ain(new Object[0], 0, null, 0, 0);
  private final transient Object[] b;
  private final transient Object[] c;
  private final transient int d;
  private final transient int e;
  private final transient int f;
  
  public ain(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    b = paramArrayOfObject1;
    c = paramArrayOfObject2;
    d = paramInt2;
    e = paramInt1;
    f = paramInt3;
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final int b(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(b, 0, paramArrayOfObject, paramInt, f);
    return paramInt + f;
  }
  
  public final aio<E> b()
  {
    return c().b();
  }
  
  public final boolean contains(Object paramObject)
  {
    Object[] arrayOfObject = c;
    if ((paramObject != null) && (arrayOfObject != null)) {
      for (int i = aim.b(paramObject);; i++)
      {
        i &= d;
        Object localObject = arrayOfObject[i];
        if (localObject == null) {
          return false;
        }
        if (localObject.equals(paramObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final Object[] d()
  {
    return b;
  }
  
  public final int e()
  {
    return 0;
  }
  
  public final int f()
  {
    return f;
  }
  
  public final boolean g()
  {
    return false;
  }
  
  public final ahw<E> h()
  {
    return ahw.a(b, f);
  }
  
  public final int hashCode()
  {
    return e;
  }
  
  public final int size()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */