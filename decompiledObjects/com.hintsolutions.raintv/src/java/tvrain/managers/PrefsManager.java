/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.google.gson.Gson
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.managers;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import securepreferences.SecurePreferences;

@Metadata(d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fJ)\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0016\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fJ\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2={"Ltvrain/managers/PrefsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "prefs", "Lsecurepreferences/SecurePreferences;", "clearPrefs", "", "getBoolean", "", "name", "", "defaultValue", "getObject", "T", "propertyName", "classOfT", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "putBoolean", "key", "value", "putString", "remove", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class PrefsManager {
    @NotNull
    private final Context context;
    @NotNull
    private final SecurePreferences prefs;

    public PrefsManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.context = context;
        this.prefs = new SecurePreferences(context);
    }

    public final void clearPrefs() {
        this.prefs.edit().clear().apply();
    }

    public final boolean getBoolean(@NotNull String string2, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"name");
        return this.prefs.getBoolean(string2, bl);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    public final <T> T getObject(@NotNull String object, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter((Object)object, (String)"propertyName");
        Intrinsics.checkNotNullParameter(clazz, (String)"classOfT");
        String string2 = this.getString((String)object);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        try {
            object = new Gson();
            object = object.fromJson(string2, clazz);
        }
        catch (Exception exception) {
            return null;
        }
        return (T)object;
    }

    @Nullable
    public final String getString(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"name");
        return this.getString(string2, null);
    }

    @Nullable
    public final String getString(@NotNull String string2, @Nullable String string3) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"name");
        return this.prefs.getString(string2, string3);
    }

    public final void putBoolean(@NotNull String string2, boolean bl) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"key");
        this.prefs.edit().putBoolean(string2, bl).commit();
    }

    public final void putString(@NotNull String string2, @Nullable String string3) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"name");
        this.prefs.edit().putString(string2, string3).commit();
    }

    public final void remove(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"key");
        this.prefs.edit().remove(string2).apply();
    }
}

