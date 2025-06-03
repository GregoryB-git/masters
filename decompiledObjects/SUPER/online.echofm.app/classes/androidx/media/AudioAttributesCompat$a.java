package androidx.media;

import android.os.Build.VERSION;

public class AudioAttributesCompat$a
{
  public final AudioAttributesImpl.a a;
  
  public AudioAttributesCompat$a()
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

/* Location:
 * Qualified Name:     androidx.media.AudioAttributesCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */