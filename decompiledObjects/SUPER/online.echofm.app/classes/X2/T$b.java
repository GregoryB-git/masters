package X2;

import java.util.Map;

public final class T$b
  extends y
{
  public final transient w q;
  public final transient v r;
  
  public T$b(w paramw, v paramv)
  {
    q = paramw;
    r = paramv;
  }
  
  public v a()
  {
    return r;
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (q.get(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int d(Object[] paramArrayOfObject, int paramInt)
  {
    return a().d(paramArrayOfObject, paramInt);
  }
  
  public boolean k()
  {
    return true;
  }
  
  public g0 q()
  {
    return a().q();
  }
  
  public int size()
  {
    return q.size();
  }
  
  public Object writeReplace()
  {
    return super.writeReplace();
  }
}

/* Location:
 * Qualified Name:     X2.T.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */