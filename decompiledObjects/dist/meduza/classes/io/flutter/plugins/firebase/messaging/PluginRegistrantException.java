package io.flutter.plugins.firebase.messaging;

class PluginRegistrantException
  extends RuntimeException
{
  public PluginRegistrantException()
  {
    super("PluginRegistrantCallback is not set. Did you forget to call FlutterFirebaseMessagingBackgroundService.setPluginRegistrant? See the documentation for instructions.");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.PluginRegistrantException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */