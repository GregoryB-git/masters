package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import ec.n;
import ec.t;
import p2.m0;

/* loaded from: classes.dex */
public final class SharedPreferencesPluginKt {
    public static final /* synthetic */ jc.h<Object>[] $$delegatedProperties;
    public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    public static final String TAG = "SharedPreferencesPlugin";
    private static final fc.a sharedPreferencesDataStore$delegate;

    static {
        n nVar = new n(SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        t.f5273a.getClass();
        $$delegatedProperties = new jc.h[]{nVar};
        sharedPreferencesDataStore$delegate = m0.Y(SHARED_PREFERENCES_NAME, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0.i<r0.d> getSharedPreferencesDataStore(Context context) {
        return sharedPreferencesDataStore$delegate.a(context, $$delegatedProperties[0]);
    }
}
