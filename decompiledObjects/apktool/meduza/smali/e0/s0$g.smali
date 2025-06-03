.class public Le0/s0$g;
.super Le0/s0$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public k:Lx/b;


# direct methods
.method public constructor <init>(Le0/s0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Le0/s0$f;-><init>(Le0/s0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Le0/s0$g;->k:Lx/b;

    return-void
.end method


# virtual methods
.method public b()Le0/s0;
    .locals 2

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    move-result-object v0

    return-object v0
.end method

.method public c()Le0/s0;
    .locals 2

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Le0/s0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Le0/s0;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lx/b;
    .locals 4

    iget-object v0, p0, Le0/s0$g;->k:Lx/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lx/b;->a(IIII)Lx/b;

    move-result-object v0

    iput-object v0, p0, Le0/s0$g;->k:Lx/b;

    :cond_0
    iget-object v0, p0, Le0/s0$g;->k:Lx/b;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Le0/s0$f;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public m(Lx/b;)V
    .locals 0

    iput-object p1, p0, Le0/s0$g;->k:Lx/b;

    return-void
.end method
