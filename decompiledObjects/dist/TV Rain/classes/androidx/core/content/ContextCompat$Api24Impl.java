package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

@RequiresApi(24)
class ContextCompat$Api24Impl
{
  @DoNotInline
  public static Context createDeviceProtectedStorageContext(Context paramContext)
  {
    return paramContext.createDeviceProtectedStorageContext();
  }
  
  @DoNotInline
  public static File getDataDir(Context paramContext)
  {
    return paramContext.getDataDir();
  }
  
  @DoNotInline
  public static boolean isDeviceProtectedStorage(Context paramContext)
  {
    return paramContext.isDeviceProtectedStorage();
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */