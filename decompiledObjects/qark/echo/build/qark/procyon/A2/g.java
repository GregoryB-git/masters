// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import java.util.concurrent.Executor;
import java.util.Iterator;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import x2.k;
import z2.j;
import y2.e;
import android.os.Looper;
import android.content.Context;
import android.accounts.Account;
import java.util.Set;
import y2.a;

public abstract class g extends c implements f
{
    public final d F;
    public final Set G;
    public final Account H;
    
    public g(final Context context, final Looper looper, final int n, final d d, final e.a a, final e.b b) {
        this(context, looper, n, d, a, (j)b);
    }
    
    public g(final Context context, final Looper looper, final int n, final d d, final z2.d d2, final j j) {
        this(context, looper, A2.h.b(context), x2.j.m(), n, d, (z2.d)A2.n.i(d2), (j)A2.n.i(j));
    }
    
    public g(final Context context, final Looper looper, final h h, final x2.j j, final int n, final d f, final z2.d d, final j i) {
        Object o;
        if (d == null) {
            o = null;
        }
        else {
            o = new C(d);
        }
        Object o2;
        if (i == null) {
            o2 = null;
        }
        else {
            o2 = new D(i);
        }
        super(context, looper, h, j, n, (a)o, (b)o2, f.h());
        this.F = f;
        this.H = f.a();
        this.G = this.k0(f.c());
    }
    
    @Override
    public final Set C() {
        return this.G;
    }
    
    @Override
    public Set e() {
        if (this.m()) {
            return this.G;
        }
        return Collections.emptySet();
    }
    
    public Set j0(final Set set) {
        return set;
    }
    
    public final Set k0(final Set set) {
        final Set j0 = this.j0(set);
        final Iterator<Scope> iterator = j0.iterator();
        while (iterator.hasNext()) {
            if (set.contains(iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        return j0;
    }
    
    @Override
    public final Account u() {
        return this.H;
    }
    
    @Override
    public final Executor w() {
        return null;
    }
}
