package ec;

import jc.e;

public class g
  extends b
  implements f, e
{
  private final int arity;
  private final int flags;
  
  public g(int paramInt)
  {
    this(paramInt, b.NO_RECEIVER, null, null, null, 0);
  }
  
  public g(int paramInt, Object paramObject)
  {
    this(paramInt, paramObject, null, null, null, 0);
  }
  
  public g(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2)
  {
    super(paramObject, paramClass, paramString1, paramString2, bool);
    arity = paramInt1;
    flags = (paramInt2 >> 1);
  }
  
  public jc.b computeReflected()
  {
    t.a.getClass();
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g))
    {
      paramObject = (g)paramObject;
      if ((!getName().equals(((b)paramObject).getName())) || (!getSignature().equals(((b)paramObject).getSignature())) || (flags != flags) || (arity != arity) || (!i.a(getBoundReceiver(), ((b)paramObject).getBoundReceiver())) || (!i.a(getOwner(), ((b)paramObject).getOwner()))) {
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
    int j = getName().hashCode();
    return getSignature().hashCode() + (j + i) * 31;
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
      localObject = f.l("function ");
      ((StringBuilder)localObject).append(getName());
      ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
}

/* Location:
 * Qualified Name:     ec.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */