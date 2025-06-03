/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.UnsatisfiedLinkError
 */
package com.scottyab.rootbeer;

import com.scottyab.rootbeer.util.QLog;

public class RootBeerNative {
    private static boolean libraryLoaded;

    static {
        try {
            System.loadLibrary((String)"toolChecker");
            libraryLoaded = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            QLog.e((Object)unsatisfiedLinkError);
        }
    }

    public native int checkForRoot(Object[] var1);

    public native int setLogDebugMessages(boolean var1);

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}

