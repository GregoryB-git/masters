package P3;

import java.util.Stack;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4235b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f4236c;

    /* renamed from: d, reason: collision with root package name */
    public final e f4237d;

    public e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f4234a = str;
        this.f4235b = str2;
        this.f4236c = stackTraceElementArr;
        this.f4237d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
