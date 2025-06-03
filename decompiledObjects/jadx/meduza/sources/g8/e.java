package g8;

import android.app.ActivityManager;
import android.content.Context;
import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m8.t;
import sb.m;
import sb.q;
import sb.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5913a = new e();

    public static t a(e eVar, String str, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        eVar.getClass();
        t.a aVar = new t.a();
        aVar.f10686a = str;
        aVar.f10687b = i10;
        byte b10 = (byte) (aVar.f10690e | 1);
        aVar.f10688c = i11;
        aVar.f10689d = false;
        aVar.f10690e = (byte) (((byte) (b10 | 2)) | 4);
        return aVar.a();
    }

    public static ArrayList b(Context context) {
        i.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = s.f14324a;
        }
        ArrayList m10 = q.m(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = m10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.j(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            t.a aVar = new t.a();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            aVar.f10686a = str2;
            aVar.f10687b = runningAppProcessInfo.pid;
            byte b10 = (byte) (aVar.f10690e | 1);
            aVar.f10688c = runningAppProcessInfo.importance;
            aVar.f10690e = (byte) (b10 | 2);
            aVar.f10689d = i.a(str2, str);
            aVar.f10690e = (byte) (aVar.f10690e | 4);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r5 = android.app.Application.getProcessName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m8.f0.e.d.a.c c(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            ec.i.e(r5, r0)
            int r0 = android.os.Process.myPid()
            java.util.ArrayList r5 = b(r5)
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r1 = r5.hasNext()
            r2 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r5.next()
            r3 = r1
            m8.f0$e$d$a$c r3 = (m8.f0.e.d.a.c) r3
            int r3 = r3.b()
            if (r3 != r0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = r2
        L28:
            if (r3 == 0) goto L11
            goto L2c
        L2b:
            r1 = 0
        L2c:
            m8.f0$e$d$a$c r1 = (m8.f0.e.d.a.c) r1
            if (r1 != 0) goto L52
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r5 < r1) goto L40
            java.lang.String r5 = android.os.Process.myProcessName()
            java.lang.String r1 = "{\n      Process.myProcessName()\n    }"
            ec.i.d(r5, r1)
            goto L4c
        L40:
            r1 = 28
            if (r5 < r1) goto L4a
            java.lang.String r5 = com.google.android.recaptcha.internal.a.j()
            if (r5 != 0) goto L4c
        L4a:
            java.lang.String r5 = ""
        L4c:
            r1 = 12
            m8.t r1 = a(r4, r5, r0, r2, r1)
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.e.c(android.content.Context):m8.f0$e$d$a$c");
    }
}
