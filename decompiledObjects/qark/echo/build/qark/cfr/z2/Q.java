/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.DeadObjectException
 *  android.os.RemoteException
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package z2;

import V2.k;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import x2.d;
import y2.a;
import z2.F;
import z2.T;
import z2.l;
import z2.m;
import z2.o;
import z2.x;

public final class Q
extends F {
    public final m b;
    public final k c;
    public final l d;

    public Q(int n8, m m8, k k8, l l8) {
        super(n8);
        this.c = k8;
        this.b = m8;
        this.d = l8;
        if (n8 == 2) {
            if (!m8.c()) {
                return;
            }
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override
    public final void b(Exception exception) {
        this.c.d(exception);
    }

    @Override
    public final void c(x x8) {
        DeadObjectException deadObjectException2;
        block5 : {
            RemoteException remoteException2;
            block4 : {
                try {
                    this.b.b(x8.t(), this.c);
                    return;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (RemoteException remoteException2) {
                    break block4;
                }
                catch (DeadObjectException deadObjectException2) {
                    break block5;
                }
                this.c.d((Exception)runtimeException);
                return;
            }
            this.a(T.e(remoteException2));
            return;
        }
        throw deadObjectException2;
    }

    @Override
    public final void d(o o8, boolean bl) {
        o8.b(this.c, bl);
    }

    @Override
    public final boolean f(x x8) {
        return this.b.c();
    }

    @Override
    public final d[] g(x x8) {
        return this.b.e();
    }
}

