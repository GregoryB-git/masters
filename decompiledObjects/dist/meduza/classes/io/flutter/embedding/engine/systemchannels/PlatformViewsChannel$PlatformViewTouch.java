package io.flutter.embedding.engine.systemchannels;

public class PlatformViewsChannel$PlatformViewTouch
{
  public final int action;
  public final int buttonState;
  public final int deviceId;
  public final Number downTime;
  public final int edgeFlags;
  public final Number eventTime;
  public final int flags;
  public final int metaState;
  public final long motionEventId;
  public final int pointerCount;
  public final Object rawPointerCoords;
  public final Object rawPointerPropertiesList;
  public final int source;
  public final int viewId;
  public final float xPrecision;
  public final float yPrecision;
  
  public PlatformViewsChannel$PlatformViewTouch(int paramInt1, Number paramNumber1, Number paramNumber2, int paramInt2, int paramInt3, Object paramObject1, Object paramObject2, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong)
  {
    viewId = paramInt1;
    downTime = paramNumber1;
    eventTime = paramNumber2;
    action = paramInt2;
    pointerCount = paramInt3;
    rawPointerPropertiesList = paramObject1;
    rawPointerCoords = paramObject2;
    metaState = paramInt4;
    buttonState = paramInt5;
    xPrecision = paramFloat1;
    yPrecision = paramFloat2;
    deviceId = paramInt6;
    edgeFlags = paramInt7;
    source = paramInt8;
    flags = paramInt9;
    motionEventId = paramLong;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */