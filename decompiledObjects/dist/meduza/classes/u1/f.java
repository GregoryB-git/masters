package u1;

import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteProgram;
import ec.i;
import t1.d;

public class f
  implements d
{
  public final SQLiteProgram a;
  
  public f(SQLiteProgram paramSQLiteProgram)
  {
    a = paramSQLiteProgram;
  }
  
  public final void F(int paramInt, long paramLong)
  {
    a.bindLong(paramInt, paramLong);
  }
  
  public final void T(byte[] paramArrayOfByte, int paramInt)
  {
    a.bindBlob(paramInt, paramArrayOfByte);
  }
  
  public final void close()
  {
    a.close();
  }
  
  public final void d0(int paramInt)
  {
    a.bindNull(paramInt);
  }
  
  public final void n(int paramInt, String paramString)
  {
    i.e(paramString, "value");
    a.bindString(paramInt, paramString);
  }
  
  public final void s(int paramInt, double paramDouble)
  {
    a.bindDouble(paramInt, paramDouble);
  }
}

/* Location:
 * Qualified Name:     u1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */