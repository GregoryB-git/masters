package F;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1720a;

        /* renamed from: b, reason: collision with root package name */
        public final b[] f1721b;

        public a(int i7, b[] bVarArr) {
            this.f1720a = i7;
            this.f1721b = bVarArr;
        }

        public static a a(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        public b[] b() {
            return this.f1721b;
        }

        public int c() {
            return this.f1720a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f1722a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1723b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1724c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1725d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1726e;

        public b(Uri uri, int i7, int i8, boolean z7, int i9) {
            this.f1722a = (Uri) H.e.b(uri);
            this.f1723b = i7;
            this.f1724c = i8;
            this.f1725d = z7;
            this.f1726e = i9;
        }

        public static b a(Uri uri, int i7, int i8, boolean z7, int i9) {
            return new b(uri, i7, i8, z7, i9);
        }

        public int b() {
            return this.f1726e;
        }

        public int c() {
            return this.f1723b;
        }

        public Uri d() {
            return this.f1722a;
        }

        public int e() {
            return this.f1724c;
        }

        public boolean f() {
            return this.f1725d;
        }
    }

    public static class c {
        public abstract void a(int i7);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, e eVar, int i7, boolean z7, int i8, Handler handler, c cVar) {
        F.a aVar = new F.a(cVar, handler);
        return z7 ? f.e(context, eVar, aVar, i7, i8) : f.d(context, eVar, i7, null, aVar);
    }
}
