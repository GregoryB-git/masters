/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 */
package R4;

public abstract class e {
    public static /* synthetic */ int a(double d8) {
        long l8 = Double.doubleToLongBits((double)d8);
        return (int)(l8 ^ l8 >>> 32);
    }
}

