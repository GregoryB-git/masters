/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.offline.DownloadAction
 *  com.google.android.exoplayer2.offline.DownloadManager
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadManager;

public final class c1
implements Runnable {
    public final int a;
    public final DownloadManager b;
    public final DownloadAction[] c;

    public /* synthetic */ c1(DownloadManager downloadManager, DownloadAction[] downloadActionArray, int n) {
        this.a = n;
        this.b = downloadManager;
        this.c = downloadActionArray;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                DownloadManager.a((DownloadManager)this.b, (DownloadAction[])this.c);
                return;
            }
        }
        DownloadManager.b((DownloadManager)this.b, (DownloadAction[])this.c);
    }
}

