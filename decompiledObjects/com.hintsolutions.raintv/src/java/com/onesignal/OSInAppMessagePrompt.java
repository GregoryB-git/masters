/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.onesignal;

import com.onesignal.OneSignal;

public abstract class OSInAppMessagePrompt {
    private boolean prompted = false;

    public abstract String getPromptKey();

    public abstract void handlePrompt(OneSignal.OSPromptActionCompletionCallback var1);

    public boolean hasPrompted() {
        return this.prompted;
    }

    public void setPrompted(boolean bl) {
        this.prompted = bl;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("OSInAppMessagePrompt{key=");
        stringBuilder.append(this.getPromptKey());
        stringBuilder.append(" prompted=");
        stringBuilder.append(this.prompted);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

