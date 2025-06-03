// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J;

import android.view.accessibility.AccessibilityRecord;

public abstract class w
{
    public static void a(final AccessibilityRecord accessibilityRecord, final int n) {
        a.c(accessibilityRecord, n);
    }
    
    public static void b(final AccessibilityRecord accessibilityRecord, final int n) {
        a.d(accessibilityRecord, n);
    }
    
    public abstract static class a
    {
        public static int a(final AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }
        
        public static int b(final AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }
        
        public static void c(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
            accessibilityRecord.setMaxScrollX(maxScrollX);
        }
        
        public static void d(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
            accessibilityRecord.setMaxScrollY(maxScrollY);
        }
    }
}
