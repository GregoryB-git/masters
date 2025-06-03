package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

public final class AudioCapabilitiesReceiver
{
  @Nullable
  public AudioCapabilities audioCapabilities;
  private final Context context;
  @Nullable
  private final Handler handler;
  private final Listener listener;
  @Nullable
  private final BroadcastReceiver receiver;
  
  public AudioCapabilitiesReceiver(Context paramContext, @Nullable Handler paramHandler, Listener paramListener)
  {
    context = ((Context)Assertions.checkNotNull(paramContext));
    handler = paramHandler;
    listener = ((Listener)Assertions.checkNotNull(paramListener));
    int i = Util.SDK_INT;
    paramContext = null;
    if (i >= 21) {
      paramContext = new HdmiAudioPlugBroadcastReceiver(null);
    }
    receiver = paramContext;
  }
  
  public AudioCapabilitiesReceiver(Context paramContext, Listener paramListener)
  {
    this(paramContext, null, paramListener);
  }
  
  public AudioCapabilities register()
  {
    Object localObject1 = receiver;
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject1 = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
      localObject2 = handler;
      if (localObject2 != null) {
        localObject2 = context.registerReceiver(receiver, (IntentFilter)localObject1, null, (Handler)localObject2);
      } else {
        localObject2 = context.registerReceiver(receiver, (IntentFilter)localObject1);
      }
    }
    localObject2 = AudioCapabilities.getCapabilities((Intent)localObject2);
    audioCapabilities = ((AudioCapabilities)localObject2);
    return (AudioCapabilities)localObject2;
  }
  
  public void unregister()
  {
    BroadcastReceiver localBroadcastReceiver = receiver;
    if (localBroadcastReceiver != null) {
      context.unregisterReceiver(localBroadcastReceiver);
    }
  }
  
  public final class HdmiAudioPlugBroadcastReceiver
    extends BroadcastReceiver
  {
    private HdmiAudioPlugBroadcastReceiver() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if (!isInitialStickyBroadcast())
      {
        paramContext = AudioCapabilities.getCapabilities(paramIntent);
        if (!paramContext.equals(audioCapabilities))
        {
          paramIntent = AudioCapabilitiesReceiver.this;
          audioCapabilities = paramContext;
          AudioCapabilitiesReceiver.access$100(paramIntent).onAudioCapabilitiesChanged(paramContext);
        }
      }
    }
  }
  
  public static abstract interface Listener
  {
    public abstract void onAudioCapabilitiesChanged(AudioCapabilities paramAudioCapabilities);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioCapabilitiesReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */