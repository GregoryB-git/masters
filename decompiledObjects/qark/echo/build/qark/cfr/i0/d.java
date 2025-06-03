/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.Bundle
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 */
package i0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import g0.M;
import i0.b;
import i0.h;
import i0.k;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class d
extends b {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public d(Context context) {
        super(false);
        this.e = context.getContentResolver();
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
                            FileInputStream fileInputStream;
                            block12 : {
                                this.f = null;
                                fileInputStream = this.h;
                                if (fileInputStream == null) break block12;
                                fileInputStream.close();
                            }
                            this.h = null;
                            fileInputStream = this.g;
                            if (fileInputStream == null) break block13;
                            fileInputStream.close();
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
                            throw new a(iOException2, 2000);
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
                    throw new a(iOException4, 2000);
                }
            }
            this.g = null;
            if (!this.j) throw throwable2222;
            this.j = false;
            this.r();
            throw throwable2222;
            {
                throw new a(iOException322, 2000);
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
        block14 : {
            block13 : {
                var2_4 = 2000;
                this.f = var9_5 = var1_1.a.normalizeScheme();
                this.s(var1_1);
                if ("content".equals((Object)var9_5.getScheme())) {
                    var8_6 = new Bundle();
                    var8_6.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    var8_6 = this.e.openTypedAssetFileDescriptor(var9_5, "*/*", var8_6);
                } else {
                    var8_6 = this.e.openAssetFileDescriptor(var9_5, "r");
                }
                this.g = var8_6;
                if (var8_6 == null) ** GOTO lbl47
                var4_7 = var8_6.getLength();
                var9_5 = new FileInputStream(var8_6.getFileDescriptor());
                this.h = var9_5;
                var3_8 = var4_7 LCMP -1L;
                if (var3_8 != false) {
                    if (var1_1.g > var4_7) throw new a(null, 2008);
                }
                var6_9 = var8_6.getStartOffset();
                if ((var6_9 = var9_5.skip(var1_1.g + var6_9) - var6_9) != var1_1.g) throw new a(null, 2008);
                if (var3_8 == false) {
                    var8_6 = var9_5.getChannel();
                    var4_7 = var8_6.size();
                    if (var4_7 == 0L) {
                        this.i = -1L;
                    } else {
                        this.i = var4_7 -= var8_6.position();
                        if (var4_7 < 0L) throw new a(null, 2008);
                    }
                    break block13;
                }
                this.i = var4_7 -= var6_9;
                if (var4_7 < 0L) break block14;
            }
            var4_7 = var1_1.h;
            if (var4_7 != -1L) {
                var6_9 = this.i;
                if (var6_9 != -1L) {
                    var4_7 = Math.min((long)var6_9, (long)var4_7);
                }
                this.i = var4_7;
            }
            this.j = true;
            this.t(var1_1);
            var4_7 = var1_1.h;
            if (var4_7 == -1L) return this.i;
            return var4_7;
        }
        try {
            throw new a(null, 2008);
lbl47: // 1 sources:
            var1_1 = new StringBuilder();
            var1_1.append("Could not open file descriptor for: ");
            var1_1.append((Object)var9_5);
            throw new a(new IOException(var1_1.toString()), 2000);
        }
        catch (IOException var1_2) {}
        if (var1_2 instanceof FileNotFoundException == false) throw new a(var1_2, var2_4);
        var2_4 = 2005;
        throw new a(var1_2, var2_4);
        catch (a var1_3) {
            throw var1_3;
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
            var4_5 = this.i;
            if (var4_5 == 0L) {
                return -1;
            }
            if (var4_5 == -1L) ** GOTO lbl10
            var6_6 = var3_4;
            try {
                var3_4 = (int)Math.min((long)var4_5, (long)var6_6);
lbl10: // 2 sources:
                var2_3 = ((FileInputStream)M.i((Object)this.h)).read(var1_1, var2_3, var3_4);
                if (var2_3 == -1) {
                    return -1;
                }
                var4_5 = this.i;
                if (var4_5 == -1L) break block5;
            }
            catch (IOException var1_2) {
                throw new a(var1_2, 2000);
            }
            this.i = var4_5 - (long)var2_3;
        }
        this.q(var2_3);
        return var2_3;
    }

    public static class a
    extends h {
        public a(IOException iOException, int n8) {
            super((Throwable)iOException, n8);
        }
    }

}

