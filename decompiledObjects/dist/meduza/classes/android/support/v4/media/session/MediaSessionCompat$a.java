package android.support.v4.media.session;

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
import androidx.versionedparcelable.ParcelImpl;
import b2.e;
import g1.t;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class MediaSessionCompat$a
{
  public final Object a = new Object();
  public final b b = new b();
  public boolean c;
  public WeakReference<MediaSessionCompat.b> d = new WeakReference(null);
  public a e;
  
  public void A0(int paramInt) {}
  
  public final void B(MediaSessionCompat.b paramb, a parama)
  {
    if (!c) {
      return;
    }
    int i = 0;
    c = false;
    parama.removeMessages(1);
    paramb = paramb.d();
    long l;
    if (paramb == null) {
      l = 0L;
    } else {
      l = e;
    }
    int j;
    if ((paramb != null) && (a == 3)) {
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
      U();
    } else if ((j == 0) && (k != 0)) {
      V();
    }
  }
  
  public void B0() {}
  
  public void C0() {}
  
  public void D0(long paramLong) {}
  
  public void E(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  public void E0() {}
  
  public final void F0(MediaSessionCompat.b paramb, Handler paramHandler)
  {
    synchronized (a)
    {
      Object localObject2 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject2).<init>(paramb);
      d = ((WeakReference)localObject2);
      localObject2 = e;
      Object localObject3 = null;
      if (localObject2 != null) {
        ((Handler)localObject2).removeCallbacksAndMessages(null);
      }
      localObject2 = localObject3;
      if (paramb != null) {
        if (paramHandler == null) {
          localObject2 = localObject3;
        } else {
          localObject2 = new a(paramHandler.getLooper());
        }
      }
      e = ((a)localObject2);
      return;
    }
  }
  
  public void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt) {}
  
  public void M(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
  
  public void O(String paramString, Bundle paramBundle) {}
  
  public void P() {}
  
  public boolean Q(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 27) {
      return false;
    }
    synchronized (a)
    {
      MediaSessionCompat.b localb = (MediaSessionCompat.b)d.get();
      a locala = e;
      if ((localb != null) && (locala != null))
      {
        ??? = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if ((??? != null) && (((KeyEvent)???).getAction() == 0))
        {
          paramIntent = localb.c();
          int i = ((KeyEvent)???).getKeyCode();
          if ((i != 79) && (i != 85))
          {
            B(localb, locala);
            return false;
          }
          if (((KeyEvent)???).getRepeatCount() == 0)
          {
            if (c)
            {
              locala.removeMessages(1);
              c = false;
              paramIntent = localb.d();
              long l;
              if (paramIntent == null) {
                l = 0L;
              } else {
                l = e;
              }
              if ((l & 0x20) != 0L) {
                B0();
              }
            }
            else
            {
              c = true;
              locala.sendMessageDelayed(locala.obtainMessage(1, paramIntent), ViewConfiguration.getDoubleTapTimeout());
            }
          }
          else {
            B(localb, locala);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public void U() {}
  
  public void V() {}
  
  public void f0(String paramString, Bundle paramBundle) {}
  
  public void h0(String paramString, Bundle paramBundle) {}
  
  public void j0(Uri paramUri, Bundle paramBundle) {}
  
  public void n0() {}
  
  public void o0(String paramString, Bundle paramBundle) {}
  
  public void q0(String paramString, Bundle paramBundle) {}
  
  public void r0(Uri paramUri, Bundle paramBundle) {}
  
  public void s0(MediaDescriptionCompat paramMediaDescriptionCompat) {}
  
  public void t0() {}
  
  public void u0(long paramLong) {}
  
  public void v0(boolean paramBoolean) {}
  
  public void w0(float paramFloat) {}
  
  public void x0(RatingCompat paramRatingCompat) {}
  
  public void y0(RatingCompat paramRatingCompat, Bundle paramBundle) {}
  
  public void z0(int paramInt) {}
  
  public final class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      if (what == 1) {
        synchronized (a)
        {
          MediaSessionCompat.b localb = (MediaSessionCompat.b)d.get();
          MediaSessionCompat.a locala = MediaSessionCompat.a.this;
          a locala1 = e;
          if ((localb != null) && (locala == localb.a()) && (locala1 != null))
          {
            localb.b((t)obj);
            B(localb, locala1);
            localb.b(null);
          }
          else {}
        }
      }
    }
  }
  
  public final class b
    extends MediaSession.Callback
  {
    public b() {}
    
    public static void b(MediaSessionCompat.c paramc)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return;
      }
      String str1 = paramc.f();
      String str2 = str1;
      if (TextUtils.isEmpty(str1)) {
        str2 = "android.media.session.MediaController";
      }
      paramc.b(new t(str2, -1, -1));
    }
    
    public final MediaSessionCompat.c a()
    {
      synchronized (a)
      {
        MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
        if ((localc == null) || (MediaSessionCompat.a.this != localc.a())) {
          localc = null;
        }
        return localc;
      }
    }
    
    public final void onCommand(String arg1, Bundle paramBundle, ResultReceiver paramResultReceiver)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      try
      {
        if (???.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER"))
        {
          paramBundle = new android/os/Bundle;
          paramBundle.<init>();
          Object localObject = b;
          ??? = ((MediaSessionCompat.Token)localObject).a();
          if (??? == null) {
            ??? = null;
          } else {
            ??? = ???.asBinder();
          }
          paramBundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", ???);
          synchronized (a)
          {
            localObject = d;
            if (localObject != null)
            {
              Bundle localBundle = new android/os/Bundle;
              localBundle.<init>();
              ??? = new androidx/versionedparcelable/ParcelImpl;
              ???.<init>((e)localObject);
              localBundle.putParcelable("a", ???);
              paramBundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", localBundle);
            }
            paramResultReceiver.send(0, paramBundle);
          }
        }
        boolean bool = ???.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
        if (bool)
        {
          E((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
        }
        else
        {
          bool = ???.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
          if (bool) {
            H((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
          } else if (???.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
            s0((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
          } else if (???.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
          {
            if (h != null)
            {
              int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
              if ((i >= 0) && (i < h.size())) {
                ??? = (MediaSessionCompat.QueueItem)h.get(i);
              } else {
                ??? = null;
              }
              if (??? != null) {
                s0(a);
              }
            }
          }
          else {
            M(???, paramBundle, paramResultReceiver);
          }
        }
      }
      catch (BadParcelableException ???)
      {
        Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
      }
      localc.b(null);
    }
    
    public final void onCustomAction(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      try
      {
        boolean bool = paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
        if (bool)
        {
          paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          j0(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
        {
          n0();
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          o0(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
        {
          paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          q0(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
        {
          paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          r0(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
        {
          bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
          v0(bool);
        }
        else
        {
          int i;
          if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
            z0(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
          {
            i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
            A0(i);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
          {
            paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            y0(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
          {
            float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
            w0(f);
          }
          else
          {
            O(paramString, paramBundle);
          }
        }
      }
      catch (BadParcelableException paramString)
      {
        Log.e("MediaSessionCompat", "Could not unparcel the data.");
      }
      localc.b(null);
    }
    
    public final void onFastForward()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      P();
      localc.b(null);
    }
    
    public final boolean onMediaButtonEvent(Intent paramIntent)
    {
      MediaSessionCompat.c localc = a();
      boolean bool1 = false;
      if (localc == null) {
        return false;
      }
      b(localc);
      boolean bool2 = Q(paramIntent);
      localc.b(null);
      if ((bool2) || (super.onMediaButtonEvent(paramIntent))) {
        bool1 = true;
      }
      return bool1;
    }
    
    public final void onPause()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      U();
      localc.b(null);
    }
    
    public final void onPlay()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      V();
      localc.b(null);
    }
    
    public final void onPlayFromMediaId(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      f0(paramString, paramBundle);
      localc.b(null);
    }
    
    public final void onPlayFromSearch(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      h0(paramString, paramBundle);
      localc.b(null);
    }
    
    public final void onPlayFromUri(Uri paramUri, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      j0(paramUri, paramBundle);
      localc.b(null);
    }
    
    public final void onPrepare()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      n0();
      localc.b(null);
    }
    
    public final void onPrepareFromMediaId(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      o0(paramString, paramBundle);
      localc.b(null);
    }
    
    public final void onPrepareFromSearch(String paramString, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      q0(paramString, paramBundle);
      localc.b(null);
    }
    
    public final void onPrepareFromUri(Uri paramUri, Bundle paramBundle)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      MediaSessionCompat.a(paramBundle);
      b(localc);
      r0(paramUri, paramBundle);
      localc.b(null);
    }
    
    public final void onRewind()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      t0();
      localc.b(null);
    }
    
    public final void onSeekTo(long paramLong)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      u0(paramLong);
      localc.b(null);
    }
    
    public final void onSetPlaybackSpeed(float paramFloat)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      w0(paramFloat);
      localc.b(null);
    }
    
    public final void onSetRating(Rating paramRating)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      x0(RatingCompat.a(paramRating));
      localc.b(null);
    }
    
    public final void onSkipToNext()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      B0();
      localc.b(null);
    }
    
    public final void onSkipToPrevious()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      C0();
      localc.b(null);
    }
    
    public final void onSkipToQueueItem(long paramLong)
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      D0(paramLong);
      localc.b(null);
    }
    
    public final void onStop()
    {
      MediaSessionCompat.c localc = a();
      if (localc == null) {
        return;
      }
      b(localc);
      E0();
      localc.b(null);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */