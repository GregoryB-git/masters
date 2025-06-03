package j3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    public final List<u> f8339a;

    public d(ArrayList arrayList) {
        this.f8339a = arrayList;
    }

    @Override // j3.n
    public final List<u> a() {
        return this.f8339a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f8339a.equals(((n) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f8339a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("BatchedLogRequest{logRequests=");
        l10.append(this.f8339a);
        l10.append("}");
        return l10.toString();
    }
}
