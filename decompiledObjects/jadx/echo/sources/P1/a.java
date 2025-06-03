package P1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4226a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4227b;

    public a(String name, boolean z7) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f4226a = name;
        this.f4227b = z7;
    }

    public final String a() {
        return this.f4226a;
    }

    public final boolean b() {
        return this.f4227b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f4226a, aVar.f4226a) && this.f4227b == aVar.f4227b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f4226a.hashCode() * 31;
        boolean z7 = this.f4227b;
        int i7 = z7;
        if (z7 != 0) {
            i7 = 1;
        }
        return hashCode + i7;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f4226a + ", value=" + this.f4227b + ')';
    }
}
