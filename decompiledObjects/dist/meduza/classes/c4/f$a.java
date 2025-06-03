package c4;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f$a
{
  public final a a;
  public final AtomicBoolean b;
  
  public f$a(a parama)
  {
    a = parama;
    b = new AtomicBoolean(false);
  }
  
  public final h a(Object... paramVarArgs)
  {
    synchronized (b)
    {
      boolean bool = b.get();
      Object localObject2;
      if (!bool) {
        try
        {
          localObject1 = a.b();
        }
        catch (Exception paramVarArgs)
        {
          Object localObject1 = new java/lang/RuntimeException;
          ((RuntimeException)localObject1).<init>("Error instantiating extension", paramVarArgs);
          throw ((Throwable)localObject1);
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          b.set(true);
        }
      } else {
        localObject2 = null;
      }
      if (localObject2 == null) {
        return null;
      }
      try
      {
        paramVarArgs = (h)((Constructor)localObject2).newInstance(paramVarArgs);
        return paramVarArgs;
      }
      catch (Exception paramVarArgs)
      {
        throw new IllegalStateException("Unexpected error creating extractor", paramVarArgs);
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract Constructor<? extends h> b();
  }
}

/* Location:
 * Qualified Name:     c4.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */