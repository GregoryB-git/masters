/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package com.yandex.authsdk;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Arrays;

public class YandexAuthException
extends Exception {
    public static final String CONNECTION_ERROR = "connection.error";
    public static final String JWT_AUTHORIZATION_ERROR = "jwt.authorization.error";
    public static final String OAUTH_TOKEN_ERROR = "oauth_token.invalid";
    public static final String SECURITY_ERROR = "security.error";
    @NonNull
    private final String[] errors;

    public YandexAuthException(@NonNull IOException iOException) {
        super(CONNECTION_ERROR, (Throwable)iOException);
        this.errors = new String[]{CONNECTION_ERROR};
    }

    public YandexAuthException(@NonNull String string2) {
        this(new String[]{string2});
    }

    public YandexAuthException(@NonNull String[] stringArray) {
        super(Arrays.toString((Object[])stringArray));
        this.errors = stringArray;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (YandexAuthException)((Object)object);
            return Arrays.equals((Object[])this.errors, (Object[])((YandexAuthException)((Object)object)).errors);
        }
        return false;
    }

    @NonNull
    public String[] getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.errors);
    }
}

