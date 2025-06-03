package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsReceiver
  extends BroadcastReceiver
{
  private static final String TAG = Logger.tagWithPrefix("DiagnosticsRcvr");
  
  public void onReceive(@NonNull Context paramContext, @Nullable Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    Logger.get().debug(TAG, "Requesting diagnostics", new Throwable[0]);
    try
    {
      WorkManager.getInstance(paramContext).enqueue(OneTimeWorkRequest.from(DiagnosticsWorker.class));
    }
    catch (IllegalStateException paramContext)
    {
      Logger.get().error(TAG, "WorkManager is not initialized", new Throwable[] { paramContext });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.diagnostics.DiagnosticsReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */