// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j6;

public abstract class d
{
    public static final int a(final int n, final int n2) {
        return n >>> 32 - n2 & -n2 >> 31;
    }
}
