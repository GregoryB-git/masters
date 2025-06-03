package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

public final class a$a
{
  public static File a(Context paramContext)
  {
    return paramContext.getCodeCacheDir();
  }
  
  public static Drawable b(Context paramContext, int paramInt)
  {
    return paramContext.getDrawable(paramInt);
  }
  
  public static File c(Context paramContext)
  {
    return paramContext.getNoBackupFilesDir();
  }
}

/* Location:
 * Qualified Name:     v.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */