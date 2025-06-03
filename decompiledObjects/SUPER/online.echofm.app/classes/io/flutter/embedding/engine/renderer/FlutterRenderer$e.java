package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;
import t5.b;

public final class FlutterRenderer$e
  implements Runnable
{
  public final long o;
  public final FlutterJNI p;
  
  public FlutterRenderer$e(long paramLong, FlutterJNI paramFlutterJNI)
  {
    o = paramLong;
    p = paramFlutterJNI;
  }
  
  public void run()
  {
    if (!p.isAttached()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Releasing a Texture (");
    localStringBuilder.append(o);
    localStringBuilder.append(").");
    b.f("FlutterRenderer", localStringBuilder.toString());
    p.unregisterTexture(o);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */