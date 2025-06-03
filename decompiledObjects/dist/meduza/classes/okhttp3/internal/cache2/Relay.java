package okhttp3.internal.cache2;

import xc.f;
import xc.i;
import xc.i.a;
import xc.y;
import xc.z;

final class Relay
{
  static
  {
    i locali = i.d;
    i.a.a("OkHttp cache v1\n");
    i.a.a("OkHttp DIRTY :(\n");
  }
  
  public class RelaySource
    implements y
  {
    public final z c()
    {
      return null;
    }
    
    public final void close() {}
    
    public final long e0(f paramf, long paramLong)
    {
      throw new IllegalStateException("closed");
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache2.Relay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */