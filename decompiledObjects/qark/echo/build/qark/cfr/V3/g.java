/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package V3;

import Q3.l;
import V3.A;
import V3.f;
import c4.d;
import s3.e;

public class g
extends f {
    public void I(A a8) {
        this.d = a8;
    }

    public void J(A a8) {
        this.c = a8;
    }

    public void K(e e8) {
        synchronized (this) {
            this.l = e8;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void L(l enum_) {
        synchronized (this) {
            try {
                this.b();
                int n8 = .a[enum_.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                if (n8 != 5) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown log level: ");
                                    stringBuilder.append((Object)enum_);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                enum_ = d.a.s;
                            } else {
                                enum_ = d.a.r;
                            }
                        } else {
                            enum_ = d.a.q;
                        }
                    } else {
                        enum_ = d.a.p;
                    }
                } else {
                    enum_ = d.a.o;
                }
                this.i = enum_;
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void M(long l8) {
        synchronized (this) {
            try {
                this.b();
                if (l8 < 0x100000L) {
                    throw new Q3.d("The minimum cache size must be at least 1MB");
                }
                if (l8 > 104857600L) throw new Q3.d("Firebase Database currently doesn't support a cache size larger than 100MB");
                {
                    this.k = l8;
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void N(boolean bl) {
        synchronized (this) {
            this.b();
            this.j = bl;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void O(String string2) {
        synchronized (this) {
            try {
                this.b();
                if (string2 == null || string2.isEmpty()) throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
                {
                    this.f = string2;
                    return;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

}

