package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;

class WorkNameDao_Impl$1
  extends EntityInsertionAdapter<WorkName>
{
  public WorkNameDao_Impl$1(WorkNameDao_Impl paramWorkNameDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, WorkName paramWorkName)
  {
    String str = name;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramWorkName = workSpecId;
    if (paramWorkName == null) {
      paramSupportSQLiteStatement.bindNull(2);
    } else {
      paramSupportSQLiteStatement.bindString(2, paramWorkName);
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkNameDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */