package com.google.android.exoplayer2.audio;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Ac3Util$SyncFrameInfo
{
  public static final int STREAM_TYPE_TYPE0 = 0;
  public static final int STREAM_TYPE_TYPE1 = 1;
  public static final int STREAM_TYPE_TYPE2 = 2;
  public static final int STREAM_TYPE_UNDEFINED = -1;
  public final int channelCount;
  public final int frameSize;
  public final String mimeType;
  public final int sampleCount;
  public final int sampleRate;
  public final int streamType;
  
  private Ac3Util$SyncFrameInfo(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    mimeType = paramString;
    streamType = paramInt1;
    channelCount = paramInt2;
    sampleRate = paramInt3;
    frameSize = paramInt4;
    sampleCount = paramInt5;
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface StreamType {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.Ac3Util.SyncFrameInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */