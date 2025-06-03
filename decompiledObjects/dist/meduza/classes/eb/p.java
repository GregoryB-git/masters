package eb;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p
{
  public static final Logger a = Logger.getLogger(p.class.getName());
  public static final p b = new p();
  
  public static p b()
  {
    p localp1 = a.a.a();
    p localp2 = localp1;
    if (localp1 == null) {
      localp2 = b;
    }
    return localp2;
  }
  
  public final p a()
  {
    p localp1 = a.a.c(this);
    p localp2 = localp1;
    if (localp1 == null) {
      localp2 = b;
    }
    return localp2;
  }
  
  public final void c(p paramp)
  {
    if (paramp != null)
    {
      a.a.b(this, paramp);
      return;
    }
    throw new NullPointerException("toAttach");
  }
  
  public static final class a
  {
    public static final p.b a;
    
    static
    {
      AtomicReference localAtomicReference = new AtomicReference();
      try
      {
        p.b localb = (p.b)Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(p.b.class).getConstructor(new Class[0]).newInstance(new Object[0]);
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Storage override failed to initialize", localException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        localAtomicReference.set(localClassNotFoundException);
        localObject = new j1();
      }
      a = (p.b)localObject;
      Object localObject = (Throwable)localAtomicReference.get();
      if (localObject != null) {
        p.a.log(Level.FINE, "Storage override doesn't exist. Using default", (Throwable)localObject);
      }
    }
  }
  
  public static abstract class b
  {
    public abstract p a();
    
    public abstract void b(p paramp1, p paramp2);
    
    public abstract p c(p paramp);
  }
}

/* Location:
 * Qualified Name:     eb.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */