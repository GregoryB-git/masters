package androidx.sqlite.db;

import java.io.Closeable;

public abstract interface SupportSQLiteProgram
  extends Closeable
{
  public abstract void bindBlob(int paramInt, byte[] paramArrayOfByte);
  
  public abstract void bindDouble(int paramInt, double paramDouble);
  
  public abstract void bindLong(int paramInt, long paramLong);
  
  public abstract void bindNull(int paramInt);
  
  public abstract void bindString(int paramInt, String paramString);
  
  public abstract void clearBindings();
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteProgram
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */