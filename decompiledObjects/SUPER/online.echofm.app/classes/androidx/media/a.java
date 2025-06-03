package androidx.media;

import H.c;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

public class a
{
  public static final AudioAttributesCompat g = new AudioAttributesCompat.a().d(1).a();
  public final int a;
  public final AudioManager.OnAudioFocusChangeListener b;
  public final Handler c;
  public final AudioAttributesCompat d;
  public final boolean e;
  public final Object f;
  
  public a(int paramInt, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler, AudioAttributesCompat paramAudioAttributesCompat, boolean paramBoolean)
  {
    a = paramInt;
    c = paramHandler;
    d = paramAudioAttributesCompat;
    e = paramBoolean;
    int i = Build.VERSION.SDK_INT;
    if ((i < 26) && (paramHandler.getLooper() != Looper.getMainLooper())) {
      b = new c(paramOnAudioFocusChangeListener, paramHandler);
    } else {
      b = paramOnAudioFocusChangeListener;
    }
    if (i >= 26) {}
    for (paramOnAudioFocusChangeListener = a.a(paramInt, a(), paramBoolean, b, paramHandler);; paramOnAudioFocusChangeListener = null)
    {
      f = paramOnAudioFocusChangeListener;
      break;
    }
  }
  
  public AudioAttributes a()
  {
    Object localObject = d;
    if (localObject != null) {
      localObject = (AudioAttributes)((AudioAttributesCompat)localObject).d();
    } else {
      localObject = null;
    }
    return (AudioAttributes)localObject;
  }
  
  public AudioAttributesCompat b()
  {
    return d;
  }
  
  public AudioFocusRequest c()
  {
    return a0.a.a(f);
  }
  
  public int d()
  {
    return a;
  }
  
  public AudioManager.OnAudioFocusChangeListener e()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if ((a != a) || (e != e) || (!c.a(b, b)) || (!c.a(c, c)) || (!c.a(d, d))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return c.b(new Object[] { Integer.valueOf(a), b, c, d, Boolean.valueOf(e) });
  }
  
  public static abstract class a
  {
    public static AudioFocusRequest a(int paramInt, AudioAttributes paramAudioAttributes, boolean paramBoolean, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
    {
      return new AudioFocusRequest.Builder(paramInt).setAudioAttributes(paramAudioAttributes).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, paramHandler).build();
    }
  }
  
  public static final class b
  {
    public int a;
    public AudioManager.OnAudioFocusChangeListener b;
    public Handler c;
    public AudioAttributesCompat d = a.g;
    public boolean e;
    
    public b(int paramInt)
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
  
  public static class c
    implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
  {
    public final Handler o;
    public final AudioManager.OnAudioFocusChangeListener p;
    
    public c(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
    {
      p = paramOnAudioFocusChangeListener;
      o = new Handler(paramHandler.getLooper(), this);
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      if (what == 2782386)
      {
        p.onAudioFocusChange(arg1);
        return true;
      }
      return false;
    }
    
    public void onAudioFocusChange(int paramInt)
    {
      Handler localHandler = o;
      localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */