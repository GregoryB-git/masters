package x;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import l.b0;
import p2.m0;
import w.f;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final l f16498a;

    /* renamed from: b, reason: collision with root package name */
    public static final r.f<String, Typeface> f16499b;

    public static class a extends m0 {
        public f.e E;

        public a(b0.a aVar) {
            this.E = aVar;
        }
    }

    static {
        l fVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            fVar = new j();
        } else if (i10 >= 28) {
            fVar = new i();
        } else if (i10 >= 26) {
            fVar = new h();
        } else {
            if (i10 >= 24) {
                Method method = g.f16507c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    fVar = new g();
                }
            }
            fVar = new f();
        }
        f16498a = fVar;
        f16499b = new r.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r0.equals(r3) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r7, w.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, l.b0.a r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.a(android.content.Context, w.d$b, android.content.res.Resources, int, java.lang.String, int, int, l.b0$a):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
