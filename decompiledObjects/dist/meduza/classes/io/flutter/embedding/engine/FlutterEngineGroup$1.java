package io.flutter.embedding.engine;

import java.util.List;

class FlutterEngineGroup$1
  implements FlutterEngine.EngineLifecycleListener
{
  public void onEngineWillDestroy()
  {
    this$0.activeEngines.remove(val$engineToCleanUpOnDestroy);
  }
  
  public void onPreEngineRestart() {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineGroup.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */