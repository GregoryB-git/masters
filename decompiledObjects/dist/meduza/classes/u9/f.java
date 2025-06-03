package u9;

import com.google.android.gms.tasks.TaskCompletionSource;
import g;

public final class f
  implements j
{
  public final k a;
  public final TaskCompletionSource<h> b;
  
  public f(k paramk, TaskCompletionSource<h> paramTaskCompletionSource)
  {
    a = paramk;
    b = paramTaskCompletionSource;
  }
  
  public final boolean a(Exception paramException)
  {
    b.trySetException(paramException);
    return true;
  }
  
  public final boolean b(w9.a parama)
  {
    int i;
    if (parama.f() == 4) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (!a.b(parama)))
    {
      TaskCompletionSource localTaskCompletionSource = b;
      String str = d;
      if (str != null)
      {
        Long localLong1 = Long.valueOf(f);
        Long localLong2 = Long.valueOf(g);
        if (localLong1 == null) {
          parama = " tokenExpirationTimestamp";
        } else {
          parama = "";
        }
        Object localObject = parama;
        if (localLong2 == null) {
          localObject = g.d(parama, " tokenCreationTimestamp");
        }
        if (((String)localObject).isEmpty())
        {
          localTaskCompletionSource.setResult(new a(str, localLong1.longValue(), localLong2.longValue()));
          return true;
        }
        throw new IllegalStateException(g.d("Missing required properties:", (String)localObject));
      }
      throw new NullPointerException("Null token");
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     u9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */