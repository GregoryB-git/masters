package g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.k;
import v3.i0;
import y4.c;

/* loaded from: classes.dex */
public final class a implements y4.a<a> {

    /* renamed from: a, reason: collision with root package name */
    public final int f5844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5846c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5847d;

    /* renamed from: e, reason: collision with root package name */
    public final C0094a f5848e;
    public final b[] f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5849g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5850h;

    /* renamed from: g5.a$a, reason: collision with other inner class name */
    public static class C0094a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f5851a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f5852b;

        /* renamed from: c, reason: collision with root package name */
        public final k[] f5853c;

        public C0094a(UUID uuid, byte[] bArr, k[] kVarArr) {
            this.f5851a = uuid;
            this.f5852b = bArr;
            this.f5853c = kVarArr;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f5854a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5855b;

        /* renamed from: c, reason: collision with root package name */
        public final long f5856c;

        /* renamed from: d, reason: collision with root package name */
        public final String f5857d;

        /* renamed from: e, reason: collision with root package name */
        public final int f5858e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5859g;

        /* renamed from: h, reason: collision with root package name */
        public final int f5860h;

        /* renamed from: i, reason: collision with root package name */
        public final String f5861i;

        /* renamed from: j, reason: collision with root package name */
        public final i0[] f5862j;

        /* renamed from: k, reason: collision with root package name */
        public final int f5863k;

        /* renamed from: l, reason: collision with root package name */
        public final String f5864l;

        /* renamed from: m, reason: collision with root package name */
        public final String f5865m;

        /* renamed from: n, reason: collision with root package name */
        public final List<Long> f5866n;

        /* renamed from: o, reason: collision with root package name */
        public final long[] f5867o;

        /* renamed from: p, reason: collision with root package name */
        public final long f5868p;

        public b() {
            throw null;
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, String str5, i0[] i0VarArr, List<Long> list, long[] jArr, long j11) {
            this.f5864l = str;
            this.f5865m = str2;
            this.f5854a = i10;
            this.f5855b = str3;
            this.f5856c = j10;
            this.f5857d = str4;
            this.f5858e = i11;
            this.f = i12;
            this.f5859g = i13;
            this.f5860h = i14;
            this.f5861i = str5;
            this.f5862j = i0VarArr;
            this.f5866n = list;
            this.f5867o = jArr;
            this.f5868p = j11;
            this.f5863k = list.size();
        }

        public final b a(i0[] i0VarArr) {
            return new b(this.f5864l, this.f5865m, this.f5854a, this.f5855b, this.f5856c, this.f5857d, this.f5858e, this.f, this.f5859g, this.f5860h, this.f5861i, i0VarArr, this.f5866n, this.f5867o, this.f5868p);
        }

        public final long b(int i10) {
            if (i10 == this.f5863k - 1) {
                return this.f5868p;
            }
            long[] jArr = this.f5867o;
            return jArr[i10 + 1] - jArr[i10];
        }
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, C0094a c0094a, b[] bVarArr) {
        this.f5844a = i10;
        this.f5845b = i11;
        this.f5849g = j10;
        this.f5850h = j11;
        this.f5846c = i12;
        this.f5847d = z10;
        this.f5848e = c0094a;
        this.f = bVarArr;
    }

    @Override // y4.a
    public final a a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            b bVar2 = this.f[cVar.f17429b];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.a((i0[]) arrayList3.toArray(new i0[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f5862j[cVar.f17430c]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.a((i0[]) arrayList3.toArray(new i0[0])));
        }
        return new a(this.f5844a, this.f5845b, this.f5849g, this.f5850h, this.f5846c, this.f5847d, this.f5848e, (b[]) arrayList2.toArray(new b[0]));
    }
}
