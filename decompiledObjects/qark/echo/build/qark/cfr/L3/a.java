/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLEncoder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.net.ssl.HttpsURLConnection
 */
package L3;

import E3.f;
import L3.c;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

public class a {
    public final String a;
    public final Map b;
    public final Map c;

    public a(String string2, Map map) {
        this.a = string2;
        this.b = map;
        this.c = new HashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final String a(Map var1_1) {
        var2_2 = new StringBuilder();
        var3_3 = var1_1.entrySet().iterator();
        var1_1 = (Map.Entry)var3_3.next();
        var2_2.append((String)var1_1.getKey());
        var2_2.append("=");
        if (var1_1.getValue() == null) ** GOTO lbl10
        do {
            var1_1 = URLEncoder.encode((String)((String)var1_1.getValue()), (String)"UTF-8");
            ** GOTO lbl12
lbl10: // 1 sources:
            do {
                var1_1 = "";
lbl12: // 2 sources:
                var2_2.append((String)var1_1);
                if (var3_3.hasNext() == false) return var2_2.toString();
                var1_1 = (Map.Entry)var3_3.next();
                var2_2.append("&");
                var2_2.append((String)var1_1.getKey());
                var2_2.append("=");
            } while (var1_1.getValue() == null);
        } while (true);
    }

    public final String b(String string2, Map object) {
        String string3 = this.a((Map)object);
        if (string3.isEmpty()) {
            return string2;
        }
        if (string2.contains((CharSequence)"?")) {
            object = string3;
            if (!string2.endsWith("&")) {
                object = new StringBuilder();
                object.append("&");
                object.append(string3);
                object = object.toString();
            }
            string3 = new StringBuilder();
            string3.append(string2);
            string3.append((String)object);
            return string3.toString();
        }
        object = new StringBuilder();
        object.append(string2);
        object.append("?");
        object.append(string3);
        return object.toString();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public c c() {
        f f8;
        void var2_5;
        String string2;
        block10 : {
            String string3;
            f f9;
            int n8;
            block9 : {
                f8 = null;
                string3 = null;
                string2 = this.b(this.a, this.b);
                f9 = f.f();
                StringBuilder stringBuilder222 = new StringBuilder();
                stringBuilder222.append("GET Request URL: ");
                stringBuilder222.append(string2);
                f9.i(stringBuilder222.toString());
                string2 = (HttpsURLConnection)new URL(string2).openConnection();
                try {
                    string2.setReadTimeout(10000);
                    string2.setConnectTimeout(10000);
                    string2.setRequestMethod("GET");
                    for (StringBuilder stringBuilder222 : this.c.entrySet()) {
                        string2.addRequestProperty((String)stringBuilder222.getKey(), (String)stringBuilder222.getValue());
                    }
                    string2.connect();
                    n8 = string2.getResponseCode();
                    f9 = string2.getInputStream();
                    if (f9 == null) break block9;
                }
                catch (Throwable throwable) {}
                try {
                    string3 = this.e((InputStream)f9);
                }
                catch (Throwable throwable) {
                    f8 = f9;
                    break block10;
                }
            }
            if (f9 != null) {
                f9.close();
            }
            string2.disconnect();
            return new c(n8, string3);
            catch (Throwable throwable) {
                string2 = null;
            }
        }
        if (f8 != null) {
            f8.close();
        }
        if (string2 == null) throw var2_5;
        string2.disconnect();
        throw var2_5;
    }

    public a d(String string2, String string3) {
        this.c.put((Object)string2, (Object)string3);
        return this;
    }

    public final String e(InputStream inputStream) {
        int n8;
        inputStream = new BufferedReader((Reader)new InputStreamReader(inputStream, "UTF-8"));
        char[] arrc = new char[8192];
        StringBuilder stringBuilder = new StringBuilder();
        while ((n8 = inputStream.read(arrc)) != -1) {
            stringBuilder.append(arrc, 0, n8);
        }
        return stringBuilder.toString();
    }
}

