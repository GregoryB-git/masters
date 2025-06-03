.class public final Lm4/u;
.super Lc4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/u$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lv5/c0;JJ)V
    .locals 14

    new-instance v1, Lc4/a$b;

    invoke-direct {v1}, Lc4/a$b;-><init>()V

    new-instance v2, Lm4/u$a;

    move-object v0, p1

    invoke-direct {v2, p1}, Lm4/u$a;-><init>(Lv5/c0;)V

    const-wide/16 v3, 0x1

    add-long v5, p2, v3

    const-wide/16 v7, 0x0

    const-wide/16 v11, 0xbc

    const/16 v13, 0x3e8

    move-object v0, p0

    move-wide/from16 v3, p2

    move-wide/from16 v9, p4

    invoke-direct/range {v0 .. v13}, Lc4/a;-><init>(Lc4/a$d;Lc4/a$f;JJJJJI)V

    return-void
.end method

.method public static d([BI)I
    .locals 2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    add-int/lit8 v1, p1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    add-int/lit8 v1, p1, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x3

    aget-byte p0, p0, p1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    return p0
.end method
