package n3;

import java.util.Collections;
import java.util.HashMap;

public final class a$b
{
  public HashMap a = new HashMap();
  
  public a a()
  {
    if (a != null)
    {
      a locala = new a(Collections.unmodifiableMap(a), null);
      a = null;
      return locala;
    }
    throw new IllegalStateException("cannot call build() twice");
  }
}

/* Location:
 * Qualified Name:     n3.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */