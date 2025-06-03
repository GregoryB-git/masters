package E2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class f
{
  public static List a()
  {
    return Collections.emptyList();
  }
  
  public static List b(Object paramObject)
  {
    return Collections.singletonList(paramObject);
  }
  
  public static List c(Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      if (i != 1) {
        return Collections.unmodifiableList(Arrays.asList(paramVarArgs));
      }
      return b(paramVarArgs[0]);
    }
    return a();
  }
}

/* Location:
 * Qualified Name:     E2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */