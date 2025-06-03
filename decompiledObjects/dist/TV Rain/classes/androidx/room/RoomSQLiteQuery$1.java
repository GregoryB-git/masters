package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;

final class RoomSQLiteQuery$1
  implements SupportSQLiteProgram
{
  public RoomSQLiteQuery$1(RoomSQLiteQuery paramRoomSQLiteQuery) {}
  
  public void bindBlob(int paramInt, byte[] paramArrayOfByte)
  {
    val$query.bindBlob(paramInt, paramArrayOfByte);
  }
  
  public void bindDouble(int paramInt, double paramDouble)
  {
    val$query.bindDouble(paramInt, paramDouble);
  }
  
  public void bindLong(int paramInt, long paramLong)
  {
    val$query.bindLong(paramInt, paramLong);
  }
  
  public void bindNull(int paramInt)
  {
    val$query.bindNull(paramInt);
  }
  
  public void bindString(int paramInt, String paramString)
  {
    val$query.bindString(paramInt, paramString);
  }
  
  public void clearBindings()
  {
    val$query.clearBindings();
  }
  
  public void close() {}
}

/* Location:
 * Qualified Name:     androidx.room.RoomSQLiteQuery.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */