// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.content.pm.ComponentInfo;
import android.os.BaseBundle;
import android.net.Uri$Builder;
import java.io.InputStream;
import android.content.res.Resources$NotFoundException;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.net.Uri;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ComponentName;
import android.text.style.TextAppearanceSpan;
import android.text.SpannableString;
import e.a;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import e.e;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.database.Cursor;
import androidx.appcompat.widget.SearchView;
import android.content.res.ColorStateList;
import java.util.WeakHashMap;
import android.content.Context;
import android.app.SearchableInfo;
import android.view.View$OnClickListener;
import M.c;

public class S extends c implements View$OnClickListener
{
    public final SearchableInfo A;
    public final Context B;
    public final WeakHashMap C;
    public final int D;
    public boolean E;
    public int F;
    public ColorStateList G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final SearchView z;
    
    public S(final Context b, final SearchView z, final SearchableInfo a, final WeakHashMap c) {
        super(b, z.getSuggestionRowLayout(), null, true);
        this.E = false;
        this.F = 1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.z = z;
        this.A = a;
        this.D = z.getSuggestionCommitIconResId();
        this.B = b;
        this.C = c;
    }
    
    public static String o(final Cursor cursor, final String s) {
        return w(cursor, cursor.getColumnIndex(s));
    }
    
    public static String w(final Cursor cursor, final int n) {
        if (n == -1) {
            return null;
        }
        try {
            return cursor.getString(n);
        }
        catch (Exception ex) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", (Throwable)ex);
            return null;
        }
    }
    
    public final void A(final String key, final Drawable drawable) {
        if (drawable != null) {
            this.C.put(key, drawable.getConstantState());
        }
    }
    
    public final void B(final Cursor cursor) {
        Object extras;
        if (cursor != null) {
            extras = cursor.getExtras();
        }
        else {
            extras = null;
        }
        if (extras != null) {
            ((BaseBundle)extras).getBoolean("in_progress");
        }
    }
    
    public void a(final Cursor cursor) {
        if (this.E) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.H = cursor.getColumnIndex("suggest_text_1");
                this.I = cursor.getColumnIndex("suggest_text_2");
                this.J = cursor.getColumnIndex("suggest_text_2_url");
                this.K = cursor.getColumnIndex("suggest_icon_1");
                this.L = cursor.getColumnIndex("suggest_icon_2");
                this.M = cursor.getColumnIndex("suggest_flags");
            }
        }
        catch (Exception ex) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", (Throwable)ex);
        }
    }
    
    public CharSequence c(final Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        final String o = o(cursor, "suggest_intent_query");
        if (o != null) {
            return o;
        }
        if (this.A.shouldRewriteQueryFromData()) {
            final String o2 = o(cursor, "suggest_intent_data");
            if (o2 != null) {
                return o2;
            }
        }
        if (this.A.shouldRewriteQueryFromText()) {
            final String o3 = o(cursor, "suggest_text_1");
            if (o3 != null) {
                return o3;
            }
        }
        return null;
    }
    
    public Cursor d(final CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "";
        }
        else {
            string = charSequence.toString();
        }
        if (((View)this.z).getVisibility() == 0) {
            if (((View)this.z).getWindowVisibility() != 0) {
                return null;
            }
            try {
                final Cursor v = this.v(this.A, string, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            }
            catch (RuntimeException ex) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", (Throwable)ex);
            }
        }
        return null;
    }
    
    public void e(final View view, final Context context, final Cursor cursor) {
        final a a = (a)view.getTag();
        final int m = this.M;
        int int1;
        if (m != -1) {
            int1 = cursor.getInt(m);
        }
        else {
            int1 = 0;
        }
        if (a.a != null) {
            this.z(a.a, w(cursor, this.H));
        }
        if (a.b != null) {
            final String w = w(cursor, this.J);
            CharSequence charSequence;
            if (w != null) {
                charSequence = this.l(w);
            }
            else {
                charSequence = w(cursor, this.I);
            }
            if (TextUtils.isEmpty(charSequence)) {
                final TextView a2 = a.a;
                if (a2 != null) {
                    a2.setSingleLine(false);
                    a.a.setMaxLines(2);
                }
            }
            else {
                final TextView a3 = a.a;
                if (a3 != null) {
                    a3.setSingleLine(true);
                    a.a.setMaxLines(1);
                }
            }
            this.z(a.b, charSequence);
        }
        final ImageView c = a.c;
        if (c != null) {
            this.y(c, this.t(cursor), 4);
        }
        final ImageView d = a.d;
        if (d != null) {
            this.y(d, this.u(cursor), 8);
        }
        final int f = this.F;
        if (f != 2 && (f != 1 || (int1 & 0x1) == 0x0)) {
            a.e.setVisibility(8);
            return;
        }
        a.e.setVisibility(0);
        ((View)a.e).setTag((Object)a.a.getText());
        ((View)a.e).setOnClickListener((View$OnClickListener)this);
    }
    
    public View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
        try {
            dropDownView = super.getDropDownView(n, dropDownView, viewGroup);
            return dropDownView;
        }
        catch (RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View g = this.g(super.r, super.q, viewGroup);
            if (g != null) {
                ((a)g.getTag()).a.setText((CharSequence)ex.toString());
            }
            return g;
        }
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            view = super.getView(n, view, viewGroup);
            return view;
        }
        catch (RuntimeException ex) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", (Throwable)ex);
            final View h = this.h(super.r, super.q, viewGroup);
            if (h != null) {
                ((a)h.getTag()).a.setText((CharSequence)ex.toString());
            }
            return h;
        }
    }
    
    @Override
    public View h(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View h = super.h(context, cursor, viewGroup);
        h.setTag((Object)new a(h));
        ((ImageView)h.findViewById(e.k)).setImageResource(this.D);
        return h;
    }
    
    public boolean hasStableIds() {
        return false;
    }
    
    public final Drawable k(final String key) {
        final Drawable$ConstantState drawable$ConstantState = this.C.get(key);
        if (drawable$ConstantState == null) {
            return null;
        }
        return drawable$ConstantState.newDrawable();
    }
    
    public final CharSequence l(final CharSequence charSequence) {
        if (this.G == null) {
            final TypedValue typedValue = new TypedValue();
            super.r.getTheme().resolveAttribute(e.a.q, typedValue, true);
            this.G = super.r.getResources().getColorStateList(typedValue.resourceId);
        }
        final SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan((Object)new TextAppearanceSpan((String)null, 0, 0, this.G, (ColorStateList)null), 0, charSequence.length(), 33);
        return (CharSequence)spannableString;
    }
    
    public final Drawable m(final ComponentName componentName) {
        final PackageManager packageManager = super.r.getPackageManager();
        while (true) {
            try {
                final ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
                final int iconResource = ((ComponentInfo)activityInfo).getIconResource();
                if (iconResource == 0) {
                    return null;
                }
                final Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
                if (drawable == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid icon resource ");
                    sb.append(iconResource);
                    sb.append(" for ");
                    sb.append(componentName.flattenToShortString());
                    final String s = sb.toString();
                    Log.w("SuggestionsAdapter", s);
                    return null;
                }
                return drawable;
            }
            catch (PackageManager$NameNotFoundException ex) {
                final String s = ex.toString();
                continue;
            }
            break;
        }
    }
    
    public final Drawable n(final ComponentName componentName) {
        final String flattenToShortString = componentName.flattenToShortString();
        final boolean containsKey = this.C.containsKey(flattenToShortString);
        final Drawable$ConstantState drawable$ConstantState = null;
        if (!containsKey) {
            final Drawable m = this.m(componentName);
            Drawable$ConstantState constantState;
            if (m == null) {
                constantState = drawable$ConstantState;
            }
            else {
                constantState = m.getConstantState();
            }
            this.C.put(flattenToShortString, constantState);
            return m;
        }
        final Drawable$ConstantState drawable$ConstantState2 = this.C.get(flattenToShortString);
        if (drawable$ConstantState2 == null) {
            return null;
        }
        return drawable$ConstantState2.newDrawable(this.B.getResources());
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.B(this.b());
    }
    
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.B(this.b());
    }
    
    public void onClick(final View view) {
        final Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.z.R((CharSequence)tag);
        }
    }
    
    public final Drawable p() {
        final Drawable n = this.n(this.A.getSearchActivity());
        if (n != null) {
            return n;
        }
        return super.r.getPackageManager().getDefaultActivityIcon();
    }
    
    public final Drawable q(final Uri obj) {
        while (true) {
            Label_0220: {
                try {
                    if ("android.resource".equals(obj.getScheme())) {
                        final S s = this;
                        final Uri uri = obj;
                        final Drawable r = s.r(uri);
                        return r;
                    }
                    break Label_0220;
                }
                catch (FileNotFoundException ex) {
                    break Label_0220;
                }
                try {
                    final S s = this;
                    final Uri uri = obj;
                    final Drawable r2;
                    final Drawable r = r2 = s.r(uri);
                    return r2;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Icon not found: ");
                    sb.append(obj);
                    sb.append(", ");
                    final FileNotFoundException ex;
                    sb.append(ex.getMessage());
                    Log.w("SuggestionsAdapter", sb.toString());
                    return null;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Resource does not exist: ");
                    sb2.append(obj);
                    throw new FileNotFoundException(sb2.toString());
                    // iftrue(Label_0186:, openInputStream == null)
                Label_0186:
                    while (true) {
                        try {
                            final InputStream openInputStream;
                            final Drawable fromStream = Drawable.createFromStream(openInputStream, (String)null);
                            try {
                                openInputStream.close();
                                return fromStream;
                            }
                            catch (IOException openInputStream) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Error closing icon stream for ");
                                sb3.append(obj);
                                Log.e("SuggestionsAdapter", sb3.toString(), (Throwable)openInputStream);
                                return fromStream;
                            }
                        }
                        finally {
                            try {
                                final InputStream openInputStream;
                                openInputStream.close();
                            }
                            catch (IOException ex2) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("Error closing icon stream for ");
                                sb4.append(obj);
                                Log.e("SuggestionsAdapter", sb4.toString(), (Throwable)ex2);
                            }
                        }
                        break Label_0186;
                        final InputStream openInputStream = this.B.getContentResolver().openInputStream(obj);
                        continue;
                    }
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to open ");
                    sb5.append(obj);
                    throw new FileNotFoundException(sb5.toString());
                }
                catch (Resources$NotFoundException ex3) {}
            }
            continue;
        }
    }
    
    public Drawable r(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_3        
        //     6: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //     9: ifne            282
        //    12: aload_0        
        //    13: getfield        M/a.r:Landroid/content/Context;
        //    16: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    19: aload_3        
        //    20: invokevirtual   android/content/pm/PackageManager.getResourcesForApplication:(Ljava/lang/String;)Landroid/content/res/Resources;
        //    23: astore          4
        //    25: aload_1        
        //    26: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //    29: astore          5
        //    31: aload           5
        //    33: ifnull          214
        //    36: aload           5
        //    38: invokeinterface java/util/List.size:()I
        //    43: istore_2       
        //    44: iload_2        
        //    45: iconst_1       
        //    46: if_icmpne       101
        //    49: aload           5
        //    51: iconst_0       
        //    52: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    57: checkcast       Ljava/lang/String;
        //    60: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    63: istore_2       
        //    64: goto            135
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: astore_3       
        //    75: aload_3        
        //    76: ldc_w           "Single path segment is not a resource ID: "
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: pop            
        //    83: aload_3        
        //    84: aload_1        
        //    85: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    88: pop            
        //    89: new             Ljava/io/FileNotFoundException;
        //    92: dup            
        //    93: aload_3        
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   100: athrow         
        //   101: iload_2        
        //   102: iconst_2       
        //   103: if_icmpne       180
        //   106: aload           4
        //   108: aload           5
        //   110: iconst_1       
        //   111: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   116: checkcast       Ljava/lang/String;
        //   119: aload           5
        //   121: iconst_0       
        //   122: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   127: checkcast       Ljava/lang/String;
        //   130: aload_3        
        //   131: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   134: istore_2       
        //   135: iload_2        
        //   136: ifeq            146
        //   139: aload           4
        //   141: iload_2        
        //   142: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   145: areturn        
        //   146: new             Ljava/lang/StringBuilder;
        //   149: dup            
        //   150: invokespecial   java/lang/StringBuilder.<init>:()V
        //   153: astore_3       
        //   154: aload_3        
        //   155: ldc_w           "No resource found for: "
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: pop            
        //   162: aload_3        
        //   163: aload_1        
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   167: pop            
        //   168: new             Ljava/io/FileNotFoundException;
        //   171: dup            
        //   172: aload_3        
        //   173: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   176: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   179: athrow         
        //   180: new             Ljava/lang/StringBuilder;
        //   183: dup            
        //   184: invokespecial   java/lang/StringBuilder.<init>:()V
        //   187: astore_3       
        //   188: aload_3        
        //   189: ldc_w           "More than two path segments: "
        //   192: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   195: pop            
        //   196: aload_3        
        //   197: aload_1        
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   201: pop            
        //   202: new             Ljava/io/FileNotFoundException;
        //   205: dup            
        //   206: aload_3        
        //   207: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   210: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   213: athrow         
        //   214: new             Ljava/lang/StringBuilder;
        //   217: dup            
        //   218: invokespecial   java/lang/StringBuilder.<init>:()V
        //   221: astore_3       
        //   222: aload_3        
        //   223: ldc_w           "No path: "
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: pop            
        //   230: aload_3        
        //   231: aload_1        
        //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   235: pop            
        //   236: new             Ljava/io/FileNotFoundException;
        //   239: dup            
        //   240: aload_3        
        //   241: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   244: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   247: athrow         
        //   248: new             Ljava/lang/StringBuilder;
        //   251: dup            
        //   252: invokespecial   java/lang/StringBuilder.<init>:()V
        //   255: astore_3       
        //   256: aload_3        
        //   257: ldc_w           "No package found for authority: "
        //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   263: pop            
        //   264: aload_3        
        //   265: aload_1        
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   269: pop            
        //   270: new             Ljava/io/FileNotFoundException;
        //   273: dup            
        //   274: aload_3        
        //   275: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   278: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   281: athrow         
        //   282: new             Ljava/lang/StringBuilder;
        //   285: dup            
        //   286: invokespecial   java/lang/StringBuilder.<init>:()V
        //   289: astore_3       
        //   290: aload_3        
        //   291: ldc_w           "No authority: "
        //   294: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   297: pop            
        //   298: aload_3        
        //   299: aload_1        
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   303: pop            
        //   304: new             Ljava/io/FileNotFoundException;
        //   307: dup            
        //   308: aload_3        
        //   309: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   312: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   315: athrow         
        //   316: astore_3       
        //   317: goto            248
        //   320: astore_3       
        //   321: goto            67
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  12     25     316    282    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  49     64     320    101    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final Drawable s(final String str) {
        Drawable q;
        final Drawable drawable = q = null;
        if (str == null) {
            return q;
        }
        q = drawable;
        if (str.isEmpty()) {
            return q;
        }
        if ("0".equals(str)) {
            return null;
        }
        while (true) {
            while (true) {
                try {
                    final int int1 = Integer.parseInt(str);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("android.resource://");
                    sb.append(this.B.getPackageName());
                    sb.append("/");
                    sb.append(int1);
                    final String string = sb.toString();
                    final Drawable k = this.k(string);
                    if (k != null) {
                        return k;
                    }
                    final Drawable d = x.a.d(this.B, int1);
                    this.A(string, d);
                    return d;
                    q = this.q(Uri.parse(str));
                    this.A(str, q);
                    return q;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Icon resource not found: ");
                    sb2.append(str);
                    Log.w("SuggestionsAdapter", sb2.toString());
                    return null;
                }
                catch (NumberFormatException ex) {}
                catch (Resources$NotFoundException ex2) {}
                continue;
            }
        }
    }
    
    public final Drawable t(final Cursor cursor) {
        final int k = this.K;
        if (k == -1) {
            return null;
        }
        final Drawable s = this.s(cursor.getString(k));
        if (s != null) {
            return s;
        }
        return this.p();
    }
    
    public final Drawable u(final Cursor cursor) {
        final int l = this.L;
        if (l == -1) {
            return null;
        }
        return this.s(cursor.getString(l));
    }
    
    public Cursor v(final SearchableInfo searchableInfo, final String s, final int i) {
        final String[] array = null;
        if (searchableInfo == null) {
            return null;
        }
        final String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        final Uri$Builder fragment = new Uri$Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        final String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        final String suggestSelection = searchableInfo.getSuggestSelection();
        String[] array2;
        if (suggestSelection != null) {
            array2 = new String[] { s };
        }
        else {
            fragment.appendPath(s);
            array2 = array;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return super.r.getContentResolver().query(fragment.build(), (String[])null, suggestSelection, array2, (String)null);
    }
    
    public void x(final int f) {
        this.F = f;
    }
    
    public final void y(final ImageView imageView, final Drawable imageDrawable, final int visibility) {
        imageView.setImageDrawable(imageDrawable);
        if (imageDrawable == null) {
            imageView.setVisibility(visibility);
            return;
        }
        imageView.setVisibility(0);
        imageDrawable.setVisible(false, false);
        imageDrawable.setVisible(true, false);
    }
    
    public final void z(final TextView textView, final CharSequence text) {
        textView.setText(text);
        int visibility;
        if (TextUtils.isEmpty(text)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)textView).setVisibility(visibility);
    }
    
    public static final class a
    {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;
        
        public a(final View view) {
            this.a = (TextView)view.findViewById(16908308);
            this.b = (TextView)view.findViewById(16908309);
            this.c = (ImageView)view.findViewById(16908295);
            this.d = (ImageView)view.findViewById(16908296);
            this.e = (ImageView)view.findViewById(e.k);
        }
    }
}
