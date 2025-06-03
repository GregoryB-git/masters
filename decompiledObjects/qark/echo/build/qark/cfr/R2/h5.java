/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  java.lang.Object
 *  java.lang.Runnable
 */
package R2;

import R2.Y1;
import R2.i5;
import android.app.job.JobParameters;

public final class h5
implements Runnable {
    public /* synthetic */ i5 o;
    public /* synthetic */ Y1 p;
    public /* synthetic */ JobParameters q;

    public /* synthetic */ h5(i5 i52, Y1 y12, JobParameters jobParameters) {
        this.o = i52;
        this.p = y12;
        this.q = jobParameters;
    }

    public final void run() {
        this.o.e(this.p, this.q);
    }
}

