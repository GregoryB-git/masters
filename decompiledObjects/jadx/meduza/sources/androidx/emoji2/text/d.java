package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f977i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static volatile d f978j;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f979a;

    /* renamed from: b, reason: collision with root package name */
    public final r.d f980b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f981c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f982d;

    /* renamed from: e, reason: collision with root package name */
    public final a f983e;
    public final g f;

    /* renamed from: g, reason: collision with root package name */
    public final int f984g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.emoji2.text.b f985h;

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f986b;

        /* renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.h f987c;

        public a(d dVar) {
            super(dVar);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final d f988a;

        public b(d dVar) {
            this.f988a = dVar;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f989a;

        /* renamed from: b, reason: collision with root package name */
        public int f990b = 0;

        /* renamed from: c, reason: collision with root package name */
        public androidx.emoji2.text.b f991c = new androidx.emoji2.text.b();

        public c(g gVar) {
            this.f989a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    public interface InterfaceC0015d {
    }

    public static abstract class e {
        public void a() {
        }
    }

    public static class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f992a;

        /* renamed from: b, reason: collision with root package name */
        public final int f993b;

        public f(List list, int i10, Throwable th) {
            if (list == null) {
                throw new NullPointerException("initCallbacks cannot be null");
            }
            this.f992a = new ArrayList(list);
            this.f993b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int size = this.f992a.size();
            int i10 = 0;
            if (this.f993b != 1) {
                while (i10 < size) {
                    ((e) this.f992a.get(i10)).getClass();
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((e) this.f992a.get(i10)).a();
                    i10++;
                }
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.h hVar);
    }

    public static class i {
    }

    public d(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f979a = reentrantReadWriteLock;
        this.f981c = 3;
        g gVar = aVar.f989a;
        this.f = gVar;
        int i10 = aVar.f990b;
        this.f984g = i10;
        this.f985h = aVar.f991c;
        this.f982d = new Handler(Looper.getMainLooper());
        this.f980b = new r.d();
        a aVar2 = new a(this);
        this.f983e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f981c = 0;
            } catch (Throwable th) {
                this.f979a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.c(aVar2));
            } catch (Throwable th2) {
                aVar2.f988a.d(th2);
            }
        }
    }

    public static d a() {
        d dVar;
        synchronized (f977i) {
            dVar = f978j;
            if (!(dVar != null)) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return dVar;
    }

    public final int b() {
        this.f979a.readLock().lock();
        try {
            return this.f981c;
        } finally {
            this.f979a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f984g == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.f979a.writeLock().lock();
        try {
            if (this.f981c == 0) {
                return;
            }
            this.f981c = 0;
            this.f979a.writeLock().unlock();
            a aVar = this.f983e;
            aVar.getClass();
            try {
                aVar.f988a.f.a(new androidx.emoji2.text.c(aVar));
            } catch (Throwable th) {
                aVar.f988a.d(th);
            }
        } finally {
            this.f979a.writeLock().unlock();
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f979a.writeLock().lock();
        try {
            this.f981c = 2;
            arrayList.addAll(this.f980b);
            this.f980b.clear();
            this.f979a.writeLock().unlock();
            this.f982d.post(new f(arrayList, this.f981c, th));
        } catch (Throwable th2) {
            this.f979a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f979a.writeLock().lock();
        try {
            this.f981c = 1;
            arrayList.addAll(this.f980b);
            this.f980b.clear();
            this.f979a.writeLock().unlock();
            this.f982d.post(new f(arrayList, this.f981c, null));
        } catch (Throwable th) {
            this.f979a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0173, code lost:
    
        if (r8 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ea, code lost:
    
        if (r7.b(r17, r11, r0, r10.f1002d.f1017b) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ee, code lost:
    
        r3 = new t0.j((android.text.Spannable) new android.text.SpannableString(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f8, code lost:
    
        r4 = r10.f1002d.f1017b;
        r7.f996a.getClass();
        r3.setSpan(new t0.i(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0169 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:120:0x005f, B:123:0x0064, B:125:0x0068, B:127:0x0077, B:28:0x0087, B:30:0x0091, B:32:0x0094, B:34:0x0098, B:36:0x00a4, B:38:0x00a7, B:42:0x00b4, B:45:0x00bc, B:51:0x00d6, B:68:0x00e2, B:71:0x00ee, B:72:0x00f8, B:55:0x010d, B:58:0x0114, B:77:0x0119, B:80:0x0124, B:85:0x0129, B:87:0x012d, B:89:0x0133, B:91:0x0137, B:96:0x0144, B:99:0x0150, B:100:0x0156, B:102:0x0169, B:26:0x007d), top: B:119:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:120:0x005f, B:123:0x0064, B:125:0x0068, B:127:0x0077, B:28:0x0087, B:30:0x0091, B:32:0x0094, B:34:0x0098, B:36:0x00a4, B:38:0x00a7, B:42:0x00b4, B:45:0x00bc, B:51:0x00d6, B:68:0x00e2, B:71:0x00ee, B:72:0x00f8, B:55:0x010d, B:58:0x0114, B:77:0x0119, B:80:0x0124, B:85:0x0129, B:87:0x012d, B:89:0x0133, B:91:0x0137, B:96:0x0144, B:99:0x0150, B:100:0x0156, B:102:0x0169, B:26:0x007d), top: B:119:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0150 A[Catch: all -> 0x0180, TryCatch #0 {all -> 0x0180, blocks: (B:120:0x005f, B:123:0x0064, B:125:0x0068, B:127:0x0077, B:28:0x0087, B:30:0x0091, B:32:0x0094, B:34:0x0098, B:36:0x00a4, B:38:0x00a7, B:42:0x00b4, B:45:0x00bc, B:51:0x00d6, B:68:0x00e2, B:71:0x00ee, B:72:0x00f8, B:55:0x010d, B:58:0x0114, B:77:0x0119, B:80:0x0124, B:85:0x0129, B:87:0x012d, B:89:0x0133, B:91:0x0137, B:96:0x0144, B:99:0x0150, B:100:0x0156, B:102:0x0169, B:26:0x007d), top: B:119:0x005f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence f(java.lang.CharSequence r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.f(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("initCallback cannot be null");
        }
        this.f979a.writeLock().lock();
        try {
            if (this.f981c != 1 && this.f981c != 2) {
                this.f980b.add(eVar);
            }
            this.f982d.post(new f(Arrays.asList(eVar), this.f981c, null));
        } finally {
            this.f979a.writeLock().unlock();
        }
    }
}
