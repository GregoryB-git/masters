package g9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5957b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f5958c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lg9/m;>;Ljava/lang/Object;)V */
    public g(List list, int i10) {
        this.f5956a = new ArrayList(list);
        this.f5957b = i10;
    }

    @Override // g9.m
    public final String a() {
        boolean z10;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f5956a.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z11 = true;
                break;
            }
            if (((m) it.next()) instanceof g) {
                z11 = false;
                break;
            }
        }
        if (z11 && e()) {
            z10 = true;
        }
        if (z10) {
            Iterator it2 = this.f5956a.iterator();
            while (it2.hasNext()) {
                sb2.append(((m) it2.next()).a());
            }
            return sb2.toString();
        }
        sb2.append(a0.j.c(this.f5957b) + "(");
        sb2.append(TextUtils.join(",", this.f5956a));
        sb2.append(")");
        return sb2.toString();
    }

    @Override // g9.m
    public final List<m> b() {
        return Collections.unmodifiableList(this.f5956a);
    }

    @Override // g9.m
    public final List<l> c() {
        ArrayList arrayList = this.f5958c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.f5958c = new ArrayList();
        Iterator it = this.f5956a.iterator();
        while (it.hasNext()) {
            this.f5958c.addAll(((m) it.next()).c());
        }
        return Collections.unmodifiableList(this.f5958c);
    }

    @Override // g9.m
    public final boolean d(j9.g gVar) {
        if (e()) {
            Iterator it = this.f5956a.iterator();
            while (it.hasNext()) {
                if (!((m) it.next()).d(gVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = this.f5956a.iterator();
        while (it2.hasNext()) {
            if (((m) it2.next()).d(gVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f5957b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f5957b == gVar.f5957b && this.f5956a.equals(gVar.f5956a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5956a.hashCode() + ((q0.g.c(this.f5957b) + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
