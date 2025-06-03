.class public final Lgb/r1$k;
.super Leb/k0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "k"
.end annotation


# instance fields
.field public a:Lgb/i$a;

.field public final synthetic b:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$k;->b:Lgb/r1;

    invoke-direct {p0}, Leb/k0$e;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$b;)Leb/k0$i;
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    .line 4
    .line 5
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    .line 9
    .line 10
    iget-boolean v0, v0, Lgb/r1;->J:Z

    .line 11
    .line 12
    xor-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    const-string v1, "Channel is being terminated"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lgb/r1$o;

    .line 20
    .line 21
    iget-object v1, p0, Lgb/r1$k;->b:Lgb/r1;

    .line 22
    .line 23
    invoke-direct {v0, v1, p1}, Lgb/r1$o;-><init>(Lgb/r1;Leb/k0$b;)V

    .line 24
    .line 25
    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
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

.method public final b()Leb/d;
    .locals 1

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->P:Lgb/n;

    return-object v0
.end method

.method public final c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->h:Lgb/r1$n;

    return-object v0
.end method

.method public final d()Leb/h1;
    .locals 1

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    return-object v0
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    invoke-virtual {v0}, Leb/h1;->d()V

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/r1$k$a;

    invoke-direct {v1, p0}, Lgb/r1$k$a;-><init>(Lgb/r1$k;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(Leb/n;Leb/k0$j;)V
    .locals 2

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    invoke-virtual {v0}, Leb/h1;->d()V

    const-string v0, "newState"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "newPicker"

    invoke-static {p2, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lgb/r1$k;->b:Lgb/r1;

    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    new-instance v1, Lgb/r1$k$b;

    invoke-direct {v1, p0, p2, p1}, Lgb/r1$k$b;-><init>(Lgb/r1$k;Leb/k0$j;Leb/n;)V

    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
