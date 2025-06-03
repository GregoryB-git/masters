.class public Lc1/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final o:J

.field public final p:[B


# direct methods
.method public constructor <init>(J[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc1/o$b;->o:J

    iput-object p3, p0, Lc1/o$b;->p:[B

    return-void
.end method

.method public synthetic constructor <init>(J[BLc1/o$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lc1/o$b;-><init>(J[B)V

    return-void
.end method

.method public static synthetic c(Lc1/o$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lc1/o$b;->o:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic e(Lc1/o$b;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Lc1/o$b;->p:[B

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lc1/o$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lc1/o$b;->h(Lc1/o$b;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(Lc1/o$b;)I
    .locals 4

    .line 1
    iget-wide v0, p0, Lc1/o$b;->o:J

    .line 2
    .line 3
    iget-wide v2, p1, Lc1/o$b;->o:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
