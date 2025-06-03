package A0;

import d0.J;
import g0.o;

public final class y$a
{
  public final J a;
  public final int[] b;
  public final int c;
  
  public y$a(J paramJ, int... paramVarArgs)
  {
    this(paramJ, paramVarArgs, 0);
  }
  
  public y$a(J paramJ, int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt.length == 0) {
      o.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
    }
    a = paramJ;
    b = paramArrayOfInt;
    c = paramInt;
  }
}

/* Location:
 * Qualified Name:     A0.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */