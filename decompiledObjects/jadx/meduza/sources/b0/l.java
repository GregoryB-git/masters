package b0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final r.f<String, Typeface> f1688a = new r.f<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1689b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1690c;

    /* renamed from: d, reason: collision with root package name */
    public static final r.h<String, ArrayList<d0.a<a>>> f1691d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f1692a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1693b;

        public a(int i10) {
            this.f1692a = null;
            this.f1693b = i10;
        }

        public a(Typeface typeface) {
            this.f1692a = typeface;
            this.f1693b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1689b = threadPoolExecutor;
        f1690c = new Object();
        f1691d = new r.h<>();
    }

    public static a a(String str, Context context, g gVar, int i10) {
        int i11;
        Typeface typeface = f1688a.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            m a10 = e.a(context, gVar);
            int i12 = a10.f1694a;
            int i13 = 1;
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = -2;
                }
                i11 = -3;
            } else {
                n[] nVarArr = a10.f1695b;
                if (nVarArr != null && nVarArr.length != 0) {
                    for (n nVar : nVarArr) {
                        int i14 = nVar.f1700e;
                        if (i14 != 0) {
                            if (i14 >= 0) {
                                i11 = i14;
                            }
                            i11 = -3;
                        }
                    }
                    i13 = 0;
                }
                i11 = i13;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface b10 = x.e.f16498a.b(context, a10.f1695b, i10);
            if (b10 == null) {
                return new a(-3);
            }
            f1688a.put(str, b10);
            return new a(b10);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
