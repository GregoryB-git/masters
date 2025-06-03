package j6;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

public final class b
  extends a
{
  public final a q = new a();
  
  public Random d()
  {
    Object localObject = q.get();
    Intrinsics.checkNotNullExpressionValue(localObject, "get(...)");
    return (Random)localObject;
  }
  
  public static final class a
    extends ThreadLocal
  {
    public Random a()
    {
      return new Random();
    }
  }
}

/* Location:
 * Qualified Name:     j6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */