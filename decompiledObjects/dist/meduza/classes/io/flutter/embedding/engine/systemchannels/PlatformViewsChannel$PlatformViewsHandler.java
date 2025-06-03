package io.flutter.embedding.engine.systemchannels;

public abstract interface PlatformViewsChannel$PlatformViewsHandler
{
  public static final long NON_TEXTURE_FALLBACK = -2L;
  
  public abstract void clearFocus(int paramInt);
  
  public abstract void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest);
  
  public abstract long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest);
  
  public abstract void dispose(int paramInt);
  
  public abstract void offset(int paramInt, double paramDouble1, double paramDouble2);
  
  public abstract void onTouch(PlatformViewsChannel.PlatformViewTouch paramPlatformViewTouch);
  
  public abstract void resize(PlatformViewsChannel.PlatformViewResizeRequest paramPlatformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized paramPlatformViewBufferResized);
  
  public abstract void setDirection(int paramInt1, int paramInt2);
  
  public abstract void synchronizeToNativeViewHierarchy(boolean paramBoolean);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */