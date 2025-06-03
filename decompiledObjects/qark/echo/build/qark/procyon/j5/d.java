// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

public enum d
{
    q("RSA_ECB_PKCS1Padding", 0, (e)new b(), 1), 
    r("RSA_ECB_OAEPwithSHA_256andMGF1Padding", 1, (e)new c(), 23);
    
    public final e o;
    public final int p;
    
    static {
        s = c();
    }
    
    public d(final String name, final int ordinal, final e o, final int p4) {
        this.o = o;
        this.p = p4;
    }
    
    public static /* synthetic */ d[] c() {
        return new d[] { d.q, d.r };
    }
}
