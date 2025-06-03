/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.firebase.installations.FirebaseInstallations
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.firebase.installations.FirebaseInstallations;

public final class w1
implements Runnable {
    public final int a;
    public final FirebaseInstallations b;
    public final boolean c;

    public /* synthetic */ w1(FirebaseInstallations firebaseInstallations, boolean bl, int n) {
        this.a = n;
        this.b = firebaseInstallations;
        this.c = bl;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                FirebaseInstallations.c((FirebaseInstallations)this.b, (boolean)this.c);
                return;
            }
        }
        FirebaseInstallations.d((FirebaseInstallations)this.b, (boolean)this.c);
    }
}

