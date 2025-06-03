package f3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import ec.i;
import f;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.Result;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

public final class b
  extends a
{
  public final String d = "dynamic_icon_flutter";
  
  public final void b(String paramString, List<String> paramList)
  {
    Object localObject = a();
    i.b(localObject);
    PackageManager localPackageManager = ((Context)localObject).getPackageManager();
    i.d(localPackageManager, "getPackageManager(...)");
    localObject = a();
    i.b(localObject);
    String str1 = ((Context)localObject).getPackageName();
    localObject = f.m(str1, ".", paramString);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      int i;
      if (i.a(str2, paramString)) {
        i = 1;
      } else {
        i = 2;
      }
      i.b(str1);
      paramList = new StringBuilder();
      paramList.append(str1);
      paramList.append('.');
      paramList.append(str2);
      localPackageManager.setComponentEnabledSetting(new ComponentName(str1, paramList.toString()), i, 1);
    }
    if (Build.VERSION.SDK_INT >= 26)
    {
      paramString = new Intent();
      i.b(str1);
      paramString.setClassName(str1, ((StringBuilder)localObject).toString());
      paramString.setAction("android.intent.action.MAIN");
      paramString.addFlags(67108864);
      paramString.setFlags(268468224);
      paramList = (Activity)b.get();
      if (paramList != null) {
        paramList.finish();
      }
      paramList = a();
      i.b(paramList);
      v.a.startActivity(paramList, paramString, null);
    }
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    i.e(paramMethodCall, "call");
    i.e(paramResult, "result");
    if (i.a(method, "setIcon")) {
      try
      {
        String str = (String)paramMethodCall.argument("icon");
        paramMethodCall = (List)paramMethodCall.argument("listAvailableIcon");
        if ((paramMethodCall != null) && (str != null)) {
          b(str, paramMethodCall);
        }
        paramResult.success(Boolean.TRUE);
      }
      catch (Exception paramMethodCall)
      {
        paramMethodCall.printStackTrace();
      }
    }
    paramResult.notImplemented();
  }
}

/* Location:
 * Qualified Name:     f3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */