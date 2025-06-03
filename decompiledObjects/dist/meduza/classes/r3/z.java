package r3;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f;
import java.util.Arrays;
import java.util.List;

public final class z
  extends SQLiteOpenHelper
{
  public static final String c;
  public static int d = 7;
  public static final List<a> e = Arrays.asList(new a[] { new v(0), new w(0), new x(0), new y(), new v(1), new w(1), new x(1) });
  public final int a;
  public boolean b = false;
  
  static
  {
    StringBuilder localStringBuilder = f.l("INSERT INTO global_log_event_state VALUES (");
    localStringBuilder.append(System.currentTimeMillis());
    localStringBuilder.append(")");
    c = localStringBuilder.toString();
  }
  
  public z(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
    a = paramInt;
  }
  
  public static void f(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    List localList = e;
    if (paramInt2 <= localList.size())
    {
      while (paramInt1 < paramInt2)
      {
        ((a)e.get(paramInt1)).a(paramSQLiteDatabase);
        paramInt1++;
      }
      return;
    }
    paramSQLiteDatabase = new StringBuilder();
    paramSQLiteDatabase.append("Migration from ");
    paramSQLiteDatabase.append(paramInt1);
    paramSQLiteDatabase.append(" to ");
    paramSQLiteDatabase.append(paramInt2);
    paramSQLiteDatabase.append(" was requested, but cannot be performed. Only ");
    paramSQLiteDatabase.append(localList.size());
    paramSQLiteDatabase.append(" migrations are provided");
    throw new IllegalArgumentException(paramSQLiteDatabase.toString());
  }
  
  public final void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    b = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = a;
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
    f(paramSQLiteDatabase, 0, i);
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
    f(paramSQLiteDatabase, 0, paramInt2);
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    if (!b) {
      onConfigure(paramSQLiteDatabase);
    }
    f(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public static abstract interface a
  {
    public abstract void a(SQLiteDatabase paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     r3.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */