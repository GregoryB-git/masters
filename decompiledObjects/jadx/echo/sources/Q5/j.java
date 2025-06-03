package Q5;

import A5.a;
import Q5.i;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class j implements A5.a, i.a {

    /* renamed from: a, reason: collision with root package name */
    public Context f4494a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4495a;

        static {
            int[] iArr = new int[i.b.values().length];
            f4495a = iArr;
            try {
                iArr[i.b.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4495a[i.b.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4495a[i.b.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4495a[i.b.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4495a[i.b.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4495a[i.b.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4495a[i.b.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4495a[i.b.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4495a[i.b.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4495a[i.b.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4495a[i.b.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @Override // Q5.i.a
    public String a() {
        return m();
    }

    @Override // Q5.i.a
    public String b() {
        return this.f4494a.getCacheDir().getPath();
    }

    @Override // Q5.i.a
    public String c() {
        return i();
    }

    @Override // Q5.i.a
    public List d() {
        return j();
    }

    @Override // Q5.i.a
    public String e() {
        return h();
    }

    @Override // Q5.i.a
    public List f(i.b bVar) {
        return k(bVar);
    }

    @Override // Q5.i.a
    public String g() {
        return l();
    }

    public final String h() {
        return T5.c.d(this.f4494a);
    }

    public final String i() {
        return T5.c.c(this.f4494a);
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f4494a.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public final List k(i.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f4494a.getExternalFilesDirs(n(bVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    public final String l() {
        File externalFilesDir = this.f4494a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    public final String m() {
        return this.f4494a.getCacheDir().getPath();
    }

    public final String n(i.b bVar) {
        switch (a.f4495a[bVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + bVar);
        }
    }

    public final void o(E5.c cVar, Context context) {
        try {
            h.i(cVar, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f4494a = context;
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        o(bVar.b(), bVar.a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        h.i(bVar.b(), null);
    }
}
