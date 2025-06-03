/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.datatransport.Transformer
 *  com.google.android.gms.tasks.Continuation
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.FirebaseCommonRegistrar
 *  com.google.firebase.crashlytics.internal.model.CrashlyticsReport
 *  com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender
 *  com.google.firebase.messaging.FcmBroadcastProcessor
 *  com.google.firebase.messaging.reporting.MessagingClientEventExtension
 *  com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.UserInfo
 *  rx.functions.Action1
 */
import android.content.Context;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.PurchaseActivity;
import com.hintsolutions.raintv.news.ContentBlockFragment;
import com.hintsolutions.raintv.news.GalleryFragment;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.news.StoryFragment;
import com.hintsolutions.raintv.profile.LegacyProfileFragment;
import com.hintsolutions.raintv.profile.PersonalFragment;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.programs.TeleshowTabFragment;
import com.hintsolutions.raintv.promos.GiftSubscriptionActivity;
import com.hintsolutions.raintv.schedule.ScheduleDayFragment;
import com.hintsolutions.raintv.services.audio.AudioActivity;
import com.hintsolutions.raintv.services.video.VideoUploadService;
import com.stfalcon.frescoimageviewer.ImageViewer;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.UserInfo;
import rx.functions.Action1;

public final class v1
implements LibraryVersionComponent.VersionExtractor,
Transformer,
Continuation,
Action1,
ImageViewer.Formatter {
    public final int a;

    public /* synthetic */ v1(int n4) {
        this.a = n4;
    }

    public final Object apply(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return DataTransportCrashlyticsReportSender.a((CrashlyticsReport)((CrashlyticsReport)object));
            }
        }
        return ((MessagingClientEventExtension)object).toByteArray();
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 28: {
                AudioActivity.A((Throwable)object);
                return;
            }
            case 27: {
                AudioActivity.B((ResponseBody)object);
                return;
            }
            case 26: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 25: {
                ((Throwable)object).printStackTrace();
                return;
            }
            case 24: {
                ScheduleDayFragment.b((Throwable)object);
                return;
            }
            case 23: {
                GiftSubscriptionActivity.z((Throwable)object);
                return;
            }
            case 22: {
                TeleshowTabFragment.f((Throwable)object);
                return;
            }
            case 21: {
                ProgramActivity.z((Throwable)object);
                return;
            }
            case 20: {
                PersonalFragment.h((Throwable)object);
                return;
            }
            case 19: {
                PersonalFragment.i((Throwable)object);
                return;
            }
            case 18: {
                LegacyProfileFragment.b((Throwable)object);
                return;
            }
            case 17: {
                LegacyProfileFragment.e((UserInfo)object);
                return;
            }
            case 16: {
                StoryFragment.c((Throwable)object);
                return;
            }
            case 15: {
                NewsActivity.S((Throwable)object);
                return;
            }
            case 14: {
                NewsActivity.X((Throwable)object);
                return;
            }
            case 13: {
                NewsActivity.N((Throwable)object);
                return;
            }
            case 12: {
                NewsActivity.O((ResponseBody)object);
                return;
            }
            case 11: {
                NewsActivity.A((Throwable)object);
                return;
            }
            case 9: {
                ContentBlockFragment.d((Throwable)object);
                return;
            }
            case 8: {
                PurchaseActivity.z((Throwable)object);
                return;
            }
            case 7: {
                PurchaseActivity.A((ResponseBody)object);
                return;
            }
            case 6: {
                MainActivity.I((Throwable)object);
                return;
            }
            case 5: {
                MainActivity.C((Throwable)object);
                return;
            }
        }
        VideoUploadService.a((Throwable)object);
    }

    public final String extract(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return FirebaseCommonRegistrar.d((Context)((Context)object));
            }
        }
        return FirebaseCommonRegistrar.a((Context)((Context)object));
    }

    public final String format(Object object) {
        return GalleryFragment.b(object);
    }

    public final Object then(Task task) {
        return FcmBroadcastProcessor.b((Task)task);
    }
}

