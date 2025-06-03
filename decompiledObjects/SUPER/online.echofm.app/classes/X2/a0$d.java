package X2;

import W2.m;
import java.util.AbstractSet;
import java.util.Collection;

public abstract class a0$d
  extends AbstractSet
{
  public boolean removeAll(Collection paramCollection)
  {
    return a0.i(this, paramCollection);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    return super.retainAll((Collection)m.j(paramCollection));
  }
}

/* Location:
 * Qualified Name:     X2.a0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */