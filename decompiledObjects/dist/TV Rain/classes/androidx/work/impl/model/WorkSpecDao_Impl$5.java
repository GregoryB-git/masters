package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class WorkSpecDao_Impl$5
  extends SharedSQLiteStatement
{
  public WorkSpecDao_Impl$5(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */