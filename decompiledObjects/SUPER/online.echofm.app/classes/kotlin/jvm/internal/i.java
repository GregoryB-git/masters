package kotlin.jvm.internal;

import m6.b;
import m6.e;

public abstract class i
  extends c
  implements h, e
{
  private final int arity;
  private final int flags;
  
  public i(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2)
  {
    super(paramObject, paramClass, paramString1, paramString2, bool);
    arity = paramInt1;
    flags = (paramInt2 >> 1);
  }
  
  public b computeReflected()
  {
    return v.a(this);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof i))
    {
      paramObject = (i)paramObject;
      if ((!getName().equals(((c)paramObject).getName())) || (!getSignature().equals(((c)paramObject).getSignature())) || (flags != flags) || (arity != arity) || (!Intrinsics.a(getBoundReceiver(), ((c)paramObject).getBoundReceiver())) || (!Intrinsics.a(getOwner(), ((c)paramObject).getOwner()))) {
        bool = false;
      }
      return bool;
    }
    if ((paramObject instanceof e)) {
      return paramObject.equals(compute());
    }
    return false;
  }
  
  public int getArity()
  {
    return arity;
  }
  
  public e getReflected()
  {
    return (e)super.getReflected();
  }
  
  public int hashCode()
  {
    int i;
    if (getOwner() == null) {
      i = 0;
    } else {
      i = getOwner().hashCode() * 31;
    }
    return (i + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  public boolean isExternal()
  {
    return getReflected().isExternal();
  }
  
  public boolean isInfix()
  {
    return getReflected().isInfix();
  }
  
  public boolean isInline()
  {
    return getReflected().isInline();
  }
  
  public boolean isOperator()
  {
    return getReflected().isOperator();
  }
  
  public boolean isSuspend()
  {
    return getReflected().isSuspend();
  }
  
  public String toString()
  {
    Object localObject = compute();
    if (localObject != this) {
      return localObject.toString();
    }
    if ("<init>".equals(getName()))
    {
      localObject = "constructor (Kotlin reflection is not available)";
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("function ");
      ((StringBuilder)localObject).append(getName());
      ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */