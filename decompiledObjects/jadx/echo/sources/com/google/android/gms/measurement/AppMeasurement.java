package com.google.android.gms.measurement;

import A2.AbstractC0328n;
import R2.AbstractC0564n3;
import R2.InterfaceC0558m4;
import R2.N2;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.H0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f11240b;

    /* renamed from: a, reason: collision with root package name */
    public final a f11241a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty(Bundle bundle) {
            AbstractC0328n.i(bundle);
            this.mAppId = (String) AbstractC0564n3.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) AbstractC0564n3.a(bundle, "origin", String.class, null);
            this.mName = (String) AbstractC0564n3.a(bundle, "name", String.class, null);
            this.mValue = AbstractC0564n3.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) AbstractC0564n3.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) AbstractC0564n3.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) AbstractC0564n3.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) AbstractC0564n3.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) AbstractC0564n3.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) AbstractC0564n3.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) AbstractC0564n3.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) AbstractC0564n3.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) AbstractC0564n3.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) AbstractC0564n3.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) AbstractC0564n3.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) AbstractC0564n3.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public static abstract class a implements InterfaceC0558m4 {
        public a() {
        }
    }

    public AppMeasurement(N2 n22) {
        this.f11241a = new com.google.android.gms.measurement.a(n22);
    }

    public static InterfaceC0558m4 a(Context context, Bundle bundle) {
        return (InterfaceC0558m4) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    public static AppMeasurement b(Context context, String str, String str2) {
        if (f11240b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f11240b == null) {
                        InterfaceC0558m4 a7 = a(context, null);
                        if (a7 != null) {
                            f11240b = new AppMeasurement(a7);
                        } else {
                            f11240b = new AppMeasurement(N2.c(context, new H0(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f11240b;
    }

    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        return b(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.f11241a.s(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f11241a.r(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.f11241a.q(str);
    }

    @Keep
    public long generateEventId() {
        return this.f11241a.a();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f11241a.g();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        List c7 = this.f11241a.c(str, str2);
        ArrayList arrayList = new ArrayList(c7 == null ? 0 : c7.size());
        Iterator it = c7.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f11241a.m();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f11241a.k();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f11241a.h();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.f11241a.i(str);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z7) {
        return this.f11241a.t(str, str2, z7);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f11241a.u(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        AbstractC0328n.i(conditionalUserProperty);
        a aVar = this.f11241a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            AbstractC0564n3.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.l(bundle);
    }

    public AppMeasurement(InterfaceC0558m4 interfaceC0558m4) {
        this.f11241a = new b(interfaceC0558m4);
    }
}
