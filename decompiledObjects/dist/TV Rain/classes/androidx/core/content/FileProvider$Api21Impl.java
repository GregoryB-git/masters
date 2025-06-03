package androidx.core.content;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

@RequiresApi(21)
class FileProvider$Api21Impl
{
  @DoNotInline
  public static File[] getExternalMediaDirs(Context paramContext)
  {
    return paramContext.getExternalMediaDirs();
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.FileProvider.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */