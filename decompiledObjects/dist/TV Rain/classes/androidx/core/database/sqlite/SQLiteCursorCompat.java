package androidx.core.database.sqlite;

import a3;
import android.database.sqlite.SQLiteCursor;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class SQLiteCursorCompat
{
  public static void setFillWindowForwardOnly(@NonNull SQLiteCursor paramSQLiteCursor, boolean paramBoolean)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      Api28Impl.setFillWindowForwardOnly(paramSQLiteCursor, paramBoolean);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static void setFillWindowForwardOnly(SQLiteCursor paramSQLiteCursor, boolean paramBoolean)
    {
      a3.t(paramSQLiteCursor, paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.database.sqlite.SQLiteCursorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */