package l1;

import F0.InterfaceC0374t;
import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface K {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16811a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16812b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f16813c;

        public a(String str, int i7, byte[] bArr) {
            this.f16811a = str;
            this.f16812b = i7;
            this.f16813c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16814a;

        /* renamed from: b, reason: collision with root package name */
        public final String f16815b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16816c;

        /* renamed from: d, reason: collision with root package name */
        public final List f16817d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f16818e;

        public b(int i7, String str, int i8, List list, byte[] bArr) {
            this.f16814a = i7;
            this.f16815b = str;
            this.f16816c = i8;
            this.f16817d = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f16818e = bArr;
        }

        public int a() {
            int i7 = this.f16816c;
            if (i7 != 2) {
                return i7 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        SparseArray a();

        K b(int i7, b bVar);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f16819a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16820b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16821c;

        /* renamed from: d, reason: collision with root package name */
        public int f16822d;

        /* renamed from: e, reason: collision with root package name */
        public String f16823e;

        public d(int i7, int i8) {
            this(Integer.MIN_VALUE, i7, i8);
        }

        public void a() {
            int i7 = this.f16822d;
            this.f16822d = i7 == Integer.MIN_VALUE ? this.f16820b : i7 + this.f16821c;
            this.f16823e = this.f16819a + this.f16822d;
        }

        public String b() {
            d();
            return this.f16823e;
        }

        public int c() {
            d();
            return this.f16822d;
        }

        public final void d() {
            if (this.f16822d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i7, int i8, int i9) {
            String str;
            if (i7 != Integer.MIN_VALUE) {
                str = i7 + "/";
            } else {
                str = "";
            }
            this.f16819a = str;
            this.f16820b = i8;
            this.f16821c = i9;
            this.f16822d = Integer.MIN_VALUE;
            this.f16823e = "";
        }
    }

    void a(g0.z zVar, int i7);

    void b();

    void c(g0.E e7, InterfaceC0374t interfaceC0374t, d dVar);
}
