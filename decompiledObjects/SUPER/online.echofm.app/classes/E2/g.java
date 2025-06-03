package E2;

import A2.n;
import android.content.Context;
import android.util.Log;

public abstract class g
{
  public static final String[] a = { "android.", "com.android.", "dalvik.", "java.", "javax." };
  
  public static boolean a(Context paramContext, Throwable paramThrowable)
  {
    try
    {
      n.i(paramContext);
      n.i(paramThrowable);
    }
    catch (Exception paramContext)
    {
      Log.e("CrashUtils", "Error adding exception to DropBox!", paramContext);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     E2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */