package io.flutter.plugins.firebase.auth;

import b8.r;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugin.common.EventChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AuthStateChannelStreamHandler implements EventChannel.StreamHandler {
    private FirebaseAuth.a authStateListener;
    private final FirebaseAuth firebaseAuth;

    public AuthStateChannelStreamHandler(FirebaseAuth firebaseAuth) {
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
        FirebaseAuth.a aVar = this.authStateListener;
        if (aVar != null) {
            this.firebaseAuth.f3060d.remove(aVar);
            this.authStateListener = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.firebase.auth.FirebaseAuth$a, io.flutter.plugins.firebase.auth.a, java.lang.Object] */
    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, final EventChannel.EventSink eventSink) {
        final HashMap hashMap = new HashMap();
        u7.f fVar = this.firebaseAuth.f3057a;
        fVar.a();
        hashMap.put("appName", fVar.f15085b);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ?? r12 = new FirebaseAuth.a() { // from class: io.flutter.plugins.firebase.auth.a
            @Override // com.google.firebase.auth.FirebaseAuth.a
            public final void a(FirebaseAuth firebaseAuth) {
                AuthStateChannelStreamHandler.lambda$onListen$0(atomicBoolean, hashMap, eventSink, firebaseAuth);
            }
        };
        this.authStateListener = r12;
        FirebaseAuth firebaseAuth = this.firebaseAuth;
        firebaseAuth.f3060d.add(r12);
        firebaseAuth.A.execute(new com.google.firebase.auth.f(firebaseAuth, r12));
    }
}
