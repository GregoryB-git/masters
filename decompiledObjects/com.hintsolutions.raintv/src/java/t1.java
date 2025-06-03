/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.heartbeatinfo.DefaultHeartBeatController
 *  com.google.firebase.inject.Provider
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;

public final class t1
implements Provider {
    public final int a;
    public final Context b;
    public final Object c;

    public /* synthetic */ t1(Context context, String string) {
        this.a = 1;
        this.b = context;
        this.c = string;
    }

    public /* synthetic */ t1(FirebaseApp firebaseApp, Context context) {
        this.a = 0;
        this.c = firebaseApp;
        this.b = context;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return FirebaseApp.b((FirebaseApp)((FirebaseApp)this.c), (Context)this.b);
            }
        }
        return DefaultHeartBeatController.c((Context)this.b, (String)((String)this.c));
    }
}

