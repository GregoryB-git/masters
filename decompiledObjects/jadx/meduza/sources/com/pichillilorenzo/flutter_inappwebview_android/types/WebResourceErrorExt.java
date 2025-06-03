package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceError;
import c2.l;
import d2.c;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.j0;
import defpackage.f;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;

/* loaded from: classes.dex */
public class WebResourceErrorExt {
    private String description;
    private int type;

    public WebResourceErrorExt(int i10, String str) {
        this.type = i10;
        this.description = str;
    }

    public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    public static WebResourceErrorExt fromWebResourceError(l lVar) {
        int i10;
        String str;
        if (b.c0("WEB_RESOURCE_ERROR_GET_CODE")) {
            g0 g0Var = (g0) lVar;
            g0Var.getClass();
            i0.f3377o.getClass();
            if (g0Var.f3360a == null) {
                h0 h0Var = j0.a.f3389a;
                g0Var.f3360a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertWebResourceError(Proxy.getInvocationHandler(g0Var.f3361b));
            }
            i10 = c.f(g0Var.f3360a);
        } else {
            i10 = -1;
        }
        if (b.c0("WEB_RESOURCE_ERROR_GET_DESCRIPTION")) {
            g0 g0Var2 = (g0) lVar;
            g0Var2.getClass();
            i0.f3376n.getClass();
            if (g0Var2.f3360a == null) {
                h0 h0Var2 = j0.a.f3389a;
                g0Var2.f3360a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) h0Var2.f3363b).convertWebResourceError(Proxy.getInvocationHandler(g0Var2.f3361b));
            }
            str = c.e(g0Var2.f3360a).toString();
        } else {
            str = "";
        }
        return new WebResourceErrorExt(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
        if (this.type != webResourceErrorExt.type) {
            return false;
        }
        return this.description.equals(webResourceErrorExt.description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.type * 31);
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType()));
        hashMap.put("description", getDescription());
        return hashMap;
    }

    public String toString() {
        StringBuilder l10 = f.l("WebResourceErrorExt{type=");
        l10.append(this.type);
        l10.append(", description='");
        l10.append(this.description);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
