package android.support.v4.media.session;

import a0.f;
import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession.Callback;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import v1.a;
import w.d;

public abstract class MediaSessionCompat$b
{
  public final Object a = new Object();
  public final MediaSession.Callback b = new b();
  public boolean c;
  public WeakReference d = new WeakReference(null);
  public a e;
  
  public void A() {}
  
  public void B(long paramLong) {}
  
  public void C() {}
  
  public void D(MediaSessionCompat.c paramc, Handler paramHandler)
  {
    Object localObject3;
    synchronized (a)
    {
      localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(paramc);
      d = ((WeakReference)localObject2);
      localObject2 = e;
      localObject3 = null;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacksAndMessages(null);
      }
    }
    Object localObject2 = localObject3;
    if (paramc != null) {
      if (paramHandler == null) {
        localObject2 = localObject3;
      } else {
        localObject2 = new a(paramHandler.getLooper());
      }
    }
    e = ((a)localObject2);
  }
  
  public void a(MediaSessionCompat.c paramc, Handler paramHandler)
  {
    if (!c) {
      return;
    }
    int i = 0;
    c = false;
    paramHandler.removeMessages(1);
    paramc = paramc.f();
    long l;
    if (paramc == null) {
      l = 0L;
    } else {
      l = paramc.b();
    }
    int j;
    if ((paramc != null) && (paramc.g() == 3)) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((0x204 & l) != 0L) {
      k = 1;
    } else {
      k = 0;
    }
    if ((l & 0x202) != 0L) {
      i = 1;
    }
    if ((j != 0) && (i != 0)) {
      h();
    } else if ((j == 0) && (k != 0)) {
      i();
    }
  }
  
  public void b(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  public void c(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt) {}
  
  public void d(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
  
  public void e(String paramString, Bundle paramBundle) {}
  
  public void f() {}
  
  public boolean g(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return false;
    }
    synchronized (a)
    {
      MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
      a locala = e;
      if ((localc != null) && (locala != null))
      {
        ??? = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if ((??? != null) && (((KeyEvent)???).getAction() == 0))
        {
          paramIntent = localc.t();
          int i = ((KeyEvent)???).getKeyCode();
          if ((i != 79) && (i != 85))
          {
            a(localc, locala);
            return false;
          }
          if (((KeyEvent)???).getRepeatCount() == 0)
          {
            if (c)
            {
              locala.removeMessages(1);
              c = false;
              paramIntent = localc.f();
              long l;
              if (paramIntent == null) {
                l = 0L;
              } else {
                l = paramIntent.b();
              }
              if ((l & 0x20) != 0L) {
                z();
              }
            }
            else
            {
              c = true;
              locala.sendMessageDelayed(locala.obtainMessage(1, paramIntent), ViewConfiguration.getDoubleTapTimeout());
            }
          }
          else {
            a(localc, locala);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public void h() {}
  
  public void i() {}
  
  public void j(String paramString, Bundle paramBundle) {}
  
  public void k(String paramString, Bundle paramBundle) {}
  
  public void l(Uri paramUri, Bundle paramBundle) {}
  
  public void m() {}
  
  public void n(String paramString, Bundle paramBundle) {}
  
  public void o(String paramString, Bundle paramBundle) {}
  
  public void p(Uri paramUri, Bundle paramBundle) {}
  
  public void q(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  public void r() {}
  
  public void s(long paramLong) {}
  
  public void t(boolean paramBoolean) {}
  
  public void u(float paramFloat) {}
  
  public void v(RatingCompat paramRatingCompat) {}
  
  public void w(RatingCompat paramRatingCompat, Bundle paramBundle) {}
  
  public void x(int paramInt) {}
  
  public void y(int paramInt) {}
  
  public void z() {}
  
  public class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (what == 1) {
        synchronized (a)
        {
          MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
          MediaSessionCompat.b localb = MediaSessionCompat.b.this;
          a locala = e;
          if ((localc != null) && (localb == localc.o()) && (locala != null))
          {
            localc.d((f)obj);
            a(localc, locala);
            localc.d(null);
          }
          else {}
        }
      }
    }
  }
  
  public class b
    extends MediaSession.Callback
  {
    public b() {}
    
    public final void a(MediaSessionCompat.c paramc)
    {
      paramc.d(null);
    }
    
    public final MediaSessionCompat.d b()
    {
      synchronized (a)
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)d.get();
        if ((locald == null) || (MediaSessionCompat.b.this != locald.o())) {
          locald = null;
        }
        return locald;
      }
    }
    
    public final void c(MediaSessionCompat.c paramc)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return;
      }
      String str1 = paramc.h();
      String str2 = str1;
      if (TextUtils.isEmpty(str1)) {
        str2 = "android.media.session.MediaController";
      }
      paramc.d(new f(str2, -1, -1));
    }
    
    public void onCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      try
      {
        boolean bool = paramString.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
        Bundle localBundle = null;
        Object localObject = null;
        if (bool)
        {
          localBundle = new android/os/Bundle;
          localBundle.<init>();
          paramBundle = locald.b();
          paramString = paramBundle.c();
          if (paramString == null) {
            paramString = (String)localObject;
          } else {
            paramString = paramString.asBinder();
          }
          d.b(localBundle, "android.support.v4.media.session.EXTRA_BINDER", paramString);
          a.c(localBundle, "android.support.v4.media.session.SESSION_TOKEN2", paramBundle.d());
          paramResultReceiver.send(0, localBundle);
        }
        else
        {
          bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
          if (bool)
          {
            b((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
          }
          else
          {
            bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
            if (bool)
            {
              c((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            }
            else
            {
              if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                paramString = MediaSessionCompat.b.this;
              }
              for (paramBundle = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");; paramBundle = paramResultReceiver)
              {
                paramString.q(paramBundle);
                break label321;
                if (!paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                  break;
                }
                if (i == null) {
                  break label321;
                }
                int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                paramString = localBundle;
                if (i >= 0)
                {
                  paramString = localBundle;
                  if (i < i.size()) {
                    paramString = (MediaSessionCompat.QueueItem)i.get(i);
                  }
                }
                if (paramString == null) {
                  break label321;
                }
                paramBundle = MediaSessionCompat.b.this;
                paramResultReceiver = paramString.c();
                paramString = paramBundle;
              }
              d(paramString, paramBundle, paramResultReceiver);
            }
          }
        }
      }
      catch (BadParcelableException paramString)
      {
        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
      }
      label321:
      a(locald);
    }
    
    public void onCustomAction(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      try
      {
        boolean bool = paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
        if (bool)
        {
          paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          l(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
        {
          m();
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          n(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          o(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
        {
          paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          p(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
        {
          bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
          t(bool);
        }
        else
        {
          int i;
          if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
            x(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
            y(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
          {
            paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            w(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
          {
            float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
            u(f);
          }
          else
          {
            e(paramString, paramBundle);
          }
        }
      }
      catch (BadParcelableException paramString)
      {
        Log.e("MediaSessionCompat", "Could not unparcel the data.");
      }
      a(locald);
    }
    
    public void onFastForward()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      f();
      a(locald);
    }
    
    public boolean onMediaButtonEvent(Intent paramIntent)
    {
      MediaSessionCompat.d locald = b();
      boolean bool1 = false;
      if (locald == null) {
        return false;
      }
      c(locald);
      boolean bool2 = g(paramIntent);
      a(locald);
      if ((bool2) || (super.onMediaButtonEvent(paramIntent))) {
        bool1 = true;
      }
      return bool1;
    }
    
    public void onPause()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      h();
      a(locald);
    }
    
    public void onPlay()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      i();
      a(locald);
    }
    
    public void onPlayFromMediaId(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      j(paramString, paramBundle);
      a(locald);
    }
    
    public void onPlayFromSearch(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      k(paramString, paramBundle);
      a(locald);
    }
    
    public void onPlayFromUri(Uri paramUri, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      l(paramUri, paramBundle);
      a(locald);
    }
    
    public void onPrepare()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      m();
      a(locald);
    }
    
    public void onPrepareFromMediaId(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      n(paramString, paramBundle);
      a(locald);
    }
    
    public void onPrepareFromSearch(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      o(paramString, paramBundle);
      a(locald);
    }
    
    public void onPrepareFromUri(Uri paramUri, Bundle paramBundle)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      c(locald);
      p(paramUri, paramBundle);
      a(locald);
    }
    
    public void onRewind()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      r();
      a(locald);
    }
    
    public void onSeekTo(long paramLong)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      s(paramLong);
      a(locald);
    }
    
    public void onSetPlaybackSpeed(float paramFloat)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      u(paramFloat);
      a(locald);
    }
    
    public void onSetRating(Rating paramRating)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      v(RatingCompat.a(paramRating));
      a(locald);
    }
    
    public void onSkipToNext()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      z();
      a(locald);
    }
    
    public void onSkipToPrevious()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      A();
      a(locald);
    }
    
    public void onSkipToQueueItem(long paramLong)
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      B(paramLong);
      a(locald);
    }
    
    public void onStop()
    {
      MediaSessionCompat.d locald = b();
      if (locald == null) {
        return;
      }
      c(locald);
      C();
      a(locald);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */