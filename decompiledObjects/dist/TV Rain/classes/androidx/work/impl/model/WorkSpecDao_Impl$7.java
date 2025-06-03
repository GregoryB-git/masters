package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class WorkSpecDao_Impl$7
  extends SharedSQLiteStatement
{
  public WorkSpecDao_Impl$7(WorkSpecDao_Impl paramWorkSpecDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpecDao_Impl.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */