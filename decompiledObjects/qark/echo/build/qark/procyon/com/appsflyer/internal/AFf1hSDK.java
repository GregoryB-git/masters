// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Iterator;
import com.appsflyer.AFLogger;
import android.hardware.SensorEventListener;
import android.hardware.Sensor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import android.content.Context;
import android.hardware.SensorManager;
import java.util.Map;
import android.os.Handler;
import java.util.BitSet;

public final class AFf1hSDK implements AFf1iSDK
{
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
        final BitSet afInfoLog2 = new BitSet(6);
        (afInfoLog = afInfoLog2).set(1);
        afInfoLog2.set(2);
        afInfoLog2.set(4);
    }
    
    public AFf1hSDK(@NonNull final Context context) {
        final SensorManager sensorManager = (SensorManager)context.getApplicationContext().getSystemService("sensor");
        final HandlerThread handlerThread = new HandlerThread("internal");
        ((Thread)handlerThread).start();
        this(sensorManager, new Handler(handlerThread.getLooper()));
    }
    
    private AFf1hSDK(@NonNull final SensorManager afRDLog, final Handler afInAppEventParameterName) {
        this.valueOf = new Object();
        final BitSet afInfoLog = AFf1hSDK.afInfoLog;
        this.AFLogger = new HashMap<AFf1kSDK, AFf1kSDK>(afInfoLog.size());
        this.afErrorLog = new ConcurrentHashMap<AFf1kSDK, Map<String, Object>>(afInfoLog.size());
        this.values = new Runnable() {
            @Override
            public final void run() {
                synchronized (AFf1hSDK.this.valueOf) {
                    final AFf1hSDK afKeystoreWrapper = AFf1hSDK.this;
                    afKeystoreWrapper.AFInAppEventParameterName.post((Runnable)new Runnable() {
                        @Override
                        public final void run() {
                            while (true) {
                                try {
                                    for (final Sensor sensor : AFf1hSDK.values(afKeystoreWrapper).getSensorList(-1)) {
                                        if (values(sensor.getType())) {
                                            final AFf1kSDK aFf1kSDK = new AFf1kSDK(sensor);
                                            if (!AFf1hSDK.valueOf(afKeystoreWrapper).containsKey(aFf1kSDK)) {
                                                AFf1hSDK.valueOf(afKeystoreWrapper).put(aFf1kSDK, aFf1kSDK);
                                            }
                                            AFf1hSDK.values(afKeystoreWrapper).registerListener((SensorEventListener)AFf1hSDK.valueOf(afKeystoreWrapper).get(aFf1kSDK), sensor, 0, afKeystoreWrapper.AFInAppEventParameterName);
                                        }
                                    }
                                    while (true) {
                                        AFf1hSDK.AFInAppEventType(afKeystoreWrapper, true);
                                        return;
                                        final Throwable t;
                                        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("registerListeners error", t);
                                        continue;
                                    }
                                }
                                finally {}
                                final Throwable t2;
                                final Throwable t = t2;
                                continue;
                            }
                        }
                    });
                    final AFf1hSDK afKeystoreWrapper2 = AFf1hSDK.this;
                    afKeystoreWrapper2.AFInAppEventParameterName.postDelayed(AFf1hSDK.AFKeystoreWrapper(afKeystoreWrapper2), 100L);
                    AFf1hSDK.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.AFInAppEventType = new u(this);
        this.AFVersionDeclaration = new Runnable() {
            @Override
            public final void run() {
                final Object valueOf = AFf1hSDK.this.valueOf;
                // monitorenter(valueOf)
                while (true) {
                    try {
                        final AFf1hSDK afInAppEventParameterName = AFf1hSDK.this;
                        if (afInAppEventParameterName.AFKeystoreWrapper) {
                            afInAppEventParameterName.AFInAppEventParameterName.removeCallbacks(afInAppEventParameterName.values);
                            final AFf1hSDK afInAppEventParameterName2 = AFf1hSDK.this;
                            afInAppEventParameterName2.AFInAppEventParameterName.removeCallbacks(afInAppEventParameterName2.AFInAppEventType);
                            final AFf1hSDK afInAppEventParameterName3 = AFf1hSDK.this;
                            afInAppEventParameterName3.AFInAppEventParameterName.post((Runnable)new Runnable() {
                                @Override
                                public final void run() {
                                    try {
                                        if (!AFf1hSDK.valueOf(AFf1hSDK.this).isEmpty()) {
                                            for (final AFf1kSDK aFf1kSDK : AFf1hSDK.valueOf(AFf1hSDK.this).values()) {
                                                AFf1hSDK.values(AFf1hSDK.this).unregisterListener((SensorEventListener)aFf1kSDK);
                                                aFf1kSDK.valueOf(AFf1hSDK.AFInAppEventParameterName(AFf1hSDK.this), true);
                                            }
                                        }
                                    }
                                    finally {
                                        final Throwable t;
                                        com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", t);
                                    }
                                    AFf1hSDK.AFKeystoreWrapper(AFf1hSDK.this, 0);
                                    AFf1hSDK.AFInAppEventType(AFf1hSDK.this, false);
                                }
                            });
                            AFf1hSDK.this.AFKeystoreWrapper = false;
                        }
                        // monitorexit(valueOf)
                        return;
                        // monitorexit(valueOf)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        };
        this.getLevel = 1;
        this.AFLogger$LogLevel = 0L;
        this.afErrorLogForExcManagerOnly = new Runnable() {
            @Override
            public final void run() {
                final Object valueOf = AFf1hSDK.this.valueOf;
                // monitorenter(valueOf)
                while (true) {
                    try {
                        if (AFf1hSDK.AFInAppEventType(AFf1hSDK.this) == 0) {
                            AFf1hSDK.AFKeystoreWrapper(AFf1hSDK.this, 1);
                        }
                        final AFf1hSDK afInAppEventType = AFf1hSDK.this;
                        afInAppEventType.AFInAppEventParameterName.postDelayed(afInAppEventType.AFInAppEventType, AFf1hSDK.AFInAppEventType(afInAppEventType) * 500L);
                        // monitorexit(valueOf)
                        return;
                        // monitorexit(valueOf)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        };
        this.afRDLog = afRDLog;
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    public static /* synthetic */ Map AFInAppEventParameterName(final AFf1hSDK aFf1hSDK) {
        return aFf1hSDK.afErrorLog;
    }
    
    public static /* synthetic */ int AFInAppEventType(final AFf1hSDK aFf1hSDK) {
        return aFf1hSDK.getLevel;
    }
    
    public static /* synthetic */ boolean AFInAppEventType(final AFf1hSDK aFf1hSDK, final boolean afDebugLog) {
        return aFf1hSDK.afDebugLog = afDebugLog;
    }
    
    public static /* synthetic */ int AFKeystoreWrapper(final AFf1hSDK aFf1hSDK, final int getLevel) {
        return aFf1hSDK.getLevel = getLevel;
    }
    
    public static /* synthetic */ Runnable AFKeystoreWrapper(final AFf1hSDK aFf1hSDK) {
        return aFf1hSDK.afErrorLogForExcManagerOnly;
    }
    
    private List<Map<String, Object>> AFKeystoreWrapper() {
        final Iterator<AFf1kSDK> iterator = this.AFLogger.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().valueOf(this.afErrorLog, true);
        }
        final Map<AFf1kSDK, Map<String, Object>> afErrorLog = this.afErrorLog;
        if (afErrorLog != null && !afErrorLog.isEmpty()) {
            return new CopyOnWriteArrayList<Map<String, Object>>(this.afErrorLog.values());
        }
        return new CopyOnWriteArrayList<Map<String, Object>>((Collection<? extends Map<String, Object>>)Collections.emptyList());
    }
    
    @NonNull
    private List<Map<String, Object>> afErrorLog() {
        final Object valueOf = this.valueOf;
        // monitorenter(valueOf)
        while (true) {
            try {
                if (!this.AFLogger.isEmpty() && this.afDebugLog) {
                    final Iterator<AFf1kSDK> iterator = this.AFLogger.values().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().valueOf(this.afErrorLog, false);
                    }
                }
                if (this.afErrorLog.isEmpty()) {
                    // monitorexit(valueOf)
                    return new CopyOnWriteArrayList<Map<String, Object>>((Collection<? extends Map<String, Object>>)Collections.emptyList());
                }
                // monitorexit(valueOf)
                return new CopyOnWriteArrayList<Map<String, Object>>(this.afErrorLog.values());
                // monitorexit(valueOf)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static /* synthetic */ Map valueOf(final AFf1hSDK aFf1hSDK) {
        return aFf1hSDK.AFLogger;
    }
    
    public static /* synthetic */ SensorManager values(final AFf1hSDK aFf1hSDK) {
        return aFf1hSDK.afRDLog;
    }
    
    private static boolean values(final int bitIndex) {
        return bitIndex >= 0 && AFf1hSDK.afInfoLog.get(bitIndex);
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
        }
    }
    
    @NonNull
    @Override
    public final Map<String, Object> valueOf() {
        final ConcurrentHashMap<String, List<Map<String, Object>>> concurrentHashMap = new ConcurrentHashMap<String, List<Map<String, Object>>>();
        List<Map<String, Object>> list = this.afErrorLog();
        if (list.isEmpty()) {
            list = this.AFKeystoreWrapper();
            if (list.isEmpty()) {
                return (Map<String, Object>)concurrentHashMap;
            }
        }
        concurrentHashMap.put("sensors", list);
        return (Map<String, Object>)concurrentHashMap;
    }
    
    @NonNull
    @Override
    public final Map<String, Object> values() {
        final ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<String, Object>();
        final List<Map<String, Object>> afKeystoreWrapper = this.AFKeystoreWrapper();
        final boolean empty = afKeystoreWrapper.isEmpty();
        final String s = "sensors";
        final String s2 = "na";
        if (!empty) {
            new AFf1gSDK();
            final HashMap<String, HashMap<String, Object>> hashMap = new HashMap<String, HashMap<String, Object>>();
            while (true) {
                for (final Map<String, Object> map : afKeystoreWrapper) {
                    final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                    final boolean b = map.get("sVS") != null;
                    final boolean b2 = map.get("sVE") != null;
                    AFf1gSDK.AFa1xSDK aFa1xSDK;
                    if (b && b2) {
                        aFa1xSDK = AFf1gSDK.AFa1xSDK.AFInAppEventType;
                    }
                    else if (b) {
                        aFa1xSDK = AFf1gSDK.AFa1xSDK.values;
                    }
                    else {
                        aFa1xSDK = AFf1gSDK.AFa1xSDK.valueOf;
                    }
                    if (aFa1xSDK == AFf1gSDK.AFa1xSDK.valueOf) {
                        final HashMap<String, HashMap<String, Object>> hashMap3 = new HashMap<String, HashMap<String, Object>>();
                        hashMap3.put("er", (HashMap<String, Object>)s2);
                        concurrentHashMap.put(s, hashMap3);
                        return concurrentHashMap;
                    }
                    final Integer n = map.get("sT");
                    String s3 = map.get("sN");
                    if (s3 == null) {
                        s3 = "uk";
                    }
                    hashMap2.put("n", s3);
                    final AFf1gSDK.AFa1zSDK aFa1zSDK = AFf1gSDK.AFa1zSDK.values()[n.intValue()];
                    final ArrayList list = new ArrayList<BigDecimal>(AFf1gSDK.AFKeystoreWrapper(map.get("sVS")));
                    if (aFa1xSDK == AFf1gSDK.AFa1xSDK.AFInAppEventType) {
                        list.addAll((Collection<?>)AFf1gSDK.AFKeystoreWrapper(map.get("sVE")));
                    }
                    ArrayList<ArrayList<Double>> list4;
                    if (aFa1zSDK == AFf1gSDK.AFa1zSDK.AFInAppEventParameterName) {
                        final ArrayList<Double> list2 = new ArrayList<Double>();
                        final BigDecimal value = BigDecimal.valueOf(Math.atan2(list.get(1).doubleValue(), list.get(0).doubleValue()) * 57.29577951308232);
                        final DecimalFormat decimalFormat = new DecimalFormat("##.#");
                        final RoundingMode down = RoundingMode.DOWN;
                        decimalFormat.setRoundingMode(down);
                        list2.add(AFc1uSDK.AFa1wSDK.values(decimalFormat.format(value)));
                        final BigDecimal obj = list.get(2);
                        final DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                        decimalFormat2.setRoundingMode(down);
                        list2.add(AFc1uSDK.AFa1wSDK.values(decimalFormat2.format(obj)));
                        final ArrayList<Double> list3 = new ArrayList<Double>();
                        if (list.size() > 5) {
                            final BigDecimal subtract = BigDecimal.valueOf(Math.atan2(list.get(4).doubleValue(), list.get(3).doubleValue()) * 57.29577951308232).subtract(value);
                            final DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                            decimalFormat3.setRoundingMode(down);
                            list3.add(AFc1uSDK.AFa1wSDK.values(decimalFormat3.format(subtract)));
                            final BigDecimal subtract2 = list.get(5).subtract(list.get(2));
                            final DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                            decimalFormat4.setRoundingMode(down);
                            list3.add(AFc1uSDK.AFa1wSDK.values(decimalFormat4.format(subtract2)));
                        }
                        list4 = new ArrayList<ArrayList<Double>>();
                        list4.add(list2);
                        list4.add(list3);
                    }
                    else {
                        final ArrayList<Double> list5 = new ArrayList<Double>();
                        if (list.size() > 5) {
                            final BigDecimal subtract3 = list.get(3).subtract(list.get(0));
                            final DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                            final RoundingMode down2 = RoundingMode.DOWN;
                            decimalFormat5.setRoundingMode(down2);
                            list5.add(AFc1uSDK.AFa1wSDK.values(decimalFormat5.format(subtract3)));
                            final BigDecimal subtract4 = list.get(4).subtract(list.get(1));
                            final DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                            decimalFormat6.setRoundingMode(down2);
                            list5.add(AFc1uSDK.AFa1wSDK.values(decimalFormat6.format(subtract4)));
                            final BigDecimal subtract5 = list.get(5).subtract(list.get(2));
                            final DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                            decimalFormat7.setRoundingMode(down2);
                            list5.add(AFc1uSDK.AFa1wSDK.values(decimalFormat7.format(subtract5)));
                        }
                        final ArrayList<Double> list6 = new ArrayList<Double>();
                        final BigDecimal obj2 = list.get(0);
                        final DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                        final RoundingMode down3 = RoundingMode.DOWN;
                        decimalFormat8.setRoundingMode(down3);
                        list6.add(AFc1uSDK.AFa1wSDK.values(decimalFormat8.format(obj2)));
                        final BigDecimal obj3 = list.get(1);
                        final DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                        decimalFormat9.setRoundingMode(down3);
                        list6.add(AFc1uSDK.AFa1wSDK.values(decimalFormat9.format(obj3)));
                        final BigDecimal obj4 = list.get(2);
                        final DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                        decimalFormat10.setRoundingMode(down3);
                        list6.add(AFc1uSDK.AFa1wSDK.values(decimalFormat10.format(obj4)));
                        list4 = new ArrayList<ArrayList<Double>>();
                        list4.add(list6);
                        list4.add(list5);
                    }
                    hashMap2.put("v", (String)list4);
                    hashMap.put(AFf1gSDK.AFa1vSDK.values()[n.intValue()].values, (HashMap<String, Object>)hashMap2);
                    if (aFa1xSDK != AFf1gSDK.AFa1xSDK.values) {
                        continue;
                    }
                    hashMap.put("er", (HashMap<String, Object>)"no_svs");
                }
                final HashMap<String, HashMap<String, Object>> hashMap3 = hashMap;
                continue;
            }
        }
        concurrentHashMap.put("sensors", "na");
        return concurrentHashMap;
    }
}
