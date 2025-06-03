/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.OneSignalStateSynchronizer
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.BadgeCountUpdater;
import com.onesignal.OSPermissionState;
import com.onesignal.OSPermissionStateChanges;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;

class OSPermissionChangedInternalObserver {
    public static void fireChangesToPublicObserver(OSPermissionState oSPermissionState) {
        OSPermissionStateChanges oSPermissionStateChanges = new OSPermissionStateChanges(OneSignal.lastPermissionState, (OSPermissionState)oSPermissionState.clone());
        if (OneSignal.getPermissionStateChangesObserver().notifyChange(oSPermissionStateChanges)) {
            OneSignal.lastPermissionState = oSPermissionState = (OSPermissionState)oSPermissionState.clone();
            oSPermissionState.persistAsFrom();
        }
    }

    public static void handleInternalChanges(OSPermissionState oSPermissionState) {
        if (!oSPermissionState.areNotificationsEnabled()) {
            BadgeCountUpdater.updateCount(0, OneSignal.appContext);
        }
        OneSignalStateSynchronizer.setPermission((boolean)OneSignal.areNotificationsEnabledForSubscribedState());
    }

    public void changed(OSPermissionState oSPermissionState) {
        OSPermissionChangedInternalObserver.handleInternalChanges(oSPermissionState);
        OSPermissionChangedInternalObserver.fireChangesToPublicObserver(oSPermissionState);
    }
}

