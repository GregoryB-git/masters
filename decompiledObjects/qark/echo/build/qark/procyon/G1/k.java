// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.net.URLConnection;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import T1.a;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import android.os.AsyncTask;

public final class k extends AsyncTask
{
    public final String a;
    public final File b;
    public final a c;
    
    public k(final String a, final File b, final a c) {
        Intrinsics.checkNotNullParameter(a, "uriStr");
        Intrinsics.checkNotNullParameter(b, "destFile");
        Intrinsics.checkNotNullParameter(c, "onSuccess");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Boolean a(final String... array) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            Label_0114: {
                try {
                    Intrinsics.checkNotNullParameter(array, "args");
                    final k k = this;
                    final String s = k.a;
                    final URL url = new URL(s);
                    final URL url3;
                    final URL url2 = url3 = url;
                    final URLConnection urlConnection = url3.openConnection();
                    final Object o = FirebasePerfUrlConnection.instrument(urlConnection);
                    final URLConnection urlConnection2 = (URLConnection)o;
                    final int n = urlConnection2.getContentLength();
                    final URL url4 = url2;
                    final InputStream inputStream = FirebasePerfUrlConnection.openStream(url4);
                    final DataInputStream dataInputStream = new DataInputStream(inputStream);
                    final int n2 = n;
                    final byte[] array2 = new byte[n2];
                    final DataInputStream dataInputStream2 = dataInputStream;
                    final byte[] array3 = array2;
                    dataInputStream2.readFully(array3);
                    final DataInputStream dataInputStream3 = dataInputStream;
                    dataInputStream3.close();
                    final k i = this;
                    final File file = i.b;
                    final FileOutputStream fileOutputStream = new FileOutputStream(file);
                    final DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    final DataOutputStream dataOutputStream3;
                    final DataOutputStream dataOutputStream2 = dataOutputStream3 = dataOutputStream;
                    final byte[] array4 = array2;
                    dataOutputStream3.write(array4);
                    final DataOutputStream dataOutputStream4 = dataOutputStream2;
                    dataOutputStream4.flush();
                    final DataOutputStream dataOutputStream5 = dataOutputStream2;
                    dataOutputStream5.close();
                    final Boolean true = Boolean.TRUE;
                    return true;
                }
                finally {
                    final Object o2;
                    final Throwable t = (Throwable)o2;
                    break Label_0114;
                }
                try {
                    final k k = this;
                    final String s = k.a;
                    final URL url = new URL(s);
                    final URL url3;
                    final URL url2 = url3 = url;
                    final URLConnection urlConnection = url3.openConnection();
                    final Object o = FirebasePerfUrlConnection.instrument(urlConnection);
                    final URLConnection urlConnection2 = (URLConnection)o;
                    final int n = urlConnection2.getContentLength();
                    final URL url4 = url2;
                    final InputStream inputStream = FirebasePerfUrlConnection.openStream(url4);
                    final DataInputStream dataInputStream = new DataInputStream(inputStream);
                    final int n2 = n;
                    final byte[] array2 = new byte[n2];
                    final DataInputStream dataInputStream2 = dataInputStream;
                    final byte[] array3 = array2;
                    dataInputStream2.readFully(array3);
                    final DataInputStream dataInputStream3 = dataInputStream;
                    dataInputStream3.close();
                    final k i = this;
                    final File file = i.b;
                    final FileOutputStream fileOutputStream = new FileOutputStream(file);
                    final DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    final DataOutputStream dataOutputStream3;
                    final DataOutputStream dataOutputStream2 = dataOutputStream3 = dataOutputStream;
                    final byte[] array4 = array2;
                    dataOutputStream3.write(array4);
                    final DataOutputStream dataOutputStream4 = dataOutputStream2;
                    dataOutputStream4.flush();
                    final DataOutputStream dataOutputStream5 = dataOutputStream2;
                    dataOutputStream5.close();
                    final Boolean true2;
                    final Boolean true = true2 = Boolean.TRUE;
                    return true2;
                    return Boolean.FALSE;
                    final Throwable t;
                    T1.a.b(t, this);
                    return null;
                }
                catch (Exception ex) {}
            }
            continue;
        }
    }
    
    public void b(final boolean b) {
        if (T1.a.d(this)) {
            return;
        }
        if (b) {
            try {
                this.c.a(this.b);
            }
            finally {
                final Throwable t;
                T1.a.b(t, this);
            }
        }
    }
    
    public interface a
    {
        void a(final File p0);
    }
}
