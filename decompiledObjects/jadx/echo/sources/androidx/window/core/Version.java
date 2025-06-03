package androidx.window.core;

import V5.h;
import V5.j;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public final class Version implements Comparable<Version> {

    @NotNull
    private static final Version CURRENT;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Version UNKNOWN = new Version(0, 0, 0, "");

    @NotNull
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");

    @NotNull
    private static final Version VERSION_1_0;

    @NotNull
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";

    @NotNull
    private final h bigInteger$delegate;

    @NotNull
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        @NotNull
        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        @NotNull
        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        @NotNull
        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        @NotNull
        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            boolean F6;
            if (str != null) {
                F6 = s.F(str);
                if (!F6) {
                    Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
                    if (!matcher.matches()) {
                        return null;
                    }
                    String group = matcher.group(1);
                    Integer valueOf = group == null ? null : Integer.valueOf(Integer.parseInt(group));
                    if (valueOf == null) {
                        return null;
                    }
                    int intValue = valueOf.intValue();
                    String group2 = matcher.group(2);
                    Integer valueOf2 = group2 == null ? null : Integer.valueOf(Integer.parseInt(group2));
                    if (valueOf2 == null) {
                        return null;
                    }
                    int intValue2 = valueOf2.intValue();
                    String group3 = matcher.group(3);
                    Integer valueOf3 = group3 == null ? null : Integer.valueOf(Integer.parseInt(group3));
                    if (valueOf3 == null) {
                        return null;
                    }
                    int intValue3 = valueOf3.intValue();
                    String description = matcher.group(4) != null ? matcher.group(4) : "";
                    Intrinsics.checkNotNullExpressionValue(description, "description");
                    return new Version(intValue, intValue2, intValue3, description, null);
                }
            }
            return null;
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    private Version(int i7, int i8, int i9, String str) {
        h a7;
        this.major = i7;
        this.minor = i8;
        this.patch = i9;
        this.description = str;
        a7 = j.a(new Version$bigInteger$2(this));
        this.bigInteger$delegate = a7;
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @NotNull
    public String toString() {
        boolean F6;
        F6 = s.F(this.description);
        return this.major + '.' + this.minor + '.' + this.patch + (F6 ^ true ? Intrinsics.i("-", this.description) : "");
    }

    public /* synthetic */ Version(int i7, int i8, int i9, String str, g gVar) {
        this(i7, i8, i9, str);
    }
}
