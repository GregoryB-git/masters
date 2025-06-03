package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;

final class ConcatenatingMediaSource$MessageData<T>
{
  @Nullable
  public final Runnable actionOnCompletion;
  public final T customData;
  public final int index;
  
  public ConcatenatingMediaSource$MessageData(int paramInt, T paramT, @Nullable Runnable paramRunnable)
  {
    index = paramInt;
    actionOnCompletion = paramRunnable;
    customData = paramT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.MessageData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */