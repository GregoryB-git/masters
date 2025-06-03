package x3;

import android.media.AudioTrack;
import android.media.AudioTrack.StreamEventCallback;
import android.os.Handler;
import android.os.Looper;
import v3.j1.a;

public final class s$k
{
  public final Handler a = new Handler(Looper.myLooper());
  public final a b = new a();
  
  public s$k(s params) {}
  
  public final class a
    extends AudioTrack.StreamEventCallback
  {
    public a() {}
    
    public final void onDataRequest(AudioTrack paramAudioTrack, int paramInt)
    {
      if (!paramAudioTrack.equals(c.u)) {
        return;
      }
      paramAudioTrack = c;
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
      if (!paramAudioTrack.equals(c.u)) {
        return;
      }
      s locals = c;
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
}

/* Location:
 * Qualified Name:     x3.s.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */