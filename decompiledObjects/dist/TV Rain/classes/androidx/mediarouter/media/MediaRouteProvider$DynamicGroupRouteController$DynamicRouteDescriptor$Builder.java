package androidx.mediarouter.media;

import androidx.annotation.NonNull;

public final class MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor$Builder
{
  private boolean mIsGroupable = false;
  private boolean mIsTransferable = false;
  private boolean mIsUnselectable = false;
  private final MediaRouteDescriptor mRouteDescriptor;
  private int mSelectionState = 1;
  
  public MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor$Builder(@NonNull MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor != null)
    {
      mRouteDescriptor = paramMediaRouteDescriptor;
      return;
    }
    throw new NullPointerException("descriptor must not be null");
  }
  
  public MediaRouteProvider$DynamicGroupRouteController$DynamicRouteDescriptor$Builder(@NonNull MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor paramDynamicRouteDescriptor)
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

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteProvider.DynamicGroupRouteController.DynamicRouteDescriptor.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */