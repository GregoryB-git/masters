.class public final enum LH3/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum p:LH3/z;

.field public static final enum q:LH3/z;

.field public static final enum r:LH3/z;

.field public static final enum s:LH3/z;

.field public static final synthetic t:[LH3/z;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, LH3/z;

    .line 2
    .line 3
    const-string v1, "DEVELOPER"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, LH3/z;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LH3/z;->p:LH3/z;

    .line 11
    .line 12
    new-instance v1, LH3/z;

    .line 13
    .line 14
    const-string v4, "USER_SIDELOAD"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, LH3/z;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, LH3/z;->q:LH3/z;

    .line 21
    .line 22
    new-instance v4, LH3/z;

    .line 23
    .line 24
    const-string v6, "TEST_DISTRIBUTION"

    .line 25
    .line 26
    const/4 v7, 0x3

    .line 27
    invoke-direct {v4, v6, v5, v7}, LH3/z;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v4, LH3/z;->r:LH3/z;

    .line 31
    .line 32
    new-instance v6, LH3/z;

    .line 33
    .line 34
    const-string v8, "APP_STORE"

    .line 35
    .line 36
    const/4 v9, 0x4

    .line 37
    invoke-direct {v6, v8, v7, v9}, LH3/z;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v6, LH3/z;->s:LH3/z;

    .line 41
    .line 42
    new-array v8, v9, [LH3/z;

    .line 43
    .line 44
    aput-object v0, v8, v2

    .line 45
    .line 46
    aput-object v1, v8, v3

    .line 47
    .line 48
    aput-object v4, v8, v5

    .line 49
    .line 50
    aput-object v6, v8, v7

    .line 51
    .line 52
    sput-object v8, LH3/z;->t:[LH3/z;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LH3/z;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static c(Ljava/lang/String;)LH3/z;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, LH3/z;->s:LH3/z;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p0, LH3/z;->p:LH3/z;

    .line 7
    .line 8
    :goto_0
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)LH3/z;
    .locals 1

    .line 1
    const-class v0, LH3/z;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LH3/z;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LH3/z;
    .locals 1

    .line 1
    sget-object v0, LH3/z;->t:[LH3/z;

    .line 2
    .line 3
    invoke-virtual {v0}, [LH3/z;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LH3/z;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public e()I
    .locals 1

    .line 1
    iget v0, p0, LH3/z;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, LH3/z;->o:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
