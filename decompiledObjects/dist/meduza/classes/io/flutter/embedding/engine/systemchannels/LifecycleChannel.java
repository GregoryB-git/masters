package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;
import java.util.Locale;

public class LifecycleChannel
{
  private static final String CHANNEL_NAME = "flutter/lifecycle";
  private static final String TAG = "LifecycleChannel";
  private final BasicMessageChannel<String> channel;
  private AppLifecycleState lastAndroidState = null;
  private AppLifecycleState lastFlutterState = null;
  private boolean lastFocus = true;
  
  public LifecycleChannel(DartExecutor paramDartExecutor)
  {
    this(new BasicMessageChannel(paramDartExecutor, "flutter/lifecycle", StringCodec.INSTANCE));
  }
  
  public LifecycleChannel(BasicMessageChannel<String> paramBasicMessageChannel)
  {
    channel = paramBasicMessageChannel;
  }
  
  private void sendState(AppLifecycleState paramAppLifecycleState, boolean paramBoolean)
  {
    AppLifecycleState localAppLifecycleState = lastAndroidState;
    if ((localAppLifecycleState == paramAppLifecycleState) && (paramBoolean == lastFocus)) {
      return;
    }
    if ((paramAppLifecycleState == null) && (localAppLifecycleState == null))
    {
      lastFocus = paramBoolean;
      return;
    }
    localAppLifecycleState = null;
    int i = 1.$SwitchMap$io$flutter$embedding$engine$systemchannels$LifecycleChannel$AppLifecycleState[paramAppLifecycleState.ordinal()];
    if (i != 1)
    {
      if ((i == 2) || (i == 3) || (i == 4) || (i == 5)) {
        localAppLifecycleState = paramAppLifecycleState;
      }
    }
    else if (paramBoolean) {
      localAppLifecycleState = AppLifecycleState.RESUMED;
    } else {
      localAppLifecycleState = AppLifecycleState.INACTIVE;
    }
    lastAndroidState = paramAppLifecycleState;
    lastFocus = paramBoolean;
    if (localAppLifecycleState == lastFlutterState) {
      return;
    }
    paramAppLifecycleState = f.l("AppLifecycleState.");
    paramAppLifecycleState.append(localAppLifecycleState.name().toLowerCase(Locale.ROOT));
    paramAppLifecycleState = paramAppLifecycleState.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Sending ");
    localStringBuilder.append(paramAppLifecycleState);
    localStringBuilder.append(" message.");
    Log.v("LifecycleChannel", localStringBuilder.toString());
    channel.send(paramAppLifecycleState);
    lastFlutterState = localAppLifecycleState;
  }
  
  public void aWindowIsFocused()
  {
    sendState(lastAndroidState, true);
  }
  
  public void appIsDetached()
  {
    sendState(AppLifecycleState.DETACHED, lastFocus);
  }
  
  public void appIsInactive()
  {
    sendState(AppLifecycleState.INACTIVE, lastFocus);
  }
  
  public void appIsPaused()
  {
    sendState(AppLifecycleState.PAUSED, lastFocus);
  }
  
  public void appIsResumed()
  {
    sendState(AppLifecycleState.RESUMED, lastFocus);
  }
  
  public void noWindowsAreFocused()
  {
    sendState(lastAndroidState, false);
  }
  
  public static enum AppLifecycleState
  {
    static
    {
      INACTIVE = new AppLifecycleState("INACTIVE", 2);
      HIDDEN = new AppLifecycleState("HIDDEN", 3);
      PAUSED = new AppLifecycleState("PAUSED", 4);
    }
    
    private AppLifecycleState() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.LifecycleChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */