/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.afollestad.materialdialogs;

public final class Theme
extends Enum<Theme> {
    private static final Theme[] $VALUES;
    public static final /* enum */ Theme DARK;
    public static final /* enum */ Theme LIGHT;

    static {
        Theme theme;
        Theme theme2;
        LIGHT = theme2 = new Theme();
        DARK = theme = new Theme();
        $VALUES = new Theme[]{theme2, theme};
    }

    public static Theme valueOf(String string2) {
        return (Theme)Enum.valueOf(Theme.class, (String)string2);
    }

    public static Theme[] values() {
        return (Theme[])$VALUES.clone();
    }
}

