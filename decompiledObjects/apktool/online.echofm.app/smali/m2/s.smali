.class public final Lm2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/b;


# instance fields
.field public final a:LU5/a;

.field public final b:LU5/a;

.field public final c:LU5/a;

.field public final d:LU5/a;

.field public final e:LU5/a;

.field public final f:LU5/a;

.field public final g:LU5/a;

.field public final h:LU5/a;

.field public final i:LU5/a;


# direct methods
.method public constructor <init>(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm2/s;->a:LU5/a;

    .line 5
    .line 6
    iput-object p2, p0, Lm2/s;->b:LU5/a;

    .line 7
    .line 8
    iput-object p3, p0, Lm2/s;->c:LU5/a;

    .line 9
    .line 10
    iput-object p4, p0, Lm2/s;->d:LU5/a;

    .line 11
    .line 12
    iput-object p5, p0, Lm2/s;->e:LU5/a;

    .line 13
    .line 14
    iput-object p6, p0, Lm2/s;->f:LU5/a;

    .line 15
    .line 16
    iput-object p7, p0, Lm2/s;->g:LU5/a;

    .line 17
    .line 18
    iput-object p8, p0, Lm2/s;->h:LU5/a;

    .line 19
    .line 20
    iput-object p9, p0, Lm2/s;->i:LU5/a;

    .line 21
    .line 22
    return-void
.end method

.method public static a(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)Lm2/s;
    .locals 11

    .line 1
    new-instance v10, Lm2/s;

    .line 2
    .line 3
    move-object v0, v10

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lm2/s;-><init>(LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;LU5/a;)V

    .line 18
    .line 19
    .line 20
    return-object v10
.end method

.method public static c(Landroid/content/Context;Lg2/e;Ln2/d;Lm2/x;Ljava/util/concurrent/Executor;Lo2/b;Lp2/a;Lp2/a;Ln2/c;)Lm2/r;
    .locals 11

    .line 1
    new-instance v10, Lm2/r;

    .line 2
    .line 3
    move-object v0, v10

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move-object/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, Lm2/r;-><init>(Landroid/content/Context;Lg2/e;Ln2/d;Lm2/x;Ljava/util/concurrent/Executor;Lo2/b;Lp2/a;Lp2/a;Ln2/c;)V

    .line 18
    .line 19
    .line 20
    return-object v10
.end method


# virtual methods
.method public b()Lm2/r;
    .locals 10

    .line 1
    iget-object v0, p0, Lm2/s;->a:LU5/a;

    .line 2
    .line 3
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Landroid/content/Context;

    .line 9
    .line 10
    iget-object v0, p0, Lm2/s;->b:LU5/a;

    .line 11
    .line 12
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Lg2/e;

    .line 18
    .line 19
    iget-object v0, p0, Lm2/s;->c:LU5/a;

    .line 20
    .line 21
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v3, v0

    .line 26
    check-cast v3, Ln2/d;

    .line 27
    .line 28
    iget-object v0, p0, Lm2/s;->d:LU5/a;

    .line 29
    .line 30
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Lm2/x;

    .line 36
    .line 37
    iget-object v0, p0, Lm2/s;->e:LU5/a;

    .line 38
    .line 39
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    iget-object v0, p0, Lm2/s;->f:LU5/a;

    .line 47
    .line 48
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Lo2/b;

    .line 54
    .line 55
    iget-object v0, p0, Lm2/s;->g:LU5/a;

    .line 56
    .line 57
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v7, v0

    .line 62
    check-cast v7, Lp2/a;

    .line 63
    .line 64
    iget-object v0, p0, Lm2/s;->h:LU5/a;

    .line 65
    .line 66
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v8, v0

    .line 71
    check-cast v8, Lp2/a;

    .line 72
    .line 73
    iget-object v0, p0, Lm2/s;->i:LU5/a;

    .line 74
    .line 75
    invoke-interface {v0}, LU5/a;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    move-object v9, v0

    .line 80
    check-cast v9, Ln2/c;

    .line 81
    .line 82
    invoke-static/range {v1 .. v9}, Lm2/s;->c(Landroid/content/Context;Lg2/e;Ln2/d;Lm2/x;Ljava/util/concurrent/Executor;Lo2/b;Lp2/a;Lp2/a;Ln2/c;)Lm2/r;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm2/s;->b()Lm2/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
