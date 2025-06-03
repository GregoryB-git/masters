/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package s4;

import V2.k;
import s4.p;
import u4.d;

public class m
implements p {
    public final k a;

    public m(k k8) {
        this.a = k8;
    }

    @Override
    public boolean a(Exception exception) {
        return false;
    }

    @Override
    public boolean b(d d8) {
        if (!(d8.l() || d8.k() || d8.i())) {
            return false;
        }
        this.a.e(d8.d());
        return true;
    }
}

