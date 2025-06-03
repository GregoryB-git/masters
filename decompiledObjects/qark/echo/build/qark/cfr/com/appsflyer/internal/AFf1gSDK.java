/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigDecimal
 *  java.text.ParseException
 *  java.util.ArrayList
 *  java.util.List
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public final class AFf1gSDK {
    public static List<BigDecimal> AFKeystoreWrapper(Object object) {
        ArrayList arrayList = (ArrayList)object;
        object = (Float)arrayList.get(0);
        Float f8 = (Float)arrayList.get(1);
        Float f9 = (Float)arrayList.get(2);
        arrayList = new ArrayList();
        try {
            arrayList.add((Object)BigDecimal.valueOf((double)AFc1uSDK.AFa1wSDK.values(object.toString())));
            arrayList.add((Object)BigDecimal.valueOf((double)AFc1uSDK.AFa1wSDK.values(f8.toString())));
            arrayList.add((Object)BigDecimal.valueOf((double)AFc1uSDK.AFa1wSDK.values(f9.toString())));
            return arrayList;
        }
        catch (ParseException parseException) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", (Throwable)parseException);
            return arrayList;
        }
    }

    public static final class AFa1vSDK
    extends Enum<AFa1vSDK> {
        private static /* enum */ AFa1vSDK AFInAppEventParameterName;
        private static /* enum */ AFa1vSDK AFInAppEventType;
        private static /* enum */ AFa1vSDK AFKeystoreWrapper;
        private static /* enum */ AFa1vSDK AFLogger;
        private static final /* synthetic */ AFa1vSDK[] afErrorLog;
        private static /* enum */ AFa1vSDK valueOf;
        String values;

        static {
            AFa1vSDK aFa1vSDK;
            AFKeystoreWrapper = new AFa1vSDK("uk");
            AFInAppEventType = new AFa1vSDK("am");
            valueOf = new AFa1vSDK("mm");
            AFInAppEventParameterName = new AFa1vSDK("rs");
            AFLogger = aFa1vSDK = new AFa1vSDK("gs");
            afErrorLog = new AFa1vSDK[]{AFKeystoreWrapper, AFInAppEventType, valueOf, AFInAppEventParameterName, aFa1vSDK};
        }

        private AFa1vSDK(String string3) {
            this.values = string3;
        }

        public static AFa1vSDK valueOf(String string2) {
            return (AFa1vSDK)Enum.valueOf(AFa1vSDK.class, (String)string2);
        }

        public static AFa1vSDK[] values() {
            return (AFa1vSDK[])afErrorLog.clone();
        }
    }

    public static final class AFa1xSDK
    extends Enum<AFa1xSDK> {
        public static final /* enum */ AFa1xSDK AFInAppEventType;
        private static final /* synthetic */ AFa1xSDK[] AFKeystoreWrapper;
        public static final /* enum */ AFa1xSDK valueOf;
        public static final /* enum */ AFa1xSDK values;

        static {
            AFa1xSDK aFa1xSDK;
            AFa1xSDK aFa1xSDK2;
            AFa1xSDK aFa1xSDK3;
            valueOf = aFa1xSDK2 = new AFa1xSDK();
            values = aFa1xSDK = new AFa1xSDK();
            AFInAppEventType = aFa1xSDK3 = new AFa1xSDK();
            AFKeystoreWrapper = new AFa1xSDK[]{aFa1xSDK2, aFa1xSDK, aFa1xSDK3};
        }

        private AFa1xSDK() {
        }

        public static AFa1xSDK valueOf(String string2) {
            return (AFa1xSDK)Enum.valueOf(AFa1xSDK.class, (String)string2);
        }

        public static AFa1xSDK[] values() {
            return (AFa1xSDK[])AFKeystoreWrapper.clone();
        }
    }

    public static final class AFa1zSDK
    extends Enum<AFa1zSDK> {
        public static final /* enum */ AFa1zSDK AFInAppEventParameterName;
        private static /* enum */ AFa1zSDK AFInAppEventType;
        private static /* enum */ AFa1zSDK AFKeystoreWrapper;
        private static final /* synthetic */ AFa1zSDK[] AFLogger;
        private static /* enum */ AFa1zSDK valueOf;
        private static /* enum */ AFa1zSDK values;
        private int afRDLog;

        static {
            AFa1zSDK aFa1zSDK;
            AFa1zSDK aFa1zSDK2;
            AFInAppEventType = new AFa1zSDK(0);
            valueOf = new AFa1zSDK(1);
            AFInAppEventParameterName = aFa1zSDK2 = new AFa1zSDK(2);
            AFKeystoreWrapper = new AFa1zSDK(3);
            values = aFa1zSDK = new AFa1zSDK(4);
            AFLogger = new AFa1zSDK[]{AFInAppEventType, valueOf, aFa1zSDK2, AFKeystoreWrapper, aFa1zSDK};
        }

        private AFa1zSDK(int n9) {
            this.afRDLog = n9;
        }

        public static AFa1zSDK valueOf(String string2) {
            return (AFa1zSDK)Enum.valueOf(AFa1zSDK.class, (String)string2);
        }

        public static AFa1zSDK[] values() {
            return (AFa1zSDK[])AFLogger.clone();
        }
    }

}

