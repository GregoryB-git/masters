/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.concurrent.Executor
 */
package V2;

import V2.b;
import V2.d;
import V2.e;
import V2.f;
import V2.g;
import V2.i;
import java.util.concurrent.Executor;

public abstract class j {
    public j a(Executor executor, d d8) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public j b(e e8) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public j c(Executor executor, e e8) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract j d(Executor var1, f var2);

    public abstract j e(Executor var1, g var2);

    public j f(b b8) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public j g(Executor executor, b b8) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public j h(Executor executor, b b8) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract Object j();

    public abstract Object k(Class var1);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public j o(i i8) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public j p(Executor executor, i i8) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}

