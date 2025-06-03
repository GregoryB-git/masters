package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import f;

public class AudioAttributesImplApi21
  implements AudioAttributesImpl
{
  public AudioAttributes a;
  public int b;
  
  public AudioAttributesImplApi21()
  {
    b = -1;
  }
  
  public AudioAttributesImplApi21(AudioAttributes paramAudioAttributes)
  {
    a = paramAudioAttributes;
    b = -1;
  }
  
  public final int a()
  {
    int i = b;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.c(a.getFlags(), a.getUsage());
  }
  
  public final Object b()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AudioAttributesImplApi21)) {
      return false;
    }
    paramObject = (AudioAttributesImplApi21)paramObject;
    return a.equals(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AudioAttributesCompat: audioattributes=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
  
  public static class a
    implements AudioAttributesImpl.a
  {
    public final AudioAttributes.Builder a = new AudioAttributes.Builder();
    
    public a b(int paramInt)
    {
      int i = paramInt;
      if (paramInt == 16) {
        i = 12;
      }
      a.setUsage(i);
      return this;
    }
    
    public AudioAttributesImpl build()
    {
      return new AudioAttributesImplApi21(a.build());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */