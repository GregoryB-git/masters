.class public abstract LJ3/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ3/B$b;,
        LJ3/B$a;,
        LJ3/B$e;,
        LJ3/B$c;,
        LJ3/B$d;
    }
.end annotation


# static fields
.field public static final a:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LJ3/B;->a:Ljava/nio/charset/Charset;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/nio/charset/Charset;
    .locals 1

    .line 1
    sget-object v0, LJ3/B;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    return-object v0
.end method

.method public static b()LJ3/B$b;
    .locals 1

    .line 1
    new-instance v0, LJ3/b$b;

    .line 2
    .line 3
    invoke-direct {v0}, LJ3/b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract c()LJ3/B$a;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public abstract j()LJ3/B$d;
.end method

.method public abstract k()I
.end method

.method public abstract l()Ljava/lang/String;
.end method

.method public abstract m()LJ3/B$e;
.end method

.method public abstract n()LJ3/B$b;
.end method

.method public o(Ljava/lang/String;)LJ3/B;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LJ3/B$b;->c(Ljava/lang/String;)LJ3/B$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, p1}, LJ3/B$e;->p(Ljava/lang/String;)LJ3/B$e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, LJ3/B$b;->l(LJ3/B$e;)LJ3/B$b;

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {v0}, LJ3/B$b;->a()LJ3/B;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public p(LJ3/B$a;)LJ3/B;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object p1, p0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LJ3/B$b;->b(LJ3/B$a;)LJ3/B$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, LJ3/B$b;->a()LJ3/B;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    return-object p1
.end method

.method public q(LJ3/C;)LJ3/B;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p1}, LJ3/B$e;->q(LJ3/C;)LJ3/B$e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, LJ3/B$b;->l(LJ3/B$e;)LJ3/B$b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, LJ3/B$b;->a()LJ3/B;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Reports without sessions cannot have events added to them."

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public r(Ljava/lang/String;)LJ3/B;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LJ3/B$b;->f(Ljava/lang/String;)LJ3/B$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LJ3/B$b;->a()LJ3/B;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public s(LJ3/B$d;)LJ3/B;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LJ3/B$b;->l(LJ3/B$e;)LJ3/B$b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, LJ3/B$b;->i(LJ3/B$d;)LJ3/B$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, LJ3/B$b;->a()LJ3/B;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public t(JZLjava/lang/String;)LJ3/B;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ3/B;->n()LJ3/B$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, LJ3/B;->m()LJ3/B$e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p1, p2, p3, p4}, LJ3/B$e;->r(JZLjava/lang/String;)LJ3/B$e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, LJ3/B$b;->l(LJ3/B$e;)LJ3/B$b;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, LJ3/B$b;->a()LJ3/B;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
