package eb;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class p$a
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

/* Location:
 * Qualified Name:     eb.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */