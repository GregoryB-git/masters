package m0;

import android.media.AudioRouting;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import g0.a;

public final class N$k
{
  public final AudioTrack a;
  public final i b;
  public AudioRouting.OnRoutingChangedListener c;
  
  public N$k(AudioTrack paramAudioTrack, i parami)
  {
    a = paramAudioTrack;
    b = parami;
    c = new W(this);
    parami = new Handler(Looper.myLooper());
    S.a(paramAudioTrack, c, parami);
  }
  
  private void b(AudioRouting paramAudioRouting)
  {
    if (c == null) {
      return;
    }
    if (V.a(paramAudioRouting) != null) {
      b.i(V.a(paramAudioRouting));
    }
  }
  
  public void c()
  {
    U.a(a, T.a(a.e(c)));
    c = null;
  }
}

/* Location:
 * Qualified Name:     m0.N.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */