package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import b0.n;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import w.d;

/* loaded from: classes.dex */
public class l {

    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public l() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i10, a<T> aVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t = null;
        int i12 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int abs = (Math.abs(aVar.a(t10) - i11) * 2) + (aVar.b(t10) == z10 ? 0 : 1);
            if (t == null || i12 > abs) {
                t = t10;
                i12 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, n[] nVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = m.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (m.c(d10, inputStream)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File d10 = m.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (m.b(d10, resources, i10)) {
                return Typeface.createFromFile(d10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public n f(int i10, n[] nVarArr) {
        return (n) e(nVarArr, i10, new k());
    }
}
