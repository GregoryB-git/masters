/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.SSLCertificateSocketFactory
 *  android.net.SSLSessionCache
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$State
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.net.URI
 *  java.net.UnknownHostException
 *  java.nio.charset.Charset
 *  java.util.Map
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSession
 *  javax.net.ssl.SSLSocket
 */
package e4;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import e4.b;
import e4.e;
import e4.f;
import e4.h;
import e4.i;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

public class c {
    public static final AtomicInteger l = new AtomicInteger(0);
    public static final Charset m = Charset.forName((String)"UTF-8");
    public static ThreadFactory n = Executors.defaultThreadFactory();
    public static b o = new b(){

        @Override
        public void a(Thread thread, String string2) {
            thread.setName(string2);
        }
    };
    public volatile d a = d.o;
    public volatile Socket b = null;
    public e4.d c = null;
    public final URI d;
    public final String e;
    public final h f;
    public final i g;
    public final f h;
    public final c4.c i;
    public final int j;
    public final Thread k;

    public c(T3.c object, URI uRI, String string2, Map map) {
        int n8;
        this.j = n8 = l.incrementAndGet();
        this.k = c.j().newThread(new Runnable(){

            public void run() {
                c.this.n();
            }
        });
        this.d = uRI;
        this.e = object.g();
        object = object.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("sk_");
        stringBuilder.append(n8);
        this.i = new c4.c((c4.d)object, "WebSocket", stringBuilder.toString());
        this.h = new f(uRI, string2, map);
        this.f = new h(this);
        this.g = new i(this, "TubeSock", n8);
    }

    public static b i() {
        return o;
    }

    public static ThreadFactory j() {
        return n;
    }

    public void b() {
        if (this.g.d().getState() != Thread.State.NEW) {
            this.g.d().join();
        }
        this.h().join();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c() {
        synchronized (this) {
            Throwable throwable2;
            block8 : {
                block4 : {
                    block5 : {
                        block6 : {
                            block7 : {
                                try {
                                    int n8 = .a[this.a.ordinal()];
                                    if (n8 == 1) break block4;
                                    if (n8 == 2) break block5;
                                    if (n8 == 3) break block6;
                                    if (n8 == 4) break block7;
                                }
                                catch (Throwable throwable2) {}
                                return;
                            }
                            return;
                        }
                        this.q();
                        return;
                        break block8;
                    }
                    this.d();
                    return;
                }
                this.a = d.s;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        block8 : {
            d d8;
            block7 : {
                // MONITORENTER : this
                d8 = this.a;
                d d9 = d.s;
                if (d8 != d9) break block7;
                return;
            }
            this.f.h();
            this.g.i();
            d8 = this.b;
            if (d8 != null) {
                this.b.close();
            }
            break block8;
            catch (Exception exception) {
                this.c.d(new e("Failed to close", (Throwable)exception));
            }
        }
        this.a = d.s;
        this.c.b();
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void e() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (this.a != d.o) {
                        this.c.d(new e("connect() already called"));
                        this.c();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                b b8 = c.i();
                Thread thread = this.h();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("TubeSockReader-");
                stringBuilder.append(this.j);
                b8.a(thread, stringBuilder.toString());
                this.a = d.p;
                this.h().start();
                return;
            }
            throw throwable2;
        }
    }

    public final Socket f() {
        String string2 = this.d.getScheme();
        String string3 = this.d.getHost();
        int n8 = this.d.getPort();
        if (string2 != null && string2.equals((Object)"ws")) {
            UnknownHostException unknownHostException2;
            block14 : {
                int n9 = n8;
                if (n8 == -1) {
                    n9 = 80;
                }
                try {
                    string2 = new Socket(string3, n9);
                    return string2;
                }
                catch (IOException iOException) {
                }
                catch (UnknownHostException unknownHostException2) {
                    break block14;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("error while creating socket to ");
                stringBuilder.append((Object)this.d);
                throw new e(stringBuilder.toString(), (Throwable)iOException);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unknown host: ");
            stringBuilder.append(string3);
            throw new e(stringBuilder.toString(), (Throwable)unknownHostException2);
        }
        if (string2 != null && string2.equals((Object)"wss")) {
            StringBuilder stringBuilder;
            UnknownHostException unknownHostException3;
            block17 : {
                IOException iOException3;
                block15 : {
                    int n10 = n8;
                    if (n8 == -1) {
                        n10 = 443;
                    }
                    stringBuilder = null;
                    string2 = stringBuilder;
                    try {
                        if (this.e != null) {
                            string2 = new SSLSessionCache(new File(this.e));
                        }
                    }
                    catch (IOException iOException2) {
                        this.i.a("Failed to initialize SSL session cache", (Throwable)iOException2, new Object[0]);
                        string2 = stringBuilder;
                    }
                    string2 = (SSLSocket)SSLCertificateSocketFactory.getDefault((int)60000, (SSLSessionCache)string2).createSocket(string3, n10);
                    if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(string3, string2.getSession())) break block15;
                    return string2;
                }
                try {
                    string2 = new StringBuilder();
                    string2.append("Error while verifying secure socket to ");
                    string2.append((Object)this.d);
                    throw new e(string2.toString());
                }
                catch (IOException iOException3) {
                }
                catch (UnknownHostException unknownHostException3) {
                    break block17;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("error while creating secure socket to ");
                stringBuilder.append((Object)this.d);
                throw new e(stringBuilder.toString(), (Throwable)iOException3);
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("unknown host: ");
            stringBuilder.append(string3);
            throw new e(stringBuilder.toString(), (Throwable)unknownHostException3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unsupported protocol: ");
        stringBuilder.append(string2);
        throw new e(stringBuilder.toString());
    }

    public e4.d g() {
        return this.c;
    }

    public Thread h() {
        return this.k;
    }

    public void k(e e8) {
        this.c.d(e8);
        if (this.a == d.q) {
            this.c();
        }
        this.d();
    }

    public void l() {
        this.d();
    }

    public void m(byte[] arrby) {
        synchronized (this) {
            this.o((byte)10, arrby);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void n() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 18[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void o(byte by, byte[] arrby) {
        synchronized (this) {
            Throwable throwable2;
            block7 : {
                block6 : {
                    block5 : {
                        try {
                            if (this.a == d.q) break block5;
                            this.c.d(new e("error while sending data: not connected"));
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    try {
                        this.g.g(by, true, arrby);
                    }
                    catch (IOException iOException) {
                        this.c.d(new e("Failed to send frame", (Throwable)iOException));
                        this.c();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void p(String string2) {
        synchronized (this) {
            this.o((byte)1, string2.getBytes(m));
            return;
        }
    }

    public final void q() {
        try {
            this.a = d.r;
            this.g.i();
            this.g.g((byte)8, true, new byte[0]);
            return;
        }
        catch (IOException iOException) {
            this.c.d(new e("Failed to send close frame", (Throwable)iOException));
            return;
        }
    }

    public void r(e4.d d8) {
        this.c = d8;
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d o;
        public static final /* enum */ d p;
        public static final /* enum */ d q;
        public static final /* enum */ d r;
        public static final /* enum */ d s;
        public static final /* synthetic */ d[] t;

        static {
            d d8;
            d d9;
            d d10;
            d d11;
            d d12;
            o = d12 = new d();
            p = d10 = new d();
            q = d11 = new d();
            r = d8 = new d();
            s = d9 = new d();
            t = new d[]{d12, d10, d11, d8, d9};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])t.clone();
        }
    }

}

