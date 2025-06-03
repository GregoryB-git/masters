package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.Format;

public abstract interface VideoFrameMetadataListener
{
  public abstract void onVideoFrameAboutToBeRendered(long paramLong1, long paramLong2, Format paramFormat);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.VideoFrameMetadataListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */