package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public abstract interface Loader$Callback<T extends Loader.Loadable>
{
  public abstract void onLoadCanceled(T paramT, long paramLong1, long paramLong2, boolean paramBoolean);
  
  public abstract void onLoadCompleted(T paramT, long paramLong1, long paramLong2);
  
  public abstract Loader.LoadErrorAction onLoadError(T paramT, long paramLong1, long paramLong2, IOException paramIOException, int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.Loader.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */