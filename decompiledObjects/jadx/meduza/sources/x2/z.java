package x2;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedHashSet;
import o2.c;
import o2.o;

/* loaded from: classes.dex */
public final class z {
    public static final LinkedHashSet a(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ec.i.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i10 = 0; i10 < readInt; i10++) {
                    Uri parse = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    ec.i.d(parse, "uri");
                    linkedHashSet.add(new c.a(readBoolean, parse));
                }
                rb.h hVar = rb.h.f13851a;
                x6.b.L(objectInputStream, null);
                rb.h hVar2 = rb.h.f13851a;
                x6.b.L(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a0.j.h("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static final int c(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i10 != 5) {
            throw new IllegalArgumentException(a0.j.h("Could not convert ", i10, " to NetworkType"));
        }
        return 6;
    }

    public static final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a0.j.h("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static final o.b e(int i10) {
        if (i10 == 0) {
            return o.b.ENQUEUED;
        }
        if (i10 == 1) {
            return o.b.RUNNING;
        }
        if (i10 == 2) {
            return o.b.SUCCEEDED;
        }
        if (i10 == 3) {
            return o.b.FAILED;
        }
        if (i10 == 4) {
            return o.b.BLOCKED;
        }
        if (i10 == 5) {
            return o.b.CANCELLED;
        }
        throw new IllegalArgumentException(a0.j.h("Could not convert ", i10, " to State"));
    }

    public static final int f(o.b bVar) {
        ec.i.e(bVar, "state");
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 4;
        }
        if (ordinal == 5) {
            return 5;
        }
        throw new n7.w();
    }
}
