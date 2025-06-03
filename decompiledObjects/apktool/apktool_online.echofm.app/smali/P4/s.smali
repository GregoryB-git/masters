.class public LP4/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP4/s$b;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(LP4/s$b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LP4/s$b;->a(LP4/s$b;)J

    move-result-wide v0

    iput-wide v0, p0, LP4/s;->a:J

    invoke-static {p1}, LP4/s$b;->b(LP4/s$b;)J

    move-result-wide v0

    iput-wide v0, p0, LP4/s;->b:J

    return-void
.end method

.method public synthetic constructor <init>(LP4/s$b;LP4/s$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LP4/s;-><init>(LP4/s$b;)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-wide v0, p0, LP4/s;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, LP4/s;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
