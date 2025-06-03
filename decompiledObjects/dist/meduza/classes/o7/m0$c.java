package o7;

import java.util.Objects;
import x6.b;

public final class m0$c
  extends t<Object>
{
  public final transient Object[] c;
  public final transient int d;
  public final transient int e;
  
  public m0$c(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    c = paramArrayOfObject;
    d = paramInt1;
    e = paramInt2;
  }
  
  public final Object get(int paramInt)
  {
    b.v(paramInt, e);
    Object localObject = c[(paramInt * 2 + d)];
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public final boolean m()
  {
    return true;
  }
  
  public final int size()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     o7.m0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */