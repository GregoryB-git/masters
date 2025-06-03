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

class OSInAppMessageLocationPrompt
extends OSInAppMessagePrompt {
    public static final String LOCATION_PROMPT_KEY = "location";

    @Override
    public String getPromptKey() {
        return LOCATION_PROMPT_KEY;
    }

    @Override
    public void handlePrompt(OneSignal.OSPromptActionCompletionCallback oSPromptActionCompletionCallback) {
        OneSignal.promptLocation(oSPromptActionCompletionCallback, true);
    }
}

