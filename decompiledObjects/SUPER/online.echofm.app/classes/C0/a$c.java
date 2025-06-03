package C0;

import B0.n;
import B0.n.b;
import B0.n.c;
import B0.n.e;
import java.io.IOException;
import java.util.ConcurrentModificationException;

public final class a$c
  implements n.b
{
  public final a.b o;
  
  public a$c(a.b paramb)
  {
    o = paramb;
  }
  
  public void o(n.e parame, long paramLong1, long paramLong2)
  {
    if (o != null) {
      if (!a.k()) {
        o.b(new IOException(new ConcurrentModificationException()));
      } else {
        o.a();
      }
    }
  }
  
  public n.c r(n.e parame, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    parame = o;
    if (parame != null) {
      parame.b(paramIOException);
    }
    return n.f;
  }
  
  public void t(n.e parame, long paramLong1, long paramLong2, boolean paramBoolean) {}
}

/* Location:
 * Qualified Name:     C0.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */