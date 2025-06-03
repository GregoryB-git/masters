package Z5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class i
{
  public static final i a = new i();
  public static final a b = new a(null, null, null);
  public static a c;
  
  public final a a(a parama)
  {
    try
    {
      Method localMethod1 = Class.class.getDeclaredMethod("getModule", new Class[0]);
      Method localMethod2 = parama.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);
      parama = parama.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]);
      a locala = new Z5/i$a;
      locala.<init>(localMethod1, localMethod2, parama);
      c = locala;
      return locala;
    }
    catch (Exception parama)
    {
      parama = b;
      c = parama;
    }
    return parama;
  }
  
  public final String b(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "continuation");
    a locala = c;
    Object localObject1 = locala;
    if (locala == null) {
      localObject1 = a(parama);
    }
    Object localObject2 = b;
    locala = null;
    if (localObject1 == localObject2) {
      return null;
    }
    localObject2 = a;
    if (localObject2 != null) {
      parama = ((Method)localObject2).invoke(parama.getClass(), new Object[0]);
    } else {
      parama = null;
    }
    if (parama == null) {
      return null;
    }
    localObject2 = b;
    if (localObject2 != null) {
      parama = ((Method)localObject2).invoke(parama, new Object[0]);
    } else {
      parama = null;
    }
    if (parama == null) {
      return null;
    }
    localObject1 = c;
    if (localObject1 != null) {
      parama = ((Method)localObject1).invoke(parama, new Object[0]);
    } else {
      parama = null;
    }
    localObject1 = locala;
    if ((parama instanceof String)) {
      localObject1 = (String)parama;
    }
    return (String)localObject1;
  }
  
  public static final class a
  {
    public final Method a;
    public final Method b;
    public final Method c;
    
    public a(Method paramMethod1, Method paramMethod2, Method paramMethod3)
    {
      a = paramMethod1;
      b = paramMethod2;
      c = paramMethod3;
    }
  }
}

/* Location:
 * Qualified Name:     Z5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */