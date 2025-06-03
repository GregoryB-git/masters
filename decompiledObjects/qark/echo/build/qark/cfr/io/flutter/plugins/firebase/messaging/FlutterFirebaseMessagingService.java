/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 */
package io.flutter.plugins.firebase.messaging;

import O5.C;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.T;

public class FlutterFirebaseMessagingService
extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(T t8) {
    }

    @Override
    public void onNewToken(String string2) {
        C.k().l(string2);
    }
}

