package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import z2;

public abstract class MediaRouteProvider
{
  public static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
  public static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
  private Callback mCallback;
  private final Context mContext;
  private MediaRouteProviderDescriptor mDescriptor;
  private MediaRouteDiscoveryRequest mDiscoveryRequest;
  private final ProviderHandler mHandler = new ProviderHandler();
  private final ProviderMetadata mMetadata;
  private boolean mPendingDescriptorChange;
  private boolean mPendingDiscoveryRequestChange;
  
  public MediaRouteProvider(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MediaRouteProvider(Context paramContext, ProviderMetadata paramProviderMetadata)
  {
    if (paramContext != null)
    {
      mContext = paramContext;
      if (paramProviderMetadata == null) {
        mMetadata = new ProviderMetadata(new ComponentName(paramContext, getClass()));
      } else {
        mMetadata = paramProviderMetadata;
      }
      return;
    }
    throw new IllegalArgumentException("context must not be null");
  }
  
  public void deliverDescriptorChanged()
  {
    mPendingDescriptorChange = false;
    Callback localCallback = mCallback;
    if (localCallback != null) {
      localCallback.onDescriptorChanged(this, mDescriptor);
    }
  }
  
  public void deliverDiscoveryRequestChanged()
  {
    mPendingDiscoveryRequestChange = false;
    onDiscoveryRequestChanged(mDiscoveryRequest);
  }
  
  @NonNull
  public final Context getContext()
  {
    return mContext;
  }
  
  @Nullable
  public final MediaRouteProviderDescriptor getDescriptor()
  {
    return mDescriptor;
  }
  
  @Nullable
  public final MediaRouteDiscoveryRequest getDiscoveryRequest()
  {
    return mDiscoveryRequest;
  }
  
  @NonNull
  public final Handler getHandler()
  {
    return mHandler;
  }
  
  @NonNull
  public final ProviderMetadata getMetadata()
  {
    return mMetadata;
  }
  
  @Nullable
  public DynamicGroupRouteController onCreateDynamicGroupRouteController(@NonNull String paramString)
  {
    if (paramString != null) {
      return null;
    }
    throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
  }
  
  @Nullable
  public RouteController onCreateRouteController(@NonNull String paramString)
  {
    if (paramString != null) {
      return null;
    }
    throw new IllegalArgumentException("routeId cannot be null");
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public RouteController onCreateRouteController(@NonNull String paramString1, @NonNull String paramString2)
  {
    if (paramString1 != null)
    {
      if (paramString2 != null) {
        return onCreateRouteController(paramString1);
      }
      throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    throw new IllegalArgumentException("routeId cannot be null");
  }
  
  public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest) {}
  
  public final void setCallback(@Nullable Callback paramCallback)
  {
    MediaRouter.checkCallingThread();
    mCallback = paramCallback;
  }
  
  public final void setDescriptor(@Nullable MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    
    if (mDescriptor != paramMediaRouteProviderDescriptor)
    {
      mDescriptor = paramMediaRouteProviderDescriptor;
      if (!mPendingDescriptorChange)
      {
        mPendingDescriptorChange = true;
        mHandler.sendEmptyMessage(1);
      }
    }
  }
  
  public final void setDiscoveryRequest(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    
    if (ObjectsCompat.equals(mDiscoveryRequest, paramMediaRouteDiscoveryRequest)) {
      return;
    }
    setDiscoveryRequestInternal(paramMediaRouteDiscoveryRequest);
  }
  
  public final void setDiscoveryRequestInternal(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    mDiscoveryRequest = paramMediaRouteDiscoveryRequest;
    if (!mPendingDiscoveryRequestChange)
    {
      mPendingDiscoveryRequestChange = true;
      mHandler.sendEmptyMessage(2);
    }
  }
  
  public static abstract class Callback
  {
    public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, @Nullable MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor) {}
  }
  
  public static abstract class DynamicGroupRouteController
    extends MediaRouteProvider.RouteController
  {
    @GuardedBy("mLock")
    public Executor mExecutor;
    @GuardedBy("mLock")
    public OnDynamicRoutesChangedListener mListener;
    private final Object mLock = new Object();
    @GuardedBy("mLock")
    public MediaRouteDescriptor mPendingGroupRoute;
    @GuardedBy("mLock")
    public Collection<DynamicRouteDescriptor> mPendingRoutes;
    
    @Nullable
    public String getGroupableSelectionTitle()
    {
      return null;
    }
    
    @Nullable
    public String getTransferableSectionTitle()
    {
      return null;
    }
    
    public final void notifyDynamicRoutesChanged(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor, @NonNull Collection<DynamicRouteDescriptor> paramCollection)
    {
      if (paramMediaRouteDescriptor != null)
      {
        if (paramCollection != null) {
          synchronized (mLock)
          {
            Executor localExecutor = mExecutor;
            if (localExecutor != null)
            {
              OnDynamicRoutesChangedListener localOnDynamicRoutesChangedListener = mListener;
              Runnable local3 = new androidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController$3;
              local3.<init>(this, localOnDynamicRoutesChangedListener, paramMediaRouteDescriptor, paramCollection);
              localExecutor.execute(local3);
            }
            else
            {
              mPendingGroupRoute = paramMediaRouteDescriptor;
              paramMediaRouteDescriptor = new java/util/ArrayList;
              paramMediaRouteDescriptor.<init>(paramCollection);
              mPendingRoutes = paramMediaRouteDescriptor;
            }
            return;
          }
        }
        throw new NullPointerException("dynamicRoutes must not be null");
      }
      throw new NullPointerException("groupRoute must not be null");
    }
    
    @Deprecated
    public final void notifyDynamicRoutesChanged(@NonNull Collection<DynamicRouteDescriptor> paramCollection)
    {
      if (paramCollection != null) {
        synchronized (mLock)
        {
          Executor localExecutor = mExecutor;
          Object localObject2;
          if (localExecutor != null)
          {
            localObject2 = mListener;
            Runnable local2 = new androidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController$2;
            local2.<init>(this, (OnDynamicRoutesChangedListener)localObject2, paramCollection);
            localExecutor.execute(local2);
          }
          else
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>(paramCollection);
            mPendingRoutes = ((Collection)localObject2);
          }
          return;
        }
      }
      throw new NullPointerException("routes must not be null");
    }
    
    public abstract void onAddMemberRoute(@NonNull String paramString);
    
    public abstract void onRemoveMemberRoute(@NonNull String paramString);
    
    public abstract void onUpdateMemberRoutes(@Nullable List<String> paramList);
    
    public void setOnDynamicRoutesChangedListener(@NonNull Executor paramExecutor, @NonNull OnDynamicRoutesChangedListener paramOnDynamicRoutesChangedListener)
    {
      localObject = mLock;
      if ((paramExecutor == null) || (paramOnDynamicRoutesChangedListener != null)) {}
      try
      {
        mExecutor = paramExecutor;
        mListener = paramOnDynamicRoutesChangedListener;
        paramExecutor = mPendingRoutes;
        if ((paramExecutor != null) && (!paramExecutor.isEmpty()))
        {
          paramExecutor = mPendingGroupRoute;
          Collection localCollection = mPendingRoutes;
          mPendingGroupRoute = null;
          mPendingRoutes = null;
          Executor localExecutor = mExecutor;
          Runnable local1 = new androidx/mediarouter/media/MediaRouteProvider$DynamicGroupRouteController$1;
          local1.<init>(this, paramOnDynamicRoutesChangedListener, paramExecutor, localCollection);
          localExecutor.execute(local1);
        }
        return;
      }
      finally {}
      paramExecutor = new java/lang/NullPointerException;
      paramExecutor.<init>("Listener shouldn't be null");
      throw paramExecutor;
      paramExecutor = new java/lang/NullPointerException;
      paramExecutor.<init>("Executor shouldn't be null");
      throw paramExecutor;
    }
    
    public static final class DynamicRouteDescriptor
    {
      public static final String KEY_IS_GROUPABLE = "isGroupable";
      public static final String KEY_IS_TRANSFERABLE = "isTransferable";
      public static final String KEY_IS_UNSELECTABLE = "isUnselectable";
      public static final String KEY_MEDIA_ROUTE_DESCRIPTOR = "mrDescriptor";
      public static final String KEY_SELECTION_STATE = "selectionState";
      public static final int SELECTED = 3;
      public static final int SELECTING = 2;
      public static final int UNSELECTED = 1;
      public static final int UNSELECTING = 0;
      public Bundle mBundle;
      public final boolean mIsGroupable;
      public final boolean mIsTransferable;
      public final boolean mIsUnselectable;
      public final MediaRouteDescriptor mMediaRouteDescriptor;
      public final int mSelectionState;
      
      public DynamicRouteDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
      {
        mMediaRouteDescriptor = paramMediaRouteDescriptor;
        mSelectionState = paramInt;
        mIsUnselectable = paramBoolean1;
        mIsGroupable = paramBoolean2;
        mIsTransferable = paramBoolean3;
      }
      
      public static DynamicRouteDescriptor fromBundle(Bundle paramBundle)
      {
        if (paramBundle == null) {
          return null;
        }
        return new DynamicRouteDescriptor(MediaRouteDescriptor.fromBundle(paramBundle.getBundle("mrDescriptor")), paramBundle.getInt("selectionState", 1), paramBundle.getBoolean("isUnselectable", false), paramBundle.getBoolean("isGroupable", false), paramBundle.getBoolean("isTransferable", false));
      }
      
      @NonNull
      public MediaRouteDescriptor getRouteDescriptor()
      {
        return mMediaRouteDescriptor;
      }
      
      public int getSelectionState()
      {
        return mSelectionState;
      }
      
      public boolean isGroupable()
      {
        return mIsGroupable;
      }
      
      public boolean isTransferable()
      {
        return mIsTransferable;
      }
      
      public boolean isUnselectable()
      {
        return mIsUnselectable;
      }
      
      public Bundle toBundle()
      {
        if (mBundle == null)
        {
          Bundle localBundle = new Bundle();
          mBundle = localBundle;
          localBundle.putBundle("mrDescriptor", mMediaRouteDescriptor.asBundle());
          mBundle.putInt("selectionState", mSelectionState);
          mBundle.putBoolean("isUnselectable", mIsUnselectable);
          mBundle.putBoolean("isGroupable", mIsGroupable);
          mBundle.putBoolean("isTransferable", mIsTransferable);
        }
        return mBundle;
      }
      
      public static final class Builder
      {
        private boolean mIsGroupable = false;
        private boolean mIsTransferable = false;
        private boolean mIsUnselectable = false;
        private final MediaRouteDescriptor mRouteDescriptor;
        private int mSelectionState = 1;
        
        public Builder(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
        {
          if (paramMediaRouteDescriptor != null)
          {
            mRouteDescriptor = paramMediaRouteDescriptor;
            return;
          }
          throw new NullPointerException("descriptor must not be null");
        }
        
        public Builder(@NonNull MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
        {
          if (paramDynamicRouteDescriptor != null)
          {
            mRouteDescriptor = paramDynamicRouteDescriptor.getRouteDescriptor();
            mSelectionState = paramDynamicRouteDescriptor.getSelectionState();
            mIsUnselectable = paramDynamicRouteDescriptor.isUnselectable();
            mIsGroupable = paramDynamicRouteDescriptor.isGroupable();
            mIsTransferable = paramDynamicRouteDescriptor.isTransferable();
            return;
          }
          throw new NullPointerException("dynamicRouteDescriptor must not be null");
        }
        
        @NonNull
        public MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor build()
        {
          return new MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor(mRouteDescriptor, mSelectionState, mIsUnselectable, mIsGroupable, mIsTransferable);
        }
        
        @NonNull
        public Builder setIsGroupable(boolean paramBoolean)
        {
          mIsGroupable = paramBoolean;
          return this;
        }
        
        @NonNull
        public Builder setIsTransferable(boolean paramBoolean)
        {
          mIsTransferable = paramBoolean;
          return this;
        }
        
        @NonNull
        public Builder setIsUnselectable(boolean paramBoolean)
        {
          mIsUnselectable = paramBoolean;
          return this;
        }
        
        @NonNull
        public Builder setSelectionState(int paramInt)
        {
          mSelectionState = paramInt;
          return this;
        }
      }
      
      @Retention(RetentionPolicy.SOURCE)
      @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
      public static @interface SelectionState {}
    }
    
    public static abstract interface OnDynamicRoutesChangedListener
    {
      public abstract void onRoutesChanged(MediaRouteProvider.DynamicGroupRouteController paramDynamicGroupRouteController, MediaRouteDescriptor paramMediaRouteDescriptor, Collection<MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor> paramCollection);
    }
  }
  
  public final class ProviderHandler
    extends Handler
  {
    public ProviderHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      int i = what;
      if (i != 1)
      {
        if (i == 2) {
          deliverDiscoveryRequestChanged();
        }
      }
      else {
        deliverDescriptorChanged();
      }
    }
  }
  
  public static final class ProviderMetadata
  {
    private final ComponentName mComponentName;
    
    public ProviderMetadata(ComponentName paramComponentName)
    {
      if (paramComponentName != null)
      {
        mComponentName = paramComponentName;
        return;
      }
      throw new IllegalArgumentException("componentName must not be null");
    }
    
    @NonNull
    public ComponentName getComponentName()
    {
      return mComponentName;
    }
    
    @NonNull
    public String getPackageName()
    {
      return mComponentName.getPackageName();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("ProviderMetadata{ componentName=");
      localStringBuilder.append(mComponentName.flattenToShortString());
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class RouteController
  {
    public boolean onControlRequest(@NonNull Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      return false;
    }
    
    public void onRelease() {}
    
    public void onSelect() {}
    
    public void onSetVolume(int paramInt) {}
    
    @Deprecated
    public void onUnselect() {}
    
    public void onUnselect(int paramInt)
    {
      onUnselect();
    }
    
    public void onUpdateVolume(int paramInt) {}
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */