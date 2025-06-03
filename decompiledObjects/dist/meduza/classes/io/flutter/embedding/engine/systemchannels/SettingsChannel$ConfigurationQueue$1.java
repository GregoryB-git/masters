package io.flutter.embedding.engine.systemchannels;

import f;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel.Reply;
import java.util.concurrent.ConcurrentLinkedQueue;

class SettingsChannel$ConfigurationQueue$1
  implements BasicMessageChannel.Reply
{
  public void reply(Object paramObject)
  {
    SettingsChannel.ConfigurationQueue.access$200(this$0).remove(val$configurationToRemove);
    if (!SettingsChannel.ConfigurationQueue.access$200(this$0).isEmpty())
    {
      paramObject = f.l("The queue becomes empty after removing config generation ");
      ((StringBuilder)paramObject).append(String.valueOf(val$configurationToRemove.generationNumber));
      Log.e("SettingsChannel", ((StringBuilder)paramObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */