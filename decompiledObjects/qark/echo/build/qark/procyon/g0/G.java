// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.text.TextUtils;
import java.util.List;
import W2.c;
import android.net.Uri;

public abstract class G
{
    public static String a(final Uri uri, final Uri uri2) {
        if (!uri.isOpaque() && !uri2.isOpaque()) {
            final String scheme = uri.getScheme();
            final String scheme2 = uri2.getScheme();
            if (scheme == null) {
                if (scheme2 != null) {
                    return uri2.toString();
                }
            }
            else if (scheme2 == null || !c.a(scheme, scheme2)) {
                return uri2.toString();
            }
            if (M.c(uri.getAuthority(), uri2.getAuthority())) {
                final List pathSegments = uri.getPathSegments();
                final List pathSegments2 = uri2.getPathSegments();
                final int min = Math.min(pathSegments.size(), pathSegments2.size());
                int n = 0;
                int n2 = 0;
                while (n < min && pathSegments.get(n).equals(pathSegments2.get(n))) {
                    ++n2;
                    ++n;
                }
                final StringBuilder sb = new StringBuilder();
                int n3 = n2;
                int i;
                while (true) {
                    i = n2;
                    if (n3 >= pathSegments.size()) {
                        break;
                    }
                    sb.append("../");
                    ++n3;
                }
                while (i < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i));
                    if (i < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    ++i;
                }
                return sb.toString();
            }
            return uri2.toString();
        }
        return uri2.toString();
    }
    
    public static int[] b(final String s) {
        final int[] array = new int[4];
        if (TextUtils.isEmpty((CharSequence)s)) {
            array[0] = -1;
            return array;
        }
        int length = s.length();
        final int index = s.indexOf(35);
        if (index != -1) {
            length = index;
        }
        final int index2 = s.indexOf(63);
        int n;
        if (index2 == -1 || (n = index2) > length) {
            n = length;
        }
        final int index3 = s.indexOf(47);
        int n2;
        if (index3 == -1 || (n2 = index3) > n) {
            n2 = n;
        }
        int index4;
        if ((index4 = s.indexOf(58)) > n2) {
            index4 = -1;
        }
        final int index5 = index4 + 2;
        int n3;
        if (index5 < n && s.charAt(index4 + 1) == '/' && s.charAt(index5) == '/') {
            final int index6 = s.indexOf(47, index4 + 3);
            if (index6 == -1 || (n3 = index6) > n) {
                n3 = n;
            }
        }
        else {
            n3 = index4 + 1;
        }
        array[0] = index4;
        array[1] = n3;
        array[2] = n;
        array[3] = length;
        return array;
    }
    
    public static boolean c(final String s) {
        boolean b = false;
        if (s != null) {
            b = b;
            if (b(s)[0] != -1) {
                b = true;
            }
        }
        return b;
    }
    
    public static String d(final StringBuilder sb, int i, int n) {
        if (i >= n) {
            return sb.toString();
        }
        int n2 = i;
        if (sb.charAt(i) == '/') {
            n2 = i + 1;
        }
        int start;
        i = (start = n2);
        while (i <= n) {
            int n3;
            if (i == n) {
                n3 = i;
            }
            else {
                if (sb.charAt(i) != '/') {
                    ++i;
                    continue;
                }
                n3 = i + 1;
            }
            final int n4 = start + 1;
            int n5;
            if (i == n4 && sb.charAt(start) == '.') {
                sb.delete(start, n3);
                n5 = n - (n3 - start);
                n = start;
            }
            else {
                int n7;
                if (i == start + 2 && sb.charAt(start) == '.' && sb.charAt(n4) == '.') {
                    final int n6 = sb.lastIndexOf("/", start - 2) + 1;
                    if (n6 > n2) {
                        i = n6;
                    }
                    else {
                        i = n2;
                    }
                    sb.delete(i, n3);
                    i = n - (n3 - i);
                    n7 = n6;
                }
                else {
                    n7 = i + 1;
                    i = n;
                }
                n = n7;
                n5 = i;
            }
            i = n;
            start = n;
            n = n5;
        }
        return sb.toString();
    }
    
    public static String e(String str, final String s) {
        final StringBuilder sb = new StringBuilder();
        String s2 = str;
        if (str == null) {
            s2 = "";
        }
        if ((str = s) == null) {
            str = "";
        }
        final int[] b = b(str);
        if (b[0] != -1) {
            sb.append(str);
            d(sb, b[1], b[2]);
            return sb.toString();
        }
        final int[] b2 = b(s2);
        if (b[3] == 0) {
            sb.append(s2, 0, b2[3]);
            sb.append(str);
            return sb.toString();
        }
        if (b[2] == 0) {
            sb.append(s2, 0, b2[2]);
            sb.append(str);
            return sb.toString();
        }
        final int index = b[1];
        if (index != 0) {
            final int end = b2[0] + 1;
            sb.append(s2, 0, end);
            sb.append(str);
            return d(sb, b[1] + end, end + b[2]);
        }
        if (str.charAt(index) == '/') {
            sb.append(s2, 0, b2[1]);
            sb.append(str);
            final int n = b2[1];
            return d(sb, n, b[2] + n);
        }
        final int n2 = b2[0];
        final int end2 = b2[1];
        if (n2 + 2 < end2 && end2 == b2[2]) {
            sb.append(s2, 0, end2);
            sb.append('/');
            sb.append(str);
            final int n3 = b2[1];
            return d(sb, n3, b[2] + n3 + 1);
        }
        final int lastIndex = s2.lastIndexOf(47, b2[2] - 1);
        int end3;
        if (lastIndex == -1) {
            end3 = b2[1];
        }
        else {
            end3 = lastIndex + 1;
        }
        sb.append(s2, 0, end3);
        sb.append(str);
        return d(sb, b2[1], end3 + b[2]);
    }
    
    public static Uri f(final String s, final String s2) {
        return Uri.parse(e(s, s2));
    }
}
