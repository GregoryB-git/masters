/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package p5;

import java.util.List;
import n5.F;
import p5.e;

public abstract class b
implements e {
    @Override
    public F d() {
        return new F(this.m(), this.n());
    }

    @Override
    public boolean e() {
        return Boolean.TRUE.equals(this.c("noResult"));
    }

    @Override
    public Boolean f() {
        return this.k("inTransaction");
    }

    @Override
    public Integer g() {
        return (Integer)this.c("transactionId");
    }

    @Override
    public boolean h() {
        if (this.j("transactionId") && this.g() == null) {
            return true;
        }
        return false;
    }

    public final Boolean k(String object) {
        if ((object = this.c((String)object)) instanceof Boolean) {
            return (Boolean)object;
        }
        return null;
    }

    public boolean l() {
        return Boolean.TRUE.equals(this.c("continueOnError"));
    }

    public final String m() {
        return (String)this.c("sql");
    }

    public final List n() {
        return (List)this.c("arguments");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.i());
        stringBuilder.append(" ");
        stringBuilder.append(this.m());
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.n());
        return stringBuilder.toString();
    }
}

