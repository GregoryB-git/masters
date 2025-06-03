.class public final Ly2/c;
.super Ly2/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lp2/k0;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp2/k0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ly2/c;->b:Lp2/k0;

    iput-object p2, p0, Ly2/c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ly2/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly2/c;->b:Lp2/k0;

    .line 2
    .line 3
    iget-object v0, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    invoke-virtual {v0}, Lp1/j;->c()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lx2/t;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p0, Ly2/c;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-interface {v1, v2}, Lx2/t;->x(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p0, Ly2/c;->b:Lp2/k0;

    .line 35
    .line 36
    invoke-static {v3, v2}, Ly2/e;->a(Lp2/k0;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Ly2/c;->b:Lp2/k0;

    .line 47
    .line 48
    iget-object v1, v0, Lp2/k0;->b:Landroidx/work/a;

    .line 49
    .line 50
    iget-object v2, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 51
    .line 52
    iget-object v0, v0, Lp2/k0;->e:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v1, v2, v0}, Lp2/w;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v1

    .line 59
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 60
    .line 61
    .line 62
    throw v1
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
