package k3;

import c3.l.b;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import h3.b.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p3.y.c;

public abstract class d
{
  public final Class a;
  public final Map b;
  public final Class c;
  
  public d(Class paramClass, m... paramVarArgs)
  {
    a = paramClass;
    HashMap localHashMap = new HashMap();
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      paramClass = paramVarArgs[j];
      if (!localHashMap.containsKey(paramClass.b()))
      {
        localHashMap.put(paramClass.b(), paramClass);
        j++;
      }
      else
      {
        paramVarArgs = new StringBuilder();
        paramVarArgs.append("KeyTypeManager constructed with duplicate factories for primitive ");
        paramVarArgs.append(paramClass.b().getCanonicalName());
        throw new IllegalArgumentException(paramVarArgs.toString());
      }
    }
    if (paramVarArgs.length > 0) {}
    for (paramClass = paramVarArgs[0].b();; paramClass = Void.class)
    {
      c = paramClass;
      break;
    }
    b = Collections.unmodifiableMap(localHashMap);
  }
  
  public b.b a()
  {
    return b.b.o;
  }
  
  public final Class b()
  {
    return c;
  }
  
  public final Class c()
  {
    return a;
  }
  
  public abstract String d();
  
  public final Object e(O paramO, Class paramClass)
  {
    m localm = (m)b.get(paramClass);
    if (localm != null) {
      return localm.a(paramO);
    }
    paramO = new StringBuilder();
    paramO.append("Requested primitive class ");
    paramO.append(paramClass.getCanonicalName());
    paramO.append(" not supported.");
    throw new IllegalArgumentException(paramO.toString());
  }
  
  public abstract a f();
  
  public abstract y.c g();
  
  public abstract O h(h paramh);
  
  public final Set i()
  {
    return b.keySet();
  }
  
  public abstract void j(O paramO);
  
  public static abstract class a
  {
    public final Class a;
    
    public a(Class paramClass)
    {
      a = paramClass;
    }
    
    public abstract O a(O paramO);
    
    public final Class b()
    {
      return a;
    }
    
    public Map c()
    {
      return Collections.emptyMap();
    }
    
    public abstract O d(h paramh);
    
    public abstract void e(O paramO);
    
    public static final class a
    {
      public Object a;
      public l.b b;
      
      public a(Object paramObject, l.b paramb)
      {
        a = paramObject;
        b = paramb;
      }
    }
  }
}

/* Location:
 * Qualified Name:     k3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */