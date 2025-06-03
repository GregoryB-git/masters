package io.flutter.view;

import android.view.Choreographer.FrameCallback;
import io.flutter.embedding.engine.FlutterJNI;

public class s$c
  implements Choreographer.FrameCallback
{
  public long o;
  
  public s$c(s params, long paramLong)
  {
    o = paramLong;
  }
  
  public void doFrame(long paramLong)
  {
    paramLong = System.nanoTime() - paramLong;
    if (paramLong < 0L) {
      paramLong = 0L;
    }
    s.c(p).onVsync(paramLong, s.a(p), o);
    s.e(p, this);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.s.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */