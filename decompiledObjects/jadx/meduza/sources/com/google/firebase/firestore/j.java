package com.google.firebase.firestore;

import com.google.firebase.firestore.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j extends d {
    public j(FirebaseFirestore firebaseFirestore, j9.i iVar, j9.g gVar, boolean z10, boolean z11) {
        super(firebaseFirestore, iVar, gVar, z10, z11);
    }

    @Override // com.google.firebase.firestore.d
    public final HashMap a(d.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Provided serverTimestampBehavior value must not be null.");
        }
        HashMap a10 = super.a(aVar);
        x6.b.Z("Data in a QueryDocumentSnapshot should be non-null", a10 != null, new Object[0]);
        return a10;
    }

    @Override // com.google.firebase.firestore.d
    public final Map<String, Object> b() {
        Map<String, Object> b10 = super.b();
        x6.b.Z("Data in a QueryDocumentSnapshot should be non-null", b10 != null, new Object[0]);
        return b10;
    }
}
