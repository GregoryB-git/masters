package com.ryanheise.audioservice;

import android.app.Activity;
import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ta.a;

public final class b$d
  implements MethodChannel.MethodCallHandler
{
  public Context a;
  public Activity b;
  public final BinaryMessenger c;
  public boolean d;
  public boolean e;
  
  public b$d(BinaryMessenger paramBinaryMessenger)
  {
    c = paramBinaryMessenger;
    new MethodChannel(paramBinaryMessenger, "com.ryanheise.audio_service.client.methods").setMethodCallHandler(this);
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    try
    {
      if (!d)
      {
        Object localObject1 = method;
        int i = ((String)localObject1).hashCode();
        int j = -1;
        if ((i == -804429082) && (((String)localObject1).equals("configure"))) {
          i = 0;
        } else {
          i = -1;
        }
        if (i == 0) {
          if (!e)
          {
            b.t = true;
            Object localObject2 = (Map)((Map)arguments).get("config");
            localObject1 = new ta/a;
            ((a)localObject1).<init>(a.getApplicationContext());
            i = ((Boolean)((Map)localObject2).get("androidNotificationClickStartsActivity")).booleanValue();
            j = ((Boolean)((Map)localObject2).get("androidNotificationOngoing")).booleanValue();
            b = ((Boolean)((Map)localObject2).get("androidResumeOnClick")).booleanValue();
            c = ((String)((Map)localObject2).get("androidNotificationChannelId"));
            d = ((String)((Map)localObject2).get("androidNotificationChannelName"));
            e = ((String)((Map)localObject2).get("androidNotificationChannelDescription"));
            if (((Map)localObject2).get("notificationColor") == null)
            {
              i = -1;
            }
            else
            {
              paramMethodCall = ((Map)localObject2).get("notificationColor");
              if ((paramMethodCall != null) && (!(paramMethodCall instanceof Integer))) {
                paramMethodCall = Integer.valueOf((int)((Long)paramMethodCall).longValue());
              } else {
                paramMethodCall = (Integer)paramMethodCall;
              }
              i = paramMethodCall.intValue();
            }
            f = i;
            g = ((String)((Map)localObject2).get("androidNotificationIcon"));
            h = ((Boolean)((Map)localObject2).get("androidShowNotificationBadge")).booleanValue();
            k = ((Boolean)((Map)localObject2).get("androidStopForegroundOnPause")).booleanValue();
            if (((Map)localObject2).get("artDownscaleWidth") != null) {
              i = ((Integer)((Map)localObject2).get("artDownscaleWidth")).intValue();
            } else {
              i = -1;
            }
            l = i;
            i = j;
            if (((Map)localObject2).get("artDownscaleHeight") != null) {
              i = ((Integer)((Map)localObject2).get("artDownscaleHeight")).intValue();
            }
            m = i;
            localObject2 = (Map)((Map)localObject2).get("androidBrowsableRootExtras");
            if (localObject2 != null)
            {
              paramMethodCall = new org/json/JSONObject;
              paramMethodCall.<init>((Map)localObject2);
              paramMethodCall = paramMethodCall.toString();
            }
            else
            {
              paramMethodCall = null;
            }
            o = paramMethodCall;
            paramMethodCall = b;
            if (paramMethodCall != null) {
              n = paramMethodCall.getClass().getName();
            }
            ((a)localObject1).a();
            paramMethodCall = AudioService.F;
            if (paramMethodCall != null) {
              paramMethodCall.j((a)localObject1);
            }
            b.p = this;
            localObject1 = b.q;
            if (localObject1 == null)
            {
              paramMethodCall = new com/ryanheise/audioservice/b$c;
              paramMethodCall.<init>(c);
              b.q = paramMethodCall;
              AudioService.H = paramMethodCall;
            }
            else
            {
              localObject2 = a;
              paramMethodCall = c;
              if (localObject2 != paramMethodCall)
              {
                b.setMethodCallHandler(null);
                a = paramMethodCall;
                localObject2 = new io/flutter/plugin/common/MethodChannel;
                ((MethodChannel)localObject2).<init>(paramMethodCall, "com.ryanheise.audio_service.handler.methods");
                b = ((MethodChannel)localObject2);
                ((MethodChannel)localObject2).setMethodCallHandler((MethodChannel.MethodCallHandler)localObject1);
              }
              localObject1 = b.q;
              paramMethodCall = e.iterator();
              while (paramMethodCall.hasNext())
              {
                localObject2 = (b.e)paramMethodCall.next();
                b.invokeMethod(a, b, c);
              }
              e.clear();
            }
            if (b.v != null) {
              paramResult.success(b.k(new Object[0]));
            } else {
              b.s = paramResult;
            }
          }
          else
          {
            paramMethodCall = new java/lang/IllegalStateException;
            paramMethodCall.<init>("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
            throw paramMethodCall;
          }
        }
      }
      else
      {
        paramMethodCall = new java/lang/IllegalStateException;
        paramMethodCall.<init>("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
        throw paramMethodCall;
      }
    }
    catch (Exception paramMethodCall)
    {
      paramMethodCall.printStackTrace();
      paramResult.error(paramMethodCall.getMessage(), null, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.b.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */