/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.OSSMSSubscriptionState;
import com.onesignal.OSSMSSubscriptionStateChanges;
import com.onesignal.OneSignal;

class OSSMSSubscriptionChangedInternalObserver {
    public static void fireChangesToPublicObserver(OSSMSSubscriptionState oSSMSSubscriptionState) {
        OSSMSSubscriptionStateChanges oSSMSSubscriptionStateChanges = new OSSMSSubscriptionStateChanges(OneSignal.lastSMSSubscriptionState, (OSSMSSubscriptionState)oSSMSSubscriptionState.clone());
        if (OneSignal.getSMSSubscriptionStateChangesObserver().notifyChange(oSSMSSubscriptionStateChanges)) {
            OneSignal.lastSMSSubscriptionState = oSSMSSubscriptionState = (OSSMSSubscriptionState)oSSMSSubscriptionState.clone();
            oSSMSSubscriptionState.persistAsFrom();
        }
    }

    public void changed(OSSMSSubscriptionState oSSMSSubscriptionState) {
        OSSMSSubscriptionChangedInternalObserver.fireChangesToPublicObserver(oSSMSSubscriptionState);
    }
}

