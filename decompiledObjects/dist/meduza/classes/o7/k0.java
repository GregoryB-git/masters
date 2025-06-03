package o7;

import java.util.Comparator;

public abstract class k0<T>
  implements Comparator<T>
{
  public <S extends T> k0<S> a()
  {
    return new p0(this);
  }
  
  public abstract int compare(T paramT1, T paramT2);
}

/* Location:
 * Qualified Name:     o7.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */