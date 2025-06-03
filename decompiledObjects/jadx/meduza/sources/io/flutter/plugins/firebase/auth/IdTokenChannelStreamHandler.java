package io.flutter.plugins.firebase.auth;

import b8.r;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class IdTokenChannelStreamHandler implements EventChannel.StreamHandler {
    private final FirebaseAuth firebaseAuth;
    private FirebaseAuth.b idTokenListener;

    public IdTokenChannelStreamHandler(FirebaseAuth firebaseAuth) {
        this.firebaseAuth = firebaseAuth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onListen$0(AtomicBoolean atomicBoolean, Map map, EventChannel.EventSink eventSink, FirebaseAuth firebaseAuth) {
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            return;
        }
        r rVar = firebaseAuth.f;
        map.put(Constants.USER, rVar == null ? null : PigeonParser.manuallyToList(PigeonParser.parseFirebaseUser(rVar)));
        eventSink.success(map);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        FirebaseAuth.b bVar = this.idTokenListener;
        if (bVar != null) {
            this.firebaseAuth.f3058b.remove(bVar);
            this.idTokenListener = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.firebase.auth.FirebaseAuth$b, io.flutter.plugins.firebase.auth.a0, java.lang.Object] */
    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        u7.f fVar = this.firebaseAuth.f3057a;
        fVar.a();
        hashMap.put("appName", fVar.f15085b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ?? r12 = new FirebaseAuth.b() { // from class: io.flutter.plugins.firebase.auth.a0
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth) {
                IdTokenChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.idTokenListener = r12;
        FirebaseAuth firebaseAuth = this.firebaseAuth;
        firebaseAuth.f3058b.add(r12);
        firebaseAuth.A.execute(new com.google.firebase.auth.c(firebaseAuth, r12));
    }
}
