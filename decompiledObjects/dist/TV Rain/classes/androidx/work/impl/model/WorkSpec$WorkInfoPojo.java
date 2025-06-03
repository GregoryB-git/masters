package androidx.work.impl.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Relation;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.WorkInfo.State;
import java.util.List;
import java.util.UUID;

public class WorkSpec$WorkInfoPojo
{
  @ColumnInfo(name="id")
  public String id;
  @ColumnInfo(name="output")
  public Data output;
  @Relation(entity=WorkProgress.class, entityColumn="work_spec_id", parentColumn="id", projection={"progress"})
  public List<Data> progress;
  @ColumnInfo(name="run_attempt_count")
  public int runAttemptCount;
  @ColumnInfo(name="state")
  public WorkInfo.State state;
  @Relation(entity=WorkTag.class, entityColumn="work_spec_id", parentColumn="id", projection={"tag"})
  public List<String> tags;
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof WorkInfoPojo)) {
      return false;
    }
    paramObject = (WorkInfoPojo)paramObject;
    if (runAttemptCount != runAttemptCount) {
      return false;
    }
    Object localObject = id;
    if (localObject != null ? !((String)localObject).equals(id) : id != null) {
      return false;
    }
    if (state != state) {
      return false;
    }
    localObject = output;
    if (localObject != null ? !((Data)localObject).equals(output) : output != null) {
      return false;
    }
    localObject = tags;
    if (localObject != null ? !((List)localObject).equals(tags) : tags != null) {
      return false;
    }
    localObject = progress;
    paramObject = progress;
    if (localObject != null) {
      bool = ((List)localObject).equals(paramObject);
    } else if (paramObject != null) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    Object localObject = id;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = state;
    int k;
    if (localObject != null) {
      k = localObject.hashCode();
    } else {
      k = 0;
    }
    localObject = output;
    int m;
    if (localObject != null) {
      m = ((Data)localObject).hashCode();
    } else {
      m = 0;
    }
    int n = runAttemptCount;
    localObject = tags;
    int i1;
    if (localObject != null) {
      i1 = ((List)localObject).hashCode();
    } else {
      i1 = 0;
    }
    localObject = progress;
    if (localObject != null) {
      i = ((List)localObject).hashCode();
    }
    return ((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i;
  }
  
  @NonNull
  public WorkInfo toWorkInfo()
  {
    Object localObject = progress;
    if ((localObject != null) && (!((List)localObject).isEmpty())) {
      localObject = (Data)progress.get(0);
    } else {
      localObject = Data.EMPTY;
    }
    return new WorkInfo(UUID.fromString(id), state, output, tags, (Data)localObject, runAttemptCount);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpec.WorkInfoPojo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */