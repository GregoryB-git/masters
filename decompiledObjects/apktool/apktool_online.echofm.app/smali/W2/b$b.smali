.class public final enum LW2/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation


# static fields
.field public static final enum o:LW2/b$b;

.field public static final enum p:LW2/b$b;

.field public static final enum q:LW2/b$b;

.field public static final enum r:LW2/b$b;

.field public static final synthetic s:[LW2/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LW2/b$b;

    .line 2
    .line 3
    const-string v1, "READY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LW2/b$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LW2/b$b;->o:LW2/b$b;

    .line 10
    .line 11
    new-instance v0, LW2/b$b;

    .line 12
    .line 13
    const-string v1, "NOT_READY"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LW2/b$b;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LW2/b$b;->p:LW2/b$b;

    .line 20
    .line 21
    new-instance v0, LW2/b$b;

    .line 22
    .line 23
    const-string v1, "DONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LW2/b$b;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LW2/b$b;->q:LW2/b$b;

    .line 30
    .line 31
    new-instance v0, LW2/b$b;

    .line 32
    .line 33
    const-string v1, "FAILED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LW2/b$b;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LW2/b$b;->r:LW2/b$b;

    .line 40
    .line 41
    invoke-static {}, LW2/b$b;->c()[LW2/b$b;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LW2/b$b;->s:[LW2/b$b;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c()[LW2/b$b;
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [LW2/b$b;

    .line 3
    .line 4
    sget-object v1, LW2/b$b;->o:LW2/b$b;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LW2/b$b;->p:LW2/b$b;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LW2/b$b;->q:LW2/b$b;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LW2/b$b;->r:LW2/b$b;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LW2/b$b;
    .locals 1

    .line 1
    const-class v0, LW2/b$b;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LW2/b$b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LW2/b$b;
    .locals 1

    .line 1
    sget-object v0, LW2/b$b;->s:[LW2/b$b;

    .line 2
    .line 3
    invoke-virtual {v0}, [LW2/b$b;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LW2/b$b;

    .line 8
    .line 9
    return-object v0
.end method
