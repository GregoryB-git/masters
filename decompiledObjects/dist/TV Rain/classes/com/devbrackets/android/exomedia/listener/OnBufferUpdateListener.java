package com.devbrackets.android.exomedia.listener;

import androidx.annotation.IntRange;

public abstract interface OnBufferUpdateListener
{
  public abstract void onBufferingUpdate(@IntRange(from=0L, to=100L) int paramInt);
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.listener.OnBufferUpdateListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */