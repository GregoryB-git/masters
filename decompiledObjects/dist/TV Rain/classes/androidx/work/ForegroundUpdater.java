package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public abstract interface ForegroundUpdater
{
  @NonNull
  public abstract ListenableFuture<Void> setForegroundAsync(@NonNull Context paramContext, @NonNull UUID paramUUID, @NonNull ForegroundInfo paramForegroundInfo);
}

/* Location:
 * Qualified Name:     androidx.work.ForegroundUpdater
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */