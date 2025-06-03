package io.flutter.plugin.platform;

import D5.o;
import D5.o.c;
import D5.o.e;
import D5.o.g;
import D5.o.h;
import D5.o.i;
import D5.o.j;
import D5.o.k;
import D5.o.l;
import I.X;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import t5.b;

public class h
{
  public final Activity a;
  public final o b;
  public final d c;
  public o.j d;
  public int e;
  public final o.h f;
  
  public h(Activity paramActivity, o paramo, d paramd)
  {
    a locala = new a();
    f = locala;
    a = paramActivity;
    b = paramo;
    paramo.l(locala);
    c = paramd;
    e = 1280;
  }
  
  public final void A(List paramList)
  {
    int i;
    if (paramList.size() == 0) {
      i = 5894;
    } else {
      i = 1798;
    }
    for (int j = 0; j < paramList.size(); j++)
    {
      o.l locall = (o.l)paramList.get(j);
      int k = c.b[locall.ordinal()];
      if (k != 1)
      {
        if (k == 2) {
          i &= 0xFDFD;
        }
      }
      else {
        i &= 0xFFFFFFFB;
      }
    }
    e = i;
    E();
  }
  
  public final void B(int paramInt)
  {
    a.setRequestedOrientation(paramInt);
  }
  
  public final void C(o.j paramj)
  {
    Window localWindow = a.getWindow();
    Object localObject1 = new X(localWindow, localWindow.getDecorView());
    int i = Build.VERSION.SDK_INT;
    if (i < 30)
    {
      localWindow.addFlags(Integer.MIN_VALUE);
      localWindow.clearFlags(201326592);
    }
    Object localObject2 = b;
    int j;
    if (localObject2 != null)
    {
      j = c.c[localObject2.ordinal()];
      if (j != 1)
      {
        if (j == 2) {
          ((X)localObject1).b(false);
        }
      }
      else {
        ((X)localObject1).b(true);
      }
    }
    localObject2 = a;
    if (localObject2 != null) {
      localWindow.setStatusBarColor(((Integer)localObject2).intValue());
    }
    localObject2 = c;
    if ((localObject2 != null) && (i >= 29)) {
      c.a(localWindow, ((Boolean)localObject2).booleanValue());
    }
    if (i >= 26)
    {
      localObject2 = e;
      if (localObject2 != null)
      {
        j = c.c[localObject2.ordinal()];
        if (j != 1)
        {
          if (j == 2) {
            ((X)localObject1).a(false);
          }
        }
        else {
          ((X)localObject1).a(true);
        }
      }
      localObject1 = d;
      if (localObject1 != null) {
        localWindow.setNavigationBarColor(((Integer)localObject1).intValue());
      }
    }
    localObject1 = f;
    if ((localObject1 != null) && (i >= 28)) {
      d.a(localWindow, ((Integer)localObject1).intValue());
    }
    localObject1 = g;
    if ((localObject1 != null) && (i >= 29)) {
      e.a(localWindow, ((Boolean)localObject1).booleanValue());
    }
    d = paramj;
  }
  
  public final void D(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.TEXT", paramString);
    a.startActivity(Intent.createChooser(localIntent, null));
  }
  
  public void E()
  {
    a.getWindow().getDecorView().setSystemUiVisibility(e);
    o.j localj = d;
    if (localj != null) {
      C(localj);
    }
  }
  
  public void F(o.g paramg)
  {
    View localView = a.getWindow().getDecorView();
    int i = c.a[paramg.ordinal()];
    int j = 1;
    if (i != 1)
    {
      if (i != 2)
      {
        j = 3;
        if (i != 3)
        {
          j = 4;
          if (i == 4) {
            break label67;
          }
          if (i != 5) {
            return;
          }
        }
      }
      localView.performHapticFeedback(j);
      return;
    }
    label67:
    for (j = 6;; j = 0)
    {
      localView.performHapticFeedback(j);
      break;
    }
  }
  
  public final boolean p()
  {
    Object localObject = (ClipboardManager)a.getSystemService("clipboard");
    if (!((ClipboardManager)localObject).hasPrimaryClip()) {
      return false;
    }
    localObject = ((ClipboardManager)localObject).getPrimaryClipDescription();
    if (localObject == null) {
      return false;
    }
    return ((ClipDescription)localObject).hasMimeType("text/*");
  }
  
  public void q()
  {
    b.l(null);
  }
  
  public final CharSequence r(o.e parame)
  {
    Object localObject1 = (ClipboardManager)a.getSystemService("clipboard");
    boolean bool = ((ClipboardManager)localObject1).hasPrimaryClip();
    Object localObject2 = null;
    if (!bool) {
      return null;
    }
    try
    {
      try
      {
        localObject1 = ((ClipboardManager)localObject1).getPrimaryClip();
        if (localObject1 == null) {
          return null;
        }
        if ((parame != null) && (parame != o.e.p)) {
          return null;
        }
      }
      catch (IOException localIOException1)
      {
        parame = (o.e)localObject2;
        break label249;
      }
      catch (SecurityException parame) {}
      Object localObject3 = localIOException1.getItemAt(0);
      CharSequence localCharSequence1 = ((ClipData.Item)localObject3).getText();
      parame = localCharSequence1;
      if (localCharSequence1 == null)
      {
        parame = localCharSequence1;
        Uri localUri;
        try
        {
          localUri = ((ClipData.Item)localObject3).getUri();
          if (localUri == null)
          {
            parame = localCharSequence1;
            b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
            return null;
          }
        }
        catch (IOException localIOException2) {}
        parame = localIOException2;
        localObject2 = localUri.getScheme();
        parame = localIOException2;
        if (!((String)localObject2).equals("content"))
        {
          parame = localIOException2;
          localObject3 = new java/lang/StringBuilder;
          parame = localIOException2;
          ((StringBuilder)localObject3).<init>();
          parame = localIOException2;
          ((StringBuilder)localObject3).append("Clipboard item contains a Uri with scheme '");
          parame = localIOException2;
          ((StringBuilder)localObject3).append((String)localObject2);
          parame = localIOException2;
          ((StringBuilder)localObject3).append("'that is unhandled.");
          parame = localIOException2;
          b.g("PlatformPlugin", ((StringBuilder)localObject3).toString());
          return null;
        }
        parame = localIOException2;
        localObject2 = a.getContentResolver().openTypedAssetFileDescriptor(localUri, "text/*", null);
        parame = localIOException2;
        localCharSequence2 = ((ClipData.Item)localObject3).coerceToText(a);
        parame = localCharSequence2;
        if (localObject2 != null)
        {
          parame = localCharSequence2;
          ((AssetFileDescriptor)localObject2).close();
          parame = localCharSequence2;
        }
      }
      return parame;
    }
    catch (FileNotFoundException parame)
    {
      CharSequence localCharSequence2;
      label249:
      b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
      return null;
    }
    b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", localCharSequence2);
    return parame;
    b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", parame);
    return null;
  }
  
  public final void s(o.i parami)
  {
    if (parami == o.i.p) {
      a.getWindow().getDecorView().playSoundEffect(0);
    }
  }
  
  public final void t()
  {
    Object localObject = c;
    if ((localObject != null) && (((d)localObject).a())) {
      return;
    }
    localObject = a;
    if ((localObject instanceof androidx.activity.c)) {
      ((androidx.activity.c)localObject).j().c();
    } else {
      ((Activity)localObject).finish();
    }
  }
  
  public final void u()
  {
    E();
  }
  
  public final void v(String paramString)
  {
    ((ClipboardManager)a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", paramString));
  }
  
  public final void w(boolean paramBoolean)
  {
    d locald = c;
    if (locald != null) {
      locald.f(paramBoolean);
    }
  }
  
  public final void x(o.c paramc)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      a.setTaskDescription(new ActivityManager.TaskDescription(b, null, a));
    }
    else
    {
      g.a();
      paramc = f.a(b, 0, a);
      a.setTaskDescription(paramc);
    }
  }
  
  public final void y()
  {
    final View localView = a.getWindow().getDecorView();
    localView.setOnSystemUiVisibilityChangeListener(new b(localView));
  }
  
  public final void z(o.k paramk)
  {
    int i;
    if (paramk == o.k.p)
    {
      i = 1798;
    }
    else if (paramk == o.k.q)
    {
      i = 3846;
    }
    else if (paramk == o.k.r)
    {
      i = 5894;
    }
    else
    {
      if ((paramk != o.k.s) || (Build.VERSION.SDK_INT < 29)) {
        return;
      }
      i = 1792;
    }
    e = i;
    E();
  }
  
  public class a
    implements o.h
  {
    public a() {}
    
    public void a()
    {
      h.o(h.this);
    }
    
    public void f(boolean paramBoolean)
    {
      h.n(h.this, paramBoolean);
    }
    
    public void g(o.k paramk)
    {
      h.j(h.this, paramk);
    }
    
    public void h(List paramList)
    {
      h.i(h.this, paramList);
    }
    
    public void i(o.i parami)
    {
      h.a(h.this, parami);
    }
    
    public void j()
    {
      h.k(h.this);
    }
    
    public void k()
    {
      h.l(h.this);
    }
    
    public void l(String paramString)
    {
      h.d(h.this, paramString);
    }
    
    public void m(o.c paramc)
    {
      h.h(h.this, paramc);
    }
    
    public void n(o.g paramg)
    {
      F(paramg);
    }
    
    public CharSequence o(o.e parame)
    {
      return h.c(h.this, parame);
    }
    
    public void p(int paramInt)
    {
      h.b(h.this, paramInt);
    }
    
    public void q(String paramString)
    {
      h.f(h.this, paramString);
    }
    
    public boolean r()
    {
      return h.e(h.this);
    }
    
    public void s(o.j paramj)
    {
      h.m(h.this, paramj);
    }
  }
  
  public class b
    implements View.OnSystemUiVisibilityChangeListener
  {
    public b(View paramView) {}
    
    public void onSystemUiVisibilityChange(int paramInt)
    {
      localView.post(new i(this, paramInt));
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean a();
    
    public abstract void f(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */