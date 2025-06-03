package n2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class U
  extends SQLiteOpenHelper
{
  public static final String q;
  public static int r;
  public static final a s;
  public static final a t;
  public static final a u;
  public static final a v;
  public static final a w;
  public static final List x;
  public final int o;
  public boolean p = false;
  
  static
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("INSERT INTO global_log_event_state VALUES (");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    ((StringBuilder)localObject).append(")");
    q = ((StringBuilder)localObject).toString();
    r = 5;
    O localO = new O();
    s = localO;
    P localP = new P();
    t = localP;
    Q localQ = new Q();
    u = localQ;
    S localS = new S();
    v = localS;
    localObject = new T();
    w = (a)localObject;
    x = Arrays.asList(new a[] { localO, localP, localQ, localS, localObject });
  }
  
  public U(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
    o = paramInt;
  }
  
  public final void i(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!p) {
      onConfigure(paramSQLiteDatabase);
    }
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    p = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    r(paramSQLiteDatabase, o);
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
    r(paramSQLiteDatabase, paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    i(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    i(paramSQLiteDatabase);
    s(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public final void r(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    i(paramSQLiteDatabase);
    s(paramSQLiteDatabase, 0, paramInt);
  }
  
  public final void s(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    List localList = x;
    if (paramInt2 <= localList.size())
    {
      while (paramInt1 < paramInt2)
      {
        ((a)x.get(paramInt1)).a(paramSQLiteDatabase);
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
  
  public static abstract interface a
  {
    public abstract void a(SQLiteDatabase paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     n2.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */