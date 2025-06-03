package O5;

import android.content.Context;
import android.util.Log;

public abstract class a
{
  public static Context a;
  
  public static Context a()
  {
    return a;
  }
  
  public static void b(Context paramContext)
  {
    Log.d("FLTFireContextHolder", "received application context.");
    a = paramContext;
  }
}

/* Location:
 * Qualified Name:     O5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */