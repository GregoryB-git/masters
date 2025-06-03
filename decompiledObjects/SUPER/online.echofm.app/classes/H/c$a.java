package H;

import java.util.Objects;

public abstract class c$a
{
  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return Objects.equals(paramObject1, paramObject2);
  }
  
  public static int b(Object... paramVarArgs)
  {
    return Objects.hash(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     H.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */