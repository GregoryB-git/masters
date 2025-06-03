package H5;

import A5.a.b;
import B5.c;
import D5.r;
import D5.r.b;
import E5.k.d;
import E5.m;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w1.w;
import w1.x;

public class a
  implements A5.a, B5.a, m, r.b
{
  public final r a;
  public final PackageManager b;
  public c c;
  public Map d;
  public Map e = new HashMap();
  
  public a(r paramr)
  {
    a = paramr;
    b = b;
    paramr.b(this);
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!e.containsKey(Integer.valueOf(paramInt1))) {
      return false;
    }
    if (paramInt2 == -1) {
      paramIntent = paramIntent.getStringExtra("android.intent.extra.PROCESS_TEXT");
    } else {
      paramIntent = null;
    }
    ((k.d)e.remove(Integer.valueOf(paramInt1))).a(paramIntent);
    return true;
  }
  
  public Map b()
  {
    if (d == null) {
      d();
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, ((ResolveInfo)d.get(str)).loadLabel(b).toString());
    }
    return localHashMap;
  }
  
  public void c(String paramString1, String paramString2, boolean paramBoolean, k.d paramd)
  {
    if (c == null)
    {
      paramd.b("error", "Plugin not bound to an Activity", null);
      return;
    }
    Object localObject = d;
    if (localObject == null)
    {
      paramd.b("error", "Can not process text actions before calling queryTextActions", null);
      return;
    }
    localObject = (ResolveInfo)((Map)localObject).get(paramString1);
    if (localObject == null)
    {
      paramd.b("error", "Text processing activity not found", null);
      return;
    }
    int i = paramd.hashCode();
    e.put(Integer.valueOf(i), paramd);
    paramString1 = new Intent();
    paramd = activityInfo;
    paramString1.setClassName(packageName, name);
    paramString1.setAction("android.intent.action.PROCESS_TEXT");
    paramString1.setType("text/plain");
    paramString1.putExtra("android.intent.extra.PROCESS_TEXT", paramString2);
    paramString1.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", paramBoolean);
    c.c().startActivityForResult(paramString1, i);
  }
  
  public final void d()
  {
    d = new HashMap();
    int i = Build.VERSION.SDK_INT;
    Object localObject = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    if (i >= 33) {
      localObject = x.a(b, (Intent)localObject, w.a(0L));
    } else {
      localObject = b.queryIntentActivities((Intent)localObject, 0);
    }
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      localObject = activityInfo.name;
      localResolveInfo.loadLabel(b).toString();
      d.put(localObject, localResolveInfo);
    }
  }
  
  public void onAttachedToActivity(c paramc)
  {
    c = paramc;
    paramc.h(this);
  }
  
  public void onAttachedToEngine(a.b paramb) {}
  
  public void onDetachedFromActivity()
  {
    c.d(this);
    c = null;
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    c.d(this);
    c = null;
  }
  
  public void onDetachedFromEngine(a.b paramb) {}
  
  public void onReattachedToActivityForConfigChanges(c paramc)
  {
    c = paramc;
    paramc.h(this);
  }
}

/* Location:
 * Qualified Name:     H5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */