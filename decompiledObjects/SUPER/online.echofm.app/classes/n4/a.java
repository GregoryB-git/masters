package n4;

import B3.E;

public class a
{
  public final Class a;
  public final Object b;
  
  public a(Class paramClass, Object paramObject)
  {
    a = ((Class)E.b(paramClass));
    b = E.b(paramObject);
  }
  
  public Object a()
  {
    return b;
  }
  
  public Class b()
  {
    return a;
  }
  
  public String toString()
  {
    return String.format("Event{type: %s, payload: %s}", new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     n4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */