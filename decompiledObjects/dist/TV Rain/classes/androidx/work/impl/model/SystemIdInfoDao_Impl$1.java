package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;

class SystemIdInfoDao_Impl$1
  extends EntityInsertionAdapter<SystemIdInfo>
{
  public SystemIdInfoDao_Impl$1(SystemIdInfoDao_Impl paramSystemIdInfoDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, SystemIdInfo paramSystemIdInfo)
  {
    String str = workSpecId;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramSupportSQLiteStatement.bindLong(2, systemId);
  }
  
  public String createQuery()
  {
    return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.SystemIdInfoDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */