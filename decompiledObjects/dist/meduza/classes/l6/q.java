package l6;

import com.google.android.gms.tasks.TaskCompletionSource;
import j6.d;
import k6.a.b;
import k6.a.f;
import m6.j;

public abstract class q<A extends a.b, ResultT>
{
  public final d[] a;
  public final boolean b;
  public final int c;
  
  public q(d[] paramArrayOfd, boolean paramBoolean, int paramInt)
  {
    a = paramArrayOfd;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramArrayOfd != null)
    {
      bool2 = bool1;
      if (paramBoolean) {
        bool2 = true;
      }
    }
    b = bool2;
    c = paramInt;
  }
  
  public abstract void a(a.f paramf, TaskCompletionSource paramTaskCompletionSource);
  
  public static final class a<A extends a.b, ResultT>
  {
    public n a;
    public boolean b;
    public d[] c;
    public int d;
    
    public final s0 a()
    {
      boolean bool;
      if (a != null) {
        bool = true;
      } else {
        bool = false;
      }
      j.a("execute parameter required", bool);
      return new s0(this, c, b, d);
    }
  }
}

/* Location:
 * Qualified Name:     l6.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */