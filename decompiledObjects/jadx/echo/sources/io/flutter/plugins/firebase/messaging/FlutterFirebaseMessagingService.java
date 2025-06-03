package io.flutter.plugins.firebase.messaging;

import O5.C;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.T;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(T t7) {
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        C.k().l(str);
    }
}
