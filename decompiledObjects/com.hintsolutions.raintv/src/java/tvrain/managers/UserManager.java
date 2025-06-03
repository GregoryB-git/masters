/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.util.Base64
 *  com.google.gson.Gson
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.managers;

import android.os.Handler;
import android.os.Message;
import android.util.Base64;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.data.RainUser;
import ru.tvrain.core.data.UserInfo;
import tvrain.analytics.AnalyticsManager;
import tvrain.managers.PrefsManager;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.AuthEvent;
import tvrain.services.bus.events.UserInfoReadyEvent;

@Metadata(d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0016J\b\u0010%\u001a\u0004\u0018\u00010\nJ\b\u0010&\u001a\u0004\u0018\u00010\nJ\b\u0010'\u001a\u0004\u0018\u00010\u0016J\b\u0010(\u001a\u0004\u0018\u00010\nJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*J\u0006\u0010/\u001a\u00020*J\u0006\u00100\u001a\u00020#J\u0006\u00101\u001a\u00020#R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00062"}, d2={"Ltvrain/managers/UserManager;", "", "gson", "Lcom/google/gson/Gson;", "prefsManager", "Ltvrain/managers/PrefsManager;", "analyticsManager", "Ltvrain/analytics/AnalyticsManager;", "(Lcom/google/gson/Gson;Ltvrain/managers/PrefsManager;Ltvrain/analytics/AnalyticsManager;)V", "PROPERTY_RAIN_USER", "", "getPROPERTY_RAIN_USER", "()Ljava/lang/String;", "PROPERTY_RAIN_USER_INFO", "getPROPERTY_RAIN_USER_INFO", "getAnalyticsManager", "()Ltvrain/analytics/AnalyticsManager;", "getGson", "()Lcom/google/gson/Gson;", "getPrefsManager", "()Ltvrain/managers/PrefsManager;", "rainUser", "Lru/tvrain/core/data/RainUser;", "getRainUser", "()Lru/tvrain/core/data/RainUser;", "setRainUser", "(Lru/tvrain/core/data/RainUser;)V", "value", "Lru/tvrain/core/data/UserInfo;", "rainUserInfo", "getRainUserInfo", "()Lru/tvrain/core/data/UserInfo;", "setRainUserInfo", "(Lru/tvrain/core/data/UserInfo;)V", "authorize", "", "user", "getAuthorization", "getCreateTime", "getUser", "getUserId", "hasLinkedAccounts", "", "hasUserInfo", "isAuthorized", "isNoAds", "isOnAir", "isRCAuthorized", "logout", "restoreAuthorization", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class UserManager {
    @NotNull
    private final String PROPERTY_RAIN_USER;
    @NotNull
    private final String PROPERTY_RAIN_USER_INFO;
    @NotNull
    private final AnalyticsManager analyticsManager;
    @NotNull
    private final Gson gson;
    @NotNull
    private final PrefsManager prefsManager;
    @Nullable
    private RainUser rainUser;
    @Nullable
    private UserInfo rainUserInfo;

    public UserManager(@NotNull Gson gson, @NotNull PrefsManager prefsManager, @NotNull AnalyticsManager analyticsManager) {
        Intrinsics.checkNotNullParameter((Object)gson, (String)"gson");
        Intrinsics.checkNotNullParameter((Object)prefsManager, (String)"prefsManager");
        Intrinsics.checkNotNullParameter((Object)analyticsManager, (String)"analyticsManager");
        this.gson = gson;
        this.prefsManager = prefsManager;
        this.analyticsManager = analyticsManager;
        this.PROPERTY_RAIN_USER = "RainUser";
        this.PROPERTY_RAIN_USER_INFO = "rain_user_instance";
    }

    public static /* synthetic */ boolean a(Message message) {
        return UserManager.authorize$lambda$0(message);
    }

    private static final boolean authorize$lambda$0(Message message) {
        Intrinsics.checkNotNullParameter((Object)message, (String)"message");
        BusProvider.Companion.getInstance().post(new AuthEvent());
        return true;
    }

    public final void authorize(@NotNull RainUser rainUser) {
        Intrinsics.checkNotNullParameter((Object)rainUser, (String)"user");
        if (rainUser.isAuthorized()) {
            this.rainUser = rainUser;
            this.prefsManager.putString(this.PROPERTY_RAIN_USER, this.gson.toJson((Object)rainUser));
            new Handler((Handler.Callback)new y3(1)).sendEmptyMessageDelayed(0, 1000L);
        }
    }

    @NotNull
    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    @Nullable
    public final String getAuthorization() {
        RainUser rainUser = this.rainUser;
        int n3 = rainUser != null && rainUser.isAuthorized() ? 1 : 0;
        if (n3 != 0) {
            rainUser = new StringBuilder();
            Object object = this.rainUser;
            Intrinsics.checkNotNull((Object)object);
            rainUser.append(((RainUser)object).user_id);
            rainUser.append(':');
            object = this.rainUser;
            Intrinsics.checkNotNull((Object)object);
            rainUser.append(((RainUser)object).device_token);
            object = rainUser.toString();
            rainUser = z2.t("Basic ");
            object = object.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"this as java.lang.String).getBytes(charset)");
            object = Base64.encodeToString((byte[])object, (int)8);
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"encodeToString(s.toByteArray(), Base64.URL_SAFE)");
            int n7 = object.length() - 1;
            n3 = 0;
            boolean bl = false;
            while (n3 <= n7) {
                int n8 = !bl ? n3 : n7;
                n8 = Intrinsics.compare((int)object.charAt(n8), (int)32) <= 0 ? 1 : 0;
                if (!bl) {
                    if (n8 == 0) {
                        bl = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n8 == 0) break;
                --n7;
            }
            rainUser.append(object.subSequence(n3, n7 + 1).toString());
            return rainUser.toString();
        }
        return null;
    }

    @Nullable
    public final String getCreateTime() {
        Object object = this.rainUserInfo;
        object = object != null ? ((UserInfo)object).createtime : null;
        return object;
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    @NotNull
    public final String getPROPERTY_RAIN_USER() {
        return this.PROPERTY_RAIN_USER;
    }

    @NotNull
    public final String getPROPERTY_RAIN_USER_INFO() {
        return this.PROPERTY_RAIN_USER_INFO;
    }

    @NotNull
    public final PrefsManager getPrefsManager() {
        return this.prefsManager;
    }

    @Nullable
    public final RainUser getRainUser() {
        return this.rainUser;
    }

    @Nullable
    public final UserInfo getRainUserInfo() {
        return this.rainUserInfo;
    }

    @Nullable
    public final RainUser getUser() {
        RainUser rainUser = this.isAuthorized() ? this.rainUser : null;
        return rainUser;
    }

    @Nullable
    public final String getUserId() {
        String string2;
        boolean bl = this.isAuthorized();
        String string3 = string2 = null;
        if (bl) {
            RainUser rainUser = this.rainUser;
            string3 = string2;
            if (rainUser != null) {
                string3 = rainUser.user_id;
            }
        }
        return string3;
    }

    public final boolean hasLinkedAccounts() {
        List<UserInfo.LinkedAccountsRecord> list = this.rainUserInfo;
        boolean bl = false;
        int n3 = list != null && (list = list.linkedAccounts) != null ? list.size() : 0;
        if (n3 > 0) {
            bl = true;
        }
        return bl;
    }

    public final boolean hasUserInfo() {
        boolean bl = this.rainUserInfo != null;
        return bl;
    }

    public final boolean isAuthorized() {
        Object object = this.rainUser;
        boolean bl = false;
        boolean bl2 = object != null && ((RainUser)object).isAuthorized();
        if (!bl2) {
            return false;
        }
        object = this.rainUserInfo;
        boolean bl3 = bl;
        if (object != null) {
            object = ((UserInfo)object).firstname;
            bl3 = bl;
            if (object != null) {
                bl3 = object.equals((Object)"Tvrain");
            }
        }
        return bl3 ^ true;
    }

    public final boolean isNoAds() {
        UserInfo userInfo = this.rainUserInfo;
        boolean bl = userInfo != null ? userInfo.getNoAds() : false;
        return bl;
    }

    public final boolean isOnAir() {
        UserInfo userInfo = this.rainUserInfo;
        boolean bl = userInfo != null ? userInfo.getOnAir() : false;
        return bl;
    }

    public final boolean isRCAuthorized() {
        boolean bl = this.isAuthorized();
        UserInfo userInfo = this.rainUserInfo;
        userInfo = userInfo != null ? userInfo.quickauth : null;
        boolean bl2 = false;
        boolean bl3 = userInfo == null ? false : userInfo.booleanValue();
        boolean bl4 = bl2;
        if (bl) {
            bl4 = bl2;
            if (!bl3) {
                bl4 = true;
            }
        }
        return bl4;
    }

    public final void logout() {
        this.setRainUserInfo(null);
        this.rainUser = null;
        this.prefsManager.remove(this.PROPERTY_RAIN_USER);
        this.prefsManager.remove(this.PROPERTY_RAIN_USER_INFO);
    }

    public final void restoreAuthorization() {
        Object object = this.prefsManager.getString(this.PROPERTY_RAIN_USER, null);
        if (object != null) {
            object = this.gson.fromJson((String)object, RainUser.class);
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"gson.fromJson<RainUser>(\u2026on, RainUser::class.java)");
            this.authorize((RainUser)object);
        }
    }

    public final void setRainUser(@Nullable RainUser rainUser) {
        this.rainUser = rainUser;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setRainUserInfo(@Nullable UserInfo userInfo) {
        this.rainUserInfo = userInfo;
        try {
            this.prefsManager.putString(this.PROPERTY_RAIN_USER_INFO, this.gson.toJson((Object)userInfo));
        }
        catch (Exception exception) {}
        BusProvider.Companion.getInstance().post(new UserInfoReadyEvent());
    }
}

