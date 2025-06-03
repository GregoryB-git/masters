package androidx.media.session;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.ConnectionCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.view.KeyEvent;

class MediaButtonReceiver$MediaButtonConnectionCallback
  extends MediaBrowserCompat.ConnectionCallback
{
  private final Context mContext;
  private final Intent mIntent;
  private MediaBrowserCompat mMediaBrowser;
  private final BroadcastReceiver.PendingResult mPendingResult;
  
  public MediaButtonReceiver$MediaButtonConnectionCallback(Context paramContext, Intent paramIntent, BroadcastReceiver.PendingResult paramPendingResult)
  {
    mContext = paramContext;
    mIntent = paramIntent;
    mPendingResult = paramPendingResult;
  }
  
  private void finish()
  {
    mMediaBrowser.disconnect();
    mPendingResult.finish();
  }
  
  public void onConnected()
  {
    new MediaControllerCompat(mContext, mMediaBrowser.getSessionToken()).dispatchMediaButtonEvent((KeyEvent)mIntent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
    finish();
  }
  
  public void onConnectionFailed()
  {
    finish();
  }
  
  public void onConnectionSuspended()
  {
    finish();
  }
  
  public void setMediaBrowser(MediaBrowserCompat paramMediaBrowserCompat)
  {
    mMediaBrowser = paramMediaBrowserCompat;
  }
}

/* Location:
 * Qualified Name:     androidx.media.session.MediaButtonReceiver.MediaButtonConnectionCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */