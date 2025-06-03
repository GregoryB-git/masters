package c3;

import h3.b.b;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import k3.d;

public final class j
{
  public static final Logger b = Logger.getLogger(j.class.getName());
  public final ConcurrentMap a;
  
  public j()
  {
    a = new ConcurrentHashMap();
  }
  
  public j(j paramj)
  {
    a = new ConcurrentHashMap(a);
  }
  
  public static Object a(Object paramObject)
  {
    paramObject.getClass();
    return paramObject;
  }
  
  public static b b(d paramd)
  {
    return new a();
  }
  
  public static String i(Set paramSet)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    paramSet = paramSet.iterator();
    for (int i = 1; paramSet.hasNext(); i = 0)
    {
      Class localClass = (Class)paramSet.next();
      if (i == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(localClass.getCanonicalName());
    }
    return localStringBuilder.toString();
  }
  
  public h c(String paramString, Class paramClass)
  {
    return e(paramString, (Class)a(paramClass));
  }
  
  public final b d(String paramString)
  {
    label72:
    try
    {
      if (a.containsKey(paramString))
      {
        paramString = (b)a.get(paramString);
        return paramString;
      }
    }
    finally
    {
      break label72;
      GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("No key manager found for key type ");
      localStringBuilder.append(paramString);
      localGeneralSecurityException.<init>(localStringBuilder.toString());
      throw localGeneralSecurityException;
    }
  }
  
  public final h e(String paramString, Class paramClass)
  {
    paramString = d(paramString);
    if (paramClass == null) {
      return paramString.b();
    }
    if (paramString.d().contains(paramClass)) {
      return paramString.a(paramClass);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Primitive type ");
    localStringBuilder.append(paramClass.getName());
    localStringBuilder.append(" not supported by key manager of type ");
    localStringBuilder.append(paramString.c());
    localStringBuilder.append(", supported primitives: ");
    localStringBuilder.append(i(paramString.d()));
    throw new GeneralSecurityException(localStringBuilder.toString());
  }
  
  public h f(String paramString)
  {
    return d(paramString).b();
  }
  
  public void g(d paramd)
  {
    label73:
    try
    {
      if (paramd.a().c())
      {
        h(b(paramd), false);
        return;
      }
    }
    finally
    {
      break label73;
      GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("failed to register key manager ");
      localStringBuilder.append(paramd.getClass());
      localStringBuilder.append(" as it is not FIPS compatible.");
      localGeneralSecurityException.<init>(localStringBuilder.toString());
      throw localGeneralSecurityException;
    }
  }
  
  public final void h(b paramb, boolean paramBoolean)
  {
    label185:
    try
    {
      str = paramb.b().d();
      b localb = (b)a.get(str);
      if ((localb != null) && (!localb.c().equals(paramb.c())))
      {
        Object localObject = b;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("Attempted overwrite of a registered key manager for key type ");
        localStringBuilder.append(str);
        ((Logger)localObject).warning(localStringBuilder.toString());
        localObject = new java/security/GeneralSecurityException;
        ((GeneralSecurityException)localObject).<init>(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[] { str, localb.c().getName(), paramb.c().getName() }));
        throw ((Throwable)localObject);
      }
    }
    finally
    {
      String str;
      break label185;
      if (!paramBoolean) {
        a.putIfAbsent(str, paramb);
      } else {
        a.put(str, paramb);
      }
      return;
    }
  }
  
  public boolean j(String paramString)
  {
    return a.containsKey(paramString);
  }
  
  public class a
    implements j.b
  {
    public a() {}
    
    public h a(Class paramClass)
    {
      try
      {
        paramClass = new i(j.this, paramClass);
        return paramClass;
      }
      catch (IllegalArgumentException paramClass)
      {
        throw new GeneralSecurityException("Primitive type not supported", paramClass);
      }
    }
    
    public h b()
    {
      d locald = j.this;
      return new i(locald, locald.b());
    }
    
    public Class c()
    {
      return getClass();
    }
    
    public Set d()
    {
      return i();
    }
  }
  
  public static abstract interface b
  {
    public abstract h a(Class paramClass);
    
    public abstract h b();
    
    public abstract Class c();
    
    public abstract Set d();
  }
}

/* Location:
 * Qualified Name:     c3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */