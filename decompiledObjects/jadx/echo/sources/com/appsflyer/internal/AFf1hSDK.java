package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFf1gSDK;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class AFf1hSDK implements AFf1iSDK {
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

    /* renamed from: com.appsflyer.internal.AFf1hSDK$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!AFf1hSDK.this.AFLogger.isEmpty()) {
                    for (AFf1kSDK aFf1kSDK : AFf1hSDK.this.AFLogger.values()) {
                        AFf1hSDK.this.afRDLog.unregisterListener(aFf1kSDK);
                        aFf1kSDK.valueOf(AFf1hSDK.this.afErrorLog, true);
                    }
                }
            } catch (Throwable th) {
                AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
            }
            AFf1hSDK.this.getLevel = 0;
            AFf1hSDK.this.afDebugLog = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        afInfoLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AFf1hSDK(@androidx.annotation.NonNull android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1hSDK.<init>(android.content.Context):void");
    }

    @NonNull
    private List<Map<String, Object>> afErrorLog() {
        synchronized (this.valueOf) {
            try {
                if (!this.AFLogger.isEmpty() && this.afDebugLog) {
                    Iterator<AFf1kSDK> it = this.AFLogger.values().iterator();
                    while (it.hasNext()) {
                        it.next().valueOf(this.afErrorLog, false);
                    }
                }
                if (this.afErrorLog.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.afErrorLog.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void afInfoLog() {
        synchronized (this.valueOf) {
            this.AFInAppEventParameterName.post(new AnonymousClass5());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1.isEmpty() == false) goto L4;
     */
    @Override // com.appsflyer.internal.AFf1iSDK
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> valueOf() {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.List r1 = r4.afErrorLog()
            boolean r2 = r1.isEmpty()
            java.lang.String r3 = "sensors"
            if (r2 != 0) goto L15
        L11:
            r0.put(r3, r1)
            goto L20
        L15:
            java.util.List r1 = r4.AFKeystoreWrapper()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L20
            goto L11
        L20:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1hSDK.valueOf():java.util.Map");
    }

    private AFf1hSDK(@NonNull SensorManager sensorManager, Handler handler) {
        this.valueOf = new Object();
        BitSet bitSet = afInfoLog;
        this.AFLogger = new HashMap(bitSet.size());
        this.afErrorLog = new ConcurrentHashMap(bitSet.size());
        this.values = new Runnable() { // from class: com.appsflyer.internal.AFf1hSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1hSDK.this.valueOf) {
                    final AFf1hSDK aFf1hSDK = AFf1hSDK.this;
                    aFf1hSDK.AFInAppEventParameterName.post(new Runnable() { // from class: com.appsflyer.internal.AFf1hSDK.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : AFf1hSDK.this.afRDLog.getSensorList(-1)) {
                                    if (AFf1hSDK.values(sensor.getType())) {
                                        AFf1kSDK aFf1kSDK = new AFf1kSDK(sensor);
                                        if (!AFf1hSDK.this.AFLogger.containsKey(aFf1kSDK)) {
                                            AFf1hSDK.this.AFLogger.put(aFf1kSDK, aFf1kSDK);
                                        }
                                        AFf1hSDK.this.afRDLog.registerListener((SensorEventListener) AFf1hSDK.this.AFLogger.get(aFf1kSDK), sensor, 0, AFf1hSDK.this.AFInAppEventParameterName);
                                    }
                                }
                            } catch (Throwable th) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
                            }
                            AFf1hSDK.this.afDebugLog = true;
                        }
                    });
                    AFf1hSDK aFf1hSDK2 = AFf1hSDK.this;
                    aFf1hSDK2.AFInAppEventParameterName.postDelayed(aFf1hSDK2.afErrorLogForExcManagerOnly, 100L);
                    AFf1hSDK.this.AFKeystoreWrapper = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.u
            @Override // java.lang.Runnable
            public final void run() {
                AFf1hSDK.this.afInfoLog();
            }
        };
        this.AFVersionDeclaration = new Runnable() { // from class: com.appsflyer.internal.AFf1hSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1hSDK.this.valueOf) {
                    try {
                        AFf1hSDK aFf1hSDK = AFf1hSDK.this;
                        if (aFf1hSDK.AFKeystoreWrapper) {
                            aFf1hSDK.AFInAppEventParameterName.removeCallbacks(aFf1hSDK.values);
                            AFf1hSDK aFf1hSDK2 = AFf1hSDK.this;
                            aFf1hSDK2.AFInAppEventParameterName.removeCallbacks(aFf1hSDK2.AFInAppEventType);
                            AFf1hSDK aFf1hSDK3 = AFf1hSDK.this;
                            aFf1hSDK3.AFInAppEventParameterName.post(aFf1hSDK3.new AnonymousClass5());
                            AFf1hSDK.this.AFKeystoreWrapper = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.getLevel = 1;
        this.AFLogger$LogLevel = 0L;
        this.afErrorLogForExcManagerOnly = new Runnable() { // from class: com.appsflyer.internal.AFf1hSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFf1hSDK.this.valueOf) {
                    try {
                        if (AFf1hSDK.this.getLevel == 0) {
                            AFf1hSDK.this.getLevel = 1;
                        }
                        AFf1hSDK aFf1hSDK = AFf1hSDK.this;
                        aFf1hSDK.AFInAppEventParameterName.postDelayed(aFf1hSDK.AFInAppEventType, aFf1hSDK.getLevel * 500);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.afRDLog = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    @Override // com.appsflyer.internal.AFf1iSDK
    public final void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.AFVersionDeclaration);
        this.AFInAppEventParameterName.post(this.values);
    }

    @Override // com.appsflyer.internal.AFf1iSDK
    public final synchronized void AFInAppEventType() {
        this.AFInAppEventParameterName.post(this.AFVersionDeclaration);
    }

    @Override // com.appsflyer.internal.AFf1iSDK
    @NonNull
    public final Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        Iterator<Map<String, Object>> it;
        String str;
        String str2;
        Integer num;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
        List<Map<String, Object>> AFKeystoreWrapper = AFKeystoreWrapper();
        String str3 = "sensors";
        String str4 = "na";
        if (AFKeystoreWrapper.isEmpty()) {
            concurrentHashMap3.put("sensors", "na");
            return concurrentHashMap3;
        }
        new AFf1gSDK();
        HashMap hashMap = new HashMap();
        Iterator<Map<String, Object>> it2 = AFKeystoreWrapper.iterator();
        while (true) {
            if (!it2.hasNext()) {
                concurrentHashMap = concurrentHashMap3;
                break;
            }
            Map<String, Object> next = it2.next();
            HashMap hashMap2 = new HashMap();
            boolean z7 = next.get("sVS") != null;
            AFf1gSDK.AFa1xSDK aFa1xSDK = (z7 && (next.get("sVE") != null)) ? AFf1gSDK.AFa1xSDK.ALL : z7 ? AFf1gSDK.AFa1xSDK.FIRST : AFf1gSDK.AFa1xSDK.NONE;
            if (aFa1xSDK == AFf1gSDK.AFa1xSDK.NONE) {
                hashMap = new HashMap();
                hashMap.put("er", str4);
                concurrentHashMap = concurrentHashMap3;
                break;
            }
            Integer num2 = (Integer) next.get("sT");
            String str5 = (String) next.get("sN");
            if (str5 == null) {
                str5 = "uk";
            }
            hashMap2.put("n", str5);
            AFf1gSDK.AFa1zSDK aFa1zSDK = AFf1gSDK.AFa1zSDK.values()[num2.intValue()];
            ArrayList arrayList2 = new ArrayList(AFf1gSDK.AFKeystoreWrapper(next.get("sVS")));
            if (aFa1xSDK == AFf1gSDK.AFa1xSDK.ALL) {
                arrayList2.addAll(AFf1gSDK.AFKeystoreWrapper(next.get("sVE")));
            }
            if (aFa1zSDK == AFf1gSDK.AFa1zSDK.MAGNETOMETER) {
                ArrayList arrayList3 = new ArrayList();
                num = num2;
                BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                DecimalFormat decimalFormat = new DecimalFormat("##.#");
                RoundingMode roundingMode = RoundingMode.DOWN;
                decimalFormat.setRoundingMode(roundingMode);
                arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat.format(valueOf))));
                BigDecimal bigDecimal = (BigDecimal) arrayList2.get(2);
                DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                decimalFormat2.setRoundingMode(roundingMode);
                arrayList3.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat2.format(bigDecimal))));
                ArrayList arrayList4 = new ArrayList();
                it = it2;
                if (arrayList2.size() > 5) {
                    concurrentHashMap2 = concurrentHashMap3;
                    str = str3;
                    str2 = str4;
                    BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                    DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                    decimalFormat3.setRoundingMode(roundingMode);
                    arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat3.format(subtract))));
                    BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                    decimalFormat4.setRoundingMode(roundingMode);
                    arrayList4.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat4.format(subtract2))));
                } else {
                    concurrentHashMap2 = concurrentHashMap3;
                    str = str3;
                    str2 = str4;
                }
                arrayList = new ArrayList();
                arrayList.add(arrayList3);
                arrayList.add(arrayList4);
            } else {
                concurrentHashMap2 = concurrentHashMap3;
                it = it2;
                str = str3;
                str2 = str4;
                num = num2;
                ArrayList arrayList5 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                    DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                    decimalFormat5.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat5.format(subtract3))));
                    BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                    DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                    decimalFormat6.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat6.format(subtract4))));
                    BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                    decimalFormat7.setRoundingMode(roundingMode2);
                    arrayList5.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat7.format(subtract5))));
                }
                ArrayList arrayList6 = new ArrayList();
                BigDecimal bigDecimal2 = (BigDecimal) arrayList2.get(0);
                DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                decimalFormat8.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat8.format(bigDecimal2))));
                BigDecimal bigDecimal3 = (BigDecimal) arrayList2.get(1);
                DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                decimalFormat9.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat9.format(bigDecimal3))));
                BigDecimal bigDecimal4 = (BigDecimal) arrayList2.get(2);
                DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                decimalFormat10.setRoundingMode(roundingMode3);
                arrayList6.add(Double.valueOf(AFc1uSDK.AFa1wSDK.values(decimalFormat10.format(bigDecimal4))));
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(arrayList6);
                arrayList7.add(arrayList5);
                arrayList = arrayList7;
            }
            hashMap2.put("v", arrayList);
            hashMap.put(AFf1gSDK.AFa1vSDK.values()[num.intValue()].values, hashMap2);
            if (aFa1xSDK == AFf1gSDK.AFa1xSDK.FIRST) {
                hashMap.put("er", "no_svs");
            }
            it2 = it;
            concurrentHashMap3 = concurrentHashMap2;
            str3 = str;
            str4 = str2;
        }
        concurrentHashMap.put(str3, hashMap);
        return concurrentHashMap;
    }

    private List<Map<String, Object>> AFKeystoreWrapper() {
        Iterator<AFf1kSDK> it = this.AFLogger.values().iterator();
        while (it.hasNext()) {
            it.next().valueOf(this.afErrorLog, true);
        }
        Map<AFf1kSDK, Map<String, Object>> map = this.afErrorLog;
        return (map == null || map.isEmpty()) ? new CopyOnWriteArrayList(Collections.emptyList()) : new CopyOnWriteArrayList(this.afErrorLog.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i7) {
        return i7 >= 0 && afInfoLog.get(i7);
    }
}
