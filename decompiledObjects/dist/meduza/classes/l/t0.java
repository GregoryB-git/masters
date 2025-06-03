package l;

import a0.j;
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import m0.a;
import m0.c;

public final class t0
  extends c
  implements View.OnClickListener
{
  public int A = -1;
  public int B = -1;
  public int C = -1;
  public int D = -1;
  public int E = -1;
  public final SearchView s;
  public final SearchableInfo t;
  public final Context u;
  public final WeakHashMap<String, Drawable.ConstantState> v;
  public final int w;
  public int x = 1;
  public ColorStateList y;
  public int z = -1;
  
  public t0(Context paramContext, SearchView paramSearchView, SearchableInfo paramSearchableInfo, WeakHashMap<String, Drawable.ConstantState> paramWeakHashMap)
  {
    super(paramContext, paramSearchView.getSuggestionRowLayout());
    s = paramSearchView;
    t = paramSearchableInfo;
    w = paramSearchView.getSuggestionCommitIconResId();
    u = paramContext;
    v = paramWeakHashMap;
  }
  
  public static String i(int paramInt, Cursor paramCursor)
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
  
  public final void b(View paramView, Cursor paramCursor)
  {
    a locala = (a)paramView.getTag();
    int i = E;
    if (i != -1) {
      i = paramCursor.getInt(i);
    } else {
      i = 0;
    }
    if (a != null)
    {
      paramView = i(z, paramCursor);
      localObject1 = a;
      ((TextView)localObject1).setText(paramView);
      if (TextUtils.isEmpty(paramView)) {
        j = 8;
      } else {
        j = 0;
      }
      ((View)localObject1).setVisibility(j);
    }
    if (b != null)
    {
      localObject1 = i(B, paramCursor);
      if (localObject1 != null)
      {
        if (y == null)
        {
          paramView = new TypedValue();
          u.getTheme().resolveAttribute(2130968893, paramView, true);
          y = u.getResources().getColorStateList(resourceId);
        }
        paramView = new SpannableString((CharSequence)localObject1);
        paramView.setSpan(new TextAppearanceSpan(null, 0, 0, y, null), 0, ((String)localObject1).length(), 33);
      }
      else
      {
        paramView = i(A, paramCursor);
      }
      if (TextUtils.isEmpty(paramView))
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          ((TextView)localObject1).setSingleLine(false);
          a.setMaxLines(2);
        }
      }
      else
      {
        localObject1 = a;
        if (localObject1 != null)
        {
          ((TextView)localObject1).setSingleLine(true);
          a.setMaxLines(1);
        }
      }
      localObject1 = b;
      ((TextView)localObject1).setText(paramView);
      if (TextUtils.isEmpty(paramView)) {
        j = 8;
      } else {
        j = 0;
      }
      ((View)localObject1).setVisibility(j);
    }
    ImageView localImageView = c;
    Object localObject2 = null;
    if (localImageView != null)
    {
      j = C;
      if (j == -1)
      {
        paramView = null;
      }
      else
      {
        paramView = g(paramCursor.getString(j));
        if (paramView == null)
        {
          ComponentName localComponentName = t.getSearchActivity();
          String str = localComponentName.flattenToShortString();
          if (v.containsKey(str))
          {
            paramView = (Drawable.ConstantState)v.get(str);
            if (paramView == null) {
              paramView = null;
            } else {
              paramView = paramView.newDrawable(u.getResources());
            }
          }
          else
          {
            paramView = u.getPackageManager();
            try
            {
              localObject1 = paramView.getActivityInfo(localComponentName, 128);
              j = ((ComponentInfo)localObject1).getIconResource();
              if (j == 0) {
                break label520;
              }
              localObject1 = paramView.getDrawable(localComponentName.getPackageName(), j, applicationInfo);
              paramView = (View)localObject1;
              if (localObject1 != null) {
                break label522;
              }
              paramView = j.n("Invalid icon resource ", j, " for ");
              paramView.append(localComponentName.flattenToShortString());
              paramView = paramView.toString();
            }
            catch (PackageManager.NameNotFoundException paramView)
            {
              paramView = paramView.toString();
            }
            Log.w("SuggestionsAdapter", paramView);
            label520:
            paramView = null;
            label522:
            if (paramView == null) {
              localObject1 = null;
            } else {
              localObject1 = paramView.getConstantState();
            }
            v.put(str, localObject1);
          }
          if (paramView == null) {
            paramView = u.getPackageManager().getDefaultActivityIcon();
          }
        }
      }
      localImageView.setImageDrawable(paramView);
      if (paramView == null)
      {
        localImageView.setVisibility(4);
      }
      else
      {
        localImageView.setVisibility(0);
        paramView.setVisible(false, false);
        paramView.setVisible(true, false);
      }
    }
    Object localObject1 = d;
    if (localObject1 != null)
    {
      j = D;
      if (j == -1) {
        paramView = (View)localObject2;
      } else {
        paramView = g(paramCursor.getString(j));
      }
      ((ImageView)localObject1).setImageDrawable(paramView);
      if (paramView == null)
      {
        ((ImageView)localObject1).setVisibility(8);
      }
      else
      {
        ((ImageView)localObject1).setVisibility(0);
        paramView.setVisible(false, false);
        paramView.setVisible(true, false);
      }
    }
    int j = x;
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
  
  public final void c(Cursor paramCursor)
  {
    try
    {
      super.c(paramCursor);
      if (paramCursor != null)
      {
        z = paramCursor.getColumnIndex("suggest_text_1");
        A = paramCursor.getColumnIndex("suggest_text_2");
        B = paramCursor.getColumnIndex("suggest_text_2_url");
        C = paramCursor.getColumnIndex("suggest_icon_1");
        D = paramCursor.getColumnIndex("suggest_icon_2");
        E = paramCursor.getColumnIndex("suggest_flags");
      }
    }
    catch (Exception paramCursor)
    {
      Log.e("SuggestionsAdapter", "error changing cursor and caching columns", paramCursor);
    }
  }
  
  public final String d(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return null;
    }
    String str = i(paramCursor.getColumnIndex("suggest_intent_query"), paramCursor);
    if (str != null) {
      return str;
    }
    if (t.shouldRewriteQueryFromData())
    {
      str = i(paramCursor.getColumnIndex("suggest_intent_data"), paramCursor);
      if (str != null) {
        return str;
      }
    }
    if (t.shouldRewriteQueryFromText())
    {
      paramCursor = i(paramCursor.getColumnIndex("suggest_text_1"), paramCursor);
      if (paramCursor != null) {
        return paramCursor;
      }
    }
    return null;
  }
  
  public final View e(ViewGroup paramViewGroup)
  {
    paramViewGroup = r.inflate(p, paramViewGroup, false);
    paramViewGroup.setTag(new a(paramViewGroup));
    ((ImageView)paramViewGroup.findViewById(2131361895)).setImageResource(w);
    return paramViewGroup;
  }
  
  public final Drawable f(Uri paramUri)
  {
    String str = paramUri.getAuthority();
    if (!TextUtils.isEmpty(str)) {
      try
      {
        Resources localResources = u.getPackageManager().getResourcesForApplication(str);
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
              break label194;
            }
            i = localResources.getIdentifier((String)localStringBuilder1.get(1), (String)localStringBuilder1.get(0), str);
          }
          if (i != 0) {
            return localResources.getDrawable(i);
          }
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("No resource found for: ");
          localStringBuilder1.append(paramUri);
          throw new FileNotFoundException(localStringBuilder1.toString());
          label194:
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
  
  /* Error */
  public final Drawable g(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_2
    //   5: astore 4
    //   7: aload_1
    //   8: ifnull +548 -> 556
    //   11: aload_2
    //   12: astore 4
    //   14: aload_1
    //   15: invokevirtual 442	java/lang/String:isEmpty	()Z
    //   18: ifne +538 -> 556
    //   21: ldc_w 444
    //   24: aload_1
    //   25: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +9 -> 37
    //   31: aload_2
    //   32: astore 4
    //   34: goto +522 -> 556
    //   37: aload_1
    //   38: invokestatic 408	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   41: istore 5
    //   43: new 263	java/lang/StringBuilder
    //   46: astore_2
    //   47: aload_2
    //   48: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   51: aload_2
    //   52: ldc_w 449
    //   55: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: aload_0
    //   61: getfield 67	l/t0:u	Landroid/content/Context;
    //   64: invokevirtual 450	android/content/Context:getPackageName	()Ljava/lang/String;
    //   67: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_2
    //   72: ldc_w 452
    //   75: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: aload_2
    //   80: iload 5
    //   82: invokevirtual 455	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload_2
    //   87: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore 4
    //   92: aload_0
    //   93: getfield 69	l/t0:v	Ljava/util/WeakHashMap;
    //   96: aload 4
    //   98: invokevirtual 217	java/util/WeakHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   101: checkcast 219	android/graphics/drawable/Drawable$ConstantState
    //   104: astore_2
    //   105: aload_2
    //   106: ifnonnull +8 -> 114
    //   109: aconst_null
    //   110: astore_2
    //   111: goto +8 -> 119
    //   114: aload_2
    //   115: invokevirtual 457	android/graphics/drawable/Drawable$ConstantState:newDrawable	()Landroid/graphics/drawable/Drawable;
    //   118: astore_2
    //   119: aload_2
    //   120: ifnull +5 -> 125
    //   123: aload_2
    //   124: areturn
    //   125: aload_0
    //   126: getfield 67	l/t0:u	Landroid/content/Context;
    //   129: iload 5
    //   131: invokestatic 462	v/a:getDrawable	(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   134: astore_2
    //   135: aload_2
    //   136: ifnull +17 -> 153
    //   139: aload_0
    //   140: getfield 69	l/t0:v	Ljava/util/WeakHashMap;
    //   143: aload 4
    //   145: aload_2
    //   146: invokevirtual 282	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   149: invokevirtual 286	java/util/WeakHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   152: pop
    //   153: aload_2
    //   154: areturn
    //   155: astore_2
    //   156: new 263	java/lang/StringBuilder
    //   159: dup
    //   160: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   163: astore_2
    //   164: aload_2
    //   165: ldc_w 464
    //   168: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: pop
    //   172: aload_2
    //   173: aload_1
    //   174: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: ldc 84
    //   180: aload_2
    //   181: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   184: invokestatic 276	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   187: pop
    //   188: aconst_null
    //   189: areturn
    //   190: astore_2
    //   191: aload_0
    //   192: getfield 69	l/t0:v	Ljava/util/WeakHashMap;
    //   195: aload_1
    //   196: invokevirtual 217	java/util/WeakHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   199: checkcast 219	android/graphics/drawable/Drawable$ConstantState
    //   202: astore_2
    //   203: aload_2
    //   204: ifnonnull +8 -> 212
    //   207: aconst_null
    //   208: astore_2
    //   209: goto +8 -> 217
    //   212: aload_2
    //   213: invokevirtual 457	android/graphics/drawable/Drawable$ConstantState:newDrawable	()Landroid/graphics/drawable/Drawable;
    //   216: astore_2
    //   217: aload_2
    //   218: ifnull +5 -> 223
    //   221: aload_2
    //   222: areturn
    //   223: aload_1
    //   224: invokestatic 468	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   227: astore 4
    //   229: ldc_w 470
    //   232: aload 4
    //   234: invokevirtual 473	android/net/Uri:getScheme	()Ljava/lang/String;
    //   237: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   240: istore 6
    //   242: iload 6
    //   244: ifeq +56 -> 300
    //   247: aload_0
    //   248: aload 4
    //   250: invokevirtual 475	l/t0:f	(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    //   253: astore_2
    //   254: goto +279 -> 533
    //   257: astore_2
    //   258: new 416	java/io/FileNotFoundException
    //   261: astore_2
    //   262: new 263	java/lang/StringBuilder
    //   265: astore 7
    //   267: aload 7
    //   269: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   272: aload 7
    //   274: ldc_w 477
    //   277: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: pop
    //   281: aload 7
    //   283: aload 4
    //   285: invokevirtual 414	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   288: pop
    //   289: aload_2
    //   290: aload 7
    //   292: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   295: invokespecial 419	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   298: aload_2
    //   299: athrow
    //   300: aload_0
    //   301: getfield 67	l/t0:u	Landroid/content/Context;
    //   304: invokevirtual 481	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   307: aload 4
    //   309: invokevirtual 487	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   312: astore 7
    //   314: aload 7
    //   316: ifnull +116 -> 432
    //   319: aload 7
    //   321: aconst_null
    //   322: invokestatic 491	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   325: astore_2
    //   326: aload 7
    //   328: invokevirtual 496	java/io/InputStream:close	()V
    //   331: goto +45 -> 376
    //   334: astore 8
    //   336: new 263	java/lang/StringBuilder
    //   339: astore 7
    //   341: aload 7
    //   343: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   346: aload 7
    //   348: ldc_w 498
    //   351: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload 7
    //   357: aload 4
    //   359: invokevirtual 414	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: ldc 84
    //   365: aload 7
    //   367: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: aload 8
    //   372: invokestatic 92	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   375: pop
    //   376: goto +157 -> 533
    //   379: astore_2
    //   380: aload 7
    //   382: invokevirtual 496	java/io/InputStream:close	()V
    //   385: goto +45 -> 430
    //   388: astore 7
    //   390: new 263	java/lang/StringBuilder
    //   393: astore 8
    //   395: aload 8
    //   397: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   400: aload 8
    //   402: ldc_w 498
    //   405: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: aload 8
    //   411: aload 4
    //   413: invokevirtual 414	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   416: pop
    //   417: ldc 84
    //   419: aload 8
    //   421: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   424: aload 7
    //   426: invokestatic 92	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   429: pop
    //   430: aload_2
    //   431: athrow
    //   432: new 416	java/io/FileNotFoundException
    //   435: astore_2
    //   436: new 263	java/lang/StringBuilder
    //   439: astore 7
    //   441: aload 7
    //   443: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   446: aload 7
    //   448: ldc_w 500
    //   451: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: aload 7
    //   457: aload 4
    //   459: invokevirtual 414	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload_2
    //   464: aload 7
    //   466: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   469: invokespecial 419	java/io/FileNotFoundException:<init>	(Ljava/lang/String;)V
    //   472: aload_2
    //   473: athrow
    //   474: astore_2
    //   475: new 263	java/lang/StringBuilder
    //   478: dup
    //   479: invokespecial 409	java/lang/StringBuilder:<init>	()V
    //   482: astore 7
    //   484: aload 7
    //   486: ldc_w 502
    //   489: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: pop
    //   493: aload 7
    //   495: aload 4
    //   497: invokevirtual 414	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload 7
    //   503: ldc_w 504
    //   506: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: pop
    //   510: aload 7
    //   512: aload_2
    //   513: invokevirtual 509	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   516: invokevirtual 267	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   519: pop
    //   520: ldc 84
    //   522: aload 7
    //   524: invokevirtual 270	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   527: invokestatic 276	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   530: pop
    //   531: aload_3
    //   532: astore_2
    //   533: aload_2
    //   534: astore 4
    //   536: aload_2
    //   537: ifnull +19 -> 556
    //   540: aload_0
    //   541: getfield 69	l/t0:v	Ljava/util/WeakHashMap;
    //   544: aload_1
    //   545: aload_2
    //   546: invokevirtual 282	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   549: invokevirtual 286	java/util/WeakHashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   552: pop
    //   553: aload_2
    //   554: astore 4
    //   556: aload 4
    //   558: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	559	0	this	t0
    //   0	559	1	paramString	String
    //   1	153	2	localObject1	Object
    //   155	1	2	localNotFoundException1	android.content.res.Resources.NotFoundException
    //   163	18	2	localStringBuilder1	StringBuilder
    //   190	1	2	localNumberFormatException	NumberFormatException
    //   202	52	2	localObject2	Object
    //   257	1	2	localNotFoundException2	android.content.res.Resources.NotFoundException
    //   261	65	2	localObject3	Object
    //   379	52	2	localObject4	Object
    //   435	38	2	localFileNotFoundException1	FileNotFoundException
    //   474	39	2	localFileNotFoundException2	FileNotFoundException
    //   532	22	2	localObject5	Object
    //   3	529	3	localObject6	Object
    //   5	552	4	localObject7	Object
    //   41	89	5	i	int
    //   240	3	6	bool	boolean
    //   265	116	7	localObject8	Object
    //   388	37	7	localIOException1	java.io.IOException
    //   439	84	7	localStringBuilder2	StringBuilder
    //   334	37	8	localIOException2	java.io.IOException
    //   393	27	8	localStringBuilder3	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   37	105	155	android/content/res/Resources$NotFoundException
    //   114	119	155	android/content/res/Resources$NotFoundException
    //   125	135	155	android/content/res/Resources$NotFoundException
    //   139	153	155	android/content/res/Resources$NotFoundException
    //   37	105	190	java/lang/NumberFormatException
    //   114	119	190	java/lang/NumberFormatException
    //   125	135	190	java/lang/NumberFormatException
    //   139	153	190	java/lang/NumberFormatException
    //   247	254	257	android/content/res/Resources$NotFoundException
    //   326	331	334	java/io/IOException
    //   319	326	379	finally
    //   380	385	388	java/io/IOException
    //   229	242	474	java/io/FileNotFoundException
    //   247	254	474	java/io/FileNotFoundException
    //   258	300	474	java/io/FileNotFoundException
    //   300	314	474	java/io/FileNotFoundException
    //   336	376	474	java/io/FileNotFoundException
    //   390	430	474	java/io/FileNotFoundException
    //   430	432	474	java/io/FileNotFoundException
    //   432	474	474	java/io/FileNotFoundException
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getDropDownView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = r.inflate(q, paramViewGroup, false);
      if (paramViewGroup != null) {
        getTaga.setText(paramView.toString());
      }
    }
    return paramViewGroup;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      paramView = super.getView(paramInt, paramView, paramViewGroup);
      return paramView;
    }
    catch (RuntimeException paramView)
    {
      Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", paramView);
      paramViewGroup = e(paramViewGroup);
      getTaga.setText(paramView.toString());
    }
    return paramViewGroup;
  }
  
  public final Cursor h(SearchableInfo paramSearchableInfo, String paramString)
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
    if (str != null)
    {
      paramSearchableInfo = new String[1];
      paramSearchableInfo[0] = paramString;
    }
    else
    {
      ((Uri.Builder)localObject2).appendPath(paramString);
      paramSearchableInfo = (SearchableInfo)localObject1;
    }
    ((Uri.Builder)localObject2).appendQueryParameter("limit", String.valueOf(50));
    paramString = ((Uri.Builder)localObject2).build();
    return u.getContentResolver().query(paramString, null, str, paramSearchableInfo, null);
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    Object localObject = c;
    if (localObject != null) {
      localObject = ((Cursor)localObject).getExtras();
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((BaseBundle)localObject).getBoolean("in_progress");
    }
  }
  
  public final void notifyDataSetInvalidated()
  {
    super.notifyDataSetInvalidated();
    Object localObject = c;
    if (localObject != null) {
      localObject = ((Cursor)localObject).getExtras();
    } else {
      localObject = null;
    }
    if (localObject != null) {
      ((BaseBundle)localObject).getBoolean("in_progress");
    }
  }
  
  public final void onClick(View paramView)
  {
    paramView = paramView.getTag();
    if ((paramView instanceof CharSequence)) {
      s.o((CharSequence)paramView);
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
      e = ((ImageView)paramView.findViewById(2131361895));
    }
  }
}

/* Location:
 * Qualified Name:     l.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */