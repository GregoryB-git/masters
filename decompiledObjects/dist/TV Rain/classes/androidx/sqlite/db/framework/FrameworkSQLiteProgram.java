package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.SupportSQLiteProgram;

class FrameworkSQLiteProgram
  implements SupportSQLiteProgram
{
  private final SQLiteProgram mDelegate;
  
  public FrameworkSQLiteProgram(SQLiteProgram paramSQLiteProgram)
  {
    mDelegate = paramSQLiteProgram;
  }
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    mDelegate.bindBlob(paramInt, paramArrayOfByte);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    mDelegate.bindDouble(paramInt, paramDouble);
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    mDelegate.bindLong(paramInt, paramLong);
  }
  
  public void bindNull(int paramInt)
  {
    mDelegate.bindNull(paramInt);
  }
  
  public void bindString(int paramInt, String paramString)
  {
    mDelegate.bindString(paramInt, paramString);
  }
  
  public void clearBindings()
  {
    mDelegate.clearBindings();
  }
  
  public void close()
  {
    mDelegate.close();
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.framework.FrameworkSQLiteProgram
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */