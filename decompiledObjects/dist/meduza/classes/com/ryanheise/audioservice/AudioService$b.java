package com.ryanheise.audioservice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import android.view.KeyEvent;
import java.util.HashMap;
import q0.g;

public final class AudioService$b
  extends MediaSessionCompat.a
{
  public AudioService$b(AudioService paramAudioService) {}
  
  public final void A0(int paramInt)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setShuffleMode", b.k(new Object[] { "shuffleMode", Integer.valueOf(paramInt) }), null);
  }
  
  public final void B0()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("skipToNext", b.k(new Object[0]), null);
  }
  
  public final void C0()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("skipToPrevious", b.k(new Object[0]), null);
  }
  
  public final void D0(long paramLong)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("skipToQueueItem", b.k(new Object[] { "index", Long.valueOf(paramLong) }), null);
  }
  
  public final void E(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    paramMediaDescriptionCompat = a;
    paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
    ((b.c)localc).a("addQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat) }), null);
  }
  
  public final void E0()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("stop", b.k(new Object[0]), null);
  }
  
  public final void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    paramMediaDescriptionCompat = a;
    paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
    ((b.c)localc).a("insertQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat), "index", Integer.valueOf(paramInt) }), null);
  }
  
  public final void O(String paramString, Bundle paramBundle)
  {
    if (AudioService.H == null) {
      return;
    }
    if ("com.ryanheise.audioservice.action.STOP".equals(paramString))
    {
      paramString = (b.c)AudioService.H;
      paramString.getClass();
      paramString.a("stop", b.k(new Object[0]), null);
    }
    else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(paramString))
    {
      paramString = (b.c)AudioService.H;
      paramString.getClass();
      paramString.a("fastForward", b.k(new Object[0]), null);
    }
    else if ("com.ryanheise.audioservice.action.REWIND".equals(paramString))
    {
      paramString = (b.c)AudioService.H;
      paramString.getClass();
      paramString.a("rewind", b.k(new Object[0]), null);
    }
    else
    {
      b.c localc = (b.c)AudioService.H;
      localc.getClass();
      localc.a("customAction", b.k(new Object[] { "name", paramString, "extras", b.e(paramBundle) }), null);
    }
  }
  
  public final void P()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("fastForward", b.k(new Object[0]), null);
  }
  
  public final boolean Q(Intent paramIntent)
  {
    if (AudioService.H == null) {
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
            V();
            break;
          case 90: 
            P();
            break;
          case 89: 
            t0();
            break;
          case 86: 
            E0();
            break;
            U();
            break;
          }
        }
      }
      AudioService.c localc = AudioService.H;
      i = paramIntent.getKeyCode();
      if ((i != 79) && (i != 85)) {
        if (i != 87)
        {
          if (i == 88)
          {
            i = 3;
            break label186;
          }
        }
        else
        {
          i = 2;
          break label186;
        }
      }
      i = 1;
      label186:
      paramIntent = (b.c)localc;
      paramIntent.getClass();
      paramIntent.a("click", b.k(new Object[] { "button", Integer.valueOf(g.c(i)) }), null);
    }
    return true;
  }
  
  public final void U()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("pause", b.k(new Object[0]), null);
  }
  
  public final void V()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("play", b.k(new Object[0]), null);
  }
  
  public final void f0(String paramString, Bundle paramBundle)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("playFromMediaId", b.k(new Object[] { "mediaId", paramString, "extras", b.e(paramBundle) }), null);
  }
  
  public final void h0(String paramString, Bundle paramBundle)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("playFromSearch", b.k(new Object[] { "query", paramString, "extras", b.e(paramBundle) }), null);
  }
  
  public final void j0(Uri paramUri, Bundle paramBundle)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("playFromUri", b.k(new Object[] { "uri", paramUri.toString(), "extras", b.e(paramBundle) }), null);
  }
  
  public final void n0()
  {
    if (AudioService.H == null) {
      return;
    }
    if (!f.r.c()) {
      f.r.e(true);
    }
    b.c localc = (b.c)AudioService.H;
    localc.getClass();
    localc.a("prepare", b.k(new Object[0]), null);
  }
  
  public final void o0(String paramString, Bundle paramBundle)
  {
    if (AudioService.H == null) {
      return;
    }
    if (!f.r.c()) {
      f.r.e(true);
    }
    b.c localc = (b.c)AudioService.H;
    localc.getClass();
    localc.a("prepareFromMediaId", b.k(new Object[] { "mediaId", paramString, "extras", b.e(paramBundle) }), null);
  }
  
  public final void q0(String paramString, Bundle paramBundle)
  {
    if (AudioService.H == null) {
      return;
    }
    if (!f.r.c()) {
      f.r.e(true);
    }
    b.c localc = (b.c)AudioService.H;
    localc.getClass();
    localc.a("prepareFromSearch", b.k(new Object[] { "query", paramString, "extras", b.e(paramBundle) }), null);
  }
  
  public final void r0(Uri paramUri, Bundle paramBundle)
  {
    if (AudioService.H == null) {
      return;
    }
    if (!f.r.c()) {
      f.r.e(true);
    }
    b.c localc = (b.c)AudioService.H;
    localc.getClass();
    localc.a("prepareFromUri", b.k(new Object[] { "uri", paramUri.toString(), "extras", b.e(paramBundle) }), null);
  }
  
  public final void s0(MediaDescriptionCompat paramMediaDescriptionCompat)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    paramMediaDescriptionCompat = a;
    paramMediaDescriptionCompat = (MediaMetadataCompat)AudioService.J.get(paramMediaDescriptionCompat);
    ((b.c)localc).a("removeQueueItem", b.k(new Object[] { "mediaItem", b.b(paramMediaDescriptionCompat) }), null);
  }
  
  public final void t0()
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("rewind", b.k(new Object[0]), null);
  }
  
  public final void u0(long paramLong)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("seek", b.k(new Object[] { "position", Long.valueOf(paramLong * 1000L) }), null);
  }
  
  public final void v0(boolean paramBoolean)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setCaptioningEnabled", b.k(new Object[] { "enabled", Boolean.valueOf(paramBoolean) }), null);
  }
  
  public final void w0(float paramFloat)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setSpeed", b.k(new Object[] { "speed", Float.valueOf(paramFloat) }), null);
  }
  
  public final void x0(RatingCompat paramRatingCompat)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setRating", b.k(new Object[] { "rating", b.n(paramRatingCompat), "extras", null }), null);
  }
  
  public final void y0(RatingCompat paramRatingCompat, Bundle paramBundle)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setRating", b.k(new Object[] { "rating", b.n(paramRatingCompat), "extras", b.e(paramBundle) }), null);
  }
  
  public final void z0(int paramInt)
  {
    AudioService.c localc = AudioService.H;
    if (localc == null) {
      return;
    }
    ((b.c)localc).a("setRepeatMode", b.k(new Object[] { "repeatMode", Integer.valueOf(paramInt) }), null);
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */