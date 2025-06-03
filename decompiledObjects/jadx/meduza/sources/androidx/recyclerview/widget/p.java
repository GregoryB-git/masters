package androidx.recyclerview.widget;

import android.view.View;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b f1363a;

    /* renamed from: b, reason: collision with root package name */
    public a f1364b = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1365a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f1366b;

        /* renamed from: c, reason: collision with root package name */
        public int f1367c;

        /* renamed from: d, reason: collision with root package name */
        public int f1368d;

        /* renamed from: e, reason: collision with root package name */
        public int f1369e;

        public final boolean a() {
            int i10 = this.f1365a;
            int i11 = 2;
            if ((i10 & 7) != 0) {
                int i12 = this.f1368d;
                int i13 = this.f1366b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 0) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0) {
                int i14 = this.f1368d;
                int i15 = this.f1367c;
                if ((((i14 > i15 ? 1 : i14 == i15 ? 2 : 4) << 4) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 1792) != 0) {
                int i16 = this.f1369e;
                int i17 = this.f1366b;
                if ((((i16 > i17 ? 1 : i16 == i17 ? 2 : 4) << 8) & i10) == 0) {
                    return false;
                }
            }
            if ((i10 & 28672) != 0) {
                int i18 = this.f1369e;
                int i19 = this.f1367c;
                if (i18 > i19) {
                    i11 = 1;
                } else if (i18 != i19) {
                    i11 = 4;
                }
                if ((i10 & (i11 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i10);

        int e(View view);
    }

    public p(b bVar) {
        this.f1363a = bVar;
    }

    public final View a(int i10, int i11, int i12, int i13) {
        int b10 = this.f1363a.b();
        int c10 = this.f1363a.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View d10 = this.f1363a.d(i10);
            int a10 = this.f1363a.a(d10);
            int e10 = this.f1363a.e(d10);
            a aVar = this.f1364b;
            aVar.f1366b = b10;
            aVar.f1367c = c10;
            aVar.f1368d = a10;
            aVar.f1369e = e10;
            if (i12 != 0) {
                aVar.f1365a = i12 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i13 != 0) {
                a aVar2 = this.f1364b;
                aVar2.f1365a = i13 | 0;
                if (aVar2.a()) {
                    view = d10;
                }
            }
            i10 += i14;
        }
        return view;
    }
}
