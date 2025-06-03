package e7;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f4511a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4512b;

    /* renamed from: c, reason: collision with root package name */
    public final k4 f4513c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4514d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f4515e;
    public final /* synthetic */ l4 f;

    public n4(l4 l4Var, String str, URL url, byte[] bArr, HashMap hashMap, k4 k4Var) {
        this.f = l4Var;
        m6.j.e(str);
        this.f4511a = url;
        this.f4512b = bArr;
        this.f4513c = k4Var;
        this.f4514d = str;
        this.f4515e = hashMap;
    }

    public final void a(final int i10, final IOException iOException, final byte[] bArr, final Map map) {
        this.f.zzl().u(new Runnable() { // from class: e7.m4
            @Override // java.lang.Runnable
            public final void run() {
                n4 n4Var = n4.this;
                n4Var.f4513c.c(n4Var.f4514d, i10, iOException, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.n4.run():void");
    }
}
