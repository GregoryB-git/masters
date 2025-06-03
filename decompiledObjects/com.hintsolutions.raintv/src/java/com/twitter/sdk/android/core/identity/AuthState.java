/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.util.concurrent.atomic.AtomicReference;

class AuthState {
    public final AtomicReference<AuthHandler> authHandlerRef = new AtomicReference(null);

    public boolean beginAuthorize(Activity atomicReference, AuthHandler authHandler) {
        boolean bl = this.isAuthorizeInProgress();
        boolean bl2 = false;
        boolean bl3 = false;
        if (bl) {
            Twitter.getLogger().w("Twitter", "Authorize already in progress");
        } else if (authHandler.authorize((Activity)atomicReference)) {
            atomicReference = this.authHandlerRef;
            do {
                if (!atomicReference.compareAndSet(null, (Object)authHandler)) continue;
                bl3 = true;
                break;
            } while (atomicReference.get() == null);
            bl2 = bl3;
            if (!bl3) {
                Twitter.getLogger().w("Twitter", "Failed to update authHandler, authorize already in progress.");
                bl2 = bl3;
            }
        }
        return bl2;
    }

    public void endAuthorize() {
        this.authHandlerRef.set(null);
    }

    public AuthHandler getAuthHandler() {
        return (AuthHandler)this.authHandlerRef.get();
    }

    public boolean isAuthorizeInProgress() {
        boolean bl = this.authHandlerRef.get() != null;
        return bl;
    }
}

