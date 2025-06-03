/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestBodyEncryptionMode;

public class NetworkTaskForSendingDataParamsAppender {
    private final RequestBodyEncrypter a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.a = requestBodyEncrypter;
    }

    public void appendCommitHash(Uri.Builder builder, String string, String string2) {
        if (string2 != null && string2.contains((CharSequence)"source") && !TextUtils.isEmpty((CharSequence)string)) {
            builder.appendQueryParameter("commit_hash", string);
        }
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter("encrypted_request", "1");
        }
    }
}

