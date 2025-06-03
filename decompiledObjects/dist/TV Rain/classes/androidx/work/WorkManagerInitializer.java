package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer
  implements Initializer<WorkManager>
{
  private static final String TAG = Logger.tagWithPrefix("WrkMgrInitializer");
  
  @NonNull
  public WorkManager create(@NonNull Context paramContext)
  {
    Logger.get().debug(TAG, "Initializing WorkManager with default configuration.", new Throwable[0]);
    WorkManager.initialize(paramContext, new Configuration.Builder().build());
    return WorkManager.getInstance(paramContext);
  }
  
  @NonNull
  public List<Class<? extends Initializer<?>>> dependencies()
  {
    return Collections.emptyList();
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkManagerInitializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */