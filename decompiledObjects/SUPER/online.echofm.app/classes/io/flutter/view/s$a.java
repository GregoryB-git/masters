package io.flutter.view;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import io.flutter.embedding.engine.FlutterJNI.b;

public class s$a
  implements FlutterJNI.b
{
  public s$a(s params) {}
  
  public void a(long paramLong)
  {
    Choreographer.getInstance().postFrameCallback(b(paramLong));
  }
  
  public final Choreographer.FrameCallback b(long paramLong)
  {
    if (s.d(a) != null)
    {
      s.c.a(s.d(a), paramLong);
      s.c localc = s.d(a);
      s.e(a, null);
      return localc;
    }
    return new s.c(a, paramLong);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */