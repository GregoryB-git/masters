/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Locale
 */
package com.yandex.metrica.coreutils.logger;

import com.yandex.metrica.coreutils.logger.BaseLogger;
import com.yandex.metrica.coreutils.logger.YLoggerImpl;
import java.util.Locale;

class DebugLogger
extends BaseLogger {
    public static final int STACK_OFFSET = 5;

    public DebugLogger(boolean bl) {
        super(bl);
    }

    @Override
    public String formatMessage(String object, Object[] object2) {
        Object object3;
        block2: {
            object3 = object;
            if (object2 != null) {
                object3 = ((Object[])object2).length == 0 ? object : String.format((Locale)Locale.US, (String)object, (Object[])object2);
            }
            object = new Throwable().fillInStackTrace().getStackTrace();
            for (int i2 = 5; i2 < ((StackTraceElement[])object).length; ++i2) {
                object2 = object[i2].getClassName();
                if (YLoggerImpl.REGISTERED_LOGGER_CLASSES.contains(object2)) continue;
                object2 = object[i2].getClassName();
                object2 = object2.substring(object2.lastIndexOf(46) + 1);
                object2 = z2.u(object2.substring(object2.lastIndexOf(36) + 1), ".");
                object2.append(object[i2].getMethodName());
                object = object2.toString();
                break block2;
            }
            object = "<unknown>";
        }
        return String.format((Locale)Locale.US, (String)"[%d] %s: %s", (Object[])new Object[]{Thread.currentThread().getId(), object, object3});
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getTag() {
        return "AppMetricaDebug";
    }
}

