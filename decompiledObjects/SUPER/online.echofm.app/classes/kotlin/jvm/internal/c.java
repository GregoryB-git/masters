package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import m6.a;
import m6.d;
import m6.i;
import m6.j;

public abstract class c
  implements m6.b, Serializable
{
  public static final Object NO_RECEIVER = ;
  private final boolean isTopLevel;
  private final String name;
  private final Class owner;
  protected final Object receiver;
  private transient m6.b reflected;
  private final String signature;
  
  public c(Object paramObject, Class paramClass, String paramString1, String paramString2, boolean paramBoolean)
  {
    receiver = paramObject;
    owner = paramClass;
    name = paramString1;
    signature = paramString2;
    isTopLevel = paramBoolean;
  }
  
  public Object call(Object... paramVarArgs)
  {
    return getReflected().call(paramVarArgs);
  }
  
  public Object callBy(Map paramMap)
  {
    return getReflected().callBy(paramMap);
  }
  
  public m6.b compute()
  {
    m6.b localb1 = reflected;
    m6.b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = computeReflected();
      reflected = localb2;
    }
    return localb2;
  }
  
  public abstract m6.b computeReflected();
  
  public List<Annotation> getAnnotations()
  {
    return getReflected().getAnnotations();
  }
  
  public Object getBoundReceiver()
  {
    return receiver;
  }
  
  public String getName()
  {
    return name;
  }
  
  public d getOwner()
  {
    Object localObject = owner;
    if (localObject == null) {
      localObject = null;
    } else if (isTopLevel) {
      localObject = v.c((Class)localObject);
    } else {
      localObject = v.b((Class)localObject);
    }
    return (d)localObject;
  }
  
  public List<Object> getParameters()
  {
    return getReflected().getParameters();
  }
  
  public m6.b getReflected()
  {
    m6.b localb = compute();
    if (localb != this) {
      return localb;
    }
    throw new f6.b();
  }
  
  public i getReturnType()
  {
    getReflected().getReturnType();
    return null;
  }
  
  public String getSignature()
  {
    return signature;
  }
  
  public List<Object> getTypeParameters()
  {
    return getReflected().getTypeParameters();
  }
  
  public j getVisibility()
  {
    return getReflected().getVisibility();
  }
  
  public boolean isAbstract()
  {
    return getReflected().isAbstract();
  }
  
  public boolean isFinal()
  {
    return getReflected().isFinal();
  }
  
  public boolean isOpen()
  {
    return getReflected().isOpen();
  }
  
  public static class a
    implements Serializable
  {
    public static final a o = new a();
    
    private Object readResolve()
    {
      return o;
    }
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */