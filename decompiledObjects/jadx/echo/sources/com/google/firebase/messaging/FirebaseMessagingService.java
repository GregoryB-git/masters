package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC1119i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "Received duplicate message: " + str);
        return true;
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1119i
    public Intent getStartCommandIntent(Intent intent) {
        return Y.b().c();
    }

    public final void h(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (L.t(extras)) {
            L l7 = new L(extras);
            ExecutorService e7 = AbstractC1125o.e();
            try {
                if (new C1116f(this, l7, e7).a()) {
                    return;
                }
                if (J.B(intent)) {
                    J.t(intent);
                }
            } finally {
                e7.shutdown();
            }
        }
        onMessageReceived(new T(extras));
    }

    @Override // com.google.firebase.messaging.AbstractServiceC1119i
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            j(intent);
            return;
        }
        if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
            return;
        }
        Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
    }

    public final String i(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final void j(Intent intent) {
        if (g(intent.getStringExtra("google.message_id"))) {
            return;
        }
        k(intent);
    }

    public final void k(Intent intent) {
        String stringExtra;
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                J.v(intent);
                h(intent);
                break;
            case "send_error":
                onSendError(i(intent), new X(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull T t7) {
    }

    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }
}
