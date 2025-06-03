package k8;

import android.util.Log;
import dc.a;

public final class i$a
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

/* Location:
 * Qualified Name:     k8.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */