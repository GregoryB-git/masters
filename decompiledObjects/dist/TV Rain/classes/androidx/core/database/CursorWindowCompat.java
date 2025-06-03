package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class CursorWindowCompat
{
  @NonNull
  public static CursorWindow create(@Nullable String paramString, long paramLong)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return Api28Impl.createCursorWindow(paramString, paramLong);
    }
    return Api15Impl.createCursorWindow(paramString);
  }
  
  @RequiresApi(15)
  public static class Api15Impl
  {
    @DoNotInline
    public static CursorWindow createCursorWindow(String paramString)
    {
      return new CursorWindow(paramString);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static CursorWindow createCursorWindow(String paramString, long paramLong)
    {
      return new CursorWindow(paramString, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.database.CursorWindowCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */