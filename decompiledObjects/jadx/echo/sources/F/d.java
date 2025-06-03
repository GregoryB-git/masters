package F;

import F.g;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f1697a = new Comparator() { // from class: F.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g7;
            g7 = d.g((byte[]) obj, (byte[]) obj2);
            return g7;
        }
    };

    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : z.e.c(resources, eVar.c());
    }

    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f7 = f(context.getPackageManager(), eVar, context.getResources());
        return f7 == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, f7.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e7 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e7, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e7);
        }
        if (!resolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e7 + ", but package was not " + eVar.f());
        }
        List b7 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b7, f1697a);
        List d7 = d(eVar, resources);
        for (int i7 = 0; i7 < d7.size(); i7++) {
            ArrayList arrayList = new ArrayList((Collection) d7.get(i7));
            Collections.sort(arrayList, f1697a);
            if (c(b7, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    public static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor a7 = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (a7 != null) {
                try {
                    if (a7.getCount() > 0) {
                        int columnIndex = a7.getColumnIndex("result_code");
                        arrayList = new ArrayList();
                        int columnIndex2 = a7.getColumnIndex("_id");
                        int columnIndex3 = a7.getColumnIndex("file_id");
                        int columnIndex4 = a7.getColumnIndex("font_ttc_index");
                        int columnIndex5 = a7.getColumnIndex("font_weight");
                        int columnIndex6 = a7.getColumnIndex("font_italic");
                        while (a7.moveToNext()) {
                            int i7 = columnIndex != -1 ? a7.getInt(columnIndex) : 0;
                            arrayList.add(g.b.a(columnIndex3 == -1 ? ContentUris.withAppendedId(build, a7.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, a7.getLong(columnIndex3)), columnIndex4 != -1 ? a7.getInt(columnIndex4) : 0, columnIndex5 != -1 ? a7.getInt(columnIndex5) : 400, columnIndex6 != -1 && a7.getInt(columnIndex6) == 1, i7));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = a7;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (a7 != null) {
                a7.close();
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
