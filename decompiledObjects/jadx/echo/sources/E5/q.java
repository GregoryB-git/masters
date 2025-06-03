package E5;

import E5.p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t5.AbstractC1995b;

/* loaded from: classes.dex */
public final class q implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final q f1685b = new q(p.f1682a);

    /* renamed from: a, reason: collision with root package name */
    public final p f1686a;

    public q(p pVar) {
        this.f1686a = pVar;
    }

    @Override // E5.l
    public ByteBuffer a(Object obj) {
        p.a aVar = new p.a();
        aVar.write(0);
        this.f1686a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // E5.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f1686a.p(aVar, str);
        this.f1686a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f1686a.p(aVar, AbstractC1995b.d((Throwable) obj));
        } else {
            this.f1686a.p(aVar, obj);
        }
        this.f1686a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // E5.l
    public ByteBuffer c(j jVar) {
        p.a aVar = new p.a();
        this.f1686a.p(aVar, jVar.f1670a);
        this.f1686a.p(aVar, jVar.f1671b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // E5.l
    public ByteBuffer d(String str, String str2, Object obj) {
        p.a aVar = new p.a();
        aVar.write(1);
        this.f1686a.p(aVar, str);
        this.f1686a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f1686a.p(aVar, AbstractC1995b.d((Throwable) obj));
        } else {
            this.f1686a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // E5.l
    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f7 = this.f1686a.f(byteBuffer);
        Object f8 = this.f1686a.f(byteBuffer);
        if (!(f7 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new j((String) f7, f8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // E5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            E5.p r0 = r4.f1686a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            E5.p r0 = r4.f1686a
            java.lang.Object r0 = r0.f(r5)
            E5.p r1 = r4.f1686a
            java.lang.Object r1 = r1.f(r5)
            E5.p r2 = r4.f1686a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            E5.e r5 = new E5.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.q.f(java.nio.ByteBuffer):java.lang.Object");
    }
}
