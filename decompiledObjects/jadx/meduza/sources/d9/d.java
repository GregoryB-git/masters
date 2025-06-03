package d9;

import com.google.firebase.firestore.FirebaseFirestore;

/* loaded from: classes.dex */
public final class d extends com.google.firebase.firestore.i {
    public d(j9.o oVar, FirebaseFirestore firebaseFirestore) {
        super(new g9.f0(oVar, null), firebaseFirestore);
        if (oVar.q() % 2 == 1) {
            return;
        }
        StringBuilder l10 = defpackage.f.l("Invalid collection reference. Collection references must have an odd number of segments, but ");
        l10.append(oVar.h());
        l10.append(" has ");
        l10.append(oVar.q());
        throw new IllegalArgumentException(l10.toString());
    }
}
