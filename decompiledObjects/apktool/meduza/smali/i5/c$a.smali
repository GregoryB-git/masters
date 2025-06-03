.class public final Li5/c$a;
.super Lh5/k;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh5/k;",
        "Ljava/lang/Comparable<",
        "Li5/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field public r:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh5/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 9

    .line 1
    check-cast p1, Li5/c$a;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-virtual {p0, v0}, Lz3/a;->m(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1, v0}, Lz3/a;->m(I)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, -0x1

    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lz3/a;->m(I)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p0, Lz3/g;->e:J

    .line 26
    .line 27
    iget-wide v5, p1, Lz3/g;->e:J

    .line 28
    .line 29
    sub-long/2addr v0, v5

    .line 30
    const-wide/16 v5, 0x0

    .line 31
    .line 32
    cmp-long v2, v0, v5

    .line 33
    .line 34
    if-nez v2, :cond_2

    .line 35
    .line 36
    iget-wide v0, p0, Li5/c$a;->r:J

    .line 37
    .line 38
    iget-wide v7, p1, Li5/c$a;->r:J

    .line 39
    .line 40
    sub-long/2addr v0, v7

    .line 41
    cmp-long p1, v0, v5

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    cmp-long p1, v0, v5

    .line 48
    .line 49
    if-lez p1, :cond_0

    .line 50
    .line 51
    :goto_0
    return v3
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
.end method
