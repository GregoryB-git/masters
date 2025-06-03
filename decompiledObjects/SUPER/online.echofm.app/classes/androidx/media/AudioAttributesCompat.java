package androidx.media;

import android.media.AudioAttributes;
import android.os.Build.VERSION;
import android.util.SparseIntArray;
import v1.d;

public class AudioAttributesCompat
  implements d
{
  public static final SparseIntArray b;
  public static boolean c;
  public static final int[] d = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16 };
  public AudioAttributesImpl a;
  
  static
  {
    SparseIntArray localSparseIntArray = new SparseIntArray();
    b = localSparseIntArray;
    localSparseIntArray.put(5, 1);
    localSparseIntArray.put(6, 2);
    localSparseIntArray.put(7, 2);
    localSparseIntArray.put(8, 1);
    localSparseIntArray.put(9, 1);
    localSparseIntArray.put(10, 1);
  }
  
  public AudioAttributesCompat() {}
  
  public AudioAttributesCompat(AudioAttributesImpl paramAudioAttributesImpl)
  {
    a = paramAudioAttributesImpl;
  }
  
  public static int c(boolean paramBoolean, int paramInt1, int paramInt2)
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
      if (!paramBoolean) {
        return 3;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown usage value ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" in audio attributes");
      throw new IllegalArgumentException(localStringBuilder.toString());
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
  }
  
  public static String e(int paramInt)
  {
    switch (paramInt)
    {
    case 15: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("unknown usage ");
      localStringBuilder.append(paramInt);
      return localStringBuilder.toString();
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
  
  public static AudioAttributesCompat f(Object paramObject)
  {
    if (c) {
      return null;
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes)paramObject));
    }
    return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes)paramObject));
  }
  
  public int a()
  {
    return a.a();
  }
  
  public Object d()
  {
    return a.b();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesCompat;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    Object localObject = (AudioAttributesCompat)paramObject;
    paramObject = a;
    localObject = a;
    if (paramObject == null)
    {
      if (localObject == null) {
        bool2 = true;
      }
      return bool2;
    }
    return paramObject.equals(localObject);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    return a.toString();
  }
  
  public static class a
  {
    public final AudioAttributesImpl.a a;
    
    public a()
    {
      Object localObject;
      if (AudioAttributesCompat.c) {
        localObject = new AudioAttributesImplBase.a();
      }
      for (;;)
      {
        a = ((AudioAttributesImpl.a)localObject);
        break;
        if (Build.VERSION.SDK_INT >= 26) {
          localObject = new AudioAttributesImplApi26.a();
        } else {
          localObject = new AudioAttributesImplApi21.a();
        }
      }
    }
    
    public AudioAttributesCompat a()
    {
      return new AudioAttributesCompat(a.a());
    }
    
    public a b(int paramInt)
    {
      a.d(paramInt);
      return this;
    }
    
    public a c(int paramInt)
    {
      a.c(paramInt);
      return this;
    }
    
    public a d(int paramInt)
    {
      a.b(paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */