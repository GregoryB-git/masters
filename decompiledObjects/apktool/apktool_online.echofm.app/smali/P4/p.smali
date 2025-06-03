.class public LP4/p;
.super LP4/o;
.source "SourceFile"


# instance fields
.field public final p:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 1
    const-string v0, "Fetch was throttled."

    invoke-direct {p0, v0, p1, p2}, LP4/p;-><init>(Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LP4/o;-><init>(Ljava/lang/String;)V

    iput-wide p2, p0, LP4/p;->p:J

    return-void
.end method
