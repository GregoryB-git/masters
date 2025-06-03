package r3;

import m3.b;

public final class h
  implements b<e>
{
  public final Object get()
  {
    a locala = e.a;
    if (locala != null) {
      return locala;
    }
    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
  }
  
  public static final class a
  {
    public static final h a = new h();
  }
}

/* Location:
 * Qualified Name:     r3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */