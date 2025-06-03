/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutionException
 */
package V2;

import V2.K;
import V2.q;
import java.util.concurrent.ExecutionException;

public final class r
implements q {
    public final Object a = new Object();
    public final int b;
    public final K c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public r(int n8, K k8) {
        this.b = n8;
        this.c = k8;
    }

    private final void c() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                K k8 = this.c;
                int n8 = this.e;
                int n9 = this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n8);
                stringBuilder.append(" out of ");
                stringBuilder.append(n9);
                stringBuilder.append(" underlying tasks failed");
                k8.q((Exception)new ExecutionException(stringBuilder.toString(), (Throwable)this.g));
                return;
            }
            if (this.h) {
                this.c.s();
                return;
            }
            this.c.r(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(Object object) {
        object = this.a;
        synchronized (object) {
            ++this.d;
            this.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b() {
        Object object = this.a;
        synchronized (object) {
            ++this.f;
            this.h = true;
            this.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(Exception exception) {
        Object object = this.a;
        synchronized (object) {
            ++this.e;
            this.g = exception;
            this.c();
            return;
        }
    }
}

