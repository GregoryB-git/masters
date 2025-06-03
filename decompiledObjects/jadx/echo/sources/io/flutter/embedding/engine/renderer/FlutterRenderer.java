package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f14938a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f14940c;

    /* renamed from: g, reason: collision with root package name */
    public final j f14944g;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f14939b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f14941d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f14942e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final Set f14943f = new HashSet();

    @Keep
    @TargetApi(29)
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private final long id;
        private boolean released;
        private boolean ignoringFence = false;
        private boolean trimOnMemoryPressure = true;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private a lastDequeuedImage = null;
        private b lastReaderDequeuedFrom = null;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Image f14945a;

            /* renamed from: b, reason: collision with root package name */
            public final long f14946b;

            public a(Image image, long j7) {
                this.f14945a = image;
                this.f14946b = j7;
            }
        }

        public class b {

            /* renamed from: a, reason: collision with root package name */
            public final ImageReader f14948a;

            /* renamed from: b, reason: collision with root package name */
            public final ArrayDeque f14949b = new ArrayDeque();

            /* renamed from: c, reason: collision with root package name */
            public boolean f14950c = false;

            /* renamed from: d, reason: collision with root package name */
            public final ImageReader.OnImageAvailableListener f14951d;

            public b(ImageReader imageReader) {
                ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.b.this.f(imageReader2);
                    }
                };
                this.f14951d = onImageAvailableListener;
                this.f14948a = imageReader;
                imageReader.setOnImageAvailableListener(onImageAvailableListener, new Handler(Looper.getMainLooper()));
            }

            public boolean c() {
                return this.f14949b.size() == 0 && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            public void d() {
                this.f14950c = true;
                this.f14948a.close();
                this.f14949b.clear();
            }

            public a e() {
                if (this.f14949b.size() == 0) {
                    return null;
                }
                return (a) this.f14949b.removeFirst();
            }

            public final /* synthetic */ void f(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e7) {
                    AbstractC1995b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e7);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.f14950c) {
                    image.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            public a g(Image image) {
                if (this.f14950c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.f14949b.add(aVar);
                while (this.f14949b.size() > 2) {
                    ((a) this.f14949b.removeFirst()).f14945a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j7) {
            this.id = j7;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    a aVar = this.lastDequeuedImage;
                    if (aVar != null) {
                        aVar.f14945a.close();
                        this.lastDequeuedImage = null;
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                return createImageReader33();
            }
            if (i7 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
            return newInstance;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader build;
            h.a();
            ImageReader.Builder a7 = g.a(this.requestedWidth, this.requestedHeight);
            a7.setMaxImages(5);
            a7.setImageFormat(34);
            a7.setUsage(256L);
            build = a7.build();
            return build;
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = false;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC1995b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.f14945a);
            return dequeueImage.f14945a;
        }

        public double deltaMillis(long j7) {
            return j7 / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        a e7 = next.e();
                        if (e7 == null) {
                            aVar = e7;
                        } else {
                            a aVar2 = this.lastDequeuedImage;
                            if (aVar2 != null) {
                                aVar2.f14945a.close();
                                this.lastDequeuedImage = null;
                            }
                            this.lastDequeuedImage = e7;
                            this.lastReaderDequeuedFrom = next;
                            aVar = e7;
                        }
                    }
                    pruneImageReaderQueue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f14942e.post(new e(this.id, FlutterRenderer.this.f14938a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVar2 = new b(imageReader);
            this.perImageReaders.put(imageReader, bVar2);
            this.imageReaderQueue.add(bVar2);
            return bVar2;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f14948a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i7;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    i7 = 0;
                    while (it.hasNext()) {
                        i7 += it.next().f14949b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i7;
        }

        public int numTrims() {
            int i7;
            synchronized (this.lock) {
                i7 = this.numTrims;
            }
            return i7;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a g7;
            synchronized (this.lock) {
                g7 = getOrCreatePerImageReader(imageReader).g(image);
            }
            if (g7 == null) {
                return;
            }
            FlutterRenderer.this.l();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i7) {
            if (this.trimOnMemoryPressure && i7 >= 40) {
                synchronized (this.lock) {
                    this.numTrims++;
                }
                cleanup();
                this.createNewReader = true;
            }
        }

        public void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                b peekFirst = this.imageReaderQueue.peekFirst();
                if (!peekFirst.c()) {
                    return;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.f14948a);
                peekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.s(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.l();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i7, int i8) {
            int max = Math.max(1, i7);
            int max2 = Math.max(1, i8);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @Keep
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j7) {
            this.id = j7;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC1995b.g(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f14942e.post(new e(this.id, FlutterRenderer.this.f14938a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                AbstractC1995b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.l();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.s(this.id);
        }
    }

    public class a implements j {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            FlutterRenderer.this.f14941d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void e() {
            FlutterRenderer.this.f14941d = true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f14954a;

        /* renamed from: b, reason: collision with root package name */
        public final d f14955b;

        /* renamed from: c, reason: collision with root package name */
        public final c f14956c;

        public b(Rect rect, d dVar) {
            this.f14954a = rect;
            this.f14955b = dVar;
            this.f14956c = c.UNKNOWN;
        }

        public b(Rect rect, d dVar, c cVar) {
            this.f14954a = rect;
            this.f14955b = dVar;
            this.f14956c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* renamed from: o, reason: collision with root package name */
        public final int f14961o;

        c(int i7) {
            this.f14961o = i7;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* renamed from: o, reason: collision with root package name */
        public final int f14967o;

        d(int i7) {
            this.f14967o = i7;
        }
    }

    public static final class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final long f14968o;

        /* renamed from: p, reason: collision with root package name */
        public final FlutterJNI f14969p;

        public e(long j7, FlutterJNI flutterJNI) {
            this.f14968o = j7;
            this.f14969p = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14969p.isAttached()) {
                AbstractC1995b.f("FlutterRenderer", "Releasing a Texture (" + this.f14968o + ").");
                this.f14969p.unregisterTexture(this.f14968o);
            }
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public float f14970a = 1.0f;

        /* renamed from: b, reason: collision with root package name */
        public int f14971b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f14972c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f14973d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f14974e = 0;

        /* renamed from: f, reason: collision with root package name */
        public int f14975f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f14976g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f14977h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f14978i = 0;

        /* renamed from: j, reason: collision with root package name */
        public int f14979j = 0;

        /* renamed from: k, reason: collision with root package name */
        public int f14980k = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f14981l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f14982m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f14983n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f14984o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f14985p = -1;

        /* renamed from: q, reason: collision with root package name */
        public List f14986q = new ArrayList();

        public boolean a() {
            return this.f14971b > 0 && this.f14972c > 0 && this.f14970a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f14944g = aVar;
        this.f14938a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public void f(j jVar) {
        this.f14938a.addIsDisplayingFlutterUiListener(jVar);
        if (this.f14941d) {
            jVar.e();
        }
    }

    public void g(ByteBuffer byteBuffer, int i7) {
        this.f14938a.dispatchPointerDataPacket(byteBuffer, i7);
    }

    public boolean h() {
        return this.f14941d;
    }

    public boolean i() {
        return this.f14938a.getIsSoftwareRenderingEnabled();
    }

    public void j(int i7) {
        Iterator it = this.f14943f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i7);
            } else {
                it.remove();
            }
        }
    }

    public void k(j jVar) {
        this.f14938a.removeIsDisplayingFlutterUiListener(jVar);
    }

    public final void l() {
        this.f14938a.scheduleFrame();
    }

    public void m(boolean z7) {
        this.f14938a.setSemanticsEnabled(z7);
    }

    public void n(f fVar) {
        if (fVar.a()) {
            AbstractC1995b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + fVar.f14971b + " x " + fVar.f14972c + "\nPadding - L: " + fVar.f14976g + ", T: " + fVar.f14973d + ", R: " + fVar.f14974e + ", B: " + fVar.f14975f + "\nInsets - L: " + fVar.f14980k + ", T: " + fVar.f14977h + ", R: " + fVar.f14978i + ", B: " + fVar.f14979j + "\nSystem Gesture Insets - L: " + fVar.f14984o + ", T: " + fVar.f14981l + ", R: " + fVar.f14982m + ", B: " + fVar.f14982m + "\nDisplay Features: " + fVar.f14986q.size());
            int[] iArr = new int[fVar.f14986q.size() * 4];
            int[] iArr2 = new int[fVar.f14986q.size()];
            int[] iArr3 = new int[fVar.f14986q.size()];
            for (int i7 = 0; i7 < fVar.f14986q.size(); i7++) {
                b bVar = (b) fVar.f14986q.get(i7);
                int i8 = i7 * 4;
                Rect rect = bVar.f14954a;
                iArr[i8] = rect.left;
                iArr[i8 + 1] = rect.top;
                iArr[i8 + 2] = rect.right;
                iArr[i8 + 3] = rect.bottom;
                iArr2[i7] = bVar.f14955b.f14967o;
                iArr3[i7] = bVar.f14956c.f14961o;
            }
            this.f14938a.setViewportMetrics(fVar.f14970a, fVar.f14971b, fVar.f14972c, fVar.f14973d, fVar.f14974e, fVar.f14975f, fVar.f14976g, fVar.f14977h, fVar.f14978i, fVar.f14979j, fVar.f14980k, fVar.f14981l, fVar.f14982m, fVar.f14983n, fVar.f14984o, fVar.f14985p, iArr, iArr2, iArr3);
        }
    }

    public void o(Surface surface, boolean z7) {
        if (!z7) {
            p();
        }
        this.f14940c = surface;
        if (z7) {
            this.f14938a.onSurfaceWindowChanged(surface);
        } else {
            this.f14938a.onSurfaceCreated(surface);
        }
    }

    public void p() {
        if (this.f14940c != null) {
            this.f14938a.onSurfaceDestroyed();
            if (this.f14941d) {
                this.f14944g.b();
            }
            this.f14941d = false;
            this.f14940c = null;
        }
    }

    public void q(int i7, int i8) {
        this.f14938a.onSurfaceChanged(i7, i8);
    }

    public void r(Surface surface) {
        this.f14940c = surface;
        this.f14938a.onSurfaceWindowChanged(surface);
    }

    public final void s(long j7) {
        this.f14938a.unregisterTexture(j7);
    }
}
