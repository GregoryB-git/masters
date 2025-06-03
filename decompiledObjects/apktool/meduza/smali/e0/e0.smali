.class public final synthetic Le0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnUnhandledKeyEventListener;


# instance fields
.field public final synthetic a:Le0/d0$l;


# direct methods
.method public synthetic constructor <init>(Le0/d0$l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/e0;->a:Le0/d0$l;

    return-void
.end method


# virtual methods
.method public final onUnhandledKeyEvent(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 0

    iget-object p1, p0, Le0/e0;->a:Le0/d0$l;

    invoke-interface {p1}, Le0/d0$l;->a()Z

    move-result p1

    return p1
.end method
