package io.flutter.embedding.engine.systemchannels;

import java.util.List;

public abstract interface PlatformChannel$PlatformMessageHandler
{
  public abstract boolean clipboardHasStrings();
  
  public abstract CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat paramClipboardContentFormat);
  
  public abstract void playSystemSound(PlatformChannel.SoundType paramSoundType);
  
  public abstract void popSystemNavigator();
  
  public abstract void restoreSystemUiOverlays();
  
  public abstract void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription paramAppSwitcherDescription);
  
  public abstract void setClipboardData(String paramString);
  
  public abstract void setFrameworkHandlesBack(boolean paramBoolean);
  
  public abstract void setPreferredOrientations(int paramInt);
  
  public abstract void setSystemUiChangeListener();
  
  public abstract void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle paramSystemChromeStyle);
  
  public abstract void share(String paramString);
  
  public abstract void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> paramList);
  
  public abstract void showSystemUiMode(PlatformChannel.SystemUiMode paramSystemUiMode);
  
  public abstract void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType paramHapticFeedbackType);
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */