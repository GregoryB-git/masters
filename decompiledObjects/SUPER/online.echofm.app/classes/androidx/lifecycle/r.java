package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class r
{
  public final Map a = new HashMap();
  public volatile boolean b = false;
  
  public static void b(Object paramObject)
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
  
  public final void a()
  {
    b = true;
    Map localMap = a;
    if (localMap != null) {
      try
      {
        Iterator localIterator = a.values().iterator();
        while (localIterator.hasNext()) {
          b(localIterator.next());
        }
        label61:
        d();
      }
      finally
      {
        break label61;
      }
    }
  }
  
  public Object c(String paramString)
  {
    Map localMap = a;
    if (localMap == null) {
      return null;
    }
    try
    {
      paramString = a.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public void d() {}
}

/* Location:
 * Qualified Name:     androidx.lifecycle.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */