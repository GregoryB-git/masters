.class public LY3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/a;


# instance fields
.field public final a:LY3/a;

.field public b:J


# direct methods
.method public constructor <init>(LY3/a;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY3/f;->a:LY3/a;

    .line 5
    .line 6
    iput-wide p2, p0, LY3/f;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-object v0, p0, LY3/f;->a:LY3/a;

    .line 2
    .line 3
    invoke-interface {v0}, LY3/a;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, LY3/f;->b:J

    .line 8
    .line 9
    add-long/2addr v0, v2

    .line 10
    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LY3/f;->b:J

    .line 2
    .line 3
    return-void
.end method
