package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(15)
class CursorWindowCompat$Api15Impl
{
  @DoNotInline
  public static CursorWindow createCursorWindow(String paramString)
  {
    return new CursorWindow(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.database.CursorWindowCompat.Api15Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */