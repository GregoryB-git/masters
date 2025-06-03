/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.onesignal;

import com.onesignal.OSInAppMessagePushPrompt;
import com.onesignal.OneSignal;

public final class a
implements OneSignal.PromptForPushNotificationPermissionResponseHandler {
    public final OneSignal.OSPromptActionCompletionCallback a;

    public /* synthetic */ a(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback) {
        this.a = oSPromptActionCompletionCallback;
    }

    @Override
    public final void response(boolean bl) {
        OSInAppMessagePushPrompt.a(this.a, bl);
    }
}

