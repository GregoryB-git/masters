package androidx.mediarouter.media;

import android.os.Handler;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;

final class MediaRouter$PrepareTransferNotifier
{
  private static final long TRANSFER_TIMEOUT_MS = 15000L;
  private boolean mCanceled;
  private boolean mFinished;
  private final MediaRouter.RouteInfo mFromRoute;
  private ListenableFuture<Void> mFuture;
  @Nullable
  public final List<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> mMemberRoutes;
  public final int mReason;
  private final MediaRouter.RouteInfo mRequestedRoute;
  private final WeakReference<MediaRouter.GlobalMediaRouter> mRouter;
  public final MediaRouter.RouteInfo mToRoute;
  public final MediaRouteProvider.RouteController mToRouteController;
  
  public MediaRouter$PrepareTransferNotifier(MediaRouter.GlobalMediaRouter paramGlobalMediaRouter, MediaRouter.RouteInfo paramRouteInfo1, @Nullable MediaRouteProvider.RouteController paramRouteController, int paramInt, @Nullable MediaRouter.RouteInfo paramRouteInfo2, @Nullable Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection)
  {
    Object localObject = null;
    mFuture = null;
    mFinished = false;
    mCanceled = false;
    mRouter = new WeakReference(paramGlobalMediaRouter);
    mToRoute = paramRouteInfo1;
    mToRouteController = paramRouteController;
    mReason = paramInt;
    mFromRoute = mSelectedRoute;
    mRequestedRoute = paramRouteInfo2;
    if (paramCollection == null) {
      paramRouteInfo1 = (MediaRouter.RouteInfo)localObject;
    } else {
      paramRouteInfo1 = new ArrayList(paramCollection);
    }
    mMemberRoutes = paramRouteInfo1;
    mCallbackHandler.postDelayed(new c(this, 1), 15000L);
  }
  
  private void selectToRouteAndNotify()
  {
    MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
    if (localGlobalMediaRouter == null) {
      return;
    }
    MediaRouter.RouteInfo localRouteInfo = mToRoute;
    mSelectedRoute = localRouteInfo;
    mSelectedRouteController = mToRouteController;
    Object localObject = mRequestedRoute;
    if (localObject == null) {
      mCallbackHandler.post(262, new Pair(mFromRoute, localRouteInfo), mReason);
    } else {
      mCallbackHandler.post(264, new Pair(localObject, localRouteInfo), mReason);
    }
    mRouteControllerMap.clear();
    localGlobalMediaRouter.maybeUpdateMemberRouteControllers();
    localGlobalMediaRouter.updatePlaybackInfoFromSelectedRoute();
    localObject = mMemberRoutes;
    if (localObject != null) {
      mSelectedRoute.updateDynamicDescriptors((Collection)localObject);
    }
  }
  
  private void unselectFromRouteAndNotify()
  {
    MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
    if (localGlobalMediaRouter != null)
    {
      Object localObject1 = mSelectedRoute;
      Object localObject2 = mFromRoute;
      if (localObject1 == localObject2)
      {
        mCallbackHandler.post(263, localObject2, mReason);
        localObject2 = mSelectedRouteController;
        if (localObject2 != null)
        {
          ((MediaRouteProvider.RouteController)localObject2).onUnselect(mReason);
          mSelectedRouteController.onRelease();
        }
        if (!mRouteControllerMap.isEmpty())
        {
          localObject1 = mRouteControllerMap.values().iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (MediaRouteProvider.RouteController)((Iterator)localObject1).next();
            ((MediaRouteProvider.RouteController)localObject2).onUnselect(mReason);
            ((MediaRouteProvider.RouteController)localObject2).onRelease();
          }
          mRouteControllerMap.clear();
        }
        mSelectedRouteController = null;
      }
    }
  }
  
  public void cancel()
  {
    if ((!mFinished) && (!mCanceled))
    {
      mCanceled = true;
      MediaRouteProvider.RouteController localRouteController = mToRouteController;
      if (localRouteController != null)
      {
        localRouteController.onUnselect(0);
        mToRouteController.onRelease();
      }
    }
  }
  
  public void finishTransfer()
  {
    
    if ((!mFinished) && (!mCanceled))
    {
      MediaRouter.GlobalMediaRouter localGlobalMediaRouter = (MediaRouter.GlobalMediaRouter)mRouter.get();
      if ((localGlobalMediaRouter != null) && (mTransferNotifier == this))
      {
        ListenableFuture localListenableFuture = mFuture;
        if ((localListenableFuture == null) || (!localListenableFuture.isCancelled()))
        {
          mFinished = true;
          mTransferNotifier = null;
          unselectFromRouteAndNotify();
          selectToRouteAndNotify();
          return;
        }
      }
      cancel();
    }
  }
  
  public void setFuture(ListenableFuture<Void> paramListenableFuture)
  {
    Object localObject = (MediaRouter.GlobalMediaRouter)mRouter.get();
    if ((localObject != null) && (mTransferNotifier == this))
    {
      if (mFuture == null)
      {
        mFuture = paramListenableFuture;
        c localc = new c(this, 0);
        localObject = mCallbackHandler;
        Objects.requireNonNull(localObject);
        paramListenableFuture.addListener(localc, new d(0, (Handler)localObject));
        return;
      }
      throw new IllegalStateException("future is already set");
    }
    Log.w("MediaRouter", "Router is released. Cancel transfer");
    cancel();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouter.PrepareTransferNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */