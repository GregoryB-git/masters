package com.devbrackets.android.exomedia.core.exoplayer;

import androidx.annotation.Size;

class ExoMediaPlayer$StateStore
{
  public static final int FLAG_PLAY_WHEN_READY = -268435456;
  public static final int STATE_SEEKING = 100;
  private int[] prevStates = { 1, 1, 1, 1 };
  
  public int getMostRecentState()
  {
    return prevStates[3];
  }
  
  public int getState(boolean paramBoolean, int paramInt)
  {
    int i;
    if (paramBoolean) {
      i = -268435456;
    } else {
      i = 0;
    }
    return i | paramInt;
  }
  
  public boolean isLastReportedPlayWhenReady()
  {
    boolean bool;
    if ((prevStates[3] & 0xF0000000) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean matchesHistory(@Size(max=4L, min=1L) int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 268435455;
    } else {
      i = -1;
    }
    int j = prevStates.length - paramArrayOfInt.length;
    int k = j;
    paramBoolean = true;
    for (;;)
    {
      int[] arrayOfInt = prevStates;
      if (k >= arrayOfInt.length) {
        break;
      }
      boolean bool;
      if ((arrayOfInt[k] & i) == (paramArrayOfInt[(k - j)] & i)) {
        bool = true;
      } else {
        bool = false;
      }
      paramBoolean &= bool;
      k++;
    }
    return paramBoolean;
  }
  
  public void reset()
  {
    for (int i = 0;; i++)
    {
      int[] arrayOfInt = prevStates;
      if (i >= arrayOfInt.length) {
        break;
      }
      arrayOfInt[i] = 1;
    }
  }
  
  public void setMostRecentState(boolean paramBoolean, int paramInt)
  {
    int i = getState(paramBoolean, paramInt);
    int[] arrayOfInt = prevStates;
    int j = arrayOfInt[3];
    if (j == i) {
      return;
    }
    arrayOfInt[0] = arrayOfInt[1];
    arrayOfInt[1] = arrayOfInt[2];
    arrayOfInt[2] = j;
    arrayOfInt[3] = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer.StateStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */