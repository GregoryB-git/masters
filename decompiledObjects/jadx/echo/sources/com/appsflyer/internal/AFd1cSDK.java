package com.appsflyer.internal;

import android.view.View;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFd1cSDK {
    private static long AFKeystoreWrapper = 0;
    private static int valueOf = 0;
    private static int values = 1;

    static {
        valueOf();
        View.resolveSize(0, 0);
        int i7 = valueOf + 39;
        values = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void AFKeystoreWrapper(String str, int i7, Object[] objArr) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1rSDK.AFInAppEventParameterName) {
            try {
                char[] AFInAppEventType = AFg1rSDK.AFInAppEventType(AFKeystoreWrapper, cArr2, i7);
                AFg1rSDK.AFInAppEventType = 4;
                while (true) {
                    int i8 = AFg1rSDK.AFInAppEventType;
                    if (i8 < AFInAppEventType.length) {
                        AFg1rSDK.AFKeystoreWrapper = i8 - 4;
                        AFInAppEventType[AFg1rSDK.AFInAppEventType] = (char) ((AFInAppEventType[r1] ^ AFInAppEventType[r1 % 4]) ^ (AFg1rSDK.AFKeystoreWrapper * AFKeystoreWrapper));
                        AFg1rSDK.AFInAppEventType++;
                    } else {
                        str2 = new String(AFInAppEventType, 4, AFInAppEventType.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str2;
    }

    @NonNull
    private static AFf1xSDK values(@NonNull AFe1qSDK aFe1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (str == null) {
            return new AFf1xSDK(aFe1qSDK.values == AFe1aSDK.DEFAULT, AFf1wSDK.NA);
        }
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("ዅ\uedd1ዶ\ueb9a\ude6e봦䨥Ⱁ処縳༵\ueb04铖㬌찅\ua63b\udbc7\uf411脖攠ặ냣䙦⃗嶧䷼᭶鿊肑\u0ec5\ud846媆잃쯖鵗᧣ੳ蒣冧풖䥣䇄ᚷ鎅豓˰ꮇ仃\uf342\udf94梑ඦ㘲顡ⷡ쥕產啲\ue2f0葃렒ᘴ\ua7c0䍷！퍖擐㸓", ExpandableListView.getPackedPositionType(0L), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFe1qSDK.values == AFe1aSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = values(new StringBuilder(str3).reverse().toString(), aFe1qSDK.AFInAppEventType, "android", "v1", str4).equals(str);
        return new AFf1xSDK(equals, equals ? AFf1wSDK.SUCCESS : AFf1wSDK.FAILURE);
    }

    @NonNull
    public final AFf1xSDK valueOf(@NonNull AFe1qSDK aFe1qSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i7 = valueOf + 75;
        int i8 = i7 % 128;
        values = i8;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (aFe1qSDK != null && str2 != null) {
            int i9 = i8 + 35;
            int i10 = i9 % 128;
            valueOf = i10;
            if (i9 % 2 != 0) {
                throw null;
            }
            if (str3 != null) {
                int i11 = i10 + 1;
                values = i11 % 128;
                if (i11 % 2 != 0) {
                    return values(aFe1qSDK, str, str2, str3);
                }
            }
        }
        return new AFf1xSDK(false, AFf1wSDK.INTERNAL_ERROR);
    }

    public static void valueOf() {
        AFKeystoreWrapper = -4836734234935930684L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r5.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (r5.length() < 116) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        return r5.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        com.appsflyer.internal.AFd1cSDK.values = (com.appsflyer.internal.AFd1cSDK.valueOf + 11) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String values(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = com.appsflyer.internal.AFd1cSDK.valueOf
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1cSDK.values = r1
            int r0 = r0 % 2
            r1 = 12
            java.lang.String r2 = "\u2063"
            java.lang.String r3 = ""
            r4 = 0
            if (r0 != 0) goto L33
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r6
            r0[r4] = r7
            r6 = 5
            r0[r6] = r8
            r0[r6] = r9
            r6 = 4
            r0[r6] = r3
            java.lang.String r6 = android.text.TextUtils.join(r2, r0)
            java.lang.String r5 = com.appsflyer.internal.AFc1nSDK.valueOf(r6, r5)
            int r6 = r5.length()
            r7 = 116(0x74, float:1.63E-43)
            if (r6 >= r7) goto L4e
            goto L45
        L33:
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8, r9, r3}
            java.lang.String r6 = android.text.TextUtils.join(r2, r6)
            java.lang.String r5 = com.appsflyer.internal.AFc1nSDK.valueOf(r6, r5)
            int r6 = r5.length()
            if (r6 >= r1) goto L4e
        L45:
            int r6 = com.appsflyer.internal.AFd1cSDK.valueOf
            int r6 = r6 + 11
            int r6 = r6 % 128
            com.appsflyer.internal.AFd1cSDK.values = r6
            return r5
        L4e:
            java.lang.String r5 = r5.substring(r4, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1cSDK.values(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
