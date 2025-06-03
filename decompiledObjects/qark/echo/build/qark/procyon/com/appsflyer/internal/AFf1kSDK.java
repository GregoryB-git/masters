// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.os.Looper;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import android.hardware.SensorEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import android.hardware.Sensor;
import java.util.concurrent.Executor;
import androidx.annotation.NonNull;
import android.hardware.SensorEventListener;

public final class AFf1kSDK implements SensorEventListener
{
    private final long[] AFInAppEventParameterName;
    @NonNull
    private final String AFInAppEventType;
    @NonNull
    private final String AFKeystoreWrapper;
    private final int AFLogger;
    private long afDebugLog;
    private double afErrorLog;
    private Executor afRDLog;
    private final int valueOf;
    private final float[][] values;
    
    public AFf1kSDK(final Sensor sensor) {
        this.values = new float[2][];
        this.AFInAppEventParameterName = new long[2];
        final int type = sensor.getType();
        this.valueOf = type;
        final String name = sensor.getName();
        final String s = "";
        String afInAppEventType = name;
        if (name == null) {
            afInAppEventType = "";
        }
        this.AFInAppEventType = afInAppEventType;
        String vendor = sensor.getVendor();
        if (vendor == null) {
            vendor = s;
        }
        this.AFKeystoreWrapper = vendor;
        this.AFLogger = ((type + 31) * 31 + afInAppEventType.hashCode()) * 31 + vendor.hashCode();
    }
    
    @NonNull
    private Executor AFInAppEventParameterName() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.afRDLog == null) {
                    this.afRDLog = Executors.newSingleThreadExecutor();
                }
                // monitorexit(this)
                return this.afRDLog;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @NonNull
    private static List<Float> AFInAppEventType(@NonNull final float[] array) {
        final ArrayList<Float> list = new ArrayList<Float>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return list;
    }
    
    private static double AFKeystoreWrapper(@NonNull final float[] array, @NonNull final float[] array2) {
        final int min = Math.min(array.length, array2.length);
        double a = 0.0;
        for (int i = 0; i < min; ++i) {
            a += StrictMath.pow(array[i] - array2[i], 2.0);
        }
        return Math.sqrt(a);
    }
    
    private boolean AFKeystoreWrapper() {
        return this.values[0] != null;
    }
    
    private boolean AFKeystoreWrapper(final int n, @NonNull final String obj, @NonNull final String obj2) {
        return this.valueOf == n && this.AFInAppEventType.equals(obj) && this.AFKeystoreWrapper.equals(obj2);
    }
    
    @NonNull
    private Map<String, Object> values() {
        final ConcurrentHashMap<String, List<Float>> concurrentHashMap = (ConcurrentHashMap<String, List<Float>>)new ConcurrentHashMap<String, String>(7);
        concurrentHashMap.put("sT", (String)this.valueOf);
        concurrentHashMap.put("sN", this.AFInAppEventType);
        concurrentHashMap.put("sV", this.AFKeystoreWrapper);
        final float[] array = this.values[0];
        if (array != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(array));
        }
        final float[] array2 = this.values[1];
        if (array2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(array2));
        }
        return (Map<String, Object>)concurrentHashMap;
    }
    
    private void values(final SensorEvent sensorEvent) {
        final long timestamp = sensorEvent.timestamp;
        final float[] values = sensorEvent.values;
        final long currentTimeMillis = System.currentTimeMillis();
        final float[][] values2 = this.values;
        final float[] array = values2[0];
        if (array == null) {
            values2[0] = Arrays.copyOf(values, values.length);
            this.AFInAppEventParameterName[0] = currentTimeMillis;
            return;
        }
        final float[] a = values2[1];
        if (a == null) {
            final float[] copy = Arrays.copyOf(values, values.length);
            this.values[1] = copy;
            this.AFInAppEventParameterName[1] = currentTimeMillis;
            this.afErrorLog = AFKeystoreWrapper(array, copy);
            return;
        }
        if (50000000L <= timestamp - this.afDebugLog) {
            this.afDebugLog = timestamp;
            if (Arrays.equals(a, values)) {
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                return;
            }
            final double afKeystoreWrapper = AFKeystoreWrapper(array, values);
            if (afKeystoreWrapper > this.afErrorLog) {
                this.values[1] = Arrays.copyOf(values, values.length);
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                this.afErrorLog = afKeystoreWrapper;
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof AFf1kSDK) {
            final AFf1kSDK aFf1kSDK = (AFf1kSDK)o;
            return this.AFKeystoreWrapper(aFf1kSDK.valueOf, aFf1kSDK.AFInAppEventType, aFf1kSDK.AFKeystoreWrapper);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.AFLogger;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFInAppEventParameterName().execute(new v(this, sensorEvent));
            return;
        }
        this.values(sensorEvent);
    }
    
    public final void valueOf(@NonNull final Map<AFf1kSDK, Map<String, Object>> map, final boolean b) {
        if (this.AFKeystoreWrapper()) {
            map.put(this, this.values());
            if (b) {
                final int length = this.values.length;
                final int n = 0;
                for (int i = 0; i < length; ++i) {
                    this.values[i] = null;
                }
                for (int length2 = this.AFInAppEventParameterName.length, j = n; j < length2; ++j) {
                    this.AFInAppEventParameterName[j] = 0L;
                }
                this.afErrorLog = 0.0;
                this.afDebugLog = 0L;
            }
        }
        else if (!map.containsKey(this)) {
            map.put(this, this.values());
        }
    }
}
