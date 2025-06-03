package o7;

import java.util.AbstractCollection;
import java.util.List;

public final class t$b<E>
  extends a<E>
{
  public final t<E> c;
  
  public t$b(int paramInt, t paramt)
  {
    super(paramt.size(), paramInt);
    c = paramt;
  }
  
  public final E b(int paramInt)
  {
    return (E)c.get(paramInt);
  }
}

/* Location:
 * Qualified Name:     o7.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */