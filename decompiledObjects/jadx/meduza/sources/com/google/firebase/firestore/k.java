package com.google.firebase.firestore;

import d9.e;
import d9.j0;
import d9.u0;
import g9.i;
import g9.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t8.e;

/* loaded from: classes.dex */
public final class k implements Iterable<j> {

    /* renamed from: a, reason: collision with root package name */
    public final i f3191a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f3192b;

    /* renamed from: c, reason: collision with root package name */
    public final FirebaseFirestore f3193c;

    /* renamed from: d, reason: collision with root package name */
    public List<d9.e> f3194d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f3195e;
    public final u0 f;

    public class a implements Iterator<j> {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator<j9.g> f3196a;

        public a(e.a aVar) {
            this.f3196a = aVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f3196a.hasNext();
        }

        @Override // java.util.Iterator
        public final j next() {
            k kVar = k.this;
            j9.g next = this.f3196a.next();
            FirebaseFirestore firebaseFirestore = kVar.f3193c;
            s0 s0Var = kVar.f3192b;
            return new j(firebaseFirestore, next.getKey(), next, s0Var.f6080e, s0Var.f.contains(next.getKey()));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    public k(i iVar, s0 s0Var, FirebaseFirestore firebaseFirestore) {
        this.f3191a = iVar;
        s0Var.getClass();
        this.f3192b = s0Var;
        firebaseFirestore.getClass();
        this.f3193c = firebaseFirestore;
        this.f = new u0(!s0Var.f.f14652a.isEmpty(), s0Var.f6080e);
    }

    public final List<d9.e> a() {
        e.a aVar;
        int i10;
        int i11;
        j9.g gVar;
        boolean z10;
        j0 j0Var = j0.EXCLUDE;
        if (j0.INCLUDE.equals(j0Var) && this.f3192b.f6082h) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f3194d == null || this.f3195e != j0Var) {
            FirebaseFirestore firebaseFirestore = this.f3193c;
            s0 s0Var = this.f3192b;
            e.a aVar2 = e.a.REMOVED;
            e.a aVar3 = e.a.ADDED;
            ArrayList arrayList = new ArrayList();
            if (s0Var.f6078c.f8685a.isEmpty()) {
                j9.g gVar2 = null;
                int i12 = 0;
                for (g9.i iVar : s0Var.f6079d) {
                    j9.g gVar3 = iVar.f5972b;
                    j jVar = new j(firebaseFirestore, gVar3.getKey(), gVar3, s0Var.f6080e, s0Var.f.contains(gVar3.getKey()));
                    x6.b.Z("Invalid added event for first snapshot", iVar.f5971a == i.a.ADDED, new Object[0]);
                    if (gVar2 != null) {
                        gVar = gVar3;
                        if (s0Var.f6076a.a().compare(gVar2, gVar) >= 0) {
                            z10 = false;
                            x6.b.Z("Got added events in wrong order", z10, new Object[0]);
                            arrayList.add(new d9.e(jVar, aVar3, -1, i12));
                            gVar2 = gVar;
                            i12++;
                        }
                    } else {
                        gVar = gVar3;
                    }
                    z10 = true;
                    x6.b.Z("Got added events in wrong order", z10, new Object[0]);
                    arrayList.add(new d9.e(jVar, aVar3, -1, i12));
                    gVar2 = gVar;
                    i12++;
                }
            } else {
                j9.j jVar2 = s0Var.f6078c;
                j9.j jVar3 = jVar2;
                for (g9.i iVar2 : s0Var.f6079d) {
                    if (iVar2.f5971a != i.a.METADATA) {
                        j9.g gVar4 = iVar2.f5972b;
                        FirebaseFirestore firebaseFirestore2 = firebaseFirestore;
                        j jVar4 = new j(firebaseFirestore, gVar4.getKey(), gVar4, s0Var.f6080e, s0Var.f.contains(gVar4.getKey()));
                        int ordinal = iVar2.f5971a.ordinal();
                        if (ordinal == 0) {
                            aVar = aVar2;
                        } else if (ordinal == 1) {
                            aVar = aVar3;
                        } else {
                            if (ordinal != 2 && ordinal != 3) {
                                StringBuilder l10 = defpackage.f.l("Unknown view change type: ");
                                l10.append(iVar2.f5971a);
                                throw new IllegalArgumentException(l10.toString());
                            }
                            aVar = e.a.MODIFIED;
                        }
                        if (aVar != aVar3) {
                            j9.g h10 = jVar3.f8685a.h(gVar4.getKey());
                            i10 = h10 == null ? -1 : jVar3.f8686b.f14652a.m(h10);
                            x6.b.Z("Index for document not found", i10 >= 0, new Object[0]);
                            jVar3 = jVar3.h(gVar4.getKey());
                        } else {
                            i10 = -1;
                        }
                        if (aVar != aVar2) {
                            j9.j a10 = jVar3.a(gVar4);
                            j9.g h11 = a10.f8685a.h(gVar4.getKey());
                            i11 = h11 == null ? -1 : a10.f8686b.f14652a.m(h11);
                            x6.b.Z("Index for document not found", i11 >= 0, new Object[0]);
                            jVar3 = a10;
                        } else {
                            i11 = -1;
                        }
                        arrayList.add(new d9.e(jVar4, aVar, i10, i11));
                        firebaseFirestore = firebaseFirestore2;
                    }
                }
            }
            this.f3194d = Collections.unmodifiableList(arrayList);
            this.f3195e = j0Var;
        }
        return this.f3194d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3193c.equals(kVar.f3193c) && this.f3191a.equals(kVar.f3191a) && this.f3192b.equals(kVar.f3192b) && this.f.equals(kVar.f);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f3192b.f6077b.size());
        Iterator<j9.g> it = this.f3192b.f6077b.iterator();
        while (true) {
            e.a aVar = (e.a) it;
            if (!aVar.hasNext()) {
                return arrayList;
            }
            j9.g gVar = (j9.g) aVar.next();
            FirebaseFirestore firebaseFirestore = this.f3193c;
            s0 s0Var = this.f3192b;
            arrayList.add(new j(firebaseFirestore, gVar.getKey(), gVar, s0Var.f6080e, s0Var.f.contains(gVar.getKey())));
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f3192b.hashCode() + ((this.f3191a.hashCode() + (this.f3193c.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        return new a((e.a) this.f3192b.f6077b.iterator());
    }
}
