package androidx.work.impl.model;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

class WorkProgressDao_Impl$2
  extends SharedSQLiteStatement
{
  public WorkProgressDao_Impl$2(WorkProgressDao_Impl paramWorkProgressDao_Impl, RoomDatabase paramRoomDatabase)
  {
    super(paramRoomDatabase);
  }
  
  public String createQuery()
  {
    return "DELETE from WorkProgress where work_spec_id=?";
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkProgressDao_Impl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */