/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package p4;

import V2.b;
import V2.j;
import com.google.firebase.iid.FirebaseInstanceId;

public final class c
implements b {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;

    public c(FirebaseInstanceId firebaseInstanceId, String string2, String string3) {
        this.a = firebaseInstanceId;
        this.b = string2;
        this.c = string3;
    }

    @Override
    public Object a(j j8) {
        return this.a.z(this.b, this.c, j8);
    }
}

