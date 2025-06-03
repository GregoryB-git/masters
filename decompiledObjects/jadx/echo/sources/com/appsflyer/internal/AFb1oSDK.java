package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFb1oSDK {
    public static byte[] AppsFlyerLib = null;
    public static byte[] onPause = null;
    public static final byte[] setAndroidIdData = null;
    private static int setCustomerUserId = 1;
    public static int setDebugLog;
    private static Object setImeiData;
    private static Object setOaidData;
    public static final int setPhoneNumber = 0;
    public static int updateServerUninstallToken;
    private static int waitForCustomerUserId;

    private static String $$c(short s7, int i7, short s8) {
        int i8 = waitForCustomerUserId;
        int i9 = (((i8 | 19) << 1) - (i8 ^ 19)) % 128;
        setCustomerUserId = i9;
        int i10 = -s7;
        int i11 = ((i10 | 36) << 1) - (i10 ^ 36);
        int i12 = -i7;
        int i13 = (i12 ^ 119) + ((i12 & 119) << 1);
        int i14 = s8 + 4;
        byte[] bArr = setAndroidIdData;
        byte[] bArr2 = new byte[i11];
        int i15 = -1;
        int i16 = i11 - 1;
        if (bArr == null) {
            int i17 = i9 + 107;
            waitForCustomerUserId = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 41 / 0;
            }
            int i19 = i14 + (-i16);
            waitForCustomerUserId = (setCustomerUserId + 99) % 128;
            i14 = i14;
            i13 = i19;
        }
        while (true) {
            int i20 = ((i15 | 125) << 1) - (i15 ^ 125);
            i15 = ((i20 | (-124)) << 1) - (i20 ^ (-124));
            bArr2[i15] = (byte) i13;
            if (i15 == i16) {
                break;
            }
            int i21 = (i14 ^ (-56)) + ((i14 & (-56)) << 1);
            int i22 = (i21 ^ 57) + ((i21 & 57) << 1);
            int i23 = i13 + (-bArr[i22]);
            waitForCustomerUserId = (setCustomerUserId + 99) % 128;
            i14 = i22;
            i13 = i23;
        }
        String str = new String(bArr2, 0);
        int i24 = setCustomerUserId;
        int i25 = (i24 & 21) + (i24 | 21);
        waitForCustomerUserId = i25 % 128;
        if (i25 % 2 != 0) {
            int i26 = 38 / 0;
        }
        return str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(1:765)(1:(1:887)(13:(1:889)(1:890)|767|768|769|770|771|(4:773|(6:775|776|777|(5:779|780|(1:782)(1:787)|783|784)|788|789)(6:792|(3:794|788|789)|780|(0)(0)|783|784)|785|786)|795|796|(4:798|799|800|801)(2:812|(4:814|815|816|817)(13:(4:826|827|828|829)(13:837|838|839|840|841|842|843|844|845|846|847|848|804)|790|791|676|379|275|276|(2:(0)(0)|280)|288|289|290|291|292))|802|803|804))|766|767|768|769|770|771|(0)|795|796|(0)(0)|802|803|804) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:(36:945|946|(0)|13|(0)|15|16|(0)|30|(0)|(0)|63|64|65|66|67|68|(0)(0)|71|72|(0)(0)|75|(0)(0)|78|79|(0)(0)|82|83|84|(0)(0)|87|88|89|(0)|920|921)|11|(0)|13|(0)|15|16|(0)|30|(0)|(0)|63|64|65|66|67|68|(0)(0)|71|72|(0)(0)|75|(0)(0)|78|79|(0)(0)|82|83|84|(0)(0)|87|88|89|(0)|920|921) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0393, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c(r13, r15, (short) ((r15 ^ 864) | (r15 & 864)))).getMethod($$c(r30[262(0x106, float:3.67E-43)], r30[15], (short) 825), null).invoke(r11, null)).booleanValue() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x07d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        if (r5 != null) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x12c6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x177c A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #98 {Exception -> 0x0041, blocks: (B:3:0x001b, B:5:0x0031, B:20:0x0116, B:25:0x1835, B:27:0x183c, B:29:0x183d, B:32:0x0160, B:40:0x1821, B:42:0x1828, B:43:0x1829, B:46:0x182b, B:48:0x1832, B:49:0x1833, B:52:0x01d2, B:59:0x0225, B:61:0x022b, B:62:0x022c, B:65:0x025a, B:68:0x02a6, B:72:0x02db, B:75:0x02e4, B:79:0x02ed, B:83:0x02f8, B:88:0x030f, B:95:0x032c, B:100:0x1796, B:278:0x177c, B:285:0x1792, B:280:0x17b7, B:288:0x17c4, B:296:0x180d, B:298:0x1813, B:299:0x1814, B:933:0x1817, B:935:0x181e, B:936:0x181f, B:37:0x01aa, B:55:0x01e5, B:34:0x016f, B:22:0x0137, B:291:0x17d8, B:292:0x180a, B:64:0x022d), top: B:2:0x001b, inners: #1, #4, #6, #10, #86, #93 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x17c4 A[EDGE_INSN: B:300:0x17c4->B:288:0x17c4 BREAK  A[LOOP:3: B:277:0x177a->B:280:0x17b7, LOOP_LABEL: LOOP:0: B:90:0x0313->B:100:0x1796], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x13a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160 A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #98 {Exception -> 0x0041, blocks: (B:3:0x001b, B:5:0x0031, B:20:0x0116, B:25:0x1835, B:27:0x183c, B:29:0x183d, B:32:0x0160, B:40:0x1821, B:42:0x1828, B:43:0x1829, B:46:0x182b, B:48:0x1832, B:49:0x1833, B:52:0x01d2, B:59:0x0225, B:61:0x022b, B:62:0x022c, B:65:0x025a, B:68:0x02a6, B:72:0x02db, B:75:0x02e4, B:79:0x02ed, B:83:0x02f8, B:88:0x030f, B:95:0x032c, B:100:0x1796, B:278:0x177c, B:285:0x1792, B:280:0x17b7, B:288:0x17c4, B:296:0x180d, B:298:0x1813, B:299:0x1814, B:933:0x1817, B:935:0x181e, B:936:0x181f, B:37:0x01aa, B:55:0x01e5, B:34:0x016f, B:22:0x0137, B:291:0x17d8, B:292:0x180a, B:64:0x022d), top: B:2:0x001b, inners: #1, #4, #6, #10, #86, #93 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x14d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x1277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x16d8 A[Catch: all -> 0x16b2, TryCatch #47 {all -> 0x16b2, blocks: (B:451:0x16b1, B:455:0x16bc, B:457:0x16c2, B:458:0x16c3, B:467:0x16d2, B:469:0x16d8, B:470:0x16d9, B:679:0x16de, B:681:0x16ef, B:682:0x16f0, B:710:0x1702, B:712:0x1708, B:713:0x1709, B:722:0x1717, B:724:0x172c, B:725:0x172d, B:728:0x172f, B:730:0x1744, B:731:0x1745, B:734:0x1747, B:736:0x175c, B:737:0x175d, B:740:0x175f, B:742:0x1774, B:743:0x1775, B:142:0x08cd, B:139:0x0894, B:136:0x084c, B:165:0x0aa6, B:148:0x090e), top: B:141:0x08cd, inners: #7, #15, #23, #65, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x16d9 A[Catch: all -> 0x16b2, TryCatch #47 {all -> 0x16b2, blocks: (B:451:0x16b1, B:455:0x16bc, B:457:0x16c2, B:458:0x16c3, B:467:0x16d2, B:469:0x16d8, B:470:0x16d9, B:679:0x16de, B:681:0x16ef, B:682:0x16f0, B:710:0x1702, B:712:0x1708, B:713:0x1709, B:722:0x1717, B:724:0x172c, B:725:0x172d, B:728:0x172f, B:730:0x1744, B:731:0x1745, B:734:0x1747, B:736:0x175c, B:737:0x175d, B:740:0x175f, B:742:0x1774, B:743:0x1775, B:142:0x08cd, B:139:0x0894, B:136:0x084c, B:165:0x0aa6, B:148:0x090e), top: B:141:0x08cd, inners: #7, #15, #23, #65, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0e2e A[Catch: all -> 0x0c20, Exception -> 0x0e3a, LOOP:5: B:589:0x0e2c->B:590:0x0e2e, LOOP_END, TryCatch #91 {Exception -> 0x0e3a, blocks: (B:588:0x0da2, B:590:0x0e2e, B:592:0x0e3d), top: B:587:0x0da2, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:901:0x080a A[Catch: all -> 0x04eb, TryCatch #71 {all -> 0x04eb, blocks: (B:777:0x04e4, B:780:0x050f, B:784:0x053a, B:786:0x053e, B:789:0x0503, B:792:0x04fd, B:796:0x0544, B:808:0x05b1, B:810:0x05b7, B:811:0x05b8, B:821:0x060a, B:823:0x0610, B:824:0x0611, B:833:0x0662, B:835:0x0668, B:836:0x0669, B:852:0x0743, B:854:0x0749, B:855:0x074d, B:864:0x0758, B:873:0x07c7, B:875:0x07cd, B:876:0x07ce, B:858:0x074f, B:860:0x0756, B:861:0x0757, B:879:0x07d0, B:881:0x07d7, B:882:0x07d8, B:899:0x0804, B:901:0x080a, B:902:0x080b, B:846:0x0708, B:828:0x0615, B:800:0x055c, B:867:0x0792, B:868:0x07c4, B:839:0x066b, B:816:0x05be), top: B:776:0x04e4, inners: #12, #25, #46, #54, #57, #83, #84 }] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x080b A[Catch: all -> 0x04eb, TRY_LEAVE, TryCatch #71 {all -> 0x04eb, blocks: (B:777:0x04e4, B:780:0x050f, B:784:0x053a, B:786:0x053e, B:789:0x0503, B:792:0x04fd, B:796:0x0544, B:808:0x05b1, B:810:0x05b7, B:811:0x05b8, B:821:0x060a, B:823:0x0610, B:824:0x0611, B:833:0x0662, B:835:0x0668, B:836:0x0669, B:852:0x0743, B:854:0x0749, B:855:0x074d, B:864:0x0758, B:873:0x07c7, B:875:0x07cd, B:876:0x07ce, B:858:0x074f, B:860:0x0756, B:861:0x0757, B:879:0x07d0, B:881:0x07d7, B:882:0x07d8, B:899:0x0804, B:901:0x080a, B:902:0x080b, B:846:0x0708, B:828:0x0615, B:800:0x055c, B:867:0x0792, B:868:0x07c4, B:839:0x066b, B:816:0x05be), top: B:776:0x04e4, inners: #12, #25, #46, #54, #57, #83, #84 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:924:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:926:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:941:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:945:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Random] */
    /* JADX WARN: Type inference failed for: r12v194 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r4v116, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v122, types: [java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 6241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1oSDK.<clinit>():void");
    }

    private AFb1oSDK() {
    }

    public static int AFKeystoreWrapper(int i7) {
        int i8 = waitForCustomerUserId;
        int i9 = (((i8 | 25) << 1) - (i8 ^ 25)) % 128;
        setCustomerUserId = i9;
        Object obj = setImeiData;
        waitForCustomerUserId = (i9 + 117) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7)};
            byte[] bArr = setAndroidIdData;
            int intValue = ((Integer) Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData).getMethod($$c(bArr[608], bArr[40], (short) 796), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i10 = waitForCustomerUserId + 75;
            setCustomerUserId = i10 % 128;
            if (i10 % 2 != 0) {
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
        int i8 = waitForCustomerUserId + 19;
        setCustomerUserId = i8 % 128;
        if (i8 % 2 == 0) {
            byte[] bArr = new byte[1008];
            System.arraycopy("_\u00ad\u009d\u009cÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë7\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ0ß\u0004ý!Û\u0007ï\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ýô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Â\u001c\u000fù'\u00ad\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýù\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷úô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Á\u001d\u000fù'\u0000\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûúô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûä1Á\u001d\u000fù'\u0000\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ì6\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr, 0, 1008);
            setAndroidIdData = bArr;
            i7 = 105;
        } else {
            byte[] bArr2 = new byte[1008];
            System.arraycopy("_\u00ad\u009d\u009cÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë7\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000føî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ô\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\r\u0004ý\u001eÑ\t\u0000ó\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ0ß\u0004ý!Û\u0007ï\u0005\tõ\u000f\u0002ñ1âþû\u0003!Û÷\r\u0004ýô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Â\u001c\u000fù'\u00ad\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ô\u000bÿ\u0006ü\u0002þû\u0003\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷ûýÛ-Ñ\u0000+Ï\u0011÷ú Û\t\u000bú\u000b\u000b\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0015ú\u0016ø\u0015ü\u0014ø\u0015ø\u0018øûýÛ-Ñ\u0000+Ï\u0011÷ú$ïï\u0011ô\bñ\u000fó$íô\b\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿóó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ/Í\u0004\u000fó\u0004\rõ\u0019ß\u0005ý\u0011ú\u0002!Û÷\r\u0002ï\u0005ýù\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ôý\u000eý ßíó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ôó\nò\u0003\u0006\u00056¿üEé×ø\r÷\u0003\u0001\u0001\b÷úô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûä1Á\u001d\u000fù'\u0000\b\u0002ù\u0002ñ1×\u000bî\u0000'Ý\u000eýÿóË\u0003í\u00132Ë\u0003í\u00132ÿù\u0007ñ\u000f\u0002ñ.\u0002\u000fùì\u0016ûúô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûä1Á\u001d\u000fù'\u0000\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001÷ýü\u000eÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ì6\të\u00153ÅúAº\u0007ý\fû÷\u0002ñ$Þ\u0003ÿ\u000bóþû\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ý\u0015õ÷\u0010\u0016é\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0002ó\u0017å\tõ\u000f\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001\u000fí\f\u001cãöÿ\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\të\u00153ÅúAèÝý\u0007\u0015ý\u0013øî\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ý\u0005-É\u0005\u000f$Ï\u0000\u0011èý\u000eý!×\u000bî\u0000ô\u0002?Íñ\u0000ý\rúó\u0014ó\u0005\u0011ñ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô".getBytes("ISO-8859-1"), 0, bArr2, 0, 1008);
            setAndroidIdData = bArr2;
            i7 = 104;
        }
        setPhoneNumber = i7;
    }

    public static Object values(int i7, int i8, char c7) {
        int i9 = setCustomerUserId;
        Object obj = setImeiData;
        int i10 = (((i9 | 89) << 1) - (i9 ^ 89)) % 128;
        waitForCustomerUserId = i10;
        setCustomerUserId = ((i10 ^ 31) + ((i10 & 31) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(i8), Character.valueOf(c7)};
            byte[] bArr = setAndroidIdData;
            Class<?> cls = Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData);
            String $$c = $$c(bArr[60], bArr[111], (short) 388);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i11 = setCustomerUserId;
            waitForCustomerUserId = (((i11 | 105) << 1) - (i11 ^ 105)) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(Object obj) {
        int i7 = setCustomerUserId;
        int i8 = ((i7 ^ 43) + ((i7 & 43) << 1)) % 128;
        waitForCustomerUserId = i8;
        Object obj2 = setImeiData;
        setCustomerUserId = (i8 + 109) % 128;
        try {
            Object[] objArr = {obj};
            byte[] bArr = setAndroidIdData;
            int intValue = ((Integer) Class.forName($$c(bArr[71], bArr[15], (short) 649), true, (ClassLoader) setOaidData).getMethod($$c(bArr[15], bArr[111], (short) 336), Object.class).invoke(obj2, objArr)).intValue();
            int i9 = waitForCustomerUserId;
            int i10 = (i9 & 75) + (i9 | 75);
            setCustomerUserId = i10 % 128;
            if (i10 % 2 != 0) {
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
