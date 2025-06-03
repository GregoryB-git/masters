package com.google.android.recaptcha.internal;

import dc.l;
import dc.p;
import java.util.concurrent.CancellationException;
import kc.b;
import nc.j0;
import nc.j1;
import nc.o;
import nc.q;
import nc.r;
import nc.t0;
import ub.e;
import ub.h;
import uc.c;

/* loaded from: classes.dex */
public final class zzbw implements j0 {
    private final /* synthetic */ r zza;

    public zzbw(r rVar) {
        this.zza = rVar;
    }

    @Override // nc.j1
    public final o attachChild(q qVar) {
        return this.zza.attachChild(qVar);
    }

    @Override // nc.j0
    public final Object await(e eVar) {
        return this.zza.await(eVar);
    }

    @Override // nc.j1
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // nc.j1
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // nc.j1
    public final /* synthetic */ boolean cancel(Throwable th) {
        return this.zza.cancel(th);
    }

    @Override // ub.h.b, ub.h
    public final Object fold(Object obj, p pVar) {
        return this.zza.fold(obj, pVar);
    }

    @Override // ub.h.b, ub.h
    public final h.b get(h.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // nc.j1
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // nc.j1
    public final b getChildren() {
        return this.zza.getChildren();
    }

    @Override // nc.j0
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // nc.j0
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // ub.h.b
    public final h.c getKey() {
        return this.zza.getKey();
    }

    @Override // nc.j0
    public final c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // nc.j1
    public final uc.a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // nc.j1
    public final j1 getParent() {
        return this.zza.getParent();
    }

    @Override // nc.j1
    public final t0 invokeOnCompletion(l lVar) {
        return this.zza.invokeOnCompletion(lVar);
    }

    @Override // nc.j1
    public final t0 invokeOnCompletion(boolean z10, boolean z11, l lVar) {
        return this.zza.invokeOnCompletion(z10, z11, lVar);
    }

    @Override // nc.j1
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // nc.j1
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // nc.j1
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // nc.j1
    public final Object join(e eVar) {
        return this.zza.join(eVar);
    }

    @Override // ub.h.b, ub.h
    public final h minusKey(h.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // nc.j1
    public final j1 plus(j1 j1Var) {
        return this.zza.plus(j1Var);
    }

    @Override // ub.h
    public final h plus(h hVar) {
        return this.zza.plus(hVar);
    }

    @Override // nc.j1
    public final boolean start() {
        return this.zza.start();
    }
}
