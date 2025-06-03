// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine.renderer;

import java.util.ArrayList;
import java.util.List;
import android.os.Looper;
import android.media.ImageReader$OnImageAvailableListener;
import java.io.IOException;
import android.media.Image;
import android.media.ImageReader$Builder;
import u5.l;
import android.os.Build$VERSION;
import android.media.ImageReader;
import java.util.HashMap;
import java.util.ArrayDeque;
import androidx.annotation.Keep;
import android.annotation.TargetApi;
import android.graphics.Rect;
import t5.b;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import android.os.Handler;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry;

public class FlutterRenderer implements TextureRegistry
{
    public final FlutterJNI a;
    public final AtomicLong b;
    public Surface c;
    public boolean d;
    public final Handler e;
    public final Set f;
    public final j g;
    
    public FlutterRenderer(final FlutterJNI a) {
        this.b = new AtomicLong(0L);
        this.d = false;
        this.e = new Handler();
        this.f = new HashSet();
        final j g = new j() {
            @Override
            public void b() {
                FlutterRenderer.a(FlutterRenderer.this, false);
            }
            
            @Override
            public void e() {
                FlutterRenderer.a(FlutterRenderer.this, true);
            }
        };
        this.g = g;
        (this.a = a).addIsDisplayingFlutterUiListener(g);
    }
    
    public static /* synthetic */ boolean a(final FlutterRenderer flutterRenderer, final boolean d) {
        return flutterRenderer.d = d;
    }
    
    public static /* synthetic */ FlutterJNI c(final FlutterRenderer flutterRenderer) {
        return flutterRenderer.a;
    }
    
    public static /* synthetic */ Handler d(final FlutterRenderer flutterRenderer) {
        return flutterRenderer.e;
    }
    
    public void f(final j j) {
        this.a.addIsDisplayingFlutterUiListener(j);
        if (this.d) {
            j.e();
        }
    }
    
    public void g(final ByteBuffer byteBuffer, final int n) {
        this.a.dispatchPointerDataPacket(byteBuffer, n);
    }
    
    public boolean h() {
        return this.d;
    }
    
    public boolean i() {
        return this.a.getIsSoftwareRenderingEnabled();
    }
    
    public void j(final int n) {
        final Iterator<WeakReference<TextureRegistry.b>> iterator = (Iterator<WeakReference<TextureRegistry.b>>)this.f.iterator();
        while (iterator.hasNext()) {
            final TextureRegistry.b b = iterator.next().get();
            if (b != null) {
                b.onTrimMemory(n);
            }
            else {
                iterator.remove();
            }
        }
    }
    
    public void k(final j j) {
        this.a.removeIsDisplayingFlutterUiListener(j);
    }
    
    public final void l() {
        this.a.scheduleFrame();
    }
    
    public void m(final boolean semanticsEnabled) {
        this.a.setSemanticsEnabled(semanticsEnabled);
    }
    
    public void n(final f f) {
        if (!f.a()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Setting viewport metrics\nSize: ");
        sb.append(f.b);
        sb.append(" x ");
        sb.append(f.c);
        sb.append("\nPadding - L: ");
        sb.append(f.g);
        sb.append(", T: ");
        sb.append(f.d);
        sb.append(", R: ");
        sb.append(f.e);
        sb.append(", B: ");
        sb.append(f.f);
        sb.append("\nInsets - L: ");
        sb.append(f.k);
        sb.append(", T: ");
        sb.append(f.h);
        sb.append(", R: ");
        sb.append(f.i);
        sb.append(", B: ");
        sb.append(f.j);
        sb.append("\nSystem Gesture Insets - L: ");
        sb.append(f.o);
        sb.append(", T: ");
        sb.append(f.l);
        sb.append(", R: ");
        sb.append(f.m);
        sb.append(", B: ");
        sb.append(f.m);
        sb.append("\nDisplay Features: ");
        sb.append(f.q.size());
        t5.b.f("FlutterRenderer", sb.toString());
        final int[] array = new int[f.q.size() * 4];
        final int[] array2 = new int[f.q.size()];
        final int[] array3 = new int[f.q.size()];
        for (int i = 0; i < f.q.size(); ++i) {
            final b b = f.q.get(i);
            final int n = i * 4;
            final Rect a = b.a;
            array[n] = a.left;
            array[n + 1] = a.top;
            array[n + 2] = a.right;
            array[n + 3] = a.bottom;
            array2[i] = b.b.o;
            array3[i] = b.c.o;
        }
        this.a.setViewportMetrics(f.a, f.b, f.c, f.d, f.e, f.f, f.g, f.h, f.i, f.j, f.k, f.l, f.m, f.n, f.o, f.p, array, array2, array3);
    }
    
    public void o(final Surface c, final boolean b) {
        if (!b) {
            this.p();
        }
        this.c = c;
        if (b) {
            this.a.onSurfaceWindowChanged(c);
            return;
        }
        this.a.onSurfaceCreated(c);
    }
    
    public void p() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.g.b();
            }
            this.d = false;
            this.c = null;
        }
    }
    
    public void q(final int n, final int n2) {
        this.a.onSurfaceChanged(n, n2);
    }
    
    public void r(final Surface c) {
        this.c = c;
        this.a.onSurfaceWindowChanged(c);
    }
    
    public final void s(final long n) {
        this.a.unregisterTexture(n);
    }
    
    @TargetApi(29)
    @Keep
    public final class ImageReaderSurfaceProducer implements SurfaceProducer, ImageConsumer, TextureRegistry.b
    {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private boolean createNewReader;
        private final long id;
        private boolean ignoringFence;
        private final ArrayDeque<b> imageReaderQueue;
        private long lastDequeueTime;
        private a lastDequeuedImage;
        private long lastQueueTime;
        private b lastReaderDequeuedFrom;
        private long lastScheduleTime;
        private Object lock;
        private int numTrims;
        private final HashMap<ImageReader, b> perImageReaders;
        private boolean released;
        private int requestedHeight;
        private int requestedWidth;
        private boolean trimOnMemoryPressure;
        
        public ImageReaderSurfaceProducer(final long id) {
            this.ignoringFence = false;
            this.trimOnMemoryPressure = true;
            this.requestedWidth = 1;
            this.requestedHeight = 1;
            this.createNewReader = true;
            this.lastDequeueTime = 0L;
            this.lastQueueTime = 0L;
            this.lastScheduleTime = 0L;
            this.numTrims = 0;
            this.lock = new Object();
            this.imageReaderQueue = new ArrayDeque<b>();
            this.perImageReaders = new HashMap<ImageReader, b>();
            this.lastDequeuedImage = null;
            this.lastReaderDequeuedFrom = null;
            this.id = id;
        }
        
        public static /* synthetic */ b access$500(final ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            return imageReaderSurfaceProducer.lastReaderDequeuedFrom;
        }
        
        private void cleanup() {
            final Object lock = this.lock;
            // monitorenter(lock)
            while (true) {
                try {
                    for (final b b : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == b) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        b.d();
                    }
                    this.perImageReaders.clear();
                    final a lastDequeuedImage = this.lastDequeuedImage;
                    if (lastDequeuedImage != null) {
                        lastDequeuedImage.a.close();
                        this.lastDequeuedImage = null;
                    }
                    final b lastReaderDequeuedFrom = this.lastReaderDequeuedFrom;
                    if (lastReaderDequeuedFrom != null) {
                        lastReaderDequeuedFrom.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                    // monitorexit(lock)
                    return;
                    // monitorexit(lock)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        private ImageReader createImageReader() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 33) {
                return this.createImageReader33();
            }
            if (sdk_INT >= 29) {
                return this.createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        
        @TargetApi(29)
        private ImageReader createImageReader29() {
            return l.a(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }
        
        @TargetApi(33)
        private ImageReader createImageReader33() {
            h.a();
            final ImageReader$Builder a = io.flutter.embedding.engine.renderer.g.a(this.requestedWidth, this.requestedHeight);
            io.flutter.embedding.engine.renderer.a.a(a, 5);
            io.flutter.embedding.engine.renderer.b.a(a, 34);
            io.flutter.embedding.engine.renderer.c.a(a, 256L);
            return io.flutter.embedding.engine.renderer.d.a(a);
        }
        
        private b getActiveReader() {
            final Object lock = this.lock;
            // monitorenter(lock)
            while (true) {
                try {
                    if (this.createNewReader) {
                        this.createNewReader = false;
                        // monitorexit(lock)
                        return this.getOrCreatePerImageReader(this.createImageReader());
                    }
                    // monitorexit(lock)
                    return this.imageReaderQueue.peekLast();
                    // monitorexit(lock)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        private void maybeWaitOnFence(final Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build$VERSION.SDK_INT >= 33) {
                this.waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            t5.b.g("ImageReaderSurfaceProducer", "ImageTextureEntry can't wait on the fence on Android < 33");
        }
        
        private void releaseInternal() {
            this.cleanup();
            this.released = true;
        }
        
        @TargetApi(33)
        private void waitOnFence(final Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            }
            catch (IOException ex) {}
        }
        
        @TargetApi(29)
        @Override
        public Image acquireLatestImage() {
            final a dequeueImage = this.dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            this.maybeWaitOnFence(dequeueImage.a);
            return dequeueImage.a;
        }
        
        public double deltaMillis(final long n) {
            return n / 1000000.0;
        }
        
        public a dequeueImage() {
            final Object lock = this.lock;
            // monitorenter(lock)
            while (true) {
                try {
                    final Iterator<b> iterator = this.imageReaderQueue.iterator();
                    Object e = null;
                    while (iterator.hasNext()) {
                        final b lastReaderDequeuedFrom = iterator.next();
                        e = lastReaderDequeuedFrom.e();
                        if (e == null) {
                            continue;
                        }
                        final a lastDequeuedImage = this.lastDequeuedImage;
                        if (lastDequeuedImage != null) {
                            lastDequeuedImage.a.close();
                            this.lastDequeuedImage = null;
                        }
                        this.lastDequeuedImage = (a)e;
                        this.lastReaderDequeuedFrom = lastReaderDequeuedFrom;
                        break;
                    }
                    this.pruneImageReaderQueue();
                    // monitorexit(lock)
                    return (a)e;
                    // monitorexit(lock)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public void disableFenceForTest() {
            this.ignoringFence = true;
        }
        
        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                this.releaseInternal();
                FlutterRenderer.d(FlutterRenderer.this).post((Runnable)new e(this.id, FlutterRenderer.c(FlutterRenderer.this)));
            }
            finally {
                super.finalize();
            }
        }
        
        @Override
        public int getHeight() {
            return this.requestedHeight;
        }
        
        public b getOrCreatePerImageReader(final ImageReader imageReader) {
            b b;
            if ((b = this.perImageReaders.get(imageReader)) == null) {
                b = new b(imageReader);
                this.perImageReaders.put(imageReader, b);
                this.imageReaderQueue.add(b);
            }
            return b;
        }
        
        @Override
        public Surface getSurface() {
            return this.getActiveReader().a.getSurface();
        }
        
        @Override
        public int getWidth() {
            return this.requestedWidth;
        }
        
        @Override
        public long id() {
            return this.id;
        }
        
        public int numImageReaders() {
            synchronized (this.lock) {
                return this.imageReaderQueue.size();
            }
        }
        
        public int numImages() {
            final Object lock = this.lock;
            // monitorenter(lock)
            while (true) {
                try {
                    final Iterator<b> iterator = this.imageReaderQueue.iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        n += b.b(iterator.next()).size();
                    }
                    // monitorexit(lock)
                    return n;
                    // monitorexit(lock)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public int numTrims() {
            synchronized (this.lock) {
                return this.numTrims;
            }
        }
        
        public void onImage(final ImageReader imageReader, final Image image) {
            synchronized (this.lock) {
                final a g = this.getOrCreatePerImageReader(imageReader).g(image);
                // monitorexit(this.lock)
                if (g == null) {
                    return;
                }
                FlutterRenderer.this.l();
            }
        }
        
        @Override
        public void onTrimMemory(final int n) {
            if (!this.trimOnMemoryPressure) {
                return;
            }
            if (n < 40) {
                return;
            }
            synchronized (this.lock) {
                ++this.numTrims;
                // monitorexit(this.lock)
                this.cleanup();
                this.createNewReader = true;
            }
        }
        
        public void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                final b b = this.imageReaderQueue.peekFirst();
                if (!b.c()) {
                    return;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(b.a);
                b.d();
            }
        }
        
        @Override
        public void release() {
            if (this.released) {
                return;
            }
            this.releaseInternal();
            FlutterRenderer.this.s(this.id);
        }
        
        @Override
        public void scheduleFrame() {
            FlutterRenderer.this.l();
        }
        
        @Override
        public void setSize(int max, int max2) {
            max = Math.max(1, max);
            max2 = Math.max(1, max2);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
        
        public class a
        {
            public final Image a;
            public final long b;
            
            public a(final Image a, final long b) {
                this.a = a;
                this.b = b;
            }
        }
        
        public class b
        {
            public final ImageReader a;
            public final ArrayDeque b;
            public boolean c;
            public final ImageReader$OnImageAvailableListener d;
            
            public b(final ImageReader a) {
                this.b = new ArrayDeque();
                this.c = false;
                final i d = new i(this);
                this.d = (ImageReader$OnImageAvailableListener)d;
                (this.a = a).setOnImageAvailableListener((ImageReader$OnImageAvailableListener)d, new Handler(Looper.getMainLooper()));
            }
            
            public static /* synthetic */ ArrayDeque b(final b b) {
                return b.b;
            }
            
            public boolean c() {
                return this.b.size() == 0 && ImageReaderSurfaceProducer.access$500(ImageReaderSurfaceProducer.this) != this;
            }
            
            public void d() {
                this.c = true;
                this.a.close();
                this.b.clear();
            }
            
            public a e() {
                if (this.b.size() == 0) {
                    return null;
                }
                return this.b.removeFirst();
            }
            
            public a g(final Image image) {
                if (this.c) {
                    return null;
                }
                final a e = new a(image, System.nanoTime());
                this.b.add(e);
                while (this.b.size() > 2) {
                    this.b.removeFirst().a.close();
                }
                return e;
            }
        }
    }
    
    @Keep
    public final class ImageTextureRegistryEntry implements ImageTextureEntry, ImageConsumer
    {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence;
        private Image image;
        private boolean released;
        
        public ImageTextureRegistryEntry(final long id) {
            this.ignoringFence = false;
            this.id = id;
        }
        
        @TargetApi(29)
        private void maybeWaitOnFence(final Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build$VERSION.SDK_INT >= 33) {
                this.waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            b.g("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
        }
        
        @TargetApi(33)
        private void waitOnFence(final Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
            }
            catch (IOException ex) {}
        }
        
        @TargetApi(29)
        @Override
        public Image acquireLatestImage() {
            synchronized (this) {
                final Image image = this.image;
                this.image = null;
                // monitorexit(this)
                this.maybeWaitOnFence(image);
                return image;
            }
        }
        
        public void finalize() {
            while (true) {
                try {
                    if (this.released) {
                        super.finalize();
                        return;
                    }
                    final Image image = this.image;
                    if (image != null) {
                        image.close();
                        this.image = null;
                    }
                    this.released = true;
                    FlutterRenderer.d(FlutterRenderer.this).post((Runnable)new e(this.id, FlutterRenderer.c(FlutterRenderer.this)));
                    super.finalize();
                    return;
                    super.finalize();
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        @Override
        public long id() {
            return this.id;
        }
        
        @Override
        public void pushImage(final Image image) {
            if (this.released) {
                return;
            }
            synchronized (this) {
                final Image image2 = this.image;
                this.image = image;
                // monitorexit(this)
                if (image2 != null) {
                    b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
                    image2.close();
                }
                if (image != null) {
                    FlutterRenderer.this.l();
                }
            }
        }
        
        @Override
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            final Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.s(this.id);
        }
    }
    
    public static final class b
    {
        public final Rect a;
        public final d b;
        public final c c;
        
        public b(final Rect a, final d b) {
            this.a = a;
            this.b = b;
            this.c = c.p;
        }
        
        public b(final Rect a, final d b, final c c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public enum c
    {
        p("UNKNOWN", 0, 0), 
        q("POSTURE_FLAT", 1, 1), 
        r("POSTURE_HALF_OPENED", 2, 2);
        
        public final int o;
        
        static {
            s = c();
        }
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ c[] c() {
            return new c[] { c.p, c.q, c.r };
        }
    }
    
    public enum d
    {
        p("UNKNOWN", 0, 0), 
        q("FOLD", 1, 1), 
        r("HINGE", 2, 2), 
        s("CUTOUT", 3, 3);
        
        public final int o;
        
        static {
            t = c();
        }
        
        public d(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ d[] c() {
            return new d[] { d.p, d.q, d.r, d.s };
        }
    }
    
    public static final class e implements Runnable
    {
        public final long o;
        public final FlutterJNI p;
        
        public e(final long o, final FlutterJNI p2) {
            this.o = o;
            this.p = p2;
        }
        
        @Override
        public void run() {
            if (!this.p.isAttached()) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Releasing a Texture (");
            sb.append(this.o);
            sb.append(").");
            t5.b.f("FlutterRenderer", sb.toString());
            this.p.unregisterTexture(this.o);
        }
    }
    
    public static final class f
    {
        public float a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public List q;
        
        public f() {
            this.a = 1.0f;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = -1;
            this.q = new ArrayList();
        }
        
        public boolean a() {
            return this.b > 0 && this.c > 0 && this.a > 0.0f;
        }
    }
}
