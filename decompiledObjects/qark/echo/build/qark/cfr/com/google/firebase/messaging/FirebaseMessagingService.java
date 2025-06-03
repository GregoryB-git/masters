/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 *  java.util.Queue
 *  java.util.concurrent.ExecutorService
 */
package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.J;
import com.google.firebase.messaging.L;
import com.google.firebase.messaging.T;
import com.google.firebase.messaging.X;
import com.google.firebase.messaging.Y;
import com.google.firebase.messaging.f;
import com.google.firebase.messaging.i;
import com.google.firebase.messaging.o;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService
extends i {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public final boolean g(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        StringBuilder stringBuilder = recentlyReceivedMessageIds;
        if (stringBuilder.contains((Object)string2)) {
            if (Log.isLoggable((String)"FirebaseMessaging", (int)3)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Received duplicate message: ");
                stringBuilder.append(string2);
                Log.d((String)"FirebaseMessaging", (String)stringBuilder.toString());
            }
            return true;
        }
        if (stringBuilder.size() >= 10) {
            stringBuilder.remove();
        }
        stringBuilder.add((Object)string2);
        return false;
    }

    @Override
    public Intent getStartCommandIntent(Intent intent) {
        return Y.b().c();
    }

    public final void h(Intent intent) {
        Bundle bundle;
        block7 : {
            Bundle bundle2;
            bundle = bundle2 = intent.getExtras();
            if (bundle2 == null) {
                bundle = new Bundle();
            }
            bundle.remove("androidx.content.wakelockid");
            if (L.t(bundle)) {
                block6 : {
                    Object object = new L(bundle);
                    bundle2 = o.e();
                    object = new f((Context)this, (L)object, (ExecutorService)bundle2);
                    boolean bl = object.a();
                    if (!bl) break block6;
                    return;
                }
                if (J.B(intent)) {
                    J.t(intent);
                }
                break block7;
                finally {
                    bundle2.shutdown();
                }
            }
        }
        this.onMessageReceived(new T(bundle));
    }

    @Override
    public void handleIntent(Intent intent) {
        String string2 = intent.getAction();
        if (!"com.google.android.c2dm.intent.RECEIVE".equals((Object)string2) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals((Object)string2)) {
            if ("com.google.firebase.messaging.NEW_TOKEN".equals((Object)string2)) {
                this.onNewToken(intent.getStringExtra("token"));
                return;
            }
            string2 = new StringBuilder();
            string2.append("Unknown intent action: ");
            string2.append(intent.getAction());
            Log.d((String)"FirebaseMessaging", (String)string2.toString());
            return;
        }
        this.j(intent);
    }

    public final String i(Intent intent) {
        String string2;
        String string3 = string2 = intent.getStringExtra("google.message_id");
        if (string2 == null) {
            string3 = intent.getStringExtra("message_id");
        }
        return string3;
    }

    public final void j(Intent intent) {
        if (!this.g(intent.getStringExtra("google.message_id"))) {
            this.k(intent);
        }
    }

    public final void k(Intent intent) {
        String string2;
        String string3 = string2 = intent.getStringExtra("message_type");
        if (string2 == null) {
            string3 = "gcm";
        }
        int n8 = string3.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 814800675: {
                if (!string3.equals((Object)"send_event")) break;
                n9 = 3;
                break;
            }
            case 814694033: {
                if (!string3.equals((Object)"send_error")) break;
                n9 = 2;
                break;
            }
            case 102161: {
                if (!string3.equals((Object)"gcm")) break;
                n9 = 1;
                break;
            }
            case -2062414158: {
                if (!string3.equals((Object)"deleted_messages")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                intent = new StringBuilder();
                intent.append("Received message with unknown type: ");
                intent.append(string3);
                Log.w((String)"FirebaseMessaging", (String)intent.toString());
                return;
            }
            case 3: {
                this.onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            }
            case 2: {
                this.onSendError(this.i(intent), new X(intent.getStringExtra("error")));
                return;
            }
            case 1: {
                J.v(intent);
                this.h(intent);
                return;
            }
            case 0: 
        }
        this.onDeletedMessages();
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull T t8) {
    }

    public void onMessageSent(@NonNull String string2) {
    }

    public void onNewToken(String string2) {
    }

    public void onSendError(@NonNull String string2, @NonNull Exception exception) {
    }
}

