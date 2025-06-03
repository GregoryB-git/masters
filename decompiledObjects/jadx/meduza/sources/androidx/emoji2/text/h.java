package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import p2.m0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final u0.b f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f1013b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1014c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f1015d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f1016a;

        /* renamed from: b, reason: collision with root package name */
        public t0.e f1017b;

        public a() {
            this(1);
        }

        public a(int i10) {
            this.f1016a = new SparseArray<>(i10);
        }

        public final void a(t0.e eVar, int i10, int i11) {
            int a10 = eVar.a(i10);
            SparseArray<a> sparseArray = this.f1016a;
            a aVar = sparseArray == null ? null : sparseArray.get(a10);
            if (aVar == null) {
                aVar = new a();
                this.f1016a.put(eVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(eVar, i10 + 1, i11);
            } else {
                aVar.f1017b = eVar;
            }
        }
    }

    public h(Typeface typeface, u0.b bVar) {
        int i10;
        int i11;
        this.f1015d = typeface;
        this.f1012a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i12 = a10 + bVar.f14882a;
            i10 = bVar.f14883b.getInt(bVar.f14883b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f1013b = new char[i10 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i13 = a11 + bVar.f14882a;
            i11 = bVar.f14883b.getInt(bVar.f14883b.getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            t0.e eVar = new t0.e(this, i14);
            u0.a c10 = eVar.c();
            int a12 = c10.a(4);
            Character.toChars(a12 != 0 ? c10.f14883b.getInt(a12 + c10.f14882a) : 0, this.f1013b, i14 * 2);
            m0.n("invalid metadata codepoint length", eVar.b() > 0);
            this.f1014c.a(eVar, 0, eVar.b() - 1);
        }
    }
}
