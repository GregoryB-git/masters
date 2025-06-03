package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import e0.d0;
import e0.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.j {

    /* renamed from: h, reason: collision with root package name */
    public int f1263h;

    /* renamed from: i, reason: collision with root package name */
    public f[] f1264i;

    /* renamed from: j, reason: collision with root package name */
    public j f1265j;

    /* renamed from: k, reason: collision with root package name */
    public j f1266k;

    /* renamed from: l, reason: collision with root package name */
    public int f1267l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1268m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1269n = false;

    /* renamed from: o, reason: collision with root package name */
    public d f1270o = new d();

    /* renamed from: p, reason: collision with root package name */
    public int f1271p = 2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1272q;

    /* renamed from: r, reason: collision with root package name */
    public final a f1273r;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.K();
        }
    }

    public class b {
        public b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            a();
        }

        public final void a() {
        }
    }

    public static class c extends RecyclerView.k {
        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public List<a> f1275a;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0017a();

            /* renamed from: a, reason: collision with root package name */
            public int f1276a;

            /* renamed from: b, reason: collision with root package name */
            public int f1277b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f1278c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f1279d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C0017a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1276a = parcel.readInt();
                this.f1277b = parcel.readInt();
                this.f1279d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1278c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder l10 = defpackage.f.l("FullSpanItem{mPosition=");
                l10.append(this.f1276a);
                l10.append(", mGapDir=");
                l10.append(this.f1277b);
                l10.append(", mHasUnwantedGapAfter=");
                l10.append(this.f1279d);
                l10.append(", mGapPerSpan=");
                l10.append(Arrays.toString(this.f1278c));
                l10.append('}');
                return l10.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f1276a);
                parcel.writeInt(this.f1277b);
                parcel.writeInt(this.f1279d ? 1 : 0);
                int[] iArr = this.f1278c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1278c);
                }
            }
        }

        public final void a() {
            this.f1275a = null;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f1280a;

        /* renamed from: b, reason: collision with root package name */
        public int f1281b;

        /* renamed from: c, reason: collision with root package name */
        public int f1282c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f1283d;

        /* renamed from: e, reason: collision with root package name */
        public int f1284e;
        public int[] f;

        /* renamed from: o, reason: collision with root package name */
        public List<d.a> f1285o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f1286p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f1287q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f1288r;

        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1280a = parcel.readInt();
            this.f1281b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1282c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1283d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1284e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f1286p = parcel.readInt() == 1;
            this.f1287q = parcel.readInt() == 1;
            this.f1288r = parcel.readInt() == 1;
            this.f1285o = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1282c = eVar.f1282c;
            this.f1280a = eVar.f1280a;
            this.f1281b = eVar.f1281b;
            this.f1283d = eVar.f1283d;
            this.f1284e = eVar.f1284e;
            this.f = eVar.f;
            this.f1286p = eVar.f1286p;
            this.f1287q = eVar.f1287q;
            this.f1288r = eVar.f1288r;
            this.f1285o = eVar.f1285o;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1280a);
            parcel.writeInt(this.f1281b);
            parcel.writeInt(this.f1282c);
            if (this.f1282c > 0) {
                parcel.writeIntArray(this.f1283d);
            }
            parcel.writeInt(this.f1284e);
            if (this.f1284e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.f1286p ? 1 : 0);
            parcel.writeInt(this.f1287q ? 1 : 0);
            parcel.writeInt(this.f1288r ? 1 : 0);
            parcel.writeList(this.f1285o);
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList<View> f1289a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        public int f1290b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f1291c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public final int f1292d;

        public f(int i10) {
            this.f1292d = i10;
        }

        public static c d(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            View view = this.f1289a.get(r0.size() - 1);
            c d10 = d(view);
            this.f1291c = StaggeredGridLayoutManager.this.f1265j.b(view);
            d10.getClass();
        }

        public final void b() {
            this.f1289a.clear();
            this.f1290b = Integer.MIN_VALUE;
            this.f1291c = Integer.MIN_VALUE;
        }

        public final int c(int i10) {
            int i11 = this.f1291c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f1289a.size() == 0) {
                return i10;
            }
            a();
            return this.f1291c;
        }

        public final int e(int i10) {
            int i11 = this.f1290b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f1289a.size() == 0) {
                return i10;
            }
            View view = this.f1289a.get(0);
            c d10 = d(view);
            this.f1290b = StaggeredGridLayoutManager.this.f1265j.c(view);
            d10.getClass();
            return this.f1290b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1263h = -1;
        this.f1268m = false;
        new Rect();
        new b(this);
        this.f1272q = true;
        this.f1273r = new a();
        RecyclerView.j.c x10 = RecyclerView.j.x(context, attributeSet, i10, i11);
        int i12 = x10.f1221a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i12 != this.f1267l) {
            this.f1267l = i12;
            j jVar = this.f1265j;
            this.f1265j = this.f1266k;
            this.f1266k = jVar;
            I();
        }
        int i13 = x10.f1222b;
        a(null);
        if (i13 != this.f1263h) {
            this.f1270o.a();
            I();
            this.f1263h = i13;
            new BitSet(this.f1263h);
            this.f1264i = new f[this.f1263h];
            for (int i14 = 0; i14 < this.f1263h; i14++) {
                this.f1264i[i14] = new f(i14);
            }
            I();
        }
        boolean z10 = x10.f1223c;
        a(null);
        this.f1268m = z10;
        I();
        new androidx.recyclerview.widget.f();
        this.f1265j = j.a(this, this.f1267l);
        this.f1266k = j.a(this, 1 - this.f1267l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void A() {
        this.f1270o.a();
        for (int i10 = 0; i10 < this.f1263h; i10++) {
            this.f1264i[i10].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void B(RecyclerView recyclerView) {
        a aVar = this.f1273r;
        RecyclerView recyclerView2 = this.f1214b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i10 = 0; i10 < this.f1263h; i10++) {
            this.f1264i[i10].b();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View P = P(false);
            View O = O(false);
            if (P == null || O == null) {
                return;
            }
            RecyclerView.j.w(P);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final Parcelable D() {
        e eVar = new e();
        eVar.f1286p = this.f1268m;
        eVar.f1287q = false;
        eVar.f1288r = false;
        d dVar = this.f1270o;
        if (dVar != null) {
            dVar.getClass();
        }
        eVar.f1284e = 0;
        if (p() > 0) {
            Q();
            eVar.f1280a = 0;
            View O = this.f1269n ? O(true) : P(true);
            if (O != null) {
                RecyclerView.j.w(O);
                throw null;
            }
            eVar.f1281b = -1;
            int i10 = this.f1263h;
            eVar.f1282c = i10;
            eVar.f1283d = new int[i10];
            for (int i11 = 0; i11 < this.f1263h; i11++) {
                int e10 = this.f1264i[i11].e(Integer.MIN_VALUE);
                if (e10 != Integer.MIN_VALUE) {
                    e10 -= this.f1265j.e();
                }
                eVar.f1283d[i11] = e10;
            }
        } else {
            eVar.f1280a = -1;
            eVar.f1281b = -1;
            eVar.f1282c = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void E(int i10) {
        if (i10 == 0) {
            K();
        }
    }

    public final boolean K() {
        if (p() != 0 && this.f1271p != 0 && this.f1217e) {
            if (this.f1269n) {
                R();
                Q();
            } else {
                Q();
                R();
            }
            if (S() != null) {
                this.f1270o.a();
                I();
                return true;
            }
        }
        return false;
    }

    public final int L(RecyclerView.s sVar) {
        if (p() == 0) {
            return 0;
        }
        return n.a(sVar, this.f1265j, P(!this.f1272q), O(!this.f1272q), this, this.f1272q);
    }

    public final void M(RecyclerView.s sVar) {
        if (p() == 0) {
            return;
        }
        View P = P(!this.f1272q);
        View O = O(!this.f1272q);
        if (p() == 0 || sVar.a() == 0 || P == null || O == null) {
            return;
        }
        RecyclerView.j.w(P);
        throw null;
    }

    public final int N(RecyclerView.s sVar) {
        if (p() == 0) {
            return 0;
        }
        return n.b(sVar, this.f1265j, P(!this.f1272q), O(!this.f1272q), this, this.f1272q);
    }

    public final View O(boolean z10) {
        int e10 = this.f1265j.e();
        int d10 = this.f1265j.d();
        View view = null;
        for (int p10 = p() - 1; p10 >= 0; p10--) {
            View o10 = o(p10);
            int c10 = this.f1265j.c(o10);
            int b10 = this.f1265j.b(o10);
            if (b10 > e10 && c10 < d10) {
                if (b10 <= d10 || !z10) {
                    return o10;
                }
                if (view == null) {
                    view = o10;
                }
            }
        }
        return view;
    }

    public final View P(boolean z10) {
        int e10 = this.f1265j.e();
        int d10 = this.f1265j.d();
        int p10 = p();
        View view = null;
        for (int i10 = 0; i10 < p10; i10++) {
            View o10 = o(i10);
            int c10 = this.f1265j.c(o10);
            if (this.f1265j.b(o10) > e10 && c10 < d10) {
                if (c10 >= e10 || !z10) {
                    return o10;
                }
                if (view == null) {
                    view = o10;
                }
            }
        }
        return view;
    }

    public final void Q() {
        if (p() == 0) {
            return;
        }
        RecyclerView.j.w(o(0));
        throw null;
    }

    public final void R() {
        int p10 = p();
        if (p10 == 0) {
            return;
        }
        RecyclerView.j.w(o(p10 - 1));
        throw null;
    }

    public final View S() {
        int p10 = p() - 1;
        new BitSet(this.f1263h).set(0, this.f1263h, true);
        int i10 = -1;
        if (this.f1267l == 1) {
            T();
        }
        if (!this.f1269n) {
            i10 = p10 + 1;
            p10 = 0;
        }
        if (p10 == i10) {
            return null;
        }
        ((c) o(p10).getLayoutParams()).getClass();
        throw null;
    }

    public final boolean T() {
        RecyclerView recyclerView = this.f1214b;
        WeakHashMap<View, o0> weakHashMap = d0.f3766a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void a(String str) {
        super.a(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean b() {
        return this.f1267l == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean c() {
        return this.f1267l == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean d(RecyclerView.k kVar) {
        return kVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int f(RecyclerView.s sVar) {
        return L(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void g(RecyclerView.s sVar) {
        M(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int h(RecyclerView.s sVar) {
        return N(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int i(RecyclerView.s sVar) {
        return L(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void j(RecyclerView.s sVar) {
        M(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int k(RecyclerView.s sVar) {
        return N(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k l() {
        return this.f1267l == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k m(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final RecyclerView.k n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean z() {
        return this.f1271p != 0;
    }
}
