package u1;

import android.database.sqlite.SQLiteStatement;

public final class g
  extends f
  implements t1.f
{
  public final SQLiteStatement b;
  
  public g(SQLiteStatement paramSQLiteStatement)
  {
    super(paramSQLiteStatement);
    b = paramSQLiteStatement;
  }
  
  public final int p()
  {
    return b.executeUpdateDelete();
  }
  
  public final long w0()
  {
    return b.executeInsert();
  }
}

/* Location:
 * Qualified Name:     u1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */