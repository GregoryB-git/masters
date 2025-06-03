package com.google.firebase.messaging;

import aa.c0;
import aa.d0;
import aa.g;
import aa.h;
import aa.q;
import aa.s;
import aa.z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import defpackage.f;
import i6.c;
import i6.w;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class FirebaseMessagingService extends h {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private c rpc;

    private boolean alreadyReceivedMessage(String str) {
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

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (s.l(extras)) {
            s sVar = new s(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new w6.a("Firebase-Messaging-Network-Io"));
            try {
                if (new g(this, sVar, newSingleThreadExecutor).a()) {
                    return;
                }
                if (q.d(intent)) {
                    q.c(intent.getExtras(), "_nf");
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new z(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private c getRpc(Context context) {
        if (this.rpc == null) {
            this.rpc = new c(context.getApplicationContext());
        }
        return this.rpc;
    }

    private void handleMessageIntent(Intent intent) {
        int i10;
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
        c rpc = getRpc(this);
        i6.a aVar = new i6.a(intent);
        if (rpc.f7576c.a() < 233700000) {
            Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.D());
        Integer valueOf = aVar.f7564a.hasExtra("google.product_id") ? Integer.valueOf(aVar.f7564a.getIntExtra("google.product_id", 0)) : null;
        if (valueOf != null) {
            bundle.putInt("google.product_id", valueOf.intValue());
        }
        i6.z a10 = i6.z.a(rpc.f7575b);
        synchronized (a10) {
            i10 = a10.f7625d;
            a10.f7625d = i10 + 1;
        }
        a10.b(new w(i10, 3, bundle));
    }

    private void passMessageIntentToSdk(Intent intent) {
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
                q.b(intent);
                dispatchMessage(intent);
                break;
            case "send_error":
                onSendError(getMessageId(intent), new c0(intent.getStringExtra("error")));
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                break;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // aa.h
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) d0.a().f279d.poll();
    }

    @Override // aa.h
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra("token"));
                return;
            }
            StringBuilder l10 = f.l("Unknown intent action: ");
            l10.append(intent.getAction());
            Log.d("FirebaseMessaging", l10.toString());
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(z zVar) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }

    public void setRpcForTesting(c cVar) {
        this.rpc = cVar;
    }
}
