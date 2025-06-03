package io.flutter.embedding.engine;

import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.RestorationChannel;
import io.flutter.plugin.platform.PlatformViewsController;
import java.util.Iterator;
import java.util.Set;

class FlutterEngine$1
  implements FlutterEngine.EngineLifecycleListener
{
  public FlutterEngine$1(FlutterEngine paramFlutterEngine) {}
  
  public void onEngineWillDestroy() {}
  
  public void onPreEngineRestart()
  {
    Log.v("FlutterEngine", "onPreEngineRestart()");
    Iterator localIterator = FlutterEngine.access$000(this$0).iterator();
    while (localIterator.hasNext()) {
      ((FlutterEngine.EngineLifecycleListener)localIterator.next()).onPreEngineRestart();
    }
    FlutterEngine.access$100(this$0).onPreEngineRestart();
    FlutterEngine.access$200(this$0).clearData();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngine.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */