/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.TimerTask
 */
package com.onesignal;

import com.onesignal.OSDynamicTriggerTimer;
import com.onesignal.OSTrigger;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;

class OSDynamicTriggerController {
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999L;
    private static final double REQUIRED_ACCURACY = 0.3;
    private static Date sessionLaunchTime = new Date();
    private final OSDynamicTriggerControllerObserver observer;
    private final ArrayList<String> scheduledMessages = new ArrayList();

    public OSDynamicTriggerController(OSDynamicTriggerControllerObserver oSDynamicTriggerControllerObserver) {
        this.observer = oSDynamicTriggerControllerObserver;
    }

    private static boolean evaluateTimeIntervalWithOperator(double d, double d2, OSTrigger.OSTriggerOperator oSTriggerOperator) {
        int n = 2.$SwitchMap$com$onesignal$OSTrigger$OSTriggerOperator[oSTriggerOperator.ordinal()];
        boolean bl = true;
        boolean bl2 = true;
        boolean bl3 = true;
        boolean bl4 = true;
        switch (n) {
            default: {
                OneSignal.LOG_LEVEL lOG_LEVEL = OneSignal.LOG_LEVEL.ERROR;
                StringBuilder stringBuilder = z2.t("Attempted to apply an invalid operator on a time-based in-app-message trigger: ");
                stringBuilder.append(oSTriggerOperator.toString());
                OneSignal.onesignalLog(lOG_LEVEL, stringBuilder.toString());
                return false;
            }
            case 6: {
                return OSDynamicTriggerController.roughlyEqual(d, d2) ^ true;
            }
            case 5: {
                return OSDynamicTriggerController.roughlyEqual(d, d2);
            }
            case 4: {
                bl3 = bl4;
                if (!(d2 >= d)) {
                    bl3 = OSDynamicTriggerController.roughlyEqual(d, d2) ? bl4 : false;
                }
                return bl3;
            }
            case 3: {
                bl3 = d2 >= d ? bl : false;
                return bl3;
            }
            case 2: {
                bl3 = bl2;
                if (!(d2 <= d)) {
                    bl3 = OSDynamicTriggerController.roughlyEqual(d, d2) ? bl2 : false;
                }
                return bl3;
            }
            case 1: 
        }
        if (!(d2 < d)) {
            bl3 = false;
        }
        return bl3;
    }

    public static void resetSessionLaunchTime() {
        sessionLaunchTime = new Date();
    }

    private static boolean roughlyEqual(double d, double d2) {
        boolean bl = Math.abs((double)(d - d2)) < 0.3;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean dynamicTriggerShouldFire(OSTrigger object) {
        ArrayList<String> arrayList;
        if (object.value == null) {
            return false;
        }
        ArrayList<String> arrayList2 = arrayList = this.scheduledMessages;
        synchronized (arrayList2) {
            long l;
            Object object2;
            long l2;
            block12: {
                block14: {
                    block10: {
                        Date date;
                        block13: {
                            block11: {
                                if (!(object.value instanceof Number)) {
                                    return false;
                                }
                                int n = 2.$SwitchMap$com$onesignal$OSTrigger$OSTriggerKind[object.kind.ordinal()];
                                if (n == 1) break block10;
                                if (n == 2) break block11;
                                l2 = 0L;
                                break block12;
                            }
                            if (OneSignal.getInAppMessageController().isInAppMessageShowing()) {
                                return false;
                            }
                            date = OneSignal.getInAppMessageController().lastTimeInAppDismissed;
                            if (date != null) break block13;
                            l2 = 999999L;
                            break block12;
                        }
                        object2 = new Date();
                        l = object2.getTime();
                        l2 = date.getTime();
                        break block14;
                    }
                    object2 = new Date();
                    l = object2.getTime();
                    l2 = sessionLaunchTime.getTime();
                }
                l2 = l - l2;
            }
            object2 = object.triggerId;
            l = (long)(((Number)object.value).doubleValue() * 1000.0);
            if (OSDynamicTriggerController.evaluateTimeIntervalWithOperator(l, l2, object.operatorType)) {
                this.observer.messageDynamicTriggerCompleted((String)object2);
                return true;
            }
            if ((l2 = l - l2) <= 0L) {
                return false;
            }
            if (this.scheduledMessages.contains(object2)) {
                return false;
            }
            object = new TimerTask(this, (String)object2){
                public final OSDynamicTriggerController this$0;
                public final String val$triggerId;
                {
                    this.this$0 = oSDynamicTriggerController;
                    this.val$triggerId = string2;
                }

                public void run() {
                    this.this$0.scheduledMessages.remove((Object)this.val$triggerId);
                    this.this$0.observer.messageTriggerConditionChanged();
                }
            };
            OSDynamicTriggerTimer.scheduleTrigger((TimerTask)object, (String)object2, l2);
            this.scheduledMessages.add(object2);
            return false;
        }
    }

    public static interface OSDynamicTriggerControllerObserver {
        public void messageDynamicTriggerCompleted(String var1);

        public void messageTriggerConditionChanged();
    }
}

