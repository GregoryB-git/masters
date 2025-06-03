package com.appsflyer.internal;

import android.util.Base64;
import j3.C1373c;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class AFc1zSDK {

    @NotNull
    public static final AFa1xSDK AFInAppEventParameterName = new AFa1xSDK(0);

    @NotNull
    public final String AFInAppEventType;

    @NotNull
    public final String AFKeystoreWrapper;
    public int valueOf;

    @NotNull
    public final String values;

    @Metadata
    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        public /* synthetic */ AFa1xSDK(byte b7) {
            this();
        }

        public static AFc1zSDK AFInAppEventParameterName(@NotNull String str) {
            List<String> V6;
            boolean s7;
            boolean s8;
            boolean s9;
            boolean s10;
            CharSequence f02;
            Intrinsics.checkNotNullParameter(str, "");
            V6 = kotlin.text.s.V(str, new String[]{"\n"}, false, 0, 6, null);
            if (V6.size() != 4) {
                return null;
            }
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num = null;
            for (String str5 : V6) {
                s7 = kotlin.text.r.s(str5, "label=", false, 2, null);
                if (!s7) {
                    s8 = kotlin.text.r.s(str5, "hashName=", false, 2, null);
                    if (!s8) {
                        s9 = kotlin.text.r.s(str5, "stackTrace=", false, 2, null);
                        if (!s9) {
                            s10 = kotlin.text.r.s(str5, "c=", false, 2, null);
                            if (!s10) {
                                break;
                            }
                            String substring = str5.substring(2);
                            Intrinsics.checkNotNullExpressionValue(substring, "");
                            f02 = kotlin.text.s.f0(substring);
                            num = Integer.valueOf(Integer.parseInt(f02.toString()));
                        } else {
                            str4 = values(str5, "stackTrace=");
                        }
                    } else {
                        str3 = values(str5, "hashName=");
                    }
                } else {
                    str2 = values(str5, "label=");
                }
            }
            if (AFKeystoreWrapper(num, str2, str3, str4)) {
                return null;
            }
            Intrinsics.b(str2);
            Intrinsics.b(str3);
            Intrinsics.b(str4);
            Intrinsics.b(num);
            return new AFc1zSDK(str2, str3, str4, num.intValue());
        }

        private static boolean AFKeystoreWrapper(Integer num, String... strArr) {
            boolean z7 = num == null;
            int length = strArr.length;
            for (int i7 = 0; i7 < 3; i7++) {
                String str = strArr[i7];
                z7 = z7 || str == null || str.length() == 0;
            }
            return z7;
        }

        private static String values(String str, String str2) {
            CharSequence f02;
            String substring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            f02 = kotlin.text.s.f0(substring);
            String obj = f02.toString();
            Intrinsics.checkNotNullParameter(obj, "");
            Charset charset = kotlin.text.b.f16240b;
            byte[] bytes = obj.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, charset);
        }
    }

    public /* synthetic */ AFc1zSDK(String str, String str2, String str3) {
        this(str, str2, str3, 1);
    }

    @NotNull
    public final JSONObject AFInAppEventParameterName() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.AFInAppEventType);
        jSONObject.put("hash_name", this.AFKeystoreWrapper);
        jSONObject.put("st", this.values);
        jSONObject.put(C1373c.f15449d, String.valueOf(this.valueOf));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1zSDK)) {
            return false;
        }
        AFc1zSDK aFc1zSDK = (AFc1zSDK) obj;
        return Intrinsics.a(this.AFInAppEventType, aFc1zSDK.AFInAppEventType) && Intrinsics.a(this.AFKeystoreWrapper, aFc1zSDK.AFKeystoreWrapper) && Intrinsics.a(this.values, aFc1zSDK.values) && this.valueOf == aFc1zSDK.valueOf;
    }

    public final int hashCode() {
        return (((((this.AFInAppEventType.hashCode() * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.values.hashCode()) * 31) + this.valueOf;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExceptionInfo(label=");
        sb.append(this.AFInAppEventType);
        sb.append(", hashName=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", stackTrace=");
        sb.append(this.values);
        sb.append(", counter=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public AFc1zSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = str2;
        this.values = str3;
        this.valueOf = i7;
    }
}
