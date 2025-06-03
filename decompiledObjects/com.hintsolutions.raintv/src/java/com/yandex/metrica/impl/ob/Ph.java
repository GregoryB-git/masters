/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.wh
 *  java.io.BufferedReader
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.nh;
import com.yandex.metrica.impl.ob.oh;
import com.yandex.metrica.impl.ob.th;
import com.yandex.metrica.impl.ob.uh;
import com.yandex.metrica.impl.ob.wh;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.util.Map;

class ph {
    @NonNull
    private final Socket a;
    @NonNull
    private final th b;
    @NonNull
    private final Map<String, oh> c;
    @NonNull
    private final uh d;

    public ph(@NonNull Socket socket, @NonNull th th2, @NonNull Map<String, oh> map, @NonNull uh uh2) {
        this.a = socket;
        this.b = th2;
        this.c = map;
        this.d = uh2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        block20: {
            BufferedReader bufferedReader;
            block19: {
                void var3_5;
                int n4;
                int n5;
                Object var3_1 = null;
                Object object = null;
                this.a.setSoTimeout(1000);
                Object object2 = new InputStreamReader(this.a.getInputStream());
                bufferedReader = new BufferedReader((Reader)object2);
                this.d.a();
                String string = bufferedReader.readLine();
                if (!TextUtils.isEmpty((CharSequence)string) && (string.startsWith("GET /") || string.startsWith("POST /")) && (n5 = string.indexOf(32, n4 = string.indexOf(47) + 1)) > 0) {
                    String string2 = string.substring(n4, n5);
                } else {
                    ((wh)this.b).a("invalid_route", string);
                    Uri uri = object;
                }
                if (var3_5 == null) break block19;
                object = Uri.parse((String)var3_5);
                object2 = object.getPath();
                if ((object2 = (oh)this.c.get(object2)) != null) {
                    object = object2.a(this.a, (Uri)object, this.d);
                    String string3 = ((nh)object).d.getQueryParameter("t");
                    if (((nh)object).c.b.equals((Object)string3)) {
                        ((nh)object).a();
                        break block19;
                    } else {
                        ((wh)((nh)object).b).a("request_with_wrong_token");
                    }
                    break block19;
                }
                object = this.b;
                object = (wh)object;
                object.a("request_to_unknown_path", (String)var3_5);
            }
            bufferedReader.close();
            return;
            {
                catch (Throwable throwable) {
                    return;
                }
            }
            catch (Throwable throwable) {
                BufferedReader bufferedReader2 = bufferedReader;
            }
            break block20;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        th th2 = this.b;
        wh wh2 = (wh)th2;
        try {
            void var4_15;
            wh2.a("LocalHttpServer exception", (Throwable)var4_15);
            return;
        }
        finally {
            block21: {
                void var3_9;
                if (var3_9 == null) break block21;
                var3_9.close();
            }
        }
    }
}

