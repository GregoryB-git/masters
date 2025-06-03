package J;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class w {

    public static class a {
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        public static void c(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollX(i7);
        }

        public static void d(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollY(i7);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i7) {
        a.c(accessibilityRecord, i7);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i7) {
        a.d(accessibilityRecord, i7);
    }
}
