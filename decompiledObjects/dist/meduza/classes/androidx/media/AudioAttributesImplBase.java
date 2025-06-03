package androidx.media;

import f;
import java.util.Arrays;

public class AudioAttributesImplBase
  implements AudioAttributesImpl
{
  public int a = 0;
  public int b = 0;
  public int c = 0;
  public int d = -1;
  
  public final int a()
  {
    int i = d;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.c(c, a);
  }
  
  public final Object b()
  {
    return null;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof AudioAttributesImplBase;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (AudioAttributesImplBase)paramObject;
    bool1 = bool2;
    if (b == b)
    {
      int i = c;
      int j = c;
      int k = ((AudioAttributesImplBase)paramObject).a();
      int m;
      if (k == 6)
      {
        m = j | 0x4;
      }
      else
      {
        m = j;
        if (k == 7) {
          m = j | 0x1;
        }
      }
      bool1 = bool2;
      if (i == (m & 0x111))
      {
        bool1 = bool2;
        if (a == a)
        {
          bool1 = bool2;
          if (d == d) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(a), Integer.valueOf(d) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AudioAttributesCompat:");
    if (d != -1)
    {
      localStringBuilder.append(" stream=");
      localStringBuilder.append(d);
      localStringBuilder.append(" derived");
    }
    localStringBuilder.append(" usage=");
    int i = a;
    int j = AudioAttributesCompat.b;
    String str;
    switch (i)
    {
    case 15: 
    default: 
      str = f.h("unknown usage ", i);
      break;
    case 16: 
      str = "USAGE_ASSISTANT";
      break;
    case 14: 
      str = "USAGE_GAME";
      break;
    case 13: 
      str = "USAGE_ASSISTANCE_SONIFICATION";
      break;
    case 12: 
      str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
      break;
    case 11: 
      str = "USAGE_ASSISTANCE_ACCESSIBILITY";
      break;
    case 10: 
      str = "USAGE_NOTIFICATION_EVENT";
      break;
    case 9: 
      str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
      break;
    case 8: 
      str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
      break;
    case 7: 
      str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
      break;
    case 6: 
      str = "USAGE_NOTIFICATION_RINGTONE";
      break;
    case 5: 
      str = "USAGE_NOTIFICATION";
      break;
    case 4: 
      str = "USAGE_ALARM";
      break;
    case 3: 
      str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
      break;
    case 2: 
      str = "USAGE_VOICE_COMMUNICATION";
      break;
    case 1: 
      str = "USAGE_MEDIA";
      break;
    case 0: 
      str = "USAGE_UNKNOWN";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(" content=");
    localStringBuilder.append(b);
    localStringBuilder.append(" flags=0x");
    localStringBuilder.append(Integer.toHexString(c).toUpperCase());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */