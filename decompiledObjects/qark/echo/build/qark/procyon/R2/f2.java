// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import android.content.Context;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;

public final class f2 extends C5
{
    public f2(final D5 d5) {
        super(d5);
    }
    
    private static byte[] z(final HttpURLConnection httpURLConnection) {
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
                final Throwable t;
                Label_0075: {
                    throw t;
                }
                while (true) {
                    inputStream2.close();
                    throw t;
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
    
    public final boolean A() {
        this.u();
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        final NetworkInfo networkInfo = activeNetworkInfo = null;
        Label_0030: {
            if (connectivityManager == null) {
                break Label_0030;
            }
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
            catch (SecurityException ex) {
                activeNetworkInfo = networkInfo;
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
        }
    }
    
    @Override
    public final boolean x() {
        return false;
    }
}
