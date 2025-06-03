/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.measurement;

import A2.n;
import R2.N2;
import R2.m4;
import R2.n3;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.measurement.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    public static volatile AppMeasurement b;
    public final a a;

    public AppMeasurement(N2 n22) {
        this.a = new com.google.android.gms.measurement.a(n22);
    }

    public AppMeasurement(m4 m42) {
        this.a = new b(m42);
    }

    public static m4 a(Context object, Bundle bundle) {
        try {
            object = (m4)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", new Class[]{Context.class, Bundle.class}).invoke((Object)null, new Object[]{object, null});
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AppMeasurement b(Context context, String object, String string2) {
        if (b != null) return b;
        synchronized (AppMeasurement.class) {
            try {
                if (b != null) return b;
                object = AppMeasurement.a(context, null);
                b = object != null ? new AppMeasurement((m4)object) : new AppMeasurement(N2.c(context, new H0(0L, 0L, true, null, null, null, null, null), null));
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Deprecated
    @Keep
    @NonNull
    public static AppMeasurement getInstance(@NonNull Context context) {
        return AppMeasurement.b(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String string2) {
        this.a.s(string2);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String string2, @NonNull String string3, @NonNull Bundle bundle) {
        this.a.r(string2, string3, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String string2) {
        this.a.q(string2);
    }

    @Keep
    public long generateEventId() {
        return this.a.a();
    }

    @Keep
    @NonNull
    public String getAppInstanceId() {
        return this.a.g();
    }

    @Keep
    @NonNull
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String string2, @NonNull String string3) {
        int n8 = (string3 = this.a.c(string2, string3)) == null ? 0 : string3.size();
        string2 = new ArrayList(n8);
        string3 = string3.iterator();
        while (string3.hasNext()) {
            string2.add((Object)new ConditionalUserProperty((Bundle)string3.next()));
        }
        return string2;
    }

    @Keep
    @NonNull
    public String getCurrentScreenClass() {
        return this.a.m();
    }

    @Keep
    @NonNull
    public String getCurrentScreenName() {
        return this.a.k();
    }

    @Keep
    @NonNull
    public String getGmpAppId() {
        return this.a.h();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String string2) {
        return this.a.i(string2);
    }

    @Keep
    @NonNull
    public Map<String, Object> getUserProperties(@NonNull String string2, @NonNull String string3, boolean bl) {
        return this.a.t(string2, string3, bl);
    }

    @Keep
    public void logEventInternal(@NonNull String string2, @NonNull String string3, @NonNull Bundle bundle) {
        this.a.u(string2, string3, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        n.i(conditionalUserProperty);
        a a8 = this.a;
        Bundle bundle = new Bundle();
        Object object = conditionalUserProperty.mAppId;
        if (object != null) {
            bundle.putString("app_id", (String)object);
        }
        if ((object = conditionalUserProperty.mOrigin) != null) {
            bundle.putString("origin", (String)object);
        }
        if ((object = conditionalUserProperty.mName) != null) {
            bundle.putString("name", (String)object);
        }
        if ((object = conditionalUserProperty.mValue) != null) {
            n3.b(bundle, object);
        }
        if ((object = conditionalUserProperty.mTriggerEventName) != null) {
            bundle.putString("trigger_event_name", (String)object);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        object = conditionalUserProperty.mTimedOutEventName;
        if (object != null) {
            bundle.putString("timed_out_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mTimedOutEventParams) != null) {
            bundle.putBundle("timed_out_event_params", (Bundle)object);
        }
        if ((object = conditionalUserProperty.mTriggeredEventName) != null) {
            bundle.putString("triggered_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mTriggeredEventParams) != null) {
            bundle.putBundle("triggered_event_params", (Bundle)object);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        object = conditionalUserProperty.mExpiredEventName;
        if (object != null) {
            bundle.putString("expired_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mExpiredEventParams) != null) {
            bundle.putBundle("expired_event_params", (Bundle)object);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        a8.l(bundle);
    }

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        @NonNull
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        @NonNull
        public String mExpiredEventName;
        @Keep
        @NonNull
        public Bundle mExpiredEventParams;
        @Keep
        @NonNull
        public String mName;
        @Keep
        @NonNull
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        @NonNull
        public String mTimedOutEventName;
        @Keep
        @NonNull
        public Bundle mTimedOutEventParams;
        @Keep
        @NonNull
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        @NonNull
        public String mTriggeredEventName;
        @Keep
        @NonNull
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        @NonNull
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            n.i((Object)bundle);
            this.mAppId = (String)n3.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String)n3.a(bundle, "origin", String.class, null);
            this.mName = (String)n3.a(bundle, "name", String.class, null);
            this.mValue = n3.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String)n3.a(bundle, "trigger_event_name", String.class, null);
            Long l8 = 0L;
            this.mTriggerTimeout = (Long)n3.a(bundle, "trigger_timeout", Long.class, (Object)l8);
            this.mTimedOutEventName = (String)n3.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle)n3.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String)n3.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle)n3.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = (Long)n3.a(bundle, "time_to_live", Long.class, (Object)l8);
            this.mExpiredEventName = (String)n3.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle)n3.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = (Boolean)n3.a(bundle, "active", Boolean.class, (Object)Boolean.FALSE);
            this.mCreationTimestamp = (Long)n3.a(bundle, "creation_timestamp", Long.class, (Object)l8);
            this.mTriggeredTimestamp = (Long)n3.a(bundle, "triggered_timestamp", Long.class, (Object)l8);
        }
    }

    public static abstract class a
    implements m4 {
        public a() {
        }

        public /* synthetic */ a(P2.a a8) {
            this();
        }
    }

}

