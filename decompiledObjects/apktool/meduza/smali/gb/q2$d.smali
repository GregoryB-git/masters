.class public final Lgb/q2$d;
.super Leb/k0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/q2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final a:Leb/k0$i;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lgb/q2;


# direct methods
.method public constructor <init>(Lgb/q2;Leb/k0$i;)V
    .locals 1

    iput-object p1, p0, Lgb/q2$d;->c:Lgb/q2;

    invoke-direct {p0}, Leb/k0$j;-><init>()V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lgb/q2$d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string p1, "subchannel"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lgb/q2$d;->a:Leb/k0$i;

    return-void
.end method


# virtual methods
.method public final a(Leb/k0$g;)Leb/k0$f;
    .locals 2

    .line 1
    iget-object p1, p0, Lgb/q2$d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lgb/q2$d;->c:Lgb/q2;

    .line 12
    .line 13
    iget-object p1, p1, Lgb/q2;->f:Leb/k0$e;

    .line 14
    .line 15
    invoke-virtual {p1}, Leb/k0$e;->d()Leb/h1;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lgb/q2$d$a;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lgb/q2$d$a;-><init>(Lgb/q2$d;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p1, Leb/k0$f;->e:Leb/k0$f;

    .line 28
    .line 29
    return-object p1
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
