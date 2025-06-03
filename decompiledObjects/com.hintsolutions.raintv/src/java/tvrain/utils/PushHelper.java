/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  kotlin.Metadata
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Ref$ObjectRef
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.json.JSONObject
 */
package tvrain.utils;

import android.content.Context;
import android.content.Intent;
import com.hintsolutions.raintv.MainActivity;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.programs.ProgramActivity;
import com.hintsolutions.raintv.services.push.NotificationOpenedHandler;
import com.hintsolutions.raintv.utils.AddToFavoritesHelper;
import com.onesignal.OneSignal;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import me.leolin.shortcutbadger.ShortcutBadger;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.tvrain.core.data.Article;

@Metadata(d1={"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a8\u0006\f"}, d2={"checkPushData", "", "activity", "Lcom/hintsolutions/raintv/common/BaseActivity;", "appWasOpened", "", "disablePushMessages", "enablePushMessages", "showAuthConfirmDialog", "onYes", "Lcom/hintsolutions/raintv/interfaces/TaskCallback;", "onNo", "app_release"}, k=2, mv={1, 7, 1}, xi=48)
@JvmName(name="PushHelper")
public final class PushHelper {
    public static /* synthetic */ void a(BaseActivity baseActivity) {
        PushHelper.checkPushData$lambda$0(baseActivity);
    }

    public static /* synthetic */ void b(Ref.ObjectRef objectRef, BaseActivity baseActivity, int n3) {
        PushHelper.checkPushData$lambda$1(objectRef, baseActivity, n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void checkPushData(@NotNull BaseActivity baseActivity, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)baseActivity, (String)"activity");
        try {
            block16: {
                int n3;
                Ref.ObjectRef objectRef;
                String string2;
                int n7;
                boolean bl2;
                Object object;
                block17: {
                    JSONObject jSONObject = NotificationOpenedHandler.getPushData();
                    if (jSONObject == null) {
                        return;
                    }
                    object = jSONObject.optString("type", "");
                    bl2 = false;
                    n7 = jSONObject.optInt("id", 0);
                    jSONObject.optInt("question", 0);
                    string2 = NotificationOpenedHandler.getActionId();
                    objectRef = new Ref.ObjectRef();
                    Intent intent = new Intent((Context)baseActivity, MainActivity.class);
                    objectRef.element = intent;
                    if (object == null) break block16;
                    n3 = object.hashCode();
                    if (n3 == -732377866) break block17;
                    if (n3 != -309387644) {
                        if (n3 == 1546101185 && object.equals((Object)"open_live")) {
                            ((Intent)objectRef.element).putExtra("start_live", true);
                            baseActivity.startActivity((Intent)objectRef.element);
                        }
                        break block16;
                    } else if (object.equals((Object)"program") && n7 > 0) {
                        objectRef.element = object = new Intent((Context)baseActivity, ProgramActivity.class);
                        Intent intent2 = (Intent)object;
                        object.putExtra("id", n7);
                        baseActivity.startActivity((Intent)objectRef.element);
                    }
                    break block16;
                }
                if (object.equals((Object)"article") && n7 > 0) {
                    n3 = string2 != null && (n3 = StringsKt.trim((CharSequence)string2).toString().length() > 0 ? 1 : 0) != 0 && !string2.equals((Object)"__DEFAULT__") ? 1 : 0;
                    boolean bl3 = bl2;
                    if (n3 != 0) {
                        bl3 = bl2;
                        if (!baseActivity.isAuthorized()) {
                            object = new AddToFavoritesHelper(baseActivity);
                            ((AddToFavoritesHelper)object).add(n7);
                            object = new v(baseActivity, 16);
                            v4 v42 = new v4(objectRef, baseActivity, n7);
                            PushHelper.showAuthConfirmDialog(baseActivity, (TaskCallback)object, v42);
                            bl3 = true;
                        }
                    }
                    if (!bl3) {
                        if (n3 != 0) {
                            Article article = new Article();
                            article.id = n7;
                            baseActivity.addToFavorites(article, true, null, true);
                            if (!bl) {
                                baseActivity.startFavorites();
                            }
                        } else {
                            Intent intent = new Intent((Context)baseActivity, NewsActivity.class);
                            objectRef.element = intent;
                            object = intent;
                            intent.putExtra("id", n7);
                            baseActivity.startActivity((Intent)objectRef.element);
                        }
                    }
                }
            }
            NotificationOpenedHandler.removePushData();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            ShortcutBadger.removeCount((Context)baseActivity);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static final void checkPushData$lambda$0(BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter((Object)baseActivity, (String)"$activity");
        baseActivity.showMainActivityWithAuth();
    }

    private static final void checkPushData$lambda$1(Ref.ObjectRef objectRef, BaseActivity baseActivity, int n3) {
        Intrinsics.checkNotNullParameter((Object)objectRef, (String)"$intent");
        Intrinsics.checkNotNullParameter((Object)baseActivity, (String)"$activity");
        Intent intent = new Intent((Context)baseActivity, NewsActivity.class);
        objectRef.element = intent;
        Intent intent2 = intent;
        intent.putExtra("id", n3);
        baseActivity.startActivity((Intent)objectRef.element);
    }

    public static final void disablePushMessages() {
        try {
            OneSignal.disablePush(true);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static final void enablePushMessages() {
        try {
            OneSignal.disablePush(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static final void showAuthConfirmDialog(@NotNull BaseActivity baseActivity, @NotNull TaskCallback taskCallback, @NotNull TaskCallback taskCallback2) {
        Intrinsics.checkNotNullParameter((Object)baseActivity, (String)"activity");
        Intrinsics.checkNotNullParameter((Object)taskCallback, (String)"onYes");
        Intrinsics.checkNotNullParameter((Object)taskCallback2, (String)"onNo");
        baseActivity.showDialog(baseActivity.getString(2131755202), baseActivity.getString(2131755042), taskCallback, taskCallback2, true, baseActivity.getString(2131755199), baseActivity.getString(2131755198));
    }
}

