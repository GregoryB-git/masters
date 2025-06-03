package io.flutter.plugins.sharedpreferences;

/* loaded from: classes.dex */
public final class SharedPreferencesError extends Throwable {
    private final String code;
    private final Object details;
    private final String message;

    public SharedPreferencesError(String str, String str2, Object obj) {
        ec.i.e(str, "code");
        this.code = str;
        this.message = str2;
        this.details = obj;
    }

    public /* synthetic */ SharedPreferencesError(String str, String str2, Object obj, int i10, ec.e eVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : obj);
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getDetails() {
        return this.details;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
