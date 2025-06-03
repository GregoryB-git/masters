package X2;

import W2.m;
import java.util.List;

public class v$e
  extends v
{
  public final transient int q;
  public final transient int r;
  
  public v$e(v paramv, int paramInt1, int paramInt2)
  {
    q = paramInt1;
    r = paramInt2;
  }
  
  public Object[] f()
  {
    return s.f();
  }
  
  public int g()
  {
    return s.i() + q + r;
  }
  
  public Object get(int paramInt)
  {
    m.h(paramInt, r);
    return s.get(paramInt + q);
  }
  
  public v h0(int paramInt1, int paramInt2)
  {
    m.n(paramInt1, paramInt2, r);
    v localv = s;
    int i = q;
    return localv.h0(paramInt1 + i, paramInt2 + i);
  }
  
  public int i()
  {
    return s.i() + q;
  }
  
  public boolean k()
  {
    return true;
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
 * Qualified Name:     X2.v.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */