package com.ryanheise.audioservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.b;
import android.view.KeyEvent;
import l5.q;

public class AudioService$d
  extends MediaSessionCompat.b
{
  public AudioService$d(AudioService paramAudioService) {}
  
  public void A()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().k();
  }
  
  public void B(long paramLong)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().G(paramLong);
  }
  
  public void C()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().g();
  }
  
  public final q E(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    if ((i != 79) && (i != 85))
    {
      if (i != 87)
      {
        if (i != 88) {
          return q.o;
        }
        return q.q;
      }
      return q.p;
    }
    return q.o;
  }
  
  public void b(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().C(AudioService.K(paramMediaDescriptionCompat.g()));
  }
  
  public void c(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().v(AudioService.K(paramMediaDescriptionCompat.g()), paramInt);
  }
  
  public void e(String paramString, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    if ("com.ryanheise.audioservice.action.STOP".equals(paramString)) {
      AudioService.u().g();
    } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(paramString)) {
      AudioService.u().A();
    } else if ("com.ryanheise.audioservice.action.REWIND".equals(paramString)) {
      AudioService.u().r();
    } else {
      AudioService.u().E(paramString, paramBundle);
    }
  }
  
  public void f()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().A();
  }
  
  public boolean g(Intent paramIntent)
  {
    if (AudioService.u() == null) {
      return false;
    }
    paramIntent = (KeyEvent)paramIntent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
    if (paramIntent.getAction() == 0)
    {
      int i = paramIntent.getKeyCode();
      if (i != 79) {
        if (i != 130)
        {
          if ((i == 126) || (i == 127)) {}
        }
        else {
          switch (i)
          {
          default: 
            break;
          case 91: 
            i();
            break;
          case 90: 
            f();
            break;
          case 89: 
            r();
            break;
          case 86: 
            C();
            break;
            h();
            break;
          }
        }
      }
      AudioService.u().j(E(paramIntent));
    }
    return true;
  }
  
  public void h()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().w();
  }
  
  public void i()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().e();
  }
  
  public void j(String paramString, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().z(paramString, paramBundle);
  }
  
  public void k(String paramString, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().u(paramString, paramBundle);
  }
  
  public void l(Uri paramUri, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().I(paramUri, paramBundle);
  }
  
  public void m()
  {
    if (AudioService.u() == null) {
      return;
    }
    if (!AudioService.v(f).e()) {
      AudioService.v(f).g(true);
    }
    AudioService.u().p();
  }
  
  public void n(String paramString, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    if (!AudioService.v(f).e()) {
      AudioService.v(f).g(true);
    }
    AudioService.u().h(paramString, paramBundle);
  }
  
  public void o(String paramString, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    if (!AudioService.v(f).e()) {
      AudioService.v(f).g(true);
    }
    AudioService.u().F(paramString, paramBundle);
  }
  
  public void p(Uri paramUri, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    if (!AudioService.v(f).e()) {
      AudioService.v(f).g(true);
    }
    AudioService.u().q(paramUri, paramBundle);
  }
  
  public void q(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().n(AudioService.K(paramMediaDescriptionCompat.g()));
  }
  
  public void r()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().r();
  }
  
  public void s(long paramLong)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().B(paramLong);
  }
  
  public void t(boolean paramBoolean)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().f(paramBoolean);
  }
  
  public void u(float paramFloat)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().o(paramFloat);
  }
  
  public void v(RatingCompat paramRatingCompat)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().t(paramRatingCompat);
  }
  
  public void w(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().J(paramRatingCompat, paramBundle);
  }
  
  public void x(int paramInt)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().c(paramInt);
  }
  
  public void y(int paramInt)
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().d(paramInt);
  }
  
  public void z()
  {
    if (AudioService.u() == null) {
      return;
    }
    AudioService.u().l();
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */