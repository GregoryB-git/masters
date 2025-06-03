package g1;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImpl.a;
import androidx.media.AudioAttributesImplApi21.a;
import androidx.media.AudioAttributesImplApi26.a;
import java.util.Objects;

public final class a
{
  public static final AudioAttributesCompat g;
  public final int a;
  public final AudioManager.OnAudioFocusChangeListener b;
  public final Handler c;
  public final AudioAttributesCompat d;
  public final boolean e;
  public final Object f;
  
  static
  {
    int i = AudioAttributesCompat.b;
    Object localObject;
    if (Build.VERSION.SDK_INT >= 26) {
      localObject = new AudioAttributesImplApi26.a();
    } else {
      localObject = new AudioAttributesImplApi21.a();
    }
    ((AudioAttributesImpl.a)localObject).a(1);
    g = new AudioAttributesCompat(((AudioAttributesImpl.a)localObject).build());
  }
  
  public a(int paramInt, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler, AudioAttributesCompat paramAudioAttributesCompat, boolean paramBoolean)
  {
    a = paramInt;
    c = paramHandler;
    d = paramAudioAttributesCompat;
    e = paramBoolean;
    int i = Build.VERSION.SDK_INT;
    if ((i < 26) && (paramHandler.getLooper() != Looper.getMainLooper())) {
      b = new b(paramOnAudioFocusChangeListener, paramHandler);
    } else {
      b = paramOnAudioFocusChangeListener;
    }
    paramOnAudioFocusChangeListener = null;
    if (i >= 26)
    {
      if (paramAudioAttributesCompat != null) {
        paramOnAudioFocusChangeListener = (AudioAttributes)a.b();
      }
      f = a.a(paramInt, paramOnAudioFocusChangeListener, paramBoolean, b, paramHandler);
    }
    else
    {
      f = null;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if ((a != a) || (e != e) || (!Objects.equals(b, b)) || (!Objects.equals(c, c)) || (!Objects.equals(d, d))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), b, c, d, Boolean.valueOf(e) });
  }
  
  public static final class a
  {
    public static AudioFocusRequest a(int paramInt, AudioAttributes paramAudioAttributes, boolean paramBoolean, AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
    {
      return new AudioFocusRequest.Builder(paramInt).setAudioAttributes(paramAudioAttributes).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(paramOnAudioFocusChangeListener, paramHandler).build();
    }
  }
  
  public static final class b
    implements Handler.Callback, AudioManager.OnAudioFocusChangeListener
  {
    public final Handler a;
    public final AudioManager.OnAudioFocusChangeListener b;
    
    public b(AudioManager.OnAudioFocusChangeListener paramOnAudioFocusChangeListener, Handler paramHandler)
    {
      b = paramOnAudioFocusChangeListener;
      a = new Handler(paramHandler.getLooper(), this);
    }
    
    public final boolean handleMessage(Message paramMessage)
    {
      if (what == 2782386)
      {
        b.onAudioFocusChange(arg1);
        return true;
      }
      return false;
    }
    
    public final void onAudioFocusChange(int paramInt)
    {
      Handler localHandler = a;
      localHandler.sendMessage(Message.obtain(localHandler, 2782386, paramInt, 0));
    }
  }
}

/* Location:
 * Qualified Name:     g1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */