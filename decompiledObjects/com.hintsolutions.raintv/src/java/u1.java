/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.FirebaseApp
 *  com.google.firebase.FirebaseApp$BackgroundStateChangeListener
 *  java.lang.Object
 */
import com.google.firebase.FirebaseApp;

public final class u1
implements FirebaseApp.BackgroundStateChangeListener {
    public final FirebaseApp a;

    public /* synthetic */ u1(FirebaseApp firebaseApp) {
        this.a = firebaseApp;
    }

    public final void onBackgroundStateChanged(boolean bl) {
        FirebaseApp.a((FirebaseApp)this.a, (boolean)bl);
    }
}

