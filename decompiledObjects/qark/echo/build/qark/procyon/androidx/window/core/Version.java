// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import java.math.BigInteger;
import g6.a;
import V5.i;
import kotlin.jvm.internal.g;
import V5.h;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class Version implements Comparable<Version>
{
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
        Companion = new Companion(null);
        UNKNOWN = new Version(0, 0, 0, "");
        VERSION_0_1 = new Version(0, 1, 0, "");
        CURRENT = (VERSION_1_0 = new Version(1, 0, 0, ""));
    }
    
    private Version(final int major, final int minor, final int patch, final String description) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.description = description;
        this.bigInteger$delegate = i.a((a)new Version$bigInteger.Version$bigInteger$2(this));
    }
    
    public static final /* synthetic */ Version access$getCURRENT$cp() {
        return Version.CURRENT;
    }
    
    public static final /* synthetic */ Version access$getUNKNOWN$cp() {
        return Version.UNKNOWN;
    }
    
    public static final /* synthetic */ Version access$getVERSION_0_1$cp() {
        return Version.VERSION_0_1;
    }
    
    public static final /* synthetic */ Version access$getVERSION_1_0$cp() {
        return Version.VERSION_1_0;
    }
    
    private final BigInteger getBigInteger() {
        final Object value = this.bigInteger$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        return (BigInteger)value;
    }
    
    public static final Version parse(final String s) {
        return Version.Companion.parse(s);
    }
    
    @Override
    public int compareTo(@NotNull final Version version) {
        Intrinsics.checkNotNullParameter(version, "other");
        return this.getBigInteger().compareTo(version.getBigInteger());
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof Version;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final int major = this.major;
        final Version version = (Version)o;
        boolean b3 = b2;
        if (major == version.major) {
            b3 = b2;
            if (this.minor == version.minor) {
                b3 = b2;
                if (this.patch == version.patch) {
                    b3 = true;
                }
            }
        }
        return b3;
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
    
    @Override
    public int hashCode() {
        return ((527 + this.major) * 31 + this.minor) * 31 + this.patch;
    }
    
    @NotNull
    @Override
    public String toString() {
        String i;
        if (kotlin.text.i.F(this.description) ^ true) {
            i = Intrinsics.i("-", this.description);
        }
        else {
            i = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        sb.append(i);
        return sb.toString();
    }
    
    @Metadata
    public static final class Companion
    {
        private Companion() {
        }
        
        @NotNull
        public final Version getCURRENT() {
            return Version.access$getCURRENT$cp();
        }
        
        @NotNull
        public final Version getUNKNOWN() {
            return Version.access$getUNKNOWN$cp();
        }
        
        @NotNull
        public final Version getVERSION_0_1() {
            return Version.access$getVERSION_0_1$cp();
        }
        
        @NotNull
        public final Version getVERSION_1_0() {
            return Version.access$getVERSION_1_0$cp();
        }
        
        public final Version parse(String s) {
            if (s == null) {
                return null;
            }
            if (kotlin.text.i.F(s)) {
                return null;
            }
            final Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(s);
            if (!matcher.matches()) {
                return null;
            }
            s = matcher.group(1);
            Integer value;
            if (s == null) {
                value = null;
            }
            else {
                value = Integer.parseInt(s);
            }
            if (value == null) {
                return null;
            }
            final int intValue = value;
            s = matcher.group(2);
            Integer value2;
            if (s == null) {
                value2 = null;
            }
            else {
                value2 = Integer.parseInt(s);
            }
            if (value2 == null) {
                return null;
            }
            final int intValue2 = value2;
            s = matcher.group(3);
            Integer value3;
            if (s == null) {
                value3 = null;
            }
            else {
                value3 = Integer.parseInt(s);
            }
            if (value3 == null) {
                return null;
            }
            final int intValue3 = value3;
            if (matcher.group(4) != null) {
                s = matcher.group(4);
            }
            else {
                s = "";
            }
            Intrinsics.checkNotNullExpressionValue(s, "description");
            return new Version(intValue, intValue2, intValue3, s, null);
        }
    }
}
