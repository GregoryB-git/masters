.class public final Ly2/b;
.super Ly2/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lp2/k0;

.field public final synthetic c:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Lp2/k0;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Ly2/b;->b:Lp2/k0;

    iput-object p2, p0, Ly2/b;->c:Ljava/util/UUID;

    invoke-direct {p0}, Ly2/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly2/b;->b:Lp2/k0;

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
    iget-object v1, p0, Ly2/b;->b:Lp2/k0;

    .line 9
    .line 10
    iget-object v2, p0, Ly2/b;->c:Ljava/util/UUID;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v1, v2}, Ly2/e;->a(Lp2/k0;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ly2/b;->b:Lp2/k0;

    .line 26
    .line 27
    iget-object v1, v0, Lp2/k0;->b:Landroidx/work/a;

    .line 28
    .line 29
    iget-object v2, v0, Lp2/k0;->c:Landroidx/work/impl/WorkDatabase;

    .line 30
    .line 31
    iget-object v0, v0, Lp2/k0;->e:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Lp2/w;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 39
    .line 40
    .line 41
    throw v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
