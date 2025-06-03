.class public final Leb/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:Leb/z0;

.field public final c:Leb/h1;

.field public final d:Leb/u0$f;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Leb/d;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Leb/z0;Leb/h1;Leb/u0$f;Ljava/util/concurrent/ScheduledExecutorService;Leb/d;Ljava/util/concurrent/Executor;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultPort not set"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Leb/u0$a;->a:I

    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Leb/u0$a;->b:Leb/z0;

    const-string p1, "syncContext not set"

    invoke-static {p3, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p3, p0, Leb/u0$a;->c:Leb/h1;

    const-string p1, "serviceConfigParser not set"

    invoke-static {p4, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p4, p0, Leb/u0$a;->d:Leb/u0$f;

    iput-object p5, p0, Leb/u0$a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Leb/u0$a;->f:Leb/d;

    iput-object p7, p0, Leb/u0$a;->g:Ljava/util/concurrent/Executor;

    iput-object p8, p0, Leb/u0$a;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Ln7/g;->b(Ljava/lang/Object;)Ln7/g$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Leb/u0$a;->a:I

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "defaultPort"

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Leb/u0$a;->b:Leb/z0;

    .line 17
    .line 18
    const-string v2, "proxyDetector"

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Leb/u0$a;->c:Leb/h1;

    .line 24
    .line 25
    const-string v2, "syncContext"

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Leb/u0$a;->d:Leb/u0$f;

    .line 31
    .line 32
    const-string v2, "serviceConfigParser"

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Leb/u0$a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 38
    .line 39
    const-string v2, "scheduledExecutorService"

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Leb/u0$a;->f:Leb/d;

    .line 45
    .line 46
    const-string v2, "channelLogger"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Leb/u0$a;->g:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    const-string v2, "executor"

    .line 54
    .line 55
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Leb/u0$a;->h:Ljava/lang/String;

    .line 59
    .line 60
    const-string v2, "overrideAuthority"

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ln7/g$a;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ln7/g$a;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
