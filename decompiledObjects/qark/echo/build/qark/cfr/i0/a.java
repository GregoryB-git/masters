/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package i0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import g0.M;
import i0.b;
import i0.h;
import i0.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class a
extends b {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public a(Context context) {
        super(false);
        this.e = context.getAssets();
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
                    InputStream inputStream = this.g;
                    if (inputStream == null) break block6;
                    inputStream.close();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                catch (IOException iOException2) {}
            }
            this.g = null;
            if (this.i) {
                this.i = false;
                this.r();
            }
            return;
            {
                throw new a((Throwable)iOException2, 2000);
            }
        }
        this.g = null;
        if (this.i) {
            this.i = false;
            this.r();
        }
        throw throwable2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public long e(k k8) {
        int n8;
        block9 : {
            block10 : {
                Object object = k8.a;
                this.f = object;
                String string2 = (String)g0.a.e(object.getPath());
                if (string2.startsWith("/android_asset/")) {
                    object = string2.substring(15);
                } else {
                    object = string2;
                    if (string2.startsWith("/")) {
                        object = string2.substring(1);
                    }
                }
                this.s(k8);
                this.g = object = this.e.open((String)object, 1);
                if (object.skip(k8.g) < k8.g) break block9;
                long l8 = k8.h;
                if (l8 != -1L) {
                    this.h = l8;
                    break block10;
                }
                this.h = l8 = (long)this.g.available();
                if (l8 != Integer.MAX_VALUE) break block10;
                this.h = -1L;
            }
            this.i = true;
            this.t(k8);
            return this.h;
        }
        try {
            throw new a(null, 2008);
        }
        catch (IOException iOException) {}
        if (iOException instanceof FileNotFoundException) {
            n8 = 2005;
            throw new a((Throwable)iOException, n8);
        }
        n8 = 2000;
        throw new a((Throwable)iOException, n8);
        catch (a a8) {
            throw a8;
        }
    }

    @Override
    public Uri k() {
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public int read(byte[] var1_1, int var2_3, int var3_4) {
        block5 : {
            if (var3_4 == 0) {
                return 0;
            }
            var4_5 = this.h;
            if (var4_5 == 0L) {
                return -1;
            }
            if (var4_5 == -1L) ** GOTO lbl10
            var6_6 = var3_4;
            try {
                var3_4 = (int)Math.min((long)var4_5, (long)var6_6);
lbl10: // 2 sources:
                var2_3 = ((InputStream)M.i((Object)this.g)).read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var4_5 = this.h;
                if (var4_5 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a((Throwable)var1_2, 2000);
            }
            this.h = var4_5 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    public static final class a
    extends h {
        public a(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }

}

