/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.system.ErrnoException
 *  android.system.OsConstants
 *  android.text.TextUtils
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 */
package i0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import g0.M;
import i0.h;
import i0.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class p
extends i0.b {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public p() {
        super(false);
    }

    public static RandomAccessFile u(Uri uri) {
        FileNotFoundException fileNotFoundException2;
        int n8;
        block7 : {
            SecurityException securityException2;
            block6 : {
                n8 = 2006;
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile((String)g0.a.e(uri.getPath()), "r");
                    return randomAccessFile;
                }
                catch (RuntimeException runtimeException) {
                }
                catch (SecurityException securityException2) {
                    break block6;
                }
                catch (FileNotFoundException fileNotFoundException2) {
                    break block7;
                }
                throw new b((Throwable)runtimeException, 2000);
            }
            throw new b((Throwable)securityException2, 2006);
        }
        if (TextUtils.isEmpty((CharSequence)uri.getQuery()) && TextUtils.isEmpty((CharSequence)uri.getFragment())) {
            if (M.a < 21 || !a.b(fileNotFoundException2.getCause())) {
                n8 = 2005;
            }
            throw new b((Throwable)fileNotFoundException2, n8);
        }
        throw new b(String.format((String)"uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", (Object[])new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), (Throwable)fileNotFoundException2, 1004);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        Throwable throwable2;
        block7 : {
            IOException iOException2;
            block6 : {
                this.f = null;
                try {
                    RandomAccessFile randomAccessFile = this.e;
                    if (randomAccessFile == null) break block6;
                    randomAccessFile.close();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                catch (IOException iOException2) {}
            }
            this.e = null;
            if (this.h) {
                this.h = false;
                this.r();
            }
            return;
            {
                throw new b((Throwable)iOException2, 2000);
            }
        }
        this.e = null;
        if (this.h) {
            this.h = false;
            this.r();
        }
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long e(k k8) {
        Uri uri;
        this.f = uri = k8.a;
        this.s(k8);
        uri = p.u(uri);
        this.e = uri;
        try {
            long l8;
            uri.seek(k8.g);
            long l9 = l8 = k8.h;
            if (l8 == -1L) {
                l9 = this.e.length() - k8.g;
            }
            this.g = l9;
            if (l9 < 0L) throw new b(null, null, 2008);
        }
        catch (IOException iOException) {
            throw new b((Throwable)iOException, 2000);
        }
        this.h = true;
        this.t(k8);
        return this.g;
    }

    @Override
    public Uri k() {
        return this.f;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        block4 : {
            if (n9 == 0) {
                return 0;
            }
            if (this.g == 0L) {
                return -1;
            }
            try {
                n8 = ((RandomAccessFile)M.i((Object)this.e)).read(arrby, n8, (int)Math.min((long)this.g, (long)n9));
                if (n8 <= 0) break block4;
            }
            catch (IOException iOException) {
                throw new b((Throwable)iOException, 2000);
            }
            this.g -= (long)n8;
            this.q(n8);
        }
        return n8;
    }

    public static final abstract class a {
        private static boolean b(Throwable throwable) {
            if (throwable instanceof ErrnoException && ((ErrnoException)throwable).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    public static class b
    extends h {
        public b(String string2, Throwable throwable, int n8) {
            super(string2, throwable, n8);
        }

        public b(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }

}

