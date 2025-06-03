package W5;

import V5.m;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class E
  extends D
{
  public static int a(int paramInt)
  {
    if (paramInt >= 0) {
      if (paramInt < 3) {
        paramInt++;
      } else if (paramInt < 1073741824) {
        paramInt = (int)(paramInt / 0.75F + 1.0F);
      } else {
        paramInt = Integer.MAX_VALUE;
      }
    }
    return paramInt;
  }
  
  public static Map b(m paramm)
  {
    Intrinsics.checkNotNullParameter(paramm, "pair");
    paramm = Collections.singletonMap(paramm.c(), paramm.d());
    Intrinsics.checkNotNullExpressionValue(paramm, "singletonMap(...)");
    return paramm;
  }
  
  public static final Map c(Map paramMap)
  {
    Intrinsics.checkNotNullParameter(paramMap, "<this>");
    paramMap = (Map.Entry)paramMap.entrySet().iterator().next();
    paramMap = Collections.singletonMap(paramMap.getKey(), paramMap.getValue());
    Intrinsics.checkNotNullExpressionValue(paramMap, "with(...)");
    return paramMap;
  }
}

/* Location:
 * Qualified Name:     W5.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */