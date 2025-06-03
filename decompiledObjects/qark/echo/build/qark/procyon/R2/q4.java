// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import E2.e;
import android.content.Context;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;

public final class q4 extends l3
{
    public q4(final N2 n2) {
        super(n2);
    }
    
    public static byte[] v(final HttpURLConnection httpURLConnection) {
        InputStream inputStream2;
        final InputStream inputStream = inputStream2 = null;
        while (true) {
            try {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                inputStream2 = inputStream;
                final InputStream inputStream3 = inputStream2 = httpURLConnection.getInputStream();
                final byte[] array = new byte[1024];
                while (true) {
                    inputStream2 = inputStream3;
                    final int read = inputStream3.read(array);
                    if (read <= 0) {
                        break;
                    }
                    inputStream2 = inputStream3;
                    byteArrayOutputStream.write(array, 0, read);
                }
                inputStream2 = inputStream3;
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                inputStream3.close();
                return byteArray;
                while (true) {
                    inputStream2.close();
                    Label_0075: {
                        throw;
                    }
                    continue;
                }
            }
            // iftrue(Label_0075:, inputStream2 == null)
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final boolean s() {
        return false;
    }
    
    public final boolean w() {
        this.o();
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
        while (true) {
            if (connectivityManager == null) {
                break Label_0029;
            }
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                activeNetworkInfo = null;
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
            catch (SecurityException ex) {
                continue;
            }
            break;
        }
    }
}
