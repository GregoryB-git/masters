package o7;

import x6.b;

public final class n0<E>
  extends x<E>
{
  public static final Object[] q;
  public static final n0<Object> r;
  public final transient Object[] d;
  public final transient int e;
  public final transient Object[] f;
  public final transient int o;
  public final transient int p;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    q = arrayOfObject;
    r = new n0(arrayOfObject, 0, arrayOfObject, 0, 0);
  }
  
  public n0(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    d = paramArrayOfObject1;
    e = paramInt1;
    f = paramArrayOfObject2;
    o = paramInt2;
    p = paramInt3;
  }
  
  public final boolean contains(Object paramObject)
  {
    Object[] arrayOfObject = f;
    if ((paramObject != null) && (arrayOfObject.length != 0)) {
      for (int i = b.s0(paramObject);; i++)
      {
        i &= o;
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
  
  public final int h(int paramInt, Object[] paramArrayOfObject)
  {
    System.arraycopy(d, 0, paramArrayOfObject, paramInt, p);
    return paramInt + p;
  }
  
  public final int hashCode()
  {
    return e;
  }
  
  public final Object[] i()
  {
    return d;
  }
  
  public final int k()
  {
    return p;
  }
  
  public final int l()
  {
    return 0;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final x0<E> n()
  {
    return a().r(0);
  }
  
  public final t<E> r()
  {
    Object[] arrayOfObject = d;
    return t.o(p, arrayOfObject);
  }
  
  public final int size()
  {
    return p;
  }
}

/* Location:
 * Qualified Name:     o7.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */