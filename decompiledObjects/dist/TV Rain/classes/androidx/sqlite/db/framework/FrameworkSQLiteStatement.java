package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;

class FrameworkSQLiteStatement
  extends FrameworkSQLiteProgram
  implements SupportSQLiteStatement
{
  private final SQLiteStatement mDelegate;
  
  public FrameworkSQLiteStatement(SQLiteStatement paramSQLiteStatement)
  {
    super(paramSQLiteStatement);
    mDelegate = paramSQLiteStatement;
  }
  
  public void execute()
  {
    mDelegate.execute();
  }
  
  public long executeInsert()
  {
    return mDelegate.executeInsert();
  }
  
  public int executeUpdateDelete()
  {
    return mDelegate.executeUpdateDelete();
  }
  
  public long simpleQueryForLong()
  {
    return mDelegate.simpleQueryForLong();
  }
  
  public String simpleQueryForString()
  {
    return mDelegate.simpleQueryForString();
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteStatement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */