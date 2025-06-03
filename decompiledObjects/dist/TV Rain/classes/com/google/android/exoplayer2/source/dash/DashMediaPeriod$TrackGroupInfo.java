package com.google.android.exoplayer2.source.dash;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

final class DashMediaPeriod$TrackGroupInfo
{
  private static final int CATEGORY_EMBEDDED = 1;
  private static final int CATEGORY_MANIFEST_EVENTS = 2;
  private static final int CATEGORY_PRIMARY = 0;
  public final int[] adaptationSetIndices;
  public final int embeddedCea608TrackGroupIndex;
  public final int embeddedEventMessageTrackGroupIndex;
  public final int eventStreamGroupIndex;
  public final int primaryTrackGroupIndex;
  public final int trackGroupCategory;
  public final int trackType;
  
  private DashMediaPeriod$TrackGroupInfo(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    trackType = paramInt1;
    adaptationSetIndices = paramArrayOfInt;
    trackGroupCategory = paramInt2;
    primaryTrackGroupIndex = paramInt3;
    embeddedEventMessageTrackGroupIndex = paramInt4;
    embeddedCea608TrackGroupIndex = paramInt5;
    eventStreamGroupIndex = paramInt6;
  }
  
  public static TrackGroupInfo embeddedCea608Track(int[] paramArrayOfInt, int paramInt)
  {
    return new TrackGroupInfo(3, 1, paramArrayOfInt, paramInt, -1, -1, -1);
  }
  
  public static TrackGroupInfo embeddedEmsgTrack(int[] paramArrayOfInt, int paramInt)
  {
    return new TrackGroupInfo(4, 1, paramArrayOfInt, paramInt, -1, -1, -1);
  }
  
  public static TrackGroupInfo mpdEventTrack(int paramInt)
  {
    return new TrackGroupInfo(4, 2, null, -1, -1, -1, paramInt);
  }
  
  public static TrackGroupInfo primaryTrack(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
  {
    return new TrackGroupInfo(paramInt1, 0, paramArrayOfInt, paramInt2, paramInt3, paramInt4, -1);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface TrackGroupCategory {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashMediaPeriod.TrackGroupInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */