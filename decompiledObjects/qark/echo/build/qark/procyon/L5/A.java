// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import java.util.Iterator;
import java.util.Objects;
import java.util.Map;
import Q3.e;
import Q3.p;
import java.util.List;

public class A
{
    public final List a;
    public p b;
    
    public A(final e b, final List a) {
        this.b = b;
        this.a = a;
    }
    
    public p a() {
        if (this.a.isEmpty()) {
            return this.b;
        }
        for (final Map<K, Object> map : this.a) {
            final Object value = map.get("type");
            Objects.requireNonNull(value);
            final String s = (String)value;
            final int hashCode = s.hashCode();
            int n = -1;
            switch (hashCode) {
                case 102976443: {
                    if (!s.equals("limit")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1207110587: {
                    if (!s.equals("orderBy")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1349119146: {
                    if (!s.equals("cursor")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    continue;
                }
                case 2: {
                    this.e(map);
                    continue;
                }
                case 1: {
                    this.f(map);
                    continue;
                }
                case 0: {
                    this.b(map);
                    continue;
                }
            }
        }
        return this.b;
    }
    
    public final void b(final Map map) {
        final String value = map.get("name");
        Objects.requireNonNull(value);
        final String s = value;
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1108304954: {
                if (!s.equals("endBefore")) {
                    break;
                }
                n = 3;
                break;
            }
            case 96650862: {
                if (!s.equals("endAt")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1601257830: {
                if (!s.equals("startAfter")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1897186251: {
                if (!s.equals("startAt")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {}
            case 3: {
                this.d(map);
            }
            case 2: {
                this.c(map);
            }
            case 1: {
                this.g(map);
            }
            case 0: {
                this.h(map);
            }
        }
    }
    
    public final void c(final Map map) {
        final Boolean value = map.get("value");
        final String s = (String)map.get("key");
        p b;
        if (value instanceof Boolean) {
            if (s == null) {
                b = this.b.i(value);
            }
            else {
                b = this.b.j(value, s);
            }
        }
        else if (value instanceof Number) {
            if (s == null) {
                b = this.b.d(((Number)value).doubleValue());
            }
            else {
                b = this.b.e(((Number)value).doubleValue(), s);
            }
        }
        else if (s == null) {
            b = this.b.g((String)value);
        }
        else {
            b = this.b.h((String)value, s);
        }
        this.b = b;
    }
    
    public final void d(final Map map) {
        final Boolean value = map.get("value");
        final String s = (String)map.get("key");
        p b;
        if (value instanceof Boolean) {
            if (s == null) {
                b = this.b.p(value);
            }
            else {
                b = this.b.q(value, s);
            }
        }
        else if (value instanceof Number) {
            if (s == null) {
                b = this.b.k(((Number)value).doubleValue());
            }
            else {
                b = this.b.l(((Number)value).doubleValue(), s);
            }
        }
        else if (s == null) {
            b = this.b.n((String)value);
        }
        else {
            b = this.b.o((String)value, s);
        }
        this.b = b;
    }
    
    public final void e(final Map map) {
        final String value = map.get("name");
        Objects.requireNonNull(value);
        final String s = value;
        final String value2 = map.get("limit");
        Objects.requireNonNull(value2);
        final int intValue = (int)value2;
        p b;
        if ("limitToFirst".equals(s)) {
            b = this.b.w(intValue);
        }
        else {
            if (!"limitToLast".equals(s)) {
                return;
            }
            b = this.b.x(intValue);
        }
        this.b = b;
    }
    
    public final void f(final Map map) {
        final String value = map.get("name");
        Objects.requireNonNull(value);
        final String s = value;
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1217630252: {
                if (!s.equals("orderByValue")) {
                    break;
                }
                n = 3;
                break;
            }
            case 1200288727: {
                if (!s.equals("orderByChild")) {
                    break;
                }
                n = 2;
                break;
            }
            case 729747418: {
                if (!s.equals("orderByKey")) {
                    break;
                }
                n = 1;
                break;
            }
            case -626148087: {
                if (!s.equals("orderByPriority")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        p b = null;
        switch (n) {
            default: {
                return;
            }
            case 3: {
                b = this.b.B();
                break;
            }
            case 2: {
                final String value2 = map.get("path");
                Objects.requireNonNull(value2);
                b = this.b.y(value2);
                break;
            }
            case 1: {
                b = this.b.z();
                break;
            }
            case 0: {
                b = this.b.A();
                break;
            }
        }
        this.b = b;
    }
    
    public final void g(final Map map) {
        final Boolean value = map.get("value");
        final String s = (String)map.get("key");
        p b;
        if (value instanceof Boolean) {
            if (s == null) {
                b = this.b.K(value);
            }
            else {
                b = this.b.L(value, s);
            }
        }
        else if (value instanceof Number) {
            if (s == null) {
                b = this.b.F(((Number)value).doubleValue());
            }
            else {
                b = this.b.G(((Number)value).doubleValue(), s);
            }
        }
        else if (s == null) {
            b = this.b.I((String)value);
        }
        else {
            b = this.b.J((String)value, s);
        }
        this.b = b;
    }
    
    public final void h(final Map map) {
        final Boolean value = map.get("value");
        final String s = (String)map.get("key");
        p b;
        if (value instanceof Boolean) {
            if (s == null) {
                b = this.b.R(value);
            }
            else {
                b = this.b.S(value, s);
            }
        }
        else if (value instanceof Number) {
            if (s == null) {
                b = this.b.M(((Number)value).doubleValue());
            }
            else {
                b = this.b.N(((Number)value).doubleValue(), s);
            }
        }
        else if (s == null) {
            b = this.b.P((String)value);
        }
        else {
            b = this.b.Q((String)value, s);
        }
        this.b = b;
    }
}
