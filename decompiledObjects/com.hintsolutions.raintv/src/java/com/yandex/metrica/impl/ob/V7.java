/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Objects
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ac.CrashpadHelper;
import com.yandex.metrica.impl.ob.A3;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.D7;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.f7;
import com.yandex.metrica.impl.ob.t7;
import com.yandex.metrica.impl.ob.x7;
import com.yandex.metrica.impl.ob.z7;
import java.util.Objects;
import org.json.JSONObject;

@RequiresApi(api=21)
public class v7
implements f7 {
    @NonNull
    private final Context a;
    @NonNull
    private final A3 b;
    @NonNull
    private t7 c;
    @NonNull
    private final Zl<Bundle> d;
    @NonNull
    private final z7 e;
    @NonNull
    private final D7 f;
    @NonNull
    private final am<Void, String> g;

    public v7(@NonNull Context context, @NonNull A3 a3) {
        this(context, a3, new B0(), new Zl<Bundle>(){

            @Override
            public void b(Object object) {
                CrashpadHelper.setUpNativeUncaughtExceptionHandler((Bundle)object);
            }
        });
    }

    private v7(@NonNull Context context, @NonNull A3 a3, @NonNull B0 b0, @NonNull Zl<Bundle> zl2) {
        this(context, a3, new t7(context, b0, P.g().d().b()), zl2, new z7(), new D7(), new am<Void, String>(){

            @Override
            public Object a(Object object) {
                object = (Void)object;
                return CrashpadHelper.getLibraryVersion();
            }
        });
    }

    @VisibleForTesting
    public v7(@NonNull Context context, @NonNull A3 a3, @NonNull t7 t72, @NonNull Zl<Bundle> zl2, @NonNull z7 z72, @NonNull D7 d72, @NonNull am<Void, String> am2) {
        this.a = context;
        this.b = a3;
        this.c = t72;
        this.d = zl2;
        this.e = z72;
        this.f = d72;
        this.g = am2;
    }

    @Override
    @NonNull
    public String a() {
        return "appmetrica_native_crashes";
    }

    @Override
    public void a(@Nullable String string) {
        this.f.a(string);
        CrashpadHelper.updateRuntimeConfig(this.f.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @WorkerThread
    public void a(@NonNull String string, @NonNull String string2, @Nullable String string3) {
        x7 x72 = this.c.b();
        if (!(x72 == null || TextUtils.isEmpty((CharSequence)x72.a) && x72.d == null)) {
            this.f.a(string3);
            D7 d72 = this.f;
            Object object = this.g;
            string3 = null;
            d72.b(object.a(null));
            object = this.d;
            String string4 = this.f.a();
            d72 = new Bundle();
            z7 z72 = this.e;
            A3 a3 = this.b;
            z72.getClass();
            try {
                z72 = new JSONObject();
                JSONObject jSONObject = new JSONObject();
                string = jSONObject.put("arg_ak", (Object)string);
                string = string.put("arg_pn", (Object)a3.f());
                string = string.put("arg_pd", (Object)a3.g());
                string = string.put("arg_ps", (Object)a3.h());
                string = Base64.encodeToString((byte[])z72.put("arg_cd", string.put("arg_rt", (Object)CounterConfiguration.b.b.a())).toString().getBytes(), (int)0);
            }
            catch (Throwable throwable) {
                string = string3;
            }
            d72.putString("arg_cd", string);
            d72.putString("arg_rc", string4);
            d72.putString("arg_dd", string2);
            d72.putString("arg_hp", x72.a);
            d72.putBoolean("arg_i64", x72.b);
            d72.putBoolean("arg_ul", x72.c);
            string = this.a;
            string2 = new StringBuilder();
            string2.append(string.getPackageName());
            string2.append("-crashpad_new_crash_socket");
            d72.putString("arg_sn", string2.toString());
            if (x72.d == null) {
                d72.putBoolean("arg_ap", false);
            } else {
                d72.putBoolean("arg_ap", true);
                Objects.requireNonNull((Object)x72.d);
                d72.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                d72.putString("arg_akp", x72.d.a);
                d72.putString("arg_lp", x72.d.b);
                d72.putString("arg_dp", x72.d.c);
            }
            object.b(d72);
        }
    }

    @Override
    public void a(boolean bl2) {
        CrashpadHelper.logsEnabled(bl2);
    }

    @Override
    public void b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override
    @NonNull
    public String c() {
        return "appmetrica-native";
    }
}

