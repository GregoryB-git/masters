package e9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e;
import n9.f;
import n9.j;
import u7.c;

public final class b
  extends a
{
  public a8.a b;
  
  public b(t9.a<a8.a> parama)
  {
    new d(this, 9);
    parama.a(new e(this, 9));
  }
  
  public final Task<String> s()
  {
    try
    {
      Object localObject1 = b;
      if (localObject1 == null)
      {
        localObject1 = new u7/c;
        ((c)localObject1).<init>("AppCheck is not available");
        localObject1 = Tasks.forException((Exception)localObject1);
        return (Task<String>)localObject1;
      }
      Task localTask = ((a8.a)localObject1).a();
      m.a locala = f.b;
      localObject1 = new e0/d;
      ((e0.d)localObject1).<init>(25);
      localObject1 = localTask.continueWithTask(locala, (Continuation)localObject1);
      return (Task<String>)localObject1;
    }
    finally {}
  }
  
  public final void t() {}
  
  public final void w()
  {
    try
    {
      a8.a locala = b;
      if (locala != null) {
        locala.c();
      }
      return;
    }
    finally {}
  }
  
  public final void z(j<String> paramj) {}
}

/* Location:
 * Qualified Name:     e9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */