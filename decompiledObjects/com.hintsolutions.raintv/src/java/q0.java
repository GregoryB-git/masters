/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.core.widget.ContentLoadingProgressBar
 *  java.lang.Object
 *  java.lang.Runnable
 */
import androidx.core.widget.ContentLoadingProgressBar;

public final class q0
implements Runnable {
    public final int a;
    public final ContentLoadingProgressBar b;

    public /* synthetic */ q0(ContentLoadingProgressBar contentLoadingProgressBar, int n) {
        this.a = n;
        this.b = contentLoadingProgressBar;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                ContentLoadingProgressBar.a((ContentLoadingProgressBar)this.b);
                return;
            }
            case 1: {
                ContentLoadingProgressBar.b((ContentLoadingProgressBar)this.b);
                return;
            }
            case 0: {
                ContentLoadingProgressBar.d((ContentLoadingProgressBar)this.b);
                return;
            }
        }
        ContentLoadingProgressBar.c((ContentLoadingProgressBar)this.b);
    }
}

