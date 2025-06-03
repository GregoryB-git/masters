package g3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: g3.a$a, reason: collision with other inner class name */
    public static class C0093a {

        /* renamed from: a, reason: collision with root package name */
        public ZipFile f5810a;

        /* renamed from: b, reason: collision with root package name */
        public ZipEntry f5811b;

        public C0093a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f5810a = zipFile;
            this.f5811b = zipEntry;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static C0093a b(Context context, String[] strArr, String str, f fVar) {
        String[] d10 = d(context);
        int length = d10.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = d10[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder l10 = defpackage.f.l("lib");
                            l10.append(File.separatorChar);
                            l10.append(str3);
                            l10.append(File.separatorChar);
                            l10.append(str);
                            String sb2 = l10.toString();
                            fVar.getClass();
                            f.d("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new C0093a(zipFile, entry);
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    public static String[] c(Context context, String str) {
        StringBuilder l10 = defpackage.f.l("lib");
        l10.append(File.separatorChar);
        l10.append("([^\\");
        l10.append(File.separatorChar);
        l10.append("]*)");
        l10.append(File.separatorChar);
        l10.append(str);
        Pattern compile = Pattern.compile(l10.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : d(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
