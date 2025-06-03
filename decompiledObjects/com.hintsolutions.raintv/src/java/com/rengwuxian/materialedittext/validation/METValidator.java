/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.rengwuxian.materialedittext.validation;

import androidx.annotation.NonNull;

public abstract class METValidator {
    public String errorMessage;

    public METValidator(@NonNull String string2) {
        this.errorMessage = string2;
    }

    @NonNull
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public abstract boolean isValid(@NonNull CharSequence var1, boolean var2);

    public void setErrorMessage(@NonNull String string2) {
        this.errorMessage = string2;
    }
}

