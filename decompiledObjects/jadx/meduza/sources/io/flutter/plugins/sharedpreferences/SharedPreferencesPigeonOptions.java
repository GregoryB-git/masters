package io.flutter.plugins.sharedpreferences;

import java.util.List;

/* loaded from: classes.dex */
public final class SharedPreferencesPigeonOptions {
    public static final Companion Companion = new Companion(null);
    private final String fileKey;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ec.e eVar) {
            this();
        }

        public final SharedPreferencesPigeonOptions fromList(List<? extends Object> list) {
            ec.i.e(list, "list");
            return new SharedPreferencesPigeonOptions((String) list.get(0));
        }
    }

    public SharedPreferencesPigeonOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SharedPreferencesPigeonOptions(String str) {
        this.fileKey = str;
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, int i10, ec.e eVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileKey;
        }
        return sharedPreferencesPigeonOptions.copy(str);
    }

    public final String component1() {
        return this.fileKey;
    }

    public final SharedPreferencesPigeonOptions copy(String str) {
        return new SharedPreferencesPigeonOptions(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedPreferencesPigeonOptions) && ec.i.a(this.fileKey, ((SharedPreferencesPigeonOptions) obj).fileKey);
    }

    public final String getFileKey() {
        return this.fileKey;
    }

    public int hashCode() {
        String str = this.fileKey;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final List<Object> toList() {
        return va.a.f(this.fileKey);
    }

    public String toString() {
        StringBuilder l10 = defpackage.f.l("SharedPreferencesPigeonOptions(fileKey=");
        l10.append(this.fileKey);
        l10.append(')');
        return l10.toString();
    }
}
