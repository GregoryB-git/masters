package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;

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
    this(paramAudioAttributes, -1);
  }
  
  public AudioAttributesImplApi21(AudioAttributes paramAudioAttributes, int paramInt)
  {
    a = paramAudioAttributes;
    b = paramInt;
  }
  
  public int a()
  {
    int i = b;
    if (i != -1) {
      return i;
    }
    return AudioAttributesCompat.c(false, c(), d());
  }
  
  public Object b()
  {
    return a;
  }
  
  public int c()
  {
    return a.getFlags();
  }
  
  public int d()
  {
    return a.getUsage();
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AudioAttributesImplApi21)) {
      return false;
    }
    paramObject = (AudioAttributesImplApi21)paramObject;
    return a.equals(a);
  }
  
  public int hashCode()
  {
    return a.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioAttributesCompat: audioattributes=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
  
  public static class a
    implements AudioAttributesImpl.a
  {
    public final AudioAttributes.Builder a = new AudioAttributes.Builder();
    
    public AudioAttributesImpl a()
    {
      return new AudioAttributesImplApi21(a.build());
    }
    
    public a e(int paramInt)
    {
      a.setContentType(paramInt);
      return this;
    }
    
    public a f(int paramInt)
    {
      a.setFlags(paramInt);
      return this;
    }
    
    public a g(int paramInt)
    {
      int i = paramInt;
      if (paramInt == 16) {
        i = 12;
      }
      a.setUsage(i);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesImplApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */