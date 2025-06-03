package f9;

import j9.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final j9.i f5502a;

    /* renamed from: b, reason: collision with root package name */
    public final q f5503b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5504c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f5505d;

    public h(j9.i iVar, q qVar, boolean z10, ArrayList arrayList) {
        this.f5502a = iVar;
        this.f5503b = qVar;
        this.f5504c = z10;
        this.f5505d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f5504c == hVar.f5504c && this.f5502a.equals(hVar.f5502a) && this.f5503b.equals(hVar.f5503b)) {
            return this.f5505d.equals(hVar.f5505d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5505d.hashCode() + ((((this.f5503b.hashCode() + (this.f5502a.hashCode() * 31)) * 31) + (this.f5504c ? 1 : 0)) * 31);
    }
}
