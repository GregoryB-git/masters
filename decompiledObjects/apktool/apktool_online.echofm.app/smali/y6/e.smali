.class public abstract Ly6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:Lu6/F;

.field public static final c:Lu6/F;

.field public static final d:Lu6/F;

.field public static final e:Lu6/F;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/16 v4, 0xc

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    .line 5
    .line 6
    const/16 v1, 0x64

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static/range {v0 .. v5}, Lu6/G;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sput v0, Ly6/e;->a:I

    .line 15
    .line 16
    new-instance v0, Lu6/F;

    .line 17
    .line 18
    const-string v1, "PERMIT"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lu6/F;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ly6/e;->b:Lu6/F;

    .line 24
    .line 25
    new-instance v0, Lu6/F;

    .line 26
    .line 27
    const-string v1, "TAKEN"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lu6/F;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ly6/e;->c:Lu6/F;

    .line 33
    .line 34
    new-instance v0, Lu6/F;

    .line 35
    .line 36
    const-string v1, "BROKEN"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lu6/F;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Ly6/e;->d:Lu6/F;

    .line 42
    .line 43
    new-instance v0, Lu6/F;

    .line 44
    .line 45
    const-string v1, "CANCELLED"

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lu6/F;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Ly6/e;->e:Lu6/F;

    .line 51
    .line 52
    const/16 v6, 0xc

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    .line 56
    .line 57
    const/16 v3, 0x10

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-static/range {v2 .. v7}, Lu6/G;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    sput v0, Ly6/e;->f:I

    .line 66
    .line 67
    return-void
.end method

.method public static final synthetic a(JLy6/f;)Ly6/f;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly6/e;->h(JLy6/f;)Ly6/f;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic b()Lu6/F;
    .locals 1

    .line 1
    sget-object v0, Ly6/e;->d:Lu6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Lu6/F;
    .locals 1

    .line 1
    sget-object v0, Ly6/e;->e:Lu6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d()I
    .locals 1

    .line 1
    sget v0, Ly6/e;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic e()Lu6/F;
    .locals 1

    .line 1
    sget-object v0, Ly6/e;->b:Lu6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic f()I
    .locals 1

    .line 1
    sget v0, Ly6/e;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic g()Lu6/F;
    .locals 1

    .line 1
    sget-object v0, Ly6/e;->c:Lu6/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final h(JLy6/f;)Ly6/f;
    .locals 2

    .line 1
    new-instance v0, Ly6/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Ly6/f;-><init>(JLy6/f;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
