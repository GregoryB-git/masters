package m0;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;

public class N$n$a
  extends AudioTrack.StreamEventCallback
{
  public N$n$a(N.n paramn, N paramN) {}
  
  public void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
  {
    if (!paramAudioTrack.equals(N.G(b.c))) {
      return;
    }
    if ((N.H(b.c) != null) && (N.I(b.c))) {
      N.H(b.c).j();
    }
  }
  
  public void onPresentationEnded(AudioTrack paramAudioTrack)
  {
    if (!paramAudioTrack.equals(N.G(b.c))) {
      return;
    }
    N.J(b.c, true);
  }
  
  public void onTearDown(AudioTrack paramAudioTrack)
  {
    if (!paramAudioTrack.equals(N.G(b.c))) {
      return;
    }
    if ((N.H(b.c) != null) && (N.I(b.c))) {
      N.H(b.c).j();
    }
  }
}

/* Location:
 * Qualified Name:     m0.N.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */