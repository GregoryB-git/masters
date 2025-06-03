/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.news.NewsActivity
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.hintsolutions.raintv.news.NewsActivity;

public final class j3
implements Runnable {
    public final int a;
    public final NewsActivity b;

    public /* synthetic */ j3(NewsActivity newsActivity, int n) {
        this.a = n;
        this.b = newsActivity;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                NewsActivity.W((NewsActivity)this.b);
                return;
            }
        }
        NewsActivity.V((NewsActivity)this.b);
    }
}

