package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class MessagesAsync_gKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> wrapError(Throwable th) {
        if (th instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) th;
            return va.a.g(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        StringBuilder l10 = defpackage.f.l("Cause: ");
        l10.append(th.getCause());
        l10.append(", Stacktrace: ");
        l10.append(Log.getStackTraceString(th));
        return va.a.g(th.getClass().getSimpleName(), th.toString(), l10.toString());
    }

    private static final List<Object> wrapResult(Object obj) {
        return va.a.f(obj);
    }
}
