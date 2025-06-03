package defpackage;

import ec.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f0a;

    public a() {
        this(null);
    }

    public a(Boolean bool) {
        this.f0a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i.a(this.f0a, ((a) obj).f0a);
    }

    public final int hashCode() {
        Boolean bool = this.f0a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f0a + ")";
    }
}
