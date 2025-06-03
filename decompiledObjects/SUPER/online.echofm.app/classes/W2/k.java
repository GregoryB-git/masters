package W2;

import java.util.Arrays;

public abstract class k
  extends f
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static int b(Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     W2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */