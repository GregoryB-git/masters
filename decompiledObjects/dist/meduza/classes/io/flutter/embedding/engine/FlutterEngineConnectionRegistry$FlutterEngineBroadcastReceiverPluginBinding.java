package io.flutter.embedding.engine;

import android.content.BroadcastReceiver;
import io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverPluginBinding;

class FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding
  implements BroadcastReceiverPluginBinding
{
  private final BroadcastReceiver broadcastReceiver;
  
  public FlutterEngineConnectionRegistry$FlutterEngineBroadcastReceiverPluginBinding(BroadcastReceiver paramBroadcastReceiver)
  {
    broadcastReceiver = paramBroadcastReceiver;
  }
  
  public BroadcastReceiver getBroadcastReceiver()
  {
    return broadcastReceiver;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineBroadcastReceiverPluginBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */