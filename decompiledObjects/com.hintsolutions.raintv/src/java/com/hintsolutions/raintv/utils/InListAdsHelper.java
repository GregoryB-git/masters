/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  tvrain.managers.UserManager
 */
package com.hintsolutions.raintv.utils;

import tvrain.managers.UserManager;

public class InListAdsHelper {
    private boolean isTablet;
    private Boolean userIsSubscribed = Boolean.TRUE;
    private UserManager userManager;

    public void destroy() {
        if (this.userManager != null) {
            this.userManager = null;
        }
    }

    public boolean isNoAds() {
        return this.userManager.isNoAds();
    }

    public void makeGoogleAdsRequest() {
    }
}

