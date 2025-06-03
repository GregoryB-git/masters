/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  butterknife.internal.DebouncingOnClickListener
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver
 *  com.onesignal.OSFocusHandler
 *  java.lang.Object
 *  java.lang.Runnable
 */
import butterknife.internal.DebouncingOnClickListener;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.onesignal.OSFocusHandler;

public final class w0
implements Runnable {
    public final int a;

    public /* synthetic */ w0(int n) {
        this.a = n;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                AlarmManagerSchedulerBroadcastReceiver.a();
                return;
            }
            case 0: {
                DebouncingOnClickListener.a();
                return;
            }
        }
        OSFocusHandler.a();
    }
}

