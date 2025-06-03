package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public class StableIdStorage$SharedPoolStableIdStorage
  implements StableIdStorage
{
  private final StableIdStorage.StableIdLookup mSameIdLookup = new StableIdStorage.StableIdLookup()
  {
    public long localToGlobal(long paramAnonymousLong)
    {
      return paramAnonymousLong;
    }
  };
  
  @NonNull
  public StableIdStorage.StableIdLookup createStableIdLookup()
  {
    return mSameIdLookup;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */