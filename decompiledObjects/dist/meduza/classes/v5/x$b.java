package v5;

import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource.a;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import t5.d0;
import t5.d0.a;
import t5.d0.b;
import t5.d0.d;

public final class x$b
  implements d0.a<d0.d>
{
  public final x.a a;
  
  public x$b(DashMediaSource.a parama)
  {
    a = parama;
  }
  
  public final void k(d0.d paramd, long paramLong1, long paramLong2, boolean paramBoolean) {}
  
  public final void p(d0.d arg1, long paramLong1, long paramLong2)
  {
    if (a != null) {
      synchronized (x.b)
      {
        boolean bool = x.c;
        Object localObject1;
        if (!bool)
        {
          localObject1 = a;
          ??? = new IOException(new ConcurrentModificationException());
          localObject1 = a;
          localObject1.getClass();
          m.d("DashMediaSource", "Failed to resolve time offset.", ???);
          ((DashMediaSource)localObject1).A(true);
        }
        else
        {
          localObject1 = a).a;
          try
          {
            if (x.c) {
              paramLong1 = x.d;
            } else {
              paramLong1 = -9223372036854775807L;
            }
            T = paramLong1;
            ((DashMediaSource)localObject1).A(true);
          }
          finally {}
        }
      }
    }
  }
  
  public final d0.b u(d0.d paramd, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    paramd = a;
    if (paramd != null)
    {
      paramd = a;
      paramd.getClass();
      m.d("DashMediaSource", "Failed to resolve time offset.", paramIOException);
      paramd.A(true);
    }
    return d0.e;
  }
}

/* Location:
 * Qualified Name:     v5.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */