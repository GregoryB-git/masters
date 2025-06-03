package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.firebase.analytics.FirebaseAnalytics;
import e7.j2;
import e7.j4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m6.j;
import p2.m0;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f2892b;

    /* renamed from: a, reason: collision with root package name */
    public final a f2893a;

    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            j.i(bundle);
            this.mAppId = (String) m0.i0(bundle, "app_id", String.class, null);
            this.mOrigin = (String) m0.i0(bundle, "origin", String.class, null);
            this.mName = (String) m0.i0(bundle, "name", String.class, null);
            this.mValue = m0.i0(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) m0.i0(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) m0.i0(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) m0.i0(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) m0.i0(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) m0.i0(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) m0.i0(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) m0.i0(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) m0.i0(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) m0.i0(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) m0.i0(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) m0.i0(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) m0.i0(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public static abstract class a implements j4 {
    }

    public AppMeasurement(j2 j2Var) {
        this.f2893a = new b(j2Var);
    }

    public AppMeasurement(j4 j4Var) {
        this.f2893a = new com.google.android.gms.measurement.a(j4Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f2892b == null) {
            synchronized (AppMeasurement.class) {
                if (f2892b == null) {
                    j4 j4Var = (j4) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (j4Var != null) {
                        f2892b = new AppMeasurement(j4Var);
                    } else {
                        f2892b = new AppMeasurement(j2.a(context, new zzdz(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f2892b;
    }

    public void beginAdUnitExposure(String str) {
        this.f2893a.zzb(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f2893a.a(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f2893a.zzc(str);
    }

    public long generateEventId() {
        return this.f2893a.zzf();
    }

    public String getAppInstanceId() {
        return this.f2893a.zzg();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b10 = this.f2893a.b(str, str2);
        ArrayList arrayList = new ArrayList(b10 == null ? 0 : b10.size());
        Iterator<Bundle> it = b10.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f2893a.zzh();
    }

    public String getCurrentScreenName() {
        return this.f2893a.zzi();
    }

    public String getGmpAppId() {
        return this.f2893a.zzj();
    }

    public int getMaxUserProperties(String str) {
        return this.f2893a.zza(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f2893a.c(str, str2, z10);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f2893a.d(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        j.i(conditionalUserProperty);
        a aVar = this.f2893a;
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
            m0.j0(bundle, obj);
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
        aVar.zza(bundle);
    }
}
