/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package Q5;

import A5.a;
import E5.c;
import Q5.h;
import Q5.i;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class j
implements a,
i.a {
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
    public List f(i.b b8) {
        return this.k(b8);
    }

    @Override
    public String g() {
        return this.l();
    }

    public final String h() {
        return T5.c.d(this.a);
    }

    public final String i() {
        return T5.c.c(this.a);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.a.getExternalCacheDirs()) {
            if (file == null) continue;
            arrayList.add((Object)file.getAbsolutePath());
        }
        return arrayList;
    }

    public final List k(i.b arrfile) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.a.getExternalFilesDirs(this.n((i.b)arrfile))) {
            if (file == null) continue;
            arrayList.add((Object)file.getAbsolutePath());
        }
        return arrayList;
    }

    public final String l() {
        File file = this.a.getExternalFilesDir(null);
        if (file == null) {
            return null;
        }
        return file.getAbsolutePath();
    }

    public final String m() {
        return this.a.getCacheDir().getPath();
    }

    public final String n(i.b b8) {
        switch (.a[b8.ordinal()]) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized directory: ");
                stringBuilder.append((Object)b8);
                throw new RuntimeException(stringBuilder.toString());
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
            case 1: 
        }
        return null;
    }

    public final void o(c c8, Context context) {
        try {
            h.i(c8, this);
        }
        catch (Exception exception) {
            Log.e((String)"PathProviderPlugin", (String)"Received exception while setting up PathProviderPlugin", (Throwable)exception);
        }
        this.a = context;
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.o(b8.b(), b8.a());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        h.i(b8.b(), null);
    }

}

