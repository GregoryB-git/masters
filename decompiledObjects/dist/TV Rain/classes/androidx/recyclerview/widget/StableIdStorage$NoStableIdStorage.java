package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public class StableIdStorage$NoStableIdStorage
  implements StableIdStorage
{
  private final StableIdStorage.StableIdLookup mNoIdLookup = new StableIdStorage.StableIdLookup()
  {
    public long localToGlobal(long paramAnonymousLong)
    {
      return -1L;
    }
  };
  
  @NonNull
  public StableIdStorage.StableIdLookup createStableIdLookup()
  {
    return mNoIdLookup;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */