package io.flutter.embedding.engine.renderer;

import b1.d;
import b1.o;
import ec.i;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.SurfaceProducer.Callback;
import java.util.Iterator;
import java.util.List;

class FlutterRenderer$2
  implements d
{
  public FlutterRenderer$2(FlutterRenderer paramFlutterRenderer) {}
  
  public void onCreate(o paramo)
  {
    i.e(paramo, "owner");
  }
  
  public void onDestroy(o paramo)
  {
    i.e(paramo, "owner");
  }
  
  public void onPause(o paramo)
  {
    i.e(paramo, "owner");
  }
  
  public void onResume(o paramo)
  {
    Log.v("FlutterRenderer", "onResume called; notifying SurfaceProducers");
    Iterator localIterator = FlutterRenderer.access$100(this$0).iterator();
    while (localIterator.hasNext())
    {
      paramo = (FlutterRenderer.ImageReaderSurfaceProducer)localIterator.next();
      if ((FlutterRenderer.ImageReaderSurfaceProducer.access$200(paramo) != null) && (FlutterRenderer.ImageReaderSurfaceProducer.access$300(paramo)))
      {
        FlutterRenderer.ImageReaderSurfaceProducer.access$302(paramo, false);
        FlutterRenderer.ImageReaderSurfaceProducer.access$200(paramo).onSurfaceAvailable();
      }
    }
  }
  
  public void onStart(o paramo)
  {
    i.e(paramo, "owner");
  }
  
  public void onStop(o paramo)
  {
    i.e(paramo, "owner");
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */