package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

@RequiresApi(21)
class EnvironmentCompat$Api21Impl
{
  @DoNotInline
  public static String getExternalStorageState(File paramFile)
  {
    return Environment.getExternalStorageState(paramFile);
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.EnvironmentCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */