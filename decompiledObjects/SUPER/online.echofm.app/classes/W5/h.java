package W5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

public class h
{
  public static final Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "reference");
    paramArrayOfObject = Array.newInstance(paramArrayOfObject.getClass().getComponentType(), paramInt);
    Intrinsics.c(paramArrayOfObject, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
    return (Object[])paramArrayOfObject;
  }
}

/* Location:
 * Qualified Name:     W5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */