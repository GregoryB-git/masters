.class public final Lgb/v2$a;
.super Ljava/io/InputStream;
.source "SourceFile"

# interfaces
.implements Leb/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lgb/u2;


# direct methods
.method public constructor <init>(Lgb/u2;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lgb/v2$a;->a:Lgb/u2;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->close()V

    return-void
.end method

.method public final mark(I)V
    .locals 0

    iget-object p1, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {p1}, Lgb/u2;->Z()V

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->markSupported()Z

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->readUnsignedByte()I

    move-result v0

    return v0
.end method

.method public final read([BII)I
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0, p1, p2, p3}, Lgb/u2;->U([BII)V

    return p3
.end method

.method public final reset()V
    .locals 1

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->reset()V

    return-void
.end method

.method public final skip(J)J
    .locals 2

    iget-object v0, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {v0}, Lgb/u2;->b()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    long-to-int p1, p1

    iget-object p2, p0, Lgb/v2$a;->a:Lgb/u2;

    invoke-interface {p2, p1}, Lgb/u2;->skipBytes(I)V

    int-to-long p1, p1

    return-wide p1
.end method
