package ua;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

public class c
  implements FlutterPlugin
{
  public MethodChannel a;
  public d b;
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    Context localContext = paramFlutterPluginBinding.getApplicationContext();
    Object localObject = paramFlutterPluginBinding.getBinaryMessenger();
    b = new d((BinaryMessenger)localObject, localContext);
    localObject = new MethodChannel((BinaryMessenger)localObject, "com.ryanheise.just_audio.methods");
    a = ((MethodChannel)localObject);
    ((MethodChannel)localObject).setMethodCallHandler(b);
    paramFlutterPluginBinding.getFlutterEngine().addEngineLifecycleListener(new a());
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    b.a();
    b = null;
    a.setMethodCallHandler(null);
  }
  
  public final class a
    implements FlutterEngine.EngineLifecycleListener
  {
    public a() {}
    
    public final void onEngineWillDestroy() {}
    
    public final void onPreEngineRestart()
    {
      b.a();
    }
  }
}

/* Location:
 * Qualified Name:     ua.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */