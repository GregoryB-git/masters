.class public final Leb/k$b;
.super Leb/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final a:Leb/b$b;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Leb/b$a;

.field public final d:Leb/p;

.field public final synthetic e:Leb/k;


# direct methods
.method public constructor <init>(Leb/k;Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;Leb/p;)V
    .locals 0

    iput-object p1, p0, Leb/k$b;->e:Leb/k;

    invoke-direct {p0}, Leb/b$a;-><init>()V

    iput-object p2, p0, Leb/k$b;->a:Leb/b$b;

    iput-object p3, p0, Leb/k$b;->b:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Leb/k$b;->c:Leb/b$a;

    const-string p1, "context"

    invoke-static {p5, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p5, p0, Leb/k$b;->d:Leb/p;

    return-void
.end method


# virtual methods
.method public final a(Leb/s0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Leb/k$b;->d:Leb/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Leb/p;->a()Leb/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    iget-object v1, p0, Leb/k$b;->e:Leb/k;

    .line 8
    .line 9
    iget-object v1, v1, Leb/k;->b:Leb/b;

    .line 10
    .line 11
    iget-object v2, p0, Leb/k$b;->a:Leb/b$b;

    .line 12
    .line 13
    iget-object v3, p0, Leb/k$b;->b:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    new-instance v4, Leb/k$a;

    .line 16
    .line 17
    iget-object v5, p0, Leb/k$b;->c:Leb/b$a;

    .line 18
    .line 19
    invoke-direct {v4, v5, p1}, Leb/k$a;-><init>(Leb/b$a;Leb/s0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v3, v4}, Leb/b;->a(Leb/b$b;Ljava/util/concurrent/Executor;Leb/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Leb/k$b;->d:Leb/p;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Leb/p;->c(Leb/p;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    iget-object v1, p0, Leb/k$b;->d:Leb/p;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Leb/p;->c(Leb/p;)V

    .line 35
    .line 36
    .line 37
    throw p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b(Leb/e1;)V
    .locals 1

    iget-object v0, p0, Leb/k$b;->c:Leb/b$a;

    invoke-virtual {v0, p1}, Leb/b$a;->b(Leb/e1;)V

    return-void
.end method
