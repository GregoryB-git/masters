/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.OSInAppMessageInternal
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DecimalFormat
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.onesignal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.OSDynamicTriggerController;
import com.onesignal.OSInAppMessageInternal;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class OSTriggerController {
    public OSDynamicTriggerController dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers = new ConcurrentHashMap();

    public OSTriggerController(OSDynamicTriggerController.OSDynamicTriggerControllerObserver oSDynamicTriggerControllerObserver) {
        this.dynamicTriggerController = new OSDynamicTriggerController(oSDynamicTriggerControllerObserver);
    }

    private boolean evaluateAndTriggers(@NonNull ArrayList<OSTrigger> iterator) {
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            if (this.evaluateTrigger((OSTrigger)iterator.next())) continue;
            return false;
        }
        return true;
    }

    private boolean evaluateTrigger(@NonNull OSTrigger oSTrigger) {
        Object object;
        Object object2 = oSTrigger.kind;
        Enum enum_ = OSTrigger.OSTriggerKind.UNKNOWN;
        boolean bl = false;
        boolean bl2 = false;
        if (object2 == enum_) {
            return false;
        }
        if (object2 != OSTrigger.OSTriggerKind.CUSTOM) {
            return this.dynamicTriggerController.dynamicTriggerShouldFire(oSTrigger);
        }
        enum_ = oSTrigger.operatorType;
        object2 = this.triggers.get((Object)oSTrigger.property);
        if (object2 == null) {
            if (enum_ == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
                return true;
            }
            boolean bl3 = bl2;
            if (enum_ == OSTrigger.OSTriggerOperator.NOT_EQUAL_TO) {
                bl3 = bl2;
                if (oSTrigger.value != null) {
                    bl3 = true;
                }
            }
            return bl3;
        }
        if (enum_ == OSTrigger.OSTriggerOperator.EXISTS) {
            return true;
        }
        if (enum_ == OSTrigger.OSTriggerOperator.NOT_EXISTS) {
            return false;
        }
        if (enum_ == OSTrigger.OSTriggerOperator.CONTAINS) {
            boolean bl4 = bl;
            if (object2 instanceof Collection) {
                bl4 = bl;
                if (((Collection)object2).contains(oSTrigger.value)) {
                    bl4 = true;
                }
            }
            return bl4;
        }
        if (object2 instanceof String && (object = oSTrigger.value) instanceof String && this.triggerMatchesStringValue((String)object, (String)object2, (OSTrigger.OSTriggerOperator)enum_)) {
            return true;
        }
        object = oSTrigger.value;
        if (object instanceof Number && object2 instanceof Number && this.triggerMatchesNumericValue((Number)object, (Number)object2, (OSTrigger.OSTriggerOperator)enum_)) {
            return true;
        }
        return this.triggerMatchesFlex(oSTrigger.value, object2, (OSTrigger.OSTriggerOperator)enum_);
    }

    private boolean triggerMatchesFlex(@Nullable Object object, @NonNull Object object2, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        if (object == null) {
            return false;
        }
        if (oSTriggerOperator.checksEquality()) {
            String string2 = object.toString();
            object = object2.toString();
            if (object2 instanceof Number) {
                object = new DecimalFormat("0.#").format(object2);
            }
            return this.triggerMatchesStringValue(string2, (String)object, oSTriggerOperator);
        }
        if (object2 instanceof String && object instanceof Number) {
            return this.triggerMatchesNumericValueFlex((Number)object, (String)object2, oSTriggerOperator);
        }
        return false;
    }

    private boolean triggerMatchesNumericValue(@NonNull Number number, @NonNull Number object, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double d = number.doubleValue();
        double d2 = object.doubleValue();
        int n = 1.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        boolean bl5 = true;
        boolean bl6 = true;
        switch (n) {
            default: {
                return false;
            }
            case 9: {
                n = d2 == d ? 0 : (d2 > d ? 1 : -1);
                bl5 = bl6;
                if (n <= 0) {
                    bl5 = n == 0 ? bl6 : false;
                }
                return bl5;
            }
            case 8: {
                bl5 = bl;
                if (!(d2 < d)) {
                    bl5 = d2 == d ? bl : false;
                }
                return bl5;
            }
            case 7: {
                bl5 = d2 > d ? bl2 : false;
                return bl5;
            }
            case 6: {
                bl5 = d2 < d ? bl3 : false;
                return bl5;
            }
            case 3: 
            case 4: 
            case 5: {
                object = OneSignal.LOG_LEVEL.ERROR;
                number = z2.t("Attempted to use an invalid operator with a numeric value: ");
                number.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), number.toString());
                return false;
            }
            case 2: {
                bl5 = d2 != d ? bl4 : false;
                return bl5;
            }
            case 1: 
        }
        if (d2 != d) {
            bl5 = false;
        }
        return bl5;
    }

    private boolean triggerMatchesNumericValueFlex(@NonNull Number number, @NonNull String string2, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        double d;
        try {
            d = Double.parseDouble((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
        return this.triggerMatchesNumericValue((Number)Double.valueOf((double)number.doubleValue()), (Number)Double.valueOf((double)d), oSTriggerOperator);
    }

    private boolean triggerMatchesStringValue(@NonNull String string2, @NonNull String object, @NonNull OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int n = 1.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        if (n != 1) {
            if (n != 2) {
                object = OneSignal.LOG_LEVEL.ERROR;
                string2 = z2.t("Attempted to use an invalid operator for a string trigger comparison: ");
                string2.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog((OneSignal.LOG_LEVEL)((Object)object), string2.toString());
                return false;
            }
            return string2.equals(object) ^ true;
        }
        return string2.equals(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addTriggers(Map<String, Object> map) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                Object object = map.get((Object)string2);
                this.triggers.put((Object)string2, object);
            }
            return;
        }
    }

    public boolean evaluateMessageTriggers(@NonNull OSInAppMessageInternal oSInAppMessageInternal) {
        if (oSInAppMessageInternal.triggers.size() == 0) {
            return true;
        }
        oSInAppMessageInternal = oSInAppMessageInternal.triggers.iterator();
        while (oSInAppMessageInternal.hasNext()) {
            if (!this.evaluateAndTriggers((ArrayList<OSTrigger>)((ArrayList)oSInAppMessageInternal.next()))) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public Object getTriggerValue(String object) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            if (!this.triggers.containsKey(object)) return null;
            return this.triggers.get(object);
        }
    }

    public ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    public boolean isTriggerOnMessage(OSInAppMessageInternal oSInAppMessageInternal, Collection<String> object2) {
        if (oSInAppMessageInternal.triggers == null) {
            return false;
        }
        for (String string2 : object2) {
            Iterator iterator = oSInAppMessageInternal.triggers.iterator();
            while (iterator.hasNext()) {
                for (Object object2 : (ArrayList)iterator.next()) {
                    if (!string2.equals((Object)object2.property) && !string2.equals((Object)object2.triggerId)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean messageHasOnlyDynamicTriggers(OSInAppMessageInternal oSInAppMessageInternal) {
        ArrayList arrayList = oSInAppMessageInternal.triggers;
        if (arrayList != null && !arrayList.isEmpty()) {
            oSInAppMessageInternal = oSInAppMessageInternal.triggers.iterator();
            while (oSInAppMessageInternal.hasNext()) {
                arrayList = ((ArrayList)oSInAppMessageInternal.next()).iterator();
                while (arrayList.hasNext()) {
                    OSTrigger.OSTriggerKind oSTriggerKind = ((OSTrigger)arrayList.next()).kind;
                    if (oSTriggerKind != OSTrigger.OSTriggerKind.CUSTOM && oSTriggerKind != OSTrigger.OSTriggerKind.UNKNOWN) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeTriggersForKeys(Collection<String> object) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap = this.triggers;
        synchronized (concurrentHashMap2) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                this.triggers.remove(object);
            }
            return;
        }
    }
}

