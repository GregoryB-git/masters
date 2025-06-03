package k8;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import dc.a;
import java.util.concurrent.ExecutorService;

public final class i
{
  public static final a d = new a();
  public final b a;
  public final b b;
  public final b c;
  
  public i(ExecutorService paramExecutorService1, ExecutorService paramExecutorService2)
  {
    a = new b(paramExecutorService1);
    b = new b(paramExecutorService1);
    Tasks.forResult(null);
    c = new b(paramExecutorService2);
  }
  
  public static final void a()
  {
    a locala = d;
    locala.getClass();
    a.a(new c(locala), d.a);
  }
  
  public static final class a
  {
    public static void a(a parama1, a parama2)
    {
      if (!((Boolean)parama1.invoke()).booleanValue())
      {
        parama1 = (String)parama2.invoke();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
          Log.d("FirebaseCrashlytics", parama1, null);
        }
        parama1 = i.d;
      }
    }
    
    public static String b()
    {
      return Thread.currentThread().getName();
    }
  }
}

/* Location:
 * Qualified Name:     k8.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */