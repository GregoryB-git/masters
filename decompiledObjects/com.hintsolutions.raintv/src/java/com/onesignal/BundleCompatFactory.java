/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.BundleCompatPersistableBundle
 *  java.lang.Object
 */
package com.onesignal;

import com.onesignal.BundleCompat;
import com.onesignal.BundleCompatPersistableBundle;

class BundleCompatFactory {
    public static BundleCompat getInstance() {
        return new BundleCompatPersistableBundle();
    }
}

