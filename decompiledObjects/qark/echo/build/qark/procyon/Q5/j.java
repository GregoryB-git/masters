// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q5;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import T5.c;
import java.util.List;
import android.content.Context;
import A5.a;

public class j implements a, i.a
{
    public Context a;
    
    @Override
    public String a() {
        return this.m();
    }
    
    @Override
    public String b() {
        return this.a.getCacheDir().getPath();
    }
    
    @Override
    public String c() {
        return this.i();
    }
    
    @Override
    public List d() {
        return this.j();
    }
    
    @Override
    public String e() {
        return this.h();
    }
    
    @Override
    public List f(final i.b b) {
        return this.k(b);
    }
    
    @Override
    public String g() {
        return this.l();
    }
    
    public final String h() {
        return c.d(this.a);
    }
    
    public final String i() {
        return c.c(this.a);
    }
    
    public final List j() {
        final ArrayList<String> list = new ArrayList<String>();
        final File[] externalCacheDirs = this.a.getExternalCacheDirs();
        for (int length = externalCacheDirs.length, i = 0; i < length; ++i) {
            final File file = externalCacheDirs[i];
            if (file != null) {
                list.add(file.getAbsolutePath());
            }
        }
        return list;
    }
    
    public final List k(final i.b b) {
        final ArrayList<String> list = new ArrayList<String>();
        final File[] externalFilesDirs = this.a.getExternalFilesDirs(this.n(b));
        for (int length = externalFilesDirs.length, i = 0; i < length; ++i) {
            final File file = externalFilesDirs[i];
            if (file != null) {
                list.add(file.getAbsolutePath());
            }
        }
        return list;
    }
    
    public final String l() {
        final File externalFilesDir = this.a.getExternalFilesDir((String)null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }
    
    public final String m() {
        return this.a.getCacheDir().getPath();
    }
    
    public final String n(final i.b obj) {
        switch (j$a.a[obj.ordinal()]) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized directory: ");
                sb.append(obj);
                throw new RuntimeException(sb.toString());
            }
            case 11: {
                return "documents";
            }
            case 10: {
                return "dcim";
            }
            case 9: {
                return "downloads";
            }
            case 8: {
                return "movies";
            }
            case 7: {
                return "pictures";
            }
            case 6: {
                return "notifications";
            }
            case 5: {
                return "alarms";
            }
            case 4: {
                return "ringtones";
            }
            case 3: {
                return "podcasts";
            }
            case 2: {
                return "music";
            }
            case 1: {
                return null;
            }
        }
    }
    
    public final void o(final E5.c c, final Context a) {
        try {
            h.i(c, this);
        }
        catch (Exception ex) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", (Throwable)ex);
        }
        this.a = a;
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.o(b.b(), b.a());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        h.i(b.b(), null);
    }
}
