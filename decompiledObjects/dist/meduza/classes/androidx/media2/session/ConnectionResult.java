package androidx.media2.session;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer.TrackInfo;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.List;

class ConnectionResult
  extends CustomVersionedParcelable
{
  public MediaMetadata A;
  public int B;
  public int a;
  public IMediaSession b;
  public IBinder c;
  public PendingIntent d;
  public int e;
  public MediaItem f;
  public MediaItem g;
  public long h;
  public long i;
  public float j;
  public long k;
  public MediaController.PlaybackInfo l;
  public int m;
  public int n;
  public ParcelImplListSlice o;
  public SessionCommandGroup p;
  public int q;
  public int r;
  public int s;
  public Bundle t;
  public VideoSize u;
  public List<SessionPlayer.TrackInfo> v;
  public SessionPlayer.TrackInfo w;
  public SessionPlayer.TrackInfo x;
  public SessionPlayer.TrackInfo y;
  public SessionPlayer.TrackInfo z;
}

/* Location:
 * Qualified Name:     androidx.media2.session.ConnectionResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */