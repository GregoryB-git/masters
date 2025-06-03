package l;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t0 extends m0.c implements View.OnClickListener {
    public static final /* synthetic */ int F = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;

    /* renamed from: s, reason: collision with root package name */
    public final SearchView f9466s;
    public final SearchableInfo t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9467u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f9468v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9469w;

    /* renamed from: x, reason: collision with root package name */
    public int f9470x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f9471y;

    /* renamed from: z, reason: collision with root package name */
    public int f9472z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f9473a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f9474b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f9475c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f9476d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f9477e;

        public a(View view) {
            this.f9473a = (TextView) view.findViewById(R.id.text1);
            this.f9474b = (TextView) view.findViewById(R.id.text2);
            this.f9475c = (ImageView) view.findViewById(R.id.icon1);
            this.f9476d = (ImageView) view.findViewById(R.id.icon2);
            this.f9477e = (ImageView) view.findViewById(io.meduza.meduza.R.id.edit_query);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f9470x = 1;
        this.f9472z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.f9466s = searchView;
        this.t = searchableInfo;
        this.f9469w = searchView.getSuggestionCommitIconResId();
        this.f9467u = context;
        this.f9468v = weakHashMap;
    }

    public static String i(int i10, Cursor cursor) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    @Override // m0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r18, android.database.Cursor r19) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.t0.b(android.view.View, android.database.Cursor):void");
    }

    @Override // m0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f9472z = cursor.getColumnIndex("suggest_text_1");
                this.A = cursor.getColumnIndex("suggest_text_2");
                this.B = cursor.getColumnIndex("suggest_text_2_url");
                this.C = cursor.getColumnIndex("suggest_icon_1");
                this.D = cursor.getColumnIndex("suggest_icon_2");
                this.E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // m0.a
    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor.getColumnIndex("suggest_intent_query"), cursor);
        if (i12 != null) {
            return i12;
        }
        if (this.t.shouldRewriteQueryFromData() && (i11 = i(cursor.getColumnIndex("suggest_intent_data"), cursor)) != null) {
            return i11;
        }
        if (!this.t.shouldRewriteQueryFromText() || (i10 = i(cursor.getColumnIndex("suggest_text_1"), cursor)) == null) {
            return null;
        }
        return i10;
    }

    @Override // m0.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f9869r.inflate(this.f9867p, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(io.meduza.meduza.R.id.edit_query)).setImageResource(this.f9469w);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f9467u.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.t0.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // m0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f9869r.inflate(this.f9868q, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f9473a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // m0.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f9473a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f9467u.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f9860c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f9860c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9466s.o((CharSequence) tag);
        }
    }
}
