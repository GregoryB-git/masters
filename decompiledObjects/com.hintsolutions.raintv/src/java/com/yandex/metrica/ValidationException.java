/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;

public class ValidationException
extends IllegalArgumentException {
    public ValidationException(@NonNull String string2) {
        super(string2);
    }
}

