package ec;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import jc.d;
import jc.i;
import jc.j;

public abstract class b
  implements jc.b, Serializable
{
  public static final Object NO_RECEIVER = a.a;
  private final boolean isTopLevel;
  private final String name;
  private final Class owner;
  public final Object receiver;
  private transient jc.b reflected;
  private final String signature;
  
  public b()
  {
    this(NO_RECEIVER);
  }
  
  public b(Object paramObject)
  {
    this(paramObject, null, null, null, false);
  }
  
  public b(Object paramObject, Class paramClass, String paramString1, String paramString2, boolean paramBoolean)
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
  
  public jc.b compute()
  {
    jc.b localb1 = reflected;
    jc.b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = computeReflected();
      reflected = localb2;
    }
    return localb2;
  }
  
  public abstract jc.b computeReflected();
  
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
    if (localObject == null)
    {
      localObject = null;
    }
    else if (isTopLevel)
    {
      t.a.getClass();
      localObject = new k((Class)localObject);
    }
    else
    {
      localObject = t.a((Class)localObject);
    }
    return (d)localObject;
  }
  
  public List<Object> getParameters()
  {
    return getReflected().getParameters();
  }
  
  public jc.b getReflected()
  {
    jc.b localb = compute();
    if (localb != this) {
      return localb;
    }
    throw new cc.a();
  }
  
  public i getReturnType()
  {
    return getReflected().getReturnType();
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
  
  public boolean isSuspend()
  {
    return getReflected().isSuspend();
  }
  
  public static final class a
    implements Serializable
  {
    public static final a a = new a();
  }
}

/* Location:
 * Qualified Name:     ec.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */