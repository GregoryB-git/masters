package g9;

import com.google.firebase.firestore.f;
import d9.l;
import java.util.concurrent.Executor;

public final class d<T>
  implements l<T>
{
  public final Executor a;
  public final l<T> b;
  public volatile boolean c = false;
  
  public d(Executor paramExecutor, l<T> paraml)
  {
    a = paramExecutor;
    b = paraml;
  }
  
  public final void a(T paramT, f paramf)
  {
    a.execute(new t0.d(this, paramT, paramf, 5));
  }
}

/* Location:
 * Qualified Name:     g9.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */