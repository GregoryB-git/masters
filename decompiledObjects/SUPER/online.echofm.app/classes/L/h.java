package L;

import G.l;
import G.l.a;
import G.l.a.a;
import H.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.PrecomputedText.Params;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class h
{
  public static int a(TextView paramTextView)
  {
    return paramTextView.getPaddingTop() - getPaintgetFontMetricsInttop;
  }
  
  public static int b(TextView paramTextView)
  {
    return paramTextView.getPaddingBottom() + getPaintgetFontMetricsIntbottom;
  }
  
  public static int c(TextDirectionHeuristic paramTextDirectionHeuristic)
  {
    TextDirectionHeuristic localTextDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic1) {
      return 1;
    }
    TextDirectionHeuristic localTextDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic2) {
      return 1;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
      return 2;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.LTR) {
      return 3;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.RTL) {
      return 4;
    }
    if (paramTextDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
      return 5;
    }
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic2) {
      return 6;
    }
    if (paramTextDirectionHeuristic == localTextDirectionHeuristic1) {
      return 7;
    }
    return 1;
  }
  
  public static TextDirectionHeuristic d(TextView paramTextView)
  {
    if ((paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
      return TextDirectionHeuristics.LTR;
    }
    int i = Build.VERSION.SDK_INT;
    int j = 1;
    if ((i >= 28) && ((paramTextView.getInputType() & 0xF) == 3))
    {
      j = Character.getDirectionality(e.a(d.a(b.d(paramTextView)))[0].codePointAt(0));
      if ((j != 1) && (j != 2)) {
        return TextDirectionHeuristics.LTR;
      }
      return TextDirectionHeuristics.RTL;
    }
    if (b.b(paramTextView) != 1) {
      j = 0;
    }
    switch (b.c(paramTextView))
    {
    default: 
      if (j != 0) {
        paramTextView = TextDirectionHeuristics.FIRSTSTRONG_RTL;
      } else {
        paramTextView = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      }
      return paramTextView;
    case 7: 
      return TextDirectionHeuristics.FIRSTSTRONG_RTL;
    case 6: 
      return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    case 5: 
      return TextDirectionHeuristics.LOCALE;
    case 4: 
      return TextDirectionHeuristics.RTL;
    case 3: 
      return TextDirectionHeuristics.LTR;
    }
    return TextDirectionHeuristics.ANYRTL_LTR;
  }
  
  public static l.a e(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return new l.a(e.b(paramTextView));
    }
    l.a.a locala = new l.a.a(new TextPaint(paramTextView.getPaint()));
    locala.b(c.a(paramTextView));
    locala.c(c.d(paramTextView));
    locala.d(d(paramTextView));
    return locala.a();
  }
  
  public static void f(TextView paramTextView, ColorStateList paramColorStateList)
  {
    e.b(paramTextView);
    if (Build.VERSION.SDK_INT >= 24) {
      c.f(paramTextView, paramColorStateList);
    } else if ((paramTextView instanceof i)) {
      ((i)paramTextView).setSupportCompoundDrawablesTintList(paramColorStateList);
    }
  }
  
  public static void g(TextView paramTextView, PorterDuff.Mode paramMode)
  {
    e.b(paramTextView);
    if (Build.VERSION.SDK_INT >= 24) {
      c.g(paramTextView, paramMode);
    } else if ((paramTextView instanceof i)) {
      ((i)paramTextView).setSupportCompoundDrawablesTintMode(paramMode);
    }
  }
  
  public static void h(TextView paramTextView, int paramInt)
  {
    e.a(paramInt);
    if (Build.VERSION.SDK_INT >= 28)
    {
      e.c(paramTextView, paramInt);
      return;
    }
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    int i;
    if (a.a(paramTextView)) {
      i = top;
    } else {
      i = ascent;
    }
    if (paramInt > Math.abs(i)) {
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + i, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom());
    }
  }
  
  public static void i(TextView paramTextView, int paramInt)
  {
    e.a(paramInt);
    Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
    int i;
    if (a.a(paramTextView)) {
      i = bottom;
    } else {
      i = descent;
    }
    if (paramInt > Math.abs(i)) {
      paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - i);
    }
  }
  
  public static void j(TextView paramTextView, int paramInt)
  {
    e.a(paramInt);
    int i = paramTextView.getPaint().getFontMetricsInt(null);
    if (paramInt != i) {
      paramTextView.setLineSpacing(paramInt - i, 1.0F);
    }
  }
  
  public static void k(TextView paramTextView, l paraml)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      throw null;
    }
    e(paramTextView);
    throw null;
  }
  
  public static void l(TextView paramTextView, l.a parama)
  {
    b.h(paramTextView, c(parama.d()));
    paramTextView.getPaint().set(parama.e());
    c.e(paramTextView, parama.b());
    c.h(paramTextView, parama.c());
  }
  
  public static ActionMode.Callback m(TextView paramTextView, ActionMode.Callback paramCallback)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i >= 26) && (i <= 27) && (!(paramCallback instanceof f)) && (paramCallback != null)) {
      return new f(paramCallback, paramTextView);
    }
    return paramCallback;
  }
  
  public static abstract class a
  {
    public static boolean a(TextView paramTextView)
    {
      return paramTextView.getIncludeFontPadding();
    }
    
    public static int b(TextView paramTextView)
    {
      return paramTextView.getMaxLines();
    }
    
    public static int c(TextView paramTextView)
    {
      return paramTextView.getMinLines();
    }
  }
  
  public static abstract class b
  {
    public static Drawable[] a(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawablesRelative();
    }
    
    public static int b(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    public static int c(View paramView)
    {
      return paramView.getTextDirection();
    }
    
    public static Locale d(TextView paramTextView)
    {
      return paramTextView.getTextLocale();
    }
    
    public static void e(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    public static void f(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public static void g(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
    {
      paramTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    }
    
    public static void h(View paramView, int paramInt)
    {
      paramView.setTextDirection(paramInt);
    }
  }
  
  public static abstract class c
  {
    public static int a(TextView paramTextView)
    {
      return paramTextView.getBreakStrategy();
    }
    
    public static ColorStateList b(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawableTintList();
    }
    
    public static PorterDuff.Mode c(TextView paramTextView)
    {
      return paramTextView.getCompoundDrawableTintMode();
    }
    
    public static int d(TextView paramTextView)
    {
      return paramTextView.getHyphenationFrequency();
    }
    
    public static void e(TextView paramTextView, int paramInt)
    {
      paramTextView.setBreakStrategy(paramInt);
    }
    
    public static void f(TextView paramTextView, ColorStateList paramColorStateList)
    {
      paramTextView.setCompoundDrawableTintList(paramColorStateList);
    }
    
    public static void g(TextView paramTextView, PorterDuff.Mode paramMode)
    {
      paramTextView.setCompoundDrawableTintMode(paramMode);
    }
    
    public static void h(TextView paramTextView, int paramInt)
    {
      paramTextView.setHyphenationFrequency(paramInt);
    }
  }
  
  public static abstract class d
  {
    public static DecimalFormatSymbols a(Locale paramLocale)
    {
      return DecimalFormatSymbols.getInstance(paramLocale);
    }
  }
  
  public static abstract class e
  {
    public static String[] a(DecimalFormatSymbols paramDecimalFormatSymbols)
    {
      return paramDecimalFormatSymbols.getDigitStrings();
    }
    
    public static PrecomputedText.Params b(TextView paramTextView)
    {
      return paramTextView.getTextMetricsParams();
    }
    
    public static void c(TextView paramTextView, int paramInt)
    {
      paramTextView.setFirstBaselineToTopHeight(paramInt);
    }
  }
  
  public static class f
    implements ActionMode.Callback
  {
    public final ActionMode.Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;
    
    public f(ActionMode.Callback paramCallback, TextView paramTextView)
    {
      a = paramCallback;
      b = paramTextView;
      f = false;
    }
    
    public final Intent a()
    {
      return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }
    
    public final Intent b(ResolveInfo paramResolveInfo, TextView paramTextView)
    {
      paramTextView = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", d(paramTextView) ^ true);
      paramResolveInfo = activityInfo;
      return paramTextView.setClassName(packageName, name);
    }
    
    public final List c(Context paramContext, PackageManager paramPackageManager)
    {
      ArrayList localArrayList = new ArrayList();
      if (!(paramContext instanceof Activity)) {
        return localArrayList;
      }
      paramPackageManager = paramPackageManager.queryIntentActivities(a(), 0).iterator();
      while (paramPackageManager.hasNext())
      {
        ResolveInfo localResolveInfo = (ResolveInfo)paramPackageManager.next();
        if (e(localResolveInfo, paramContext)) {
          localArrayList.add(localResolveInfo);
        }
      }
      return localArrayList;
    }
    
    public final boolean d(TextView paramTextView)
    {
      boolean bool;
      if (((paramTextView instanceof Editable)) && (paramTextView.onCheckIsTextEditor()) && (paramTextView.isEnabled())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean e(ResolveInfo paramResolveInfo, Context paramContext)
    {
      boolean bool1 = paramContext.getPackageName().equals(activityInfo.packageName);
      boolean bool2 = true;
      if (bool1) {
        return true;
      }
      paramResolveInfo = activityInfo;
      if (!exported) {
        return false;
      }
      paramResolveInfo = permission;
      bool1 = bool2;
      if (paramResolveInfo != null) {
        if (paramContext.checkSelfPermission(paramResolveInfo) == 0) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
      }
      return bool1;
    }
    
    public final void f(Menu paramMenu)
    {
      Object localObject1 = b.getContext();
      PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
      if (!f)
      {
        f = true;
        try
        {
          Class localClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
          c = localClass;
          d = localClass.getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
          e = true;
        }
        catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
        {
          c = null;
          d = null;
          e = false;
        }
      }
      try
      {
        if ((e) && (c.isInstance(paramMenu))) {
          localObject2 = d;
        } else {
          localObject2 = paramMenu.getClass().getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
        }
        for (int i = paramMenu.size() - 1; i >= 0; i--)
        {
          MenuItem localMenuItem = paramMenu.getItem(i);
          if ((localMenuItem.getIntent() != null) && ("android.intent.action.PROCESS_TEXT".equals(localMenuItem.getIntent().getAction()))) {
            ((Method)localObject2).invoke(paramMenu, new Object[] { Integer.valueOf(i) });
          }
        }
        Object localObject2 = c((Context)localObject1, localPackageManager);
        for (i = 0; i < ((List)localObject2).size(); i++)
        {
          localObject1 = (ResolveInfo)((List)localObject2).get(i);
          paramMenu.add(0, 0, i + 100, ((ResolveInfo)localObject1).loadLabel(localPackageManager)).setIntent(b((ResolveInfo)localObject1, b)).setShowAsAction(1);
        }
        return;
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramMenu)
      {
        for (;;) {}
      }
    }
    
    public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
    {
      return a.onActionItemClicked(paramActionMode, paramMenuItem);
    }
    
    public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      return a.onCreateActionMode(paramActionMode, paramMenu);
    }
    
    public void onDestroyActionMode(ActionMode paramActionMode)
    {
      a.onDestroyActionMode(paramActionMode);
    }
    
    public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      f(paramMenu);
      return a.onPrepareActionMode(paramActionMode, paramMenu);
    }
  }
}

/* Location:
 * Qualified Name:     L.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */