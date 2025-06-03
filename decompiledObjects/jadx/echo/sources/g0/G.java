package g0;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G {
    public static String a(Uri uri, Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        String scheme = uri.getScheme();
        String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !W2.c.a(scheme, scheme2)) : scheme2 == null) {
            if (M.c(uri.getAuthority(), uri2.getAuthority())) {
                List<String> pathSegments = uri.getPathSegments();
                List<String> pathSegments2 = uri2.getPathSegments();
                int min = Math.min(pathSegments.size(), pathSegments2.size());
                int i7 = 0;
                for (int i8 = 0; i8 < min && pathSegments.get(i8).equals(pathSegments2.get(i8)); i8++) {
                    i7++;
                }
                StringBuilder sb = new StringBuilder();
                for (int i9 = i7; i9 < pathSegments.size(); i9++) {
                    sb.append("../");
                }
                while (i7 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i7));
                    if (i7 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i7++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    public static int[] b(String str) {
        int i7;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i8 = indexOf4 + 2;
        if (i8 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i8) == '/') {
            i7 = str.indexOf(47, indexOf4 + 3);
            if (i7 == -1 || i7 > indexOf2) {
                i7 = indexOf2;
            }
        } else {
            i7 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i7;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean c(String str) {
        return (str == null || b(str)[0] == -1) ? false : true;
    }

    public static String d(StringBuilder sb, int i7, int i8) {
        int i9;
        int i10;
        if (i7 >= i8) {
            return sb.toString();
        }
        if (sb.charAt(i7) == '/') {
            i7++;
        }
        int i11 = i7;
        int i12 = i11;
        while (i11 <= i8) {
            if (i11 == i8) {
                i9 = i11;
            } else if (sb.charAt(i11) == '/') {
                i9 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && sb.charAt(i12) == '.') {
                sb.delete(i12, i9);
                i8 -= i9 - i12;
            } else {
                if (i11 == i12 + 2 && sb.charAt(i12) == '.' && sb.charAt(i13) == '.') {
                    i10 = sb.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = i10 > i7 ? i10 : i7;
                    sb.delete(i14, i9);
                    i8 -= i9 - i14;
                } else {
                    i10 = i11 + 1;
                }
                i12 = i10;
            }
            i11 = i12;
        }
        return sb.toString();
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] b7 = b(str2);
        if (b7[0] != -1) {
            sb.append(str2);
            d(sb, b7[1], b7[2]);
            return sb.toString();
        }
        int[] b8 = b(str);
        if (b7[3] == 0) {
            sb.append((CharSequence) str, 0, b8[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (b7[2] == 0) {
            sb.append((CharSequence) str, 0, b8[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i7 = b7[1];
        if (i7 != 0) {
            int i8 = b8[0] + 1;
            sb.append((CharSequence) str, 0, i8);
            sb.append(str2);
            return d(sb, b7[1] + i8, i8 + b7[2]);
        }
        if (str2.charAt(i7) == '/') {
            sb.append((CharSequence) str, 0, b8[1]);
            sb.append(str2);
            int i9 = b8[1];
            return d(sb, i9, b7[2] + i9);
        }
        int i10 = b8[0] + 2;
        int i11 = b8[1];
        if (i10 >= i11 || i11 != b8[2]) {
            int lastIndexOf = str.lastIndexOf(47, b8[2] - 1);
            int i12 = lastIndexOf == -1 ? b8[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i12);
            sb.append(str2);
            return d(sb, b8[1], i12 + b7[2]);
        }
        sb.append((CharSequence) str, 0, i11);
        sb.append('/');
        sb.append(str2);
        int i13 = b8[1];
        return d(sb, i13, b7[2] + i13 + 1);
    }

    public static Uri f(String str, String str2) {
        return Uri.parse(e(str, str2));
    }
}
