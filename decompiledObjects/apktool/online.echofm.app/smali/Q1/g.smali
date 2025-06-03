.class public final LQ1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ1/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQ1/g;

    .line 2
    .line 3
    invoke-direct {v0}, LQ1/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQ1/g;->a:LQ1/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, LQ1/g;->e(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, LQ1/g;->f(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Z)V
    .locals 0

    .line 1
    invoke-static {p0}, LQ1/g;->g(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final d()V
    .locals 2

    .line 1
    invoke-static {}, Lx1/B;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, LO1/n;->a:LO1/n;

    .line 9
    .line 10
    sget-object v0, LO1/n$b;->J:LO1/n$b;

    .line 11
    .line 12
    new-instance v1, LQ1/d;

    .line 13
    .line 14
    invoke-direct {v1}, LQ1/d;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, LO1/n$b;->M:LO1/n$b;

    .line 21
    .line 22
    new-instance v1, LQ1/e;

    .line 23
    .line 24
    invoke-direct {v1}, LQ1/e;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, LO1/n$b;->N:LO1/n$b;

    .line 31
    .line 32
    new-instance v1, LQ1/f;

    .line 33
    .line 34
    invoke-direct {v1}, LQ1/f;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, LO1/n;->a(LO1/n$b;LO1/n$a;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static final e(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sget-object p0, LS1/c;->b:LS1/c$a;

    .line 4
    .line 5
    invoke-virtual {p0}, LS1/c$a;->c()V

    .line 6
    .line 7
    .line 8
    sget-object p0, LO1/n;->a:LO1/n;

    .line 9
    .line 10
    sget-object p0, LO1/n$b;->K:LO1/n$b;

    .line 11
    .line 12
    invoke-static {p0}, LO1/n;->g(LO1/n$b;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-static {}, LQ1/b;->b()V

    .line 19
    .line 20
    .line 21
    invoke-static {}, LT1/a;->a()V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object p0, LO1/n$b;->L:LO1/n$b;

    .line 25
    .line 26
    invoke-static {p0}, LO1/n;->g(LO1/n$b;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-static {}, LV1/a;->a()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public static final f(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LU1/e;->d()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public static final g(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, LR1/e;->c()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method
