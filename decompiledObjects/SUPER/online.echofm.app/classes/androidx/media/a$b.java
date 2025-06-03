package androidx.media;

import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.os.Looper;

public final class a$b
{
  public int a;
  public AudioManager.OnAudioFocusChangeListener b;
  public Handler c;
  public AudioAttributesCompat d = a.g;
  public boolean e;
  
  public a$b(int paramInt)
  {
    d(paramInt);
  }
  
  public static boolean b(int paramInt)
  {
    return (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4);
  }
  
  public a a()
  {
    if (b != null) {
      return new a(a, b, c, d, e);
    }
    throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
  }
  
  public b c(AudioAttributesCompat paramAudioAttributesCompat)
  {
    if (paramAudioAttributesCompat != null)
    {
      d = paramAudioAttributesCompat;
      return this;
    }
    throw new NullPointerException("Illegal null AudioAttributes");
  }
  
  public b d(int paramInt)
  {
    if (b(paramInt))
    {
      a = paramInt;
      return this;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Illegal audio focus gain type ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public b e(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener)
  {
    return f(paramOnAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
  }
  
  public b f(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
  {
    if (paramOnAudioFocusChangeListener != null)
    {
      if (paramHandler != null)
      {
        b = paramOnAudioFocusChangeListener;
        c = paramHandler;
        return this;
      }
      throw new IllegalArgumentException("Handler must not be null");
    }
    throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
  }
  
  public b g(boolean paramBoolean)
  {
    e = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.media.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */