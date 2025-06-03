/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package v5;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j {
    public Set a;

    public j(List list) {
        this.a = new HashSet((Collection)list);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static j a(Intent intent) {
        ArrayList arrayList;
        int n8;
        Object object;
        block25 : {
            block24 : {
                block23 : {
                    arrayList = new ArrayList();
                    if (intent.getBooleanExtra("trace-startup", false)) {
                        arrayList.add((Object)"--trace-startup");
                    }
                    if (intent.getBooleanExtra("start-paused", false)) {
                        arrayList.add((Object)"--start-paused");
                    }
                    if ((n8 = intent.getIntExtra("vm-service-port", 0)) <= 0) break block23;
                    object = new StringBuilder();
                    break block24;
                }
                n8 = intent.getIntExtra("observatory-port", 0);
                if (n8 <= 0) break block25;
                object = new StringBuilder();
            }
            object.append("--vm-service-port=");
            object.append(Integer.toString((int)n8));
            arrayList.add((Object)object.toString());
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add((Object)"--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add((Object)"--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add((Object)"--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add((Object)"--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add((Object)"--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add((Object)"--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add((Object)"--trace-skia");
        }
        if ((object = intent.getStringExtra("trace-skia-allowlist")) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--trace-skia-allowlist=");
            stringBuilder.append((String)object);
            arrayList.add((Object)stringBuilder.toString());
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add((Object)"--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            object = new StringBuilder();
            object.append("--trace-to-file=");
            object.append(intent.getStringExtra("trace-to-file"));
            arrayList.add((Object)object.toString());
        }
        if (intent.getBooleanExtra("enable-impeller", false)) {
            arrayList.add((Object)"--enable-impeller");
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            arrayList.add((Object)"--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add((Object)"--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add((Object)"--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            arrayList.add((Object)"--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add((Object)"--verbose-logging");
        }
        if ((n8 = intent.getIntExtra("msaa-samples", 0)) > 1) {
            object = new StringBuilder();
            object.append("--msaa-samples=");
            object.append(Integer.toString((int)n8));
            arrayList.add((Object)object.toString());
        }
        if (intent.hasExtra("dart-flags")) {
            object = new StringBuilder();
            object.append("--dart-flags=");
            object.append(intent.getStringExtra("dart-flags"));
            arrayList.add((Object)object.toString());
        }
        return new j((List)arrayList);
    }

    public String[] b() {
        Object[] arrobject = new String[this.a.size()];
        return (String[])this.a.toArray(arrobject);
    }
}

