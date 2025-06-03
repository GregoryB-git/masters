package com.google.android.exoplayer2.video;

public abstract interface VideoListener
{
  public void onRenderedFirstFrame() {}
  
  public void onSurfaceSizeChanged(int paramInt1, int paramInt2) {}
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */