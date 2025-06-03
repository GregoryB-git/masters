/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.afollestad.materialdialogs;

public final class StackingBehavior
extends Enum<StackingBehavior> {
    private static final StackingBehavior[] $VALUES;
    public static final /* enum */ StackingBehavior ADAPTIVE;
    public static final /* enum */ StackingBehavior ALWAYS;
    public static final /* enum */ StackingBehavior NEVER;

    static {
        StackingBehavior stackingBehavior;
        StackingBehavior stackingBehavior2;
        StackingBehavior stackingBehavior3;
        ALWAYS = stackingBehavior3 = new StackingBehavior();
        ADAPTIVE = stackingBehavior2 = new StackingBehavior();
        NEVER = stackingBehavior = new StackingBehavior();
        $VALUES = new StackingBehavior[]{stackingBehavior3, stackingBehavior2, stackingBehavior};
    }

    public static StackingBehavior valueOf(String string2) {
        return (StackingBehavior)Enum.valueOf(StackingBehavior.class, (String)string2);
    }

    public static StackingBehavior[] values() {
        return (StackingBehavior[])$VALUES.clone();
    }
}

