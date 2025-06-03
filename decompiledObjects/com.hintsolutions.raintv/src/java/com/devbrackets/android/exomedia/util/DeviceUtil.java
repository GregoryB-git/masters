/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  android.os.Build
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedList
 *  java.util.List
 */
package com.devbrackets.android.exomedia.util;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;

public class DeviceUtil {
    public static final List<NonCompatibleDevice> NON_COMPATIBLE_DEVICES;

    static {
        LinkedList linkedList;
        NON_COMPATIBLE_DEVICES = linkedList = new LinkedList();
        linkedList.add((Object)new NonCompatibleDevice("Amazon"));
    }

    public boolean isDeviceTV(Context context) {
        boolean bl = (context = (UiModeManager)context.getSystemService("uimode")) != null && context.getCurrentModeType() == 4;
        return bl;
    }

    public boolean isNotCompatible(@NonNull List<NonCompatibleDevice> iterator) {
        for (NonCompatibleDevice nonCompatibleDevice : iterator) {
            if (!Build.MANUFACTURER.equalsIgnoreCase(nonCompatibleDevice.getManufacturer())) continue;
            if (nonCompatibleDevice.ignoreModel()) {
                return true;
            }
            if (!Build.DEVICE.equalsIgnoreCase(nonCompatibleDevice.getModel())) continue;
            return true;
        }
        return false;
    }

    public boolean supportsExoPlayer(@NonNull Context context) {
        boolean bl = this.isNotCompatible(NON_COMPATIBLE_DEVICES);
        boolean bl2 = true;
        if (!bl) {
            return true;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Amazon")) {
            this.isDeviceTV(context);
        } else {
            bl2 = false;
        }
        return bl2;
    }

    public static class NonCompatibleDevice {
        private boolean ignoreModel;
        private final String manufacturer;
        private final String model;

        public NonCompatibleDevice(@NonNull String string2) {
            this.manufacturer = string2;
            this.model = null;
            this.ignoreModel = true;
        }

        public NonCompatibleDevice(@NonNull String string2, @NonNull String string3) {
            this.model = string2;
            this.manufacturer = string3;
        }

        public String getManufacturer() {
            return this.manufacturer;
        }

        public String getModel() {
            return this.model;
        }

        public boolean ignoreModel() {
            return this.ignoreModel;
        }
    }
}

