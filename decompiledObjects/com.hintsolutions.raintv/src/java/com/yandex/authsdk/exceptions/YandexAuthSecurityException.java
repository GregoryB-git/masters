/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.SecurityException
 */
package com.yandex.authsdk.exceptions;

import androidx.annotation.NonNull;
import com.yandex.authsdk.YandexAuthException;

public class YandexAuthSecurityException
extends YandexAuthException {
    public YandexAuthSecurityException(@NonNull SecurityException securityException) {
        super("security.error");
    }
}

