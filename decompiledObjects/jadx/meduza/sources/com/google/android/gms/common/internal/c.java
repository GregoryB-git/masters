package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import k6.a;
import k6.e;

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> extends a<T> implements a.f {
    private static volatile Executor zaa;
    private final m6.a zab;
    private final Set zac;
    private final Account zad;

    public c(Context context, Handler handler, int i10, m6.a aVar) {
        super(context, handler, m6.c.a(context), j6.e.f8488d, i10, null, null);
        m6.j.i(aVar);
        this.zab = aVar;
        this.zad = aVar.f10240a;
        this.zac = zaa(aVar.f10242c);
    }

    @Deprecated
    public c(Context context, Looper looper, int i10, m6.a aVar, e.a aVar2, e.b bVar) {
        this(context, looper, i10, aVar, (l6.c) aVar2, (l6.j) bVar);
    }

    private final Set zaa(Set set) {
        Set<Scope> validateScopes = validateScopes(set);
        Iterator<Scope> it = validateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.a
    public Executor getBindServiceExecutor() {
        return null;
    }

    public final m6.a getClientSettings() {
        return this.zab;
    }

    public j6.d[] getRequiredFeatures() {
        return new j6.d[0];
    }

    @Override // com.google.android.gms.common.internal.a
    public final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // k6.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.emptySet();
    }

    public Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    public c(Context context, Looper looper, int i10, m6.a aVar) {
        this(context, looper, m6.c.a(context), j6.e.f8488d, i10, aVar, null, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r10, android.os.Looper r11, int r12, m6.a r13, l6.c r14, l6.j r15) {
        /*
            r9 = this;
            m6.s0 r3 = m6.c.a(r10)
            j6.e r4 = j6.e.f8488d
            m6.j.i(r14)
            m6.j.i(r15)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, m6.a, l6.c, l6.j):void");
    }

    public c(Context context, Looper looper, m6.c cVar, j6.e eVar, int i10, m6.a aVar, l6.c cVar2, l6.j jVar) {
        super(context, looper, cVar, eVar, i10, cVar2 == null ? null : new d(cVar2), jVar == null ? null : new e(jVar), aVar.f);
        this.zab = aVar;
        this.zad = aVar.f10240a;
        this.zac = zaa(aVar.f10242c);
    }
}
