/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  java.io.ByteArrayOutputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 */
package R2;

import E2.e;
import R2.C;
import R2.G2;
import R2.N2;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.f;
import R2.g;
import R2.l2;
import R2.l3;
import R2.m3;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

public final class q4
extends l3 {
    public q4(N2 n22) {
        super(n22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] v(HttpURLConnection arrby) {
        byte[] arrby2;
        byte[] arrby3 = arrby2 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            arrby3 = arrby2;
            arrby3 = arrby = arrby.getInputStream();
            arrby2 = new byte[1024];
            do {
                arrby3 = arrby;
                int n8 = arrby.read(arrby2);
                if (n8 <= 0) break;
                arrby3 = arrby;
                byteArrayOutputStream.write(arrby2, 0, n8);
            } while (true);
            arrby3 = arrby;
            arrby2 = byteArrayOutputStream.toByteArray();
        }
        catch (Throwable throwable) {}
        arrby.close();
        return arrby2;
        if (arrby3 != null) {
            arrby3.close();
        }
        throw throwable;
    }

    @Override
    public final boolean s() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean w() {
        this.o();
        ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
        if (connectivityManager == null) return false;
        try {
            connectivityManager = connectivityManager.getActiveNetworkInfo();
            if (connectivityManager == null) return false;
        }
        catch (SecurityException securityException) {
            return false;
        }
        if (!connectivityManager.isConnected()) return false;
        return true;
    }
}

