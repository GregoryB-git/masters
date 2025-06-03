/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.f0
 *  com.yandex.metrica.impl.ob.oc
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.yandex.metrica;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.e;
import com.yandex.metrica.i;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.f0;
import com.yandex.metrica.impl.ob.oc;

@Deprecated
public class CounterConfiguration
implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new Parcelable.Creator<CounterConfiguration>(){

        public Object createFromParcel(Parcel parcel) {
            return new CounterConfiguration((ContentValues)parcel.readBundle(f0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
        }

        public Object[] newArray(int n) {
            return new CounterConfiguration[n];
        }
    };
    private final ContentValues a;

    public CounterConfiguration() {
        this.a = new ContentValues();
    }

    @VisibleForTesting
    public CounterConfiguration(ContentValues contentValues) {
        this.a = contentValues;
        this.r();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        CounterConfiguration counterConfiguration2 = counterConfiguration;
        synchronized (counterConfiguration2) {
            ContentValues contentValues;
            this.a = contentValues = new ContentValues(counterConfiguration.a);
            this.r();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(@NonNull e e2) {
        this();
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a(e2.apiKey);
            this.d(e2.sessionTimeout);
            this.a(e2.a);
            this.b(e2.b);
            this.a(e2.logs);
            this.c(e2.statisticsSending);
            this.c(e2.maxReportsInDatabaseCount);
            this.c(e2.apiKey);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CounterConfiguration(i i3, @NonNull b b4) {
        this();
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a(i3.apiKey);
            this.d(i3.sessionTimeout);
            this.f(i3);
            this.e(i3);
            this.c(i3);
            this.a(i3.f);
            this.b(i3.g);
            this.b(i3);
            this.a(i3);
            this.g(i3);
            this.d(i3);
            this.c(i3.statisticsSending);
            this.c(i3.maxReportsInDatabaseCount);
            this.b(i3.nativeCrashReporting);
            this.h(i3);
            this.a(b4);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static CounterConfiguration a(Bundle bundle) {
        int n;
        CounterConfiguration counterConfiguration = null;
        if (bundle != null) {
            try {
                counterConfiguration = (CounterConfiguration)bundle.getParcelable("COUNTER_CFG_OBJ");
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        CounterConfiguration counterConfiguration2 = counterConfiguration;
        if (counterConfiguration == null) {
            counterConfiguration2 = new CounterConfiguration();
        }
        CounterConfiguration counterConfiguration3 = counterConfiguration2;
        // MONITORENTER : counterConfiguration3
        if (bundle == null) {
            return counterConfiguration2;
        }
        if (bundle.getInt("CFG_DISPATCH_PERIOD") != 0) {
            n = bundle.getInt("CFG_DISPATCH_PERIOD");
            counterConfiguration3 = counterConfiguration2;
            // MONITORENTER : counterConfiguration3
            counterConfiguration2.a.put("CFG_DISPATCH_PERIOD", Integer.valueOf((int)n));
            // MONITOREXIT : counterConfiguration3
        }
        if (bundle.getInt("CFG_SESSION_TIMEOUT") != 0) {
            n = bundle.getInt("CFG_SESSION_TIMEOUT");
            counterConfiguration3 = counterConfiguration2;
            // MONITORENTER : counterConfiguration3
            counterConfiguration2.a.put("CFG_SESSION_TIMEOUT", Integer.valueOf((int)n));
            // MONITOREXIT : counterConfiguration3
        }
        if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
            int n2 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
            counterConfiguration3 = counterConfiguration2;
            // MONITORENTER : counterConfiguration3
            counterConfiguration = counterConfiguration2.a;
            n = n2;
            if (n2 <= 0) {
                n = Integer.MAX_VALUE;
            }
            counterConfiguration.put("CFG_MAX_REPORTS_COUNT", n);
            // MONITOREXIT : counterConfiguration3
        }
        if (bundle.getString("CFG_API_KEY") != null && !"-1".equals((Object)bundle.getString("CFG_API_KEY"))) {
            counterConfiguration2.b(bundle.getString("CFG_API_KEY"));
        }
        // MONITOREXIT : counterConfiguration3
        return counterConfiguration2;
    }

    private void a(i i3) {
        if (A2.a((Object)i3.e)) {
            int n = i3.e;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_APP_VERSION_CODE", String.valueOf((int)n));
            }
        }
    }

    private void a(@Nullable Boolean bl) {
        if (A2.a((Object)bl)) {
            boolean bl2 = bl;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf((boolean)bl2));
            }
        }
    }

    private void a(@Nullable Integer n) {
        if (A2.a((Object)n)) {
            int n2 = n;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_DISPATCH_PERIOD", Integer.valueOf((int)n2));
            }
        }
    }

    private void a(@Nullable String string2) {
        if (A2.a((Object)string2)) {
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_API_KEY", string2);
            }
        }
    }

    private void b(i object) {
        if (!TextUtils.isEmpty((CharSequence)((YandexMetricaConfig)object).appVersion)) {
            object = ((YandexMetricaConfig)object).appVersion;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_APP_VERSION", (String)object);
            }
        }
    }

    private void b(@Nullable Boolean bl) {
        if (A2.a((Object)bl)) {
            this.a.put("CFG_NATIVE_CRASHES_ENABLED", bl);
        }
    }

    private void b(@Nullable Integer n) {
        if (A2.a((Object)n)) {
            int n2 = n;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                int n3;
                block5: {
                    n = this.a;
                    n3 = n2;
                    if (n2 > 0) break block5;
                    n3 = Integer.MAX_VALUE;
                }
                n.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf((int)n3));
            }
        }
    }

    private void c(i object) {
        if (A2.a((Object)((i)object).a)) {
            String string2 = ((i)object).a;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                ContentValues contentValues;
                block6: {
                    contentValues = this.a;
                    object = string2;
                    if (!TextUtils.isEmpty((CharSequence)string2)) break block6;
                    object = null;
                }
                contentValues.put("CFG_DEVICE_SIZE_TYPE", (String)object);
            }
        }
    }

    private void c(@Nullable Boolean bl) {
        if (A2.a((Object)bl)) {
            this.c((boolean)bl);
        }
    }

    private void c(@Nullable Integer n) {
        if (A2.a((Object)n)) {
            this.a.put("MAX_REPORTS_IN_DB_COUNT", n);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c(@Nullable String object) {
        CounterConfiguration counterConfiguration;
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(object)) {
            object = b.d;
            counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_REPORTER_TYPE", ((b)((Object)object)).a());
                return;
            }
        }
        object = b.c;
        counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_REPORTER_TYPE", ((b)((Object)object)).a());
            return;
        }
    }

    private void d(i i3) {
        if (A2.a((Object)i3.firstActivationAsUpdate)) {
            boolean bl = i3.firstActivationAsUpdate;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf((boolean)bl));
            }
        }
    }

    private void d(@Nullable Integer n) {
        if (A2.a((Object)n)) {
            int n2 = n;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_SESSION_TIMEOUT", Integer.valueOf((int)n2));
            }
        }
    }

    private void e(i i3) {
        if (A2.a((Object)i3.locationTracking)) {
            this.b((boolean)i3.locationTracking);
        }
    }

    private void f(i i3) {
        if (A2.a((Object)i3.location)) {
            this.a(i3.location);
        }
    }

    private void g(i i3) {
        if (A2.a((Object)i3.j)) {
            boolean bl = i3.j;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_PERMISSIONS_COLLECTING", Boolean.valueOf((boolean)bl));
            }
        }
    }

    private void h(i i3) {
        if (A2.a((Object)i3.revenueAutoTrackingEnabled)) {
            boolean bl = i3.revenueAutoTrackingEnabled;
            CounterConfiguration counterConfiguration = this;
            synchronized (counterConfiguration) {
                this.a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf((boolean)bl));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void r() {
        CounterConfiguration counterConfiguration;
        if (this.a.containsKey("CFG_REPORTER_TYPE")) {
            return;
        }
        if (this.a.containsKey("CFG_MAIN_REPORTER")) {
            if (this.a.getAsBoolean("CFG_MAIN_REPORTER").booleanValue()) {
                b b4 = b.b;
                counterConfiguration = this;
                synchronized (counterConfiguration) {
                    this.a.put("CFG_REPORTER_TYPE", b4.a());
                    return;
                }
            } else {
                this.c(this.a());
            }
            return;
        }
        if (!this.a.containsKey("CFG_COMMUTATION_REPORTER") || !this.a.getAsBoolean("CFG_COMMUTATION_REPORTER").booleanValue()) return;
        b b6 = b.e;
        counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_REPORTER_TYPE", b6.a());
            return;
        }
    }

    public String a() {
        return this.a.getAsString("CFG_API_KEY");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable Location object) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            ContentValues contentValues = this.a;
            int n = oc.q;
            Parcel parcel = null;
            Object var4_10 = null;
            if (object != null) {
                void var1_3;
                parcel = Parcel.obtain();
                try {
                    parcel.writeValue(object);
                    byte[] byArray = parcel.marshall();
                }
                catch (Throwable throwable) {
                    Object var1_5 = var4_10;
                }
                parcel.recycle();
                parcel = var1_3;
            }
            contentValues.put("CFG_MANUAL_LOCATION", (byte[])parcel);
            return;
        }
    }

    public void a(@NonNull b b4) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_REPORTER_TYPE", b4.a());
            return;
        }
    }

    public void a(boolean bl) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_LOCATION_ALLOWED_BY_BRIDGE", Boolean.valueOf((boolean)bl));
            return;
        }
    }

    public String b() {
        return this.a.getAsString("CFG_APP_VERSION_CODE");
    }

    @VisibleForTesting
    public void b(String string2) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_API_KEY", string2);
            return;
        }
    }

    public void b(boolean bl) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_LOCATION_TRACKING", Boolean.valueOf((boolean)bl));
            return;
        }
    }

    public String c() {
        return this.a.getAsString("CFG_APP_VERSION");
    }

    public final void c(boolean bl) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_STATISTICS_SENDING", Boolean.valueOf((boolean)bl));
            return;
        }
    }

    @Nullable
    public String d() {
        return this.a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public void d(String string2) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            this.a.put("CFG_UUID", string2);
            return;
        }
    }

    public int describeContents() {
        return 0;
    }

    @Nullable
    public Integer e() {
        return this.a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    @Nullable
    public Boolean f() {
        return this.a.getAsBoolean("CFG_LOCATION_ALLOWED_BY_BRIDGE");
    }

    public Location g() {
        Location location;
        boolean bl = this.a.containsKey("CFG_MANUAL_LOCATION");
        Location location2 = location = null;
        if (bl) {
            byte[] byArray = this.a.getAsByteArray("CFG_MANUAL_LOCATION");
            int n = oc.q;
            location2 = location;
            if (byArray != null) {
                Parcel parcel = Parcel.obtain();
                try {
                    parcel.unmarshall(byArray, 0, byArray.length);
                    parcel.setDataPosition(0);
                    location2 = (Location)parcel.readValue(Location.class.getClassLoader());
                }
                catch (Throwable throwable) {
                    parcel.recycle();
                    location2 = location;
                }
                parcel.recycle();
            }
        }
        return location2;
    }

    @Nullable
    public Integer h() {
        return this.a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    @Nullable
    public Integer i() {
        return this.a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    @Nullable
    public Boolean j() {
        return this.a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    @NonNull
    public b k() {
        return b.a(this.a.getAsString("CFG_REPORTER_TYPE"));
    }

    @Nullable
    public Integer l() {
        return this.a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public Boolean m() {
        return this.a.getAsBoolean("CFG_STATISTICS_SENDING");
    }

    @Nullable
    public Boolean n() {
        return this.a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    @Nullable
    public Boolean o() {
        return this.a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    @Nullable
    public Boolean p() {
        return this.a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    @Nullable
    public Boolean q() {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            Boolean bl = this.a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
            return bl;
        }
    }

    public String toString() {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            Object object = new StringBuilder();
            object.append("CounterConfiguration{mParamsMapping=");
            object.append((Object)this.a);
            object.append('}');
            object = object.toString();
            return object;
        }
    }

    public void writeToParcel(Parcel parcel, int n) {
        CounterConfiguration counterConfiguration = this;
        synchronized (counterConfiguration) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.yandex.metrica.CounterConfiguration.data", (Parcelable)this.a);
            parcel.writeBundle(bundle);
            return;
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        public static final /* enum */ b h;
        private static final b[] i;
        @NonNull
        private final String a;

        static {
            b b4;
            b b6;
            b b7;
            b b8;
            b b9;
            b b10;
            b b11;
            b = b11 = new b("main");
            c = b10 = new b("manual");
            d = b9 = new b("appmetrica");
            e = b8 = new b("commutation");
            f = b7 = new b("self_diagnostic_main");
            g = b6 = new b("self_diagnostic_manual");
            h = b4 = new b("crash");
            i = new b[]{b11, b10, b9, b8, b7, b6, b4};
        }

        private b(String string3) {
            this.a = string3;
        }

        @NonNull
        public static b a(@Nullable String string2) {
            b[] bArray = com.yandex.metrica.CounterConfiguration$b.values();
            for (int j = 0; j < 7; ++j) {
                b b4 = bArray[j];
                if (!b4.a.equals((Object)string2)) continue;
                return b4;
            }
            return b;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])i.clone();
        }

        @NonNull
        public String a() {
            return this.a;
        }
    }
}

