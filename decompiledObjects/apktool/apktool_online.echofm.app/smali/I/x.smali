.class public LI/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/x$k;,
        LI/x$l;,
        LI/x$j;,
        LI/x$i;,
        LI/x$h;,
        LI/x$g;,
        LI/x$m;,
        LI/x$b;,
        LI/x$a;,
        LI/x$n;,
        LI/x$e;,
        LI/x$d;,
        LI/x$c;,
        LI/x$f;
    }
.end annotation


# static fields
.field public static final b:LI/x;


# instance fields
.field public final a:LI/x$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, LI/x$k;->q:LI/x;

    .line 8
    .line 9
    :goto_0
    sput-object v0, LI/x;->b:LI/x;

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object v0, LI/x$l;->b:LI/x;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    return-void
.end method

.method public constructor <init>(LI/x;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    iget-object p1, p1, LI/x;->a:LI/x$l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, LI/x$k;

    if-eqz v1, :cond_0

    new-instance v0, LI/x$k;

    move-object v1, p1

    check-cast v1, LI/x$k;

    invoke-direct {v0, p0, v1}, LI/x$k;-><init>(LI/x;LI/x$k;)V

    :goto_0
    iput-object v0, p0, LI/x;->a:LI/x$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v1, p1, LI/x$j;

    if-eqz v1, :cond_1

    new-instance v0, LI/x$j;

    move-object v1, p1

    check-cast v1, LI/x$j;

    invoke-direct {v0, p0, v1}, LI/x$j;-><init>(LI/x;LI/x$j;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v0, p1, LI/x$i;

    if-eqz v0, :cond_2

    new-instance v0, LI/x$i;

    move-object v1, p1

    check-cast v1, LI/x$i;

    invoke-direct {v0, p0, v1}, LI/x$i;-><init>(LI/x;LI/x$i;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, LI/x$h;

    if-eqz v0, :cond_3

    new-instance v0, LI/x$h;

    move-object v1, p1

    check-cast v1, LI/x$h;

    invoke-direct {v0, p0, v1}, LI/x$h;-><init>(LI/x;LI/x$h;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, LI/x$g;

    if-eqz v0, :cond_4

    new-instance v0, LI/x$g;

    move-object v1, p1

    check-cast v1, LI/x$g;

    invoke-direct {v0, p0, v1}, LI/x$g;-><init>(LI/x;LI/x$g;)V

    goto :goto_0

    :cond_4
    new-instance v0, LI/x$l;

    invoke-direct {v0, p0}, LI/x$l;-><init>(LI/x;)V

    goto :goto_0

    :goto_1
    invoke-virtual {p1, p0}, LI/x$l;->e(LI/x;)V

    goto :goto_2

    :cond_5
    new-instance p1, LI/x$l;

    invoke-direct {p1, p0}, LI/x$l;-><init>(LI/x;)V

    iput-object p1, p0, LI/x;->a:LI/x$l;

    :goto_2
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LI/x$k;

    invoke-direct {v0, p0, p1}, LI/x$k;-><init>(LI/x;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, LI/x;->a:LI/x$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LI/x$j;

    invoke-direct {v0, p0, p1}, LI/x$j;-><init>(LI/x;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, LI/x$i;

    invoke-direct {v0, p0, p1}, LI/x$i;-><init>(LI/x;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    new-instance v0, LI/x$h;

    invoke-direct {v0, p0, p1}, LI/x$h;-><init>(LI/x;Landroid/view/WindowInsets;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public static m(LA/f;IIII)LA/f;
    .locals 5

    .line 1
    iget v0, p0, LA/f;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, LA/f;->b:I

    .line 10
    .line 11
    sub-int/2addr v2, p2

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, p0, LA/f;->c:I

    .line 17
    .line 18
    sub-int/2addr v3, p3

    .line 19
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, LA/f;->d:I

    .line 24
    .line 25
    sub-int/2addr v4, p4

    .line 26
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v0, p1, :cond_0

    .line 31
    .line 32
    if-ne v2, p2, :cond_0

    .line 33
    .line 34
    if-ne v3, p3, :cond_0

    .line 35
    .line 36
    if-ne v1, p4, :cond_0

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    invoke-static {v0, v2, v3, v1}, LA/f;->b(IIII)LA/f;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static s(Landroid/view/WindowInsets;)LI/x;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, LI/x;->t(Landroid/view/WindowInsets;Landroid/view/View;)LI/x;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static t(Landroid/view/WindowInsets;Landroid/view/View;)LI/x;
    .locals 1

    .line 1
    new-instance v0, LI/x;

    .line 2
    .line 3
    invoke-static {p0}, LH/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/WindowInsets;

    .line 8
    .line 9
    invoke-direct {v0, p0}, LI/x;-><init>(Landroid/view/WindowInsets;)V

    .line 10
    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, LI/s;->t(Landroid/view/View;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, LI/s;->o(Landroid/view/View;)LI/x;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v0, p0}, LI/x;->p(LI/x;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {v0, p0}, LI/x;->d(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()LI/x;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->a()LI/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()LI/x;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->b()LI/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()LI/x;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->c()LI/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->d(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()LI/d;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->f()LI/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LI/x;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LI/x;

    .line 12
    .line 13
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 14
    .line 15
    iget-object p1, p1, LI/x;->a:LI/x$l;

    .line 16
    .line 17
    invoke-static {v0, p1}, LH/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public f(I)LA/f;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->g(I)LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public g()LA/f;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->i()LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->k()LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LA/f;->d:I

    .line 8
    .line 9
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, LI/x$l;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :goto_0
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->k()LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LA/f;->a:I

    .line 8
    .line 9
    return v0
.end method

.method public j()I
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->k()LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LA/f;->c:I

    .line 8
    .line 9
    return v0
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0}, LI/x$l;->k()LA/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LA/f;->b:I

    .line 8
    .line 9
    return v0
.end method

.method public l(IIII)LI/x;
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, LI/x$l;->m(IIII)LI/x;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n([LA/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->p([LA/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(LA/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->q(LA/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public p(LI/x;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->r(LI/x;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(LA/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI/x$l;->s(LA/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public r()Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, LI/x;->a:LI/x$l;

    .line 2
    .line 3
    instance-of v1, v0, LI/x$g;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, LI/x$g;

    .line 8
    .line 9
    iget-object v0, v0, LI/x$g;->c:Landroid/view/WindowInsets;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return-object v0
.end method
