package com.google.firebase.firestore;

import d9.e0;
import d9.f0;
import d9.h0;
import d9.i0;
import d9.l0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3174a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3175b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3176c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3177d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f3178e;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public e0 f3183e;
        public boolean f = false;

        /* renamed from: a, reason: collision with root package name */
        public String f3179a = "firestore.googleapis.com";

        /* renamed from: b, reason: collision with root package name */
        public boolean f3180b = true;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3181c = true;

        /* renamed from: d, reason: collision with root package name */
        public long f3182d = 104857600;

        public final g a() {
            if (this.f3180b || !this.f3179a.equals("firestore.googleapis.com")) {
                return new g(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        public final void b(e0 e0Var) {
            if (this.f) {
                throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
            }
            if (!(e0Var instanceof f0) && !(e0Var instanceof l0)) {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
            this.f3183e = e0Var;
        }
    }

    public g(a aVar) {
        this.f3174a = aVar.f3179a;
        this.f3175b = aVar.f3180b;
        this.f3176c = aVar.f3181c;
        this.f3177d = aVar.f3182d;
        this.f3178e = aVar.f3183e;
    }

    @Deprecated
    public final long a() {
        e0 e0Var = this.f3178e;
        if (e0Var == null) {
            return this.f3177d;
        }
        if (e0Var instanceof l0) {
            return ((l0) e0Var).f3687a;
        }
        h0 h0Var = ((f0) e0Var).f3668a;
        if (!(h0Var instanceof i0)) {
            return -1L;
        }
        ((i0) h0Var).getClass();
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3175b == gVar.f3175b && this.f3176c == gVar.f3176c && this.f3177d == gVar.f3177d && this.f3174a.equals(gVar.f3174a)) {
            return Objects.equals(this.f3178e, gVar.f3178e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f3174a.hashCode() * 31) + (this.f3175b ? 1 : 0)) * 31) + (this.f3176c ? 1 : 0)) * 31;
        long j10 = this.f3177d;
        int i10 = (hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        e0 e0Var = this.f3178e;
        return i10 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FirebaseFirestoreSettings{host=");
        l10.append(this.f3174a);
        l10.append(", sslEnabled=");
        l10.append(this.f3175b);
        l10.append(", persistenceEnabled=");
        l10.append(this.f3176c);
        l10.append(", cacheSizeBytes=");
        l10.append(this.f3177d);
        l10.append(", cacheSettings=");
        l10.append(this.f3178e);
        if (l10.toString() == null) {
            return "null";
        }
        return this.f3178e.toString() + "}";
    }
}
