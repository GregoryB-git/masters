package x;

import android.content.Context;
import java.io.File;

public abstract class a$d
{
  public static Context a(Context paramContext)
  {
    return paramContext.createDeviceProtectedStorageContext();
  }
  
  public static File b(Context paramContext)
  {
    return paramContext.getDataDir();
  }
  
  public static boolean c(Context paramContext)
  {
    return paramContext.isDeviceProtectedStorage();
  }
}

/* Location:
 * Qualified Name:     x.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */