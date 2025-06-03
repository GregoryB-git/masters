package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;

class StatusRunnable$1
  extends StatusRunnable<List<WorkInfo>>
{
  public StatusRunnable$1(WorkManagerImpl paramWorkManagerImpl, List paramList) {}
  
  public List<WorkInfo> runInternal()
  {
    List localList = val$workManager.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(val$ids);
    return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.StatusRunnable.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */