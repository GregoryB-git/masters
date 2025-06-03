package k0;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427o {

    /* renamed from: a, reason: collision with root package name */
    public int f15851a;

    /* renamed from: b, reason: collision with root package name */
    public int f15852b;

    /* renamed from: c, reason: collision with root package name */
    public int f15853c;

    /* renamed from: d, reason: collision with root package name */
    public int f15854d;

    /* renamed from: e, reason: collision with root package name */
    public int f15855e;

    /* renamed from: f, reason: collision with root package name */
    public int f15856f;

    /* renamed from: g, reason: collision with root package name */
    public int f15857g;

    /* renamed from: h, reason: collision with root package name */
    public int f15858h;

    /* renamed from: i, reason: collision with root package name */
    public int f15859i;

    /* renamed from: j, reason: collision with root package name */
    public int f15860j;

    /* renamed from: k, reason: collision with root package name */
    public long f15861k;

    /* renamed from: l, reason: collision with root package name */
    public int f15862l;

    public void a(long j7) {
        b(j7, 1);
    }

    public final void b(long j7, int i7) {
        this.f15861k += j7;
        this.f15862l += i7;
    }

    public synchronized void c() {
    }

    public String toString() {
        return g0.M.G("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f15851a), Integer.valueOf(this.f15852b), Integer.valueOf(this.f15853c), Integer.valueOf(this.f15854d), Integer.valueOf(this.f15855e), Integer.valueOf(this.f15856f), Integer.valueOf(this.f15857g), Integer.valueOf(this.f15858h), Integer.valueOf(this.f15859i), Integer.valueOf(this.f15860j), Long.valueOf(this.f15861k), Integer.valueOf(this.f15862l));
    }
}
