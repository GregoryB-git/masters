package u6;

import kotlin.jvm.internal.Intrinsics;

public abstract class D
{
  public static Object a(Object paramObject)
  {
    return paramObject;
  }
  
  public static final C b(Object paramObject)
  {
    if (paramObject != d.a())
    {
      Intrinsics.c(paramObject, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
      return (C)paramObject;
    }
    throw new IllegalStateException("Does not contain segment".toString());
  }
  
  public static final boolean c(Object paramObject)
  {
    boolean bool;
    if (paramObject == d.a()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     u6.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */