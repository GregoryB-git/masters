.class public final Lgb/r1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public volatile a:Lgb/y2$b0;

.field public final synthetic b:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$e;->b:Lgb/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/s2;)Lgb/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1$e;->b:Lgb/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1;->z:Leb/k0$j;

    .line 4
    .line 5
    iget-object v1, p0, Lgb/r1$e;->b:Lgb/r1;

    .line 6
    .line 7
    iget-object v1, v1, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    iget-object p1, p0, Lgb/r1$e;->b:Lgb/r1;

    .line 16
    .line 17
    iget-object p1, p1, Lgb/r1;->F:Lgb/f0;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    if-nez v0, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lgb/r1$e;->b:Lgb/r1;

    .line 23
    .line 24
    iget-object p1, p1, Lgb/r1;->n:Leb/h1;

    .line 25
    .line 26
    new-instance v0, Lgb/z1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lgb/z1;-><init>(Lgb/r1$e;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v0, p1}, Leb/k0$j;->a(Leb/k0$g;)Leb/k0$f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object p1, p1, Lgb/s2;->a:Leb/c;

    .line 40
    .line 41
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    iget-object p1, p1, Leb/c;->h:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-static {v0, p1}, Lgb/v0;->e(Leb/k0$f;Z)Lgb/u;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    return-object p1
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
