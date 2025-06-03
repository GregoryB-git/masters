package androidx.work.impl.model;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteStatement;

class DependencyDao_Impl$1
  extends EntityInsertionAdapter<Dependency>
{
  public DependencyDao_Impl$1(DependencyDao_Impl paramDependencyDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public void bind(SupportSQLiteStatement paramSupportSQLiteStatement, Dependency paramDependency)
  {
    String str = workSpecId;
    if (str == null) {
      paramSupportSQLiteStatement.bindNull(1);
    } else {
      paramSupportSQLiteStatement.bindString(1, str);
    }
    paramDependency = prerequisiteId;
    if (paramDependency == null) {
      paramSupportSQLiteStatement.bindNull(2);
    } else {
      paramSupportSQLiteStatement.bindString(2, paramDependency);
    }
  }
  
  public String createQuery()
  {
    return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.DependencyDao_Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */