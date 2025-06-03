package cb;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import ec.i;
import h;
import h.a;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

public final class c
  implements FlutterPlugin, h, ActivityAware
{
  public b a;
  
  public final void a(b paramb)
  {
    Object localObject = a;
    i.b(localObject);
    localObject = a;
    if (localObject != null)
    {
      i.b(localObject);
      int i;
      if ((getWindowgetAttributesflags & 0x80) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      paramb = a;
      i.b(paramb);
      if (paramb.booleanValue())
      {
        if (i == 0) {
          ((Activity)localObject).getWindow().addFlags(128);
        }
      }
      else if (i != 0) {
        ((Activity)localObject).getWindow().clearFlags(128);
      }
      return;
    }
    throw new a();
  }
  
  public final a isEnabled()
  {
    Object localObject = a;
    i.b(localObject);
    localObject = a;
    if (localObject != null)
    {
      i.b(localObject);
      boolean bool;
      if ((getWindowgetAttributesflags & 0x80) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return new a(Boolean.valueOf(bool));
    }
    throw new a();
  }
  
  public final void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    b localb = a;
    if (localb != null) {
      a = paramActivityPluginBinding.getActivity();
    }
  }
  
  public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "flutterPluginBinding");
    h.a locala = h.g;
    paramFlutterPluginBinding = paramFlutterPluginBinding.getBinaryMessenger();
    i.d(paramFlutterPluginBinding, "getBinaryMessenger(...)");
    h.a.a(locala, paramFlutterPluginBinding, this);
    a = new b();
  }
  
  public final void onDetachedFromActivity()
  {
    b localb = a;
    if (localb != null) {
      a = null;
    }
  }
  
  public final void onDetachedFromActivityForConfigChanges()
  {
    onDetachedFromActivity();
  }
  
  public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    i.e(paramFlutterPluginBinding, "binding");
    h.a locala = h.g;
    paramFlutterPluginBinding = paramFlutterPluginBinding.getBinaryMessenger();
    i.d(paramFlutterPluginBinding, "getBinaryMessenger(...)");
    h.a.a(locala, paramFlutterPluginBinding, null);
    a = null;
  }
  
  public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    i.e(paramActivityPluginBinding, "binding");
    onAttachedToActivity(paramActivityPluginBinding);
  }
}

/* Location:
 * Qualified Name:     cb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */