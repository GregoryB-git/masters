package k0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import d0.b;
import d0.b.d;
import g0.M;
import g0.a;
import g0.o;

public final class m
{
  public final AudioManager a;
  public final a b;
  public b c;
  public b d;
  public int e;
  public int f;
  public float g = 1.0F;
  public AudioFocusRequest h;
  public boolean i;
  
  public m(Context paramContext, Handler paramHandler, b paramb)
  {
    a = ((AudioManager)a.e((AudioManager)paramContext.getApplicationContext().getSystemService("audio")));
    c = paramb;
    b = new a(paramHandler);
    e = 0;
  }
  
  public static int e(b paramb)
  {
    if (paramb == null) {
      return 0;
    }
    switch (c)
    {
    case 15: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unidentified audio usage: ");
      localStringBuilder.append(c);
      o.h("AudioFocusManager", localStringBuilder.toString());
      return 0;
    case 16: 
      return 4;
    case 11: 
      if (a == 1) {
        return 2;
      }
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
      return 3;
    case 3: 
      return 0;
    case 2: 
    case 4: 
      return 2;
    case 1: 
    case 14: 
      return 1;
    }
    o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
    return 1;
  }
  
  public final void a()
  {
    a.abandonAudioFocus(b);
  }
  
  public final void b()
  {
    int j = e;
    if ((j != 1) && (j != 0)) {
      if (M.a >= 26) {
        c();
      } else {
        a();
      }
    }
  }
  
  public final void c()
  {
    AudioFocusRequest localAudioFocusRequest = h;
    if (localAudioFocusRequest != null) {
      k.a(a, localAudioFocusRequest);
    }
  }
  
  public final void f(int paramInt)
  {
    b localb = c;
    if (localb != null) {
      localb.j(paramInt);
    }
  }
  
  public float g()
  {
    return g;
  }
  
  public final void h(int paramInt)
  {
    if ((paramInt != -3) && (paramInt != -2))
    {
      if (paramInt != -1)
      {
        if (paramInt != 1)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unknown focus change type: ");
          localStringBuilder.append(paramInt);
          o.h("AudioFocusManager", localStringBuilder.toString());
          return;
        }
        n(2);
        f(1);
        return;
      }
      f(-1);
      b();
      n(1);
      return;
    }
    if ((paramInt != -2) && (!q())) {}
    for (paramInt = 4;; paramInt = 3)
    {
      n(paramInt);
      break;
      f(0);
    }
  }
  
  public void i()
  {
    c = null;
    b();
    n(0);
  }
  
  public final int j()
  {
    if (e == 2) {
      return 1;
    }
    int j;
    if (M.a >= 26) {
      j = l();
    } else {
      j = k();
    }
    if (j == 1)
    {
      n(2);
      return 1;
    }
    n(1);
    return -1;
  }
  
  public final int k()
  {
    return a.requestAudioFocus(b, M.k0(ed)).c), f);
  }
  
  public final int l()
  {
    Object localObject = h;
    if ((localObject == null) || (i))
    {
      e.a();
      if (localObject == null) {
        localObject = c.a(f);
      } else {
        localObject = d.a(h);
      }
      boolean bool = q();
      h = i.a(h.a(g.a(f.a((AudioFocusRequest.Builder)localObject, ed)).a().a), bool), b));
      i = false;
    }
    return j.a(a, h);
  }
  
  public void m(b paramb)
  {
    if (!M.c(d, paramb))
    {
      d = paramb;
      int j = e(paramb);
      f = j;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (j != 1) {
        if (j == 0) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      a.b(bool2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
  }
  
  public final void n(int paramInt)
  {
    if (e == paramInt) {
      return;
    }
    e = paramInt;
    float f1;
    if (paramInt == 4) {
      f1 = 0.2F;
    } else {
      f1 = 1.0F;
    }
    if (g == f1) {
      return;
    }
    g = f1;
    b localb = c;
    if (localb != null) {
      localb.F(f1);
    }
  }
  
  public final boolean o(int paramInt)
  {
    boolean bool = true;
    if ((paramInt == 1) || (f != 1)) {
      bool = false;
    }
    return bool;
  }
  
  public int p(boolean paramBoolean, int paramInt)
  {
    if (!o(paramInt))
    {
      b();
      n(0);
      return 1;
    }
    if (paramBoolean) {
      return j();
    }
    paramInt = e;
    if (paramInt != 1)
    {
      if (paramInt != 3) {
        return 1;
      }
      return 0;
    }
    return -1;
  }
  
  public final boolean q()
  {
    b localb = d;
    boolean bool;
    if (localb != null)
    {
      int j = a;
      bool = true;
      if (j == 1) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public class a
    implements AudioManager.OnAudioFocusChangeListener
  {
    public final Handler o;
    
    public a(Handler paramHandler)
    {
      o = paramHandler;
    }
    
    public void onAudioFocusChange(int paramInt)
    {
      o.post(new l(this, paramInt));
    }
  }
  
  public static abstract interface b
  {
    public abstract void F(float paramFloat);
    
    public abstract void j(int paramInt);
  }
}

/* Location:
 * Qualified Name:     k0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */