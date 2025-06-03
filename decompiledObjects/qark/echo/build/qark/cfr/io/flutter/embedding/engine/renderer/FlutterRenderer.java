/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Rect
 *  android.media.Image
 *  android.media.ImageReader
 *  android.media.ImageReader$Builder
 *  android.media.ImageReader$OnImageAvailableListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.Surface
 *  java.io.IOException
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.ref.WeakReference
 *  java.nio.ByteBuffer
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicLong
 */
package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.embedding.engine.renderer.g;
import io.flutter.embedding.engine.renderer.h;
import io.flutter.embedding.engine.renderer.i;
import io.flutter.embedding.engine.renderer.j;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import u5.l;

public class FlutterRenderer
implements TextureRegistry {
    public final FlutterJNI a;
    public final AtomicLong b = new AtomicLong(0L);
    public Surface c;
    public boolean d = false;
    public final Handler e = new Handler();
    public final Set f = new HashSet();
    public final j g;

    public FlutterRenderer(FlutterJNI flutterJNI) {
        j j8;
        this.g = j8 = new j(){

            @Override
            public void b() {
                FlutterRenderer.this.d = false;
            }

            @Override
            public void e() {
                FlutterRenderer.this.d = true;
            }
        };
        this.a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(j8);
    }

    public void f(j j8) {
        this.a.addIsDisplayingFlutterUiListener(j8);
        if (this.d) {
            j8.e();
        }
    }

    public void g(ByteBuffer byteBuffer, int n8) {
        this.a.dispatchPointerDataPacket(byteBuffer, n8);
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.a.getIsSoftwareRenderingEnabled();
    }

    public void j(int n8) {
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            TextureRegistry.b b8 = (TextureRegistry.b)((WeakReference)iterator.next()).get();
            if (b8 != null) {
                b8.onTrimMemory(n8);
                continue;
            }
            iterator.remove();
        }
    }

    public void k(j j8) {
        this.a.removeIsDisplayingFlutterUiListener(j8);
    }

    public final void l() {
        this.a.scheduleFrame();
    }

    public void m(boolean bl) {
        this.a.setSemanticsEnabled(bl);
    }

    public void n(f f8) {
        if (!f8.a()) {
            return;
        }
        int[] arrn = new int[]();
        arrn.append("Setting viewport metrics\nSize: ");
        arrn.append(f8.b);
        arrn.append(" x ");
        arrn.append(f8.c);
        arrn.append("\nPadding - L: ");
        arrn.append(f8.g);
        arrn.append(", T: ");
        arrn.append(f8.d);
        arrn.append(", R: ");
        arrn.append(f8.e);
        arrn.append(", B: ");
        arrn.append(f8.f);
        arrn.append("\nInsets - L: ");
        arrn.append(f8.k);
        arrn.append(", T: ");
        arrn.append(f8.h);
        arrn.append(", R: ");
        arrn.append(f8.i);
        arrn.append(", B: ");
        arrn.append(f8.j);
        arrn.append("\nSystem Gesture Insets - L: ");
        arrn.append(f8.o);
        arrn.append(", T: ");
        arrn.append(f8.l);
        arrn.append(", R: ");
        arrn.append(f8.m);
        arrn.append(", B: ");
        arrn.append(f8.m);
        arrn.append("\nDisplay Features: ");
        arrn.append(f8.q.size());
        t5.b.f("FlutterRenderer", arrn.toString());
        arrn = new int[f8.q.size() * 4];
        int[] arrn2 = new int[f8.q.size()];
        int[] arrn3 = new int[f8.q.size()];
        for (int i8 = 0; i8 < f8.q.size(); ++i8) {
            b b8 = (b)f8.q.get(i8);
            int n8 = i8 * 4;
            Rect rect = b8.a;
            arrn[n8] = rect.left;
            arrn[n8 + 1] = rect.top;
            arrn[n8 + 2] = rect.right;
            arrn[n8 + 3] = rect.bottom;
            arrn2[i8] = b8.b.o;
            arrn3[i8] = b8.c.o;
        }
        this.a.setViewportMetrics(f8.a, f8.b, f8.c, f8.d, f8.e, f8.f, f8.g, f8.h, f8.i, f8.j, f8.k, f8.l, f8.m, f8.n, f8.o, f8.p, arrn, arrn2, arrn3);
    }

    public void o(Surface surface, boolean bl) {
        if (!bl) {
            this.p();
        }
        this.c = surface;
        if (bl) {
            this.a.onSurfaceWindowChanged(surface);
            return;
        }
        this.a.onSurfaceCreated(surface);
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

    public void q(int n8, int n9) {
        this.a.onSurfaceChanged(n8, n9);
    }

    public void r(Surface surface) {
        this.c = surface;
        this.a.onSurfaceWindowChanged(surface);
    }

    public final void s(long l8) {
        this.a.unregisterTexture(l8);
    }

    @TargetApi(value=29)
    @Keep
    public final class ImageReaderSurfaceProducer
    implements TextureRegistry.SurfaceProducer,
    TextureRegistry.ImageConsumer,
    TextureRegistry.b {
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

        public ImageReaderSurfaceProducer(long l8) {
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
            this.imageReaderQueue = new ArrayDeque();
            this.perImageReaders = new HashMap();
            this.lastDequeuedImage = null;
            this.lastReaderDequeuedFrom = null;
            this.id = l8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void cleanup() {
            Object object = this.lock;
            synchronized (object) {
                try {
                    for (b b8 : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == b8) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        b8.d();
                    }
                    this.perImageReaders.clear();
                    Object object2 = this.lastDequeuedImage;
                    if (object2 != null) {
                        object2.a.close();
                        this.lastDequeuedImage = null;
                    }
                    if ((object2 = this.lastReaderDequeuedFrom) != null) {
                        object2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        private ImageReader createImageReader() {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 33) {
                return this.createImageReader33();
            }
            if (n8 >= 29) {
                return this.createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(value=29)
        private ImageReader createImageReader29() {
            return l.a(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
        }

        @TargetApi(value=33)
        private ImageReader createImageReader33() {
            h.a();
            ImageReader.Builder builder = g.a(this.requestedWidth, this.requestedHeight);
            io.flutter.embedding.engine.renderer.a.a(builder, 5);
            io.flutter.embedding.engine.renderer.b.a(builder, 34);
            io.flutter.embedding.engine.renderer.c.a(builder, 256L);
            return io.flutter.embedding.engine.renderer.d.a(builder);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private b getActiveReader() {
            Object object = this.lock;
            synchronized (object) {
                try {
                    if (!this.createNewReader) return (b)this.imageReaderQueue.peekLast();
                    this.createNewReader = false;
                    return this.getOrCreatePerImageReader(this.createImageReader());
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
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

        @TargetApi(value=33)
        private void waitOnFence(Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        @TargetApi(value=29)
        @Override
        public Image acquireLatestImage() {
            a a8 = this.dequeueImage();
            if (a8 == null) {
                return null;
            }
            this.maybeWaitOnFence(a8.a);
            return a8.a;
        }

        public double deltaMillis(long l8) {
            return (double)l8 / 1000000.0;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public a dequeueImage() {
            Object object = this.lock;
            synchronized (object) {
                try {
                    Object object2 = this.imageReaderQueue.iterator();
                    a a8 = null;
                    while (object2.hasNext()) {
                        b b8 = (b)object2.next();
                        a8 = b8.e();
                        if (a8 == null) continue;
                        object2 = this.lastDequeuedImage;
                        if (object2 != null) {
                            object2.a.close();
                            this.lastDequeuedImage = null;
                        }
                        this.lastDequeuedImage = a8;
                        this.lastReaderDequeuedFrom = b8;
                        break;
                    }
                    this.pruneImageReaderQueue();
                    return a8;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            block4 : {
                boolean bl = this.released;
                if (!bl) break block4;
                super.finalize();
                return;
            }
            try {
                this.releaseInternal();
                FlutterRenderer.this.e.post((Runnable)new e(this.id, FlutterRenderer.this.a));
                return;
            }
            finally {
                super.finalize();
            }
        }

        @Override
        public int getHeight() {
            return this.requestedHeight;
        }

        public b getOrCreatePerImageReader(ImageReader imageReader) {
            b b8;
            b b9 = b8 = (b)this.perImageReaders.get((Object)imageReader);
            if (b8 == null) {
                b9 = new b(imageReader);
                this.perImageReaders.put((Object)imageReader, (Object)b9);
                this.imageReaderQueue.add((Object)b9);
            }
            return b9;
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

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public int numImageReaders() {
            Object object = this.lock;
            synchronized (object) {
                return this.imageReaderQueue.size();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public int numImages() {
            Object object = this.lock;
            synchronized (object) {
                try {
                    Iterator iterator = this.imageReaderQueue.iterator();
                    int n8 = 0;
                    do {
                        if (!iterator.hasNext()) {
                            return n8;
                        }
                        n8 += ((b)iterator.next()).b.size();
                    } while (true);
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public int numTrims() {
            Object object = this.lock;
            synchronized (object) {
                return this.numTrims;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onImage(ImageReader object, Image image) {
            Object object2 = this.lock;
            // MONITORENTER : object2
            object = this.getOrCreatePerImageReader((ImageReader)object).g(image);
            // MONITOREXIT : object2
            if (object == null) {
                return;
            }
            FlutterRenderer.this.l();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void onTrimMemory(int n8) {
            if (!this.trimOnMemoryPressure) {
                return;
            }
            if (n8 < 40) {
                return;
            }
            Object object = this.lock;
            synchronized (object) {
                ++this.numTrims;
            }
            this.cleanup();
            this.createNewReader = true;
        }

        public void pruneImageReaderQueue() {
            while (this.imageReaderQueue.size() > 1) {
                b b8 = (b)this.imageReaderQueue.peekFirst();
                if (!b8.c()) {
                    return;
                }
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove((Object)b8.a);
                b8.d();
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
        public void setSize(int n8, int n9) {
            n8 = Math.max((int)1, (int)n8);
            n9 = Math.max((int)1, (int)n9);
            if (this.requestedWidth == n8 && this.requestedHeight == n9) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = n9;
            this.requestedWidth = n8;
        }

        public class a {
            public final Image a;
            public final long b;

            public a(Image image, long l8) {
                this.a = image;
                this.b = l8;
            }
        }

        public class b {
            public final ImageReader a;
            public final ArrayDeque b;
            public boolean c;
            public final ImageReader.OnImageAvailableListener d;

            public b(ImageReader imageReader) {
                this.b = new ArrayDeque();
                this.c = false;
                this.d = object = new i(this);
                this.a = imageReader;
                imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener)ImageReaderSurfaceProducer.this, new Handler(Looper.getMainLooper()));
            }

            public static /* synthetic */ void a(b b8, ImageReader imageReader) {
                b8.f(imageReader);
            }

            public boolean c() {
                if (this.b.size() == 0 && ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this) {
                    return true;
                }
                return false;
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
                return (a)this.b.removeFirst();
            }

            public final /* synthetic */ void f(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                }
                catch (IllegalStateException illegalStateException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onImageAvailable acquireLatestImage failed: ");
                    stringBuilder.append((Object)illegalStateException);
                    t5.b.b("ImageReaderSurfaceProducer", stringBuilder.toString());
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (!ImageReaderSurfaceProducer.this.released && !this.c) {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                    return;
                }
                image.close();
            }

            public a g(Image object) {
                if (this.c) {
                    return null;
                }
                object = new a((Image)object, System.nanoTime());
                this.b.add(object);
                while (this.b.size() > 2) {
                    ((a)this.b.removeFirst()).a.close();
                }
                return object;
            }
        }

    }

    @Keep
    public final class ImageTextureRegistryEntry
    implements TextureRegistry.ImageTextureEntry,
    TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long l8) {
            this.ignoringFence = false;
            this.id = l8;
        }

        @TargetApi(value=29)
        private void maybeWaitOnFence(Image image) {
            if (image == null) {
                return;
            }
            if (this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            t5.b.g("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        @TargetApi(value=33)
        private void waitOnFence(Image image) {
            try {
                io.flutter.embedding.engine.renderer.f.a(io.flutter.embedding.engine.renderer.e.a(image));
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @TargetApi(value=29)
        @Override
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            this.maybeWaitOnFence(image);
            return image;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void finalize() {
            Throwable throwable2;
            block4 : {
                try {
                    boolean bl = this.released;
                    if (!bl) break block4;
                }
                catch (Throwable throwable2) {}
                super.finalize();
                return;
            }
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            this.released = true;
            FlutterRenderer.this.e.post((Runnable)new e(this.id, FlutterRenderer.this.a));
            super.finalize();
            return;
            super.finalize();
            throw throwable2;
        }

        @Override
        public long id() {
            return this.id;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public void pushImage(Image image) {
            if (this.released) {
                return;
            }
            // MONITORENTER : this
            Image image2 = this.image;
            this.image = image;
            // MONITOREXIT : this
            if (image2 != null) {
                t5.b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
                image2.close();
            }
            if (image == null) return;
            FlutterRenderer.this.l();
        }

        @Override
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

    public static final class b {
        public final Rect a;
        public final d b;
        public final c c;

        public b(Rect rect, d d8) {
            this.a = rect;
            this.b = d8;
            this.c = c.p;
        }

        public b(Rect rect, d d8, c c8) {
            this.a = rect;
            this.b = d8;
            this.c = c8;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c p = new c(0);
        public static final /* enum */ c q = new c(1);
        public static final /* enum */ c r = new c(2);
        public static final /* synthetic */ c[] s;
        public final int o;

        static {
            s = c.c();
        }

        public c(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ c[] c() {
            return new c[]{p, q, r};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])s.clone();
        }
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d p = new d(0);
        public static final /* enum */ d q = new d(1);
        public static final /* enum */ d r = new d(2);
        public static final /* enum */ d s = new d(3);
        public static final /* synthetic */ d[] t;
        public final int o;

        static {
            t = d.c();
        }

        public d(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ d[] c() {
            return new d[]{p, q, r, s};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])t.clone();
        }
    }

    public static final class e
    implements Runnable {
        public final long o;
        public final FlutterJNI p;

        public e(long l8, FlutterJNI flutterJNI) {
            this.o = l8;
            this.p = flutterJNI;
        }

        public void run() {
            if (!this.p.isAttached()) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Releasing a Texture (");
            stringBuilder.append(this.o);
            stringBuilder.append(").");
            t5.b.f("FlutterRenderer", stringBuilder.toString());
            this.p.unregisterTexture(this.o);
        }
    }

    public static final class f {
        public float a = 1.0f;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = -1;
        public List q = new ArrayList();

        public boolean a() {
            if (this.b > 0 && this.c > 0 && this.a > 0.0f) {
                return true;
            }
            return false;
        }
    }

}

