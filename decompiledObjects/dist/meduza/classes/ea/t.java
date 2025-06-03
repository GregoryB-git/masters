package ea;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.recaptcha.internal.a;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.m;
import sb.q;
import v6.f;

public final class t
{
  public static ArrayList a(Context paramContext)
  {
    int i = getApplicationInfouid;
    String str1 = getApplicationInfoprocessName;
    Object localObject = paramContext.getSystemService("activity");
    boolean bool = localObject instanceof ActivityManager;
    paramContext = null;
    if (bool) {
      localObject = (ActivityManager)localObject;
    } else {
      localObject = null;
    }
    if (localObject != null) {
      paramContext = ((ActivityManager)localObject).getRunningAppProcesses();
    }
    localObject = paramContext;
    if (paramContext == null) {
      localObject = sb.s.a;
    }
    paramContext = q.m((List)localObject);
    localObject = new ArrayList();
    Iterator localIterator = paramContext.iterator();
    while (localIterator.hasNext())
    {
      paramContext = localIterator.next();
      int j;
      if (uid == i) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        ((ArrayList)localObject).add(paramContext);
      }
    }
    paramContext = new ArrayList(m.j((Iterable)localObject));
    localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      String str2 = processName;
      i.d(str2, "runningAppProcessInfo.processName");
      paramContext.add(new s(pid, importance, str2, i.a(processName, str1)));
    }
    return paramContext;
  }
  
  public static String b()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 33)
    {
      str = Process.myProcessName();
      i.d(str, "myProcessName()");
      return str;
    }
    if (i >= 28)
    {
      str = a.j();
      if (str != null) {
        return str;
      }
    }
    String str = f.a();
    if (str != null) {
      return str;
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     ea.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */