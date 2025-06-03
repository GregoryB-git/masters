package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class WorkProgressDao_Impl$3
  extends SharedSQLiteStatement
{
  public WorkProgressDao_Impl$3(WorkProgressDao_Impl paramWorkProgressDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "DELETE FROM WorkProgress";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkProgressDao_Impl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */