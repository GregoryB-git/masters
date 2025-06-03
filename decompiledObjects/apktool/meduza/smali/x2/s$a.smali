.class public final Lx2/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(ZIIJJIZJJJJ)J
    .locals 8

    move v0, p1

    move v1, p2

    move-wide v2, p3

    const-string v4, "backoffPolicy"

    invoke-static {p2, v4}, La0/j;->p(ILjava/lang/String;)V

    const-wide v4, 0x7fffffffffffffffL

    cmp-long v6, p15, v4

    if-eqz v6, :cond_2

    if-eqz p8, :cond_2

    if-nez p7, :cond_0

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0xdbba0

    add-long/2addr v0, p5

    cmp-long v2, p15, v0

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-wide/from16 v0, p15

    :goto_1
    return-wide v0

    :cond_2
    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz p0, :cond_6

    const/4 v4, 0x2

    if-ne v1, v4, :cond_3

    move v6, v7

    :cond_3
    if-eqz v6, :cond_4

    int-to-long v0, v0

    mul-long/2addr v0, v2

    goto :goto_2

    :cond_4
    long-to-float v1, v2

    sub-int/2addr v0, v7

    invoke-static {v1, v0}, Ljava/lang/Math;->scalb(FI)F

    move-result v0

    float-to-long v0, v0

    :goto_2
    const-wide/32 v2, 0x112a880

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    move-wide v0, v2

    :cond_5
    add-long v4, p5, v0

    goto :goto_4

    :cond_6
    if-eqz p8, :cond_9

    if-nez p7, :cond_7

    add-long v0, p5, p9

    goto :goto_3

    :cond_7
    add-long v0, p5, p13

    :goto_3
    move-wide v4, v0

    cmp-long v0, p11, p13

    if-eqz v0, :cond_8

    move v6, v7

    :cond_8
    if-eqz v6, :cond_b

    if-nez p7, :cond_b

    sub-long v0, p13, p11

    add-long/2addr v4, v0

    goto :goto_4

    :cond_9
    const-wide/16 v0, -0x1

    cmp-long v0, p5, v0

    if-nez v0, :cond_a

    goto :goto_4

    :cond_a
    add-long v4, p5, p9

    :cond_b
    :goto_4
    return-wide v4
.end method
