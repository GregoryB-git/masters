package com.google.android.exoplayer2.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import v4.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2725a = Pattern.compile("(&#13;)?&#10;");

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2726a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, String> f2727b;

        public a(String str, Map map) {
            this.f2726a = str;
            this.f2727b = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.b$b, reason: collision with other inner class name */
    public static final class C0040b {

        /* renamed from: e, reason: collision with root package name */
        public static final d f2728e = new d(6);
        public static final b0.d f = new b0.d(6);

        /* renamed from: a, reason: collision with root package name */
        public final int f2729a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2730b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2731c;

        /* renamed from: d, reason: collision with root package name */
        public final String f2732d;

        public C0040b(int i10, int i11, String str, String str2) {
            this.f2729a = i10;
            this.f2730b = i11;
            this.f2731c = str;
            this.f2732d = str2;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f2733a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f2734b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return f2725a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
