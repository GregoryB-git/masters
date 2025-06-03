/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  ru.tvrain.core.data.Program
 *  ru.tvrain.core.data.RainUser
 *  tvrain.analytics.tagmanager.TagManager
 */
package com.hintsolutions.raintv.interfaces;

import ru.tvrain.core.data.Program;
import ru.tvrain.core.data.RainUser;
import tvrain.analytics.tagmanager.TagManager;

public interface ActivityInterface {
    public String getAuthorization();

    public TagManager getTagManager();

    public RainUser getUser();

    public String getUserId();

    public boolean isAuthorized();

    public boolean isRCAuthorized();

    public boolean isTablet();

    public void showRCAuthDialog();

    public void toggleProgramFav(Program var1, boolean var2, Runnable var3);
}

