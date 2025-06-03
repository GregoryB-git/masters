package androidx.media;

import a;
import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcelable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AudioAttributesCompat
  implements VersionedParcelable
{
  public static final int CONTENT_TYPE_MOVIE = 3;
  public static final int CONTENT_TYPE_MUSIC = 2;
  public static final int CONTENT_TYPE_SONIFICATION = 4;
  public static final int CONTENT_TYPE_SPEECH = 1;
  public static final int CONTENT_TYPE_UNKNOWN = 0;
  public static final int FLAG_ALL = 1023;
  public static final int FLAG_ALL_PUBLIC = 273;
  public static final int FLAG_AUDIBILITY_ENFORCED = 1;
  public static final int FLAG_BEACON = 8;
  public static final int FLAG_BYPASS_INTERRUPTION_POLICY = 64;
  public static final int FLAG_BYPASS_MUTE = 128;
  public static final int FLAG_DEEP_BUFFER = 512;
  public static final int FLAG_HW_AV_SYNC = 16;
  public static final int FLAG_HW_HOTWORD = 32;
  public static final int FLAG_LOW_LATENCY = 256;
  public static final int FLAG_SCO = 4;
  public static final int FLAG_SECURE = 2;
  public static final int INVALID_STREAM_TYPE = -1;
  private static final int[] SDK_USAGES = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16 };
  private static final int SUPPRESSIBLE_CALL = 2;
  private static final int SUPPRESSIBLE_NOTIFICATION = 1;
  private static final SparseIntArray SUPPRESSIBLE_USAGES;
  public static final String TAG = "AudioAttributesCompat";
  public static final int USAGE_ALARM = 4;
  public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
  public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
  public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
  public static final int USAGE_ASSISTANT = 16;
  public static final int USAGE_GAME = 14;
  public static final int USAGE_MEDIA = 1;
  public static final int USAGE_NOTIFICATION = 5;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
  public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
  public static final int USAGE_NOTIFICATION_EVENT = 10;
  public static final int USAGE_NOTIFICATION_RINGTONE = 6;
  public static final int USAGE_UNKNOWN = 0;
  public static final int USAGE_VIRTUAL_SOURCE = 15;
  public static final int USAGE_VOICE_COMMUNICATION = 2;
  public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
  public static boolean sForceLegacyBehavior;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributesImpl mImpl;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    SUPPRESSIBLE_USAGES = localSparseIntArray;
    localSparseIntArray.put(5, 1);
    localSparseIntArray.put(6, 2);
    localSparseIntArray.put(7, 2);
    localSparseIntArray.put(8, 1);
    localSparseIntArray.put(9, 1);
    localSparseIntArray.put(10, 1);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public AudioAttributesCompat() {}
  
  public AudioAttributesCompat(AudioAttributesImpl paramAudioAttributesImpl)
  {
    mImpl = paramAudioAttributesImpl;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static void setForceLegacyBehavior(boolean paramBoolean)
  {
    sForceLegacyBehavior = paramBoolean;
  }
  
  public static int toVolumeStreamType(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((paramInt1 & 0x1) == 1)
    {
      if (paramBoolean) {
        paramInt1 = i;
      } else {
        paramInt1 = 7;
      }
      return paramInt1;
    }
    i = 0;
    int j = 0;
    if ((paramInt1 & 0x4) == 4)
    {
      if (paramBoolean) {
        paramInt1 = j;
      } else {
        paramInt1 = 6;
      }
      return paramInt1;
    }
    paramInt1 = i;
    switch (paramInt2)
    {
    case 15: 
    default: 
      if (paramBoolean) {
        break label169;
      }
      return 3;
    case 13: 
      return 1;
    case 11: 
      return 10;
    case 6: 
      return 2;
    case 5: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      if (paramBoolean) {
        paramInt1 = i;
      } else {
        paramInt1 = 8;
      }
    case 2: 
      return paramInt1;
    }
    return 3;
    label169:
    throw new IllegalArgumentException(a.g("Unknown usage value ", paramInt2, " in audio attributes"));
  }
  
  public static String usageToString(int paramInt)
  {
    switch (paramInt)
    {
    case 15: 
    default: 
      return a.f("unknown usage ", paramInt);
    case 16: 
      return "USAGE_ASSISTANT";
    case 14: 
      return "USAGE_GAME";
    case 13: 
      return "USAGE_ASSISTANCE_SONIFICATION";
    case 12: 
      return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
    case 11: 
      return "USAGE_ASSISTANCE_ACCESSIBILITY";
    case 10: 
      return "USAGE_NOTIFICATION_EVENT";
    case 9: 
      return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
    case 8: 
      return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
    case 7: 
      return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
    case 6: 
      return "USAGE_NOTIFICATION_RINGTONE";
    case 5: 
      return "USAGE_NOTIFICATION";
    case 4: 
      return "USAGE_ALARM";
    case 3: 
      return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
    case 2: 
      return "USAGE_VOICE_COMMUNICATION";
    case 1: 
      return "USAGE_MEDIA";
    }
    return "USAGE_UNKNOWN";
  }
  
  @Nullable
  public static AudioAttributesCompat wrap(@NonNull Object paramObject)
  {
    if (sForceLegacyBehavior) {
      return null;
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes)paramObject));
    }
    return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes)paramObject));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesCompat;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AudioAttributesCompat)paramObject;
    AudioAttributesImpl localAudioAttributesImpl = mImpl;
    if (localAudioAttributesImpl == null)
    {
      if (mImpl == null) {
        bool2 = true;
      }
      return bool2;
    }
    return localAudioAttributesImpl.equals(mImpl);
  }
  
  public int getContentType()
  {
    return mImpl.getContentType();
  }
  
  public int getFlags()
  {
    return mImpl.getFlags();
  }
  
  public int getLegacyStreamType()
  {
    return mImpl.getLegacyStreamType();
  }
  
  public int getRawLegacyStreamType()
  {
    return mImpl.getRawLegacyStreamType();
  }
  
  public int getUsage()
  {
    return mImpl.getUsage();
  }
  
  public int getVolumeControlStream()
  {
    return mImpl.getVolumeControlStream();
  }
  
  public int hashCode()
  {
    return mImpl.hashCode();
  }
  
  public String toString()
  {
    return mImpl.toString();
  }
  
  @Nullable
  public Object unwrap()
  {
    return mImpl.getAudioAttributes();
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface AttributeContentType {}
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface AttributeUsage {}
  
  public static abstract class AudioManagerHidden
  {
    public static final int STREAM_ACCESSIBILITY = 10;
    public static final int STREAM_BLUETOOTH_SCO = 6;
    public static final int STREAM_SYSTEM_ENFORCED = 7;
    public static final int STREAM_TTS = 9;
  }
  
  public static class Builder
  {
    public final AudioAttributesImpl.Builder mBuilderImpl;
    
    public Builder()
    {
      if (AudioAttributesCompat.sForceLegacyBehavior) {
        mBuilderImpl = new AudioAttributesImplBase.Builder();
      } else if (Build.VERSION.SDK_INT >= 26) {
        mBuilderImpl = new AudioAttributesImplApi26.Builder();
      } else {
        mBuilderImpl = new AudioAttributesImplApi21.Builder();
      }
    }
    
    public Builder(AudioAttributesCompat paramAudioAttributesCompat)
    {
      if (AudioAttributesCompat.sForceLegacyBehavior) {
        mBuilderImpl = new AudioAttributesImplBase.Builder(paramAudioAttributesCompat);
      } else if (Build.VERSION.SDK_INT >= 26) {
        mBuilderImpl = new AudioAttributesImplApi26.Builder(paramAudioAttributesCompat.unwrap());
      } else {
        mBuilderImpl = new AudioAttributesImplApi21.Builder(paramAudioAttributesCompat.unwrap());
      }
    }
    
    public AudioAttributesCompat build()
    {
      return new AudioAttributesCompat(mBuilderImpl.build());
    }
    
    public Builder setContentType(int paramInt)
    {
      mBuilderImpl.setContentType(paramInt);
      return this;
    }
    
    public Builder setFlags(int paramInt)
    {
      mBuilderImpl.setFlags(paramInt);
      return this;
    }
    
    public Builder setLegacyStreamType(int paramInt)
    {
      mBuilderImpl.setLegacyStreamType(paramInt);
      return this;
    }
    
    public Builder setUsage(int paramInt)
    {
      mBuilderImpl.setUsage(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */