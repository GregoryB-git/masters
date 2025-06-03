/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Context
 *  android.os.Looper
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package A2;

import A2.C;
import A2.D;
import A2.c;
import A2.d;
import A2.h;
import A2.n;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import x2.j;
import x2.k;
import y2.a;
import y2.e;

public abstract class g
extends c
implements a.f {
    public final d F;
    public final Set G;
    public final Account H;

    public g(Context context, Looper looper, int n8, d d8, e.a a8, e.b b8) {
        this(context, looper, n8, d8, (z2.d)a8, (z2.j)b8);
    }

    public g(Context context, Looper looper, int n8, d d8, z2.d d9, z2.j j8) {
        this(context, looper, h.b(context), j.m(), n8, d8, (z2.d)n.i(d9), (z2.j)n.i(j8));
    }

    public g(Context context, Looper looper, h h8, j j8, int n8, d d8, z2.d object, z2.j object2) {
        object = object == null ? null : new C((z2.d)object);
        object2 = object2 == null ? null : new D((z2.j)object2);
        super(context, looper, h8, j8, n8, (c.a)object, (c.b)object2, d8.h());
        this.F = d8;
        this.H = d8.a();
        this.G = this.k0(d8.c());
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

    public Set j0(Set set) {
        return set;
    }

    public final Set k0(Set set) {
        Set set2 = this.j0(set);
        Iterator iterator = set2.iterator();
        while (iterator.hasNext()) {
            if (set.contains((Object)((Scope)iterator.next()))) continue;
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        return set2;
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

