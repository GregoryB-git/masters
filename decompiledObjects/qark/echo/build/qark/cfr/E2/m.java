/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  java.io.BufferedReader
 *  java.io.Closeable
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package E2;

import A2.n;
import E2.k;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public abstract class m {
    public static String a;
    public static int b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a() {
        block13 : {
            block11 : {
                block12 : {
                    if (m.a != null) return m.a;
                    var0_1 = var1 = m.b;
                    if (var1 == 0) {
                        m.b = var0_1 = Process.myPid();
                    }
                    var4_2 = null;
                    var3_4 = null;
                    var2_7 = null;
                    if (var0_1 > 0) break block12;
                    var2_7 = var3_4;
                    break block13;
                }
                var3_4 = new StringBuilder();
                var3_4.append("/proc/");
                var3_4.append(var0_1);
                var3_4.append("/cmdline");
                var3_4 = var3_4.toString();
                var5_11 = StrictMode.allowThreadDiskReads();
                var3_4 = new BufferedReader((Reader)new FileReader((String)var3_4));
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_11);
                try {
                    var4_2 = var3_4.readLine();
                    n.i(var4_2);
                    var4_2 = var4_2.trim();
                    var2_7 = var4_2;
                    break block11;
                }
                catch (Throwable var2_8) {
                    ** GOTO lbl37
                }
                catch (Throwable var3_5) {
                    try {
                        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var5_11);
                        throw var3_5;
                    }
                    catch (Throwable var2_9) {
                        var3_4 = var4_2;
                    }
lbl37: // 2 sources:
                    k.a((Closeable)var3_4);
                    throw var2_10;
                    catch (IOException var3_6) {}
                }
                var3_4 = null;
                break block11;
                catch (IOException var4_3) {}
            }
            k.a((Closeable)var3_4);
        }
        m.a = var2_7;
        return m.a;
    }
}

