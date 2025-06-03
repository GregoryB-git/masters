package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Data;

class WorkProgressDao_Impl$1
  extends EntityInsertionAdapter<WorkProgress>
{
  public WorkProgressDao_Impl$1(WorkProgressDao_Impl paramWorkProgressDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, WorkProgress paramWorkProgress)
  {
    String str = mWorkSpecId;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramWorkProgress = Data.toByteArrayInternal(mProgress);
    if (paramWorkProgress == null) {
      paramSupportSQLiteStatement.bindNull(2);
    } else {
      paramSupportSQLiteStatement.bindBlob(2, paramWorkProgress);
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkProgressDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */