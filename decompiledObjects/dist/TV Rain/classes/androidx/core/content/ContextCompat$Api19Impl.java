package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

@RequiresApi(19)
class ContextCompat$Api19Impl
{
  @DoNotInline
  public static File[] getExternalCacheDirs(Context paramContext)
  {
    return paramContext.getExternalCacheDirs();
  }
  
  @DoNotInline
  public static File[] getExternalFilesDirs(Context paramContext, String paramString)
  {
    return paramContext.getExternalFilesDirs(paramString);
  }
  
  @DoNotInline
  public static File[] getObbDirs(Context paramContext)
  {
    return paramContext.getObbDirs();
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.ContextCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */