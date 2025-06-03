package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.WorkSpec;
import java.util.List;

class StatusRunnable$5
  extends StatusRunnable<List<WorkInfo>>
{
  public StatusRunnable$5(WorkManagerImpl paramWorkManagerImpl, WorkQuery paramWorkQuery) {}
  
  public List<WorkInfo> runInternal()
  {
    List localList = val$workManager.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.workQueryToRawQuery(val$querySpec));
    return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.StatusRunnable.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */