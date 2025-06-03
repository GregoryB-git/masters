.class public final Lgb/r1$m$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/r1$m;->v(Leb/t0;Leb/c;)Leb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/r1$m$e;

.field public final synthetic b:Lgb/r1$m;


# direct methods
.method public constructor <init>(Lgb/r1$m;Lgb/r1$m$e;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$m$d;->b:Lgb/r1$m;

    iput-object p2, p0, Lgb/r1$m$d;->a:Lgb/r1$m$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/r1$m$d;->b:Lgb/r1$m;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lgb/r1;->k0:Lgb/r1$a;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lgb/r1$m$d;->b:Lgb/r1$m;

    .line 14
    .line 15
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 16
    .line 17
    iget-object v1, v0, Lgb/r1;->C:Ljava/util/Collection;

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, v0, Lgb/r1;->C:Ljava/util/Collection;

    .line 27
    .line 28
    iget-object v0, p0, Lgb/r1$m$d;->b:Lgb/r1$m;

    .line 29
    .line 30
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 31
    .line 32
    iget-object v1, v0, Lgb/r1;->b0:Lgb/r1$i;

    .line 33
    .line 34
    iget-object v0, v0, Lgb/r1;->D:Ljava/lang/Object;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v1, v0, v2}, Lgb/c1;->c(Ljava/lang/Object;Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v0, p0, Lgb/r1$m$d;->b:Lgb/r1$m;

    .line 41
    .line 42
    iget-object v0, v0, Lgb/r1$m;->e:Lgb/r1;

    .line 43
    .line 44
    iget-object v0, v0, Lgb/r1;->C:Ljava/util/Collection;

    .line 45
    .line 46
    iget-object v1, p0, Lgb/r1$m$d;->a:Lgb/r1$m$e;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v0, p0, Lgb/r1$m$d;->a:Lgb/r1$m$e;

    .line 53
    .line 54
    invoke-virtual {v0}, Lgb/r1$m$e;->j()V

    .line 55
    .line 56
    .line 57
    :goto_0
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
