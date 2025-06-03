package androidx.work.impl;

import androidx.arch.core.util.Function;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import java.util.List;

class WorkManagerImpl$2
  implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo>
{
  public WorkManagerImpl$2(WorkManagerImpl paramWorkManagerImpl) {}
  
  public WorkInfo apply(List<WorkSpec.WorkInfoPojo> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0)) {
      paramList = ((WorkSpec.WorkInfoPojo)paramList.get(0)).toWorkInfo();
    } else {
      paramList = null;
    }
    return paramList;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkManagerImpl.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */