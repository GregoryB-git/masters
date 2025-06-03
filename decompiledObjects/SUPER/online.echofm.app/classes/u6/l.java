package u6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public abstract class l
{
  public static Object a(Object paramObject)
  {
    return paramObject;
  }
  
  public static final Object c(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
    {
      paramObject1 = a(paramObject2);
    }
    else if ((paramObject1 instanceof ArrayList))
    {
      Intrinsics.c(paramObject1, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
      ((ArrayList)paramObject1).add(paramObject2);
      paramObject1 = a(paramObject1);
    }
    else
    {
      ArrayList localArrayList = new ArrayList(4);
      localArrayList.add(paramObject1);
      localArrayList.add(paramObject2);
      paramObject1 = a(localArrayList);
    }
    return paramObject1;
  }
}

/* Location:
 * Qualified Name:     u6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */