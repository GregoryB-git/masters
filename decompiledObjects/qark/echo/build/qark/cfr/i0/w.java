/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.io.EOFException
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 *  java.util.List
 */
package i0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import g0.M;
import i0.b;
import i0.h;
import i0.k;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public final class w
extends b {
    public final Context e;
    public k f;
    public AssetFileDescriptor g;
    public InputStream h;
    public long i;
    public boolean j;

    public w(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("rawresource:///");
        stringBuilder.append(n8);
        return Uri.parse((String)stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static AssetFileDescriptor u(Context var0, k var1_3) {
        block11 : {
            block12 : {
                var4_4 = var1_3.a.normalizeScheme();
                if (!TextUtils.equals((CharSequence)"rawresource", (CharSequence)var4_4.getScheme())) break block12;
                var0 = var0.getResources();
                var1_3 = var4_4.getPathSegments();
                if (var1_3.size() != 1) {
                    var0 = new StringBuilder();
                    var0.append("rawresource:// URI must have exactly one path element, found ");
                    var0.append(var1_3.size());
                    throw new a(var0.toString());
                }
                var1_3 = (String)var1_3.get(0);
                ** GOTO lbl-1000
            }
            if (!TextUtils.equals((CharSequence)"android.resource", (CharSequence)var4_4.getScheme())) {
                var0 = new StringBuilder();
                var0.append("Unsupported URI scheme (");
                var0.append(var4_4.getScheme());
                var0.append("). Only ");
                var0.append("android.resource");
                var0.append(" is supported.");
                throw new a(var0.toString(), null, 1004);
            }
            var3_6 = (String)g0.a.e(var4_4.getPath());
            var1_3 = var3_6;
            if (var3_6.startsWith("/")) {
                var1_3 = var3_6.substring(1);
            }
            var3_6 = TextUtils.isEmpty((CharSequence)var4_4.getHost()) != false ? var0.getPackageName() : var4_4.getHost();
            if (var3_6.equals((Object)var0.getPackageName())) {
                var0 = var0.getResources();
            } else {
                var0 = var0.getPackageManager().getResourcesForApplication(var3_6);
            }
            if (var1_3.matches("\\d+")) lbl-1000: // 2 sources:
            {
                var2_5 = w.v((String)var1_3);
            } else {
                var5_7 = new StringBuilder();
                var5_7.append(var3_6);
                var5_7.append(":");
                var5_7.append((String)var1_3);
                var2_5 = var0.getIdentifier(var5_7.toString(), "raw", null);
                if (var2_5 == 0) throw new a("Resource not found.", null, 2005);
            }
            try {
                var0 = var0.openRawResourceFd(var2_5);
                if (var0 == null) break block11;
                return var0;
            }
            catch (Resources.NotFoundException var0_1) {
                throw new a(null, (Throwable)var0_1, 2005);
            }
        }
        var0 = new StringBuilder();
        var0.append("Resource is compressed: ");
        var0.append((Object)var4_4);
        throw new a(var0.toString(), null, 2000);
        catch (PackageManager.NameNotFoundException var0_2) {
            throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", (Throwable)var0_2, 2005);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int v(String string2) {
        try {
            return Integer.parseInt((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void close() {
        Throwable throwable422;
        block17 : {
            Throwable throwable2222;
            IOException iOException322;
            block16 : {
                Throwable throwable3222;
                block15 : {
                    block14 : {
                        block13 : {
                            InputStream inputStream;
                            block12 : {
                                this.f = null;
                                inputStream = this.h;
                                if (inputStream == null) break block12;
                                inputStream.close();
                            }
                            this.h = null;
                            inputStream = this.g;
                            if (inputStream == null) break block13;
                            inputStream.close();
                        }
                        this.g = null;
                        if (!this.j) return;
                        this.j = false;
                        this.r();
                        return;
                        catch (Throwable throwable3222) {
                            break block14;
                        }
                        catch (IOException iOException2) {}
                        {
                            throw new a(null, (Throwable)iOException2, 2000);
                        }
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor == null) break block15;
                        assetFileDescriptor.close();
                    }
                    catch (Throwable throwable422) {
                        break block17;
                    }
                    catch (IOException iOException322) {}
                }
                this.g = null;
                if (!this.j) throw throwable3222;
                this.j = false;
                this.r();
                throw throwable3222;
                catch (Throwable throwable2222) {
                    break block16;
                }
                catch (IOException iOException4) {}
                {
                    throw new a(null, (Throwable)iOException4, 2000);
                }
            }
            this.g = null;
            if (!this.j) throw throwable2222;
            this.j = false;
            this.r();
            throw throwable2222;
            {
                throw new a(null, (Throwable)iOException322, 2000);
            }
        }
        this.g = null;
        if (!this.j) throw throwable422;
        this.j = false;
        this.r();
        throw throwable422;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public long e(k var1_1) {
        block11 : {
            block10 : {
                this.f = var1_1;
                this.s(var1_1);
                this.g = var7_4 = w.u(this.e, var1_1);
                var3_5 = var7_4.getLength();
                var7_4 = new FileInputStream(this.g.getFileDescriptor());
                this.h = var7_4;
                var2_6 = var3_5 LCMP -1L;
                if (var2_6 == false) ** GOTO lbl11
                if (var1_1.g > var3_5) throw new a(null, null, 2008);
lbl11: // 2 sources:
                var5_7 = this.g.getStartOffset();
                if ((var5_7 = var7_4.skip(var1_1.g + var5_7) - var5_7) != var1_1.g) throw new a(null, null, 2008);
                if (var2_6 == false) {
                    if ((var7_4 = var7_4.getChannel()).size() == 0L) {
                        this.i = -1L;
                    } else {
                        this.i = var3_5 = var7_4.size() - var7_4.position();
                        if (var3_5 < 0L) throw new a(null, null, 2008);
                    }
                    break block10;
                }
                this.i = var3_5 -= var5_7;
                if (var3_5 < 0L) break block11;
            }
            var3_5 = var1_1.h;
            if (var3_5 != -1L) {
                var5_7 = this.i;
                if (var5_7 != -1L) {
                    var3_5 = Math.min((long)var5_7, (long)var3_5);
                }
                this.i = var3_5;
            }
            this.j = true;
            this.t(var1_1);
            var3_5 = var1_1.h;
            if (var3_5 == -1L) return this.i;
            return var3_5;
        }
        try {
            throw new h(2008);
        }
        catch (IOException var1_2) {
            throw new a(null, (Throwable)var1_2, 2000);
        }
        catch (a var1_3) {
            throw var1_3;
        }
    }

    @Override
    public Uri k() {
        k k8 = this.f;
        if (k8 != null) {
            return k8.a;
        }
        return null;
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
            var4_5 = this.i;
            if (var4_5 == 0L) {
                return -1;
            }
            if (var4_5 == -1L) ** GOTO lbl10
            var6_6 = var3_4;
            try {
                var3_4 = (int)Math.min((long)var4_5, (long)var6_6);
lbl10: // 2 sources:
                var2_3 = ((InputStream)M.i((Object)this.h)).read(var1_1, var2_3, var3_4);
                if (var2_3 != -1) break block5;
                if (this.i != -1L) throw new a("End of stream reached having not read sufficient data.", (Throwable)new EOFException(), 2000);
                return -1;
            }
            catch (IOException var1_2) {
                throw new a(null, (Throwable)var1_2, 2000);
            }
        }
        var4_5 = this.i;
        if (var4_5 != -1L) {
            this.i = var4_5 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    public static class a
    extends h {
        public a(String string2) {
            super(string2, null, 2000);
        }

        public a(String string2, Throwable throwable, int n8) {
            super(string2, throwable, n8);
        }
    }

}

