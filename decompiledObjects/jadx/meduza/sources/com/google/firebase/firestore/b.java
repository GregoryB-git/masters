package com.google.firebase.firestore;

import com.google.firebase.firestore.a;
import com.google.firebase.firestore.d;
import java.util.Map;
import java.util.Objects;
import ka.d0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d9.a f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, d0> f3145b;

    public b(d9.a aVar, Map<String, d0> map) {
        this.f3144a = aVar;
        this.f3145b = map;
    }

    public final long a() {
        a.b bVar = new a.b();
        Number number = (Number) c(bVar, Number.class);
        Long valueOf = number != null ? Long.valueOf(number.longValue()) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        throw new IllegalArgumentException(defpackage.g.f(defpackage.f.l("RunAggregationQueryResponse alias "), bVar.f3143c, " is null"));
    }

    public final Object b(a aVar) {
        if (this.f3145b.containsKey(aVar.f3143c)) {
            return new m(this.f3144a.f3636a.f3190b, d.a.NONE).b(this.f3145b.get(aVar.f3143c));
        }
        StringBuilder l10 = defpackage.f.l("'");
        l10.append(aVar.f3142b);
        l10.append("(");
        l10.append(aVar.a());
        l10.append(")' was not requested in the aggregation query.");
        throw new IllegalArgumentException(l10.toString());
    }

    public final <T> T c(a aVar, Class<T> cls) {
        Object b10 = b(aVar);
        if (b10 == null) {
            return null;
        }
        if (cls.isInstance(b10)) {
            return cls.cast(b10);
        }
        StringBuilder l10 = defpackage.f.l("AggregateField '");
        l10.append(aVar.f3143c);
        l10.append("' is not a ");
        l10.append(cls.getName());
        throw new RuntimeException(l10.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3144a.equals(bVar.f3144a) && this.f3145b.equals(bVar.f3145b);
    }

    public final int hashCode() {
        return Objects.hash(this.f3144a, this.f3145b);
    }
}
