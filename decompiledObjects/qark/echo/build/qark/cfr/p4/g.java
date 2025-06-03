/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package p4;

import V2.i;
import V2.j;
import com.google.firebase.iid.FirebaseInstanceId;

public final class g
implements i {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;
    public final String d;

    public g(FirebaseInstanceId firebaseInstanceId, String string2, String string3, String string4) {
        this.a = firebaseInstanceId;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    @Override
    public j a(Object object) {
        return this.a.w(this.b, this.c, this.d, (String)object);
    }
}

