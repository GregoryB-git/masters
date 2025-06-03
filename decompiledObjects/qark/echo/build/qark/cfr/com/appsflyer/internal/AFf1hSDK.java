/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.math.RoundingMode
 *  java.text.DecimalFormat
 *  java.util.ArrayList
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFf1gSDK;
import com.appsflyer.internal.AFf1iSDK;
import com.appsflyer.internal.AFf1kSDK;
import com.appsflyer.internal.u;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFf1hSDK
implements AFf1iSDK {
    private static final BitSet afInfoLog;
    final Handler AFInAppEventParameterName;
    final Runnable AFInAppEventType;
    boolean AFKeystoreWrapper;
    private final Map<AFf1kSDK, AFf1kSDK> AFLogger;
    private long AFLogger$LogLevel;
    private Runnable AFVersionDeclaration;
    private boolean afDebugLog;
    private final Map<AFf1kSDK, Map<String, Object>> afErrorLog;
    private final Runnable afErrorLogForExcManagerOnly;
    private final SensorManager afRDLog;
    private int getLevel;
    final Object valueOf;
    final Runnable values;

    static {
        BitSet bitSet;
        afInfoLog = bitSet = new BitSet(6);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    public AFf1hSDK(@NonNull Context context) {
        context = (SensorManager)context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this((SensorManager)context, new Handler(handlerThread.getLooper()));
    }

    private AFf1hSDK(@NonNull SensorManager sensorManager, Handler handler) {
        this.valueOf = new Object();
        BitSet bitSet = afInfoLog;
        this.AFLogger = new HashMap(bitSet.size());
        this.afErrorLog = new ConcurrentHashMap(bitSet.size());
        this.values = new Runnable(this){
            private /* synthetic */ AFf1hSDK AFKeystoreWrapper;
            {
                this.AFKeystoreWrapper = aFf1hSDK;
            }

            public final void run() {
                Object object = this.AFKeystoreWrapper.valueOf;
                synchronized (object) {
                    AFf1hSDK aFf1hSDK = this.AFKeystoreWrapper;
                    aFf1hSDK.AFInAppEventParameterName.post(new Runnable(aFf1hSDK){
                        private /* synthetic */ AFf1hSDK valueOf;
                        {
                            this.valueOf = aFf1hSDK;
                        }

                        /*
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         */
                        public final void run() {
                            block4 : {
                                try {
                                    for (Sensor sensor : this.valueOf.afRDLog.getSensorList(-1)) {
                                        if (!AFf1hSDK.values(sensor.getType())) continue;
                                        AFf1kSDK aFf1kSDK = new AFf1kSDK(sensor);
                                        if (!this.valueOf.AFLogger.containsKey((Object)aFf1kSDK)) {
                                            this.valueOf.AFLogger.put((Object)aFf1kSDK, (Object)aFf1kSDK);
                                        }
                                        aFf1kSDK = (SensorEventListener)this.valueOf.AFLogger.get((Object)aFf1kSDK);
                                        this.valueOf.afRDLog.registerListener((SensorEventListener)aFf1kSDK, sensor, 0, this.valueOf.AFInAppEventParameterName);
                                    }
                                    break block4;
                                }
                                catch (Throwable throwable) {}
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", throwable);
                            }
                            this.valueOf.afDebugLog = true;
                        }
                    });
                    aFf1hSDK = this.AFKeystoreWrapper;
                    aFf1hSDK.AFInAppEventParameterName.postDelayed(aFf1hSDK.afErrorLogForExcManagerOnly, 100L);
                    this.AFKeystoreWrapper.AFKeystoreWrapper = true;
                    return;
                }
            }
        };
        this.AFInAppEventType = new u(this);
        this.AFVersionDeclaration = new Runnable(this){
            private /* synthetic */ AFf1hSDK AFInAppEventParameterName;
            {
                this.AFInAppEventParameterName = aFf1hSDK;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void run() {
                Object object = this.AFInAppEventParameterName.valueOf;
                synchronized (object) {
                    try {
                        AFf1hSDK aFf1hSDK = this.AFInAppEventParameterName;
                        if (aFf1hSDK.AFKeystoreWrapper) {
                            aFf1hSDK.AFInAppEventParameterName.removeCallbacks(aFf1hSDK.values);
                            aFf1hSDK = this.AFInAppEventParameterName;
                            aFf1hSDK.AFInAppEventParameterName.removeCallbacks(aFf1hSDK.AFInAppEventType);
                            aFf1hSDK = this.AFInAppEventParameterName;
                            aFf1hSDK.AFInAppEventParameterName.post(new Runnable(aFf1hSDK){
                                private /* synthetic */ AFf1hSDK valueOf;
                                {
                                    this.valueOf = aFf1hSDK;
                                }

                                public final void run() {
                                    try {
                                        if (!this.valueOf.AFLogger.isEmpty()) {
                                            for (AFf1kSDK aFf1kSDK : this.valueOf.AFLogger.values()) {
                                                this.valueOf.afRDLog.unregisterListener((SensorEventListener)aFf1kSDK);
                                                aFf1kSDK.valueOf(this.valueOf.afErrorLog, true);
                                            }
                                        }
                                    }
                                    catch (Throwable throwable) {
                                        AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", throwable);
                                    }
                                    this.valueOf.getLevel = 0;
                                    this.valueOf.afDebugLog = false;
                                }
                            });
                            this.AFInAppEventParameterName.AFKeystoreWrapper = false;
                        }
                        return;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
        };
        this.getLevel = 1;
        this.AFLogger$LogLevel = 0L;
        this.afErrorLogForExcManagerOnly = new Runnable(this){
            private /* synthetic */ AFf1hSDK AFInAppEventType;
            {
                this.AFInAppEventType = aFf1hSDK;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void run() {
                Object object = this.AFInAppEventType.valueOf;
                synchronized (object) {
                    try {
                        if (this.AFInAppEventType.getLevel == 0) {
                            this.AFInAppEventType.getLevel = 1;
                        }
                        AFf1hSDK aFf1hSDK = this.AFInAppEventType;
                        aFf1hSDK.AFInAppEventParameterName.postDelayed(aFf1hSDK.AFInAppEventType, (long)aFf1hSDK.getLevel * 500L);
                        return;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
        };
        this.afRDLog = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    private List<Map<String, Object>> AFKeystoreWrapper() {
        Map<AFf1kSDK, Map<String, Object>> map = this.AFLogger.values().iterator();
        while (map.hasNext()) {
            ((AFf1kSDK)map.next()).valueOf(this.afErrorLog, true);
        }
        map = this.afErrorLog;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.afErrorLog.values());
        }
        return new CopyOnWriteArrayList((Collection)Collections.emptyList());
    }

    public static /* synthetic */ void a(AFf1hSDK aFf1hSDK) {
        aFf1hSDK.afInfoLog();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    private List<Map<String, Object>> afErrorLog() {
        Object object = this.valueOf;
        synchronized (object) {
            try {
                if (!this.AFLogger.isEmpty() && this.afDebugLog) {
                    Iterator iterator = this.AFLogger.values().iterator();
                    while (iterator.hasNext()) {
                        ((AFf1kSDK)iterator.next()).valueOf(this.afErrorLog, false);
                    }
                }
                if (!this.afErrorLog.isEmpty()) return new CopyOnWriteArrayList(this.afErrorLog.values());
                return new CopyOnWriteArrayList((Collection)Collections.emptyList());
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private /* synthetic */ void afInfoLog() {
        Object object = this.valueOf;
        synchronized (object) {
            this.AFInAppEventParameterName.post(new );
            return;
        }
    }

    private static boolean values(int n8) {
        if (n8 >= 0 && afInfoLog.get(n8)) {
            return true;
        }
        return false;
    }

    @Override
    public final void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.AFVersionDeclaration);
        this.AFInAppEventParameterName.post(this.values);
    }

    @Override
    public final void AFInAppEventType() {
        synchronized (this) {
            this.AFInAppEventParameterName.post(this.AFVersionDeclaration);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @NonNull
    @Override
    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> list = this.afErrorLog();
        if (list.isEmpty() && (list = this.AFKeystoreWrapper()).isEmpty()) {
            return concurrentHashMap;
        }
        concurrentHashMap.put((Object)"sensors", list);
        return concurrentHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    @NonNull
    @Override
    public final Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap;
        String string2;
        Object object;
        block9 : {
            concurrentHashMap = new ConcurrentHashMap();
            object = this.AFKeystoreWrapper();
            boolean bl = object.isEmpty();
            string2 = "sensors";
            String string3 = "na";
            if (bl) {
                concurrentHashMap.put((Object)"sensors", (Object)"na");
                return concurrentHashMap;
            }
            new AFf1gSDK();
            HashMap hashMap = new HashMap();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                Map map = (Map)iterator.next();
                HashMap hashMap2 = new HashMap();
                boolean bl2 = map.get((Object)"sVS") != null;
                boolean bl3 = map.get((Object)"sVE") != null;
                object = bl2 && bl3 ? AFf1gSDK.AFa1xSDK.AFInAppEventType : (bl2 ? AFf1gSDK.AFa1xSDK.values : AFf1gSDK.AFa1xSDK.valueOf);
                if (object != AFf1gSDK.AFa1xSDK.valueOf) {
                    DecimalFormat decimalFormat;
                    BigDecimal bigDecimal;
                    BigDecimal bigDecimal2;
                    Integer n8 = (Integer)map.get((Object)"sT");
                    String string4 = (String)map.get((Object)"sN");
                    if (string4 == null) {
                        string4 = "uk";
                    }
                    hashMap2.put((Object)"n", (Object)string4);
                    AFf1gSDK.AFa1zSDK aFa1zSDK = AFf1gSDK.AFa1zSDK.values()[n8];
                    string4 = new ArrayList(AFf1gSDK.AFKeystoreWrapper(map.get((Object)"sVS")));
                    if (object == AFf1gSDK.AFa1xSDK.AFInAppEventType) {
                        string4.addAll(AFf1gSDK.AFKeystoreWrapper(map.get((Object)"sVE")));
                    }
                    if (aFa1zSDK == AFf1gSDK.AFa1zSDK.AFInAppEventParameterName) {
                        map = new ArrayList();
                        aFa1zSDK = (BigDecimal)string4.get(0);
                        bigDecimal2 = (BigDecimal)string4.get(1);
                        double d8 = aFa1zSDK.doubleValue();
                        bigDecimal = BigDecimal.valueOf((double)(Math.atan2((double)bigDecimal2.doubleValue(), (double)d8) * 57.29577951308232));
                        bigDecimal2 = new DecimalFormat("##.#");
                        aFa1zSDK = RoundingMode.DOWN;
                        bigDecimal2.setRoundingMode((RoundingMode)aFa1zSDK);
                        map.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal2.format((Object)bigDecimal)));
                        bigDecimal2 = (BigDecimal)string4.get(2);
                        decimalFormat = new DecimalFormat("##.#");
                        decimalFormat.setRoundingMode((RoundingMode)aFa1zSDK);
                        map.add((Object)AFc1uSDK.AFa1wSDK.values(decimalFormat.format((Object)bigDecimal2)));
                        bigDecimal2 = new ArrayList();
                        if (string4.size() > 5) {
                            decimalFormat = (BigDecimal)string4.get(3);
                            BigDecimal bigDecimal3 = (BigDecimal)string4.get(4);
                            d8 = decimalFormat.doubleValue();
                            bigDecimal = BigDecimal.valueOf((double)(Math.atan2((double)bigDecimal3.doubleValue(), (double)d8) * 57.29577951308232)).subtract(bigDecimal);
                            decimalFormat = new DecimalFormat("##.#");
                            decimalFormat.setRoundingMode((RoundingMode)aFa1zSDK);
                            bigDecimal2.add((Object)AFc1uSDK.AFa1wSDK.values(decimalFormat.format((Object)bigDecimal)));
                            string4 = ((BigDecimal)string4.get(5)).subtract((BigDecimal)string4.get(2));
                            bigDecimal = new DecimalFormat("##.#");
                            bigDecimal.setRoundingMode((RoundingMode)aFa1zSDK);
                            bigDecimal2.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal.format((Object)string4)));
                        }
                        string4 = new ArrayList();
                        string4.add((Object)map);
                        string4.add((Object)bigDecimal2);
                    } else {
                        map = new ArrayList();
                        if (string4.size() > 5) {
                            bigDecimal2 = ((BigDecimal)string4.get(3)).subtract((BigDecimal)string4.get(0));
                            bigDecimal = new DecimalFormat("##.#");
                            aFa1zSDK = RoundingMode.DOWN;
                            bigDecimal.setRoundingMode((RoundingMode)aFa1zSDK);
                            map.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal.format((Object)bigDecimal2)));
                            bigDecimal2 = ((BigDecimal)string4.get(4)).subtract((BigDecimal)string4.get(1));
                            bigDecimal = new DecimalFormat("##.#");
                            bigDecimal.setRoundingMode((RoundingMode)aFa1zSDK);
                            map.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal.format((Object)bigDecimal2)));
                            bigDecimal2 = ((BigDecimal)string4.get(5)).subtract((BigDecimal)string4.get(2));
                            bigDecimal = new DecimalFormat("##.#");
                            bigDecimal.setRoundingMode((RoundingMode)aFa1zSDK);
                            map.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal.format((Object)bigDecimal2)));
                        }
                        aFa1zSDK = new ArrayList();
                        bigDecimal = (BigDecimal)string4.get(0);
                        decimalFormat = new DecimalFormat("##.#");
                        bigDecimal2 = RoundingMode.DOWN;
                        decimalFormat.setRoundingMode((RoundingMode)bigDecimal2);
                        aFa1zSDK.add((Object)AFc1uSDK.AFa1wSDK.values(decimalFormat.format((Object)bigDecimal)));
                        bigDecimal = (BigDecimal)string4.get(1);
                        decimalFormat = new DecimalFormat("##.#");
                        decimalFormat.setRoundingMode((RoundingMode)bigDecimal2);
                        aFa1zSDK.add((Object)AFc1uSDK.AFa1wSDK.values(decimalFormat.format((Object)bigDecimal)));
                        string4 = (BigDecimal)string4.get(2);
                        bigDecimal = new DecimalFormat("##.#");
                        bigDecimal.setRoundingMode((RoundingMode)bigDecimal2);
                        aFa1zSDK.add((Object)AFc1uSDK.AFa1wSDK.values(bigDecimal.format((Object)string4)));
                        string4 = new ArrayList();
                        string4.add((Object)aFa1zSDK);
                        string4.add((Object)map);
                    }
                    hashMap2.put((Object)"v", (Object)string4);
                    hashMap.put((Object)AFf1gSDK.AFa1vSDK.values()[n8.intValue()].values, (Object)hashMap2);
                    if (object != AFf1gSDK.AFa1xSDK.values) continue;
                    hashMap.put((Object)"er", (Object)"no_svs");
                    continue;
                }
                object = new HashMap();
                object.put((Object)"er", (Object)string3);
                break block9;
            }
            object = hashMap;
        }
        concurrentHashMap.put((Object)string2, object);
        return concurrentHashMap;
    }

}

