package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class SystemIdInfoDao_Impl$2
  extends SharedSQLiteStatement
{
  public SystemIdInfoDao_Impl$2(SystemIdInfoDao_Impl paramSystemIdInfoDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "DELETE FROM SystemIdInfo where work_spec_id=?";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.SystemIdInfoDao_Impl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */