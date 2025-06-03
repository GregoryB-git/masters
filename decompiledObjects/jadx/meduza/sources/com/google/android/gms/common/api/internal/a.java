package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import k6.a;
import k6.a.b;
import k6.e;
import k6.j;

/* loaded from: classes.dex */
public abstract class a<R extends j, A extends a.b> extends BasePendingResult<R> {
    private final k6.a<?> api;
    private final a.c<A> clientKey;

    public a(BasePendingResult.a<R> aVar) {
        super(aVar);
        this.clientKey = new a.c<>();
        this.api = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public a(a.c<A> cVar, e eVar) {
        super(eVar);
        if (eVar == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        m6.j.i(cVar);
        this.clientKey = cVar;
        this.api = null;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    public abstract void doExecute(A a10);

    public final k6.a<?> getApi() {
        return this.api;
    }

    public final a.c<A> getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(R r10) {
    }

    public final void run(A a10) {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult(e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    public final void setFailedResult(Status status) {
        m6.j.a("Failed result must not be success", !status.D());
        R createFailedResult = createFailedResult(status);
        setResult((a<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((a<R, A>) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k6.a<?> aVar, e eVar) {
        super(eVar);
        if (eVar == null) {
            throw new NullPointerException("GoogleApiClient must not be null");
        }
        if (aVar == null) {
            throw new NullPointerException("Api must not be null");
        }
        this.clientKey = aVar.f9094b;
        this.api = aVar;
    }
}
