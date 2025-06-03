.class public final enum Lu5/G$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum p:Lu5/G$a;

.field public static final enum q:Lu5/G$a;

.field public static final enum r:Lu5/G$a;

.field public static final enum s:Lu5/G$a;

.field public static final enum t:Lu5/G$a;

.field public static final synthetic u:[Lu5/G$a;


# instance fields
.field public final o:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lu5/G$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    const-string v4, "kKeyboard"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, Lu5/G$a;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lu5/G$a;->p:Lu5/G$a;

    .line 12
    .line 13
    new-instance v0, Lu5/G$a;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-wide/16 v2, 0x1

    .line 17
    .line 18
    const-string v4, "kDirectionalPad"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2, v3}, Lu5/G$a;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lu5/G$a;->q:Lu5/G$a;

    .line 24
    .line 25
    new-instance v0, Lu5/G$a;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-wide/16 v2, 0x2

    .line 29
    .line 30
    const-string v4, "kGamepad"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2, v3}, Lu5/G$a;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lu5/G$a;->r:Lu5/G$a;

    .line 36
    .line 37
    new-instance v0, Lu5/G$a;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-wide/16 v2, 0x3

    .line 41
    .line 42
    const-string v4, "kJoystick"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2, v3}, Lu5/G$a;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lu5/G$a;->s:Lu5/G$a;

    .line 48
    .line 49
    new-instance v0, Lu5/G$a;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-wide/16 v2, 0x4

    .line 53
    .line 54
    const-string v4, "kHdmi"

    .line 55
    .line 56
    invoke-direct {v0, v4, v1, v2, v3}, Lu5/G$a;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lu5/G$a;->t:Lu5/G$a;

    .line 60
    .line 61
    invoke-static {}, Lu5/G$a;->c()[Lu5/G$a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lu5/G$a;->u:[Lu5/G$a;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, Lu5/G$a;->o:J

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c()[Lu5/G$a;
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [Lu5/G$a;

    .line 3
    .line 4
    sget-object v1, Lu5/G$a;->p:Lu5/G$a;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lu5/G$a;->q:Lu5/G$a;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lu5/G$a;->r:Lu5/G$a;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lu5/G$a;->s:Lu5/G$a;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, Lu5/G$a;->t:Lu5/G$a;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu5/G$a;
    .locals 1

    .line 1
    const-class v0, Lu5/G$a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lu5/G$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lu5/G$a;
    .locals 1

    .line 1
    sget-object v0, Lu5/G$a;->u:[Lu5/G$a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lu5/G$a;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lu5/G$a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lu5/G$a;->o:J

    .line 2
    .line 3
    return-wide v0
.end method
