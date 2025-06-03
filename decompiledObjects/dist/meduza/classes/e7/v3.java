package e7;

import java.util.Objects;

public final class v3
  extends v
{
  public v3(k3 paramk3, j2 paramj2)
  {
    super(paramj2);
  }
  
  public final void c()
  {
    k3 localk3 = e.o();
    Objects.requireNonNull(localk3);
    new Thread(new r3(localk3, 1)).start();
  }
}

/* Location:
 * Qualified Name:     e7.v3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */