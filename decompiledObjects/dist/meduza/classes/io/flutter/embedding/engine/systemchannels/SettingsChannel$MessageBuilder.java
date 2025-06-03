package io.flutter.embedding.engine.systemchannels;

import android.util.DisplayMetrics;
import f;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.HashMap;
import java.util.Map;

public class SettingsChannel$MessageBuilder
{
  private final BasicMessageChannel<Object> channel;
  private DisplayMetrics displayMetrics;
  private Map<String, Object> message = new HashMap();
  
  public SettingsChannel$MessageBuilder(BasicMessageChannel<Object> paramBasicMessageChannel)
  {
    channel = paramBasicMessageChannel;
  }
  
  public void send()
  {
    Object localObject = f.l("Sending message: \ntextScaleFactor: ");
    ((StringBuilder)localObject).append(message.get("textScaleFactor"));
    ((StringBuilder)localObject).append("\nalwaysUse24HourFormat: ");
    ((StringBuilder)localObject).append(message.get("alwaysUse24HourFormat"));
    ((StringBuilder)localObject).append("\nplatformBrightness: ");
    ((StringBuilder)localObject).append(message.get("platformBrightness"));
    Log.v("SettingsChannel", ((StringBuilder)localObject).toString());
    localObject = displayMetrics;
    if ((SettingsChannel.hasNonlinearTextScalingSupport()) && (localObject != null))
    {
      SettingsChannel.ConfigurationQueue.SentConfiguration localSentConfiguration = new SettingsChannel.ConfigurationQueue.SentConfiguration((DisplayMetrics)localObject);
      localObject = SettingsChannel.access$100().enqueueConfiguration(localSentConfiguration);
      message.put("configurationId", Integer.valueOf(generationNumber));
      channel.send(message, (BasicMessageChannel.Reply)localObject);
      return;
    }
    channel.send(message);
  }
  
  public MessageBuilder setBrieflyShowPassword(boolean paramBoolean)
  {
    message.put("brieflyShowPassword", Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public MessageBuilder setDisplayMetrics(DisplayMetrics paramDisplayMetrics)
  {
    displayMetrics = paramDisplayMetrics;
    return this;
  }
  
  public MessageBuilder setNativeSpellCheckServiceDefined(boolean paramBoolean)
  {
    message.put("nativeSpellCheckServiceDefined", Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public MessageBuilder setPlatformBrightness(SettingsChannel.PlatformBrightness paramPlatformBrightness)
  {
    message.put("platformBrightness", name);
    return this;
  }
  
  public MessageBuilder setTextScaleFactor(float paramFloat)
  {
    message.put("textScaleFactor", Float.valueOf(paramFloat));
    return this;
  }
  
  public MessageBuilder setUse24HourFormat(boolean paramBoolean)
  {
    message.put("alwaysUse24HourFormat", Boolean.valueOf(paramBoolean));
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */