package X2;

import W2.m;
import java.util.Objects;

public class S
  extends v
{
  public static final v s = new S(new Object[0], 0);
  public final transient Object[] q;
  public final transient int r;
  
  public S(Object[] paramArrayOfObject, int paramInt)
  {
    q = paramArrayOfObject;
    r = paramInt;
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    System.arraycopy(q, 0, paramArrayOfObject, paramInt, r);
    return paramInt + r;
  }
  
  public Object[] f()
  {
    return q;
  }
  
  public int g()
  {
    return r;
  }
  
  public Object get(int paramInt)
  {
    m.h(paramInt, r);
    Object localObject = q[paramInt];
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public int i()
  {
    return 0;
  }
  
  public boolean k()
  {
    return false;
  }
  
  public int size()
  {
    return r;
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */