package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.ao;
import com.google.ads.interactivemedia.v3.impl.data.ap;
import java.util.HashMap;

final class adk
  implements Handler.Callback, VideoAdPlayer.VideoAdPlayerCallback
{
  private final adm a;
  private final Handler b = new Handler(this);
  private final HashMap<AdMediaInfo, Boolean> c;
  
  public adk(adm paramadm)
  {
    a = paramadm;
    c = aim.b(2);
  }
  
  private final void a(aer paramaer, AdMediaInfo paramAdMediaInfo, Object paramObject)
  {
    paramaer = new adj(paramAdMediaInfo, paramaer, paramObject);
    Message.obtain(b, 1, paramaer).sendToTarget();
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    ahf.a(paramMessage);
    paramMessage = (adj)obj;
    a.a(b, a, c);
    return true;
  }
  
  public final void onAdProgress(AdMediaInfo paramAdMediaInfo, VideoProgressUpdate paramVideoProgressUpdate)
  {
    if ((paramVideoProgressUpdate != null) && (paramVideoProgressUpdate.getDuration() > 0.0F))
    {
      if ((c.get(paramAdMediaInfo) == null) && (paramVideoProgressUpdate.getCurrentTime() > 0.0F))
      {
        a(aer.start, paramAdMediaInfo, null);
        c.put(paramAdMediaInfo, Boolean.TRUE);
      }
      a(aer.timeupdate, paramAdMediaInfo, paramVideoProgressUpdate);
    }
  }
  
  public final void onBuffering(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.waiting, paramAdMediaInfo, null);
  }
  
  public final void onEnded(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.end, paramAdMediaInfo, null);
    c.remove(paramAdMediaInfo);
  }
  
  public final void onError(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.error, paramAdMediaInfo, null);
    c.remove(paramAdMediaInfo);
  }
  
  public final void onLoaded(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.loaded, paramAdMediaInfo, null);
  }
  
  public final void onPause(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.pause, paramAdMediaInfo, null);
  }
  
  public final void onPlay(AdMediaInfo paramAdMediaInfo) {}
  
  public final void onResume(AdMediaInfo paramAdMediaInfo)
  {
    a(aer.play, paramAdMediaInfo, null);
  }
  
  public final void onVolumeChanged(AdMediaInfo paramAdMediaInfo, int paramInt)
  {
    ap localap = ap.builder().volumePercentage(paramInt).build();
    a(aer.volumeChange, paramAdMediaInfo, localap);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */