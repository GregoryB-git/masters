package x3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import w3.a0;
import w3.a0.a;

public final class s$b
{
  public static void a(AudioTrack paramAudioTrack, a0 parama0)
  {
    parama0 = a;
    parama0.getClass();
    parama0 = a;
    if (!parama0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
      paramAudioTrack.setLogSessionId(parama0);
    }
  }
}

/* Location:
 * Qualified Name:     x3.s.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */