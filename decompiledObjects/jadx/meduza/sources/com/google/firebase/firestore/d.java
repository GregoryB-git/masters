package com.google.firebase.firestore;

import d9.u0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f3148a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.i f3149b;

    /* renamed from: c, reason: collision with root package name */
    public final j9.g f3150c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f3151d;

    public enum a {
        NONE,
        ESTIMATE,
        PREVIOUS
    }

    public d(FirebaseFirestore firebaseFirestore, j9.i iVar, j9.g gVar, boolean z10, boolean z11) {
        firebaseFirestore.getClass();
        this.f3148a = firebaseFirestore;
        iVar.getClass();
        this.f3149b = iVar;
        this.f3150c = gVar;
        this.f3151d = new u0(z11, z10);
    }

    public HashMap a(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Provided serverTimestampBehavior value must not be null.");
        }
        m mVar = new m(this.f3148a, aVar);
        j9.g gVar = this.f3150c;
        if (gVar == null) {
            return null;
        }
        return mVar.a(gVar.getData().b().Y().J());
    }

    public Map<String, Object> b() {
        return a(a.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3148a.equals(dVar.f3148a) && this.f3149b.equals(dVar.f3149b) && this.f3151d.equals(dVar.f3151d)) {
            j9.g gVar = this.f3150c;
            if (gVar == null) {
                if (dVar.f3150c == null) {
                    return true;
                }
            } else if (dVar.f3150c != null && gVar.getData().equals(dVar.f3150c.getData())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3149b.hashCode() + (this.f3148a.hashCode() * 31)) * 31;
        j9.g gVar = this.f3150c;
        int hashCode2 = (hashCode + (gVar != null ? gVar.getKey().hashCode() : 0)) * 31;
        j9.g gVar2 = this.f3150c;
        return this.f3151d.hashCode() + ((hashCode2 + (gVar2 != null ? gVar2.getData().hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("DocumentSnapshot{key=");
        l10.append(this.f3149b);
        l10.append(", metadata=");
        l10.append(this.f3151d);
        l10.append(", doc=");
        l10.append(this.f3150c);
        l10.append('}');
        return l10.toString();
    }
}
