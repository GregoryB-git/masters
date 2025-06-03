/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package Q4;

import P4.m;
import P4.t;
import Q4.l;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q
implements t {
    public final String a;
    public final int b;

    public q(String string2, int n8) {
        this.a = string2;
        this.b = n8;
    }

    @Override
    public double a() {
        if (this.b == 0) {
            return 0.0;
        }
        String string2 = this.g();
        try {
            double d8 = Double.valueOf((String)string2);
            return d8;
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(String.format((String)"[Value: %s] cannot be converted to a %s.", (Object[])new Object[]{string2, "double"}), (Throwable)numberFormatException);
        }
    }

    @Override
    public String b() {
        if (this.b == 0) {
            return "";
        }
        this.h();
        return this.a;
    }

    @Override
    public long c() {
        if (this.b == 0) {
            return 0L;
        }
        String string2 = this.g();
        try {
            long l8 = Long.valueOf((String)string2);
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(String.format((String)"[Value: %s] cannot be converted to a %s.", (Object[])new Object[]{string2, "long"}), (Throwable)numberFormatException);
        }
    }

    @Override
    public boolean d() {
        if (this.b == 0) {
            return false;
        }
        String string2 = this.g();
        if (l.f.matcher((CharSequence)string2).matches()) {
            return true;
        }
        if (l.g.matcher((CharSequence)string2).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format((String)"[Value: %s] cannot be converted to a %s.", (Object[])new Object[]{string2, "boolean"}));
    }

    @Override
    public byte[] e() {
        if (this.b == 0) {
            return m.m;
        }
        return this.a.getBytes(l.e);
    }

    @Override
    public int f() {
        return this.b;
    }

    public final String g() {
        return this.b().trim();
    }

    public final void h() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}

