package kotlin.jvm.internal;

import m6.b;
import m6.h;

public abstract class r
  extends c
  implements h
{
  public final boolean o;
  
  public r(Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt)
  {
    super(paramObject, paramClass, paramString1, paramString2, bool2);
    boolean bool2 = bool1;
    if ((paramInt & 0x2) == 2) {
      bool2 = true;
    }
    o = bool2;
  }
  
  public h b()
  {
    if (!o) {
      return (h)super.getReflected();
    }
    throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
  }
  
  public b compute()
  {
    Object localObject;
    if (o) {
      localObject = this;
    } else {
      localObject = super.compute();
    }
    return (b)localObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof r))
    {
      paramObject = (r)paramObject;
      if ((!getOwner().equals(((c)paramObject).getOwner())) || (!getName().equals(((c)paramObject).getName())) || (!getSignature().equals(((c)paramObject).getSignature())) || (!Intrinsics.a(getBoundReceiver(), ((c)paramObject).getBoundReceiver()))) {
        bool = false;
      }
      return bool;
    }
    if ((paramObject instanceof h)) {
      return paramObject.equals(compute());
    }
    return false;
  }
  
  public int hashCode()
  {
    return (getOwner().hashCode() * 31 + getName().hashCode()) * 31 + getSignature().hashCode();
  }
  
  public String toString()
  {
    Object localObject = compute();
    if (localObject != this) {
      return localObject.toString();
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("property ");
    ((StringBuilder)localObject).append(getName());
    ((StringBuilder)localObject).append(" (Kotlin reflection is not available)");
    return ((StringBuilder)localObject).toString();
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */