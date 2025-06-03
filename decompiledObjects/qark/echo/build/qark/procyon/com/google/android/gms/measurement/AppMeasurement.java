// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.measurement;

import android.os.BaseBundle;
import R2.n3;
import A2.n;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.H0;
import com.google.firebase.analytics.FirebaseAnalytics;
import android.os.Bundle;
import android.content.Context;
import R2.m4;
import R2.N2;

@Deprecated
public class AppMeasurement
{
    public static volatile AppMeasurement b;
    public final a a;
    
    public AppMeasurement(final N2 n2) {
        this.a = (a)new com.google.android.gms.measurement.a(n2);
    }
    
    public AppMeasurement(final m4 m4) {
        this.a = (a)new b(m4);
    }
    
    public static m4 a(final Context context, final Bundle bundle) {
        try {
            return (m4)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static AppMeasurement b(final Context context, final String s, final String s2) {
        while (true) {
            if (AppMeasurement.b == null) {
                // monitorenter(AppMeasurement.class)
                while (true) {
                    try {
                        if (AppMeasurement.b == null) {
                            final m4 a = a(context, null);
                            if (a != null) {
                                AppMeasurement.b = new AppMeasurement(a);
                            }
                            else {
                                AppMeasurement.b = new AppMeasurement(N2.c(context, new H0(0L, 0L, true, null, null, null, null, null), null));
                            }
                        }
                        // monitorexit(AppMeasurement.class)
                        return AppMeasurement.b;
                    }
                    // monitorexit(AppMeasurement.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    @Deprecated
    @Keep
    @NonNull
    public static AppMeasurement getInstance(@NonNull final Context context) {
        return b(context, null, null);
    }
    
    @Keep
    public void beginAdUnitExposure(@NonNull final String s) {
        this.a.s(s);
    }
    
    @Keep
    public void clearConditionalUserProperty(@NonNull final String s, @NonNull final String s2, @NonNull final Bundle bundle) {
        this.a.r(s, s2, bundle);
    }
    
    @Keep
    public void endAdUnitExposure(@NonNull final String s) {
        this.a.q(s);
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
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull final String s, @NonNull final String s2) {
        final List c = this.a.c(s, s2);
        int size;
        if (c == null) {
            size = 0;
        }
        else {
            size = c.size();
        }
        final ArrayList list = new ArrayList<ConditionalUserProperty>(size);
        final Iterator<Bundle> iterator = c.iterator();
        while (iterator.hasNext()) {
            list.add(new ConditionalUserProperty(iterator.next()));
        }
        return (List<ConditionalUserProperty>)list;
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
    public int getMaxUserProperties(@NonNull final String s) {
        return this.a.i(s);
    }
    
    @Keep
    @NonNull
    public Map<String, Object> getUserProperties(@NonNull final String s, @NonNull final String s2, final boolean b) {
        return (Map<String, Object>)this.a.t(s, s2, b);
    }
    
    @Keep
    public void logEventInternal(@NonNull final String s, @NonNull final String s2, @NonNull final Bundle bundle) {
        this.a.u(s, s2, bundle);
    }
    
    @Keep
    public void setConditionalUserProperty(@NonNull final ConditionalUserProperty conditionalUserProperty) {
        n.i(conditionalUserProperty);
        final a a = this.a;
        final Bundle bundle = new Bundle();
        final String mAppId = conditionalUserProperty.mAppId;
        if (mAppId != null) {
            ((BaseBundle)bundle).putString("app_id", mAppId);
        }
        final String mOrigin = conditionalUserProperty.mOrigin;
        if (mOrigin != null) {
            ((BaseBundle)bundle).putString("origin", mOrigin);
        }
        final String mName = conditionalUserProperty.mName;
        if (mName != null) {
            ((BaseBundle)bundle).putString("name", mName);
        }
        final Object mValue = conditionalUserProperty.mValue;
        if (mValue != null) {
            n3.b(bundle, mValue);
        }
        final String mTriggerEventName = conditionalUserProperty.mTriggerEventName;
        if (mTriggerEventName != null) {
            ((BaseBundle)bundle).putString("trigger_event_name", mTriggerEventName);
        }
        ((BaseBundle)bundle).putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        final String mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
        if (mTimedOutEventName != null) {
            ((BaseBundle)bundle).putString("timed_out_event_name", mTimedOutEventName);
        }
        final Bundle mTimedOutEventParams = conditionalUserProperty.mTimedOutEventParams;
        if (mTimedOutEventParams != null) {
            bundle.putBundle("timed_out_event_params", mTimedOutEventParams);
        }
        final String mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
        if (mTriggeredEventName != null) {
            ((BaseBundle)bundle).putString("triggered_event_name", mTriggeredEventName);
        }
        final Bundle mTriggeredEventParams = conditionalUserProperty.mTriggeredEventParams;
        if (mTriggeredEventParams != null) {
            bundle.putBundle("triggered_event_params", mTriggeredEventParams);
        }
        ((BaseBundle)bundle).putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        final String mExpiredEventName = conditionalUserProperty.mExpiredEventName;
        if (mExpiredEventName != null) {
            ((BaseBundle)bundle).putString("expired_event_name", mExpiredEventName);
        }
        final Bundle mExpiredEventParams = conditionalUserProperty.mExpiredEventParams;
        if (mExpiredEventParams != null) {
            bundle.putBundle("expired_event_params", mExpiredEventParams);
        }
        ((BaseBundle)bundle).putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        ((BaseBundle)bundle).putBoolean("active", conditionalUserProperty.mActive);
        ((BaseBundle)bundle).putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        a.l(bundle);
    }
    
    public static class ConditionalUserProperty
    {
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
        
        public ConditionalUserProperty(final Bundle bundle) {
            n.i(bundle);
            this.mAppId = (String)n3.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String)n3.a(bundle, "origin", String.class, null);
            this.mName = (String)n3.a(bundle, "name", String.class, null);
            this.mValue = n3.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String)n3.a(bundle, "trigger_event_name", String.class, null);
            final Long value = 0L;
            this.mTriggerTimeout = (long)n3.a(bundle, "trigger_timeout", Long.class, value);
            this.mTimedOutEventName = (String)n3.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle)n3.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String)n3.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle)n3.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = (long)n3.a(bundle, "time_to_live", Long.class, value);
            this.mExpiredEventName = (String)n3.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle)n3.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = (boolean)n3.a(bundle, "active", Boolean.class, Boolean.FALSE);
            this.mCreationTimestamp = (long)n3.a(bundle, "creation_timestamp", Long.class, value);
            this.mTriggeredTimestamp = (long)n3.a(bundle, "triggered_timestamp", Long.class, value);
        }
    }
    
    public abstract static class a implements m4
    {
    }
}
