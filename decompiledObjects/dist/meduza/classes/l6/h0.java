package l6;

import android.os.Looper;
import com.google.android.gms.common.api.internal.a;
import h6.h;
import k6.a.b;
import k6.d;
import k6.j;

public final class h0
  extends x
{
  public final d b;
  
  public h0(d paramd)
  {
    b = paramd;
  }
  
  public final a a(h paramh)
  {
    return b.doRead(paramh);
  }
  
  public final <A extends a.b, T extends a<? extends j, A>> T b(T paramT)
  {
    return b.doWrite(paramT);
  }
  
  public final Looper c()
  {
    return b.getLooper();
  }
  
  public final void d() {}
  
  public final void e() {}
}

/* Location:
 * Qualified Name:     l6.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */