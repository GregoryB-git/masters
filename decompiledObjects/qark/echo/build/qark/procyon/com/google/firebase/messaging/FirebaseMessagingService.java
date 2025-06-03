// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends i
{
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds;
    
    static {
        recentlyReceivedMessageIds = new ArrayDeque<String>(10);
    }
    
    public static void resetForTesting() {
        FirebaseMessagingService.recentlyReceivedMessageIds.clear();
    }
    
    public final boolean g(final String str) {
        if (TextUtils.isEmpty((CharSequence)str)) {
            return false;
        }
        final Queue<String> recentlyReceivedMessageIds = FirebaseMessagingService.recentlyReceivedMessageIds;
        if (recentlyReceivedMessageIds.contains(str)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Received duplicate message: ");
                sb.append(str);
                Log.d("FirebaseMessaging", sb.toString());
            }
            return true;
        }
        if (recentlyReceivedMessageIds.size() >= 10) {
            recentlyReceivedMessageIds.remove();
        }
        recentlyReceivedMessageIds.add(str);
        return false;
    }
    
    @Override
    public Intent getStartCommandIntent(final Intent intent) {
        return Y.b().c();
    }
    
    public final void h(final Intent intent) {
        Bundle extras;
        if ((extras = intent.getExtras()) == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (L.t(extras)) {
            final L l = new L(extras);
            final ExecutorService e = o.e();
            final f f = new f((Context)this, l, e);
            try {
                final boolean a = f.a();
                e.shutdown();
                if (a) {
                    return;
                }
                if (J.B(intent)) {
                    J.t(intent);
                }
            }
            finally {
                e.shutdown();
            }
        }
        this.onMessageReceived(new T(extras));
    }
    
    @Override
    public void handleIntent(final Intent intent) {
        final String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            this.j(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            this.onNewToken(intent.getStringExtra("token"));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown intent action: ");
        sb.append(intent.getAction());
        Log.d("FirebaseMessaging", sb.toString());
    }
    
    public final String i(final Intent intent) {
        String s;
        if ((s = intent.getStringExtra("google.message_id")) == null) {
            s = intent.getStringExtra("message_id");
        }
        return s;
    }
    
    public final void j(final Intent intent) {
        if (!this.g(intent.getStringExtra("google.message_id"))) {
            this.k(intent);
        }
    }
    
    public final void k(final Intent intent) {
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("message_type")) == null) {
            stringExtra = "gcm";
        }
        final int hashCode = stringExtra.hashCode();
        int n = -1;
        switch (hashCode) {
            case 814800675: {
                if (!stringExtra.equals("send_event")) {
                    break;
                }
                n = 3;
                break;
            }
            case 814694033: {
                if (!stringExtra.equals("send_error")) {
                    break;
                }
                n = 2;
                break;
            }
            case 102161: {
                if (!stringExtra.equals("gcm")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2062414158: {
                if (!stringExtra.equals("deleted_messages")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Received message with unknown type: ");
                sb.append(stringExtra);
                Log.w("FirebaseMessaging", sb.toString());
            }
            case 3: {
                this.onMessageSent(intent.getStringExtra("google.message_id"));
            }
            case 2: {
                this.onSendError(this.i(intent), new X(intent.getStringExtra("error")));
            }
            case 1: {
                J.v(intent);
                this.h(intent);
            }
            case 0: {
                this.onDeletedMessages();
            }
        }
    }
    
    public void onDeletedMessages() {
    }
    
    public void onMessageReceived(@NonNull final T t) {
    }
    
    public void onMessageSent(@NonNull final String s) {
    }
    
    public void onNewToken(final String s) {
    }
    
    public void onSendError(@NonNull final String s, @NonNull final Exception ex) {
    }
}
