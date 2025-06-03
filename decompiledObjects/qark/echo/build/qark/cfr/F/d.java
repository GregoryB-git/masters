/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.Signature
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.CancellationSignal
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package F;

import F.c;
import F.e;
import F.g;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
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

public abstract class d {
    public static final Comparator a = new c();

    public static /* synthetic */ int a(byte[] arrby, byte[] arrby2) {
        return d.g(arrby, arrby2);
    }

    public static List b(Signature[] arrsignature) {
        ArrayList arrayList = new ArrayList();
        int n8 = arrsignature.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)arrsignature[i8].toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i8 = 0; i8 < list.size(); ++i8) {
            if (Arrays.equals((byte[])((byte[])list.get(i8)), (byte[])((byte[])list2.get(i8)))) continue;
            return false;
        }
        return true;
    }

    public static List d(e e8, Resources resources) {
        if (e8.b() != null) {
            return e8.b();
        }
        return z.e.c(resources, e8.c());
    }

    public static g.a e(Context context, e e8, CancellationSignal cancellationSignal) {
        ProviderInfo providerInfo = d.f(context.getPackageManager(), e8, context.getResources());
        if (providerInfo == null) {
            return g.a.a(1, null);
        }
        return g.a.a(0, d.h(context, e8, providerInfo.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e e8, Resources resources) {
        String string2 = e8.e();
        ProviderInfo providerInfo = packageManager.resolveContentProvider(string2, 0);
        if (providerInfo != null) {
            if (providerInfo.packageName.equals((Object)e8.f())) {
                packageManager = d.b(packageManager.getPackageInfo((String)providerInfo.packageName, (int)64).signatures);
                Collections.sort((List)packageManager, (Comparator)a);
                e8 = d.d(e8, resources);
                for (int i8 = 0; i8 < e8.size(); ++i8) {
                    resources = new ArrayList((Collection)e8.get(i8));
                    Collections.sort((List)resources, (Comparator)a);
                    if (!d.c((List)packageManager, (List)resources)) continue;
                    return providerInfo;
                }
                return null;
            }
            packageManager = new StringBuilder();
            packageManager.append("Found content provider ");
            packageManager.append(string2);
            packageManager.append(", but package was not ");
            packageManager.append(e8.f());
            throw new PackageManager.NameNotFoundException(packageManager.toString());
        }
        packageManager = new StringBuilder();
        packageManager.append("No package found for authority: ");
        packageManager.append(string2);
        throw new PackageManager.NameNotFoundException(packageManager.toString());
    }

    public static /* synthetic */ int g(byte[] arrby, byte[] arrby2) {
        if (arrby.length != arrby2.length) {
            return arrby.length - arrby2.length;
        }
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            byte by = arrby[i8];
            byte by2 = arrby2[i8];
            if (by == by2) continue;
            return by - by2;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static g.b[] h(Context var0, e var1_4, String var2_5, CancellationSignal var3_6) {
        block5 : {
            var14_7 = new ArrayList();
            var15_8 = new Uri.Builder().scheme("content").authority(var2_5).build();
            var16_9 = new Uri.Builder().scheme("content").authority(var2_5).appendPath("file").build();
            var2_5 = null;
            var0 = var0.getContentResolver();
            var1_4 = var1_4.g();
            var1_4 = a.a((ContentResolver)var0, var15_8, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{var1_4}, null, (Object)var3_6);
            var0 = var14_7;
            if (var1_4 == null) break block5;
            var0 = var14_7;
            if (var1_4.getCount() <= 0) break block5;
            var7_10 = var1_4.getColumnIndex("result_code");
            var2_5 = new ArrayList();
            var8_11 = var1_4.getColumnIndex("_id");
            var9_12 = var1_4.getColumnIndex("file_id");
            var10_13 = var1_4.getColumnIndex("font_ttc_index");
            var11_14 = var1_4.getColumnIndex("font_weight");
            var12_15 = var1_4.getColumnIndex("font_italic");
            do {
                var0 = var2_5;
                if (!var1_4.moveToNext()) ** break;
                var4_16 = var7_10 != -1 ? var1_4.getInt(var7_10) : 0;
                var5_17 = var10_13 != -1 ? var1_4.getInt(var10_13) : 0;
                var0 = var9_12 == -1 ? ContentUris.withAppendedId((Uri)var15_8, (long)var1_4.getLong(var8_11)) : ContentUris.withAppendedId((Uri)var16_9, (long)var1_4.getLong(var9_12));
                var6_18 = var11_14 != -1 ? var1_4.getInt(var11_14) : 400;
                var13_19 = var12_15 != -1 && var1_4.getInt(var12_15) == 1;
                var2_5.add((Object)g.b.a((Uri)var0, var5_17, var6_18, var13_19, var4_16));
            } while (true);
            {
                catch (Throwable var0_3) {}
            }
        }
        if (var1_4 == null) return (g.b[])var0.toArray((Object[])new g.b[0]);
        var1_4.close();
        return (g.b[])var0.toArray((Object[])new g.b[0]);
        catch (Throwable var0_1) {
            var1_4 = var2_5;
            if (var1_4 == null) throw var0_2;
            var1_4.close();
            throw var0_2;
        }
    }

    public static abstract class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] arrstring, String string2, String[] arrstring2, String string3, Object object) {
            return contentResolver.query(uri, arrstring, string2, arrstring2, string3, (CancellationSignal)object);
        }
    }

}

