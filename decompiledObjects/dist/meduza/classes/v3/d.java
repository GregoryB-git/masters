package v3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import com.google.android.gms.internal.base.a;
import f;
import v5.e0;
import v5.m;
import x3.d.c;
import x6.b;

public final class d
{
  public final AudioManager a;
  public final a b;
  public b c;
  public x3.d d;
  public int e;
  public int f;
  public float g = 1.0F;
  public AudioFocusRequest h;
  
  public d(Context paramContext, Handler paramHandler, d0.b paramb)
  {
    paramContext = (AudioManager)paramContext.getApplicationContext().getSystemService("audio");
    paramContext.getClass();
    a = paramContext;
    c = paramb;
    b = new a(paramHandler);
    e = 0;
  }
  
  public final void a()
  {
    if (e == 0) {
      return;
    }
    if (e0.a >= 26)
    {
      AudioFocusRequest localAudioFocusRequest = h;
      if (localAudioFocusRequest != null) {
        a.s(a, localAudioFocusRequest);
      }
    }
    else
    {
      a.abandonAudioFocus(b);
    }
    d(0);
  }
  
  public final void b(int paramInt)
  {
    Object localObject = c;
    if (localObject != null)
    {
      localObject = (d0.b)localObject;
      boolean bool = a.k();
      localObject = a;
      int i = 1;
      int j = i;
      if (bool)
      {
        j = i;
        if (paramInt != 1) {
          j = 2;
        }
      }
      ((d0)localObject).r0(paramInt, j, bool);
    }
  }
  
  public final void c(x3.d paramd)
  {
    if (!e0.a(d, paramd))
    {
      d = paramd;
      boolean bool = false;
      int i;
      int j;
      int k;
      if (paramd != null)
      {
        i = c;
        j = 3;
        k = j;
      }
      switch (i)
      {
      case 15: 
      default: 
        StringBuilder localStringBuilder = f.l("Unidentified audio usage: ");
        localStringBuilder.append(c);
        m.f("AudioFocusManager", localStringBuilder.toString());
        break;
      case 16: 
        if (e0.a >= 19) {
          k = 4;
        }
        break;
      case 11: 
        k = j;
        if (a != 1) {}
        break;
      case 2: 
      case 4: 
        k = 2;
        break;
      case 0: 
        m.f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
      case 1: 
      case 14: 
        k = 1;
        break;
      case 3: 
        k = 0;
      }
      f = k;
      if ((k == 1) || (k == 0)) {
        bool = true;
      }
      b.o("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", bool);
    }
  }
  
  public final void d(int paramInt)
  {
    if (e == paramInt) {
      return;
    }
    e = paramInt;
    float f1;
    if (paramInt == 3) {
      f1 = 0.2F;
    } else {
      f1 = 1.0F;
    }
    if (g == f1) {
      return;
    }
    g = f1;
    Object localObject = c;
    if (localObject != null)
    {
      localObject = a;
      ((d0)localObject).j0(Float.valueOf(X * A.g), 1, 2);
    }
  }
  
  public final int e(int paramInt, boolean paramBoolean)
  {
    int i = 1;
    int j = 1;
    if ((paramInt != 1) && (f == 1)) {
      paramInt = 0;
    } else {
      paramInt = 1;
    }
    int k = -1;
    if (paramInt != 0)
    {
      a();
      if (paramBoolean) {
        paramInt = j;
      } else {
        paramInt = -1;
      }
      return paramInt;
    }
    paramInt = k;
    if (paramBoolean) {
      if (e == 1)
      {
        paramInt = i;
      }
      else
      {
        Object localObject1;
        Object localObject2;
        if (e0.a >= 26)
        {
          localObject1 = h;
          if (localObject1 == null)
          {
            if (localObject1 == null) {
              localObject1 = new AudioFocusRequest.Builder(f);
            } else {
              localObject1 = new AudioFocusRequest.Builder(h);
            }
            localObject2 = d;
            if ((localObject2 != null) && (a == 1)) {
              paramBoolean = true;
            } else {
              paramBoolean = false;
            }
            localObject2.getClass();
            h = ((AudioFocusRequest.Builder)localObject1).setAudioAttributes(aa).setWillPauseWhenDucked(paramBoolean).setOnAudioFocusChangeListener(b).build();
          }
          paramInt = a.requestAudioFocus(h);
        }
        else
        {
          localObject2 = a;
          a locala = b;
          localObject1 = d;
          localObject1.getClass();
          paramInt = ((AudioManager)localObject2).requestAudioFocus(locala, e0.y(c), f);
        }
        if (paramInt == 1)
        {
          d(1);
          paramInt = i;
        }
        else
        {
          d(0);
          paramInt = -1;
        }
      }
    }
    return paramInt;
  }
  
  public final class a
    implements AudioManager.OnAudioFocusChangeListener
  {
    public final Handler a;
    
    public a(Handler paramHandler)
    {
      a = paramHandler;
    }
    
    public final void onAudioFocusChange(int paramInt)
    {
      a.post(new c(this, paramInt));
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     v3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */