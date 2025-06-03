package okhttp3;

import defpackage.f;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class MediaType {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f12260c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12261d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f12262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12263b;

    public MediaType(String str, String str2) {
        this.f12262a = str;
        this.f12263b = str2;
    }

    public static MediaType a(String str) {
        Matcher matcher = f12260c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        group.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        String str2 = null;
        Matcher matcher2 = f12261d.matcher(str);
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder l10 = f.l("Parameter is not formatted correctly: \"");
                l10.append(str.substring(end));
                l10.append("\" for: \"");
                l10.append(str);
                l10.append('\"');
                throw new IllegalArgumentException(l10.toString());
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase("charset")) {
                String group3 = matcher2.group(2);
                if (group3 == null) {
                    group3 = matcher2.group(3);
                } else if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                    group3 = group3.substring(1, group3.length() - 1);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group3 + "\" for: \"" + str + '\"');
                }
                str2 = group3;
            }
        }
        return new MediaType(str, str2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).f12262a.equals(this.f12262a);
    }

    public final int hashCode() {
        return this.f12262a.hashCode();
    }

    public final String toString() {
        return this.f12262a;
    }
}
