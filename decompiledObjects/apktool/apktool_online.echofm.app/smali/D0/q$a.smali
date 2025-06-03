.class public LD0/q$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, LD0/q$a;->a:J

    .line 10
    .line 11
    iput-wide v0, p0, LD0/q$a;->b:J

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic a(LD0/q$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LD0/q$a;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LD0/q$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LD0/q$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic c(LD0/q$a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, LD0/q$a;->a:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic d(LD0/q$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LD0/q$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic e(LD0/q$a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, LD0/q$a;->b:J

    .line 2
    .line 3
    return-wide p1
.end method


# virtual methods
.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LD0/q$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public g()J
    .locals 2

    .line 1
    iget-wide v0, p0, LD0/q$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final h()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, LD0/q$a;->a:J

    .line 7
    .line 8
    iput-wide v0, p0, LD0/q$a;->b:J

    .line 9
    .line 10
    return-void
.end method
