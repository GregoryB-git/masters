/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.messaging.FirebaseMessaging
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.firebase.messaging.FirebaseMessaging;

public final class x1
implements Runnable {
    public final int a;
    public final FirebaseMessaging b;

    public /* synthetic */ x1(FirebaseMessaging firebaseMessaging, int n) {
        this.a = n;
        this.b = firebaseMessaging;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                FirebaseMessaging.h((FirebaseMessaging)this.b);
                return;
            }
        }
        FirebaseMessaging.c((FirebaseMessaging)this.b);
    }
}

