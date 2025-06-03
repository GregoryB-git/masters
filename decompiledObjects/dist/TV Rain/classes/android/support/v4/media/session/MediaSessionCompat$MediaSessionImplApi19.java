package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaMetadataEditor;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.RatingCompat;
import androidx.annotation.RequiresApi;
import androidx.versionedparcelable.VersionedParcelable;

@RequiresApi(19)
class MediaSessionCompat$MediaSessionImplApi19
  extends MediaSessionCompat.MediaSessionImplApi18
{
  public MediaSessionCompat$MediaSessionImplApi19(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, VersionedParcelable paramVersionedParcelable, Bundle paramBundle)
  {
    super(paramContext, paramString, paramComponentName, paramPendingIntent, paramVersionedParcelable, paramBundle);
  }
  
  public RemoteControlClient.MetadataEditor buildRccMetadata(Bundle paramBundle)
  {
    RemoteControlClient.MetadataEditor localMetadataEditor = super.buildRccMetadata(paramBundle);
    PlaybackStateCompat localPlaybackStateCompat = mState;
    long l;
    if (localPlaybackStateCompat == null) {
      l = 0L;
    } else {
      l = localPlaybackStateCompat.getActions();
    }
    if ((l & 0x80) != 0L) {
      localMetadataEditor.addEditableKey(268435457);
    }
    if (paramBundle == null) {
      return localMetadataEditor;
    }
    if (paramBundle.containsKey("android.media.metadata.YEAR")) {
      localMetadataEditor.putLong(8, paramBundle.getLong("android.media.metadata.YEAR"));
    }
    if (paramBundle.containsKey("android.media.metadata.RATING")) {
      localMetadataEditor.putObject(101, paramBundle.getParcelable("android.media.metadata.RATING"));
    }
    if (paramBundle.containsKey("android.media.metadata.USER_RATING")) {
      localMetadataEditor.putObject(268435457, paramBundle.getParcelable("android.media.metadata.USER_RATING"));
    }
    return localMetadataEditor;
  }
  
  public int getRccTransportControlFlagsFromActions(long paramLong)
  {
    int i = super.getRccTransportControlFlagsFromActions(paramLong);
    int j = i;
    if ((paramLong & 0x80) != 0L) {
      j = i | 0x200;
    }
    return j;
  }
  
  public void setCallback(MediaSessionCompat.Callback paramCallback, Handler paramHandler)
  {
    super.setCallback(paramCallback, paramHandler);
    if (paramCallback == null)
    {
      mRcc.setMetadataUpdateListener(null);
    }
    else
    {
      paramCallback = new RemoteControlClient.OnMetadataUpdateListener()
      {
        public void onMetadataUpdate(int paramAnonymousInt, Object paramAnonymousObject)
        {
          if ((paramAnonymousInt == 268435457) && ((paramAnonymousObject instanceof Rating))) {
            postToHandler(19, -1, -1, RatingCompat.fromRating(paramAnonymousObject), null);
          }
        }
      };
      mRcc.setMetadataUpdateListener(paramCallback);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */