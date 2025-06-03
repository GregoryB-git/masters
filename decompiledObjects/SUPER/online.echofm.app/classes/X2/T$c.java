package X2;

import W2.m;
import java.util.Objects;

public final class T$c
  extends v
{
  public final transient Object[] q;
  public final transient int r;
  public final transient int s;
  
  public T$c(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    q = paramArrayOfObject;
    r = paramInt1;
    s = paramInt2;
  }
  
  public Object get(int paramInt)
  {
    m.h(paramInt, s);
    Object localObject = q[(paramInt * 2 + r)];
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public boolean k()
  {
    return true;
  }
  
  public int size()
  {
    return s;
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.T.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */