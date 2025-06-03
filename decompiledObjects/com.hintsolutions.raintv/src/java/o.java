/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.services.audio.AudioActivity
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.hintsolutions.raintv.services.audio.AudioActivity;

public final class o
implements Runnable {
    public final int a;
    public final AudioActivity b;

    public /* synthetic */ o(AudioActivity audioActivity, int n) {
        this.a = n;
        this.b = audioActivity;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                AudioActivity.C((AudioActivity)this.b);
                return;
            }
        }
        AudioActivity.z((AudioActivity)this.b);
    }
}

