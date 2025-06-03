package X2;

import java.util.Iterator;

public final class x$d
  extends t
{
  private static final long serialVersionUID = 0L;
  public final transient x p;
  
  public x$d(x paramx)
  {
    p = paramx;
  }
  
  public boolean contains(Object paramObject)
  {
    return p.b(paramObject);
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    g0 localg0 = p.r.k().q();
    while (localg0.hasNext()) {
      paramInt = ((t)localg0.next()).d(paramArrayOfObject, paramInt);
    }
    return paramInt;
  }
  
  public g0 q()
  {
    return p.j();
  }
  
  public int size()
  {
    return p.size();
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */