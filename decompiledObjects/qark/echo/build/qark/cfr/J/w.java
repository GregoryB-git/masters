/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityRecord
 *  java.lang.Object
 */
package J;

import android.view.accessibility.AccessibilityRecord;

public abstract class w {
    public static void a(AccessibilityRecord accessibilityRecord, int n8) {
        a.c(accessibilityRecord, n8);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int n8) {
        a.d(accessibilityRecord, n8);
    }

    public static abstract class a {
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        public static void c(AccessibilityRecord accessibilityRecord, int n8) {
            accessibilityRecord.setMaxScrollX(n8);
        }

        public static void d(AccessibilityRecord accessibilityRecord, int n8) {
            accessibilityRecord.setMaxScrollY(n8);
        }
    }

}

