.class public final Lta/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Lta/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLta/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta/f;->a:Ljava/lang/String;

    iput-object p2, p0, Lta/f;->b:Ljava/lang/String;

    iput-wide p3, p0, Lta/f;->c:J

    iput-object p5, p0, Lta/f;->d:Lta/e;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lta/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lta/f;

    iget-object v0, p0, Lta/f;->a:Ljava/lang/String;

    iget-object v2, p1, Lta/f;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lta/f;->b:Ljava/lang/String;

    iget-object v2, p1, Lta/f;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v2, p0, Lta/f;->c:J

    iget-wide v4, p1, Lta/f;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Lta/f;->d:Lta/e;

    iget-object p1, p1, Lta/f;->d:Lta/e;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method
