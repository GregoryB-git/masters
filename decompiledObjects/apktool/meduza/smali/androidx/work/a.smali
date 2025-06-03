.class public final Landroidx/work/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/a$a;,
        Landroidx/work/a$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Lp2/m0;

.field public final d:Lo2/r;

.field public final e:Lo2/k;

.field public final f:Lp2/c;

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Landroidx/work/a$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lb/a0;->f(Z)Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Landroidx/work/a;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-static {p1}, Lb/a0;->f(Z)Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Landroidx/work/a;->b:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    new-instance p1, Lp2/m0;

    .line 19
    .line 20
    invoke-direct {p1}, Lp2/m0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Landroidx/work/a;->c:Lp2/m0;

    .line 24
    .line 25
    sget-object p1, Lo2/s;->a:Ljava/lang/String;

    .line 26
    .line 27
    new-instance p1, Lo2/r;

    .line 28
    .line 29
    invoke-direct {p1}, Lo2/r;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/work/a;->d:Lo2/r;

    .line 33
    .line 34
    sget-object p1, Lo2/k;->b:Lo2/k;

    .line 35
    .line 36
    iput-object p1, p0, Landroidx/work/a;->e:Lo2/k;

    .line 37
    .line 38
    new-instance p1, Lp2/c;

    .line 39
    .line 40
    invoke-direct {p1}, Lp2/c;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Landroidx/work/a;->f:Lp2/c;

    .line 44
    .line 45
    const/4 p1, 0x4

    .line 46
    iput p1, p0, Landroidx/work/a;->g:I

    .line 47
    .line 48
    const p1, 0x7fffffff

    .line 49
    .line 50
    .line 51
    iput p1, p0, Landroidx/work/a;->h:I

    .line 52
    .line 53
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v0, 0x17

    .line 56
    .line 57
    if-ne p1, v0, :cond_0

    .line 58
    .line 59
    const/16 p1, 0xa

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/16 p1, 0x14

    .line 63
    .line 64
    :goto_0
    iput p1, p0, Landroidx/work/a;->j:I

    .line 65
    .line 66
    const/16 p1, 0x8

    .line 67
    .line 68
    iput p1, p0, Landroidx/work/a;->i:I

    .line 69
    .line 70
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
