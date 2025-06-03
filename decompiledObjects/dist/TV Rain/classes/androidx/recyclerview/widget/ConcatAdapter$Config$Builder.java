package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public final class ConcatAdapter$Config$Builder
{
  private boolean mIsolateViewTypes;
  private ConcatAdapter.Config.StableIdMode mStableIdMode;
  
  public ConcatAdapter$Config$Builder()
  {
    ConcatAdapter.Config localConfig = ConcatAdapter.Config.DEFAULT;
    mIsolateViewTypes = isolateViewTypes;
    mStableIdMode = stableIdMode;
  }
  
  @NonNull
  public ConcatAdapter.Config build()
  {
    return new ConcatAdapter.Config(mIsolateViewTypes, mStableIdMode);
  }
  
  @NonNull
  public Builder setIsolateViewTypes(boolean paramBoolean)
  {
    mIsolateViewTypes = paramBoolean;
    return this;
  }
  
  @NonNull
  public Builder setStableIdMode(@NonNull ConcatAdapter.Config.StableIdMode paramStableIdMode)
  {
    mStableIdMode = paramStableIdMode;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ConcatAdapter.Config.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */