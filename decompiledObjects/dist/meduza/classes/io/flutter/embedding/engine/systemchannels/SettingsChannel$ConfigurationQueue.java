package io.flutter.embedding.engine.systemchannels;

import android.util.DisplayMetrics;
import f;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SettingsChannel$ConfigurationQueue
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

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */