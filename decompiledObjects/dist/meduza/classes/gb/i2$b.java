package gb;

import java.io.InputStream;

public final class i2$b
  implements n3.a
{
  public InputStream a;
  
  public i2$b(InputStream paramInputStream)
  {
    a = paramInputStream;
  }
  
  public final InputStream next()
  {
    InputStream localInputStream = a;
    a = null;
    return localInputStream;
  }
}

/* Location:
 * Qualified Name:     gb.i2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */