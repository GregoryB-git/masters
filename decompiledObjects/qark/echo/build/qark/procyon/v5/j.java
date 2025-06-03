// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v5;

import java.util.ArrayList;
import android.content.Intent;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class j
{
    public Set a;
    
    public j(final List c) {
        this.a = new HashSet(c);
    }
    
    public static j a(final Intent intent) {
        final ArrayList<String> list = new ArrayList<String>();
        if (intent.getBooleanExtra("trace-startup", false)) {
            list.add("--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            list.add("--start-paused");
        }
        int i = intent.getIntExtra("vm-service-port", 0);
        Label_0113: {
            StringBuilder sb;
            if (i > 0) {
                sb = new StringBuilder();
            }
            else {
                i = intent.getIntExtra("observatory-port", 0);
                if (i <= 0) {
                    break Label_0113;
                }
                sb = new StringBuilder();
            }
            sb.append("--vm-service-port=");
            sb.append(Integer.toString(i));
            list.add(sb.toString());
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            list.add("--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            list.add("--endless-trace-buffer");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            list.add("--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            list.add("--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            list.add("--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            list.add("--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            list.add("--trace-skia");
        }
        final String stringExtra = intent.getStringExtra("trace-skia-allowlist");
        if (stringExtra != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("--trace-skia-allowlist=");
            sb2.append(stringExtra);
            list.add(sb2.toString());
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            list.add("--trace-systrace");
        }
        if (intent.hasExtra("trace-to-file")) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("--trace-to-file=");
            sb3.append(intent.getStringExtra("trace-to-file"));
            list.add(sb3.toString());
        }
        if (intent.getBooleanExtra("enable-impeller", false)) {
            list.add("--enable-impeller");
        }
        if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
            list.add("--enable-vulkan-validation");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            list.add("--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            list.add("--cache-sksl");
        }
        if (intent.getBooleanExtra("purge-persistent-cache", false)) {
            list.add("--purge-persistent-cache");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            list.add("--verbose-logging");
        }
        final int intExtra = intent.getIntExtra("msaa-samples", 0);
        if (intExtra > 1) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("--msaa-samples=");
            sb4.append(Integer.toString(intExtra));
            list.add(sb4.toString());
        }
        if (intent.hasExtra("dart-flags")) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("--dart-flags=");
            sb5.append(intent.getStringExtra("dart-flags"));
            list.add(sb5.toString());
        }
        return new j(list);
    }
    
    public String[] b() {
        return this.a.toArray(new String[this.a.size()]);
    }
}
