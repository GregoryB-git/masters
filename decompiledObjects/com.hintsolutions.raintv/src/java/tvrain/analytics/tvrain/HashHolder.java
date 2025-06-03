/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.security.SecureRandom
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package tvrain.analytics.tvrain;

import android.text.TextUtils;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tvrain.managers.PrefsManager;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Ltvrain/analytics/tvrain/HashHolder;", "", "prefsManager", "Ltvrain/managers/PrefsManager;", "(Ltvrain/managers/PrefsManager;)V", "rnd", "Ljava/security/SecureRandom;", "symbols", "", "generateNewHash", "getLastRequestTime", "", "getNewViewHash", "getSessionHash", "getUserHash", "randomString", "len", "", "Companion", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class HashHolder {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String PREFS_LAST_REQUEST_TIME = "last_request_time";
    @NotNull
    public static final String PREFS_SESSION_HASH = "session_hash";
    @NotNull
    public static final String PREFS_USER_HASH = "user_hash";
    public static final long TWO_HOURS_IN_MILLIS = 0x6DDD00L;
    @NotNull
    private final PrefsManager prefsManager;
    @NotNull
    private final SecureRandom rnd;
    @NotNull
    private final String symbols;

    public HashHolder(@NotNull PrefsManager prefsManager) {
        Intrinsics.checkNotNullParameter((Object)prefsManager, (String)"prefsManager");
        this.prefsManager = prefsManager;
        this.symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        this.rnd = new SecureRandom();
    }

    private final String generateNewHash() {
        return this.randomString(16);
    }

    private final long getLastRequestTime() {
        String string2 = this.prefsManager.getString(PREFS_LAST_REQUEST_TIME);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return 0L;
        }
        try {
            Intrinsics.checkNotNull((Object)string2);
            long l4 = Long.parseLong((String)string2);
            return l4;
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    private final String randomString(int n3) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        int n7 = n3 - 1;
        if (n7 >= 0) {
            n3 = 0;
            while (true) {
                string2 = this.symbols;
                stringBuilder.append(string2.charAt(this.rnd.nextInt(string2.length())));
                if (n3 == n7) break;
                ++n3;
            }
        }
        string2 = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"sb.toString()");
        return string2;
    }

    @NotNull
    public final String getNewViewHash() {
        return this.generateNewHash();
    }

    @NotNull
    public final String getSessionHash() {
        String string2;
        long l4 = this.getLastRequestTime();
        long l6 = System.currentTimeMillis();
        this.prefsManager.putString(PREFS_LAST_REQUEST_TIME, String.valueOf((long)l6));
        if (l6 - l4 > 0x6DDD00L) {
            String string3 = this.generateNewHash();
            this.prefsManager.putString(PREFS_SESSION_HASH, string3);
            return string3;
        }
        String string4 = string2 = this.prefsManager.getString(PREFS_SESSION_HASH);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string4 = this.generateNewHash();
            this.prefsManager.putString(PREFS_SESSION_HASH, string4);
        }
        Intrinsics.checkNotNull((Object)string4);
        return string4;
    }

    @NotNull
    public final String getUserHash() {
        String string2;
        String string3 = string2 = this.prefsManager.getString(PREFS_USER_HASH);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string3 = this.generateNewHash();
            this.prefsManager.putString(PREFS_USER_HASH, string3);
        }
        Intrinsics.checkNotNull((Object)string3);
        return string3;
    }

    @Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2={"Ltvrain/analytics/tvrain/HashHolder$Companion;", "", "()V", "PREFS_LAST_REQUEST_TIME", "", "PREFS_SESSION_HASH", "PREFS_USER_HASH", "TWO_HOURS_IN_MILLIS", "", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

