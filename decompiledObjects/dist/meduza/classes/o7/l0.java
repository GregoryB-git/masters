package o7;

import java.util.Objects;
import x6.b;

public final class l0<E>
  extends t<E>
{
  public static final l0 e = new l0(new Object[0], 0);
  public final transient Object[] c;
  public final transient int d;
  
  public l0(Object[] paramArrayOfObject, int paramInt)
  {
    c = paramArrayOfObject;
    d = paramInt;
  }
  
  public final E get(int paramInt)
  {
    b.v(paramInt, d);
    Object localObject = c[paramInt];
    Objects.requireNonNull(localObject);
    return (E)localObject;
  }
  
  public final int h(int paramInt, Object[] paramArrayOfObject)
  {
    System.arraycopy(c, 0, paramArrayOfObject, paramInt, d);
    return paramInt + d;
  }
  
  public final Object[] i()
  {
    return c;
  }
  
  public final int k()
  {
    return d;
  }
  
  public final int l()
  {
    return 0;
  }
  
  public final boolean m()
  {
    return false;
  }
  
  public final int size()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     o7.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */