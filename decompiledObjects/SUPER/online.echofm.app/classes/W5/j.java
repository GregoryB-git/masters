package W5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class j
  extends i
{
  public static List b(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    paramArrayOfObject = l.a(paramArrayOfObject);
    Intrinsics.checkNotNullExpressionValue(paramArrayOfObject, "asList(...)");
    return paramArrayOfObject;
  }
  
  public static final Object[] c(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt1, int paramInt2, int paramInt3)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject1, "<this>");
    Intrinsics.checkNotNullParameter(paramArrayOfObject2, "destination");
    System.arraycopy(paramArrayOfObject1, paramInt2, paramArrayOfObject2, paramInt1, paramInt3 - paramInt2);
    return paramArrayOfObject2;
  }
  
  public static final void e(Object[] paramArrayOfObject, Object paramObject, int paramInt1, int paramInt2)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Arrays.fill(paramArrayOfObject, paramInt1, paramInt2, paramObject);
  }
  
  public static void f(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    if (paramArrayOfObject.length > 1) {
      Arrays.sort(paramArrayOfObject);
    }
  }
  
  public static final void g(Object[] paramArrayOfObject, Comparator paramComparator)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    Intrinsics.checkNotNullParameter(paramComparator, "comparator");
    if (paramArrayOfObject.length > 1) {
      Arrays.sort(paramArrayOfObject, paramComparator);
    }
  }
}

/* Location:
 * Qualified Name:     W5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */