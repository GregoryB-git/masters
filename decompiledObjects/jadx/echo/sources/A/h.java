package A;

import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import z.e;
import z.h;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final n f10a;

    /* renamed from: b, reason: collision with root package name */
    public static final t.g f11b;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        public h.b f12a;

        public a(h.b bVar) {
            this.f12a = bVar;
        }

        @Override // F.g.c
        public void a(int i7) {
            h.b bVar = this.f12a;
            if (bVar != null) {
                bVar.f(i7);
            }
        }

        @Override // F.g.c
        public void b(Typeface typeface) {
            h.b bVar = this.f12a;
            if (bVar != null) {
                bVar.g(typeface);
            }
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        f10a = i7 >= 29 ? new m() : i7 >= 28 ? new l() : i7 >= 26 ? new k() : (i7 < 24 || !j.j()) ? new i() : new j();
        f11b = new t.g(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        return f10a.b(context, cancellationSignal, bVarArr, i7);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i7, String str, int i8, int i9, h.b bVar2, Handler handler, boolean z7) {
        Typeface a7;
        if (bVar instanceof e.C0308e) {
            e.C0308e c0308e = (e.C0308e) bVar;
            Typeface g7 = g(c0308e.c());
            if (g7 != null) {
                if (bVar2 != null) {
                    bVar2.d(g7, handler);
                }
                return g7;
            }
            a7 = F.g.a(context, c0308e.b(), i9, !z7 ? bVar2 != null : c0308e.a() != 0, z7 ? c0308e.d() : -1, h.b.e(handler), new a(bVar2));
        } else {
            a7 = f10a.a(context, (e.c) bVar, resources, i9);
            if (bVar2 != null) {
                if (a7 != null) {
                    bVar2.d(a7, handler);
                } else {
                    bVar2.c(-3, handler);
                }
            }
        }
        if (a7 != null) {
            f11b.d(e(resources, i7, str, i8, i9), a7);
        }
        return a7;
    }

    public static Typeface d(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface d7 = f10a.d(context, resources, i7, str, i9);
        if (d7 != null) {
            f11b.d(e(resources, i7, str, i8, i9), d7);
        }
        return d7;
    }

    public static String e(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    public static Typeface f(Resources resources, int i7, String str, int i8, int i9) {
        return (Typeface) f11b.c(e(resources, i7, str, i8, i9));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
