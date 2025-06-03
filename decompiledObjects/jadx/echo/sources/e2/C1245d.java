package e2;

import java.util.List;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245d extends AbstractC1251j {

    /* renamed from: a, reason: collision with root package name */
    public final List f13844a;

    public C1245d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f13844a = list;
    }

    @Override // e2.AbstractC1251j
    public List c() {
        return this.f13844a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1251j) {
            return this.f13844a.equals(((AbstractC1251j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f13844a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f13844a + "}";
    }
}
