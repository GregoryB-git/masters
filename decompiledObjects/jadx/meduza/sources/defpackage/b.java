package defpackage;

import ec.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f1557a;

    public b() {
        this(null);
    }

    public b(Boolean bool) {
        this.f1557a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.f1557a, ((b) obj).f1557a);
    }

    public final int hashCode() {
        Boolean bool = this.f1557a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f1557a + ")";
    }
}
