/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobParameters
 *  android.graphics.Typeface
 *  android.view.Surface
 *  android.view.View
 *  androidx.constraintlayout.motion.widget.ViewTransition
 *  androidx.core.content.res.ResourcesCompat$FontCallback
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService
 *  com.google.android.exoplayer2.Format
 *  com.google.android.exoplayer2.audio.AudioRendererEventListener$EventDispatcher
 *  com.google.android.exoplayer2.offline.DownloadAction
 *  com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher
 *  com.hintsolutions.raintv.programs.ProgramsFragment
 *  com.hintsolutions.raintv.services.video.DownloadTracker
 *  java.lang.Object
 *  java.lang.Runnable
 *  ru.tvrain.core.data.Program
 */
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.view.Surface;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.hintsolutions.raintv.programs.ProgramsFragment;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import ru.tvrain.core.data.Program;

public final class q5
implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ q5(Object object, Object object2, int n) {
        this.a = n;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 6: {
                ProgramsFragment.f((ProgramsFragment)((ProgramsFragment)this.b), (Program)((Program)this.c));
                return;
            }
            case 5: {
                VideoRendererEventListener.EventDispatcher.e((VideoRendererEventListener.EventDispatcher)((VideoRendererEventListener.EventDispatcher)this.b), (Surface)((Surface)this.c));
                return;
            }
            case 4: {
                VideoRendererEventListener.EventDispatcher.a((VideoRendererEventListener.EventDispatcher)((VideoRendererEventListener.EventDispatcher)this.b), (Format)((Format)this.c));
                return;
            }
            case 3: {
                AudioRendererEventListener.EventDispatcher.a((AudioRendererEventListener.EventDispatcher)((AudioRendererEventListener.EventDispatcher)this.b), (Format)((Format)this.c));
                return;
            }
            case 2: {
                JobInfoSchedulerService.a((JobInfoSchedulerService)((JobInfoSchedulerService)this.b), (JobParameters)((JobParameters)this.c));
                return;
            }
            case 1: {
                ResourcesCompat.FontCallback.b((ResourcesCompat.FontCallback)((ResourcesCompat.FontCallback)this.b), (Typeface)((Typeface)this.c));
                return;
            }
            case 0: {
                ViewTransition.a((ViewTransition)((ViewTransition)this.b), (View[])((View[])this.c));
                return;
            }
        }
        DownloadTracker.a((DownloadTracker)((DownloadTracker)this.b), (DownloadAction[])((DownloadAction[])this.c));
    }
}

