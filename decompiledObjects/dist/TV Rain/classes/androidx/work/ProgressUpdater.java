package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public abstract interface ProgressUpdater
{
  @NonNull
  public abstract ListenableFuture<Void> updateProgress(@NonNull Context paramContext, @NonNull UUID paramUUID, @NonNull Data paramData);
}

/* Location:
 * Qualified Name:     androidx.work.ProgressUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */