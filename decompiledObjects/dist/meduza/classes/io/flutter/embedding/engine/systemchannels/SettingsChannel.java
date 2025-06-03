package io.flutter.embedding.engine.systemchannels;

import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SettingsChannel
{
  private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
  private static final String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
  public static final String CHANNEL_NAME = "flutter/settings";
  private static final String CONFIGURATION_ID = "configurationId";
  private static final ConfigurationQueue CONFIGURATION_QUEUE = new ConfigurationQueue();
  private static final String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
  private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
  private static final String TAG = "SettingsChannel";
  private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
  public final BasicMessageChannel<Object> channel;
  
  public SettingsChannel(DartExecutor paramDartExecutor)
  {
    channel = new BasicMessageChannel(paramDartExecutor, "flutter/settings", JSONMessageCodec.INSTANCE);
  }
  
  public static DisplayMetrics getPastDisplayMetrics(int paramInt)
  {
    Object localObject = CONFIGURATION_QUEUE.getConfiguration(paramInt);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = SettingsChannel.ConfigurationQueue.SentConfiguration.access$000((SettingsChannel.ConfigurationQueue.SentConfiguration)localObject);
    }
    return (DisplayMetrics)localObject;
  }
  
  public static boolean hasNonlinearTextScalingSupport()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 34) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public MessageBuilder startMessage()
  {
    return new MessageBuilder(channel);
  }
  
  public static class ConfigurationQueue
  {
    private SentConfiguration currentConfiguration;
    private SentConfiguration previousEnqueuedConfiguration;
    private final ConcurrentLinkedQueue<SentConfiguration> sentQueue = new ConcurrentLinkedQueue();
    
    public BasicMessageChannel.Reply enqueueConfiguration(SentConfiguration paramSentConfiguration)
    {
      sentQueue.add(paramSentConfiguration);
      final SentConfiguration localSentConfiguration = previousEnqueuedConfiguration;
      previousEnqueuedConfiguration = paramSentConfiguration;
      if (localSentConfiguration == null) {
        paramSentConfiguration = null;
      } else {
        paramSentConfiguration = new BasicMessageChannel.Reply()
        {
          public void reply(Object paramAnonymousObject)
          {
            SettingsChannel.ConfigurationQueue.access$200(this$0).remove(localSentConfiguration);
            if (!SettingsChannel.ConfigurationQueue.access$200(this$0).isEmpty())
            {
              paramAnonymousObject = f.l("The queue becomes empty after removing config generation ");
              ((StringBuilder)paramAnonymousObject).append(String.valueOf(localSentConfigurationgenerationNumber));
              Log.e("SettingsChannel", ((StringBuilder)paramAnonymousObject).toString());
            }
          }
        };
      }
      return paramSentConfiguration;
    }
    
    public SentConfiguration getConfiguration(int paramInt)
    {
      Object localObject1;
      if (currentConfiguration == null) {
        localObject1 = this;
      } else {
        localObject1 = this;
      }
      Object localObject2;
      for (;;)
      {
        localObject2 = currentConfiguration;
        if ((localObject2 == null) || (generationNumber >= paramInt)) {
          break;
        }
        currentConfiguration = ((SentConfiguration)sentQueue.poll());
      }
      if (localObject2 == null)
      {
        localObject1 = f.l("Cannot find config with generation: ");
        ((StringBuilder)localObject1).append(String.valueOf(paramInt));
        localObject2 = ", after exhausting the queue.";
      }
      else
      {
        if (generationNumber == paramInt) {
          return localObject2;
        }
        StringBuilder localStringBuilder = f.l("Cannot find config with generation: ");
        localStringBuilder.append(String.valueOf(paramInt));
        localStringBuilder.append(", the oldest config is now: ");
        localObject2 = String.valueOf(currentConfiguration.generationNumber);
        localObject1 = localStringBuilder;
      }
      ((StringBuilder)localObject1).append((String)localObject2);
      Log.e("SettingsChannel", ((StringBuilder)localObject1).toString());
      return null;
      return (SentConfiguration)localObject2;
    }
    
    public static class SentConfiguration
    {
      private static int nextConfigGeneration = Integer.MIN_VALUE;
      private final DisplayMetrics displayMetrics;
      public final int generationNumber;
      
      public SentConfiguration(DisplayMetrics paramDisplayMetrics)
      {
        int i = nextConfigGeneration;
        nextConfigGeneration = i + 1;
        generationNumber = i;
        displayMetrics = paramDisplayMetrics;
      }
    }
  }
  
  public static class MessageBuilder
  {
    private final BasicMessageChannel<Object> channel;
    private DisplayMetrics displayMetrics;
    private Map<String, Object> message = new HashMap();
    
    public MessageBuilder(BasicMessageChannel<Object> paramBasicMessageChannel)
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
  
  public static enum PlatformBrightness
  {
    public String name;
    
    static
    {
      dark = new PlatformBrightness("dark", 1, "dark");
    }
    
    private PlatformBrightness(String paramString)
    {
      name = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */