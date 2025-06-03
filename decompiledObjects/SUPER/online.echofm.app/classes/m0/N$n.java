package m0;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

public final class N$n
{
  public final Handler a = new Handler(Looper.myLooper());
  public final AudioTrack.StreamEventCallback b;
  
  public N$n(final N paramN)
  {
    b = new a(paramN);
  }
  
  public void a(AudioTrack paramAudioTrack)
  {
    Handler localHandler = a;
    Objects.requireNonNull(localHandler);
    Y.a(paramAudioTrack, new Z(localHandler), b);
  }
  
  public void b(AudioTrack paramAudioTrack)
  {
    X.a(paramAudioTrack, b);
    a.removeCallbacksAndMessages(null);
  }
  
  public class a
    extends AudioTrack.StreamEventCallback
  {
    public a(N paramN) {}
    
    public void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
    {
      if (!paramAudioTrack.equals(N.G(c))) {
        return;
      }
      if ((N.H(c) != null) && (N.I(c))) {
        N.H(c).j();
      }
    }
    
    public void onPresentationEnded(AudioTrack paramAudioTrack)
    {
      if (!paramAudioTrack.equals(N.G(c))) {
        return;
      }
      N.J(c, true);
    }
    
    public void onTearDown(AudioTrack paramAudioTrack)
    {
      if (!paramAudioTrack.equals(N.G(c))) {
        return;
      }
      if ((N.H(c) != null) && (N.I(c))) {
        N.H(c).j();
      }
    }
  }
}

/* Location:
 * Qualified Name:     m0.N.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */