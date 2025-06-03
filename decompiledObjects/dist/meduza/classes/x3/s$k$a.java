package x3;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;
import v3.j1.a;

public final class s$k$a
  extends AudioTrack.StreamEventCallback
{
  public s$k$a(s.k paramk) {}
  
  public final void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
  {
    if (!paramAudioTrack.equals(a.c.u)) {
      return;
    }
    paramAudioTrack = a.c;
    m.c localc = r;
    if ((localc != null) && (U))
    {
      paramAudioTrack = a.V0;
      if (paramAudioTrack != null) {
        paramAudioTrack.b();
      }
    }
  }
  
  public final void onTearDown(AudioTrack paramAudioTrack)
  {
    if (!paramAudioTrack.equals(a.c.u)) {
      return;
    }
    s locals = a.c;
    paramAudioTrack = r;
    if ((paramAudioTrack != null) && (U))
    {
      paramAudioTrack = a.V0;
      if (paramAudioTrack != null) {
        paramAudioTrack.b();
      }
    }
  }
}

/* Location:
 * Qualified Name:     x3.s.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */