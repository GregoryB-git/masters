package W5;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class J
{
  public static Set a(Object paramObject)
  {
    paramObject = Collections.singleton(paramObject);
    Intrinsics.checkNotNullExpressionValue(paramObject, "singleton(...)");
    return (Set)paramObject;
  }
}

/* Location:
 * Qualified Name:     W5.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */