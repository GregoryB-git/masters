package W5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l6.c;

public class o
  extends n
{
  public static ArrayList d(Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    if (paramVarArgs.length == 0) {
      paramVarArgs = new ArrayList();
    } else {
      paramVarArgs = new ArrayList(new e(paramVarArgs, true));
    }
    return paramVarArgs;
  }
  
  public static final Collection e(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "<this>");
    return new e(paramArrayOfObject, false);
  }
  
  public static List f()
  {
    return y.o;
  }
  
  public static c g(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "<this>");
    return new c(0, paramCollection.size() - 1);
  }
  
  public static int h(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    return paramList.size() - 1;
  }
  
  public static List i(Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramVarArgs, "elements");
    if (paramVarArgs.length > 0) {
      paramVarArgs = g.b(paramVarArgs);
    } else {
      paramVarArgs = m.f();
    }
    return paramVarArgs;
  }
  
  public static final List j(List paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "<this>");
    int i = paramList.size();
    if (i != 0)
    {
      if (i == 1) {
        paramList = m.b(paramList.get(0));
      }
    }
    else {
      paramList = m.f();
    }
    return paramList;
  }
  
  public static void k()
  {
    throw new ArithmeticException("Index overflow has happened.");
  }
}

/* Location:
 * Qualified Name:     W5.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */