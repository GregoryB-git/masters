package a4;

import android.media.MediaDrm;
import android.media.MediaDrm.PlaybackComponent;
import android.media.metrics.LogSessionId;
import w3.a0;
import w3.a0.a;

public final class s$a
{
  public static boolean a(MediaDrm paramMediaDrm, String paramString)
  {
    return r.j(paramMediaDrm, paramString);
  }
  
  public static void b(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, a0 parama0)
  {
    parama0 = a;
    parama0.getClass();
    parama0 = a;
    if (!parama0.equals(LogSessionId.LOG_SESSION_ID_NONE))
    {
      paramMediaDrm = paramMediaDrm.getPlaybackComponent(paramArrayOfByte);
      paramMediaDrm.getClass();
      paramMediaDrm.setLogSessionId(parama0);
    }
  }
}

/* Location:
 * Qualified Name:     a4.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */