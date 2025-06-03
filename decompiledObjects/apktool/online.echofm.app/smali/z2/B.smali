.class public final Lz2/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA2/c$c;
.implements Lz2/L;


# instance fields
.field public final a:Ly2/a$f;

.field public final b:Lz2/b;

.field public c:LA2/i;

.field public d:Ljava/util/Set;

.field public e:Z

.field public final synthetic f:Lz2/e;


# direct methods
.method public constructor <init>(Lz2/e;Ly2/a$f;Lz2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/B;->f:Lz2/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lz2/B;->c:LA2/i;

    .line 8
    .line 9
    iput-object p1, p0, Lz2/B;->d:Ljava/util/Set;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Lz2/B;->e:Z

    .line 13
    .line 14
    iput-object p2, p0, Lz2/B;->a:Ly2/a$f;

    .line 15
    .line 16
    iput-object p3, p0, Lz2/B;->b:Lz2/b;

    .line 17
    .line 18
    return-void
.end method

.method public static bridge synthetic d(Lz2/B;)Ly2/a$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/B;->a:Ly2/a$f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic e(Lz2/B;)Lz2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/B;->b:Lz2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static bridge synthetic f(Lz2/B;Z)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lz2/B;->e:Z

    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic g(Lz2/B;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz2/B;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lx2/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/B;->f:Lz2/e;

    .line 2
    .line 3
    invoke-static {v0}, Lz2/e;->A(Lz2/e;)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lz2/B;->b:Lz2/b;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lz2/x;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lz2/x;->H(Lx2/b;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final b(Lx2/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz2/B;->f:Lz2/e;

    .line 2
    .line 3
    invoke-static {v0}, Lz2/e;->r(Lz2/e;)Landroid/os/Handler;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lz2/A;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1}, Lz2/A;-><init>(Lz2/B;Lx2/b;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c(LA2/i;Ljava/util/Set;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-object p1, p0, Lz2/B;->c:LA2/i;

    .line 7
    .line 8
    iput-object p2, p0, Lz2/B;->d:Ljava/util/Set;

    .line 9
    .line 10
    invoke-virtual {p0}, Lz2/B;->h()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Exception;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string p2, "GoogleApiManager"

    .line 20
    .line 21
    const-string v0, "Received null response from onSignInSuccess"

    .line 22
    .line 23
    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 24
    .line 25
    .line 26
    new-instance p1, Lx2/b;

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    invoke-direct {p1, p2}, Lx2/b;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lz2/B;->a(Lx2/b;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lz2/B;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lz2/B;->c:LA2/i;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lz2/B;->a:Ly2/a$f;

    .line 10
    .line 11
    iget-object v2, p0, Lz2/B;->d:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v1, v0, v2}, Ly2/a$f;->o(LA2/i;Ljava/util/Set;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
