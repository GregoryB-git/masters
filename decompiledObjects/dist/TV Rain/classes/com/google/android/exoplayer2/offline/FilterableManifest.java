package com.google.android.exoplayer2.offline;

import java.util.List;

public abstract interface FilterableManifest<T>
{
  public abstract T copy(List<StreamKey> paramList);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.FilterableManifest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */