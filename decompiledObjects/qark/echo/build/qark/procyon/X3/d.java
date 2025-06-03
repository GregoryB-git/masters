// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X3;

import java.util.Set;
import d4.g;
import a4.a;
import a4.i;
import android.util.Log;
import Y3.m;
import java.util.concurrent.Callable;
import d4.n;
import java.util.Collections;
import java.util.List;
import V3.b;
import V3.k;

public class d implements e
{
    public boolean a;
    
    public d() {
        this.a = false;
    }
    
    @Override
    public void a() {
        this.q();
    }
    
    @Override
    public void b(final long n) {
        this.q();
    }
    
    @Override
    public void c(final k k, final b b, final long n) {
        this.q();
    }
    
    @Override
    public List d() {
        return Collections.emptyList();
    }
    
    @Override
    public void e(final k k, final n n, final long n2) {
        this.q();
    }
    
    @Override
    public void f(final k k, final b b) {
        this.q();
    }
    
    @Override
    public Object g(final Callable callable) {
        m.g(this.a ^ true, "runInTransaction called when an existing transaction is already in progress.");
        this.a = true;
        try {
            final Object call = callable.call();
            this.a = false;
            return call;
        }
        finally {
            try {
                final Throwable cause;
                Log.e("NoopPersistenceManager", "Caught Throwable.", cause);
                throw new RuntimeException(cause);
            }
            finally {
                this.a = false;
            }
        }
    }
    
    @Override
    public void h(final k k, final b b) {
        this.q();
    }
    
    @Override
    public void i(final i i) {
        this.q();
    }
    
    @Override
    public void j(final i i, final n n) {
        this.q();
    }
    
    @Override
    public a k(final i i) {
        return new a(d4.i.f(g.W(), i.c()), false, false);
    }
    
    @Override
    public void l(final i i, final Set set, final Set set2) {
        this.q();
    }
    
    @Override
    public void m(final i i) {
        this.q();
    }
    
    @Override
    public void n(final k k, final n n) {
        this.q();
    }
    
    @Override
    public void o(final i i, final Set set) {
        this.q();
    }
    
    @Override
    public void p(final i i) {
        this.q();
    }
    
    public final void q() {
        m.g(this.a, "Transaction expected to already be in progress.");
    }
}
