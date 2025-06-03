package io.flutter.plugin.platform;

import io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay;
import java.util.List;

class PlatformPlugin$1
  implements PlatformChannel.PlatformMessageHandler
{
  public PlatformPlugin$1(PlatformPlugin paramPlatformPlugin) {}
  
  public boolean clipboardHasStrings()
  {
    return PlatformPlugin.access$1200(this$0);
  }
  
  public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat paramClipboardContentFormat)
  {
    return PlatformPlugin.access$1000(this$0, paramClipboardContentFormat);
  }
  
  public void playSystemSound(PlatformChannel.SoundType paramSoundType)
  {
    PlatformPlugin.access$000(this$0, paramSoundType);
  }
  
  public void popSystemNavigator()
  {
    PlatformPlugin.access$900(this$0);
  }
  
  public void restoreSystemUiOverlays()
  {
    PlatformPlugin.access$600(this$0);
  }
  
  public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription paramAppSwitcherDescription)
  {
    PlatformPlugin.access$200(this$0, paramAppSwitcherDescription);
  }
  
  public void setClipboardData(String paramString)
  {
    PlatformPlugin.access$1100(this$0, paramString);
  }
  
  public void setFrameworkHandlesBack(boolean paramBoolean)
  {
    PlatformPlugin.access$800(this$0, paramBoolean);
  }
  
  public void setPreferredOrientations(int paramInt)
  {
    PlatformPlugin.access$100(this$0, paramInt);
  }
  
  public void setSystemUiChangeListener()
  {
    PlatformPlugin.access$500(this$0);
  }
  
  public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle paramSystemChromeStyle)
  {
    PlatformPlugin.access$700(this$0, paramSystemChromeStyle);
  }
  
  public void share(String paramString)
  {
    PlatformPlugin.access$1300(this$0, paramString);
  }
  
  public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> paramList)
  {
    PlatformPlugin.access$300(this$0, paramList);
  }
  
  public void showSystemUiMode(PlatformChannel.SystemUiMode paramSystemUiMode)
  {
    PlatformPlugin.access$400(this$0, paramSystemUiMode);
  }
  
  public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType paramHapticFeedbackType)
  {
    this$0.vibrateHapticFeedback(paramHapticFeedbackType);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformPlugin.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */