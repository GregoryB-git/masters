package ya;

import android.net.ConnectivityManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;

public final class c
  implements MethodChannel.MethodCallHandler
{
  public final a a;
  
  public c(a parama)
  {
    a = parama;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if ("check".equals(method))
    {
      a locala = a;
      paramMethodCall = a.getActiveNetwork();
      paramResult.success(a.a(a.getNetworkCapabilities(paramMethodCall)));
    }
    else
    {
      paramResult.notImplemented();
    }
  }
}

/* Location:
 * Qualified Name:     ya.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */