.class public final LB0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB0/n$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB0/p$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Li0/k;

.field public final c:I

.field public final d:Li0/x;

.field public final e:LB0/p$a;

.field public volatile f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li0/g;Landroid/net/Uri;ILB0/p$a;)V
    .locals 1

    .line 1
    new-instance v0, Li0/k$b;

    invoke-direct {v0}, Li0/k$b;-><init>()V

    invoke-virtual {v0, p2}, Li0/k$b;->i(Landroid/net/Uri;)Li0/k$b;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Li0/k$b;->b(I)Li0/k$b;

    move-result-object p2

    invoke-virtual {p2}, Li0/k$b;->a()Li0/k;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3, p4}, LB0/p;-><init>(Li0/g;Li0/k;ILB0/p$a;)V

    return-void
.end method

.method public constructor <init>(Li0/g;Li0/k;ILB0/p$a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li0/x;

    invoke-direct {v0, p1}, Li0/x;-><init>(Li0/g;)V

    iput-object v0, p0, LB0/p;->d:Li0/x;

    iput-object p2, p0, LB0/p;->b:Li0/k;

    iput p3, p0, LB0/p;->c:I

    iput-object p4, p0, LB0/p;->e:LB0/p$a;

    invoke-static {}, Lx0/r;->a()J

    move-result-wide p1

    iput-wide p1, p0, LB0/p;->a:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LB0/p;->d:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, LB0/p;->d:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->t()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li0/i;

    .line 7
    .line 8
    iget-object v1, p0, LB0/p;->d:Li0/x;

    .line 9
    .line 10
    iget-object v2, p0, LB0/p;->b:Li0/k;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Li0/i;-><init>(Li0/g;Li0/k;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v0}, Li0/i;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LB0/p;->d:Li0/x;

    .line 19
    .line 20
    invoke-virtual {v1}, Li0/x;->k()Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/net/Uri;

    .line 29
    .line 30
    iget-object v2, p0, LB0/p;->e:LB0/p$a;

    .line 31
    .line 32
    invoke-interface {v2, v1, v0}, LB0/p$a;->a(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, LB0/p;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    invoke-static {v0}, Lg0/M;->m(Ljava/io/Closeable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    invoke-static {v0}, Lg0/M;->m(Ljava/io/Closeable;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/p;->d:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->s()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/p;->f:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/p;->d:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->r()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
