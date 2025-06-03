/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package p4;

import V2.j;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import com.google.firebase.iid.b;

public final class f
implements a.a {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;
    public final String d;
    public final b.a e;

    public f(FirebaseInstanceId firebaseInstanceId, String string2, String string3, String string4, b.a a8) {
        this.a = firebaseInstanceId;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = a8;
    }

    @Override
    public j start() {
        return this.a.y(this.b, this.c, this.d, this.e);
    }
}

