/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.io.FileNotFoundException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.WeakHashMap
 */
package l;

import M.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import e.e;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public class S
extends c
implements View.OnClickListener {
    public final SearchableInfo A;
    public final Context B;
    public final WeakHashMap C;
    public final int D;
    public boolean E = false;
    public int F = 1;
    public ColorStateList G;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public final SearchView z;

    public S(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.z = searchView;
        this.A = searchableInfo;
        this.D = searchView.getSuggestionCommitIconResId();
        this.B = context;
        this.C = weakHashMap;
    }

    public static String o(Cursor cursor, String string2) {
        return S.w(cursor, cursor.getColumnIndex(string2));
    }

    public static String w(Cursor object, int n8) {
        if (n8 == -1) {
            return null;
        }
        try {
            object = object.getString(n8);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"SuggestionsAdapter", (String)"unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)exception);
            return null;
        }
    }

    public final void A(String string2, Drawable drawable2) {
        if (drawable2 != null) {
            this.C.put((Object)string2, (Object)drawable2.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        cursor = cursor != null ? cursor.getExtras() : null;
        if (cursor != null) {
            cursor.getBoolean("in_progress");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(Cursor cursor) {
        if (this.E) {
            Log.w((String)"SuggestionsAdapter", (String)"Tried to change cursor after adapter was closed.");
            if (cursor == null) return;
            cursor.close();
            return;
        }
        M.a.super.a(cursor);
        if (cursor == null) return;
        try {
            this.H = cursor.getColumnIndex("suggest_text_1");
            this.I = cursor.getColumnIndex("suggest_text_2");
            this.J = cursor.getColumnIndex("suggest_text_2_url");
            this.K = cursor.getColumnIndex("suggest_icon_1");
            this.L = cursor.getColumnIndex("suggest_icon_2");
            this.M = cursor.getColumnIndex("suggest_flags");
            return;
        }
        catch (Exception exception) {
            Log.e((String)"SuggestionsAdapter", (String)"error changing cursor and caching columns", (Throwable)exception);
        }
    }

    @Override
    public CharSequence c(Cursor object) {
        if (object == null) {
            return null;
        }
        String string2 = S.o((Cursor)object, "suggest_intent_query");
        if (string2 != null) {
            return string2;
        }
        if (this.A.shouldRewriteQueryFromData() && (string2 = S.o((Cursor)object, "suggest_intent_data")) != null) {
            return string2;
        }
        if (this.A.shouldRewriteQueryFromText() && (object = S.o((Cursor)object, "suggest_text_1")) != null) {
            return object;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Cursor d(CharSequence charSequence) {
        charSequence = charSequence == null ? "" : charSequence.toString();
        if (this.z.getVisibility() != 0) return null;
        if (this.z.getWindowVisibility() != 0) {
            return null;
        }
        charSequence = this.v(this.A, (String)charSequence, 50);
        if (charSequence == null) return null;
        try {
            charSequence.getCount();
            return charSequence;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions query threw an exception.", (Throwable)runtimeException);
        }
        return null;
    }

    @Override
    public void e(View object, Context object2, Cursor cursor) {
        int n8;
        object2 = (a)object.getTag();
        int n9 = this.M;
        n9 = n9 != -1 ? cursor.getInt(n9) : 0;
        if (object2.a != null) {
            object = S.w(cursor, this.H);
            this.z(object2.a, (CharSequence)object);
        }
        if (object2.b != null) {
            object = S.w(cursor, this.J);
            object = object != null ? this.l((CharSequence)object) : S.w(cursor, this.I);
            if (TextUtils.isEmpty((CharSequence)object)) {
                TextView textView = object2.a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    object2.a.setMaxLines(2);
                }
            } else {
                TextView textView = object2.a;
                if (textView != null) {
                    textView.setSingleLine(true);
                    object2.a.setMaxLines(1);
                }
            }
            this.z(object2.b, (CharSequence)object);
        }
        if ((object = object2.c) != null) {
            this.y((ImageView)object, this.t(cursor), 4);
        }
        if ((object = object2.d) != null) {
            this.y((ImageView)object, this.u(cursor), 8);
        }
        if ((n8 = this.F) != 2 && (n8 != 1 || (n9 & 1) == 0)) {
            object2.e.setVisibility(8);
            return;
        }
        object2.e.setVisibility(0);
        object2.e.setTag((Object)object2.a.getText());
        object2.e.setOnClickListener((View.OnClickListener)this);
    }

    @Override
    public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
        try {
            view = M.a.super.getDropDownView(n8, view, viewGroup);
            return view;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)runtimeException);
            viewGroup = this.g(this.r, this.q, viewGroup);
            if (viewGroup != null) {
                ((a)viewGroup.getTag()).a.setText((CharSequence)runtimeException.toString());
            }
            return viewGroup;
        }
    }

    @Override
    public View getView(int n8, View view, ViewGroup viewGroup) {
        try {
            view = M.a.super.getView(n8, view, viewGroup);
            return view;
        }
        catch (RuntimeException runtimeException) {
            Log.w((String)"SuggestionsAdapter", (String)"Search suggestions cursor threw exception.", (Throwable)runtimeException);
            viewGroup = this.h(this.r, this.q, viewGroup);
            if (viewGroup != null) {
                ((a)viewGroup.getTag()).a.setText((CharSequence)runtimeException.toString());
            }
            return viewGroup;
        }
    }

    @Override
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        context = super.h(context, cursor, viewGroup);
        context.setTag((Object)new a((View)context));
        ((ImageView)context.findViewById(e.k)).setImageResource(this.D);
        return context;
    }

    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String string2) {
        if ((string2 = (Drawable.ConstantState)this.C.get((Object)string2)) == null) {
            return null;
        }
        return string2.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        TypedValue typedValue;
        if (this.G == null) {
            typedValue = new TypedValue();
            this.r.getTheme().resolveAttribute(e.a.q, typedValue, true);
            this.G = this.r.getResources().getColorStateList(typedValue.resourceId);
        }
        typedValue = new SpannableString(charSequence);
        typedValue.setSpan((Object)new TextAppearanceSpan(null, 0, 0, this.G, null), 0, charSequence.length(), 33);
        return typedValue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable m(ComponentName object) {
        ActivityInfo activityInfo;
        PackageManager packageManager = this.r.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo((ComponentName)object, 128);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = nameNotFoundException.toString();
        }
        int n8 = activityInfo.getIconResource();
        if (n8 == 0) {
            return null;
        }
        if ((packageManager = packageManager.getDrawable(object.getPackageName(), n8, activityInfo.applicationInfo)) != null) {
            return packageManager;
        }
        packageManager = new StringBuilder();
        packageManager.append("Invalid icon resource ");
        packageManager.append(n8);
        packageManager.append(" for ");
        packageManager.append(object.flattenToShortString());
        object = packageManager.toString();
        Log.w((String)"SuggestionsAdapter", (String)object);
        return null;
    }

    public final Drawable n(ComponentName componentName) {
        String string2 = componentName.flattenToShortString();
        boolean bl = this.C.containsKey((Object)string2);
        Object var3_4 = null;
        if (bl) {
            componentName = (Drawable.ConstantState)this.C.get((Object)string2);
            if (componentName == null) {
                return null;
            }
            return componentName.newDrawable(this.B.getResources());
        }
        Drawable drawable2 = this.m(componentName);
        componentName = drawable2 == null ? var3_4 : drawable2.getConstantState();
        this.C.put((Object)string2, (Object)componentName);
        return drawable2;
    }

    public void notifyDataSetChanged() {
        BaseAdapter.super.notifyDataSetChanged();
        this.B(this.b());
    }

    public void notifyDataSetInvalidated() {
        BaseAdapter.super.notifyDataSetInvalidated();
        this.B(this.b());
    }

    public void onClick(View object) {
        if ((object = object.getTag()) instanceof CharSequence) {
            this.z.R((CharSequence)object);
        }
    }

    public final Drawable p() {
        Drawable drawable2 = this.n(this.A.getSearchActivity());
        if (drawable2 != null) {
            return drawable2;
        }
        return this.r.getPackageManager().getDefaultActivityIcon();
    }

    /*
     * Exception decompiling
     */
    public final Drawable q(Uri var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Drawable r(Uri uri) {
        Resources resources;
        String string2 = uri.getAuthority();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string2 = new StringBuilder();
            string2.append("No authority: ");
            string2.append((Object)uri);
            throw new FileNotFoundException(string2.toString());
        }
        try {
            resources = this.r.getPackageManager().getResourcesForApplication(string2);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        List list = uri.getPathSegments();
        if (list == null) {
            string2 = new StringBuilder();
            string2.append("No path: ");
            string2.append((Object)uri);
            throw new FileNotFoundException(string2.toString());
        }
        int n8 = list.size();
        if (n8 == 1) {
            n8 = Integer.parseInt((String)((String)list.get(0)));
        } else {
            if (n8 != 2) {
                string2 = new StringBuilder();
                string2.append("More than two path segments: ");
                string2.append((Object)uri);
                throw new FileNotFoundException(string2.toString());
            }
            n8 = resources.getIdentifier((String)list.get(1), (String)list.get(0), string2);
        }
        if (n8 != 0) {
            return resources.getDrawable(n8);
        }
        string2 = new StringBuilder();
        string2.append("No resource found for: ");
        string2.append((Object)uri);
        throw new FileNotFoundException(string2.toString());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No package found for authority: ");
        stringBuilder.append((Object)uri);
        throw new FileNotFoundException(stringBuilder.toString());
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Single path segment is not a resource ID: ");
        stringBuilder2.append((Object)uri);
        throw new FileNotFoundException(stringBuilder2.toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Drawable s(String string2) {
        StringBuilder stringBuilder = null;
        Object object = stringBuilder;
        if (string2 == null) return object;
        object = stringBuilder;
        if (string2.isEmpty()) return object;
        if ("0".equals((Object)string2)) {
            return null;
        }
        try {
            int n8 = Integer.parseInt((String)string2);
            object = new StringBuilder();
            object.append("android.resource://");
            object.append(this.B.getPackageName());
            object.append("/");
            object.append(n8);
            object = object.toString();
            stringBuilder = this.k((String)object);
            if (stringBuilder != null) {
                return stringBuilder;
            }
            stringBuilder = x.a.d(this.B, n8);
            this.A((String)object, (Drawable)stringBuilder);
            return stringBuilder;
        }
        catch (NumberFormatException numberFormatException) {}
        object = this.k(string2);
        if (object != null) {
            return object;
        }
        object = this.q(Uri.parse((String)string2));
        this.A(string2, (Drawable)object);
        return object;
        catch (Resources.NotFoundException notFoundException) {}
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Icon resource not found: ");
        stringBuilder2.append(string2);
        Log.w((String)"SuggestionsAdapter", (String)stringBuilder2.toString());
        return null;
    }

    public final Drawable t(Cursor cursor) {
        int n8 = this.K;
        if (n8 == -1) {
            return null;
        }
        if ((cursor = this.s(cursor.getString(n8))) != null) {
            return cursor;
        }
        return this.p();
    }

    public final Drawable u(Cursor cursor) {
        int n8 = this.L;
        if (n8 == -1) {
            return null;
        }
        return this.s(cursor.getString(n8));
    }

    public Cursor v(SearchableInfo arrstring, String string2, int n8) {
        Object var4_4 = null;
        if (arrstring == null) {
            return null;
        }
        String string3 = arrstring.getSuggestAuthority();
        if (string3 == null) {
            return null;
        }
        string3 = new Uri.Builder().scheme("content").authority(string3).query("").fragment("");
        String string4 = arrstring.getSuggestPath();
        if (string4 != null) {
            string3.appendEncodedPath(string4);
        }
        string3.appendPath("search_suggest_query");
        string4 = arrstring.getSuggestSelection();
        if (string4 != null) {
            arrstring = new String[]{string2};
        } else {
            string3.appendPath(string2);
            arrstring = var4_4;
        }
        if (n8 > 0) {
            string3.appendQueryParameter("limit", String.valueOf((int)n8));
        }
        string2 = string3.build();
        return this.r.getContentResolver().query((Uri)string2, null, string4, arrstring, null);
    }

    public void x(int n8) {
        this.F = n8;
    }

    public final void y(ImageView imageView, Drawable drawable2, int n8) {
        imageView.setImageDrawable(drawable2);
        if (drawable2 == null) {
            imageView.setVisibility(n8);
            return;
        }
        imageView.setVisibility(0);
        drawable2.setVisible(false, false);
        drawable2.setVisible(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        int n8 = TextUtils.isEmpty((CharSequence)charSequence) ? 8 : 0;
        textView.setVisibility(n8);
    }

    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(e.k);
        }
    }

}

