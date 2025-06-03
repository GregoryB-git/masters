package u1;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import dc.r;
import ec.i;
import ec.j;
import t1.e;

public final class c$a
  extends j
  implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>
{
  public c$a(e parame)
  {
    super(4);
  }
  
  public final SQLiteCursor d(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    paramObject1 = (SQLiteDatabase)paramObject1;
    paramObject1 = (SQLiteCursorDriver)paramObject2;
    paramObject2 = (String)paramObject3;
    paramObject4 = (SQLiteQuery)paramObject4;
    paramObject3 = a;
    i.b(paramObject4);
    ((e)paramObject3).f(new f((SQLiteProgram)paramObject4));
    return new SQLiteCursor((SQLiteCursorDriver)paramObject1, (String)paramObject2, (SQLiteQuery)paramObject4);
  }
}

/* Location:
 * Qualified Name:     u1.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */