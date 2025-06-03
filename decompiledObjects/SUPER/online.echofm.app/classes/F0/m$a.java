package F0;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class m$a
{
  public final a a;
  public final AtomicBoolean b;
  public Constructor c;
  
  public m$a(a parama)
  {
    a = parama;
    b = new AtomicBoolean(false);
  }
  
  public r a(Object... paramVarArgs)
  {
    Constructor localConstructor = b();
    if (localConstructor == null) {
      return null;
    }
    try
    {
      paramVarArgs = (r)localConstructor.newInstance(paramVarArgs);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      throw new IllegalStateException("Unexpected error creating extractor", paramVarArgs);
    }
  }
  
  public final Constructor b()
  {
    Object localObject2;
    Constructor localConstructor2;
    synchronized (b)
    {
      if (b.get())
      {
        Constructor localConstructor1 = c;
        return localConstructor1;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract Constructor a();
  }
}

/* Location:
 * Qualified Name:     F0.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */