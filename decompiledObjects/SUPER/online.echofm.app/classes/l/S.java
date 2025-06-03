package l;

import M.c;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import e.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

public class S
  extends c
  implements View.OnClickListener
{
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
  
  public S(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap paramWeakHashMap)
  {
    super(paramContext, paramSearchView.getSuggestionRowLayout(), null, true);
    z = paramSearchView;
    A = paramSearchableInfo;
    D = paramSearchView.getSuggestionCommitIconResId();
    B = paramContext;
    C = paramWeakHashMap;
  }
  
  public static String o(Cursor paramCursor, String paramString)
  {
    return w(paramCursor, paramCursor.getColumnIndex(paramString));
  }
  
  public static String w(Cursor paramCursor, int paramInt)
  {
    if (paramInt == -1) {
      return null;
    }
    try
    {
      paramCursor = paramCursor.getString(paramInt);
      return paramCursor;
    }
    catch (Exception paramCursor)
    {
      Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", paramCursor);
    }
    return null;
  }
  
  public final void A(String paramString, Drawable paramDrawable)
  {
    if (paramDrawable != null) {
      C.put(paramString, paramDrawable.getConstantState());
    }
  }
  
  public final void B(Cursor paramCursor)
  {
    if (paramCursor != null) {
      paramCursor = paramCursor.getExtras();
    } else {
      paramCursor = null;
    }
    if (paramCursor != null) {
      paramCursor.getBoolean("in_progress");
    }
  }
  
  public void a(Cursor paramCursor)
  {
    if (E)
    {
      Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
    }
    try
    {
      super.a(paramCursor);
      if (paramCursor != null)
      {
        H = paramCursor.getColumnIndex("suggest_text_1");
        I = paramCursor.getColumnIndex("suggest_text_2");
        J = paramCursor.getColumnIndex("suggest_text_2_url");
        K = paramCursor.getColumnIndex("suggest_icon_1");
        L = paramCursor.getColumnIndex("suggest_icon_2");
        M = paramCursor.getColumnIndex("suggest_flags");
      }
    }
    catch (Exception paramCursor)
    {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", paramCursor);
    }
  }
  
  public CharSequence c(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return null;
    }
    String str = o(paramCursor, "suggest_intent_query");
    if (str != null) {
      return str;
    }
    if (A.shouldRewriteQueryFromData())
    {
      str = o(paramCursor, "suggest_intent_data");
      if (str != null) {
        return str;
      }
    }
    if (A.shouldRewriteQueryFromText())
    {
      paramCursor = o(paramCursor, "suggest_text_1");
      if (paramCursor != null) {
        return paramCursor;
      }
    }
    return null;
  }
  
  public Cursor d(CharSequence paramCharSequence)
  {
    if (paramCharSequence == null) {
      paramCharSequence = "";
    } else {
      paramCharSequence = paramCharSequence.toString();
    }
    if ((z.getVisibility() == 0) && (z.getWindowVisibility() == 0)) {
      try
      {
        paramCharSequence = v(A, paramCharSequence, 50);
        if (paramCharSequence != null)
        {
          paramCharSequence.getCount();
          return paramCharSequence;
        }
      }
      catch (RuntimeException paramCharSequence)
      {
        Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", paramCharSequence);
      }
    }
    return null;
  }
  
  public void e(View paramView, Context paramContext, Cursor paramCursor)
  {
    paramContext = (a)paramView.getTag();
    int i = M;
    if (i != -1) {
      i = paramCursor.getInt(i);
    } else {
      i = 0;
    }
    if (a != null)
    {
      paramView = w(paramCursor, H);
      z(a, paramView);
    }
    if (b != null)
    {
      paramView = w(paramCursor, J);
      if (paramView != null) {
        paramView = l(paramView);
      } else {
        paramView = w(paramCursor, I);
      }
      TextView localTextView;
      if (TextUtils.isEmpty(paramView))
      {
        localTextView = a;
        if (localTextView != null)
        {
          localTextView.setSingleLine(false);
          a.setMaxLines(2);
        }
      }
      else
      {
        localTextView = a;
        if (localTextView != null)
        {
          localTextView.setSingleLine(true);
          a.setMaxLines(1);
        }
      }
      z(b, paramView);
    }
    paramView = c;
    if (paramView != null) {
      y(paramView, t(paramCursor), 4);
    }
    paramView = d;
    if (paramView != null) {
      y(paramView, u(paramCursor), 8);
    }
    int j = F;
    if ((j != 2) && ((j != 1) || ((i & 0x1) == 0)))
    {
      e.setVisibility(8);
    }
    else
    {
      e.setVisibility(0);
      e.setTag(a.getText());
      e.setOnClickListener(this);
    }
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getDropDownView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = g(r, q, paramViewGroup);
      if (paramViewGroup != null) {
        getTaga.setText(paramView.toString());
      }
    }
    return paramViewGroup;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = h(r, q, paramViewGroup);
      if (paramViewGroup != null) {
        getTaga.setText(paramView.toString());
      }
    }
    return paramViewGroup;
  }
  
  public View h(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    paramContext = super.h(paramContext, paramCursor, paramViewGroup);
    paramContext.setTag(new a(paramContext));
    ((ImageView)paramContext.findViewById(e.k)).setImageResource(D);
    return paramContext;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public final Drawable k(String paramString)
  {
    paramString = (Drawable.ConstantState)C.get(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.newDrawable();
  }
  
  public final CharSequence l(CharSequence paramCharSequence)
  {
    if (G == null)
    {
      localObject = new TypedValue();
      r.getTheme().resolveAttribute(e.a.q, (TypedValue)localObject, true);
      G = r.getResources().getColorStateList(resourceId);
    }
    Object localObject = new SpannableString(paramCharSequence);
    ((SpannableString)localObject).setSpan(new TextAppearanceSpan(null, 0, 0, G, null), 0, paramCharSequence.length(), 33);
    return (CharSequence)localObject;
  }
  
  public final Drawable m(ComponentName paramComponentName)
  {
    Object localObject = r.getPackageManager();
    try
    {
      ActivityInfo localActivityInfo = ((PackageManager)localObject).getActivityInfo(paramComponentName, 128);
      int i = localActivityInfo.getIconResource();
      if (i == 0) {
        return null;
      }
      localObject = ((PackageManager)localObject).getDrawable(paramComponentName.getPackageName(), i, applicationInfo);
      if (localObject != null) {
        break label103;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid icon resource ");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" for ");
      ((StringBuilder)localObject).append(paramComponentName.flattenToShortString());
      paramComponentName = ((StringBuilder)localObject).toString();
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      for (;;)
      {
        paramComponentName = paramComponentName.toString();
      }
    }
    Log.w("SuggestionsAdapter", paramComponentName);
    return null;
    label103:
    return (Drawable)localObject;
  }
  
  public final Drawable n(ComponentName paramComponentName)
  {
    String str = paramComponentName.flattenToShortString();
    boolean bool = C.containsKey(str);
    Object localObject = null;
    Drawable localDrawable = null;
    if (bool)
    {
      paramComponentName = (Drawable.ConstantState)C.get(str);
      if (paramComponentName == null) {
        paramComponentName = localDrawable;
      } else {
        paramComponentName = paramComponentName.newDrawable(B.getResources());
      }
      return paramComponentName;
    }
    localDrawable = m(paramComponentName);
    if (localDrawable == null) {
      paramComponentName = (ComponentName)localObject;
    } else {
      paramComponentName = localDrawable.getConstantState();
    }
    C.put(str, paramComponentName);
    return localDrawable;
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    B(b());
  }
  
  public void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    B(b());
  }
  
  public void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof CharSequence)) {
      z.R((CharSequence)paramView);
    }
  }
  
  public final Drawable p()
  {
    Drawable localDrawable = n(A.getSearchActivity());
    if (localDrawable != null) {
      return localDrawable;
    }
    return r.getPackageManager().getDefaultActivityIcon();
  }
  
  public final Drawable q(Uri paramUri)
  {
    try
    {
      boolean bool = "android.resource".equals(paramUri.getScheme());
      if (bool) {}
      Drawable localDrawable;
      Object localObject1;
      Object localObject3;
      FileNotFoundException localFileNotFoundException2;
      label238:
      return null;
    }
    catch (FileNotFoundException localFileNotFoundException1)
    {
      try
      {
        localDrawable = r(paramUri);
        return localDrawable;
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        localObject1 = new java/io/FileNotFoundException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("Resource does not exist: ");
        ((StringBuilder)localObject3).append(paramUri);
        ((FileNotFoundException)localObject1).<init>(((StringBuilder)localObject3).toString());
        throw ((Throwable)localObject1);
      }
      localFileNotFoundException1 = localFileNotFoundException1;
      break label238;
      localObject3 = B.getContentResolver().openInputStream(paramUri);
      if (localObject3 != null) {
        try
        {
          localObject1 = Drawable.createFromStream((InputStream)localObject3, null);
          return (Drawable)localObject1;
        }
        finally
        {
          try
          {
            ((InputStream)localObject3).close();
          }
          catch (IOException localIOException2)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("Error closing icon stream for ");
            ((StringBuilder)localObject3).append(paramUri);
            Log.e("SuggestionsAdapter", ((StringBuilder)localObject3).toString(), localIOException2);
          }
        }
      }
      localFileNotFoundException2 = new java/io/FileNotFoundException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Failed to open ");
      ((StringBuilder)localObject3).append(paramUri);
      localFileNotFoundException2.<init>(((StringBuilder)localObject3).toString());
      throw localFileNotFoundException2;
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("Icon not found: ");
      ((StringBuilder)localObject3).append(paramUri);
      ((StringBuilder)localObject3).append(", ");
      ((StringBuilder)localObject3).append(localFileNotFoundException2.getMessage());
      Log.w("SuggestionsAdapter", ((StringBuilder)localObject3).toString());
    }
  }
  
  public Drawable r(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str)) {
      try
      {
        Resources localResources = r.getPackageManager().getResourcesForApplication(str);
        List localList = paramUri.getPathSegments();
        if (localList != null)
        {
          int i = localList.size();
          if (i == 1)
          {
            try
            {
              i = Integer.parseInt((String)localList.get(0));
            }
            catch (NumberFormatException localNumberFormatException)
            {
              localStringBuilder1 = new StringBuilder();
              localStringBuilder1.append("Single path segment is not a resource ID: ");
              localStringBuilder1.append(paramUri);
              throw new FileNotFoundException(localStringBuilder1.toString());
            }
          }
          else
          {
            if (i != 2) {
              break label185;
            }
            i = localStringBuilder1.getIdentifier((String)localList.get(1), (String)localList.get(0), str);
          }
          if (i != 0) {
            return localStringBuilder1.getDrawable(i);
          }
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("No resource found for: ");
          localStringBuilder1.append(paramUri);
          throw new FileNotFoundException(localStringBuilder1.toString());
          label185:
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("More than two path segments: ");
          localStringBuilder1.append(paramUri);
          throw new FileNotFoundException(localStringBuilder1.toString());
        }
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("No path: ");
        localStringBuilder1.append(paramUri);
        throw new FileNotFoundException(localStringBuilder1.toString());
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("No package found for authority: ");
        localStringBuilder2.append(paramUri);
        throw new FileNotFoundException(localStringBuilder2.toString());
      }
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append("No authority: ");
    localStringBuilder2.append(paramUri);
    throw new FileNotFoundException(localStringBuilder2.toString());
  }
  
  public final Drawable s(String paramString)
  {
    Drawable localDrawable1 = null;
    Object localObject = localDrawable1;
    Drawable localDrawable2;
    if (paramString != null)
    {
      localObject = localDrawable1;
      if (!paramString.isEmpty()) {
        if ("0".equals(paramString)) {
          localObject = localDrawable1;
        } else {
          try
          {
            int i = Integer.parseInt(paramString);
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            ((StringBuilder)localObject).append("android.resource://");
            ((StringBuilder)localObject).append(B.getPackageName());
            ((StringBuilder)localObject).append("/");
            ((StringBuilder)localObject).append(i);
            localObject = ((StringBuilder)localObject).toString();
            localDrawable1 = k((String)localObject);
            if (localDrawable1 != null) {
              return localDrawable1;
            }
            localDrawable1 = x.a.d(B, i);
            A((String)localObject, localDrawable1);
            return localDrawable1;
          }
          catch (Resources.NotFoundException localNotFoundException)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Icon resource not found: ");
            localStringBuilder.append(paramString);
            Log.w("SuggestionsAdapter", localStringBuilder.toString());
            return null;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            localDrawable2 = k(paramString);
            if (localDrawable2 != null) {
              return localDrawable2;
            }
            localDrawable2 = q(Uri.parse(paramString));
            A(paramString, localDrawable2);
          }
        }
      }
    }
    return localDrawable2;
  }
  
  public final Drawable t(Cursor paramCursor)
  {
    int i = K;
    if (i == -1) {
      return null;
    }
    paramCursor = s(paramCursor.getString(i));
    if (paramCursor != null) {
      return paramCursor;
    }
    return p();
  }
  
  public final Drawable u(Cursor paramCursor)
  {
    int i = L;
    if (i == -1) {
      return null;
    }
    return s(paramCursor.getString(i));
  }
  
  public Cursor v(SearchableInfo paramSearchableInfo, String paramString, int paramInt)
  {
    Object localObject1 = null;
    if (paramSearchableInfo == null) {
      return null;
    }
    Object localObject2 = paramSearchableInfo.getSuggestAuthority();
    if (localObject2 == null) {
      return null;
    }
    localObject2 = new Uri.Builder().scheme("content").authority((String)localObject2).query("").fragment("");
    String str = paramSearchableInfo.getSuggestPath();
    if (str != null) {
      ((Uri.Builder)localObject2).appendEncodedPath(str);
    }
    ((Uri.Builder)localObject2).appendPath("search_suggest_query");
    str = paramSearchableInfo.getSuggestSelection();
    if (str != null) {}
    for (paramSearchableInfo = new String[] { paramString };; paramSearchableInfo = (SearchableInfo)localObject1)
    {
      break;
      ((Uri.Builder)localObject2).appendPath(paramString);
    }
    if (paramInt > 0) {
      ((Uri.Builder)localObject2).appendQueryParameter("limit", String.valueOf(paramInt));
    }
    paramString = ((Uri.Builder)localObject2).build();
    return r.getContentResolver().query(paramString, null, str, paramSearchableInfo, null);
  }
  
  public void x(int paramInt)
  {
    F = paramInt;
  }
  
  public final void y(ImageView paramImageView, Drawable paramDrawable, int paramInt)
  {
    paramImageView.setImageDrawable(paramDrawable);
    if (paramDrawable == null)
    {
      paramImageView.setVisibility(paramInt);
    }
    else
    {
      paramImageView.setVisibility(0);
      paramDrawable.setVisible(false, false);
      paramDrawable.setVisible(true, false);
    }
  }
  
  public final void z(TextView paramTextView, CharSequence paramCharSequence)
  {
    paramTextView.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {}
    for (int i = 8;; i = 0)
    {
      paramTextView.setVisibility(i);
      break;
    }
  }
  
  public static final class a
  {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    
    public a(View paramView)
    {
      a = ((TextView)paramView.findViewById(16908308));
      b = ((TextView)paramView.findViewById(16908309));
      c = ((ImageView)paramView.findViewById(16908295));
      d = ((ImageView)paramView.findViewById(16908296));
      e = ((ImageView)paramView.findViewById(e.k));
    }
  }
}

/* Location:
 * Qualified Name:     l.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */