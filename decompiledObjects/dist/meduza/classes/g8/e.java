package g8;

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
import m8.f0.e.d.a.c;
import m8.t;
import m8.t.a;
import sb.m;
import sb.q;
import sb.s;

public final class e
{
  public static final e a = new e();
  
  public static t a(e parame, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt3 & 0x2) != 0) {
      paramInt1 = 0;
    }
    if ((paramInt3 & 0x4) != 0) {
      paramInt2 = 0;
    }
    parame.getClass();
    parame = new t.a();
    a = paramString;
    b = paramInt1;
    paramInt1 = (byte)(e | 0x1);
    c = paramInt2;
    paramInt1 = (byte)(paramInt1 | 0x2);
    d = false;
    e = ((byte)(byte)(paramInt1 | 0x4));
    return parame.a();
  }
  
  public static ArrayList b(Context paramContext)
  {
    i.e(paramContext, "context");
    int i = getApplicationInfouid;
    String str1 = getApplicationInfoprocessName;
    Object localObject1 = paramContext.getSystemService("activity");
    boolean bool = localObject1 instanceof ActivityManager;
    paramContext = null;
    if (bool) {
      localObject1 = (ActivityManager)localObject1;
    } else {
      localObject1 = null;
    }
    if (localObject1 != null) {
      paramContext = ((ActivityManager)localObject1).getRunningAppProcesses();
    }
    localObject1 = paramContext;
    if (paramContext == null) {
      localObject1 = s.a;
    }
    paramContext = q.m((List)localObject1);
    localObject1 = new ArrayList();
    paramContext = paramContext.iterator();
    int j;
    Object localObject2;
    for (;;)
    {
      bool = paramContext.hasNext();
      j = 1;
      if (!bool) {
        break;
      }
      localObject2 = paramContext.next();
      if (uid != i) {
        j = 0;
      }
      if (j != 0) {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    paramContext = new ArrayList(m.j((Iterable)localObject1));
    localObject1 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
      t.a locala = new t.a();
      String str2 = processName;
      if (str2 != null)
      {
        a = str2;
        b = pid;
        j = (byte)(e | 0x1);
        c = importance;
        e = ((byte)(byte)(j | 0x2));
        d = i.a(str2, str1);
        e = ((byte)(byte)(e | 0x4));
        paramContext.add(locala.a());
      }
      else
      {
        throw new NullPointerException("Null processName");
      }
    }
    return paramContext;
  }
  
  public final f0.e.d.a.c c(Context paramContext)
  {
    i.e(paramContext, "context");
    int i = Process.myPid();
    Object localObject = b(paramContext).iterator();
    int j;
    while (((Iterator)localObject).hasNext())
    {
      paramContext = ((Iterator)localObject).next();
      if (((f0.e.d.a.c)paramContext).b() == i) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0) {
        break label64;
      }
    }
    paramContext = null;
    label64:
    localObject = (f0.e.d.a.c)paramContext;
    paramContext = (Context)localObject;
    if (localObject == null)
    {
      j = Build.VERSION.SDK_INT;
      if (j >= 33)
      {
        paramContext = Process.myProcessName();
        i.d(paramContext, "{\n      Process.myProcessName()\n    }");
      }
      else if (j >= 28)
      {
        localObject = a.j();
        paramContext = (Context)localObject;
        if (localObject != null) {}
      }
      else
      {
        paramContext = "";
      }
      paramContext = a(this, paramContext, i, 0, 12);
    }
    return paramContext;
  }
}

/* Location:
 * Qualified Name:     g8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */