package x0;

import android.util.SparseArray;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1303g f20698c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f20697b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    public int f20696a = -1;

    public W(InterfaceC1303g interfaceC1303g) {
        this.f20698c = interfaceC1303g;
    }

    public void a(int i7, Object obj) {
        if (this.f20696a == -1) {
            AbstractC1297a.f(this.f20697b.size() == 0);
            this.f20696a = 0;
        }
        if (this.f20697b.size() > 0) {
            SparseArray sparseArray = this.f20697b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            AbstractC1297a.a(i7 >= keyAt);
            if (keyAt == i7) {
                InterfaceC1303g interfaceC1303g = this.f20698c;
                SparseArray sparseArray2 = this.f20697b;
                interfaceC1303g.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f20697b.append(i7, obj);
    }

    public void b() {
        for (int i7 = 0; i7 < this.f20697b.size(); i7++) {
            this.f20698c.accept(this.f20697b.valueAt(i7));
        }
        this.f20696a = -1;
        this.f20697b.clear();
    }

    public void c(int i7) {
        for (int size = this.f20697b.size() - 1; size >= 0 && i7 < this.f20697b.keyAt(size); size--) {
            this.f20698c.accept(this.f20697b.valueAt(size));
            this.f20697b.removeAt(size);
        }
        this.f20696a = this.f20697b.size() > 0 ? Math.min(this.f20696a, this.f20697b.size() - 1) : -1;
    }

    public void d(int i7) {
        int i8 = 0;
        while (i8 < this.f20697b.size() - 1) {
            int i9 = i8 + 1;
            if (i7 < this.f20697b.keyAt(i9)) {
                return;
            }
            this.f20698c.accept(this.f20697b.valueAt(i8));
            this.f20697b.removeAt(i8);
            int i10 = this.f20696a;
            if (i10 > 0) {
                this.f20696a = i10 - 1;
            }
            i8 = i9;
        }
    }

    public Object e(int i7) {
        if (this.f20696a == -1) {
            this.f20696a = 0;
        }
        while (true) {
            int i8 = this.f20696a;
            if (i8 <= 0 || i7 >= this.f20697b.keyAt(i8)) {
                break;
            }
            this.f20696a--;
        }
        while (this.f20696a < this.f20697b.size() - 1 && i7 >= this.f20697b.keyAt(this.f20696a + 1)) {
            this.f20696a++;
        }
        return this.f20697b.valueAt(this.f20696a);
    }

    public Object f() {
        return this.f20697b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f20697b.size() == 0;
    }
}
