/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p4;

import V2.g;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.b;
import p4.l;

public final class i
implements g {
    public final FirebaseInstanceId a;
    public final b.a b;

    public i(FirebaseInstanceId firebaseInstanceId, b.a a8) {
        this.a = firebaseInstanceId;
        this.b = a8;
    }

    @Override
    public void a(Object object) {
        this.a.x(this.b, (l)object);
    }
}

