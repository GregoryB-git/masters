// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.messaging;

import O5.C;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FlutterFirebaseMessagingService extends FirebaseMessagingService
{
    @Override
    public void onMessageReceived(final T t) {
    }
    
    @Override
    public void onNewToken(final String s) {
        C.k().l(s);
    }
}
