/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.onesignal;

import com.onesignal.OSInAppMessagePrompt;
import com.onesignal.OneSignal;
import com.onesignal.a;

public class OSInAppMessagePushPrompt
extends OSInAppMessagePrompt {
    public static final String PUSH_PROMPT_KEY = "push";

    public static /* synthetic */ void a(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback, boolean bl) {
        OSInAppMessagePushPrompt.lambda$handlePrompt$0(oSPromptActionCompletionCallback, bl);
    }

    private static /* synthetic */ void lambda$handlePrompt$0(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback, boolean bl) {
        OneSignal.PromptActionResult promptActionResult = bl ? OneSignal.PromptActionResult.PERMISSION_GRANTED : OneSignal.PromptActionResult.PERMISSION_DENIED;
        oSPromptActionCompletionCallback.onCompleted(promptActionResult);
    }

    @Override
    public String getPromptKey() {
        return PUSH_PROMPT_KEY;
    }

    @Override
    public void handlePrompt(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback) {
        OneSignal.promptForPushNotifications(true, new a(oSPromptActionCompletionCallback));
    }
}

