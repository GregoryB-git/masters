package androidx.work.impl.model;

import androidx.room.ColumnInfo;
import androidx.work.WorkInfo.State;

public class WorkSpec$IdAndState
{
  @ColumnInfo(name="id")
  public String id;
  @ColumnInfo(name="state")
  public WorkInfo.State state;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof IdAndState)) {
      return false;
    }
    paramObject = (IdAndState)paramObject;
    if (state != state) {
      return false;
    }
    return id.equals(id);
  }
  
  public int hashCode()
  {
    int i = id.hashCode();
    return state.hashCode() + i * 31;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpec.IdAndState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */