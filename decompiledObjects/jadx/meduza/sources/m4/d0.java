package m4;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface d0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f9943a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f9944b;

        public a(String str, byte[] bArr) {
            this.f9943a = str;
            this.f9944b = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f9945a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f9946b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f9947c;

        public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
            this.f9945a = str;
            this.f9946b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f9947c = bArr;
        }
    }

    public interface c {
        d0 a(int i10, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f9948a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9949b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9950c;

        /* renamed from: d, reason: collision with root package name */
        public int f9951d;

        /* renamed from: e, reason: collision with root package name */
        public String f9952e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
            } else {
                str = "";
            }
            this.f9948a = str;
            this.f9949b = i11;
            this.f9950c = i12;
            this.f9951d = Integer.MIN_VALUE;
            this.f9952e = "";
        }

        public final void a() {
            int i10 = this.f9951d;
            this.f9951d = i10 == Integer.MIN_VALUE ? this.f9949b : i10 + this.f9950c;
            this.f9952e = this.f9948a + this.f9951d;
        }

        public final void b() {
            if (this.f9951d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(int i10, v5.u uVar);

    void b();

    void c(v5.c0 c0Var, c4.j jVar, d dVar);
}
