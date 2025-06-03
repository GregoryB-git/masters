package io.flutter.embedding.engine.renderer;

import f;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;

final class FlutterRenderer$TextureFinalizerRunnable
  implements Runnable
{
  private final FlutterJNI flutterJNI;
  private final long id;
  
  public FlutterRenderer$TextureFinalizerRunnable(long paramLong, FlutterJNI paramFlutterJNI)
  {
    id = paramLong;
    flutterJNI = paramFlutterJNI;
  }
  
  public void run()
  {
    if (!flutterJNI.isAttached()) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Releasing a Texture (");
    localStringBuilder.append(id);
    localStringBuilder.append(").");
    Log.v("FlutterRenderer", localStringBuilder.toString());
    flutterJNI.unregisterTexture(id);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.TextureFinalizerRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */