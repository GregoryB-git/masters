package androidx.mediarouter.media;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

public abstract interface MediaRouter$OnPrepareTransferListener
{
  @MainThread
  @Nullable
  public abstract ListenableFuture<Void> onPrepareTransfer(@NonNull MediaRouter.RouteInfo paramRouteInfo1, @NonNull MediaRouter.RouteInfo paramRouteInfo2);
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.OnPrepareTransferListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */