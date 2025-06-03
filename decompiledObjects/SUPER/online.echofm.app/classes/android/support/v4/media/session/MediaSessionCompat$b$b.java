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
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.Reference;
import java.util.List;
import v1.a;
import w.d;

public class MediaSessionCompat$b$b
  extends MediaSession.Callback
{
  public MediaSessionCompat$b$b(MediaSessionCompat.b paramb) {}
  
  public final void a(MediaSessionCompat.c paramc)
  {
    paramc.d(null);
  }
  
  public final MediaSessionCompat.d b()
  {
    synchronized (a.a)
    {
      MediaSessionCompat.d locald = (MediaSessionCompat.d)a.d.get();
      if ((locald == null) || (a != locald.o())) {
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
          a.b((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
        }
        else
        {
          bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
          if (bool)
          {
            a.c((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
          }
          else
          {
            if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
              paramString = a;
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
              paramBundle = a;
              paramResultReceiver = paramString.c();
              paramString = paramBundle;
            }
            a.d(paramString, paramBundle, paramResultReceiver);
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
        a.l(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
      {
        a.m();
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.n(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.o(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
      {
        paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.p(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
      {
        bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
        a.t(bool);
      }
      else
      {
        int i;
        if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
          a.x(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
          a.y(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
        {
          paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          a.w(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
        {
          float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
          a.u(f);
        }
        else
        {
          a.e(paramString, paramBundle);
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
    a.f();
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
    boolean bool2 = a.g(paramIntent);
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
    a.h();
    a(locald);
  }
  
  public void onPlay()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.i();
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
    a.j(paramString, paramBundle);
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
    a.k(paramString, paramBundle);
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
    a.l(paramUri, paramBundle);
    a(locald);
  }
  
  public void onPrepare()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.m();
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
    a.n(paramString, paramBundle);
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
    a.o(paramString, paramBundle);
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
    a.p(paramUri, paramBundle);
    a(locald);
  }
  
  public void onRewind()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.r();
    a(locald);
  }
  
  public void onSeekTo(long paramLong)
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.s(paramLong);
    a(locald);
  }
  
  public void onSetPlaybackSpeed(float paramFloat)
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.u(paramFloat);
    a(locald);
  }
  
  public void onSetRating(Rating paramRating)
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.v(RatingCompat.a(paramRating));
    a(locald);
  }
  
  public void onSkipToNext()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.z();
    a(locald);
  }
  
  public void onSkipToPrevious()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.A();
    a(locald);
  }
  
  public void onSkipToQueueItem(long paramLong)
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.B(paramLong);
    a(locald);
  }
  
  public void onStop()
  {
    MediaSessionCompat.d locald = b();
    if (locald == null) {
      return;
    }
    c(locald);
    a.C();
    a(locald);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */