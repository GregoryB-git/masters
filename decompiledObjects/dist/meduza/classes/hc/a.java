package hc;

import ec.i;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a
  extends gc.a
{
  public final Random a()
  {
    ThreadLocalRandom localThreadLocalRandom = ThreadLocalRandom.current();
    i.d(localThreadLocalRandom, "current(...)");
    return localThreadLocalRandom;
  }
}

/* Location:
 * Qualified Name:     hc.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */