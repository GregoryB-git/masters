/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.authsdk.exceptions.YandexAuthInteractionException
 *  com.yandex.authsdk.exceptions.YandexAuthSecurityException
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.authsdk.internal.provider;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.authsdk.YandexAuthAccount;
import com.yandex.authsdk.exceptions.YandexAuthInteractionException;
import com.yandex.authsdk.exceptions.YandexAuthSecurityException;
import com.yandex.authsdk.internal.Util;
import java.util.ArrayList;
import java.util.List;

public class ProviderClient {
    private static final String ACCOUNT_KEY_PREFIX = "account-";
    private static final String KEY_ACCOUNTS_COUNT = "com.yandex.auth.ACCOUNTS_COUNT";
    private static final String KEY_SUFFIX_AVATAR_URL = "com.yandex.auth.AVATAR_URL";
    private static final String KEY_SUFFIX_IS_AVATAR_EMPTY = "com.yandex.auth.IS_AVATAR_EMPTY";
    private static final String KEY_SUFFIX_PRIMARY_DISPLAY_NAME = "com.yandex.auth.PRIMARY_DISPLAY_NAME";
    private static final String KEY_SUFFIX_SECONDARY_DISPLAY_NAME = "com.yandex.auth.SECONDARY_DISPLAY_NAME";
    private static final String KEY_SUFFIX_UID_VALUE = "com.yandex.auth.UID_VALUE";
    private static final String SEPARATOR = "-";
    @NonNull
    private final Context context;
    private final int sdkVersion;
    @NonNull
    private final Uri uri;

    public ProviderClient(@NonNull Context context, @NonNull String string2, int n) {
        this.context = context;
        context = new StringBuilder();
        context.append("content://com.yandex.passport.authsdk.provider.");
        context.append(string2);
        this.uri = Uri.parse((String)context.toString());
        this.sdkVersion = n;
    }

    @NonNull
    private List<YandexAuthAccount> accountsFromBundle(@NonNull Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        int n = bundle.getInt(KEY_ACCOUNTS_COUNT);
        for (int k = 0; k < n; ++k) {
            Object object = new StringBuilder();
            object.append(ACCOUNT_KEY_PREFIX);
            object.append(k);
            object.append(SEPARATOR);
            object.append(KEY_SUFFIX_UID_VALUE);
            long l2 = bundle.getLong(object.toString());
            object = new StringBuilder();
            object.append(ACCOUNT_KEY_PREFIX);
            object.append(k);
            object.append(SEPARATOR);
            object.append(KEY_SUFFIX_PRIMARY_DISPLAY_NAME);
            object = Util.checkNotNull(bundle.getString(object.toString()));
            Object object2 = new StringBuilder();
            object2.append(ACCOUNT_KEY_PREFIX);
            object2.append(k);
            object2.append(SEPARATOR);
            object2.append(KEY_SUFFIX_SECONDARY_DISPLAY_NAME);
            object2 = bundle.getString(object2.toString());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ACCOUNT_KEY_PREFIX);
            stringBuilder.append(k);
            stringBuilder.append(SEPARATOR);
            stringBuilder.append(KEY_SUFFIX_IS_AVATAR_EMPTY);
            boolean bl = bundle.getBoolean(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append(ACCOUNT_KEY_PREFIX);
            stringBuilder.append(k);
            stringBuilder.append(SEPARATOR);
            stringBuilder.append(KEY_SUFFIX_AVATAR_URL);
            arrayList.add((Object)new YandexAuthAccount(l2, (String)object, (String)object2, bl, bundle.getString(stringBuilder.toString())));
        }
        return arrayList;
    }

    @NonNull
    private Bundle call(@NonNull Method method, @Nullable String string2, @Nullable Bundle bundle) throws YandexAuthSecurityException, YandexAuthInteractionException {
        block2: {
            try {
                method = this.context.getContentResolver().call(this.uri, method.name(), string2, bundle);
                if (method == null) break block2;
                return method;
            }
            catch (SecurityException securityException) {
                throw new YandexAuthSecurityException(securityException);
            }
        }
        throw new YandexAuthInteractionException("Unsuccessful request to content provider");
    }

    @NonNull
    public List<YandexAuthAccount> getAccounts() throws YandexAuthSecurityException, YandexAuthInteractionException {
        if (this.sdkVersion >= 2) {
            return this.accountsFromBundle(this.call(Method.GetAccounts, null, null));
        }
        throw new YandexAuthInteractionException("Method not supported");
    }

    public static final class Method
    extends Enum<Method> {
        private static final Method[] $VALUES;
        public static final /* enum */ Method GetAccounts;

        static {
            Method method;
            GetAccounts = method = new Method();
            $VALUES = new Method[]{method};
        }

        public static Method valueOf(String string2) {
            return (Method)Enum.valueOf(Method.class, (String)string2);
        }

        public static Method[] values() {
            return (Method[])$VALUES.clone();
        }
    }
}

