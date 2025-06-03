package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.File;

public final class EnvironmentCompat
{
  public static final String MEDIA_UNKNOWN = "unknown";
  private static final String TAG = "EnvironmentCompat";
  
  @NonNull
  public static String getStorageState(@NonNull File paramFile)
  {
    return Api21Impl.getExternalStorageState(paramFile);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static String getStorageState(File paramFile)
    {
      return Environment.getStorageState(paramFile);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static String getExternalStorageState(File paramFile)
    {
      return Environment.getExternalStorageState(paramFile);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.EnvironmentCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */