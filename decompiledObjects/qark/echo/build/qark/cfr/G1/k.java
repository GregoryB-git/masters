/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URL
 *  java.net.URLConnection
 */
package G1;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

public final class k
extends AsyncTask {
    public final String a;
    public final File b;
    public final a c;

    public k(String string2, File file, a a8) {
        Intrinsics.checkNotNullParameter(string2, "uriStr");
        Intrinsics.checkNotNullParameter((Object)file, "destFile");
        Intrinsics.checkNotNullParameter(a8, "onSuccess");
        this.a = string2;
        this.b = file;
        this.c = a8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public /* varargs */ Boolean a(String ... bl) {
        if (T1.a.d((Object)this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)bl, "args");
            bl = new URL(this.a);
            int n8 = ((URLConnection)FirebasePerfUrlConnection.instrument((Object)bl.openConnection())).getContentLength();
            DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream((URL)bl));
            bl = new byte[n8];
            dataInputStream.readFully((byte[])bl);
            dataInputStream.close();
            dataInputStream = new DataOutputStream((OutputStream)new FileOutputStream(this.b));
            dataInputStream.write((byte[])bl);
            dataInputStream.flush();
            dataInputStream.close();
            return Boolean.TRUE;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, (Object)this);
        return null;
        catch (Exception exception) {}
        return Boolean.FALSE;
    }

    public void b(boolean bl) {
        if (T1.a.d((Object)this)) {
            return;
        }
        if (bl) {
            try {
                this.c.a(this.b);
                return;
            }
            catch (Throwable throwable) {
                T1.a.b(throwable, (Object)this);
            }
        }
    }

    public static interface a {
        public void a(File var1);
    }

}

