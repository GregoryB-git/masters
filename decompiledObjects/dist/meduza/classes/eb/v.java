package eb;

import n7.g;
import n7.g.a;

public abstract class v<T extends o0<T>>
  extends o0<T>
{
  public n0 a()
  {
    return d().a();
  }
  
  public abstract o0<?> d();
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(d(), "delegate");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */