package y2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import o2.j;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17392a;

    static {
        String f = o2.j.f("ProcessUtils");
        ec.i.d(f, "tagWithPrefix(\"ProcessUtils\")");
        f17392a = f;
    }

    public static final boolean a(Context context, androidx.work.a aVar) {
        String str;
        Object obj;
        ec.i.e(context, "context");
        ec.i.e(aVar, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f17359a.a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, o2.p.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                ec.i.b(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                o2.j d10 = o2.j.d();
                String str2 = f17392a;
                if (((j.a) d10).f11721c <= 3) {
                    Log.d(str2, "Unable to check ActivityThread for processName", th);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            ec.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
            str = null;
        }
        return ec.i.a(str, context.getApplicationInfo().processName);
    }
}
