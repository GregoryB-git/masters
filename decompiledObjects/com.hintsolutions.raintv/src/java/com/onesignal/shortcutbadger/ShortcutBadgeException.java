/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.onesignal.shortcutbadger;

public class ShortcutBadgeException
extends Exception {
    public ShortcutBadgeException(String string2) {
        super(string2);
    }

    public ShortcutBadgeException(String string2, Exception exception) {
        super(string2, (Throwable)exception);
    }
}

