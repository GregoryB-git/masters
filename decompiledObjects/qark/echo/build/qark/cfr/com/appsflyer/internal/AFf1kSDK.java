/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.os.Looper
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.StrictMath
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 */
package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.appsflyer.internal.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AFf1kSDK
implements SensorEventListener {
    private final long[] AFInAppEventParameterName = new long[2];
    @NonNull
    private final String AFInAppEventType;
    @NonNull
    private final String AFKeystoreWrapper;
    private final int AFLogger;
    private long afDebugLog;
    private double afErrorLog;
    private Executor afRDLog;
    private final int valueOf;
    private final float[][] values = new float[2][];

    public AFf1kSDK(Sensor object) {
        int n8;
        this.valueOf = n8 = object.getType();
        String string2 = object.getName();
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        this.AFInAppEventType = string4;
        if ((object = object.getVendor()) == null) {
            object = string3;
        }
        this.AFKeystoreWrapper = object;
        this.AFLogger = ((n8 + 31) * 31 + string4.hashCode()) * 31 + object.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private Executor AFInAppEventParameterName() {
        synchronized (this) {
            try {
                if (this.afRDLog != null) return this.afRDLog;
                this.afRDLog = Executors.newSingleThreadExecutor();
                return this.afRDLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @NonNull
    private static List<Float> AFInAppEventType(@NonNull float[] arrf) {
        ArrayList arrayList = new ArrayList(arrf.length);
        int n8 = arrf.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)Float.valueOf((float)arrf[i8]));
        }
        return arrayList;
    }

    private static double AFKeystoreWrapper(@NonNull float[] arrf, @NonNull float[] arrf2) {
        int n8 = Math.min((int)arrf.length, (int)arrf2.length);
        double d8 = 0.0;
        for (int i8 = 0; i8 < n8; ++i8) {
            d8 += StrictMath.pow((double)(arrf[i8] - arrf2[i8]), (double)2.0);
        }
        return Math.sqrt((double)d8);
    }

    private /* synthetic */ void AFKeystoreWrapper(SensorEvent sensorEvent) {
        this.values(sensorEvent);
    }

    private boolean AFKeystoreWrapper() {
        if (this.values[0] != null) {
            return true;
        }
        return false;
    }

    private boolean AFKeystoreWrapper(int n8, @NonNull String string2, @NonNull String string3) {
        if (this.valueOf == n8 && this.AFInAppEventType.equals((Object)string2) && this.AFKeystoreWrapper.equals((Object)string3)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void a(AFf1kSDK aFf1kSDK, SensorEvent sensorEvent) {
        aFf1kSDK.AFKeystoreWrapper(sensorEvent);
    }

    @NonNull
    private Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put((Object)"sT", (Object)this.valueOf);
        concurrentHashMap.put((Object)"sN", (Object)this.AFInAppEventType);
        concurrentHashMap.put((Object)"sV", (Object)this.AFKeystoreWrapper);
        float[] arrf = this.values[0];
        if (arrf != null) {
            concurrentHashMap.put((Object)"sVS", AFf1kSDK.AFInAppEventType(arrf));
        }
        if ((arrf = this.values[1]) != null) {
            concurrentHashMap.put((Object)"sVE", AFf1kSDK.AFInAppEventType(arrf));
        }
        return concurrentHashMap;
    }

    private void values(SensorEvent arrf) {
        long l8 = arrf.timestamp;
        float[] arrf2 = arrf.values;
        long l9 = System.currentTimeMillis();
        float[][] arrf3 = this.values;
        arrf = arrf3[0];
        if (arrf == null) {
            arrf3[0] = Arrays.copyOf((float[])arrf2, (int)arrf2.length);
            this.AFInAppEventParameterName[0] = l9;
            return;
        }
        if ((arrf3 = arrf3[1]) == null) {
            arrf2 = Arrays.copyOf((float[])arrf2, (int)arrf2.length);
            this.values[1] = arrf2;
            this.AFInAppEventParameterName[1] = l9;
            this.afErrorLog = AFf1kSDK.AFKeystoreWrapper(arrf, arrf2);
            return;
        }
        if (50000000L <= l8 - this.afDebugLog) {
            this.afDebugLog = l8;
            if (Arrays.equals((float[])arrf3, (float[])arrf2)) {
                this.AFInAppEventParameterName[1] = l9;
                return;
            }
            double d8 = AFf1kSDK.AFKeystoreWrapper(arrf, arrf2);
            if (d8 > this.afErrorLog) {
                this.values[1] = Arrays.copyOf((float[])arrf2, (int)arrf2.length);
                this.AFInAppEventParameterName[1] = l9;
                this.afErrorLog = d8;
            }
        }
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof AFf1kSDK) {
            object = (AFf1kSDK)object;
            return this.AFKeystoreWrapper(object.valueOf, object.AFInAppEventType, object.AFKeystoreWrapper);
        }
        return false;
    }

    public final int hashCode() {
        return this.AFLogger;
    }

    public final void onAccuracyChanged(Sensor sensor, int n8) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFInAppEventParameterName().execute((Runnable)new v(this, sensorEvent));
            return;
        }
        this.values(sensorEvent);
    }

    public final void valueOf(@NonNull Map<AFf1kSDK, Map<String, Object>> map, boolean bl) {
        if (this.AFKeystoreWrapper()) {
            map.put((Object)this, this.values());
            if (bl) {
                int n8;
                int n9 = this.values.length;
                int n10 = 0;
                for (n8 = 0; n8 < n9; ++n8) {
                    this.values[n8] = null;
                }
                n9 = this.AFInAppEventParameterName.length;
                for (n8 = n10; n8 < n9; ++n8) {
                    this.AFInAppEventParameterName[n8] = 0L;
                }
                this.afErrorLog = 0.0;
                this.afDebugLog = 0L;
                return;
            }
        } else if (!map.containsKey((Object)this)) {
            map.put((Object)this, this.values());
        }
    }
}

