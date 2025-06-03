.class public final Lg/u$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/view/menu/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Lg/u;


# direct methods
.method public constructor <init>(Lg/u;)V
    .locals 0

    iput-object p1, p0, Lg/u$c;->b:Lg/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/appcompat/view/menu/f;Z)V
    .locals 1

    iget-boolean p2, p0, Lg/u$c;->a:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p0, Lg/u$c;->a:Z

    iget-object p2, p0, Lg/u$c;->b:Lg/u;

    iget-object p2, p2, Lg/u;->a:Landroidx/appcompat/widget/d;

    invoke-virtual {p2}, Landroidx/appcompat/widget/d;->h()V

    iget-object p2, p0, Lg/u$c;->b:Lg/u;

    iget-object p2, p2, Lg/u;->b:Landroid/view/Window$Callback;

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg/u$c;->a:Z

    return-void
.end method

.method public final c(Landroidx/appcompat/view/menu/f;)Z
    .locals 2

    iget-object v0, p0, Lg/u$c;->b:Lg/u;

    iget-object v0, v0, Lg/u;->b:Landroid/view/Window$Callback;

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1
.end method
