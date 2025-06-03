package io.flutter.embedding.engine.plugins.broadcastreceiver;

public abstract interface BroadcastReceiverAware
{
  public abstract void onAttachedToBroadcastReceiver(BroadcastReceiverPluginBinding paramBroadcastReceiverPluginBinding);
  
  public abstract void onDetachedFromBroadcastReceiver();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverAware
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */