package v5;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f15905a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f15906a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f15907b;

        public final void a(int i10) {
            x6.b.H(!this.f15907b);
            this.f15906a.append(i10, true);
        }

        public final h b() {
            x6.b.H(!this.f15907b);
            this.f15907b = true;
            return new h(this.f15906a);
        }
    }

    public h(SparseBooleanArray sparseBooleanArray) {
        this.f15905a = sparseBooleanArray;
    }

    public final int a(int i10) {
        x6.b.x(i10, b());
        return this.f15905a.keyAt(i10);
    }

    public final int b() {
        return this.f15905a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (e0.f15881a >= 24) {
            return this.f15905a.equals(hVar.f15905a);
        }
        if (b() != hVar.b()) {
            return false;
        }
        for (int i10 = 0; i10 < b(); i10++) {
            if (a(i10) != hVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (e0.f15881a >= 24) {
            return this.f15905a.hashCode();
        }
        int b10 = b();
        for (int i10 = 0; i10 < b(); i10++) {
            b10 = (b10 * 31) + a(i10);
        }
        return b10;
    }
}
