.class public abstract LB6/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LB6/d;[B)LB6/f;
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v1, v0}, LB6/f;->b(LB6/d;[BII)LB6/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static b(LB6/d;[BII)LB6/f;
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    int-to-long v1, v0

    .line 5
    int-to-long v3, p2

    .line 6
    int-to-long v5, p3

    .line 7
    invoke-static/range {v1 .. v6}, LC6/a;->b(JJJ)V

    .line 8
    .line 9
    .line 10
    new-instance v0, LB6/f$a;

    .line 11
    .line 12
    invoke-direct {v0, p0, p3, p1, p2}, LB6/f$a;-><init>(LB6/d;I[BI)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string p1, "content == null"

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
.end method
