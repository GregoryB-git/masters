package androidx.startup;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class StartupLogger
{
  public static final boolean DEBUG = false;
  private static final String TAG = "StartupLogger";
  
  public static void e(@NonNull String paramString, @Nullable Throwable paramThrowable)
  {
    Log.e("StartupLogger", paramString, paramThrowable);
  }
  
  public static void i(@NonNull String paramString)
  {
    Log.i("StartupLogger", paramString);
  }
  
  public static void w(@NonNull String paramString)
  {
    Log.w("StartupLogger", paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.startup.StartupLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */