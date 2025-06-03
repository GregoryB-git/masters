/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  com.amazon.device.messaging.ADMMessageHandlerJobBase
 *  com.onesignal.ADMMessageHandlerJob$onMessage$bundleReceiverCallback$1
 *  com.onesignal.PushRegistratorADM
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.ADMMessageHandlerJob;
import com.onesignal.NotificationBundleProcessor;
import com.onesignal.OneSignal;
import com.onesignal.PushRegistratorADM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0014J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0014\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "()V", "onMessage", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onRegistered", "newRegistrationId", "", "onRegistrationError", "error", "onUnregistered", "registrationId", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class ADMMessageHandlerJob
extends ADMMessageHandlerJobBase {
    public void onMessage(@Nullable Context context, @Nullable Intent object) {
        object = object == null ? null : object.getExtras();
        NotificationBundleProcessor.processBundleFromReceiver(context, (Bundle)object, (NotificationBundleProcessor.ProcessBundleReceiverCallback)new onMessage.bundleReceiverCallback.1((Bundle)object, context));
    }

    public void onRegistered(@Nullable Context context, @Nullable String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, Intrinsics.stringPlus((String)"ADM registration ID: ", (Object)string2));
        PushRegistratorADM.fireCallback((String)string2);
    }

    public void onRegistrationError(@Nullable Context object, @Nullable String string2) {
        object = OneSignal.LOG_LEVEL.ERROR;
        OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), Intrinsics.stringPlus((String)"ADM:onRegistrationError: ", (Object)string2));
        if (Intrinsics.areEqual((Object)"INVALID_SENDER", (Object)string2)) {
            OneSignal.Log((OneSignal.LOG_LEVEL)((Object)object), "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        PushRegistratorADM.fireCallback(null);
    }

    public void onUnregistered(@Nullable Context context, @Nullable String string2) {
        OneSignal.Log(OneSignal.LOG_LEVEL.INFO, Intrinsics.stringPlus((String)"ADM:onUnregistered: ", (Object)string2));
    }
}

