.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic $assertionsDisabled:Z


# instance fields
.field private height:D

.field private width:D


# direct methods
.method public constructor <init>(DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    iput-wide p3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    return-void
.end method

.method public static fromMap(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "width"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    const-string v1, "height"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;-><init>(DD)V

    return-object v1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;

    iget-wide v2, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    iget-wide v4, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    iget-wide v4, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public getHeight()D
    .locals 2

    iget-wide v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    return-wide v0
.end method

.method public getWidth()D
    .locals 2

    iget-wide v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-wide v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    iget-wide v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    mul-int/lit8 v0, v0, 0x1f

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public setHeight(D)V
    .locals 0

    iput-wide p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    return-void
.end method

.method public setWidth(D)V
    .locals 0

    iput-wide p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    return-void
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "width"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "height"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "Size{width="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->width:D

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", height="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget-wide v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/types/Size2D;->height:D

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x7d

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
