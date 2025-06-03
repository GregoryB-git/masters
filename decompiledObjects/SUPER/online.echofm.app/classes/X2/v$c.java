package X2;

import W2.m;
import java.util.AbstractCollection;
import java.util.List;

public class v$c
  extends v
{
  public final transient v q;
  
  public v$c(v paramv)
  {
    q = paramv;
  }
  
  public boolean contains(Object paramObject)
  {
    return q.contains(paramObject);
  }
  
  public v f0()
  {
    return q;
  }
  
  public Object get(int paramInt)
  {
    m.h(paramInt, size());
    return q.get(j0(paramInt));
  }
  
  public v h0(int paramInt1, int paramInt2)
  {
    m.n(paramInt1, paramInt2, size());
    return q.h0(k0(paramInt2), k0(paramInt1)).f0();
  }
  
  public int indexOf(Object paramObject)
  {
    int i = q.lastIndexOf(paramObject);
    if (i >= 0) {
      i = j0(i);
    } else {
      i = -1;
    }
    return i;
  }
  
  public final int j0(int paramInt)
  {
    return size() - 1 - paramInt;
  }
  
  public boolean k()
  {
    return q.k();
  }
  
  public final int k0(int paramInt)
  {
    return size() - paramInt;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i = q.indexOf(paramObject);
    if (i >= 0) {
      i = j0(i);
    } else {
      i = -1;
    }
    return i;
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
 * Qualified Name:     X2.v.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */