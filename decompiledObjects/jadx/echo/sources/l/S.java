package l;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import e.AbstractC1230a;
import e.AbstractC1234e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class S extends M.c implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public final SearchableInfo f16365A;

    /* renamed from: B, reason: collision with root package name */
    public final Context f16366B;

    /* renamed from: C, reason: collision with root package name */
    public final WeakHashMap f16367C;

    /* renamed from: D, reason: collision with root package name */
    public final int f16368D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f16369E;

    /* renamed from: F, reason: collision with root package name */
    public int f16370F;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f16371G;

    /* renamed from: H, reason: collision with root package name */
    public int f16372H;

    /* renamed from: I, reason: collision with root package name */
    public int f16373I;

    /* renamed from: J, reason: collision with root package name */
    public int f16374J;

    /* renamed from: K, reason: collision with root package name */
    public int f16375K;

    /* renamed from: L, reason: collision with root package name */
    public int f16376L;

    /* renamed from: M, reason: collision with root package name */
    public int f16377M;

    /* renamed from: z, reason: collision with root package name */
    public final SearchView f16378z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f16379a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f16380b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f16381c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f16382d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f16383e;

        public a(View view) {
            this.f16379a = (TextView) view.findViewById(R.id.text1);
            this.f16380b = (TextView) view.findViewById(R.id.text2);
            this.f16381c = (ImageView) view.findViewById(R.id.icon1);
            this.f16382d = (ImageView) view.findViewById(R.id.icon2);
            this.f16383e = (ImageView) view.findViewById(AbstractC1234e.f13423k);
        }
    }

    public S(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f16369E = false;
        this.f16370F = 1;
        this.f16372H = -1;
        this.f16373I = -1;
        this.f16374J = -1;
        this.f16375K = -1;
        this.f16376L = -1;
        this.f16377M = -1;
        this.f16378z = searchView;
        this.f16365A = searchableInfo;
        this.f16368D = searchView.getSuggestionCommitIconResId();
        this.f16366B = context;
        this.f16367C = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f16367C.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // M.a, M.b.a
    public void a(Cursor cursor) {
        if (this.f16369E) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f16372H = cursor.getColumnIndex("suggest_text_1");
                this.f16373I = cursor.getColumnIndex("suggest_text_2");
                this.f16374J = cursor.getColumnIndex("suggest_text_2_url");
                this.f16375K = cursor.getColumnIndex("suggest_icon_1");
                this.f16376L = cursor.getColumnIndex("suggest_icon_2");
                this.f16377M = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // M.a, M.b.a
    public CharSequence c(Cursor cursor) {
        String o7;
        String o8;
        if (cursor == null) {
            return null;
        }
        String o9 = o(cursor, "suggest_intent_query");
        if (o9 != null) {
            return o9;
        }
        if (this.f16365A.shouldRewriteQueryFromData() && (o8 = o(cursor, "suggest_intent_data")) != null) {
            return o8;
        }
        if (!this.f16365A.shouldRewriteQueryFromText() || (o7 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o7;
    }

    @Override // M.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f16378z.getVisibility() == 0 && this.f16378z.getWindowVisibility() == 0) {
            try {
                Cursor v7 = v(this.f16365A, charSequence2, 50);
                if (v7 != null) {
                    v7.getCount();
                    return v7;
                }
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
        }
        return null;
    }

    @Override // M.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.f16377M;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f16379a != null) {
            z(aVar.f16379a, w(cursor, this.f16372H));
        }
        if (aVar.f16380b != null) {
            String w7 = w(cursor, this.f16374J);
            CharSequence l7 = w7 != null ? l(w7) : w(cursor, this.f16373I);
            if (TextUtils.isEmpty(l7)) {
                TextView textView = aVar.f16379a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f16379a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f16379a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f16379a.setMaxLines(1);
                }
            }
            z(aVar.f16380b, l7);
        }
        ImageView imageView = aVar.f16381c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f16382d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i9 = this.f16370F;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f16383e.setVisibility(8);
            return;
        }
        aVar.f16383e.setVisibility(0);
        aVar.f16383e.setTag(aVar.f16379a.getText());
        aVar.f16383e.setOnClickListener(this);
    }

    @Override // M.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View g7 = g(this.f3467r, this.f3466q, viewGroup);
            if (g7 != null) {
                ((a) g7.getTag()).f16379a.setText(e7.toString());
            }
            return g7;
        }
    }

    @Override // M.a, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View h7 = h(this.f3467r, this.f3466q, viewGroup);
            if (h7 != null) {
                ((a) h7.getTag()).f16379a.setText(e7.toString());
            }
            return h7;
        }
    }

    @Override // M.c, M.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h7 = super.h(context, cursor, viewGroup);
        h7.setTag(new a(h7));
        ((ImageView) h7.findViewById(AbstractC1234e.f13423k)).setImageResource(this.f16368D);
        return h7;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f16367C.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.f16371G == null) {
            TypedValue typedValue = new TypedValue();
            this.f3467r.getTheme().resolveAttribute(AbstractC1230a.f13346q, typedValue, true);
            this.f16371G = this.f3467r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f16371G, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        String obj;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f3467r.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e7) {
            obj = e7.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        obj = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", obj);
        return null;
    }

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f16367C.containsKey(flattenToShortString)) {
            Drawable m7 = m(componentName);
            this.f16367C.put(flattenToShortString, m7 != null ? m7.getConstantState() : null);
            return m7;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f16367C.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f16366B.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f16378z.R((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable n7 = n(this.f16365A.getSearchActivity());
        return n7 != null ? n7 : this.f3467r.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f16366B.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e7) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e7);
                }
            }
        } catch (FileNotFoundException e8) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
        return null;
    }

    public Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f3467r.getPackageManager().getResourcesForApplication(authority);
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

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f16366B.getPackageName() + "/" + parseInt;
            Drawable k7 = k(str2);
            if (k7 != null) {
                return k7;
            }
            Drawable d7 = AbstractC2112a.d(this.f16366B, parseInt);
            A(str2, d7);
            return d7;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k8 = k(str);
            if (k8 != null) {
                return k8;
            }
            Drawable q7 = q(Uri.parse(str));
            A(str, q7);
            return q7;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i7 = this.f16375K;
        if (i7 == -1) {
            return null;
        }
        Drawable s7 = s(cursor.getString(i7));
        return s7 != null ? s7 : p();
    }

    public final Drawable u(Cursor cursor) {
        int i7 = this.f16376L;
        if (i7 == -1) {
            return null;
        }
        return s(cursor.getString(i7));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i7) {
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
        String[] strArr2 = strArr;
        if (i7 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.f3467r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i7) {
        this.f16370F = i7;
    }

    public final void y(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
