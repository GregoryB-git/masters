/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.afollestad.materialdialogs;

public final class DialogAction
extends Enum<DialogAction> {
    private static final DialogAction[] $VALUES;
    public static final /* enum */ DialogAction NEGATIVE;
    public static final /* enum */ DialogAction NEUTRAL;
    public static final /* enum */ DialogAction POSITIVE;

    static {
        DialogAction dialogAction;
        DialogAction dialogAction2;
        DialogAction dialogAction3;
        POSITIVE = dialogAction3 = new DialogAction();
        NEUTRAL = dialogAction2 = new DialogAction();
        NEGATIVE = dialogAction = new DialogAction();
        $VALUES = new DialogAction[]{dialogAction3, dialogAction2, dialogAction};
    }

    public static DialogAction valueOf(String string2) {
        return (DialogAction)Enum.valueOf(DialogAction.class, (String)string2);
    }

    public static DialogAction[] values() {
        return (DialogAction[])$VALUES.clone();
    }
}

