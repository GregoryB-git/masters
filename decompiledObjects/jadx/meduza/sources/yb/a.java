package yb;

import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: yb.a$a, reason: collision with other inner class name */
    public static final class C0265a {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f17465a;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            if (ec.i.a(r7.length == 1 ? r7[0] : null, java.lang.Throwable.class) != false) goto L14;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                ec.i.b(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lc:
                r5 = 0
                if (r4 >= r2) goto L3b
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = ec.i.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L33
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "getParameterTypes(...)"
                ec.i.d(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L2c
                r5 = r7[r3]
            L2c:
                boolean r5 = ec.i.a(r5, r0)
                if (r5 == 0) goto L33
                goto L34
            L33:
                r8 = r3
            L34:
                if (r8 == 0) goto L38
                r5 = r6
                goto L3b
            L38:
                int r4 = r4 + 1
                goto Lc
            L3b:
                yb.a.C0265a.f17465a = r5
                int r0 = r1.length
            L3e:
                if (r3 >= r0) goto L52
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = ec.i.a(r2, r4)
                if (r2 == 0) goto L4f
                goto L52
            L4f:
                int r3 = r3 + 1
                goto L3e
            L52:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yb.a.C0265a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.e(th, "cause");
        i.e(th2, Constants.EXCEPTION);
        Method method = C0265a.f17465a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }
}
