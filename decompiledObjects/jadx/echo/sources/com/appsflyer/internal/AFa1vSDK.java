package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFa1vSDK {
    public static int AppsFlyer2dXConversionCallback = 0;
    public static byte[] getLevel = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    private static int onAttributionFailureNative = 1;
    public static final byte[] onConversionDataSuccess = null;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    private static Object onInstallConversionFailureNative;
    public static final int onResponseErrorNative = 0;

    private static String $$c(byte b7, int i7, short s7) {
        int i8 = onAttributionFailureNative;
        onDeepLinkingNative = (((i8 | 125) << 1) - (i8 ^ 125)) % 128;
        int i9 = -i7;
        int i10 = (i9 ^ 119) + ((i9 & 119) << 1);
        int i11 = 36 - b7;
        int i12 = s7 + 28;
        int i13 = (i12 & (-24)) + (i12 | (-24));
        byte[] bArr = onConversionDataSuccess;
        byte[] bArr2 = new byte[i11];
        int i14 = (-2) - (~i11);
        int i15 = -1;
        if (bArr == null) {
            onDeepLinkingNative = ((i8 & 125) + (i8 | 125)) % 128;
            i10 = ((i14 & i10) + (i14 | i10)) - 3;
            i13++;
            int i16 = onDeepLinkingNative;
            onAttributionFailureNative = (((i16 | 15) << 1) - (i16 ^ 15)) % 128;
            i15 = -1;
        }
        while (true) {
            int i17 = (((i15 | (-67)) << 1) - (i15 ^ (-67))) + 68;
            bArr2[i17] = (byte) i10;
            if (i17 == i14) {
                String str = new String(bArr2, 0);
                int i18 = onAttributionFailureNative;
                onDeepLinkingNative = (((i18 | 103) << 1) - (i18 ^ 103)) % 128;
                return str;
            }
            byte b8 = bArr[i13];
            onDeepLinkingNative = (onAttributionFailureNative + 125) % 128;
            i10 = ((i10 & b8) + (i10 | b8)) - 3;
            i13++;
            int i19 = onDeepLinkingNative;
            onAttributionFailureNative = (((i19 | 15) << 1) - (i19 ^ 15)) % 128;
            i15 = i17;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:(2:1102|1103)|(35:13|14|(1:16)(1:1099)|17|(0)|19|(0)|21|22|(0)|(0)(0)|(0)|70|71|72|73|74|75|(0)(0)|78|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89|(0)(0)|92|93|(1:94)|1055|1053|1054)|1101|(0)|19|(0)|21|22|(0)|(0)(0)|(0)|70|71|72|73|74|75|(0)(0)|78|79|(0)(0)|82|(0)(0)|85|(0)(0)|88|89|(0)(0)|92|93|(1:94)|1055|1053|1054) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        if (r3 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03e1, code lost:
    
        if (((java.lang.Boolean) r6.getMethod($$c(r8, r13, (short) 772), null).invoke(r2, null)).booleanValue() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x023b, code lost:
    
        if (r4 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0243, code lost:
    
        r1 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
        r5 = r1[547(0x223, float:7.67E-43)];
        r7 = r1[452(0x1c4, float:6.33E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0257, code lost:
    
        r14 = (short) 824;
        r5 = java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14)).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14)), java.lang.String.class).newInstance(r4, $$c(r5, r7, (short) (r7 | 259)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x028e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0290, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0294, code lost:
    
        if (r2 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0296, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0297, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0241, code lost:
    
        if (r4 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x0571, code lost:
    
        r39 = r12;
        r1 = r4.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x0577, code lost:
    
        if (r5 != null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0579, code lost:
    
        r4 = com.appsflyer.internal.AFa1vSDK.onDeepLinkingNative + 77;
        com.appsflyer.internal.AFa1vSDK.onAttributionFailureNative = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x0583, code lost:
    
        if ((r4 % 2) == 0) goto L1106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:912:0x0585, code lost:
    
        r4 = new java.lang.Object[]{r2, r1};
        r1 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
        r40 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x05c4, code lost:
    
        r5 = java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)), java.lang.String.class).newInstance(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x05c5, code lost:
    
        r42 = r2;
        r4 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x0741, code lost:
    
        r1 = r36;
        r12 = r39;
        r8 = r40;
        r11 = r41;
        r2 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x05cb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:920:0x05cd, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x05d1, code lost:
    
        if (r2 != null) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:922:0x05d3, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x05d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x05d5, code lost:
    
        r40 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x05d7, code lost:
    
        if (r6 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x05d9, code lost:
    
        com.appsflyer.internal.AFa1vSDK.onDeepLinkingNative = (com.appsflyer.internal.AFa1vSDK.onAttributionFailureNative + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x05e2, code lost:
    
        r6 = new java.lang.Object[]{r2, r1};
        r1 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x061f, code lost:
    
        r6 = java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)), java.lang.String.class).newInstance(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:932:0x0621, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x0623, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:935:0x0627, code lost:
    
        if (r2 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:936:0x0629, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x062a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:938:0x062b, code lost:
    
        if (r13 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:939:0x062d, code lost:
    
        r4 = com.appsflyer.internal.AFa1vSDK.onDeepLinkingNative;
        com.appsflyer.internal.AFa1vSDK.onAttributionFailureNative = ((r4 ^ 35) + ((r4 & 35) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x063b, code lost:
    
        r8 = new java.lang.Object[]{r2, r1};
        r1 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
     */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0677, code lost:
    
        r13 = java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)), java.lang.String.class).newInstance(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:944:0x067a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x067c, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x0680, code lost:
    
        if (r2 != null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x0682, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:949:0x0683, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x0685, code lost:
    
        r8 = new java.lang.Object[]{r2, r1};
        r1 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
        r42 = r2;
        r43 = r5;
        r4 = java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0)), java.lang.String.class).newInstance(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:953:0x06c6, code lost:
    
        r5 = com.appsflyer.internal.AFa1vSDK.onAttributionFailureNative;
        com.appsflyer.internal.AFa1vSDK.onDeepLinkingNative = ((r5 ^ 21) + ((r5 & 21) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:956:0x06d3, code lost:
    
        r2 = r1[81];
        r8 = r1[195(0xc3, float:2.73E-43)];
        r44 = r6;
        r2 = java.lang.Class.forName($$c(r2, r8, (short) ((r8 ^ 736) | (r8 & 736)))).getDeclaredConstructor(java.lang.Class.forName($$c(r1[5], r1[195(0xc3, float:2.73E-43)], r14 ? 1 : 0))).newInstance(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:959:0x0713, code lost:
    
        r5 = r1[81];
        r6 = r1[195(0xc3, float:2.73E-43)];
        java.lang.Class.forName($$c(r5, r6, (short) (r6 | 736))).getMethod($$c(r1[854(0x356, float:1.197E-42)], r1[452(0x1c4, float:6.33E-43)], (short) 652), null).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:960:0x073d, code lost:
    
        r5 = r43;
        r6 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:963:0x074d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:965:0x074f, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:966:0x0753, code lost:
    
        if (r2 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x0755, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:968:0x0759, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:970:0x075a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:971:0x075b, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:972:0x0760, code lost:
    
        if (r2 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:973:0x0762, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x0763, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:975:0x0756, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:977:0x0764, code lost:
    
        r2 = new java.lang.StringBuilder();
        r5 = com.appsflyer.internal.AFa1vSDK.onConversionDataSuccess;
        r2.append($$c(r5[854(0x356, float:1.197E-42)], r5[84], (short) 835));
        r2.append(r4);
        r2.append($$c((byte) (-r5[886(0x376, float:1.242E-42)]), (byte) ((-2) - (r5[372(0x174, float:5.21E-43)] ^ (-1))), (short) 259));
     */
    /* JADX WARN: Code restructure failed: missing block: B:981:0x07d0, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(r5[96], r5[195(0xc3, float:2.73E-43)], (short) 779)).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r2.toString(), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:984:0x07d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:986:0x07d3, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:987:0x07d7, code lost:
    
        if (r2 != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:988:0x07d9, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:989:0x07da, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:991:0x07db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x07dc, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:993:0x07e1, code lost:
    
        if (r2 != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x07e3, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:995:0x07e4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0394 A[Catch: Exception -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #118 {Exception -> 0x0052, blocks: (B:3:0x001e, B:7:0x0041, B:26:0x014d, B:32:0x18dc, B:34:0x18e3, B:36:0x18e4, B:42:0x01a7, B:52:0x023a, B:54:0x0243, B:61:0x0290, B:63:0x0296, B:64:0x0297, B:72:0x02c9, B:75:0x0312, B:79:0x034d, B:82:0x0360, B:85:0x0367, B:89:0x0372, B:92:0x0379, B:100:0x0394, B:132:0x17f5, B:136:0x17f9, B:105:0x1885, B:134:0x1808, B:138:0x1812, B:146:0x185b, B:148:0x1861, B:149:0x1862, B:1044:0x18a5, B:1047:0x18ac, B:1068:0x18bf, B:1070:0x18c5, B:1071:0x18c6, B:1072:0x01ab, B:1080:0x18c8, B:1082:0x18cf, B:1083:0x18d0, B:1086:0x18d2, B:1088:0x18d9, B:1089:0x18da, B:141:0x1826, B:142:0x1858, B:57:0x0257, B:71:0x0298, B:1077:0x0203, B:1075:0x01c8, B:29:0x0171), top: B:2:0x001e, inners: #25, #51, #73, #80, #84, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:1043:0x18a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:1059:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x01ab A[Catch: Exception -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #118 {Exception -> 0x0052, blocks: (B:3:0x001e, B:7:0x0041, B:26:0x014d, B:32:0x18dc, B:34:0x18e3, B:36:0x18e4, B:42:0x01a7, B:52:0x023a, B:54:0x0243, B:61:0x0290, B:63:0x0296, B:64:0x0297, B:72:0x02c9, B:75:0x0312, B:79:0x034d, B:82:0x0360, B:85:0x0367, B:89:0x0372, B:92:0x0379, B:100:0x0394, B:132:0x17f5, B:136:0x17f9, B:105:0x1885, B:134:0x1808, B:138:0x1812, B:146:0x185b, B:148:0x1861, B:149:0x1862, B:1044:0x18a5, B:1047:0x18ac, B:1068:0x18bf, B:1070:0x18c5, B:1071:0x18c6, B:1072:0x01ab, B:1080:0x18c8, B:1082:0x18cf, B:1083:0x18d0, B:1086:0x18d2, B:1088:0x18d9, B:1089:0x18da, B:141:0x1826, B:142:0x1858, B:57:0x0257, B:71:0x0298, B:1077:0x0203, B:1075:0x01c8, B:29:0x0171), top: B:2:0x001e, inners: #25, #51, #73, #80, #84, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1094:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x17f5 A[Catch: Exception -> 0x0052, TRY_ENTER, TryCatch #118 {Exception -> 0x0052, blocks: (B:3:0x001e, B:7:0x0041, B:26:0x014d, B:32:0x18dc, B:34:0x18e3, B:36:0x18e4, B:42:0x01a7, B:52:0x023a, B:54:0x0243, B:61:0x0290, B:63:0x0296, B:64:0x0297, B:72:0x02c9, B:75:0x0312, B:79:0x034d, B:82:0x0360, B:85:0x0367, B:89:0x0372, B:92:0x0379, B:100:0x0394, B:132:0x17f5, B:136:0x17f9, B:105:0x1885, B:134:0x1808, B:138:0x1812, B:146:0x185b, B:148:0x1861, B:149:0x1862, B:1044:0x18a5, B:1047:0x18ac, B:1068:0x18bf, B:1070:0x18c5, B:1071:0x18c6, B:1072:0x01ab, B:1080:0x18c8, B:1082:0x18cf, B:1083:0x18d0, B:1086:0x18d2, B:1088:0x18d9, B:1089:0x18da, B:141:0x1826, B:142:0x1858, B:57:0x0257, B:71:0x0298, B:1077:0x0203, B:1075:0x01c8, B:29:0x0171), top: B:2:0x001e, inners: #25, #51, #73, #80, #84, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x12f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1335 A[Catch: all -> 0x1338, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x1338, blocks: (B:415:0x13aa, B:417:0x13b2, B:423:0x13d8, B:425:0x13de, B:426:0x13df, B:331:0x141d, B:401:0x1428, B:402:0x142e, B:324:0x1335), top: B:414:0x13aa }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x13e5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1578 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x133d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1691 A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x1692 A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0345 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:788:0x16fc A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:789:0x16fd A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x1757 A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:824:0x1758 A[Catch: all -> 0x153a, TryCatch #8 {all -> 0x153a, blocks: (B:356:0x1527, B:360:0x1546, B:362:0x154c, B:363:0x154d, B:371:0x1559, B:373:0x155f, B:374:0x1560, B:380:0x1562, B:382:0x156d, B:383:0x156e, B:393:0x1578, B:302:0x15cb, B:311:0x1638, B:313:0x163e, B:314:0x163f, B:442:0x1641, B:444:0x164e, B:445:0x164f, B:450:0x1651, B:452:0x165e, B:453:0x165f, B:473:0x1661, B:475:0x166e, B:476:0x166f, B:486:0x168b, B:488:0x1691, B:489:0x1692, B:501:0x16a0, B:503:0x16b0, B:504:0x16b1, B:507:0x16b3, B:509:0x16c3, B:510:0x16c4, B:726:0x16c6, B:728:0x16d6, B:729:0x16d7, B:786:0x16f6, B:788:0x16fc, B:789:0x16fd, B:806:0x171a, B:808:0x1720, B:809:0x1721, B:821:0x1751, B:823:0x1757, B:824:0x1758, B:835:0x1777, B:837:0x177d, B:838:0x177e, B:846:0x17a6, B:848:0x17ac, B:849:0x17ad, B:857:0x17af, B:859:0x17c3, B:860:0x17c4, B:305:0x1603, B:306:0x1635, B:289:0x1226, B:284:0x11ba, B:276:0x1123, B:342:0x148c, B:224:0x1037, B:163:0x0845, B:221:0x0ff9, B:214:0x0ae5), top: B:355:0x1527, inners: #6, #12, #20, #28, #31, #61, #65, #68, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0384  */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114, types: [int] */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v104 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v139 */
    /* JADX WARN: Type inference failed for: r12v141, types: [int] */
    /* JADX WARN: Type inference failed for: r12v144 */
    /* JADX WARN: Type inference failed for: r12v145 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v167, types: [short] */
    /* JADX WARN: Type inference failed for: r12v172, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r12v175 */
    /* JADX WARN: Type inference failed for: r12v183 */
    /* JADX WARN: Type inference failed for: r12v184, types: [short] */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v216 */
    /* JADX WARN: Type inference failed for: r12v217 */
    /* JADX WARN: Type inference failed for: r12v218 */
    /* JADX WARN: Type inference failed for: r12v219 */
    /* JADX WARN: Type inference failed for: r12v223 */
    /* JADX WARN: Type inference failed for: r12v224 */
    /* JADX WARN: Type inference failed for: r12v225 */
    /* JADX WARN: Type inference failed for: r12v226 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v64, types: [short] */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r14v10, types: [short] */
    /* JADX WARN: Type inference failed for: r2v154, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v157 */
    /* JADX WARN: Type inference failed for: r4v179, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r5v136, types: [java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 6422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1vSDK.<clinit>():void");
    }

    private AFa1vSDK() {
    }

    public static Object AFInAppEventParameterName(char c7, int i7, int i8) {
        int i9 = onDeepLinkingNative;
        int i10 = ((i9 | 117) << 1) - (i9 ^ 117);
        int i11 = i10 % 128;
        onAttributionFailureNative = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        Object obj = onInstallConversionFailureNative;
        onDeepLinkingNative = ((i11 ^ 61) + ((i11 & 61) << 1)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c7), Integer.valueOf(i7), Integer.valueOf(i8)};
            byte[] bArr = onConversionDataSuccess;
            byte b7 = bArr[14];
            byte b8 = bArr[452];
            Class<?> cls = Class.forName($$c(b7, b8, (short) ((b8 ^ 835) | (b8 & 835))), true, (ClassLoader) init);
            String $$c = $$c(bArr[452], bArr[12], (short) 333);
            Class<?> cls2 = Integer.TYPE;
            return cls.getMethod($$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFInAppEventType(Object obj) {
        int i7 = (onDeepLinkingNative + 91) % 128;
        onAttributionFailureNative = i7;
        Object obj2 = onInstallConversionFailureNative;
        onDeepLinkingNative = ((i7 ^ 33) + ((i7 & 33) << 1)) % 128;
        onDeepLinkingNative = (i7 + 83) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = onConversionDataSuccess;
            byte b7 = bArr[14];
            byte b8 = bArr[452];
            Class<?> cls = Class.forName($$c(b7, b8, (short) ((b8 ^ 835) | (b8 & 835))), true, (ClassLoader) init);
            byte b9 = (byte) (-bArr[348]);
            byte b10 = bArr[26];
            int intValue = ((Integer) cls.getMethod($$c(b9, b10, (short) ((b10 ^ 742) | (b10 & 742))), Object.class).invoke(obj2, objArr)).intValue();
            int i8 = onDeepLinkingNative + 115;
            onAttributionFailureNative = i8 % 128;
            if (i8 % 2 != 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i7;
        int i8 = onAttributionFailureNative;
        int i9 = (i8 ^ 67) + ((i8 & 67) << 1);
        onDeepLinkingNative = i9 % 128;
        if (i9 % 2 != 0) {
            byte[] bArr = new byte[1018];
            System.arraycopy("_Ô\u0099áú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜMú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\r\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓKÝô\nÜ\u0003ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓKÝô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1018);
            onConversionDataSuccess = bArr;
            i7 = 11898;
        } else {
            byte[] bArr2 = new byte[1018];
            System.arraycopy("_Ô\u0099áú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓHàô\nÜMú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\nø\u0012\u0006õ\u0002ñ\u0016ÿ\u000e\u000bø\u0007û\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøøî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000bú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0010ù\u0011\u0000ýþÍD\u0007¾()ý\u0004ô\u000bÙ,\u0006÷\u000bû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001ô\n\u0017í\b\t\u0001\u0012Ö%þå,\u0006ß\u0016\u000fûö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006î\u000e\fóí\u001aú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\r\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓKÝô\nÜ\u0003ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓKÝô\nÜ\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr2, 0, 1018);
            onConversionDataSuccess = bArr2;
            i7 = 187;
        }
        onResponseErrorNative = i7;
    }

    public static int valueOf(int i7) {
        Object obj;
        int i8 = onDeepLinkingNative + 91;
        int i9 = i8 % 128;
        onAttributionFailureNative = i9;
        if (i8 % 2 == 0) {
            obj = onInstallConversionFailureNative;
            int i10 = 1 / 0;
        } else {
            obj = onInstallConversionFailureNative;
        }
        onDeepLinkingNative = ((i9 ^ 117) + ((i9 & 117) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7)};
            byte[] bArr = onConversionDataSuccess;
            byte b7 = bArr[14];
            byte b8 = bArr[452];
            int intValue = ((Integer) Class.forName($$c(b7, b8, (short) ((b8 ^ 835) | (b8 & 835))), true, (ClassLoader) init).getMethod($$c(bArr[452], bArr[12], (short) 333), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i11 = onAttributionFailureNative;
            int i12 = (i11 ^ 15) + ((i11 & 15) << 1);
            onDeepLinkingNative = i12 % 128;
            if (i12 % 2 == 0) {
                return intValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
