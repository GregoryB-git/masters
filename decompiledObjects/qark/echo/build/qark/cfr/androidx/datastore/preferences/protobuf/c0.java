/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Z;

public final class c0
implements M {
    public final O a;
    public final String b;
    public final Object[] c;
    public final int d;

    /*
     * Enabled aggressive block sorting
     */
    public c0(O o8, String string2, Object[] arrobject) {
        this.a = o8;
        this.b = string2;
        this.c = arrobject;
        int n8 = string2.charAt(0);
        if (n8 >= 55296) {
            char c8;
            int n9 = n8 & 8191;
            int n10 = 13;
            n8 = 1;
            while ((c8 = string2.charAt(n8)) >= '\ud800') {
                n9 |= (c8 & 8191) << n10;
                n10 += 13;
                ++n8;
            }
            n8 = n9 | c8 << n10;
        }
        this.d = n8;
    }

    @Override
    public boolean a() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override
    public Z b() {
        if ((this.d & 1) == 1) {
            return Z.o;
        }
        return Z.p;
    }

    @Override
    public O c() {
        return this.a;
    }

    public Object[] d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }
}

