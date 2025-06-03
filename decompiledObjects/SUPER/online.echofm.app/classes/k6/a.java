package k6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

public final class a
  extends j6.a
{
  public Random d()
  {
    ThreadLocalRandom localThreadLocalRandom = ThreadLocalRandom.current();
    Intrinsics.checkNotNullExpressionValue(localThreadLocalRandom, "current(...)");
    return localThreadLocalRandom;
  }
}

/* Location:
 * Qualified Name:     k6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */