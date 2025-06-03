package io.flutter.embedding.android;

import android.app.Activity;
import ec.i;
import i2.k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import nc.e0;
import nc.j1;
import qc.e;
import rb.h;

/* loaded from: classes.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    public final h2.a adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(h2.a aVar) {
        this.adapter = aVar;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, d0.a<k> aVar) {
        h2.a aVar2 = this.adapter;
        aVar2.getClass();
        i.e(activity, "activity");
        i.e(executor, "executor");
        i.e(aVar, "consumer");
        g2.b bVar = aVar2.f7060c;
        e<k> a10 = aVar2.f7059b.a(activity);
        bVar.getClass();
        i.e(a10, "flow");
        ReentrantLock reentrantLock = bVar.f5808a;
        reentrantLock.lock();
        try {
            if (bVar.f5809b.get(aVar) == null) {
                bVar.f5809b.put(aVar, x6.b.g0(e0.a(x6.b.W(executor)), null, new g2.a(a10, aVar, null), 3));
            }
            h hVar = h.f13851a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void removeWindowLayoutInfoListener(d0.a<k> aVar) {
        h2.a aVar2 = this.adapter;
        aVar2.getClass();
        i.e(aVar, "consumer");
        g2.b bVar = aVar2.f7060c;
        bVar.getClass();
        ReentrantLock reentrantLock = bVar.f5808a;
        reentrantLock.lock();
        try {
            j1 j1Var = (j1) bVar.f5809b.get(aVar);
            if (j1Var != null) {
                j1Var.cancel((CancellationException) null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
