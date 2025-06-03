package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class WorkSpecDao_Impl$9
  extends SharedSQLiteStatement
{
  public WorkSpecDao_Impl$9(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */