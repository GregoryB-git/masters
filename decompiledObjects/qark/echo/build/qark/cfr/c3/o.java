/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.List
 */
package c3;

import c3.l;
import c3.n;
import c3.x;
import com.google.crypto.tink.shaded.protobuf.x;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import k3.t;
import p3.A;
import p3.C;
import p3.I;
import p3.y;
import p3.z;

public final class o {
    public final C.b a;

    public o(C.b b8) {
        this.a = b8;
    }

    public static o i() {
        return new o(C.d0());
    }

    public static o j(n n8) {
        return new o((C.b)n8.h().T());
    }

    public o a(l l8) {
        synchronized (this) {
            this.b(l8.b(), false);
            return this;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int b(A x8, boolean bl) {
        synchronized (this) {
            try {
                void var2_4;
                C.c c8 = this.f((A)x8);
                this.a.y(c8);
                if (var2_4 == false) return c8.a0();
                this.a.C(c8.a0());
                return c8.a0();
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
    public final C.c c(y x8, I i8) {
        synchronized (this) {
            try {
                int n8 = this.g();
                if (i8 == I.p) throw new GeneralSecurityException("unknown output prefix type");
                return (C.c)C.c.e0().y((y)x8).z(n8).B(z.q).A(i8).n();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public n d() {
        synchronized (this) {
            n n8 = n.e((C)this.a.n());
            return n8;
        }
    }

    public final boolean e(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    Iterator iterator = this.a.B().iterator();
                    while (iterator.hasNext()) {
                        int n9 = ((C.c)iterator.next()).a0();
                        if (n9 != n8) continue;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                {
                    return true;
                    break;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final C.c f(A x8) {
        synchronized (this) {
            x8 = this.c(x.k(x8), x8.Z());
            return x8;
        }
    }

    public final int g() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                int n8;
                do {
                    try {
                        n8 = t.c();
                        boolean bl = this.e(n8);
                        if (!bl) break;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                } while (true);
                return n8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public o h(int n8) {
        synchronized (this) {
            int n9 = 0;
            do {
                block6 : {
                    Throwable throwable2;
                    block7 : {
                        Object object;
                        try {
                            if (n9 >= this.a.A()) {
                                object = new StringBuilder();
                                object.append("key not found: ");
                                object.append(n8);
                                throw new GeneralSecurityException(object.toString());
                            }
                            object = this.a.z(n9);
                            if (object.a0() != n8) break block6;
                            if (object.c0().equals((Object)z.q)) {
                                this.a.C(n8);
                                return this;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                        object = new StringBuilder();
                        object.append("cannot set key as primary because it's not enabled: ");
                        object.append(n8);
                        throw new GeneralSecurityException(object.toString());
                    }
                    throw throwable2;
                }
                ++n9;
            } while (true);
        }
    }
}

