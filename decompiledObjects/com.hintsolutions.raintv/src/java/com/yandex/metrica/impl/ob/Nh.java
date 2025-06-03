/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.wh
 *  java.io.BufferedOutputStream
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.uh;
import com.yandex.metrica.impl.ob.wh;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

public abstract class nh {
    @NonNull
    public final Socket a;
    @NonNull
    public final th b;
    @NonNull
    public final Qh c;
    @NonNull
    public final Uri d;
    @NonNull
    public final uh e;

    public nh(@NonNull Socket socket, @NonNull Uri uri, @NonNull th th2, @NonNull Qh qh, @NonNull uh uh2) {
        this.a = socket;
        this.d = uri;
        this.b = th2;
        this.c = qh;
        this.e = uh2;
    }

    private void a(@NonNull OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }

    private void a(@NonNull OutputStream outputStream, @NonNull String string, @NonNull String string2) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(": ");
        stringBuilder.append(string2);
        outputStream.write(stringBuilder.toString().getBytes());
        this.a(outputStream);
    }

    public abstract void a();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull String object5, @NonNull Map<String, String> object2, @NonNull byte[] object3) {
        void var1_4;
        String string;
        block10: {
            Object object4;
            block12: {
                block11: {
                    int n4;
                    String string2;
                    this.e.b();
                    Object var7_10 = null;
                    string = string2 = null;
                    try {
                        string = string2;
                        object4 = new BufferedOutputStream(this.a.getOutputStream());
                    }
                    catch (Throwable throwable) {
                        break block10;
                    }
                    catch (IOException iOException) {
                        object5 = var7_10;
                        break block11;
                    }
                    try {
                        object4.write(object5.getBytes());
                        this.a((OutputStream)object4);
                        for (Object object5 : object2.entrySet()) {
                            this.a((OutputStream)object4, (String)object5.getKey(), (String)object5.getValue());
                        }
                        this.a((OutputStream)object4);
                        object4.write(object3);
                        object4.flush();
                        this.e.c();
                        object2 = this.b;
                        n4 = this.a.getLocalPort();
                        object5 = this.e;
                    }
                    catch (Throwable throwable) {
                        string = object4;
                        break block10;
                    }
                    catch (IOException iOException) {
                        object5 = object4;
                        break block11;
                    }
                    object2 = (wh)object2;
                    {
                        object2.b(n4, (uh)object5);
                        break block12;
                    }
                }
                string = object5;
                {
                    object3 = this.b;
                }
                object3 = (wh)object3;
                string = object5;
                {
                    void var2_8;
                    object3.a("io_exception_during_sync", (Throwable)var2_8);
                    object4 = object5;
                }
            }
            A2.a((Closeable)object4);
            return;
        }
        A2.a(string);
        throw var1_4;
    }
}

