package j0;

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
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.support.v4.media.session.b;
import android.text.Editable;
import android.text.PrecomputedText;
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
import c0.c;
import c0.c.a;
import com.google.android.recaptcha.internal.a;
import d2.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class h
{
  public static c.a a(TextView paramTextView)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      return new c.a(c.c(paramTextView));
    }
    TextPaint localTextPaint = new TextPaint(paramTextView.getPaint());
    TextDirectionHeuristic localTextDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    int j = a.a(paramTextView);
    int k = a.d(paramTextView);
    if ((paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod)) {}
    int m;
    do
    {
      paramTextView = TextDirectionHeuristics.LTR;
      break label213;
      m = 0;
      if ((i < 28) || ((paramTextView.getInputType() & 0xF) != 3)) {
        break;
      }
      m = Character.getDirectionality(c.b(b.a(paramTextView.getTextLocale()))[0].codePointAt(0));
      if (m == 1) {
        break label195;
      }
    } while (m != 2);
    break label195;
    if (paramTextView.getLayoutDirection() == 1) {
      m = 1;
    }
    switch (paramTextView.getTextDirection())
    {
    case 3: 
    default: 
      if (m == 0) {
        break;
      }
    case 7: 
      paramTextView = TextDirectionHeuristics.FIRSTSTRONG_RTL;
      break;
    case 5: 
      paramTextView = TextDirectionHeuristics.LOCALE;
      break;
    case 4: 
      paramTextView = TextDirectionHeuristics.RTL;
      break;
    case 2: 
      label195:
      paramTextView = TextDirectionHeuristics.ANYRTL_LTR;
      break;
    }
    paramTextView = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    label213:
    return new c.a(localTextPaint, paramTextView, j, k);
  }
  
  public static void b(TextView paramTextView, int paramInt)
  {
    if (paramInt >= 0)
    {
      if (Build.VERSION.SDK_INT >= 28)
      {
        c.d(paramTextView, paramInt);
        return;
      }
      Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      int i;
      if (paramTextView.getIncludeFontPadding()) {
        i = top;
      } else {
        i = ascent;
      }
      if (paramInt > Math.abs(i)) {
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + i, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom());
      }
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void c(TextView paramTextView, int paramInt)
  {
    if (paramInt >= 0)
    {
      Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      int i;
      if (paramTextView.getIncludeFontPadding()) {
        i = bottom;
      } else {
        i = descent;
      }
      if (paramInt > Math.abs(i)) {
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - i);
      }
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void d(TextView paramTextView, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      paramc.getClass();
      paramTextView.setText(c.a(null));
      return;
    }
    paramTextView = a(paramTextView);
    paramc.getClass();
    paramTextView.a(null);
    throw null;
  }
  
  public static ActionMode.Callback e(ActionMode.Callback paramCallback)
  {
    ActionMode.Callback localCallback = paramCallback;
    if ((paramCallback instanceof d))
    {
      localCallback = paramCallback;
      if (Build.VERSION.SDK_INT >= 26) {
        localCallback = a;
      }
    }
    return localCallback;
  }
  
  public static ActionMode.Callback f(ActionMode.Callback paramCallback, TextView paramTextView)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i >= 26) && (i <= 27) && (!(paramCallback instanceof d)) && (paramCallback != null)) {
      return new d(paramCallback, paramTextView);
    }
    return paramCallback;
  }
  
  public static final class a
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
  
  public static final class b
  {
    public static DecimalFormatSymbols a(Locale paramLocale)
    {
      return DecimalFormatSymbols.getInstance(paramLocale);
    }
  }
  
  public static final class c
  {
    public static CharSequence a(PrecomputedText paramPrecomputedText)
    {
      return paramPrecomputedText;
    }
    
    public static String[] b(DecimalFormatSymbols paramDecimalFormatSymbols)
    {
      return k.l(paramDecimalFormatSymbols);
    }
    
    public static PrecomputedText.Params c(TextView paramTextView)
    {
      return a.h(paramTextView);
    }
    
    public static void d(TextView paramTextView, int paramInt)
    {
      b.n(paramTextView, paramInt);
    }
  }
  
  public static final class d
    implements ActionMode.Callback
  {
    public final ActionMode.Callback a;
    public final TextView b;
    public Class<?> c;
    public Method d;
    public boolean e;
    public boolean f;
    
    public d(ActionMode.Callback paramCallback, TextView paramTextView)
    {
      a = paramCallback;
      b = paramTextView;
      f = false;
    }
    
    public final boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
    {
      return a.onActionItemClicked(paramActionMode, paramMenuItem);
    }
    
    public final boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
    {
      return a.onCreateActionMode(paramActionMode, paramMenu);
    }
    
    public final void onDestroyActionMode(ActionMode paramActionMode)
    {
      a.onDestroyActionMode(paramActionMode);
    }
    
    public final boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
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
        int i = paramMenu.size();
        i--;
        Object localObject3;
        while (i >= 0)
        {
          localObject3 = paramMenu.getItem(i);
          if ((((MenuItem)localObject3).getIntent() != null) && ("android.intent.action.PROCESS_TEXT".equals(((MenuItem)localObject3).getIntent().getAction()))) {
            ((Method)localObject2).invoke(paramMenu, new Object[] { Integer.valueOf(i) });
          }
          i--;
        }
        Object localObject2 = new ArrayList();
        Object localObject4;
        Object localObject5;
        if ((localObject1 instanceof Activity))
        {
          localObject4 = localPackageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            localObject3 = (ResolveInfo)((Iterator)localObject4).next();
            if (!((Context)localObject1).getPackageName().equals(activityInfo.packageName))
            {
              localObject5 = activityInfo;
              if (exported)
              {
                localObject5 = permission;
                if ((localObject5 == null) || (((Context)localObject1).checkSelfPermission((String)localObject5) == 0)) {}
              }
              else
              {
                i = 0;
                break label355;
              }
            }
            i = 1;
            label355:
            if (i != 0) {
              ((ArrayList)localObject2).add(localObject3);
            }
          }
        }
        for (i = 0; i < ((ArrayList)localObject2).size(); i++)
        {
          localObject3 = (ResolveInfo)((ArrayList)localObject2).get(i);
          localObject1 = paramMenu.add(0, 0, i + 100, ((ResolveInfo)localObject3).loadLabel(localPackageManager));
          localObject4 = b;
          localObject5 = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
          int j;
          if (((localObject4 instanceof Editable)) && (((TextView)localObject4).onCheckIsTextEditor()) && (((View)localObject4).isEnabled())) {
            j = 1;
          } else {
            j = 0;
          }
          localObject4 = ((Intent)localObject5).putExtra("android.intent.extra.PROCESS_TEXT_READONLY", j ^ 0x1);
          localObject3 = activityInfo;
          ((MenuItem)localObject1).setIntent(((Intent)localObject4).setClassName(packageName, name)).setShowAsAction(1);
        }
      }
      catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException)
      {
        for (;;) {}
      }
      return a.onPrepareActionMode(paramActionMode, paramMenu);
    }
  }
}

/* Location:
 * Qualified Name:     j0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */