.class public final Lgb/j2$a;
.super Ljava/io/OutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/j2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Lgb/s3;

.field public final synthetic c:Lgb/j2;


# direct methods
.method public constructor <init>(Lgb/j2;)V
    .locals 0

    iput-object p1, p0, Lgb/j2$a;->c:Lgb/j2;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lgb/j2$a;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final write(I)V
    .locals 3

    iget-object v0, p0, Lgb/j2$a;->b:Lgb/s3;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lgb/s3;->a()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lgb/j2$a;->b:Lgb/s3;

    int-to-byte p1, p1

    invoke-interface {v0, p1}, Lgb/s3;->c(B)V

    return-void

    :cond_0
    const/4 v0, 0x1

    new-array v1, v0, [B

    int-to-byte p1, p1

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    invoke-virtual {p0, v1, v2, v0}, Lgb/j2$a;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 3

    iget-object v0, p0, Lgb/j2$a;->b:Lgb/s3;

    if-nez v0, :cond_0

    iget-object v0, p0, Lgb/j2$a;->c:Lgb/j2;

    .line 1
    iget-object v0, v0, Lgb/j2;->g:Lgb/t3;

    .line 2
    invoke-interface {v0, p3}, Lgb/t3;->a(I)Lhb/o;

    move-result-object v0

    move-object v1, v0

    move-object v0, p0

    goto :goto_1

    :cond_0
    move-object v0, p0

    :goto_0
    if-lez p3, :cond_2

    iget-object v1, v0, Lgb/j2$a;->b:Lgb/s3;

    invoke-interface {v1}, Lgb/s3;->a()I

    move-result v1

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lgb/j2$a;->b:Lgb/s3;

    invoke-interface {v1}, Lgb/s3;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Lgb/j2$a;->c:Lgb/j2;

    .line 3
    iget-object v2, v2, Lgb/j2;->g:Lgb/t3;

    .line 4
    invoke-interface {v2, v1}, Lgb/t3;->a(I)Lhb/o;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lgb/j2$a;->b:Lgb/s3;

    iget-object v2, v0, Lgb/j2$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lgb/j2$a;->b:Lgb/s3;

    invoke-interface {v2, p1, p2, v1}, Lgb/s3;->write([BII)V

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    :cond_2
    return-void
.end method
