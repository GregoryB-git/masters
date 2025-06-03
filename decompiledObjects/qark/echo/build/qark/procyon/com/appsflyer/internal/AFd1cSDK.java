// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import android.view.View;

public final class AFd1cSDK
{
    private static long AFKeystoreWrapper = 0L;
    private static int valueOf = 0;
    private static int values = 1;
    
    static {
        valueOf();
        View.resolveSize(0, 0);
        final int n = AFd1cSDK.valueOf + 39;
        AFd1cSDK.values = n % 128;
        if (n % 2 != 0) {
            return;
        }
        throw null;
    }
    
    private static void AFKeystoreWrapper(String afInAppEventParameterName, int n, final Object[] array) {
        Object charArray = afInAppEventParameterName;
        if (afInAppEventParameterName != null) {
            charArray = afInAppEventParameterName.toCharArray();
        }
        final char[] array2 = (char[])charArray;
        afInAppEventParameterName = (String)AFg1rSDK.AFInAppEventParameterName;
        // monitorenter(afInAppEventParameterName)
        while (true) {
            try {
                final char[] afInAppEventType = AFg1rSDK.AFInAppEventType(AFd1cSDK.AFKeystoreWrapper, array2, n);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    n = AFg1rSDK.AFInAppEventType;
                    if (n >= afInAppEventType.length) {
                        break;
                    }
                    AFg1rSDK.AFKeystoreWrapper = n - 4;
                    n = AFg1rSDK.AFInAppEventType;
                    afInAppEventType[n] = (char)((long)(afInAppEventType[n] ^ afInAppEventType[n % 4]) ^ AFg1rSDK.AFKeystoreWrapper * AFd1cSDK.AFKeystoreWrapper);
                    ++AFg1rSDK.AFInAppEventType;
                }
                final String s = new String(afInAppEventType, 4, afInAppEventType.length - 4);
                // monitorexit(afInAppEventParameterName)
                array[0] = s;
                return;
                // monitorexit(afInAppEventParameterName)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void valueOf() {
        AFd1cSDK.AFKeystoreWrapper = -4836734234935930684L;
    }
    
    @NonNull
    private static AFf1xSDK values(@NonNull final AFe1qSDK aFe1qSDK, final String obj, @NonNull String string, @NonNull String str) {
        boolean b = false;
        if (obj == null) {
            if (aFe1qSDK.values == AFe1aSDK.AFInAppEventType) {
                b = true;
            }
            return new AFf1xSDK(b, AFf1wSDK.valueOf);
        }
        final int packedPositionType = ExpandableListView.getPackedPositionType(0L);
        final Object[] array = { null };
        AFKeystoreWrapper("\u12c5\uedd1\u12f6\ueb9a\ude6e\ubd26\u4a25\u2c11\u51e6\u7e33\u0f35\ueb04\u94d6\u3b0c\ucc05\ua63b\udbc7\uf411\u8116\u6520\u1eb7\ub0e3\u4666\u20d7\u5da7\u4dfc\u1b76\u9fca\u8091\u0ec5\ud846\u5a86\uc783\ucbd6\u9d57\u19e3\u0a73\u84a3\u51a7\ud496\u4963\u41c4\u16b7\u9385\u8c53\u02f0\uab87\u4ec3\uf342\udf94\u6891\u0da6\u3632\u9861\u2de1\uc955\u7522\u5572\ue2f0\u8443\ub812\u1634\ua7c0\u4377\uff01\ud356\u64d0\u3e13", packedPositionType, array);
        final String intern = ((String)array[0]).intern();
        if (aFe1qSDK.values == AFe1aSDK.AFKeystoreWrapper) {
            string = new StringBuilder(string).reverse().toString();
        }
        else {
            string = "";
            str = intern;
        }
        final boolean equals = values(new StringBuilder(str).reverse().toString(), aFe1qSDK.AFInAppEventType, "android", "v1", string).equals(obj);
        AFf1wSDK aFf1wSDK;
        if (equals) {
            aFf1wSDK = AFf1wSDK.AFInAppEventParameterName;
        }
        else {
            aFf1wSDK = AFf1wSDK.AFKeystoreWrapper;
        }
        return new AFf1xSDK(equals, aFf1wSDK);
    }
    
    private static String values(String s, String s2, final String s3, final String s4, final String s5) {
        final int n = AFd1cSDK.valueOf + 37;
        AFd1cSDK.values = n % 128;
        if (n % 2 == 0) {
            final String[] array = { s2, null, null };
            array[0] = s3;
            array[5] = s4;
            array[5] = s5;
            array[4] = "";
            s2 = (s = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])array), s));
            if (s2.length() >= 116) {
                return s.substring(0, 12);
            }
        }
        else {
            s2 = (s = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[] { s2, s3, s4, s5, "" }), s));
            if (s2.length() >= 12) {
                return s.substring(0, 12);
            }
        }
        AFd1cSDK.values = (AFd1cSDK.valueOf + 11) % 128;
        return s2;
    }
    
    @NonNull
    public final AFf1xSDK valueOf(@NonNull final AFe1qSDK aFe1qSDK, final String s, @NonNull final String s2, @NonNull final String s3) {
        final int n = AFd1cSDK.valueOf + 75;
        final int n2 = AFd1cSDK.values = n % 128;
        if (n % 2 != 0) {
            if (aFe1qSDK != null && s2 != null) {
                final int n3 = n2 + 35;
                final int n4 = AFd1cSDK.valueOf = n3 % 128;
                if (n3 % 2 != 0) {
                    throw null;
                }
                if (s3 != null) {
                    final int n5 = n4 + 1;
                    AFd1cSDK.values = n5 % 128;
                    if (n5 % 2 != 0) {
                        return values(aFe1qSDK, s, s2, s3);
                    }
                }
            }
            return new AFf1xSDK(false, AFf1wSDK.values);
        }
        throw null;
    }
}
