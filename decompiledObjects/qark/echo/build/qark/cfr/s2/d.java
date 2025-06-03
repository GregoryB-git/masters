/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 */
package s2;

import J2.i;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public abstract class d {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void a(String var0) {
        block13 : {
            block14 : {
                block12 : {
                    i.b(263);
                    var2_2 = (HttpURLConnection)new URL(var0).openConnection();
                    var1_7 = var2_2.getResponseCode();
                    if (var1_7 >= 200 && var1_7 < 300) break block12;
                    var3_8 = new StringBuilder(String.valueOf((Object)var0).length() + 65);
                    var3_8.append("Received non-success response code ");
                    var3_8.append(var1_7);
                    var3_8.append(" from pinging URL: ");
                    var3_8.append(var0);
                    Log.w((String)"HttpUrlPinger", (String)var3_8.toString());
                }
                var2_2.disconnect();
                i.a();
                return;
                catch (Throwable var3_9) {
                    try {
                        var2_2.disconnect();
                        throw var3_9;
                    }
                    catch (Throwable var0_1) {
                        break block13;
                    }
                    catch (RuntimeException var2_3) {
                        break block14;
                    }
                    catch (IOException var2_4) {
                        break block14;
                    }
                    catch (IndexOutOfBoundsException var2_5) {
                        ** GOTO lbl-1000
                    }
                }
            }
            var3_8 = var2_6.getMessage();
            var4_10 = new StringBuilder(String.valueOf((Object)var0).length() + 27 + String.valueOf((Object)var3_8).length());
            var4_10.append("Error while pinging URL: ");
            var4_10.append(var0);
            var4_10.append(". ");
            var4_10.append(var3_8);
            Log.w((String)"HttpUrlPinger", (String)var4_10.toString(), (Throwable)var2_6);
            i.a();
            return;
lbl-1000: // 1 sources:
            {
                var3_8 = var2_5.getMessage();
                var4_11 = new StringBuilder(String.valueOf((Object)var0).length() + 32 + String.valueOf((Object)var3_8).length());
                var4_11.append("Error while parsing ping URL: ");
                var4_11.append(var0);
                var4_11.append(". ");
                var4_11.append(var3_8);
                Log.w((String)"HttpUrlPinger", (String)var4_11.toString(), (Throwable)var2_5);
            }
            i.a();
            return;
        }
        i.a();
        throw var0_1;
    }
}

