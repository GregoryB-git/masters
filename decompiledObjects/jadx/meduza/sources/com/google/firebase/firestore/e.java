package com.google.firebase.firestore;

import d9.n;
import g9.l;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final List<e> f3156a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3157b;

        /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lcom/google/firebase/firestore/e;>;Ljava/lang/Object;)V */
        public a(List list, int i10) {
            this.f3156a = list;
            this.f3157b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3157b == aVar.f3157b && Objects.equals(this.f3156a, aVar.f3156a);
        }

        public final int hashCode() {
            List<e> list = this.f3156a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            int i10 = this.f3157b;
            return hashCode + (i10 != 0 ? q0.g.c(i10) : 0);
        }
    }

    public static class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public final n f3158a;

        /* renamed from: b, reason: collision with root package name */
        public final l.a f3159b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f3160c;

        public b(n nVar, l.a aVar, Object obj) {
            this.f3158a = nVar;
            this.f3159b = aVar;
            this.f3160c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3159b == bVar.f3159b && Objects.equals(this.f3158a, bVar.f3158a) && Objects.equals(this.f3160c, bVar.f3160c);
        }

        public final int hashCode() {
            n nVar = this.f3158a;
            int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
            l.a aVar = this.f3159b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            Object obj = this.f3160c;
            return hashCode2 + (obj != null ? obj.hashCode() : 0);
        }
    }
}
