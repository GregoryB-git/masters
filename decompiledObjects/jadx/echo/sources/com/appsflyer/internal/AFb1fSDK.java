package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFb1fSDK extends HashMap<String, Object> {
    private static long AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 0;
    private static char[] AFLogger = null;
    private static int afDebugLog = 0;
    private static int afErrorLog = 0;
    private static int afErrorLogForExcManagerOnly = 1;
    private static boolean afInfoLog;
    private static boolean afRDLog;
    private static char valueOf;
    private final Map<String, Object> AFKeystoreWrapper;
    private final Context values;

    public static class AFa1ySDK {
        public final int AFInAppEventParameterName;
        public final String AFInAppEventType;
        public final int AFKeystoreWrapper;
        public final long valueOf;

        public AFa1ySDK() {
        }

        public AFa1ySDK(String str, int i7, int i8, long j7) {
            this.AFInAppEventType = str;
            this.AFInAppEventParameterName = i7;
            this.AFKeystoreWrapper = i8;
            this.valueOf = j7;
        }

        public static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) (bArr[i7] ^ ((i7 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] valueOf(@NonNull String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        public final String AFInAppEventType() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sdk_ver", this.AFInAppEventType);
                jSONObject.put("min", this.AFInAppEventParameterName);
                jSONObject.put("expire", this.AFKeystoreWrapper);
                jSONObject.put("ttl", this.valueOf);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }

        public final boolean equals(Object obj) {
            String str;
            if (this == obj) {
                return true;
            }
            if (obj != null && AFa1ySDK.class == obj.getClass()) {
                AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
                if (this.AFInAppEventParameterName == aFa1ySDK.AFInAppEventParameterName && this.AFKeystoreWrapper == aFa1ySDK.AFKeystoreWrapper && this.valueOf == aFa1ySDK.valueOf && (str = this.AFInAppEventType) != null && str.equals(aFa1ySDK.AFInAppEventType)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.AFInAppEventType;
            return ((((((str != null ? str.hashCode() : 0) * 31) + this.AFInAppEventParameterName) * 31) + this.AFKeystoreWrapper) * 31) + ((int) this.valueOf);
        }
    }

    static {
        valueOf();
        Color.argb(0, 0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        View.getDefaultSize(0, 0);
        Drawable.resolveOpacity(0, 0);
        ViewConfiguration.getWindowTouchSlop();
        TextUtils.indexOf((CharSequence) "", '0');
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getJumpTapTimeout();
        KeyEvent.getDeadChar(0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.getOffsetAfter("", 0);
        afErrorLogForExcManagerOnly = (afErrorLog + 99) % 128;
    }

    public AFb1fSDK(Map<String, Object> map, Context context) {
        this.AFKeystoreWrapper = map;
        this.values = context;
        put(AFInAppEventType(), AFKeystoreWrapper());
    }

    @NonNull
    private String AFInAppEventType() {
        afErrorLogForExcManagerOnly = (afErrorLog + 47) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFKeystoreWrapper;
            Object[] objArr = new Object[1];
            AFInAppEventType("흓鼋屖꿣", "八鬵᳑覨㑖抗便လ헭ꎭ좠囡", View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.lastIndexOf("", '0')), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFKeystoreWrapper;
            Object[] objArr2 = new Object[1];
            AFInAppEventType("ᆎ䐡\ue09a핊", "；㈽㎐嘘㲍", (-1706811119) - Color.red(0), "\u0000\u0000\u0000\u0000", (char) (View.MeasureSpec.getSize(0) + 19168), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                Object[] objArr3 = new Object[1];
                values(null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", 127 - (Process.myTid() >> 22), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder AFKeystoreWrapper = AFKeystoreWrapper(num, obj2, sb.toString());
            int length = AFKeystoreWrapper.length();
            if (length > 4) {
                AFKeystoreWrapper.delete(4, length);
                afErrorLogForExcManagerOnly = (afErrorLog + 21) % 128;
            } else {
                while (length < 4) {
                    length++;
                    AFKeystoreWrapper.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            values(null, null, "\u008a\u0089\u0088", (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, objArr4);
            AFKeystoreWrapper.insert(0, ((String) objArr4[0]).intern());
            return AFKeystoreWrapper.toString();
        } catch (Exception e7) {
            Object[] objArr5 = new Object[1];
            AFInAppEventType("哥Њ\uf7a0핬", "ꐙ⺸뙸ꉒ虂䚍咕ᅩ孽⻀\uf654쟣ퟏ늦ꝴ瑠ȫ䅘ᅫẵ䱷킷舴\u128e\ue91e⪒煨串ᴆ됅Ꮚ\ue797古垃끹藘녧쒐蟉乖", KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000", (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27895), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e7);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            values(null, null, "\u008f\u009b\u0091\u009a\u008c\u0093\u0099\u0089\u0098\u0097\u0089\u008f\u0096\u0093\u008c\u0095\u008f\u0094\u0089\u0088\u008f\u008a\u0089\u0088\u008f\u0090\u0091\u008c\u0093\u008b\u0092\u0089\u0091\u0089\u0090\u008f\u008e\u0089\u008d\u008c\u008b\u008a", 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e7);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            values(null, null, "\u009c\u009c\u009c\u009c\u008a\u0089\u0088", TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String AFKeystoreWrapper() {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1fSDK.AFKeystoreWrapper():java.lang.String");
    }

    public static void valueOf() {
        AFInAppEventType = 0;
        valueOf = (char) 35907;
        AFInAppEventParameterName = 0L;
        afRDLog = true;
        AFLogger = new char[]{175, 176, 192, 163, 179, 162, 165, 204, 198, 199, 194, 202, 205, 197, 129, 200, 207, 211, 213, 218, 216, 201, 217, 196, 209, 208, 155, 154, 151, 143, 146, 147, 142, 139, 183, 214, 215, 206, 153, 212};
        afInfoLog = true;
        afDebugLog = 97;
    }

    private static void values(int[] iArr, String str, String str2, int i7, Object[] objArr) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFg1tSDK.AFKeystoreWrapper) {
            try {
                char[] cArr3 = AFLogger;
                int i8 = afDebugLog;
                if (afInfoLog) {
                    int length = bArr2.length;
                    AFg1tSDK.values = length;
                    char[] cArr4 = new char[length];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        int i9 = AFg1tSDK.valueOf;
                        int i10 = AFg1tSDK.values - 1;
                        int i11 = AFg1tSDK.valueOf;
                        cArr4[i9] = (char) (cArr3[bArr2[i10 - i11] + i7] - i8);
                        AFg1tSDK.valueOf = i11 + 1;
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (afRDLog) {
                    int length2 = cArr2.length;
                    AFg1tSDK.values = length2;
                    char[] cArr5 = new char[length2];
                    AFg1tSDK.valueOf = 0;
                    while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                        int i12 = AFg1tSDK.valueOf;
                        int i13 = AFg1tSDK.values - 1;
                        int i14 = AFg1tSDK.valueOf;
                        cArr5[i12] = (char) (cArr3[cArr2[i13 - i14] - i7] - i8);
                        AFg1tSDK.valueOf = i14 + 1;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                int length3 = iArr.length;
                AFg1tSDK.values = length3;
                char[] cArr6 = new char[length3];
                AFg1tSDK.valueOf = 0;
                while (AFg1tSDK.valueOf < AFg1tSDK.values) {
                    int i15 = AFg1tSDK.valueOf;
                    int i16 = AFg1tSDK.values - 1;
                    int i17 = AFg1tSDK.valueOf;
                    cArr6[i15] = (char) (cArr3[iArr[i16 - i17] - i7] - i8);
                    AFg1tSDK.valueOf = i17 + 1;
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void AFInAppEventType(String str, String str2, int i7, String str3, char c7, Object[] objArr) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (AFg1vSDK.valueOf) {
            try {
                char[] cArr7 = (char[]) cArr6.clone();
                char[] cArr8 = (char[]) cArr2.clone();
                cArr7[0] = (char) (c7 ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i7));
                int length = cArr4.length;
                char[] cArr9 = new char[length];
                AFg1vSDK.values = 0;
                while (true) {
                    int i8 = AFg1vSDK.values;
                    if (i8 < length) {
                        int i9 = (i8 + 2) % 4;
                        int i10 = (i8 + 3) % 4;
                        int i11 = cArr7[i8 % 4] * 32718;
                        char c8 = cArr8[i9];
                        char c9 = (char) ((i11 + c8) % 65535);
                        AFg1vSDK.AFInAppEventParameterName = c9;
                        cArr8[i10] = (char) (((cArr7[i10] * 32718) + c8) / 65535);
                        cArr7[i10] = c9;
                        int i12 = AFg1vSDK.values;
                        cArr9[i12] = (char) ((((c9 ^ cArr4[i12]) ^ AFInAppEventParameterName) ^ AFInAppEventType) ^ valueOf);
                        AFg1vSDK.values = i12 + 1;
                    } else {
                        str4 = new String(cArr9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        objArr[0] = str4;
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) {
        int charAt;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i7 = 0;
        while (i7 < 3) {
            int i8 = afErrorLog + 93;
            afErrorLogForExcManagerOnly = i8 % 128;
            if (i8 % 2 == 0) {
                arrayList.add(Integer.valueOf(strArr[i7].length()));
                i7 += 34;
            } else {
                arrayList.add(Integer.valueOf(strArr[i7].length()));
                i7++;
            }
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < intValue; i9++) {
            Integer num = null;
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = afErrorLog + 115;
                afErrorLogForExcManagerOnly = i11 % 128;
                if (i11 % 2 == 0) {
                    charAt = strArr[i10].charAt(i9);
                    int i12 = 46 / 0;
                    if (num == null) {
                        num = Integer.valueOf(charAt);
                    }
                    charAt ^= num.intValue();
                    num = Integer.valueOf(charAt);
                } else {
                    charAt = strArr[i10].charAt(i9);
                    if (num == null) {
                        num = Integer.valueOf(charAt);
                    }
                    charAt ^= num.intValue();
                    num = Integer.valueOf(charAt);
                }
            }
            sb.append(Integer.toHexString(num.intValue()));
        }
        return sb;
    }
}
