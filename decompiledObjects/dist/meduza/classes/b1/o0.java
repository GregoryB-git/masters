package b1;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public abstract class o0
{
  public final HashMap a = new HashMap();
  public final LinkedHashSet b = new LinkedHashSet();
  public volatile boolean c = false;
  
  public static void a(Object paramObject)
  {
    if ((paramObject instanceof Closeable)) {
      try
      {
        ((Closeable)paramObject).close();
      }
      catch (IOException paramObject)
      {
        throw new RuntimeException((Throwable)paramObject);
      }
    }
  }
  
  public void b() {}
}

/* Location:
 * Qualified Name:     b1.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */