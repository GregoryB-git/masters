package gc;

import ec.i;
import java.util.Random;

public final class b
  extends a
{
  public final a c = new a();
  
  public final Random a()
  {
    Object localObject = c.get();
    i.d(localObject, "get(...)");
    return (Random)localObject;
  }
  
  public static final class a
    extends ThreadLocal<Random>
  {
    public final Object initialValue()
    {
      return new Random();
    }
  }
}

/* Location:
 * Qualified Name:     gc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */