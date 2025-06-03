package B6;

import D6.b;
import java.io.Closeable;

public abstract class h
  implements Closeable
{
  public static h a(d paramd, final long paramLong, b paramb)
  {
    if (paramb != null) {
      return new a(paramLong, paramb);
    }
    throw new NullPointerException("source == null");
  }
  
  public static h b(d paramd, byte[] paramArrayOfByte)
  {
    D6.a locala = new D6.a().B(paramArrayOfByte);
    return a(paramd, paramArrayOfByte.length, locala);
  }
  
  public abstract b c();
  
  public void close()
  {
    C6.a.c(c());
  }
  
  public class a
    extends h
  {
    public a(long paramLong, b paramb) {}
    
    public b c()
    {
      return p;
    }
  }
}

/* Location:
 * Qualified Name:     B6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */