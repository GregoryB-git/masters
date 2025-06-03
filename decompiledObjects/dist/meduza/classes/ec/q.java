package ec;

import f;
import jc.h;

public abstract class q
  extends b
  implements h
{
  public final boolean a;
  
  public q()
  {
    a = false;
  }
  
  public q(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt)
  {
    super(paramObject, paramClass, paramString1, paramString2, bool2);
    if ((paramInt & 0x2) == 2) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    a = bool2;
  }
  
  public final jc.b compute()
  {
    Object localObject;
    if (a) {
      localObject = this;
    } else {
      localObject = super.compute();
    }
    return (jc.b)localObject;
  }
  
  public final h e()
  {
    if (!a) {
      return (h)super.getReflected();
    }
    throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof q))
    {
      paramObject = (q)paramObject;
      if ((!getOwner().equals(((b)paramObject).getOwner())) || (!getName().equals(((b)paramObject).getName())) || (!getSignature().equals(((b)paramObject).getSignature())) || (!i.a(getBoundReceiver(), ((b)paramObject).getBoundReceiver()))) {
        bool = false;
      }
      return bool;
    }
    if ((paramObject instanceof h)) {
      return paramObject.equals(compute());
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = getOwner().hashCode();
    int j = getName().hashCode();
    return getSignature().hashCode() + (j + i * 31) * 31;
  }
  
  public final String toString()
  {
    Object localObject = compute();
    if (localObject != this) {
      return localObject.toString();
    }
    localObject = f.l("property ");
    ((StringBuilder)localObject).append(getName());
    ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     ec.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */