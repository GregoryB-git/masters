package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class WorkSpec$1
  implements Function<List<WorkSpec.WorkInfoPojo>, List<WorkInfo>>
{
  public List<WorkInfo> apply(List<WorkSpec.WorkInfoPojo> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((WorkSpec.WorkInfoPojo)paramList.next()).toWorkInfo());
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpec.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */