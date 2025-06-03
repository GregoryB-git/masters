package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import c2.h;
import c2.i;
import c2.i.a;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x6.b;

public class TracingControllerManager
  implements Disposable
{
  public static final String LOG_TAG = "TracingControllerMan";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
  public static i tracingController;
  public TracingControllerChannelDelegate channelDelegate;
  public InAppWebViewFlutterPlugin plugin;
  
  public TracingControllerManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    plugin = paramInAppWebViewFlutterPlugin;
    channelDelegate = new TracingControllerChannelDelegate(this, new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_tracingcontroller"));
  }
  
  public static h buildTracingConfig(TracingSettings paramTracingSettings)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = categories.iterator();
    int i = 0;
    Object localObject;
    do
    {
      boolean bool = localIterator.hasNext();
      j = 1;
      if (!bool) {
        break;
      }
      localObject = localIterator.next();
      if ((localObject instanceof String)) {
        localArrayList.addAll(Arrays.asList(new String[] { (String)localObject }));
      }
    } while (!(localObject instanceof Integer));
    int k = ((Integer)localObject).intValue();
    int m = 0;
    int j = i;
    for (;;)
    {
      i = j;
      if (m >= 1) {
        break;
      }
      j |= new int[] { k }[m];
      m++;
    }
    paramTracingSettings = tracingMode;
    if (paramTracingSettings != null) {
      j = paramTracingSettings.intValue();
    }
    return new h(i, j, localArrayList);
  }
  
  public static void init()
  {
    if ((tracingController == null) && (b.c0("TRACING_CONTROLLER_BASIC_USAGE"))) {
      tracingController = i.a.a;
    }
  }
  
  public void dispose()
  {
    TracingControllerChannelDelegate localTracingControllerChannelDelegate = channelDelegate;
    if (localTracingControllerChannelDelegate != null)
    {
      localTracingControllerChannelDelegate.dispose();
      channelDelegate = null;
    }
    plugin = null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.tracing.TracingControllerManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */