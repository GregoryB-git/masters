package W5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class n
{
  public static final Object[] a(Object[] paramArrayOfObject, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if ((!paramBoolean) || (!Intrinsics.a(paramArrayOfObject.getClass(), Object[].class)))
    {
      paramArrayOfObject = Arrays.copyOf(paramArrayOfObject, paramArrayOfObject.length, Object[].class);
      Intrinsics.checkNotNullExpressionValue(paramArrayOfObject, "copyOf(...)");
    }
    return paramArrayOfObject;
  }
  
  public static List b(Object paramObject)
  {
    paramObject = Collections.singletonList(paramObject);
    Intrinsics.checkNotNullExpressionValue(paramObject, "singletonList(...)");
    return (List)paramObject;
  }
  
  public static final Object[] c(int paramInt, Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    if (paramInt < paramArrayOfObject.length) {
      paramArrayOfObject[paramInt] = null;
    }
    return paramArrayOfObject;
  }
}

/* Location:
 * Qualified Name:     W5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */