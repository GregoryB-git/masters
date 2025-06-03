package gb;

import java.io.Closeable;

public final class f$f
  extends f.g
  implements Closeable
{
  public final Closeable d;
  
  public f$f(f paramf, f.b paramb, f.c paramc)
  {
    super(paramf, paramb);
    d = paramc;
  }
  
  public final void close()
  {
    d.close();
  }
}

/* Location:
 * Qualified Name:     gb.f.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */