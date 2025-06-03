package c3;

import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import k3.d;
import k3.d.a;
import k3.d.a.a;
import p3.A;
import p3.y;

public abstract class x
{
  public static final Logger a = Logger.getLogger(x.class.getName());
  public static final AtomicReference b = new AtomicReference(new j());
  public static final ConcurrentMap c = new ConcurrentHashMap();
  public static final ConcurrentMap d = new ConcurrentHashMap();
  public static final ConcurrentMap e = new ConcurrentHashMap();
  public static final ConcurrentMap f = new ConcurrentHashMap();
  
  public static b a(d paramd)
  {
    return new a();
  }
  
  public static void b(String paramString, Map paramMap, boolean paramBoolean)
  {
    Object localObject;
    if (paramBoolean) {
      try
      {
        localObject = d;
        if ((((Map)localObject).containsKey(paramString)) && (!((Boolean)((Map)localObject).get(paramString)).booleanValue()))
        {
          paramMap = new java/security/GeneralSecurityException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("New keys are already disallowed for key type ");
          ((StringBuilder)localObject).append(paramString);
          paramMap.<init>(((StringBuilder)localObject).toString());
          throw paramMap;
        }
      }
      finally
      {
        break label303;
      }
    }
    if (paramBoolean)
    {
      if (((j)b.get()).j(paramString))
      {
        localObject = paramMap.entrySet().iterator();
        do
        {
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
          paramMap = (Map.Entry)((Iterator)localObject).next();
        } while (f.containsKey(paramMap.getKey()));
        GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Attempted to register a new key template ");
        ((StringBuilder)localObject).append((String)paramMap.getKey());
        ((StringBuilder)localObject).append(" from an existing key manager of type ");
        ((StringBuilder)localObject).append(paramString);
        localGeneralSecurityException.<init>(((StringBuilder)localObject).toString());
        throw localGeneralSecurityException;
      }
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        paramString = (Map.Entry)paramMap.next();
        if (f.containsKey(paramString.getKey()))
        {
          localObject = new java/security/GeneralSecurityException;
          paramMap = new java/lang/StringBuilder;
          paramMap.<init>();
          paramMap.append("Attempted overwrite of a registered key template ");
          paramMap.append((String)paramString.getKey());
          ((GeneralSecurityException)localObject).<init>(paramMap.toString());
          throw ((Throwable)localObject);
          label303:
          throw paramString;
        }
      }
    }
  }
  
  public static Object c(g paramg, Class paramClass)
  {
    return k3.h.c().b(paramg, paramClass);
  }
  
  public static Class d(Class paramClass)
  {
    try
    {
      paramClass = k3.h.c().a(paramClass);
      return paramClass;
    }
    catch (GeneralSecurityException paramClass) {}
    return null;
  }
  
  public static Object e(String paramString, com.google.crypto.tink.shaded.protobuf.h paramh, Class paramClass)
  {
    return ((j)b.get()).c(paramString, paramClass).a(paramh);
  }
  
  public static Object f(String paramString, byte[] paramArrayOfByte, Class paramClass)
  {
    return e(paramString, com.google.crypto.tink.shaded.protobuf.h.i(paramArrayOfByte), paramClass);
  }
  
  public static Object g(y paramy, Class paramClass)
  {
    return e(paramy.a0(), paramy.b0(), paramClass);
  }
  
  public static h h(String paramString)
  {
    return ((j)b.get()).f(paramString);
  }
  
  public static Map i()
  {
    try
    {
      Map localMap = Collections.unmodifiableMap(f);
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static O j(A paramA)
  {
    label90:
    try
    {
      localObject = h(paramA.a0());
      if (((Boolean)d.get(paramA.a0())).booleanValue())
      {
        paramA = ((h)localObject).b(paramA.b0());
        return paramA;
      }
    }
    finally
    {
      break label90;
      Object localObject = new java/security/GeneralSecurityException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("newKey-operation not permitted for key type ");
      localStringBuilder.append(paramA.a0());
      ((GeneralSecurityException)localObject).<init>(localStringBuilder.toString());
      throw ((Throwable)localObject);
    }
  }
  
  public static y k(A paramA)
  {
    label90:
    try
    {
      localObject = h(paramA.a0());
      if (((Boolean)d.get(paramA.a0())).booleanValue())
      {
        paramA = ((h)localObject).c(paramA.b0());
        return paramA;
      }
    }
    finally
    {
      break label90;
      Object localObject = new java/security/GeneralSecurityException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("newKey-operation not permitted for key type ");
      localStringBuilder.append(paramA.a0());
      ((GeneralSecurityException)localObject).<init>(localStringBuilder.toString());
      throw ((Throwable)localObject);
    }
  }
  
  public static void l(d paramd, boolean paramBoolean)
  {
    if (paramd != null)
    {
      j localj;
      AtomicReference localAtomicReference;
      String str;
      try
      {
        localj = new c3/j;
        localAtomicReference = b;
        localj.<init>((j)localAtomicReference.get());
        localj.g(paramd);
        str = paramd.d();
        if (paramBoolean) {
          localMap = paramd.f().c();
        }
      }
      finally
      {
        break label152;
      }
      Map localMap = Collections.emptyMap();
      b(str, localMap, paramBoolean);
      if (!((j)localAtomicReference.get()).j(str))
      {
        c.put(str, a(paramd));
        if (paramBoolean) {
          m(str, paramd.f().c());
        }
      }
      d.put(str, Boolean.valueOf(paramBoolean));
      localAtomicReference.set(localj);
      return;
    }
    paramd = new java/lang/IllegalArgumentException;
    paramd.<init>("key manager must be non-null.");
    throw paramd;
    label152:
    throw paramd;
  }
  
  public static void m(String paramString, Map paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      f.put((String)paramMap.getKey(), l.a(paramString, ((O)getValuea).f(), getValueb));
    }
  }
  
  public static void n(w paramw)
  {
    try
    {
      k3.h.c().e(paramw);
      return;
    }
    finally
    {
      paramw = finally;
      throw paramw;
    }
  }
  
  public static Object o(v paramv, Class paramClass)
  {
    return k3.h.c().f(paramv, paramClass);
  }
  
  public class a
    implements x.b
  {
    public a() {}
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     c3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */