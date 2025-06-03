package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AFf1gSDK {

    public enum AFa1vSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");

        String values;

        AFa1vSDK(String str) {
            this.values = str;
        }
    }

    public enum AFa1xSDK {
        NONE,
        FIRST,
        ALL
    }

    public enum AFa1zSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);

        private int afRDLog;

        AFa1zSDK(int i7) {
            this.afRDLog = i7;
        }
    }

    public static List<BigDecimal> AFKeystoreWrapper(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f7 = (Float) arrayList.get(0);
        Float f8 = (Float) arrayList.get(1);
        Float f9 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f7.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f8.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f9.toString())));
        } catch (ParseException e7) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", e7);
        }
        return arrayList2;
    }
}
