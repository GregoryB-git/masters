package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate;

public abstract interface AccessibilityChannel$AccessibilityMessageHandler
  extends FlutterJNI.AccessibilityDelegate
{
  public abstract void announce(String paramString);
  
  public abstract void onFocus(int paramInt);
  
  public abstract void onLongPress(int paramInt);
  
  public abstract void onTap(int paramInt);
  
  public abstract void onTooltip(String paramString);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */