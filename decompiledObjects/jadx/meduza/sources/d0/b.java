package d0;

import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final S f3329b;

    public b(F f, S s10) {
        this.f3328a = f;
        this.f3329b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(bVar.f3328a, this.f3328a) && Objects.equals(bVar.f3329b, this.f3329b);
    }

    public final int hashCode() {
        F f = this.f3328a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s10 = this.f3329b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = f.l("Pair{");
        l10.append(this.f3328a);
        l10.append(" ");
        l10.append(this.f3329b);
        l10.append("}");
        return l10.toString();
    }
}
