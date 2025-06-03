/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  androidx.window.core.Version$bigInteger
 *  java.lang.CharSequence
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package androidx.window.core;

import V5.h;
import androidx.window.core.Version;
import g6.a;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class Version
implements Comparable<Version> {
    @NotNull
    private static final Version CURRENT;
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final Version UNKNOWN;
    @NotNull
    private static final Version VERSION_0_1;
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

    static {
        Version version;
        Companion = new Companion(null);
        UNKNOWN = new Version(0, 0, 0, "");
        VERSION_0_1 = new Version(0, 1, 0, "");
        VERSION_1_0 = version = new Version(1, 0, 0, "");
        CURRENT = version;
    }

    private Version(int n8, int n9, int n10, String string2) {
        this.major = n8;
        this.minor = n9;
        this.patch = n10;
        this.description = string2;
        this.bigInteger$delegate = V5.i.a(new a(this){
            final /* synthetic */ Version this$0;
            {
                this.this$0 = version;
                super(0);
            }

            public final BigInteger invoke() {
                return BigInteger.valueOf((long)this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf((long)this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf((long)this.this$0.getPatch()));
            }
        });
    }

    public /* synthetic */ Version(int n8, int n9, int n10, String string2, g g8) {
        this(n8, n9, n10, string2);
    }

    private final BigInteger getBigInteger() {
        Object object = this.bigInteger$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "<get-bigInteger>(...)");
        return (BigInteger)object;
    }

    public static final Version parse(String string2) {
        return Companion.parse(string2);
    }

    public int compareTo(@NotNull Version version) {
        Intrinsics.checkNotNullParameter(version, "other");
        return this.getBigInteger().compareTo(version.getBigInteger());
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof Version;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        int n8 = this.major;
        object = (Version)object;
        bl = bl2;
        if (n8 == object.major) {
            bl = bl2;
            if (this.minor == object.minor) {
                bl = bl2;
                if (this.patch == object.patch) {
                    bl = true;
                }
            }
        }
        return bl;
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
        return ((527 + this.major) * 31 + this.minor) * 31 + this.patch;
    }

    @NotNull
    public String toString() {
        String string2 = i.F(this.description) ^ true ? Intrinsics.i("-", this.description) : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.major);
        stringBuilder.append('.');
        stringBuilder.append(this.minor);
        stringBuilder.append('.');
        stringBuilder.append(this.patch);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        @NotNull
        public final Version getCURRENT() {
            return CURRENT;
        }

        @NotNull
        public final Version getUNKNOWN() {
            return UNKNOWN;
        }

        @NotNull
        public final Version getVERSION_0_1() {
            return VERSION_0_1;
        }

        @NotNull
        public final Version getVERSION_1_0() {
            return VERSION_1_0;
        }

        public final Version parse(String string2) {
            if (string2 != null) {
                if (i.F(string2)) {
                    return null;
                }
                Matcher matcher = Pattern.compile((String)"(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher((CharSequence)string2);
                if (!matcher.matches()) {
                    return null;
                }
                string2 = matcher.group(1);
                string2 = string2 == null ? null : Integer.valueOf((int)Integer.parseInt((String)string2));
                if (string2 == null) {
                    return null;
                }
                int n8 = string2.intValue();
                string2 = matcher.group(2);
                string2 = string2 == null ? null : Integer.valueOf((int)Integer.parseInt((String)string2));
                if (string2 == null) {
                    return null;
                }
                int n9 = string2.intValue();
                string2 = matcher.group(3);
                string2 = string2 == null ? null : Integer.valueOf((int)Integer.parseInt((String)string2));
                if (string2 == null) {
                    return null;
                }
                int n10 = string2.intValue();
                string2 = matcher.group(4) != null ? matcher.group(4) : "";
                Intrinsics.checkNotNullExpressionValue(string2, "description");
                return new Version(n8, n9, n10, string2, null);
            }
            return null;
        }
    }

}

