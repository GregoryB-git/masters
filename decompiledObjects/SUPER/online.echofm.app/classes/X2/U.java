package X2;

public final class U
  extends y
{
  public static final Object[] v;
  public static final U w;
  public final transient Object[] q;
  public final transient int r;
  public final transient Object[] s;
  public final transient int t;
  public final transient int u;
  
  static
  {
    Object[] arrayOfObject = new Object[0];
    v = arrayOfObject;
    w = new U(arrayOfObject, 0, arrayOfObject, 0, 0);
  }
  
  public U(Object[] paramArrayOfObject1, int paramInt1, Object[] paramArrayOfObject2, int paramInt2, int paramInt3)
  {
    q = paramArrayOfObject1;
    r = paramInt1;
    s = paramArrayOfObject2;
    t = paramInt2;
    u = paramInt3;
  }
  
  public v V()
  {
    return v.D(q, u);
  }
  
  public boolean W()
  {
    return true;
  }
  
  public boolean contains(Object paramObject)
  {
    Object[] arrayOfObject = s;
    if ((paramObject != null) && (arrayOfObject.length != 0)) {
      for (int i = s.c(paramObject);; i++)
      {
        i &= t;
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
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(q, 0, paramArrayOfObject, paramInt, u);
    return paramInt + u;
  }
  
  public Object[] f()
  {
    return q;
  }
  
  public int g()
  {
    return u;
  }
  
  public int hashCode()
  {
    return r;
  }
  
  public int i()
  {
    return 0;
  }
  
  public boolean k()
  {
    return false;
  }
  
  public g0 q()
  {
    return a().q();
  }
  
  public int size()
  {
    return u;
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */