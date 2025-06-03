package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class CursorWindowCompat$Api28Impl
{
  @DoNotInline
  public static CursorWindow createCursorWindow(String paramString, long paramLong)
  {
    return new CursorWindow(paramString, paramLong);
  }
}

/* Location:
 * Qualified Name:     androidx.core.database.CursorWindowCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */