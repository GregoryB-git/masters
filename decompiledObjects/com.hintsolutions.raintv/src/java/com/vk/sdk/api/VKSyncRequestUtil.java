/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.vk.sdk.api.VKRequest
 *  com.vk.sdk.api.VKSyncRequestUtil$Listener
 *  java.lang.InterruptedException
 *  java.lang.Object
 */
package com.vk.sdk.api;

import androidx.annotation.NonNull;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKSyncRequestUtil;

/*
 * Exception performing whole class analysis ignored.
 */
class VKSyncRequestUtil {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void executeSyncWithListener(@NonNull VKRequest object, @NonNull VKRequest.VKRequestListener vKRequestListener) {
        vKRequestListener = new /* Unavailable Anonymous Inner Class!! */;
        object.setUseLooperForCallListener(false);
        object.executeWithListener(vKRequestListener);
        Object object2 = object = Listener.access$000(vKRequestListener);
        synchronized (object2) {
            boolean bl;
            while (!(bl = Listener.access$100(vKRequestListener))) {
                try {
                    Listener.access$000(vKRequestListener).wait();
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                    continue;
                }
                break;
            }
            return;
        }
    }
}

