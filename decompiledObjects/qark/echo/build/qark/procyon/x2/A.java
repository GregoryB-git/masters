// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.os.RemoteException;
import android.util.Log;
import A2.q0;
import H2.b;
import H2.a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import A2.n;
import A2.p0;

public abstract class A extends p0
{
    public final int b;
    
    public A(final byte[] a) {
        n.a(a.length == 25);
        this.b = Arrays.hashCode(a);
    }
    
    public static byte[] v(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (UnsupportedEncodingException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    public abstract byte[] Z0();
    
    @Override
    public final int c() {
        return this.b;
    }
    
    @Override
    public final a d() {
        return H2.b.Z0(this.Z0());
    }
    
    public final boolean equals(final Object o) {
        if (o != null) {
            if (!(o instanceof q0)) {
                return false;
            }
            try {
                final q0 q0 = (q0)o;
                if (q0.c() != this.b) {
                    return false;
                }
                final a d = q0.d();
                return d != null && Arrays.equals(this.Z0(), (byte[])H2.b.v(d));
            }
            catch (RemoteException ex) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
            }
        }
        return false;
    }
    
    public final int hashCode() {
        return this.b;
    }
}
