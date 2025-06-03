package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;

class WorkTagDao_Impl$1
  extends EntityInsertionAdapter<WorkTag>
{
  public WorkTagDao_Impl$1(WorkTagDao_Impl paramWorkTagDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, WorkTag paramWorkTag)
  {
    String str = tag;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramWorkTag = workSpecId;
    if (paramWorkTag == null) {
      paramSupportSQLiteStatement.bindNull(2);
    } else {
      paramSupportSQLiteStatement.bindString(2, paramWorkTag);
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkTagDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */