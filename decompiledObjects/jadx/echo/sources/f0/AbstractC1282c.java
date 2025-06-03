package f0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1282c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14121a = M.w0(0);

    /* renamed from: b, reason: collision with root package name */
    public static final String f14122b = M.w0(1);

    /* renamed from: c, reason: collision with root package name */
    public static final String f14123c = M.w0(2);

    /* renamed from: d, reason: collision with root package name */
    public static final String f14124d = M.w0(3);

    /* renamed from: e, reason: collision with root package name */
    public static final String f14125e = M.w0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C1284e c1284e : (C1284e[]) spanned.getSpans(0, spanned.length(), C1284e.class)) {
            arrayList.add(b(spanned, c1284e, 1, c1284e.b()));
        }
        for (C1286g c1286g : (C1286g[]) spanned.getSpans(0, spanned.length(), C1286g.class)) {
            arrayList.add(b(spanned, c1286g, 2, c1286g.b()));
        }
        for (C1283d c1283d : (C1283d[]) spanned.getSpans(0, spanned.length(), C1283d.class)) {
            arrayList.add(b(spanned, c1283d, 3, null));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object obj, int i7, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f14121a, spanned.getSpanStart(obj));
        bundle2.putInt(f14122b, spanned.getSpanEnd(obj));
        bundle2.putInt(f14123c, spanned.getSpanFlags(obj));
        bundle2.putInt(f14124d, i7);
        if (bundle != null) {
            bundle2.putBundle(f14125e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        Object a7;
        int i7 = bundle.getInt(f14121a);
        int i8 = bundle.getInt(f14122b);
        int i9 = bundle.getInt(f14123c);
        int i10 = bundle.getInt(f14124d, -1);
        Bundle bundle2 = bundle.getBundle(f14125e);
        if (i10 == 1) {
            a7 = C1284e.a((Bundle) AbstractC1297a.e(bundle2));
        } else if (i10 == 2) {
            a7 = C1286g.a((Bundle) AbstractC1297a.e(bundle2));
        } else if (i10 != 3) {
            return;
        } else {
            a7 = new C1283d();
        }
        spannable.setSpan(a7, i7, i8, i9);
    }
}
