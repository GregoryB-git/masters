package com.devbrackets.android.exomedia.core.exoplayer;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Timeline.Window;

public class WindowInfo
{
  @NonNull
  public final Timeline.Window currentWindow;
  public final int currentWindowIndex;
  public final int nextWindowIndex;
  public final int previousWindowIndex;
  
  public WindowInfo(int paramInt1, int paramInt2, int paramInt3, @NonNull Timeline.Window paramWindow)
  {
    previousWindowIndex = paramInt1;
    currentWindowIndex = paramInt2;
    nextWindowIndex = paramInt3;
    currentWindow = paramWindow;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.WindowInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */