package y8;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f17447a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f17448b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f17447a = str;
        this.f17448b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17447a.equals(cVar.f17447a) && this.f17448b.equals(cVar.f17448b);
    }

    public final int hashCode() {
        return this.f17448b.hashCode() + (this.f17447a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FieldDescriptor{name=");
        l10.append(this.f17447a);
        l10.append(", properties=");
        l10.append(this.f17448b.values());
        l10.append("}");
        return l10.toString();
    }
}
