.class public final Landroidx/media3/exoplayer/dash/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/media3/exoplayer/dash/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Li0/g$a;

.field public final b:I

.field public final c:Ly0/f$a;


# direct methods
.method public constructor <init>(Li0/g$a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/c$a;-><init>(Li0/g$a;I)V

    return-void
.end method

.method public constructor <init>(Li0/g$a;I)V
    .locals 1

    .line 2
    sget-object v0, Ly0/d;->x:Ly0/d$b;

    invoke-direct {p0, v0, p1, p2}, Landroidx/media3/exoplayer/dash/c$a;-><init>(Ly0/f$a;Li0/g$a;I)V

    return-void
.end method

.method public constructor <init>(Ly0/f$a;Li0/g$a;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/c$a;->c:Ly0/f$a;

    iput-object p2, p0, Landroidx/media3/exoplayer/dash/c$a;->a:Li0/g$a;

    iput p3, p0, Landroidx/media3/exoplayer/dash/c$a;->b:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Z)Landroidx/media3/exoplayer/dash/a$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/dash/c$a;->d(Z)Landroidx/media3/exoplayer/dash/c$a;

    move-result-object p1

    return-object p1
.end method

.method public b(Ld0/q;)Ld0/q;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$a;->c:Ly0/f$a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ly0/f$a;->b(Ld0/q;)Ld0/q;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(LB0/o;Lo0/c;Ln0/b;I[ILA0/y;IJZLjava/util/List;Landroidx/media3/exoplayer/dash/d$c;Li0/y;Ll0/y1;LB0/f;)Landroidx/media3/exoplayer/dash/a;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/c$a;->a:Li0/g$a;

    .line 6
    .line 7
    invoke-interface {v2}, Li0/g$a;->a()Li0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v12

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v12, v1}, Li0/g;->c(Li0/y;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v1, Landroidx/media3/exoplayer/dash/c;

    .line 17
    .line 18
    move-object v3, v1

    .line 19
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/c$a;->c:Ly0/f$a;

    .line 20
    .line 21
    iget v15, v0, Landroidx/media3/exoplayer/dash/c$a;->b:I

    .line 22
    .line 23
    move-object/from16 v5, p1

    .line 24
    .line 25
    move-object/from16 v6, p2

    .line 26
    .line 27
    move-object/from16 v7, p3

    .line 28
    .line 29
    move/from16 v8, p4

    .line 30
    .line 31
    move-object/from16 v9, p5

    .line 32
    .line 33
    move-object/from16 v10, p6

    .line 34
    .line 35
    move/from16 v11, p7

    .line 36
    .line 37
    move-wide/from16 v13, p8

    .line 38
    .line 39
    move/from16 v16, p10

    .line 40
    .line 41
    move-object/from16 v17, p11

    .line 42
    .line 43
    move-object/from16 v18, p12

    .line 44
    .line 45
    move-object/from16 v19, p14

    .line 46
    .line 47
    move-object/from16 v20, p15

    .line 48
    .line 49
    invoke-direct/range {v3 .. v20}, Landroidx/media3/exoplayer/dash/c;-><init>(Ly0/f$a;LB0/o;Lo0/c;Ln0/b;I[ILA0/y;ILi0/g;JIZLjava/util/List;Landroidx/media3/exoplayer/dash/d$c;Ll0/y1;LB0/f;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public d(Z)Landroidx/media3/exoplayer/dash/c$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/c$a;->c:Ly0/f$a;

    invoke-interface {v0, p1}, Ly0/f$a;->a(Z)Ly0/f$a;

    return-object p0
.end method
