package c9;

import u7.b;

public final class a<T>
{
  public final Class<T> a = b.class;
  public final T b;
  
  public a(b paramb)
  {
    b = paramb;
  }
  
  public final String toString()
  {
    return String.format("Event{type: %s, payload: %s}", new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     c9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */