.class public final enum LR2/p3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LR2/p3;

.field public static final enum q:LR2/p3;

.field public static final synthetic r:[LR2/p3;


# instance fields
.field public final o:[LR2/q3$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LR2/p3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [LR2/q3$a;

    .line 5
    .line 6
    sget-object v3, LR2/q3$a;->p:LR2/q3$a;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v3, v2, v4

    .line 10
    .line 11
    sget-object v3, LR2/q3$a;->q:LR2/q3$a;

    .line 12
    .line 13
    const/4 v5, 0x1

    .line 14
    aput-object v3, v2, v5

    .line 15
    .line 16
    const-string v3, "STORAGE"

    .line 17
    .line 18
    invoke-direct {v0, v3, v4, v2}, LR2/p3;-><init>(Ljava/lang/String;I[LR2/q3$a;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LR2/p3;->p:LR2/p3;

    .line 22
    .line 23
    new-instance v2, LR2/p3;

    .line 24
    .line 25
    new-array v3, v5, [LR2/q3$a;

    .line 26
    .line 27
    sget-object v6, LR2/q3$a;->r:LR2/q3$a;

    .line 28
    .line 29
    aput-object v6, v3, v4

    .line 30
    .line 31
    const-string v6, "DMA"

    .line 32
    .line 33
    invoke-direct {v2, v6, v5, v3}, LR2/p3;-><init>(Ljava/lang/String;I[LR2/q3$a;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, LR2/p3;->q:LR2/p3;

    .line 37
    .line 38
    new-array v1, v1, [LR2/p3;

    .line 39
    .line 40
    aput-object v0, v1, v4

    .line 41
    .line 42
    aput-object v2, v1, v5

    .line 43
    .line 44
    sput-object v1, LR2/p3;->r:[LR2/p3;

    .line 45
    .line 46
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;I[LR2/q3$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LR2/p3;->o:[LR2/q3$a;

    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic e(LR2/p3;)[LR2/q3$a;
    .locals 0

    .line 1
    iget-object p0, p0, LR2/p3;->o:[LR2/q3$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static values()[LR2/p3;
    .locals 1

    .line 1
    sget-object v0, LR2/p3;->r:[LR2/p3;

    .line 2
    .line 3
    invoke-virtual {v0}, [LR2/p3;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LR2/p3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final c()[LR2/q3$a;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/p3;->o:[LR2/q3$a;

    .line 2
    .line 3
    return-object v0
.end method
