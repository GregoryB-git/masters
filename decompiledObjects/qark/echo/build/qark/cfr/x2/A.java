/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.util.Log
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 */
package x2;

import A2.n;
import A2.p0;
import A2.q0;
import H2.a;
import H2.b;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class A
extends p0 {
    public final int b;

    public A(byte[] arrby) {
        boolean bl = arrby.length == 25;
        n.a(bl);
        this.b = Arrays.hashCode((byte[])arrby);
    }

    public static byte[] v(String arrby) {
        try {
            arrby = arrby.getBytes("ISO-8859-1");
            return arrby;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public abstract byte[] Z0();

    @Override
    public final int c() {
        return this.b;
    }

    @Override
    public final a d() {
        return b.Z0(this.Z0());
    }

    public final boolean equals(Object arrby) {
        if (arrby != null) {
            block7 : {
                block6 : {
                    if (!(arrby instanceof q0)) {
                        return false;
                    }
                    arrby = (q0)arrby;
                    if (arrby.c() == this.b) break block6;
                    return false;
                }
                arrby = arrby.d();
                if (arrby != null) break block7;
                return false;
            }
            try {
                arrby = (byte[])b.v((a)arrby);
                boolean bl = Arrays.equals((byte[])this.Z0(), (byte[])arrby);
                return bl;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}

