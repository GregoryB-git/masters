/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  androidx.constraintlayout.core.state.Interpolator
 *  androidx.constraintlayout.core.state.Transition
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationCompat$Extender
 *  androidx.core.view.inputmethod.InputConnectionCompat
 *  androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
 *  androidx.core.view.inputmethod.InputContentInfoCompat
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer
 *  com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
 *  com.google.android.datatransport.runtime.scheduling.persistence.EventStore
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  com.google.android.gms.tasks.Continuation
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy
 *  com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator
 *  com.google.firebase.crashlytics.internal.common.Utils
 *  com.google.firebase.inject.Deferred$DeferredHandler
 *  com.google.firebase.inject.Provider
 *  com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter
 *  com.hintsolutions.raintv.programs.ProgramActivity
 *  com.hintsolutions.raintv.schedule.ScheduleDayFragment
 *  com.hintsolutions.raintv.services.audio.AudioActivity
 *  com.hintsolutions.raintv.services.push.NotificationServiceExtension
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.concurrent.CountDownLatch
 *  okhttp3.Call
 *  okhttp3.EventListener
 *  okhttp3.EventListener$Factory
 *  okhttp3.ResponseBody
 *  okhttp3.internal.Util
 *  ru.tvrain.core.data.Article
 *  ru.tvrain.core.data.ScheduleProgram
 *  rx.functions.Action1
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.hintsolutions.raintv.adapters.NewsSliderAdapter;
import com.hintsolutions.raintv.news.adapters.AllNewsSectionedAdapter;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.schedule.RainExpandableListAdapter;
import com.hintsolutions.raintv.schedule.ScheduleDayFragment;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.push.NotificationServiceExtension;
import java.util.concurrent.CountDownLatch;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.ScheduleProgram;
import rx.functions.Action1;

public final class s4
implements Interpolator,
InputConnectionCompat.OnCommitContentListener,
SynchronizationGuard.CriticalSection,
Deferred.DeferredHandler,
Continuation,
NewsSliderAdapter.OnItemClickListener,
Action1,
RainExpandableListAdapter.OnItemClickListener,
NotificationCompat.Extender,
EventListener.Factory {
    public final int a;
    public final Object b;

    public /* synthetic */ s4(Object object, int n) {
        this.a = n;
        this.b = object;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 10: {
                ProgramActivity.B((ProgramActivity)((ProgramActivity)this.b), (ResponseBody)((ResponseBody)object));
                return;
            }
        }
        AudioActivity.D((AudioActivity)((AudioActivity)this.b), (Long)((Long)object));
    }

    public final EventListener create(Call call) {
        return Util.b((EventListener)((EventListener)this.b), (Call)call);
    }

    public final Object execute() {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                return Uploader.i((Uploader)((Uploader)this.b));
            }
            case 3: {
                return ((EventStore)this.b).cleanUp();
            }
            case 2: {
                return ((ClientHealthMetricsStore)this.b).loadClientMetrics();
            }
        }
        return WorkInitializer.a((WorkInitializer)((WorkInitializer)this.b));
    }

    public final NotificationCompat.Builder extend(NotificationCompat.Builder builder) {
        return NotificationServiceExtension.a((Context)((Context)this.b), (NotificationCompat.Builder)builder);
    }

    public final float getInterpolation(float f2) {
        return Transition.f((String)((String)this.b), (float)f2);
    }

    public final void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.a((CrashlyticsNativeComponentDeferredProxy)((CrashlyticsNativeComponentDeferredProxy)this.b), (Provider)provider);
    }

    @Override
    public final void onClick(Article article) {
        AllNewsSectionedAdapter.b((AllNewsSectionedAdapter)((AllNewsSectionedAdapter)this.b), (Article)article);
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int n, Bundle bundle) {
        return InputConnectionCompat.a((View)((View)this.b), (InputContentInfoCompat)inputContentInfoCompat, (int)n, (Bundle)bundle);
    }

    @Override
    public final void onItemClick(ScheduleProgram scheduleProgram) {
        ScheduleDayFragment.d((ScheduleDayFragment)((ScheduleDayFragment)this.b), (ScheduleProgram)scheduleProgram);
    }

    public final Object then(Task task) {
        switch (this.a) {
            default: {
                break;
            }
            case 7: {
                return SessionReportingCoordinator.a((SessionReportingCoordinator)((SessionReportingCoordinator)this.b), (Task)task);
            }
        }
        return Utils.c((CountDownLatch)((CountDownLatch)this.b), (Task)task);
    }
}

