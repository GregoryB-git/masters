.class public final Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfc/a<",
        "Landroid/content/Context;",
        "Lo0/i<",
        "Lr0/d;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lp0/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp0/a<",
            "Lr0/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lo0/d<",
            "Lr0/d;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final d:Lnc/d0;

.field public final e:Ljava/lang/Object;

.field public volatile f:Lr0/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp0/a;Ldc/l;Lnc/d0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lp0/a<",
            "Lr0/d;",
            ">;",
            "Ldc/l<",
            "-",
            "Landroid/content/Context;",
            "+",
            "Ljava/util/List<",
            "+",
            "Lo0/d<",
            "Lr0/d;",
            ">;>;>;",
            "Lnc/d0;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lq0/c;->b:Lp0/a;

    iput-object p3, p0, Lq0/c;->c:Ldc/l;

    iput-object p4, p0, Lq0/c;->d:Lnc/d0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/c;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljc/h;)Lr0/b;
    .locals 5

    .line 1
    check-cast p1, Landroid/content/Context;

    .line 2
    .line 3
    const-string v0, "thisRef"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "property"

    .line 9
    .line 10
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p0, Lq0/c;->f:Lr0/b;

    .line 14
    .line 15
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget-object p2, p0, Lq0/c;->e:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter p2

    .line 20
    :try_start_0
    iget-object v0, p0, Lq0/c;->f:Lr0/b;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lq0/c;->b:Lp0/a;

    .line 29
    .line 30
    iget-object v1, p0, Lq0/c;->c:Ldc/l;

    .line 31
    .line 32
    const-string v2, "applicationContext"

    .line 33
    .line 34
    invoke-static {p1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1, p1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/List;

    .line 42
    .line 43
    iget-object v2, p0, Lq0/c;->d:Lnc/d0;

    .line 44
    .line 45
    new-instance v3, Lq0/b;

    .line 46
    .line 47
    invoke-direct {v3, p1, p0}, Lq0/b;-><init>(Landroid/content/Context;Lq0/c;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "migrations"

    .line 51
    .line 52
    invoke-static {v1, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "scope"

    .line 56
    .line 57
    invoke-static {v2, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lr0/c;

    .line 61
    .line 62
    invoke-direct {p1, v3}, Lr0/c;-><init>(Lq0/b;)V

    .line 63
    .line 64
    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    new-instance v0, Lb/z;

    .line 68
    .line 69
    invoke-direct {v0}, Lb/z;-><init>()V

    .line 70
    .line 71
    .line 72
    :cond_0
    new-instance v3, Lo0/e;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-direct {v3, v1, v4}, Lo0/e;-><init>(Ljava/util/List;Lub/e;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v3}, Lva/a;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v3, Lo0/q;

    .line 83
    .line 84
    invoke-direct {v3, p1, v1, v0, v2}, Lo0/q;-><init>(Lr0/c;Ljava/util/List;Lo0/b;Lnc/d0;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, Lr0/b;

    .line 88
    .line 89
    invoke-direct {p1, v3}, Lr0/b;-><init>(Lo0/q;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Lq0/c;->f:Lr0/b;

    .line 93
    .line 94
    :cond_1
    iget-object p1, p0, Lq0/c;->f:Lr0/b;

    .line 95
    .line 96
    invoke-static {p1}, Lec/i;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit p2

    .line 100
    move-object p2, p1

    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception p1

    .line 103
    monitor-exit p2

    .line 104
    throw p1

    .line 105
    :cond_2
    :goto_0
    return-object p2
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
