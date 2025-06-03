package androidx.work.impl.foreground;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Map;
import java.util.Set;

class SystemForegroundDispatcher$1
  implements Runnable
{
  public SystemForegroundDispatcher$1(SystemForegroundDispatcher paramSystemForegroundDispatcher, WorkDatabase paramWorkDatabase, String paramString) {}
  
  public void run()
  {
    Object localObject1 = val$database.workSpecDao().getWorkSpec(val$workSpecId);
    if ((localObject1 != null) && (((WorkSpec)localObject1).hasConstraints())) {
      synchronized (this$0.mLock)
      {
        this$0.mWorkSpecById.put(val$workSpecId, localObject1);
        this$0.mTrackedWorkSpecs.add(localObject1);
        localObject1 = this$0;
        mConstraintsTracker.replace(mTrackedWorkSpecs);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.foreground.SystemForegroundDispatcher.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */