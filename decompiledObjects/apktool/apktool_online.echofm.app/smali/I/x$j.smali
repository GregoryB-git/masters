.class public LI/x$j;
.super LI/x$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "j"
.end annotation


# instance fields
.field public n:LA/f;

.field public o:LA/f;

.field public p:LA/f;


# direct methods
.method public constructor <init>(LI/x;LI/x$j;)V
    .locals 0
    .param p1    # LI/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # LI/x$j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, LI/x$i;-><init>(LI/x;LI/x$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, LI/x$j;->n:LA/f;

    iput-object p1, p0, LI/x$j;->o:LA/f;

    iput-object p1, p0, LI/x$j;->p:LA/f;

    return-void
.end method

.method public constructor <init>(LI/x;Landroid/view/WindowInsets;)V
    .locals 0
    .param p1    # LI/x;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/WindowInsets;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, LI/x$i;-><init>(LI/x;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LI/x$j;->n:LA/f;

    iput-object p1, p0, LI/x$j;->o:LA/f;

    iput-object p1, p0, LI/x$j;->p:LA/f;

    return-void
.end method


# virtual methods
.method public h()LA/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, LI/x$j;->o:LA/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LI/x$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LI/K;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA/f;->d(Landroid/graphics/Insets;)LA/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LI/x$j;->o:LA/f;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LI/x$j;->o:LA/f;

    .line 18
    .line 19
    return-object v0
.end method

.method public j()LA/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, LI/x$j;->n:LA/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LI/x$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LI/L;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA/f;->d(Landroid/graphics/Insets;)LA/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LI/x$j;->n:LA/f;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LI/x$j;->n:LA/f;

    .line 18
    .line 19
    return-object v0
.end method

.method public l()LA/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, LI/x$j;->p:LA/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LI/x$g;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, LI/I;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, LA/f;->d(Landroid/graphics/Insets;)LA/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LI/x$j;->p:LA/f;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, LI/x$j;->p:LA/f;

    .line 18
    .line 19
    return-object v0
.end method

.method public m(IIII)LI/x;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, LI/x$g;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, LI/J;->a(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, LI/x;->s(Landroid/view/WindowInsets;)LI/x;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public s(LA/f;)V
    .locals 0

    .line 1
    return-void
.end method
