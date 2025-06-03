package ma;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import ma.a;
import ma.a.AbstractC0163a;
import ma.a0;
import ma.h;
import ma.k;
import ma.s0;

/* loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0163a<MessageType, BuilderType>> implements s0 {
    public int memoizedHashCode = 0;

    /* renamed from: ma.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0163a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0163a<MessageType, BuilderType>> implements s0.a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(List list, a0.d dVar) {
        Charset charset = a0.f10909a;
        list.getClass();
        if (list instanceof h0) {
            List<?> d10 = ((h0) list).d();
            h0 h0Var = (h0) dVar;
            int size = dVar.size();
            for (Object obj : d10) {
                if (obj == null) {
                    StringBuilder l10 = defpackage.f.l("Element at index ");
                    l10.append(h0Var.size() - size);
                    l10.append(" is null.");
                    String sb2 = l10.toString();
                    int size2 = h0Var.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(sb2);
                        }
                        h0Var.remove(size2);
                    }
                } else if (obj instanceof h) {
                    h0Var.v((h) obj);
                } else {
                    h0Var.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof c1) {
            dVar.addAll(list);
            return;
        }
        if (dVar instanceof ArrayList) {
            ((ArrayList) dVar).ensureCapacity(list.size() + dVar.size());
        }
        int size3 = dVar.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                StringBuilder l11 = defpackage.f.l("Element at index ");
                l11.append(dVar.size() - size3);
                l11.append(" is null.");
                String sb3 = l11.toString();
                int size4 = dVar.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        throw new NullPointerException(sb3);
                    }
                    dVar.remove(size4);
                }
            } else {
                dVar.add(obj2);
            }
        }
    }

    private String n(String str) {
        StringBuilder l10 = defpackage.f.l("Serializing ");
        l10.append(getClass().getName());
        l10.append(" to a ");
        l10.append(str);
        l10.append(" threw an IOException (should never happen).");
        return l10.toString();
    }

    @Override // ma.s0
    public final h.C0164h c() {
        try {
            int m10 = ((w) this).m(null);
            h.C0164h c0164h = h.f10961b;
            byte[] bArr = new byte[m10];
            Logger logger = k.f11018c;
            k.b bVar = new k.b(bArr, 0, m10);
            ((w) this).i(bVar);
            if (bVar.p0() == 0) {
                return new h.C0164h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(n("ByteString"), e10);
        }
    }

    @Override // ma.s0
    public final void g(OutputStream outputStream) {
        w wVar = (w) this;
        int m10 = wVar.m(null);
        Logger logger = k.f11018c;
        if (m10 > 4096) {
            m10 = 4096;
        }
        k.d dVar = new k.d(outputStream, m10);
        wVar.i(dVar);
        if (dVar.f11022g > 0) {
            dVar.u0();
        }
    }

    @Override // ma.s0
    public final byte[] j() {
        try {
            int m10 = ((w) this).m(null);
            byte[] bArr = new byte[m10];
            Logger logger = k.f11018c;
            k.b bVar = new k.b(bArr, 0, m10);
            ((w) this).i(bVar);
            if (bVar.p0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(n("byte array"), e10);
        }
    }

    int l() {
        throw new UnsupportedOperationException();
    }

    public int m(i1 i1Var) {
        int l10 = l();
        if (l10 != -1) {
            return l10;
        }
        int e10 = i1Var.e(this);
        o(e10);
        return e10;
    }

    void o(int i10) {
        throw new UnsupportedOperationException();
    }
}
