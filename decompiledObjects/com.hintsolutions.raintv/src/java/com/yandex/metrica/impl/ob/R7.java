/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.LocalServerSocket
 *  android.net.LocalSocket
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.r7$b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.r7;
import com.yandex.metrica.impl.ob.w7;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RequiresApi(value=21)
public class r7 {
    @NonNull
    private final String a;
    private LocalServerSocket b;
    private volatile boolean c = false;
    @NonNull
    private final w7 d;
    @NonNull
    private final Zl<String> e;
    @Nullable
    private final String f;
    private List<Zl<String>> g = new LinkedList();
    private final Thread h = new Thread(this){
        public final r7 a;
        {
            this.a = r72;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void run() {
            while (this.a.c) {
                try {
                    LocalSocket localSocket = this.a.b.accept();
                    byte[] byArray = new byte[256];
                    int n4 = localSocket.getInputStream().read(byArray);
                    localSocket.close();
                    byte[] byArray2 = new byte[n4];
                    System.arraycopy((Object)byArray, (int)0, (Object)byArray2, (int)0, (int)n4);
                    r7 r72 = this.a;
                    String string = new String(byArray2);
                    r7.a(r72, string);
                }
                catch (Throwable throwable) {
                }
            }
        }
    };

    public r7(@NonNull String string, @Nullable String string2) {
        this(string, string2, w7.a(), (Zl<String>)new b());
    }

    @VisibleForTesting
    public r7(@NonNull String string, @Nullable String string2, @NonNull w7 w72, @NonNull Zl<String> zl) {
        this.a = string;
        this.f = string2;
        this.d = w72;
        this.e = zl;
    }

    public static void a(r7 r72, String string) {
        r7 r73 = r72;
        synchronized (r73) {
            Iterator iterator = r72.g.iterator();
            while (iterator.hasNext()) {
                ((Zl)iterator.next()).b(string);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a(@NonNull Zl<String> localServerSocket) {
        r7 r72 = this;
        // MONITORENTER : r72
        this.g.add((Object)localServerSocket);
        // MONITOREXIT : r72
        if (this.c) return;
        if (this.f == null) return;
        r72 = this;
        // MONITORENTER : r72
        boolean bl = this.c;
        if (bl) return;
        try {
            if (this.d.b()) {
                this.b = localServerSocket = new LocalServerSocket(this.a);
                this.c = true;
                this.e.b(this.f);
                this.h.start();
            }
            // MONITOREXIT : r72
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public void b(@NonNull Zl<String> zl) {
        r7 r72 = this;
        synchronized (r72) {
            this.g.remove(zl);
            return;
        }
    }
}

