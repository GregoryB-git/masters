/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.support.v4.media.MediaMetadataCompat
 *  android.text.TextUtils
 *  androidx.annotation.Keep
 *  com.google.android.gms.analytics.HitBuilders$EventBuilder
 *  com.google.gson.Gson
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Metadata
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  ru.tvrain.core.data.Video
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 */
package tvrain.analytics;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.android.gms.analytics.HitBuilders;
import com.google.gson.Gson;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.twitter.sdk.android.core.Twitter;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.data.Article;
import ru.tvrain.core.data.Video;
import ru.tvrain.core.services.RainService;
import ru.tvrain.core.utils.DateHelper;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.analytics.AnalyticsManager;
import tvrain.analytics.tagmanager.TagManager;
import tvrain.analytics.tvrain.HashHolder;
import tvrain.managers.PrefsManager;

@Metadata(d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J,\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u0010H\u0002J,\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0016H\u0002J,\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ+\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f2\u0016\u0010\u001f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000f0 \"\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010!J4\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006)"}, d2={"Ltvrain/analytics/AnalyticsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hashHolder", "Ltvrain/analytics/tvrain/HashHolder;", "getHashHolder", "()Ltvrain/analytics/tvrain/HashHolder;", "hashHolder$delegate", "Lkotlin/Lazy;", "getMetadataForAudio", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "instance", "Landroid/support/v4/media/MediaMetadataCompat;", "getMetadataForLive", "getMetadataForLiveAudio", "getMetadataForLocalVideo", "Lcom/hintsolutions/raintv/services/video/SavedVideoHolder;", "getMetadataForVideo", "Lru/tvrain/core/data/Article;", "init", "", "app", "Landroid/app/Application;", "logEvent", "eventName", "params", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "logRainView", "rainService", "Lru/tvrain/core/services/RainService;", "userId", "hashView", "parameters", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
@Keep
public final class AnalyticsManager {
    @NotNull
    private final Context context;
    @NotNull
    private final Lazy hashHolder$delegate;

    public AnalyticsManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.context = context;
        this.hashHolder$delegate = LazyKt.lazy((Function0)new Function0<HashHolder>(this){
            public final AnalyticsManager this$0;
            {
                this.this$0 = analyticsManager;
                super(0);
            }

            @NotNull
            public final HashHolder invoke() {
                return new HashHolder(new PrefsManager(this.this$0.getContext()));
            }
        });
    }

    public static /* synthetic */ void a(Throwable throwable) {
        AnalyticsManager.logRainView$lambda$2(throwable);
    }

    public static /* synthetic */ void b(Object object, Function1 function1) {
        AnalyticsManager.logRainView$lambda$1(function1, object);
    }

    private final HashMap<String, String> getMetadataForAudio(MediaMetadataCompat object) {
        HashMap hashMap = new HashMap();
        Article article = (Article)new Gson().fromJson(object.getString("article"), Article.class);
        hashMap.put((Object)"ns_st_ci", (Object)object.getString("android.media.metadata.MEDIA_ID"));
        hashMap.put((Object)"ns_st_cl", (Object)String.valueOf((long)object.getLong("android.media.metadata.DURATION")));
        hashMap.put((Object)"ns_st_st", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pu", (Object)"TVRain");
        if (article != null) {
            object = z2.t("id");
            object.append(article.program_id);
            hashMap.put((Object)"ns_st_pr", (Object)object.toString());
            hashMap.put((Object)"ns_st_ep", (Object)((Video)article.video.get((int)0)).name);
        }
        hashMap.put((Object)"ns_st_sn", (Object)"*null");
        hashMap.put((Object)"ns_st_en", (Object)"*null");
        hashMap.put((Object)"ns_st_ge", (Object)"Video");
        hashMap.put((Object)"ns_st_ti", (Object)"*null");
        hashMap.put((Object)"ns_st_ia", (Object)"0");
        hashMap.put((Object)"ns_st_ce", (Object)"1");
        hashMap.put((Object)"ns_st_ddt", (Object)DateHelper.formatDate(DateHelper.now()));
        if (article != null) {
            hashMap.put((Object)"ns_st_tdt", (Object)article.getDateStr());
        }
        hashMap.put((Object)"c3", (Object)"TVRain");
        hashMap.put((Object)"c4", (Object)"*null");
        object = (String)hashMap.put((Object)"c6", (Object)"*null");
        return hashMap;
    }

    private final HashMap<String, String> getMetadataForLive() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ns_st_ci", (Object)"live");
        hashMap.put((Object)"ns_st_cl", (Object)"0");
        hashMap.put((Object)"ns_st_st", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pu", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pr", (Object)"Live");
        hashMap.put((Object)"ns_st_ep", (Object)"\u041f\u0440\u044f\u043c\u043e\u0439 \u044d\u0444\u0438\u0440");
        hashMap.put((Object)"ns_st_sn", (Object)"*null");
        hashMap.put((Object)"ns_st_en", (Object)"*null");
        hashMap.put((Object)"ns_st_ge", (Object)"Live");
        hashMap.put((Object)"ns_st_ti", (Object)"*null");
        hashMap.put((Object)"ns_st_ia", (Object)"0");
        hashMap.put((Object)"ns_st_ce", (Object)"1");
        hashMap.put((Object)"ns_st_ddt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"ns_st_tdt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"c3", (Object)"TVRain");
        hashMap.put((Object)"c4", (Object)"*null");
        String string2 = (String)hashMap.put((Object)"c6", (Object)"*null");
        return hashMap;
    }

    private final HashMap<String, String> getMetadataForLiveAudio(MediaMetadataCompat object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ns_st_ci", (Object)"live");
        hashMap.put((Object)"ns_st_cl", (Object)"0");
        hashMap.put((Object)"ns_st_li", (Object)"1");
        hashMap.put((Object)"ns_st_st", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pu", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pr", (Object)"Live");
        hashMap.put((Object)"ns_st_ep", (Object)"\u041f\u0440\u044f\u043c\u043e\u0439 \u044d\u0444\u0438\u0440");
        hashMap.put((Object)"ns_st_sn", (Object)"*null");
        hashMap.put((Object)"ns_st_en", (Object)"*null");
        hashMap.put((Object)"ns_st_ge", (Object)"Live");
        hashMap.put((Object)"ns_st_ti", (Object)"*null");
        hashMap.put((Object)"ns_st_ia", (Object)"0");
        hashMap.put((Object)"ns_st_ce", (Object)"1");
        hashMap.put((Object)"ns_st_ddt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"ns_st_tdt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"c3", (Object)"TVRain");
        hashMap.put((Object)"c4", (Object)"*null");
        object = (String)hashMap.put((Object)"c6", (Object)"*null");
        return hashMap;
    }

    private final HashMap<String, String> getMetadataForLocalVideo(SavedVideoHolder object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ns_st_ci", (Object)((SavedVideoHolder)object).id.toString());
        hashMap.put((Object)"ns_st_cl", (Object)"0");
        hashMap.put((Object)"ns_st_st", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pu", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pr", (Object)"\u0421\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u043d\u043e\u0435 \u0432\u0438\u0434\u0435\u043e");
        hashMap.put((Object)"ns_st_ep", (Object)((SavedVideoHolder)object).name);
        hashMap.put((Object)"ns_st_sn", (Object)"*null");
        hashMap.put((Object)"ns_st_en", (Object)"*null");
        hashMap.put((Object)"ns_st_ge", (Object)"Video");
        hashMap.put((Object)"ns_st_ti", (Object)"*null");
        hashMap.put((Object)"ns_st_ia", (Object)"0");
        hashMap.put((Object)"ns_st_ce", (Object)"1");
        hashMap.put((Object)"ns_st_ddt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"ns_st_tdt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"c3", (Object)"TVRain");
        hashMap.put((Object)"c4", (Object)"*null");
        object = (String)hashMap.put((Object)"c6", (Object)"*null");
        return hashMap;
    }

    private final HashMap<String, String> getMetadataForVideo(Article object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"ns_st_ci", (Object)String.valueOf((int)((Article)object).id));
        hashMap.put((Object)"ns_st_cl", (Object)((Video)((Article)object).video.get((int)0)).duration);
        hashMap.put((Object)"ns_st_st", (Object)"TVRain");
        hashMap.put((Object)"ns_st_pu", (Object)"TVRain");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id");
        stringBuilder.append(((Article)object).program_id);
        hashMap.put((Object)"ns_st_pr", (Object)stringBuilder.toString());
        hashMap.put((Object)"ns_st_ep", (Object)((Video)((Article)object).video.get((int)0)).name);
        hashMap.put((Object)"ns_st_sn", (Object)"*null");
        hashMap.put((Object)"ns_st_en", (Object)"*null");
        hashMap.put((Object)"ns_st_ge", (Object)"Video");
        hashMap.put((Object)"ns_st_ti", (Object)"*null");
        hashMap.put((Object)"ns_st_ia", (Object)"0");
        hashMap.put((Object)"ns_st_ce", (Object)"1");
        hashMap.put((Object)"ns_st_ddt", (Object)DateHelper.formatDate(DateHelper.now()));
        hashMap.put((Object)"ns_st_tdt", (Object)((Article)object).getDateStr());
        hashMap.put((Object)"c3", (Object)"TVRain");
        hashMap.put((Object)"c4", (Object)"*null");
        object = (String)hashMap.put((Object)"c6", (Object)"*null");
        return hashMap;
    }

    private static final void logRainView$lambda$1(Function1 function1, Object object) {
        Intrinsics.checkNotNullParameter((Object)function1, (String)"$tmp0");
        function1.invoke(object);
    }

    private static final void logRainView$lambda$2(Throwable throwable) {
        if (throwable != null) {
            throwable.printStackTrace();
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final HashHolder getHashHolder() {
        return (HashHolder)this.hashHolder$delegate.getValue();
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter((Object)application, (String)"app");
        Twitter.initialize(this.context);
        TagManager.setupGTM(application);
    }

    public final void logEvent(@NotNull String string2, String ... stringArray) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"eventName");
        Intrinsics.checkNotNullParameter((Object)stringArray, (String)"params");
        int n3 = string2.length();
        int n7 = 0;
        n3 = n3 >= 0 && n3 < 100 ? 1 : 0;
        if (n3 == 0) {
            string2 = string2.substring(0, 99);
            Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
        }
        string2 = new HitBuilders.EventBuilder().setLabel(string2);
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"EventBuilder().setLabel(name)");
        n3 = stringArray.length == 0 ? 1 : 0;
        if ((n3 ^ 1) != 0) {
            for (n3 = n7; n3 < stringArray.length; n3 += 2) {
                string2.set(stringArray[n3], stringArray[n3 + 1]);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void logRainView(@NotNull RainService object, @Nullable String string2, @NotNull String object2, @NotNull Map<String, String> map) {
        void var4_7;
        Intrinsics.checkNotNullParameter((Object)object, (String)"rainService");
        Intrinsics.checkNotNullParameter((Object)object2, (String)"hashView");
        Intrinsics.checkNotNullParameter((Object)var4_7, (String)"parameters");
        try {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"hash_long", (Object)this.getHashHolder().getUserHash());
            hashMap.put((Object)"hash_session", (Object)this.getHashHolder().getSessionHash());
            hashMap.put((Object)"hash_view", object2);
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                Intrinsics.checkNotNull((Object)string2);
                hashMap.put((Object)"user_id", (Object)string2);
            }
            hashMap.putAll((Map)var4_7);
            string2 = object.sendRainStatistics("https://stat.tvrain.tv/api/views/", (Map<String, String>)hashMap).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            logRainView.2 var3_5 = logRainView.2.INSTANCE;
            object = new p1(1, var3_5);
            z3 z32 = new z3(11);
            string2.subscribe((Action1)object, (Action1)z32);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

