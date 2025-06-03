package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l5;
import z2;

public final class AudioFocusManager
{
  private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
  private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
  private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
  private static final int AUDIO_FOCUS_STATE_LOST_FOCUS = -1;
  private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
  public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
  public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
  public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
  private static final String TAG = "AudioFocusManager";
  private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0F;
  private static final float VOLUME_MULTIPLIER_DUCK = 0.2F;
  @Nullable
  private AudioAttributes audioAttributes;
  private AudioFocusRequest audioFocusRequest;
  private int audioFocusState;
  @Nullable
  private final AudioManager audioManager;
  private int focusGain;
  private final AudioFocusListener focusListener;
  private final PlayerControl playerControl;
  private boolean rebuildAudioFocusRequest;
  private float volumeMultiplier = 1.0F;
  
  public AudioFocusManager(@Nullable Context paramContext, PlayerControl paramPlayerControl)
  {
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = (AudioManager)paramContext.getApplicationContext().getSystemService("audio");
    }
    audioManager = paramContext;
    playerControl = paramPlayerControl;
    focusListener = new AudioFocusListener(null);
    audioFocusState = 0;
  }
  
  private void abandonAudioFocus()
  {
    abandonAudioFocus(false);
  }
  
  private void abandonAudioFocus(boolean paramBoolean)
  {
    int i = focusGain;
    if ((i == 0) && (audioFocusState == 0)) {
      return;
    }
    if ((i != 1) || (audioFocusState == -1) || (paramBoolean))
    {
      if (Util.SDK_INT >= 26) {
        abandonAudioFocusV26();
      } else {
        abandonAudioFocusDefault();
      }
      audioFocusState = 0;
    }
  }
  
  private void abandonAudioFocusDefault()
  {
    ((AudioManager)Assertions.checkNotNull(audioManager)).abandonAudioFocus(focusListener);
  }
  
  @RequiresApi(26)
  private void abandonAudioFocusV26()
  {
    if (audioFocusRequest != null) {
      l5.e((AudioManager)Assertions.checkNotNull(audioManager), audioFocusRequest);
    }
  }
  
  private static int convertAudioAttributesToFocusGain(@Nullable AudioAttributes paramAudioAttributes)
  {
    if (paramAudioAttributes == null) {
      return 0;
    }
    switch (usage)
    {
    case 15: 
    default: 
      StringBuilder localStringBuilder = z2.t("Unidentified audio usage: ");
      localStringBuilder.append(usage);
      Log.w("AudioFocusManager", localStringBuilder.toString());
      return 0;
    case 16: 
      if (Util.SDK_INT >= 19) {
        return 4;
      }
      return 2;
    case 11: 
      if (contentType == 1) {
        return 2;
      }
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
      return 3;
    case 3: 
      return 0;
    case 2: 
    case 4: 
      return 2;
    case 1: 
    case 14: 
      return 1;
    }
    Log.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
    return 1;
  }
  
  private int handleIdle(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    }
    return i;
  }
  
  private int requestAudioFocus()
  {
    int i = focusGain;
    int j = 1;
    if (i == 0)
    {
      if (audioFocusState != 0) {
        abandonAudioFocus(true);
      }
      return 1;
    }
    if (audioFocusState == 0)
    {
      if (Util.SDK_INT >= 26) {
        i = requestAudioFocusV26();
      } else {
        i = requestAudioFocusDefault();
      }
      if (i == 1) {
        i = 1;
      } else {
        i = 0;
      }
      audioFocusState = i;
    }
    int k = audioFocusState;
    if (k == 0) {
      return -1;
    }
    i = j;
    if (k == 2) {
      i = 0;
    }
    return i;
  }
  
  private int requestAudioFocusDefault()
  {
    return ((AudioManager)Assertions.checkNotNull(audioManager)).requestAudioFocus(focusListener, Util.getStreamTypeForAudioUsage(checkNotNullaudioAttributes)).usage), focusGain);
  }
  
  @RequiresApi(26)
  private int requestAudioFocusV26()
  {
    Object localObject = audioFocusRequest;
    if ((localObject == null) || (rebuildAudioFocusRequest))
    {
      if (localObject == null) {
        localObject = new AudioFocusRequest.Builder(focusGain);
      } else {
        localObject = new AudioFocusRequest.Builder(audioFocusRequest);
      }
      boolean bool = willPauseWhenDucked();
      audioFocusRequest = ((AudioFocusRequest.Builder)localObject).setAudioAttributes(((AudioAttributes)Assertions.checkNotNull(audioAttributes)).getAudioAttributesV21()).setWillPauseWhenDucked(bool).setOnAudioFocusChangeListener(focusListener).build();
      rebuildAudioFocusRequest = false;
    }
    return ((AudioManager)Assertions.checkNotNull(audioManager)).requestAudioFocus(audioFocusRequest);
  }
  
  private boolean willPauseWhenDucked()
  {
    AudioAttributes localAudioAttributes = audioAttributes;
    boolean bool = true;
    if ((localAudioAttributes == null) || (contentType != 1)) {
      bool = false;
    }
    return bool;
  }
  
  public float getVolumeMultiplier()
  {
    return volumeMultiplier;
  }
  
  public int handlePrepare(boolean paramBoolean)
  {
    if (audioManager == null) {
      return 1;
    }
    int i;
    if (paramBoolean) {
      i = requestAudioFocus();
    } else {
      i = -1;
    }
    return i;
  }
  
  public int handleSetPlayWhenReady(boolean paramBoolean, int paramInt)
  {
    if (audioManager == null) {
      return 1;
    }
    if (!paramBoolean)
    {
      abandonAudioFocus();
      return -1;
    }
    if (paramInt == 1) {
      paramInt = handleIdle(paramBoolean);
    } else {
      paramInt = requestAudioFocus();
    }
    return paramInt;
  }
  
  public void handleStop()
  {
    if (audioManager == null) {
      return;
    }
    abandonAudioFocus(true);
  }
  
  public int setAudioAttributes(@Nullable AudioAttributes paramAudioAttributes, boolean paramBoolean, int paramInt)
  {
    AudioAttributes localAudioAttributes = audioAttributes;
    int i = 1;
    if ((localAudioAttributes == null) && (paramAudioAttributes == null))
    {
      if (paramBoolean) {
        paramInt = i;
      } else {
        paramInt = -1;
      }
      return paramInt;
    }
    Assertions.checkNotNull(audioManager, "SimpleExoPlayer must be created with a context to handle audio focus.");
    if (!Util.areEqual(audioAttributes, paramAudioAttributes))
    {
      audioAttributes = paramAudioAttributes;
      i = convertAudioAttributesToFocusGain(paramAudioAttributes);
      focusGain = i;
      boolean bool;
      if ((i != 1) && (i != 0)) {
        bool = false;
      } else {
        bool = true;
      }
      Assertions.checkArgument(bool, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
      if ((paramBoolean) && ((paramInt == 2) || (paramInt == 3))) {
        return requestAudioFocus();
      }
    }
    if (paramInt == 1) {
      paramInt = handleIdle(paramBoolean);
    } else {
      paramInt = handlePrepare(paramBoolean);
    }
    return paramInt;
  }
  
  public class AudioFocusListener
    implements AudioManager.OnAudioFocusChangeListener
  {
    private AudioFocusListener() {}
    
    public void onAudioFocusChange(int paramInt)
    {
      StringBuilder localStringBuilder;
      if (paramInt != -3)
      {
        if (paramInt != -2)
        {
          if (paramInt != -1)
          {
            if (paramInt != 1)
            {
              localStringBuilder = new StringBuilder();
              localStringBuilder.append("Unknown focus change type: ");
              localStringBuilder.append(paramInt);
              Log.w("AudioFocusManager", localStringBuilder.toString());
              return;
            }
            AudioFocusManager.access$102(AudioFocusManager.this, 1);
          }
          else
          {
            AudioFocusManager.access$102(AudioFocusManager.this, -1);
          }
        }
        else {
          AudioFocusManager.access$102(AudioFocusManager.this, 2);
        }
      }
      else if (AudioFocusManager.access$200(AudioFocusManager.this)) {
        AudioFocusManager.access$102(AudioFocusManager.this, 2);
      } else {
        AudioFocusManager.access$102(AudioFocusManager.this, 3);
      }
      paramInt = AudioFocusManager.access$100(AudioFocusManager.this);
      if (paramInt != -1)
      {
        if (paramInt != 0) {
          if (paramInt != 1)
          {
            if (paramInt != 2)
            {
              if (paramInt != 3)
              {
                localStringBuilder = z2.t("Unknown audio focus state: ");
                localStringBuilder.append(AudioFocusManager.access$100(AudioFocusManager.this));
                throw new IllegalStateException(localStringBuilder.toString());
              }
            }
            else {
              AudioFocusManager.access$300(AudioFocusManager.this).executePlayerCommand(0);
            }
          }
          else {
            AudioFocusManager.access$300(AudioFocusManager.this).executePlayerCommand(1);
          }
        }
      }
      else
      {
        AudioFocusManager.access$300(AudioFocusManager.this).executePlayerCommand(-1);
        AudioFocusManager.access$400(AudioFocusManager.this, true);
      }
      float f;
      if (AudioFocusManager.access$100(AudioFocusManager.this) == 3) {
        f = 0.2F;
      } else {
        f = 1.0F;
      }
      if (AudioFocusManager.access$500(AudioFocusManager.this) != f)
      {
        AudioFocusManager.access$502(AudioFocusManager.this, f);
        AudioFocusManager.access$300(AudioFocusManager.this).setVolumeMultiplier(f);
      }
    }
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface PlayerCommand {}
  
  public static abstract interface PlayerControl
  {
    public abstract void executePlayerCommand(int paramInt);
    
    public abstract void setVolumeMultiplier(float paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.AudioFocusManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */