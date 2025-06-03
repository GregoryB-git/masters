/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.String
 */
package com.scottyab.rootbeer.util;

public final class Utils {
    private Utils() throws InstantiationException {
        throw new InstantiationException("This class is not for instantiation");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean isSelinuxFlagInEnabled() {
        boolean bl = false;
        try {
            Class clazz = Class.forName((String)"android.os.SystemProperties");
            return "1".equals((Object)((String)clazz.getMethod("get", new Class[]{String.class}).invoke((Object)clazz, new Object[]{"ro.build.selinux"})));
        }
        catch (Exception exception) {
            return bl;
        }
    }
}

