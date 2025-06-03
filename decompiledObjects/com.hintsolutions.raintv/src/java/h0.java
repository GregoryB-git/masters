/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.activity.ComponentActivity
 *  androidx.activity.ComponentDialog
 *  androidx.constraintlayout.helper.widget.Carousel
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer
 *  com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource
 *  com.google.firebase.installations.FirebaseInstallations
 *  com.hintsolutions.raintv.programs.ProgramActivity
 *  com.hintsolutions.raintv.search.SearchActivity
 *  java.lang.Object
 *  java.lang.Runnable
 *  tvrain.cast.CastActivity
 */
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.constraintlayout.helper.widget.Carousel;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.firebase.installations.FirebaseInstallations;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.search.SearchActivity;
import com.hintsolutions.raintv.utils.Foreground;
import tvrain.cast.CastActivity;

public final class h0
implements Runnable {
    public final int a;
    public final Object b;

    public /* synthetic */ h0(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 8: {
                Foreground.a((Foreground)this.b);
                return;
            }
            case 7: {
                SearchActivity.I((SearchActivity)((SearchActivity)this.b));
                return;
            }
            case 6: {
                ProgramActivity.A((ProgramActivity)((ProgramActivity)this.b));
                return;
            }
            case 5: {
                FirebaseInstallations.b((FirebaseInstallations)((FirebaseInstallations)this.b));
                return;
            }
            case 4: {
                SsMediaSource.a((SsMediaSource)((SsMediaSource)this.b));
                return;
            }
            case 3: {
                WorkInitializer.b((WorkInitializer)((WorkInitializer)this.b));
                return;
            }
            case 2: {
                Carousel.a((Carousel)((Carousel)this.b));
                return;
            }
            case 1: {
                ComponentDialog.a((ComponentDialog)((ComponentDialog)this.b));
                return;
            }
            case 0: {
                ((ComponentActivity)this.b).invalidateMenu();
                return;
            }
        }
        CastActivity.A((CastActivity)((CastActivity)this.b));
    }
}

