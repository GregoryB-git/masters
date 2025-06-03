package k9;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static d f9146b = new d(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final Set<j9.l> f9147a;

    public d(Set<j9.l> set) {
        this.f9147a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f9147a.equals(((d) obj).f9147a);
    }

    public final int hashCode() {
        return this.f9147a.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FieldMask{mask=");
        l10.append(this.f9147a.toString());
        l10.append("}");
        return l10.toString();
    }
}
