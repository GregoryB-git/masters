package u6;

import kotlin.jvm.internal.Intrinsics;

public abstract class p
{
  public static final Object a = new F("CONDITION_FALSE");
  
  public static final Object a()
  {
    return a;
  }
  
  public static final q b(Object paramObject)
  {
    Object localObject;
    if ((paramObject instanceof z)) {
      localObject = (z)paramObject;
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      q localq = a;
      localObject = localq;
      if (localq != null) {}
    }
    else
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
      localObject = (q)paramObject;
    }
    return (q)localObject;
  }
}

/* Location:
 * Qualified Name:     u6.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */