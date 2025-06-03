package u9;

import com.google.android.gms.tasks.TaskCompletionSource;
import w9.a;

public final class g
  implements j
{
  public final TaskCompletionSource<String> a;
  
  public g(TaskCompletionSource<String> paramTaskCompletionSource)
  {
    a = paramTaskCompletionSource;
  }
  
  public final boolean a(Exception paramException)
  {
    return false;
  }
  
  public final boolean b(a parama)
  {
    int i;
    if (parama.f() == 3) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      if (parama.f() == 4) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        if (parama.f() == 5) {
          i = 1;
        } else {
          i = 0;
        }
        if (i == 0) {
          return false;
        }
      }
    }
    a.trySetResult(b);
    return true;
  }
}

/* Location:
 * Qualified Name:     u9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */