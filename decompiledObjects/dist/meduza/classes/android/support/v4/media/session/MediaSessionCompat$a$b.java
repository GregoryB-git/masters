package android.support.v4.media.session;

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
import androidx.versionedparcelable.ParcelImpl;
import b2.e;
import g1.t;
import java.lang.ref.Reference;
import java.util.List;

public final class MediaSessionCompat$a$b
  extends MediaSession.Callback
{
  public MediaSessionCompat$a$b(MediaSessionCompat.a parama) {}
  
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
    synchronized (a.a)
    {
      MediaSessionCompat.c localc = (MediaSessionCompat.c)a.d.get();
      if ((localc == null) || (a != localc.a())) {
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
        a.E((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
      }
      else
      {
        bool = ???.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
        if (bool) {
          a.H((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
        } else if (???.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
          a.s0((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
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
              a.s0(a);
            }
          }
        }
        else {
          a.M(???, paramBundle, paramResultReceiver);
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
        a.j0(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
      {
        a.n0();
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.o0(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
      {
        paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.q0(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
      {
        paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
        paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
        MediaSessionCompat.a(paramBundle);
        a.r0(paramString, paramBundle);
      }
      else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
      {
        bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
        a.v0(bool);
      }
      else
      {
        int i;
        if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
          a.z0(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
        {
          i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
          a.A0(i);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
        {
          paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
          paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
          MediaSessionCompat.a(paramBundle);
          a.y0(paramString, paramBundle);
        }
        else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
        {
          float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
          a.w0(f);
        }
        else
        {
          a.O(paramString, paramBundle);
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
    a.P();
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
    boolean bool2 = a.Q(paramIntent);
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
    a.U();
    localc.b(null);
  }
  
  public final void onPlay()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.V();
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
    a.f0(paramString, paramBundle);
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
    a.h0(paramString, paramBundle);
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
    a.j0(paramUri, paramBundle);
    localc.b(null);
  }
  
  public final void onPrepare()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.n0();
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
    a.o0(paramString, paramBundle);
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
    a.q0(paramString, paramBundle);
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
    a.r0(paramUri, paramBundle);
    localc.b(null);
  }
  
  public final void onRewind()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.t0();
    localc.b(null);
  }
  
  public final void onSeekTo(long paramLong)
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.u0(paramLong);
    localc.b(null);
  }
  
  public final void onSetPlaybackSpeed(float paramFloat)
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.w0(paramFloat);
    localc.b(null);
  }
  
  public final void onSetRating(Rating paramRating)
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.x0(RatingCompat.a(paramRating));
    localc.b(null);
  }
  
  public final void onSkipToNext()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.B0();
    localc.b(null);
  }
  
  public final void onSkipToPrevious()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.C0();
    localc.b(null);
  }
  
  public final void onSkipToQueueItem(long paramLong)
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.D0(paramLong);
    localc.b(null);
  }
  
  public final void onStop()
  {
    MediaSessionCompat.c localc = a();
    if (localc == null) {
      return;
    }
    b(localc);
    a.E0();
    localc.b(null);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */