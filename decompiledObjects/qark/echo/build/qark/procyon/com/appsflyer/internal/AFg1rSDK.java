// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFg1rSDK
{
    public static final Object AFInAppEventParameterName;
    public static int AFInAppEventType;
    public static int AFKeystoreWrapper;
    
    static {
        AFInAppEventParameterName = new Object();
    }
    
    public static char[] AFInAppEventType(final long n, final char[] array, final int n2) {
        final int length = array.length;
        final char[] array2 = new char[length];
        int i = 0;
        int n3 = 0;
        int n4 = 4;
        while (i < array.length) {
            if (((n >>> i & 0x1L) != n2 || n3 >= 4) && n4 < length) {
                array2[n4] = array[i];
                ++n4;
            }
            else {
                array2[n3] = array[i];
                ++n3;
            }
            ++i;
        }
        return array2;
    }
}
