package o9;

import aa.m0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ec.i;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import r3.r;
import y7.c;

public final class b
  implements a
{
  public final t9.b<c8.b> a;
  public final t9.b<s9.a> b;
  public final Executor c;
  public final String d;
  public final AtomicReference<a8.a> e;
  
  public b(t9.b<c8.b> paramb, t9.b<s9.a> paramb1, t9.a<a8.a> parama, @c Executor paramExecutor)
  {
    a = paramb;
    b = paramb1;
    c = paramExecutor;
    d = "FirebaseContextProvider";
    e = new AtomicReference();
    parama.a(new m0(this, 12));
  }
  
  public final Task<n> a(boolean paramBoolean)
  {
    Object localObject1 = (c8.b)a.get();
    String str = "forResult(null)";
    if (localObject1 == null)
    {
      localObject1 = Tasks.forResult(null);
      localObject2 = "forResult(null)";
    }
    else
    {
      localObject1 = ((c8.b)localObject1).d(false).continueWith(c, new e0.d(28));
      localObject2 = "auth.getAccessToken(fals…  }\n      authToken\n    }";
    }
    i.d(localObject1, (String)localObject2);
    Object localObject2 = (a8.a)e.get();
    if (localObject2 == null)
    {
      localObject2 = Tasks.forResult(null);
    }
    else
    {
      if (paramBoolean) {
        localObject2 = ((a8.a)localObject2).b();
      } else {
        localObject2 = ((a8.a)localObject2).a();
      }
      i.d(localObject2, "if (getLimitedUseAppChec… appCheck.getToken(false)");
      localObject2 = ((Task)localObject2).onSuccessTask(c, new d(this, 12));
      str = "tokenTask.onSuccessTask(…esult(result.token)\n    }";
    }
    i.d(localObject2, str);
    return Tasks.whenAll(new Task[] { localObject1, localObject2 }).onSuccessTask(c, new r(localObject1, this, localObject2, 2));
  }
}

/* Location:
 * Qualified Name:     o9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */