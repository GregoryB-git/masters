package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final Object f6795o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6796p;

    public m(Object obj, Object obj2) {
        this.f6795o = obj;
        this.f6796p = obj2;
    }

    public final Object a() {
        return this.f6795o;
    }

    public final Object b() {
        return this.f6796p;
    }

    public final Object c() {
        return this.f6795o;
    }

    public final Object d() {
        return this.f6796p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.f6795o, mVar.f6795o) && Intrinsics.a(this.f6796p, mVar.f6796p);
    }

    public int hashCode() {
        Object obj = this.f6795o;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6796p;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f6795o + ", " + this.f6796p + ')';
    }
}
