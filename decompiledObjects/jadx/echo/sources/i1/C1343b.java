package i1;

import X2.AbstractC0706y;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343b {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14747d = Pattern.compile("\\s+");

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0706y f14748e = AbstractC0706y.Z("auto", "none");

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0706y f14749f = AbstractC0706y.a0("dot", "sesame", "circle");

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC0706y f14750g = AbstractC0706y.Z("filled", "open");

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC0706y f14751h = AbstractC0706y.a0("after", "before", "outside");

    /* renamed from: a, reason: collision with root package name */
    public final int f14752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14754c;

    public C1343b(int i7, int i8, int i9) {
        this.f14752a = i7;
        this.f14753b = i8;
        this.f14754c = i9;
    }

    public static C1343b a(String str) {
        if (str == null) {
            return null;
        }
        String e7 = W2.c.e(str.trim());
        if (e7.isEmpty()) {
            return null;
        }
        return b(AbstractC0706y.U(TextUtils.split(e7, f14747d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i1.C1343b b(X2.AbstractC0706y r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1343b.b(X2.y):i1.b");
    }
}
