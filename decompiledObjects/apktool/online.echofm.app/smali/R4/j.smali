.class public final enum LR4/j;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# static fields
.field public static final enum p:LR4/j;

.field public static final enum q:LR4/j;

.field public static final synthetic r:[LR4/j;


# instance fields
.field public final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LR4/j;

    .line 2
    .line 3
    const-string v1, "EVENT_TYPE_UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LR4/j;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LR4/j;->p:LR4/j;

    .line 10
    .line 11
    new-instance v0, LR4/j;

    .line 12
    .line 13
    const-string v1, "SESSION_START"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, LR4/j;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LR4/j;->q:LR4/j;

    .line 20
    .line 21
    invoke-static {}, LR4/j;->c()[LR4/j;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LR4/j;->r:[LR4/j;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LR4/j;->o:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic c()[LR4/j;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LR4/j;

    .line 3
    .line 4
    sget-object v1, LR4/j;->p:LR4/j;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LR4/j;->q:LR4/j;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LR4/j;
    .locals 1

    .line 1
    const-class v0, LR4/j;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LR4/j;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LR4/j;
    .locals 1

    .line 1
    sget-object v0, LR4/j;->r:[LR4/j;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LR4/j;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public g()I
    .locals 1

    .line 1
    iget v0, p0, LR4/j;->o:I

    .line 2
    .line 3
    return v0
.end method
