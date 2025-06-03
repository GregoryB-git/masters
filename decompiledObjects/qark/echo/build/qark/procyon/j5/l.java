// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

public enum l
{
    q("AES_CBC_PKCS7Padding", 0, (n)new j(), 1), 
    r("AES_GCM_NoPadding", 1, (n)new k(), 23);
    
    public final n o;
    public final int p;
    
    static {
        s = c();
    }
    
    public l(final String name, final int ordinal, final n o, final int p4) {
        this.o = o;
        this.p = p4;
    }
    
    public static /* synthetic */ l[] c() {
        return new l[] { l.q, l.r };
    }
}
