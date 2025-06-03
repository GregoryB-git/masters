package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public final class ConcatAdapter$Config
{
  @NonNull
  public static final Config DEFAULT = new Config(true, StableIdMode.NO_STABLE_IDS);
  public final boolean isolateViewTypes;
  @NonNull
  public final StableIdMode stableIdMode;
  
  public ConcatAdapter$Config(boolean paramBoolean, @NonNull StableIdMode paramStableIdMode)
  {
    isolateViewTypes = paramBoolean;
    stableIdMode = paramStableIdMode;
  }
  
  public static final class Builder
  {
    private boolean mIsolateViewTypes;
    private ConcatAdapter.Config.StableIdMode mStableIdMode;
    
    public Builder()
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
  
  public static enum StableIdMode
  {
    static
    {
      StableIdMode localStableIdMode1 = new StableIdMode("NO_STABLE_IDS", 0);
      NO_STABLE_IDS = localStableIdMode1;
      StableIdMode localStableIdMode2 = new StableIdMode("ISOLATED_STABLE_IDS", 1);
      ISOLATED_STABLE_IDS = localStableIdMode2;
      StableIdMode localStableIdMode3 = new StableIdMode("SHARED_STABLE_IDS", 2);
      SHARED_STABLE_IDS = localStableIdMode3;
      $VALUES = new StableIdMode[] { localStableIdMode1, localStableIdMode2, localStableIdMode3 };
    }
    
    private StableIdMode() {}
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ConcatAdapter.Config
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */