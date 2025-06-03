package W5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class K
  extends J
{
  public static Set b()
  {
    return A.o;
  }
  
  public static HashSet c(Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (HashSet)k.s(paramVarArgs, new HashSet(C.a(paramVarArgs.length)));
  }
  
  public static Set d(Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return (Set)k.s(paramVarArgs, new LinkedHashSet(C.a(paramVarArgs.length)));
  }
  
  public static final Set e(Set paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "<this>");
    int i = paramSet.size();
    if (i != 0)
    {
      if (i == 1) {
        paramSet = I.a(paramSet.iterator().next());
      }
    }
    else {
      paramSet = I.b();
    }
    return paramSet;
  }
  
  public static Set f(Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    return k.w(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     W5.K
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */