package io.flutter.embedding.engine.systemchannels;

import java.nio.ByteBuffer;

public class PlatformViewsChannel$PlatformViewCreationRequest
{
  public final int direction;
  public final RequestedDisplayMode displayMode;
  public final double logicalHeight;
  public final double logicalLeft;
  public final double logicalTop;
  public final double logicalWidth;
  public final ByteBuffer params;
  public final int viewId;
  public final String viewType;
  
  public PlatformViewsChannel$PlatformViewCreationRequest(int paramInt1, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, RequestedDisplayMode paramRequestedDisplayMode, ByteBuffer paramByteBuffer)
  {
    viewId = paramInt1;
    viewType = paramString;
    logicalTop = paramDouble1;
    logicalLeft = paramDouble2;
    logicalWidth = paramDouble3;
    logicalHeight = paramDouble4;
    direction = paramInt2;
    displayMode = paramRequestedDisplayMode;
    params = paramByteBuffer;
  }
  
  public PlatformViewsChannel$PlatformViewCreationRequest(int paramInt1, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, ByteBuffer paramByteBuffer)
  {
    this(paramInt1, paramString, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramInt2, RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, paramByteBuffer);
  }
  
  public static enum RequestedDisplayMode
  {
    static
    {
      TEXTURE_WITH_HYBRID_FALLBACK = new RequestedDisplayMode("TEXTURE_WITH_HYBRID_FALLBACK", 1);
      HYBRID_ONLY = new RequestedDisplayMode("HYBRID_ONLY", 2);
    }
    
    private RequestedDisplayMode() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */