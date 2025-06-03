package gb;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w extends gb.b {

    /* renamed from: e, reason: collision with root package name */
    public static final a f6859e = new a();
    public static final b f = new b();

    /* renamed from: o, reason: collision with root package name */
    public static final c f6860o = new c();

    /* renamed from: p, reason: collision with root package name */
    public static final d f6861p = new d();

    /* renamed from: q, reason: collision with root package name */
    public static final e f6862q = new e();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f6863a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f6864b;

    /* renamed from: c, reason: collision with root package name */
    public int f6865c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6866d;

    public class a implements f<Void> {
        @Override // gb.w.g
        public final int a(u2 u2Var, int i10, Object obj, int i11) {
            return u2Var.readUnsignedByte();
        }
    }

    public class b implements f<Void> {
        @Override // gb.w.g
        public final int a(u2 u2Var, int i10, Object obj, int i11) {
            u2Var.skipBytes(i10);
            return 0;
        }
    }

    public class c implements f<byte[]> {
        @Override // gb.w.g
        public final int a(u2 u2Var, int i10, Object obj, int i11) {
            u2Var.U((byte[]) obj, i11, i10);
            return i11 + i10;
        }
    }

    public class d implements f<ByteBuffer> {
        @Override // gb.w.g
        public final int a(u2 u2Var, int i10, Object obj, int i11) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i10);
            u2Var.v0(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    public class e implements g<OutputStream> {
        @Override // gb.w.g
        public final int a(u2 u2Var, int i10, OutputStream outputStream, int i11) {
            u2Var.m0(outputStream, i10);
            return 0;
        }
    }

    public interface f<T> extends g<T> {
    }

    public interface g<T> {
        int a(u2 u2Var, int i10, T t, int i11);
    }

    public w() {
        new ArrayDeque(2);
        this.f6863a = new ArrayDeque();
    }

    public w(int i10) {
        new ArrayDeque(2);
        this.f6863a = new ArrayDeque(i10);
    }

    public final void C() {
        if (!this.f6866d) {
            ((u2) this.f6863a.remove()).close();
            return;
        }
        this.f6864b.add((u2) this.f6863a.remove());
        u2 u2Var = (u2) this.f6863a.peek();
        if (u2Var != null) {
            u2Var.Z();
        }
    }

    public final void H() {
        if (((u2) this.f6863a.peek()).b() == 0) {
            C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0018 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> int I(gb.w.g<T> r4, int r5, T r6, int r7) {
        /*
            r3 = this;
            r3.f(r5)
            java.util.ArrayDeque r0 = r3.f6863a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            r0 = r3
            goto L32
        Ld:
            r0 = r3
        Le:
            if (r5 <= 0) goto L36
            java.util.ArrayDeque r1 = r0.f6863a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L36
            java.util.ArrayDeque r1 = r0.f6863a
            java.lang.Object r1 = r1.peek()
            gb.u2 r1 = (gb.u2) r1
            int r2 = r1.b()
            int r2 = java.lang.Math.min(r5, r2)
            int r7 = r4.a(r1, r2, r6, r7)
            int r5 = r5 - r2
            int r1 = r0.f6865c
            int r1 = r1 - r2
            r0.f6865c = r1
        L32:
            r0.H()
            goto Le
        L36:
            if (r5 > 0) goto L39
            return r7
        L39:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Failed executing read operation"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.w.I(gb.w$g, int, java.lang.Object, int):int");
    }

    public final <T> int M(f<T> fVar, int i10, T t, int i11) {
        try {
            return I(fVar, i10, t, i11);
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // gb.u2
    public final void U(byte[] bArr, int i10, int i11) {
        M(f6860o, i11, bArr, i10);
    }

    @Override // gb.b, gb.u2
    public final void Z() {
        if (this.f6864b == null) {
            this.f6864b = new ArrayDeque(Math.min(this.f6863a.size(), 16));
        }
        while (!this.f6864b.isEmpty()) {
            ((u2) this.f6864b.remove()).close();
        }
        this.f6866d = true;
        u2 u2Var = (u2) this.f6863a.peek();
        if (u2Var != null) {
            u2Var.Z();
        }
    }

    @Override // gb.u2
    public final int b() {
        return this.f6865c;
    }

    @Override // gb.b, gb.u2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.f6863a.isEmpty()) {
            ((u2) this.f6863a.remove()).close();
        }
        if (this.f6864b != null) {
            while (!this.f6864b.isEmpty()) {
                ((u2) this.f6864b.remove()).close();
            }
        }
    }

    public final void g(u2 u2Var) {
        boolean z10 = this.f6866d && this.f6863a.isEmpty();
        if (u2Var instanceof w) {
            w wVar = (w) u2Var;
            while (!wVar.f6863a.isEmpty()) {
                this.f6863a.add((u2) wVar.f6863a.remove());
            }
            this.f6865c += wVar.f6865c;
            wVar.f6865c = 0;
            wVar.close();
        } else {
            this.f6863a.add(u2Var);
            this.f6865c = u2Var.b() + this.f6865c;
        }
        if (z10) {
            ((u2) this.f6863a.peek()).Z();
        }
    }

    @Override // gb.u2
    public final void m0(OutputStream outputStream, int i10) {
        I(f6862q, i10, outputStream, 0);
    }

    @Override // gb.b, gb.u2
    public final boolean markSupported() {
        Iterator it = this.f6863a.iterator();
        while (it.hasNext()) {
            if (!((u2) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // gb.u2
    public final u2 r(int i10) {
        u2 u2Var;
        int i11;
        u2 u2Var2;
        if (i10 <= 0) {
            return v2.f6853a;
        }
        f(i10);
        this.f6865c -= i10;
        u2 u2Var3 = null;
        w wVar = null;
        while (true) {
            u2 u2Var4 = (u2) this.f6863a.peek();
            int b10 = u2Var4.b();
            if (b10 > i10) {
                u2Var2 = u2Var4.r(i10);
                i11 = 0;
            } else {
                if (this.f6866d) {
                    u2Var = u2Var4.r(b10);
                    C();
                } else {
                    u2Var = (u2) this.f6863a.poll();
                }
                u2 u2Var5 = u2Var;
                i11 = i10 - b10;
                u2Var2 = u2Var5;
            }
            if (u2Var3 == null) {
                u2Var3 = u2Var2;
            } else {
                if (wVar == null) {
                    wVar = new w(i11 != 0 ? Math.min(this.f6863a.size() + 2, 16) : 2);
                    wVar.g(u2Var3);
                    u2Var3 = wVar;
                }
                wVar.g(u2Var2);
            }
            if (i11 <= 0) {
                return u2Var3;
            }
            i10 = i11;
        }
    }

    @Override // gb.u2
    public final int readUnsignedByte() {
        return M(f6859e, 1, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002b -> B:6:0x003a). Please report as a decompilation issue!!! */
    @Override // gb.b, gb.u2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void reset() {
        /*
            r3 = this;
            boolean r0 = r3.f6866d
            if (r0 == 0) goto L3e
            java.util.ArrayDeque r0 = r3.f6863a
            java.lang.Object r0 = r0.peek()
            gb.u2 r0 = (gb.u2) r0
            if (r0 == 0) goto L20
            int r1 = r0.b()
            r0.reset()
            int r2 = r3.f6865c
            int r0 = r0.b()
            int r0 = r0 - r1
            int r0 = r0 + r2
            r1 = r0
            r0 = r3
            goto L3a
        L20:
            r0 = r3
        L21:
            java.util.ArrayDeque r1 = r0.f6864b
            java.lang.Object r1 = r1.pollLast()
            gb.u2 r1 = (gb.u2) r1
            if (r1 == 0) goto L3d
            r1.reset()
            java.util.ArrayDeque r2 = r0.f6863a
            r2.addFirst(r1)
            int r2 = r0.f6865c
            int r1 = r1.b()
            int r1 = r1 + r2
        L3a:
            r0.f6865c = r1
            goto L21
        L3d:
            return
        L3e:
            java.nio.InvalidMarkException r0 = new java.nio.InvalidMarkException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.w.reset():void");
    }

    @Override // gb.u2
    public final void skipBytes(int i10) {
        M(f, i10, null, 0);
    }

    @Override // gb.u2
    public final void v0(ByteBuffer byteBuffer) {
        M(f6861p, byteBuffer.remaining(), byteBuffer, 0);
    }
}
