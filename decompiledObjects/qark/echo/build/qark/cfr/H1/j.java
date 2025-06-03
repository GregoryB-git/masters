/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.DataInputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.FloatBuffer
 *  java.nio.charset.Charset
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package H1;

import H1.a;
import W5.g;
import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;

public final class j {
    public static final j a = new j();

    public static final File a() {
        Throwable throwable2;
        block4 : {
            File file;
            block3 : {
                File file2;
                boolean bl = T1.a.d(j.class);
                file = null;
                if (bl) {
                    return null;
                }
                try {
                    file2 = new File(B.l().getFilesDir(), "facebook_ml/");
                    if (!file2.exists() && !(bl = file2.mkdirs())) break block3;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                file = file2;
            }
            return file;
        }
        T1.a.b(throwable2, j.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final Map c(File var0) {
        block30 : {
            block27 : {
                block29 : {
                    block26 : {
                        block25 : {
                            block28 : {
                                if (T1.a.d(j.class)) {
                                    return null;
                                }
                                Intrinsics.checkNotNullParameter(var0, "file");
                                var0 = new byte[]((File)var0);
                                var6_6 = var0.available();
                                var10_7 = new DataInputStream((InputStream)var0);
                                var0 = new byte[var6_6];
                                var10_7.readFully(var0);
                                var10_7.close();
                                if (var6_6 < 4) {
                                    return null;
                                }
                                var10_7 = ByteBuffer.wrap((byte[])var0, (int)0, (int)4);
                                var10_7.order(ByteOrder.LITTLE_ENDIAN);
                                var1_8 = var10_7.getInt();
                                var2_9 = var1_8 + 4;
                                if (var6_6 < var2_9) {
                                    return null;
                                }
                                var10_7 = new JSONObject(new String(var0, 4, var1_8, b.b));
                                var12_10 = var10_7.names();
                                var7_11 = var12_10.length();
                                var11_12 = new String[var7_11];
                                var4_13 = var7_11 - 1;
                                if (var4_13 >= 0) {
                                    var1_8 = 0;
                                    do {
                                        var3_14 = var1_8 + 1;
                                        var11_12[var1_8] = var12_10.getString(var1_8);
                                        if (var3_14 <= var4_13) {
                                            var1_8 = var3_14;
                                            continue;
                                        }
                                        ** GOTO lbl43
                                        break;
                                    } while (true);
                                }
                                ** GOTO lbl43
                                {
                                    catch (Throwable var0_1) {
                                        break block25;
                                    }
lbl40: // 1 sources:
                                    do {
                                        return null;
                                        break;
                                    } while (true);
lbl43: // 3 sources:
                                    g.f(var11_12);
                                    var12_10 = new HashMap();
                                    var3_14 = 0;
                                    var1_8 = var2_9;
                                    var2_9 = var3_14;
                                    break block26;
lbl49: // 1 sources:
                                    var15_20 = var10_7.getJSONArray((String)var13_18);
                                    var2_9 = var15_20.length();
                                    var14_19 = new int[var2_9];
                                }
                                var8_16 = var2_9 - 1;
                                var2_9 = 1;
                                var3_14 = 1;
                                if (var8_16 < 0) break block28;
                                var2_9 = var5_15;
lbl57: // 2 sources:
                                var5_15 = var2_9 + 1;
                                ** try [egrp 6[TRYBLOCK] [13, 14 : 255->263)] { 
lbl59: // 1 sources:
                                var14_19[var2_9] = var9_17 = var15_20.getInt(var2_9);
                                var3_14 *= var9_17;
                                if (var5_15 <= var8_16) break block29;
                                var2_9 = var3_14;
                            }
                            if ((var3_14 = var1_8 + (var5_15 = var2_9 * 4)) <= var6_6) {
                                var15_20 = ByteBuffer.wrap((byte[])var0, (int)var1_8, (int)var5_15);
                                var15_20.order(ByteOrder.LITTLE_ENDIAN);
                                var14_19 = new a((int[])var14_19);
                                var15_20.asFloatBuffer().get(var14_19.a(), 0, var2_9);
                                var12_10.put(var13_18, var14_19);
                                var1_8 = var3_14;
                                var2_9 = var4_13;
                                do {
                                    return var12_10;
                                    break;
                                } while (true);
                            }
                            break block30;
                        }
lbl78: // 2 sources:
                        do {
                            T1.a.b((Throwable)var0_2, j.class);
                            return null;
                            break;
                        } while (true);
                        catch (Exception var0_3) {
                            ** continue;
                        }
lbl83: // 2 sources:
                        catch (Exception var0_4) {
                            break block27;
                        }
                    }
                    do {
                        var5_15 = 0;
                        if (var2_9 >= var7_11) ** continue;
                        var13_18 = var11_12[var2_9];
                        var4_13 = var2_9 + 1;
                        if (var13_18 != null) ** GOTO lbl49
                        var2_9 = var4_13;
                    } while (true);
                }
                var2_9 = var5_15;
                ** GOTO lbl57
lbl-1000: // 5 sources:
                {
                    catch (Throwable var0_5) {
                        ** continue;
                    }
                }
            }
            return null;
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
    public final String b(String var1_1) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(var1_1, "str");
            var2_3 = var1_1.length() - 1;
            var4_5 = var3_4 = 0;
            ** GOTO lbl19
        }
        catch (Throwable var1_2) {}
        T1.a.b(var1_2, this);
        return null;
lbl-1000: // 2 sources:
        {
            var5_6 = Intrinsics.d(var1_1.charAt(var5_6), 32) <= 0 ? 1 : 0;
            if (var4_5 == 0) {
                if (var5_6 == 0) {
                    var4_5 = 1;
                } else {
                    ++var3_4;
                }
            } else {
                --var2_3;
            }
lbl19: // 4 sources:
            if (var3_4 > var2_3) {
                var1_1 = var1_1.subSequence(var3_4, var2_3 + 1).toString();
                if ((var1_1 = ((Collection)new Regex("\\s+").c((CharSequence)var1_1, 0)).toArray((Object[])new String[0])) == null) throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                var1_1 = TextUtils.join((CharSequence)" ", (Object[])((String[])var1_1));
                Intrinsics.checkNotNullExpressionValue(var1_1, "join(\" \", strArray)");
                return var1_1;
            }
            if (var4_5 == 0) {
                var5_6 = var3_4;
                continue;
            }
            var5_6 = var2_3;
            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int[] d(String arrby, int n8) {
        int[] arrn;
        int n9;
        block7 : {
            block9 : {
                block10 : {
                    block8 : {
                        if (T1.a.d(this)) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(arrby, "texts");
                        arrn = new int[n8];
                        arrby = this.b((String)arrby);
                        Charset charset = Charset.forName((String)"UTF-8");
                        Intrinsics.checkNotNullExpressionValue((Object)charset, "forName(\"UTF-8\")");
                        if (arrby == null) break block8;
                        arrby = arrby.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
                        if (n8 <= 0) break block9;
                        break block10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                n9 = 0;
                break block7;
            }
            return arrn;
        }
        do {
            int n10 = n9 + 1;
            try {
                arrn[n9] = n9 < arrby.length ? arrby[n9] & 255 : 0;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return null;
            if (n10 >= n8) {
                return arrn;
            }
            n9 = n10;
        } while (true);
    }
}

