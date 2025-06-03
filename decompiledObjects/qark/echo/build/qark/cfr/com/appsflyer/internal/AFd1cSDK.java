/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ExpandableListView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1nSDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1xSDK;
import com.appsflyer.internal.AFg1rSDK;

public final class AFd1cSDK {
    private static long AFKeystoreWrapper = 0L;
    private static int valueOf = 0;
    private static int values = 1;

    static {
        AFd1cSDK.valueOf();
        View.resolveSize((int)0, (int)0);
        int n8 = valueOf + 39;
        values = n8 % 128;
        if (n8 % 2 != 0) {
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void AFKeystoreWrapper(String object, int n8, Object[] arrobject) {
        Object object2 = object;
        if (object != null) {
            object2 = object.toCharArray();
        }
        object2 = (char[])object2;
        object = AFg1rSDK.AFInAppEventParameterName;
        // MONITORENTER : object
        object2 = AFg1rSDK.AFInAppEventType(AFKeystoreWrapper, (char[])object2, n8);
        AFg1rSDK.AFInAppEventType = 4;
        while ((n8 = AFg1rSDK.AFInAppEventType) < object2.length) {
            AFg1rSDK.AFKeystoreWrapper = n8 - 4;
            n8 = AFg1rSDK.AFInAppEventType++;
            object2[n8] = (char)((long)(object2[n8] ^ object2[n8 % 4]) ^ (long)AFg1rSDK.AFKeystoreWrapper * AFKeystoreWrapper);
        }
        object2 = new String((char[])object2, 4, object2.length - 4);
        // MONITOREXIT : object
        arrobject[0] = object2;
    }

    public static void valueOf() {
        AFKeystoreWrapper = -4836734234935930684L;
    }

    @NonNull
    private static AFf1xSDK values(@NonNull AFe1qSDK object, String string2, @NonNull String string3, @NonNull String object2) {
        boolean bl = false;
        if (string2 == null) {
            if (object.values == AFe1aSDK.AFInAppEventType) {
                bl = true;
            }
            return new AFf1xSDK(bl, AFf1wSDK.valueOf);
        }
        int n8 = ExpandableListView.getPackedPositionType((long)0L);
        Object object3 = new Object[1];
        AFd1cSDK.AFKeystoreWrapper("\u12c5\uedd1\u12f6\ueb9a\ude6e\ubd26\u4a25\u2c11\u51e6\u7e33\u0f35\ueb04\u94d6\u3b0c\ucc05\ua63b\udbc7\uf411\u8116\u6520\u1eb7\ub0e3\u4666\u20d7\u5da7\u4dfc\u1b76\u9fca\u8091\u0ec5\ud846\u5a86\uc783\ucbd6\u9d57\u19e3\u0a73\u84a3\u51a7\ud496\u4963\u41c4\u16b7\u9385\u8c53\u02f0\uab87\u4ec3\uf342\udf94\u6891\u0da6\u3632\u9861\u2de1\uc955\u7522\u5572\ue2f0\u8443\ub812\u1634\ua7c0\u4377\uff01\ud356\u64d0\u3e13", n8, (Object[])object3);
        object3 = ((String)object3[0]).intern();
        if (object.values == AFe1aSDK.AFKeystoreWrapper) {
            string3 = new StringBuilder(string3).reverse().toString();
        } else {
            string3 = "";
            object2 = object3;
        }
        object = object.AFInAppEventType;
        bl = AFd1cSDK.values(new StringBuilder((String)object2).reverse().toString(), (String)object, "android", "v1", string3).equals((Object)string2);
        object = bl ? AFf1wSDK.AFInAppEventParameterName : AFf1wSDK.AFKeystoreWrapper;
        return new AFf1xSDK(bl, (AFf1wSDK)((Object)object));
    }

    private static String values(String string2, String string3, String string4, String string5, String string6) {
        block3 : {
            block4 : {
                block2 : {
                    int n8 = valueOf + 37;
                    values = n8 % 128;
                    if (n8 % 2 != 0) break block2;
                    Object[] arrobject = new String[3];
                    arrobject[0] = string3;
                    arrobject[0] = string4;
                    arrobject[5] = string5;
                    arrobject[5] = string6;
                    arrobject[4] = "";
                    string2 = string3 = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])arrobject), string2);
                    if (string3.length() >= 116) break block3;
                    break block4;
                }
                string2 = string3 = AFc1nSDK.valueOf(TextUtils.join((CharSequence)"\u2063", (Object[])new String[]{string3, string4, string5, string6, ""}), string2);
                if (string3.length() >= 12) break block3;
            }
            values = (valueOf + 11) % 128;
            return string3;
        }
        return string2.substring(0, 12);
    }

    @NonNull
    public final AFf1xSDK valueOf(@NonNull AFe1qSDK aFe1qSDK, String string2, @NonNull String string3, @NonNull String string4) {
        int n8;
        int n9 = valueOf + 75;
        values = n8 = n9 % 128;
        if (n9 % 2 != 0) {
            if (aFe1qSDK != null && string3 != null) {
                n9 = n8 + 35;
                valueOf = n8 = n9 % 128;
                if (n9 % 2 == 0) {
                    if (string4 != null) {
                        n9 = n8 + 1;
                        values = n9 % 128;
                        if (n9 % 2 != 0) {
                            return AFd1cSDK.values(aFe1qSDK, string2, string3, string4);
                        }
                    }
                } else {
                    throw null;
                }
            }
            return new AFf1xSDK(false, AFf1wSDK.values);
        }
        throw null;
    }
}

