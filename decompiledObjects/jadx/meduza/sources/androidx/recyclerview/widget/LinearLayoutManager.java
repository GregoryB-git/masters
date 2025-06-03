package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.j {

    /* renamed from: h, reason: collision with root package name */
    public int f1155h;

    /* renamed from: i, reason: collision with root package name */
    public b f1156i;

    /* renamed from: j, reason: collision with root package name */
    public j f1157j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1159l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1160m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1161n = true;

    /* renamed from: o, reason: collision with root package name */
    public c f1162o = null;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1163a;

        /* renamed from: b, reason: collision with root package name */
        public int f1164b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1165c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1166d;

        public a() {
            a();
        }

        public final void a() {
            this.f1163a = -1;
            this.f1164b = Integer.MIN_VALUE;
            this.f1165c = false;
            this.f1166d = false;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("AnchorInfo{mPosition=");
            l10.append(this.f1163a);
            l10.append(", mCoordinate=");
            l10.append(this.f1164b);
            l10.append(", mLayoutFromEnd=");
            l10.append(this.f1165c);
            l10.append(", mValid=");
            l10.append(this.f1166d);
            l10.append('}');
            return l10.toString();
        }
    }

    public static class b {
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f1167a;

        /* renamed from: b, reason: collision with root package name */
        public int f1168b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1169c;

        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c() {
        }

        public c(Parcel parcel) {
            this.f1167a = parcel.readInt();
            this.f1168b = parcel.readInt();
            this.f1169c = parcel.readInt() == 1;
        }

        public c(c cVar) {
            this.f1167a = cVar.f1167a;
            this.f1168b = cVar.f1168b;
            this.f1169c = cVar.f1169c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1167a);
            parcel.writeInt(this.f1168b);
            parcel.writeInt(this.f1169c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1155h = 1;
        this.f1158k = false;
        new a();
        RecyclerView.j.c x10 = RecyclerView.j.x(context, attributeSet, i10, i11);
        int i12 = x10.f1221a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException(defpackage.f.h("invalid orientation:", i12));
        }
        a(null);
        if (i12 != this.f1155h || this.f1157j == null) {
            this.f1157j = j.a(this, i12);
            this.f1155h = i12;
            I();
        }
        boolean z10 = x10.f1223c;
        a(null);
        if (z10 != this.f1158k) {
            this.f1158k = z10;
            I();
        }
        R(x10.f1224d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void B(RecyclerView recyclerView) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View Q = Q(0, p(), false);
            if (Q != null) {
                RecyclerView.j.w(Q);
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View Q2 = Q(p() - 1, -1, false);
            if (Q2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                RecyclerView.j.w(Q2);
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final Parcelable D() {
        c cVar = this.f1162o;
        if (cVar != null) {
            return new c(cVar);
        }
        c cVar2 = new c();
        if (p() <= 0) {
            cVar2.f1167a = -1;
            return cVar2;
        }
        N();
        boolean z10 = this.f1159l;
        boolean z11 = false ^ z10;
        cVar2.f1169c = z11;
        if (!z11) {
            RecyclerView.j.w(o(z10 ? p() - 1 : 0));
            throw null;
        }
        View o10 = o(z10 ? 0 : p() - 1);
        cVar2.f1168b = this.f1157j.d() - this.f1157j.b(o10);
        RecyclerView.j.w(o10);
        throw null;
    }

    public final int K(RecyclerView.s sVar) {
        if (p() == 0) {
            return 0;
        }
        N();
        return n.a(sVar, this.f1157j, P(!this.f1161n), O(!this.f1161n), this, this.f1161n);
    }

    public final void L(RecyclerView.s sVar) {
        if (p() == 0) {
            return;
        }
        N();
        View P = P(!this.f1161n);
        View O = O(!this.f1161n);
        if (p() == 0 || sVar.a() == 0 || P == null || O == null) {
            return;
        }
        RecyclerView.j.w(P);
        throw null;
    }

    public final int M(RecyclerView.s sVar) {
        if (p() == 0) {
            return 0;
        }
        N();
        return n.b(sVar, this.f1157j, P(!this.f1161n), O(!this.f1161n), this, this.f1161n);
    }

    public final void N() {
        if (this.f1156i == null) {
            this.f1156i = new b();
        }
    }

    public final View O(boolean z10) {
        int p10;
        int i10 = -1;
        if (this.f1159l) {
            p10 = 0;
            i10 = p();
        } else {
            p10 = p() - 1;
        }
        return Q(p10, i10, z10);
    }

    public final View P(boolean z10) {
        int i10;
        int i11 = -1;
        if (this.f1159l) {
            i10 = p() - 1;
        } else {
            i10 = 0;
            i11 = p();
        }
        return Q(i10, i11, z10);
    }

    public final View Q(int i10, int i11, boolean z10) {
        N();
        return (this.f1155h == 0 ? this.f1215c : this.f1216d).a(i10, i11, z10 ? 24579 : 320, 320);
    }

    public void R(boolean z10) {
        a(null);
        if (this.f1160m == z10) {
            return;
        }
        this.f1160m = z10;
        I();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final void a(String str) {
        if (this.f1162o == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean b() {
        return this.f1155h == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean c() {
        return this.f1155h == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int f(RecyclerView.s sVar) {
        return K(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void g(RecyclerView.s sVar) {
        L(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public int h(RecyclerView.s sVar) {
        return M(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final int i(RecyclerView.s sVar) {
        return K(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void j(RecyclerView.s sVar) {
        L(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public int k(RecyclerView.s sVar) {
        return M(sVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public RecyclerView.k l() {
        return new RecyclerView.k(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean z() {
        return true;
    }
}
