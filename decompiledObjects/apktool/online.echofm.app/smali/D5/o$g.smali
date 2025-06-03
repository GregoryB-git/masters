.class public final enum LD5/o$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD5/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "g"
.end annotation


# static fields
.field public static final enum p:LD5/o$g;

.field public static final enum q:LD5/o$g;

.field public static final enum r:LD5/o$g;

.field public static final enum s:LD5/o$g;

.field public static final enum t:LD5/o$g;

.field public static final synthetic u:[LD5/o$g;


# instance fields
.field public final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LD5/o$g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "STANDARD"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, LD5/o$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LD5/o$g;->p:LD5/o$g;

    .line 11
    .line 12
    new-instance v0, LD5/o$g;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const-string v2, "HapticFeedbackType.lightImpact"

    .line 16
    .line 17
    const-string v3, "LIGHT_IMPACT"

    .line 18
    .line 19
    invoke-direct {v0, v3, v1, v2}, LD5/o$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, LD5/o$g;->q:LD5/o$g;

    .line 23
    .line 24
    new-instance v0, LD5/o$g;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const-string v2, "HapticFeedbackType.mediumImpact"

    .line 28
    .line 29
    const-string v3, "MEDIUM_IMPACT"

    .line 30
    .line 31
    invoke-direct {v0, v3, v1, v2}, LD5/o$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LD5/o$g;->r:LD5/o$g;

    .line 35
    .line 36
    new-instance v0, LD5/o$g;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    const-string v2, "HapticFeedbackType.heavyImpact"

    .line 40
    .line 41
    const-string v3, "HEAVY_IMPACT"

    .line 42
    .line 43
    invoke-direct {v0, v3, v1, v2}, LD5/o$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LD5/o$g;->s:LD5/o$g;

    .line 47
    .line 48
    new-instance v0, LD5/o$g;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    const-string v2, "HapticFeedbackType.selectionClick"

    .line 52
    .line 53
    const-string v3, "SELECTION_CLICK"

    .line 54
    .line 55
    invoke-direct {v0, v3, v1, v2}, LD5/o$g;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sput-object v0, LD5/o$g;->t:LD5/o$g;

    .line 59
    .line 60
    invoke-static {}, LD5/o$g;->c()[LD5/o$g;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, LD5/o$g;->u:[LD5/o$g;

    .line 65
    .line 66
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LD5/o$g;->o:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c()[LD5/o$g;
    .locals 3

    .line 1
    const/4 v0, 0x5

    .line 2
    new-array v0, v0, [LD5/o$g;

    .line 3
    .line 4
    sget-object v1, LD5/o$g;->p:LD5/o$g;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LD5/o$g;->q:LD5/o$g;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, LD5/o$g;->r:LD5/o$g;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, LD5/o$g;->s:LD5/o$g;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    sget-object v1, LD5/o$g;->t:LD5/o$g;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    aput-object v1, v0, v2

    .line 28
    .line 29
    return-object v0
.end method

.method public static e(Ljava/lang/String;)LD5/o$g;
    .locals 5

    .line 1
    invoke-static {}, LD5/o$g;->values()[LD5/o$g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_3

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget-object v4, v3, LD5/o$g;->o:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    :cond_0
    if-eqz v4, :cond_2

    .line 18
    .line 19
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    :cond_1
    return-object v3

    .line 26
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "No such HapticFeedbackType: "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)LD5/o$g;
    .locals 1

    .line 1
    const-class v0, LD5/o$g;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LD5/o$g;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LD5/o$g;
    .locals 1

    .line 1
    sget-object v0, LD5/o$g;->u:[LD5/o$g;

    .line 2
    .line 3
    invoke-virtual {v0}, [LD5/o$g;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LD5/o$g;

    .line 8
    .line 9
    return-object v0
.end method
