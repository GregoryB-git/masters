package g9;

import b.d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.f.a;
import d9.x0;
import m9.h0;
import m9.j;
import n9.a;
import n9.a.c;
import n9.g;
import n9.i;

public final class n0<TResult>
{
  public a a;
  public h0 b;
  public i<m0, Task<TResult>> c;
  public int d;
  public g e;
  public TaskCompletionSource<TResult> f = new TaskCompletionSource();
  
  public n0(a parama, h0 paramh0, x0 paramx0, i<m0, Task<TResult>> parami)
  {
    a = parama;
    b = paramh0;
    c = parami;
    d = a;
    e = new g(parama, a.c.p, 1000L, 60000L);
  }
  
  public final void a(Task paramTask)
  {
    if (d > 0)
    {
      Object localObject = paramTask.getException();
      boolean bool = localObject instanceof f;
      int i = 0;
      int j = i;
      if (bool)
      {
        localObject = a;
        if ((localObject != f.a.q) && (localObject != f.a.o) && (localObject != f.a.p))
        {
          j = i;
          if (j.a((f.a)localObject)) {}
        }
        else
        {
          j = 1;
        }
      }
      if (j != 0)
      {
        d -= 1;
        e.a(new d(this, 15));
        return;
      }
    }
    f.setException(paramTask.getException());
  }
}

/* Location:
 * Qualified Name:     g9.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */