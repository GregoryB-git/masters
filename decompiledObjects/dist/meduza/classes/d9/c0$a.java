package d9;

import com.google.android.gms.tasks.TaskExecutors;
import e;
import java.util.concurrent.Executor;

public final class c0$a
{
  public Executor a = TaskExecutors.MAIN_THREAD;
  public e b;
  
  public c0$a(e parame)
  {
    b = parame;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (a.class == paramObject.getClass()))
    {
      paramObject = (a)paramObject;
      return b.equals(b);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return b.hashCode();
  }
}

/* Location:
 * Qualified Name:     d9.c0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */