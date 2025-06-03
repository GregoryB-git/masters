package com.google.firebase.firestore;

import d9.n;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final n f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3142b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3143c;

    /* renamed from: com.google.firebase.firestore.a$a, reason: collision with other inner class name */
    public static class C0053a extends a {
        public C0053a(n nVar) {
            super(nVar, "average");
        }
    }

    public static class b extends a {
        public b() {
            super(null, "count");
        }
    }

    public static class c extends a {
        public c(n nVar) {
            super(nVar, "sum");
        }
    }

    public a(n nVar, String str) {
        String str2;
        this.f3141a = nVar;
        this.f3142b = str;
        StringBuilder l10 = defpackage.f.l(str);
        if (nVar == null) {
            str2 = "";
        } else {
            str2 = "_" + nVar;
        }
        l10.append(str2);
        this.f3143c = l10.toString();
    }

    public final String a() {
        n nVar = this.f3141a;
        return nVar == null ? "" : nVar.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        n nVar = this.f3141a;
        return (nVar == null || aVar.f3141a == null) ? nVar == null && aVar.f3141a == null : this.f3142b.equals(aVar.f3142b) && a().equals(aVar.a());
    }

    public final int hashCode() {
        return Objects.hash(this.f3142b, a());
    }
}
