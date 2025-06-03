package ua;

import android.content.Context;
import g;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d
  implements MethodChannel.MethodCallHandler
{
  public final Context a;
  public final BinaryMessenger b;
  public final HashMap c = new HashMap();
  
  public d(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    a = paramContext;
    b = paramBinaryMessenger;
  }
  
  public final void a()
  {
    Iterator localIterator = new ArrayList(c.values()).iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).V();
    }
    c.clear();
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str = method;
    str.getClass();
    int i = str.hashCode();
    if (i != 3237136)
    {
      if (i != 1999985120)
      {
        if ((i == 2146443344) && (str.equals("disposeAllPlayers")))
        {
          i = 2;
          break label94;
        }
      }
      else if (str.equals("disposePlayer"))
      {
        i = 1;
        break label94;
      }
    }
    else {
      if (str.equals("init")) {
        break label91;
      }
    }
    i = -1;
    break label94;
    label91:
    i = 0;
    label94:
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          paramResult.notImplemented();
          return;
        }
        a();
        paramMethodCall = new HashMap();
      }
      else
      {
        str = (String)paramMethodCall.argument("id");
        paramMethodCall = (a)c.get(str);
        if (paramMethodCall != null)
        {
          paramMethodCall.V();
          c.remove(str);
        }
        paramMethodCall = new HashMap();
      }
      paramResult.success(paramMethodCall);
    }
    else
    {
      str = (String)paramMethodCall.argument("id");
      if (c.containsKey(str))
      {
        paramResult.error(g.e("Platform player ", str, " already exists"), null, null);
      }
      else
      {
        List localList = (List)paramMethodCall.argument("androidAudioEffects");
        c.put(str, new a(a, b, str, (Map)paramMethodCall.argument("audioLoadConfiguration"), localList, (Boolean)paramMethodCall.argument("androidOffloadSchedulingEnabled")));
        paramResult.success(null);
      }
    }
  }
}

/* Location:
 * Qualified Name:     ua.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */