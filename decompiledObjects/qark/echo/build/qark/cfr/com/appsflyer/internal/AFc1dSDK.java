/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.util.Arrays
 *  java.util.List
 *  java.util.Locale
 */
package com.appsflyer.internal;

import V5.h;
import V5.l;
import W5.m;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFc1fSDK;
import g6.a;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.b;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1dSDK {
    @NotNull
    public static String AFInAppEventParameterName;
    @NotNull
    public static String AFKeystoreWrapper;
    @NotNull
    private static final List<String> afDebugLog;
    private static AFc1fSDK afErrorLog;
    @NotNull
    public static final AFa1zSDK values;
    @NotNull
    public final h AFInAppEventType;
    @NotNull
    private final AFb1dSDK AFLogger;
    @NotNull
    private final h afRDLog;
    @NotNull
    private final AFb1gSDK valueOf;

    static {
        values = new AFa1zSDK(0);
        AFInAppEventParameterName = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
        AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
        afDebugLog = m.i("googleplay", "playstore", "googleplaystore");
    }

    public AFc1dSDK(@NotNull AFb1gSDK aFb1gSDK, @NotNull AFb1dSDK aFb1dSDK) {
        Intrinsics.checkNotNullParameter(aFb1gSDK, "");
        Intrinsics.checkNotNullParameter(aFb1dSDK, "");
        this.valueOf = aFb1gSDK;
        this.AFLogger = aFb1dSDK;
        this.afRDLog = V5.i.a(new a(this){
            private /* synthetic */ AFc1dSDK AFInAppEventType;
            {
                this.AFInAppEventType = aFc1dSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                Object object = AFa1eSDK.AFInAppEventType(this.AFInAppEventType.AFLogger, this.AFInAppEventType.valueOf.values());
                String string2 = "";
                String string3 = object;
                if (object != null) {
                    if (i.F((CharSequence)object)) {
                        string3 = object;
                    } else {
                        string3 = i.f0((CharSequence)object).toString();
                        object = afDebugLog;
                        Object object2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(object2, "");
                        object2 = string3.toLowerCase((Locale)object2);
                        Intrinsics.checkNotNullExpressionValue(object2, "");
                        if (!object.contains(object2)) {
                            string3 = "-".concat(string3);
                        } else {
                            object = x.a;
                            string3 = String.format((String)"AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", (Object[])Arrays.copyOf((Object[])new Object[]{string3}, (int)1));
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            AFLogger.afWarnLog(string3);
                            string3 = "";
                        }
                    }
                }
                if (string3 == null) {
                    string3 = string2;
                }
                return i.f0(string3).toString();
            }
        });
        this.AFInAppEventType = V5.i.a(new a(this){
            private /* synthetic */ AFc1dSDK AFInAppEventType;
            {
                this.AFInAppEventType = aFc1dSDK;
                super(0);
            }

            @Override
            public final /* synthetic */ Object invoke() {
                String string2 = AFc1dSDK.AFInAppEventType((AFc1dSDK)this.AFInAppEventType).valueOf.AFInAppEventType.getPackageName();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return AFc1dSDK.values(string2, AFc1dSDK.AFKeystoreWrapper(this.AFInAppEventType));
            }
        });
    }

    public static boolean AFInAppEventType() {
        if (afErrorLog == null) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ String AFKeystoreWrapper(AFc1dSDK aFc1dSDK) {
        return (String)aFc1dSDK.afRDLog.getValue();
    }

    public static final void valueOf(AFc1fSDK aFc1fSDK) {
        afErrorLog = aFc1fSDK;
    }

    public static final /* synthetic */ String values(String object, String arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append((String)object);
        stringBuilder2.append((String)arrby);
        arrby = stringBuilder2.toString();
        Intrinsics.checkNotNullParameter(arrby, "");
        object = MessageDigest.getInstance((String)"SHA-256");
        arrby = arrby.getBytes(b.b);
        Intrinsics.checkNotNullExpressionValue(arrby, "");
        object = object.digest(arrby);
        Intrinsics.checkNotNullExpressionValue(object, "");
        object = Base64.encodeToString((byte[])object, (int)2);
        Intrinsics.checkNotNullExpressionValue(object, "");
        object = object.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(object, "");
        object = new Regex("[^\\w]+").replace((CharSequence)object, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(object, "");
        stringBuilder.append((String)object);
        stringBuilder.append('-');
        return stringBuilder.toString();
    }

    @NotNull
    public final String AFInAppEventParameterName() {
        Object object = AFc1dSDK.AFInAppEventType() ? AFc1aSDK.AFKeystoreWrapper : AFc1aSDK.AFInAppEventType;
        int n8 = AFa1vSDK.values[object.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return "";
                }
                throw new l();
            }
            object = afErrorLog;
            object = object != null ? object.valueOf : null;
            if (object == null) {
                return "";
            }
            return object;
        }
        return "appsflyersdk.com";
    }

    @NotNull
    public final String valueOf() {
        Object object = AFc1dSDK.AFInAppEventType() ? AFc1aSDK.AFKeystoreWrapper : AFc1aSDK.AFInAppEventType;
        int n8 = AFa1vSDK.values[object.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return "";
                }
                throw new l();
            }
            object = afErrorLog;
            object = object != null ? object.AFInAppEventParameterName : null;
            if (object == null) {
                return "";
            }
            return object;
        }
        return (String)this.AFInAppEventType.getValue();
    }

    @Metadata
    public final class AFa1vSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] arrn = new int[AFc1aSDK.values().length];
            arrn[AFc1aSDK.AFKeystoreWrapper.ordinal()] = 1;
            arrn[AFc1aSDK.AFInAppEventType.ordinal()] = 2;
            arrn[AFc1aSDK.values.ordinal()] = 3;
            values = arrn;
        }
    }

    @Metadata
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(byte by) {
            this();
        }
    }

}

