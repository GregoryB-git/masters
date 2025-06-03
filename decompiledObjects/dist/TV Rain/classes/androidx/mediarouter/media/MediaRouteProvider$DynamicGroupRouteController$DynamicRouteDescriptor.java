package androidx.mediarouter.media;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor
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
  
  public MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */