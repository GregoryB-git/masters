package androidx.work.impl.utils;

import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.model.WorkSpecDao;
import java.util.UUID;

class StatusRunnable$2
  extends StatusRunnable<WorkInfo>
{
  public StatusRunnable$2(WorkManagerImpl paramWorkManagerImpl, UUID paramUUID) {}
  
  public WorkInfo runInternal()
  {
    Object localObject = val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(val$id.toString());
    if (localObject != null) {
      localObject = ((WorkSpec.WorkInfoPojo)localObject).toWorkInfo();
    } else {
      localObject = null;
    }
    return (WorkInfo)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.StatusRunnable.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */