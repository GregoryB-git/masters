package i2;

import android.app.Activity;
import p2.m0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f7374a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.b f7375b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.c f7376c;

    public h(ClassLoader classLoader, f2.b bVar) {
        this.f7374a = classLoader;
        this.f7375b = bVar;
        this.f7376c = new e2.c(classLoader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (p2.m0.g0(r0.toString(), new i2.f(r4)) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.window.extensions.layout.WindowLayoutComponent a() {
        /*
            r4 = this;
            e2.c r0 = r4.f7376c
            r0.getClass()
            e2.a r1 = new e2.a
            r1.<init>(r0)
            r2 = 1
            r3 = 0
            r1.invoke()     // Catch: java.lang.Throwable -> L11
            r1 = r2
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L23
            e2.b r1 = new e2.b
            r1.<init>(r0)
            java.lang.String r0 = "WindowExtensionsProvider#getWindowExtensions is not valid"
            boolean r0 = p2.m0.g0(r0, r1)
            if (r0 == 0) goto L23
            r0 = r2
            goto L24
        L23:
            r0 = r3
        L24:
            if (r0 == 0) goto L42
            i2.g r0 = new i2.g
            r0.<init>(r4)
            java.lang.String r1 = "WindowExtensions#getWindowLayoutComponent is not valid"
            boolean r0 = p2.m0.g0(r1, r0)
            if (r0 == 0) goto L42
            i2.d r0 = new i2.d
            r0.<init>(r4)
            java.lang.String r1 = "FoldingFeature class is not valid"
            boolean r0 = p2.m0.g0(r1, r0)
            if (r0 == 0) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r3
        L43:
            if (r0 != 0) goto L46
            goto L8f
        L46:
            f2.d r0 = f2.d.f5311a
            r0.getClass()
            int r0 = f2.d.a()
            if (r0 != r2) goto L56
            boolean r3 = r4.b()
            goto L8f
        L56:
            r1 = 2
            if (r1 > r0) goto L60
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 > r1) goto L60
            r0 = r2
            goto L61
        L60:
            r0 = r3
        L61:
            if (r0 == 0) goto L8f
            boolean r0 = r4.b()
            if (r0 == 0) goto L8d
            java.lang.String r0 = "WindowLayoutComponent#addWindowLayoutInfoListener("
            java.lang.StringBuilder r0 = defpackage.f.l(r0)
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ", androidx.window.extensions.core.util.function.Consumer) is not valid"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            i2.f r1 = new i2.f
            r1.<init>(r4)
            boolean r0 = p2.m0.g0(r0, r1)
            if (r0 == 0) goto L8d
            goto L8e
        L8d:
            r2 = r3
        L8e:
            r3 = r2
        L8f:
            r0 = 0
            if (r3 == 0) goto L9a
            androidx.window.extensions.WindowExtensions r1 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()     // Catch: java.lang.UnsupportedOperationException -> L9a
            androidx.window.extensions.layout.WindowLayoutComponent r0 = r1.getWindowLayoutComponent()     // Catch: java.lang.UnsupportedOperationException -> L9a
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.h.a():androidx.window.extensions.layout.WindowLayoutComponent");
    }

    public final boolean b() {
        StringBuilder l10 = defpackage.f.l("WindowLayoutComponent#addWindowLayoutInfoListener(");
        l10.append(Activity.class.getName());
        l10.append(", java.util.function.Consumer) is not valid");
        return m0.g0(l10.toString(), new e(this));
    }
}
