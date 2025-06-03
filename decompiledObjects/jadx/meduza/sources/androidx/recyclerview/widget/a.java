package androidx.recyclerview.widget;

import androidx.recyclerview.widget.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public d0.c f1294a = new d0.c(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C0018a> f1295b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<C0018a> f1296c = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0018a {

        /* renamed from: a, reason: collision with root package name */
        public Object f1297a;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0018a)) {
                return false;
            }
            C0018a c0018a = (C0018a) obj;
            c0018a.getClass();
            c0018a.getClass();
            c0018a.getClass();
            Object obj2 = this.f1297a;
            Object obj3 = c0018a.f1297a;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((0 * 31) + 0) * 31) + 0;
        }

        public final String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[??,s:0c:0,p:" + this.f1297a + "]";
        }
    }

    public a(l lVar) {
        new g(this);
    }

    public final int a(int i10, int i11) {
        int size = this.f1296c.size();
        while (i11 < size) {
            C0018a c0018a = this.f1296c.get(i11);
            c0018a.getClass();
            c0018a.getClass();
            i11++;
        }
        return i10;
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0018a c0018a = (C0018a) arrayList.get(i10);
            c0018a.f1297a = null;
            this.f1294a.c(c0018a);
        }
        arrayList.clear();
    }
}
