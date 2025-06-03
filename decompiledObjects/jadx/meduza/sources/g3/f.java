package g3;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5813a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5814b;

    /* renamed from: c, reason: collision with root package name */
    public final c f5815c;

    public f() {
        g gVar = new g();
        a aVar = new a();
        this.f5813a = new HashSet();
        this.f5814b = gVar;
        this.f5815c = aVar;
    }

    public static void d(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context, String str, String str2) {
        String a10 = ((g) this.f5814b).a(str);
        return str2 == null || str2.length() == 0 ? new File(context.getDir("lib", 0), a10) : new File(context.getDir("lib", 0), defpackage.g.e(a10, ".", str2));
    }

    public final void b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if ("flutter".length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        d("Beginning load of %s...", "flutter");
        c(context, "flutter", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015f, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.f.c(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
