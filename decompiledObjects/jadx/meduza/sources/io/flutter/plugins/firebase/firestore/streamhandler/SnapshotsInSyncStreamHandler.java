package io.flutter.plugins.firebase.firestore.streamhandler;

import com.google.firebase.firestore.FirebaseFirestore;
import d9.b0;
import d9.l;
import d9.x;
import g9.d;
import g9.u;
import io.flutter.plugin.common.EventChannel;
import n9.f;
import x0.q0;

/* loaded from: classes.dex */
public class SnapshotsInSyncStreamHandler implements EventChannel.StreamHandler {
    public FirebaseFirestore firestore;
    public b0 listenerRegistration;

    public SnapshotsInSyncStreamHandler(FirebaseFirestore firebaseFirestore) {
        this.firestore = firebaseFirestore;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        b0 b0Var = this.listenerRegistration;
        if (b0Var != null) {
            b0Var.remove();
            this.listenerRegistration = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        b0 b0Var;
        final u.a aVar = new u.a(eventSink, 19);
        FirebaseFirestore firebaseFirestore = this.firestore;
        firebaseFirestore.getClass();
        final d dVar = new d(f.f11360a, new l() { // from class: d9.u
            @Override // d9.l
            public final void a(Object obj2, com.google.firebase.firestore.f fVar) {
                Runnable runnable = aVar;
                x6.b.Z("snapshots-in-sync listeners should never get errors.", fVar == null, new Object[0]);
                runnable.run();
            }
        });
        x xVar = firebaseFirestore.f3138k;
        synchronized (xVar) {
            xVar.b();
            final u uVar = xVar.f3734b;
            uVar.d();
            uVar.f6090d.a(new q0(12, uVar, dVar));
            b0Var = new b0() { // from class: d9.w
                @Override // d9.b0
                public final void remove() {
                    g9.d dVar2 = g9.d.this;
                    g9.u uVar2 = uVar;
                    dVar2.f5922c = true;
                    uVar2.f6090d.a(new g.q(16, uVar2, dVar2));
                }
            };
        }
        this.listenerRegistration = b0Var;
    }
}
